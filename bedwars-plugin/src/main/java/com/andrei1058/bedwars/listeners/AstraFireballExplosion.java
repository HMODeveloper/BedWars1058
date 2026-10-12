package com.andrei1058.bedwars.listeners;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import com.andrei1058.bedwars.api.util.AstraFireballEngine;
import com.andrei1058.bedwars.api.util.AstraFireballEngine.*;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.LastHit;
import com.andrei1058.bedwars.arena.team.BedWarsTeam;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/** 在主线程上先计算所有结果，再统一提交方块和玩家效果。 */
public final class AstraFireballExplosion {
    private AstraFireballExplosion() {}

    public static void explode(Fireball fireball, Player owner, IArena arena, Location center) {
        World world = center.getWorld();
        Vec3 origin = new Vec3(center.getX(), center.getY(), center.getZ());
        List<PlayerState> states = new ArrayList<>();
        Map<UUID, Player> players = new HashMap<>();
        long now = System.currentTimeMillis();
        for (Player player : arena.getPlayers()) {
            if (!player.getWorld().equals(world) || !eligible(arena, player)) continue;
            Box box = BedWars.nms.getPlayerBoundingBox(player);
            if (box.distanceTo(origin) >= AstraFireballEngine.KNOCKBACK_RADIUS) continue;
            Vector velocity = player.getVelocity();
            ITeam team = arena.getTeam(player);
            states.add(new PlayerState(player.getUniqueId(), team == null ? null : team.getName(), box,
                    new Vec3(velocity.getX(), velocity.getY(), velocity.getZ()), player.getHealth(),
                    player.isOnGround(), false, spawnProtected(player, now)));
            players.put(player.getUniqueId(), player);
        }
        ITeam ownerTeam = Arena.getArenaByPlayer(owner) == arena ? arena.getTeam(owner) : null;
        Explosion explosion = new Explosion(origin, owner.getUniqueId(), ownerTeam == null ? null : ownerTeam.getName());
        ExplosionResult result = AstraFireballEngine.calculate(explosion, new ArenaWorldView(arena, world, origin, states), states);

        List<Block> blocks = new ArrayList<>();
        for (BlockPos pos : result.destroyedBlocks) blocks.add(world.getBlockAt(pos.x, pos.y, pos.z));
        Set<Block> calculatedBlocks = new HashSet<>(blocks);
        EntityExplodeEvent event = new EntityExplodeEvent(fireball, center, blocks, 0);
        Bukkit.getPluginManager().callEvent(event);
        if (!event.isCancelled() && arena.getStatus() == GameState.playing) {
            // 外部插件只能删减候选列表，不能追加超出计算范围的破坏。
            for (Block block : event.blockList()) {
                if (!calculatedBlocks.remove(block)) continue;
                arena.removePlacedBlock(block);
                block.setType(Material.AIR, false);
            }
            for (PlayerEffect effect : result.playerEffects) {
                Player player = players.get(effect.playerId);
                if (!eligible(arena, player) || !player.getWorld().equals(world) || spawnProtected(player, System.currentTimeMillis())) continue;
                if (!player.getUniqueId().equals(owner.getUniqueId())) {
                    LastHit hit = LastHit.getLastHit(player);
                    if (hit == null) new LastHit(player, owner, now);
                    else { hit.setDamager(owner); hit.setTime(now); }
                }
                if (effect.rawDamage > 0) BedWars.nms.applyFireballExplosionDamage(player, owner, effect.rawDamage);
                // 致死回调可能已恢复生命并开始重生，不能只检查 health。
                if (eligible(arena, player) && player.getWorld().equals(world)) {
                    player.setVelocity(new Vector(effect.newVelocity.x, effect.newVelocity.y, effect.newVelocity.z));
                }
            }
        }
        world.playSound(center, Sound.EXPLODE, 4.0f, 1.0f);
        world.playEffect(center, Effect.EXPLOSION_HUGE, 0);
    }

    private static boolean eligible(IArena arena, Player player) {
        return player != null && player.isOnline() && !player.isDead() && player.getHealth() > 0
                && Arena.getArenaByPlayer(player) == arena && arena.getStatus() == GameState.playing
                && arena.isPlayer(player) && !arena.isSpectator(player) && !arena.isReSpawning(player);
    }

    private static boolean spawnProtected(Player player, long now) {
        Long until = BedWarsTeam.reSpawnInvulnerability.get(player.getUniqueId());
        return until != null && until > now;
    }

    /** 局部稠密缓存避免 DDA 每次访问都创建坐标键或读取 Bukkit 方块。 */
    private static final class ArenaWorldView implements WorldView {
        private final IArena arena;
        private final World world;
        private final int minX, minY, minZ, sizeX, sizeY, sizeZ;
        private final BlockInfo[] cache;
        private final Location location;

        ArenaWorldView(IArena arena, World world, Vec3 center, List<PlayerState> players) {
            this.arena = arena; this.world = world;
            double lowX = center.x - AstraFireballEngine.BLOCK_RADIUS, lowY = center.y - AstraFireballEngine.BLOCK_RADIUS;
            double lowZ = center.z - AstraFireballEngine.BLOCK_RADIUS;
            double highX = center.x + AstraFireballEngine.BLOCK_RADIUS, highY = center.y + AstraFireballEngine.BLOCK_RADIUS;
            double highZ = center.z + AstraFireballEngine.BLOCK_RADIUS;
            for (PlayerState player : players) {
                lowX = Math.min(lowX, player.box.minX); lowY = Math.min(lowY, player.box.minY); lowZ = Math.min(lowZ, player.box.minZ);
                highX = Math.max(highX, player.box.maxX); highY = Math.max(highY, player.box.maxY); highZ = Math.max(highZ, player.box.maxZ);
            }
            minX = (int) Math.floor(lowX); minY = (int) Math.floor(lowY); minZ = (int) Math.floor(lowZ);
            sizeX = (int) Math.floor(highX) - minX + 1;
            sizeY = (int) Math.floor(highY) - minY + 1;
            sizeZ = (int) Math.floor(highZ) - minZ + 1;
            cache = new BlockInfo[sizeX * sizeY * sizeZ];
            location = new Location(world, 0, 0, 0);
        }

        @Override
        public BlockInfo blockAt(int x, int y, int z) {
            int localX = x - minX, localY = y - minY, localZ = z - minZ;
            if (localX < 0 || localX >= sizeX || localY < 0 || localY >= sizeY || localZ < 0 || localZ >= sizeZ) return BlockInfo.PROTECTED;
            int index = (localX * sizeY + localY) * sizeZ + localZ;
            BlockInfo info = cache[index];
            if (info == null) cache[index] = info = readBlock(x, y, z);
            return info;
        }

        private BlockInfo readBlock(int x, int y, int z) {
            if (y < 0 || y >= world.getMaxHeight() || !world.isChunkLoaded(x >> 4, z >> 4)) return BlockInfo.PROTECTED;
            Block block = world.getBlockAt(x, y, z);
            Material material = block.getType();
            if (material == Material.AIR) return BlockInfo.AIR;
            location.setX(x); location.setY(y); location.setZ(z);
            if (arena.isProtected(location) || arena.isTeamBed(location)
                    || (!arena.isBlockPlaced(block) && !arena.isAllowMapBreak())) return BlockInfo.PROTECTED;
            switch (material) {
                case WOOL: return BlockInfo.WOOL;
                case WOOD: return BlockInfo.WOOD;
                case GLASS: return BlockInfo.GLASS;
                default: return BlockInfo.PROTECTED;
            }
        }
    }
}

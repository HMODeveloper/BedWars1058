package com.andrei1058.bedwars.support.version.v1_8_R3;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.events.server.ArenaDisableEvent;
import com.andrei1058.bedwars.api.events.server.ArenaEnableEvent;
import com.andrei1058.bedwars.api.events.server.ArenaRestartEvent;
import net.minecraft.server.v1_8_R3.BlockPosition;
import net.minecraft.server.v1_8_R3.ChunkSection;
import net.minecraft.server.v1_8_R3.EnumDirection;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_8_R3.CraftChunk;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;

import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** 在原版吸水前保护地图水，不接管海绵的干湿转换和方块更新。 */
final class SpongeProtection implements Listener {
    private static final EnumDirection[] DIRECTIONS = EnumDirection.values();
    private final BedWars api;
    private final Map<String, Map<Long, BitSet>> originalWater = new HashMap<>();

    SpongeProtection(BedWars api) {
        this.api = api;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onArenaEnable(ArenaEnableEvent event) {
        Map<Long, BitSet> chunks = new HashMap<>();
        originalWater.put(event.getArena().getWorld().getName(), chunks);
        for (Chunk chunk : event.getArena().getWorld().getLoadedChunks()) {
            capture(chunk, chunks);
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChunkLoad(ChunkLoadEvent event) {
        Map<Long, BitSet> chunks = originalWater.get(event.getWorld().getName());
        if (chunks != null) capture(event.getChunk(), chunks);
    }

    @EventHandler
    public void onArenaDisable(ArenaDisableEvent event) {
        originalWater.remove(event.getWorldName());
    }

    @EventHandler
    public void onArenaRestart(ArenaRestartEvent event) {
        originalWater.remove(event.getWorldName());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onWorldUnload(WorldUnloadEvent event) {
        originalWater.remove(event.getWorld().getName());
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlace(BlockPlaceEvent event) {
        if (wouldAbsorbMapWater(event.getBlockPlaced())) event.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPhysics(BlockPhysicsEvent event) {
        if (wouldAbsorbMapWater(event.getBlock())) event.setCancelled(true);
    }

    private void capture(Chunk chunk, Map<Long, BitSet> chunks) {
        long key = chunkKey(chunk.getX(), chunk.getZ());
        if (chunks.containsKey(key)) return;
        BitSet water = new BitSet();
        for (ChunkSection section : ((CraftChunk) chunk).getHandle().getSections()) {
            if (section == null || section.a()) continue;
            for (int y = 0; y < 16; y++) {
                for (int z = 0; z < 16; z++) {
                    for (int x = 0; x < 16; x++) {
                        if (section.getType(x, y, z).getBlock().getMaterial()
                                == net.minecraft.server.v1_8_R3.Material.WATER) {
                            water.set(((section.getYPosition() + y) << 8) | (z << 4) | x);
                        }
                    }
                }
            }
        }
        // 空区块也记录，避免卸载重载后把玩家的水当作地图水。
        chunks.put(key, water);
    }

    private boolean wouldAbsorbMapWater(Block sponge) {
        if (sponge.getType() != Material.SPONGE || (sponge.getData() & 1) != 0) return false;
        IArena arena = api.getArenaUtil().getArenaByIdentifier(sponge.getWorld().getName());
        if (arena == null || arena.isAllowMapBreak()) return false;
        Map<Long, BitSet> chunks = originalWater.get(sponge.getWorld().getName());
        if (chunks == null) return false;

        net.minecraft.server.v1_8_R3.World world = ((CraftWorld) sponge.getWorld()).getHandle();
        // 与 1.8 BlockSponge 相同的方向顺序、深度和每轮吸水数量限制。
        BlockPosition[] queue = new BlockPosition[71];
        int[] depths = new int[71];
        Set<BlockPosition> visited = new HashSet<>();
        queue[0] = new BlockPosition(sponge.getX(), sponge.getY(), sponge.getZ());
        visited.add(queue[0]);
        int head = 0, tail = 1, absorbed = 0;
        while (head < tail) {
            BlockPosition position = queue[head];
            int depth = depths[head++];
            for (EnumDirection direction : DIRECTIONS) {
                BlockPosition next = position.shift(direction);
                if (visited.contains(next) || world.getType(next).getBlock().getMaterial()
                        != net.minecraft.server.v1_8_R3.Material.WATER) continue;
                visited.add(next);
                BitSet water = chunks.get(chunkKey(next.getX() >> 4, next.getZ() >> 4));
                if (water != null && water.get((next.getY() << 8)
                        | ((next.getZ() & 15) << 4) | (next.getX() & 15))) return true;
                absorbed++;
                if (depth < 6) {
                    queue[tail] = next;
                    depths[tail++] = depth + 1;
                }
            }
            if (absorbed > 64) break;
        }
        return false;
    }

    private static long chunkKey(int x, int z) {
        return ((long) x << 32) | (z & 0xffffffffL);
    }
}

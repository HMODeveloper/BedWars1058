package com.andrei1058.bedwars.api.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/** 确定性爆炸计算；世界和玩家只在调用方统一提交时修改。 */
public final class AstraFireballEngine {
    public static final double BLOCK_RADIUS = 2.8;
    private static final double BLOCK_POWER = 3.6;
    private static final double DISTANCE_LOSS = 0.8;
    private static final double DAMAGE_RADIUS = 4.0;
    public static final double KNOCKBACK_RADIUS = 5.0;
    private static final double EPS = 1e-9;
    private static final double[] SAMPLE_FACTORS = {0.1, 0.5, 0.9};

    private AstraFireballEngine() {}

    public static final class Vec3 {
        public final double x, y, z;
        public Vec3(double x, double y, double z) { this.x = x; this.y = y; this.z = z; }
    }

    public static final class BlockPos {
        public final int x, y, z;
        public BlockPos(int x, int y, int z) { this.x = x; this.y = y; this.z = z; }
    }

    public static final class Box {
        public final double minX, minY, minZ, maxX, maxY, maxZ;
        public Box(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
            this.minX = minX; this.minY = minY; this.minZ = minZ;
            this.maxX = maxX; this.maxY = maxY; this.maxZ = maxZ;
        }
        public double distanceTo(Vec3 point) {
            double x = StrictMath.max(0, StrictMath.max(minX - point.x, point.x - maxX));
            double y = StrictMath.max(0, StrictMath.max(minY - point.y, point.y - maxY));
            double z = StrictMath.max(0, StrictMath.max(minZ - point.z, point.z - maxZ));
            return length(x, y, z);
        }
    }

    public static final class BlockInfo {
        public static final BlockInfo AIR = new BlockInfo(false, 0, 0, false);
        public static final BlockInfo WOOL = new BlockInfo(true, 0.9, 0.7, true);
        public static final BlockInfo WOOD = new BlockInfo(true, 1.6, 1.2, true);
        public static final BlockInfo GLASS = new BlockInfo(true, 0.4, 0.2, true);
        public static final BlockInfo PROTECTED = new BlockInfo(false, Double.POSITIVE_INFINITY,
                Double.POSITIVE_INFINITY, true);
        public final boolean destructible, blocksShock;
        public final double breakCost, lossPerBlock;
        public BlockInfo(boolean destructible, double breakCost, double lossPerBlock, boolean blocksShock) {
            this.destructible = destructible; this.breakCost = breakCost;
            this.lossPerBlock = lossPerBlock; this.blocksShock = blocksShock;
        }
    }

    public interface WorldView {
        BlockInfo blockAt(int x, int y, int z);
    }

    public static final class PlayerState {
        public final UUID id;
        public final String team;
        public final Box box;
        public final Vec3 velocity;
        public final double health;
        public final boolean onGround, spectator, spawnProtected;
        public PlayerState(UUID id, String team, Box box, Vec3 velocity, double health,
                           boolean onGround, boolean spectator, boolean spawnProtected) {
            this.id = id; this.team = team; this.box = box; this.velocity = velocity;
            this.health = health; this.onGround = onGround; this.spectator = spectator;
            this.spawnProtected = spawnProtected;
        }
    }

    public static final class Explosion {
        public final Vec3 center;
        public final UUID owner;
        public final String ownerTeam;
        public Explosion(Vec3 center, UUID owner, String ownerTeam) {
            this.center = center; this.owner = owner; this.ownerTeam = ownerTeam;
        }
    }

    public static final class PlayerEffect {
        public final UUID playerId;
        public final double rawDamage;
        public final Vec3 newVelocity;
        private PlayerEffect(UUID playerId, double rawDamage, Vec3 newVelocity) {
            this.playerId = playerId; this.rawDamage = rawDamage; this.newVelocity = newVelocity;
        }
    }

    public static final class ExplosionResult {
        public final List<BlockPos> destroyedBlocks;
        public final List<PlayerEffect> playerEffects;
        private ExplosionResult(List<BlockPos> destroyedBlocks, List<PlayerEffect> playerEffects) {
            this.destroyedBlocks = Collections.unmodifiableList(destroyedBlocks);
            this.playerEffects = Collections.unmodifiableList(playerEffects);
        }
    }

    public static ExplosionResult calculate(Explosion explosion, WorldView world, List<PlayerState> candidates) {
        List<BlockPos> blocks = calculateBlocks(explosion.center, world);
        List<PlayerState> players = new ArrayList<>(candidates);
        players.sort((first, second) -> first.id.compareTo(second.id));
        List<PlayerEffect> effects = new ArrayList<>();
        for (PlayerState player : players) {
            PlayerEffect effect = calculatePlayer(explosion, world, player);
            if (effect != null) effects.add(effect);
        }
        return new ExplosionResult(blocks, effects);
    }

    private static List<BlockPos> calculateBlocks(Vec3 center, WorldView world) {
        List<BlockPos> blocks = new ArrayList<>();
        int minX = floor(center.x - BLOCK_RADIUS), minY = floor(center.y - BLOCK_RADIUS);
        int minZ = floor(center.z - BLOCK_RADIUS);
        int maxX = floor(center.x + BLOCK_RADIUS), maxY = floor(center.y + BLOCK_RADIUS);
        int maxZ = floor(center.z + BLOCK_RADIUS);
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                for (int z = minZ; z <= maxZ; z++) {
                    double distance = length(x + 0.5 - center.x, y + 0.5 - center.y, z + 0.5 - center.z);
                    if (distance > BLOCK_RADIUS) continue;
                    BlockInfo block = world.blockAt(x, y, z);
                    if (!block.destructible) continue;
                    double loss = trace(world, center, x + 0.5, y + 0.5, z + 0.5, x, y, z, true, false);
                    if (BLOCK_POWER - DISTANCE_LOSS * distance - loss >= block.breakCost) {
                        blocks.add(new BlockPos(x, y, z));
                    }
                }
            }
        }
        return blocks;
    }

    private static PlayerEffect calculatePlayer(Explosion explosion, WorldView world, PlayerState player) {
        if (player.spectator || player.spawnProtected || player.health <= 0) return null;
        boolean self = player.id.equals(explosion.owner);
        if (!self && explosion.ownerTeam != null && explosion.ownerTeam.equals(player.team)) return null;
        double distance = player.box.distanceTo(explosion.center);
        if (distance >= KNOCKBACK_RADIUS) return null;
        double exposure = exposure(world, explosion.center, player.box);
        if (exposure <= 0) return null;
        double damageFactor = StrictMath.max(0, 1 - distance / DAMAGE_RADIUS);
        double damage = self ? 0 : 12 * damageFactor * damageFactor * exposure;
        double radial = StrictMath.pow(StrictMath.max(0, 1 - distance / KNOCKBACK_RADIUS), 1.25);
        double strength = 0.95 * radial * exposure * (self ? 1.15 : 1);
        double x = (player.box.minX + player.box.maxX) * 0.5 - explosion.center.x;
        double y = (player.box.minY + player.box.maxY) * 0.5 - explosion.center.y;
        double z = (player.box.minZ + player.box.maxZ) * 0.5 - explosion.center.z;
        double distanceToCenter = length(x, y, z);
        if (distanceToCenter < EPS) { x = 0; y = 1; z = 0; }
        else { x /= distanceToCenter; y /= distanceToCenter; z /= distanceToCenter; }
        double newX = player.velocity.x + x * strength;
        double newY = player.velocity.y + y * strength * 1.10;
        double newZ = player.velocity.z + z * strength;
        if (self && player.onGround && y > 0) newY += 0.10 * radial * exposure;
        double allowedHorizontal = StrictMath.max(1.35, length(player.velocity.x, 0, player.velocity.z));
        double horizontal = length(newX, 0, newZ);
        if (horizontal > allowedHorizontal) {
            double scale = allowedHorizontal / horizontal;
            newX *= scale; newZ *= scale;
        }
        newY = StrictMath.max(StrictMath.min(-0.90, player.velocity.y),
                StrictMath.min(StrictMath.max(1.05, player.velocity.y), newY));
        return new PlayerEffect(player.id, damage, new Vec3(newX, newY, newZ));
    }

    private static double exposure(WorldView world, Vec3 center, Box box) {
        int visible = 0;
        double sizeX = box.maxX - box.minX, sizeY = box.maxY - box.minY, sizeZ = box.maxZ - box.minZ;
        for (double fx : SAMPLE_FACTORS) {
            double x = box.minX + sizeX * fx;
            for (double fy : SAMPLE_FACTORS) {
                double y = box.minY + sizeY * fy;
                for (double fz : SAMPLE_FACTORS) {
                    if (trace(world, center, x, y, box.minZ + sizeZ * fz, 0, 0, 0, false, true) == 0) visible++;
                }
            }
        }
        return visible / 27.0;
    }

    /** DDA 按实际穿过长度传播，同时跨越各轴，忽略零长度接触。 */
    private static double trace(WorldView world, Vec3 from, double toX, double toY, double toZ,
                                int ignoredX, int ignoredY, int ignoredZ, boolean ignoreTarget, boolean shock) {
        double vx = toX - from.x, vy = toY - from.y, vz = toZ - from.z;
        double length = length(vx, vy, vz);
        if (length < EPS) return 0;
        int x = floor(from.x), y = floor(from.y), z = floor(from.z);
        int sx = sign(vx), sy = sign(vy), sz = sign(vz);
        double tx = boundary(from.x, vx, x, sx), ty = boundary(from.y, vy, y, sy);
        double tz = boundary(from.z, vz, z, sz);
        double dx = sx == 0 ? Double.POSITIVE_INFINITY : 1 / StrictMath.abs(vx);
        double dy = sy == 0 ? Double.POSITIVE_INFINITY : 1 / StrictMath.abs(vy);
        double dz = sz == 0 ? Double.POSITIVE_INFINITY : 1 / StrictMath.abs(vz);
        double t = 0, loss = 0;
        while (t < 1) {
            double next = StrictMath.min(1, StrictMath.min(tx, StrictMath.min(ty, tz)));
            double insideLength = (next - t) * length;
            if (insideLength > 0 && !(ignoreTarget && x == ignoredX && y == ignoredY && z == ignoredZ)) {
                BlockInfo block = world.blockAt(x, y, z);
                if (shock) {
                    if (block.blocksShock) return Double.POSITIVE_INFINITY;
                } else {
                    if (Double.isInfinite(block.lossPerBlock)) return Double.POSITIVE_INFINITY;
                    loss += block.lossPerBlock * insideLength;
                }
            }
            if (next >= 1) break;
            if (tx <= next) { x += sx; tx += dx; }
            if (ty <= next) { y += sy; ty += dy; }
            if (tz <= next) { z += sz; tz += dz; }
            t = next;
        }
        return loss;
    }

    private static double boundary(double start, double delta, int cell, int step) {
        return step == 0 ? Double.POSITIVE_INFINITY : ((step > 0 ? cell + 1.0 : cell) - start) / delta;
    }
    private static int floor(double value) { return (int) StrictMath.floor(value); }
    private static int sign(double value) { return value > 0 ? 1 : value < 0 ? -1 : 0; }
    private static double length(double x, double y, double z) { return StrictMath.sqrt(x * x + y * y + z * z); }
}

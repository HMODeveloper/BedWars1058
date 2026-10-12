package com.andrei1058.bedwars.listeners;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.LastHit;
import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.util.Vector;

import java.util.*;

import static com.andrei1058.bedwars.BedWars.config;
import static com.andrei1058.bedwars.BedWars.getAPI;

public class FireballListener implements Listener, com.andrei1058.bedwars.configuration.ReloadableConfiguration {

    private static FireballAlgorithm algorithm = FireballAlgorithm.DEFAULT;
    private double fireballExplosionSize;
    private boolean fireballMakeFire;
    private double fireballHorizontal;
    private double fireballVertical;
    private double knockbackTeammates;
    private double knockbackEnemy;

    private double damageSelf;
    private double damageEnemy;
    private double damageTeammates;

    public FireballListener() {
        refreshConfiguration();
    }

    @Override
    public void refreshConfiguration() {
        try {
            algorithm = FireballAlgorithm.parse(config.getYml().getString(ConfigPath.GENERAL_FIREBALL_ALGORITHM));
        } catch (IllegalArgumentException exception) {
            algorithm = FireballAlgorithm.DEFAULT;
            BedWars.plugin.getLogger().warning(exception.getMessage());
        }
        this.fireballExplosionSize = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_EXPLOSION_SIZE);
        this.fireballMakeFire = config.getYml().getBoolean(ConfigPath.GENERAL_FIREBALL_MAKE_FIRE);
        this.fireballHorizontal = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_KNOCKBACK_HORIZONTAL);
        this.fireballVertical = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_KNOCKBACK_VERTICAL);
        this.knockbackTeammates = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_KNOCKBACK_TEAMMATES);
        this.knockbackEnemy = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_KNOCKBACK_ENEMY);

        this.damageSelf = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_DAMAGE_SELF);
        this.damageEnemy = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_DAMAGE_ENEMY);
        this.damageTeammates = config.getYml().getDouble(ConfigPath.GENERAL_FIREBALL_DAMAGE_TEAMMATES);
    }

    @EventHandler
    public void fireballHit(ProjectileHitEvent e) {
        // validate important info
        if (!(e.getEntity() instanceof Fireball)) return;
        Fireball fireball = (Fireball) e.getEntity();
        if (isAstraSettled(fireball)) return;
        ProjectileSource projectileSource = e.getEntity().getShooter();
        if (!(projectileSource instanceof Player)) return;
        Player source = (Player) projectileSource;

        IArena arena = Arena.getArenaByPlayer(source);
        if (arena == null) return;

        // calc explosion loc
        Vector velocity = fireball.getVelocity();
        Location startLoc = fireball.getLocation();
        Location explosionLoc = calculateExactExplosionLoc(startLoc, velocity);

        // apply player kb
        World world = explosionLoc.getWorld();
        assert world != null;
        Collection<Entity> nearbyEntities = world.getNearbyEntities(explosionLoc, fireballExplosionSize, fireballExplosionSize, fireballExplosionSize);
        for (Entity entity : nearbyEntities) {
            if (!(entity instanceof Player)) continue;
            Player player = (Player) entity;
            if (!getAPI().getArenaUtil().isPlaying(player)) continue;

            // calc & apply player kb
            Vector playerTarget = player.getLocation().toVector().add(new Vector(0, 0.9, 0));
            Vector knockbackDir = playerTarget.subtract(explosionLoc.toVector());
            double distance = explosionLoc.distance(player.getLocation());
            double multiplier = 1.0;
            if (distance < fireballExplosionSize) {
                double x = distance / fireballExplosionSize;
                multiplier = Math.sqrt(1 - x * x);
            }
            if (multiplier < 0.1) multiplier = 0.1;

            knockbackDir.normalize();
            double verticalFactor = knockbackDir.getY();
            verticalFactor = 4 * verticalFactor * verticalFactor * verticalFactor - 6 * verticalFactor * verticalFactor + 3 * verticalFactor;
            if (verticalFactor < 0.25) verticalFactor = 0.25;

            Vector finalVelocity = knockbackDir.multiply(fireballHorizontal * multiplier);
            finalVelocity.setY(fireballVertical * multiplier * verticalFactor);

            // Reset fall distance
            player.setFallDistance(0);

            // Prevent teammates from overriding last hit
            boolean isTeammate = arena.getTeam(player).equals(arena.getTeam(source));
            boolean isSelf = player.equals(source);

            if (isSelf) {
                player.setVelocity(finalVelocity);
            } else if (isTeammate) {
                if (knockbackTeammates > 0) {
                    player.setVelocity(finalVelocity.multiply(knockbackTeammates));
                }
            } else {
                if (knockbackEnemy > 0) {
                    player.setVelocity(finalVelocity.multiply(knockbackEnemy));
                }
            }

            // Prevent teammates from overriding last hit
            if (!isTeammate || isSelf) {
                LastHit lh = LastHit.getLastHit(player);
                if (lh != null) {
                    lh.setDamager(source);
                    lh.setTime(System.currentTimeMillis());
                } else {
                    new LastHit(player, source, System.currentTimeMillis());
                }
            }

            if (isSelf) {
                if (damageSelf > 0) {
                    player.damage(damageSelf); // damage shooter
                }
            } else if (isTeammate) {
                if (damageTeammates > 0) {
                    player.damage(damageTeammates); // damage teammates
                }
            } else {
                if (damageEnemy > 0) {
                    player.damage(damageEnemy); // damage enemies
                }
            }
        }
    }

    private Location calculateExactExplosionLoc(Location startLoc, Vector velocity) {
        if (velocity.length() < 0.0001) return startLoc; // 速度为0防报错

        // 1. 先找到撞到了哪个方块 (使用之前的粗测法，只需确定 Block 坐标)
        // 这一步只是为了拿到 targetBlock，不需要精确坐标
        org.bukkit.block.Block targetBlock = null;
        Vector dirNorm = velocity.clone().normalize();
        Location trace = startLoc.clone();
        double checkDist = velocity.length() * 1.5;

        // 如果起点就在方块里，直接向上推一点返回
        if (trace.getBlock().getType().isSolid()) return trace.add(0, 0.5, 0);

        for (double d = 0; d <= checkDist; d += 0.1) {
            trace.add(dirNorm.clone().multiply(0.1));
            if (trace.getBlock().getType().isSolid()) {
                targetBlock = trace.getBlock();
                break;
            }
        }

        // 如果没撞到方块，就返回理论飞行终点
        if (targetBlock == null) return startLoc.clone().add(velocity);

        // 2. 核心算法：计算进入 X, Y, Z 三个平面的时间 t
        // 射线公式: P = Origin + Direction * t
        // 我们要求 t = (PlanePosition - Origin) / Direction

        double blockMinX = targetBlock.getX();
        double blockMaxX = blockMinX + 1.0;
        double blockMinY = targetBlock.getY();
        double blockMaxY = blockMinY + 1.0;
        double blockMinZ = targetBlock.getZ();
        double blockMaxZ = blockMinZ + 1.0;

        double dirX = velocity.getX();
        double dirY = velocity.getY();
        double dirZ = velocity.getZ();
        double startX = startLoc.getX();
        double startY = startLoc.getY();
        double startZ = startLoc.getZ();

        // 计算 X 轴碰撞时间 (tx)
        // 如果速度 X > 0，说明它是从左往右撞，只会撞到 MinX 面
        // 如果速度 X < 0，说明它是从右往左撞，只会撞到 MaxX 面
        double tx = -1;
        boolean hitXFaceIsMax = false; // 标记是撞到 x=1 还是 x=0
        if (dirX > 0) {
            tx = (blockMinX - startX) / dirX;
            hitXFaceIsMax = false;
        } else if (dirX < 0) {
            tx = (blockMaxX - startX) / dirX;
            hitXFaceIsMax = true;
        }

        // 计算 Y 轴碰撞时间 (ty)
        double ty = -1;
        boolean hitYFaceIsMax = false;
        if (dirY > 0) {
            ty = (blockMinY - startY) / dirY;
            hitYFaceIsMax = false;
        } else if (dirY < 0) {
            ty = (blockMaxY - startY) / dirY;
            hitYFaceIsMax = true;
        }

        // 计算 Z 轴碰撞时间 (tz)
        double tz = -1;
        boolean hitZFaceIsMax = false;
        if (dirZ > 0) {
            tz = (blockMinZ - startZ) / dirZ;
            hitZFaceIsMax = false;
        } else if (dirZ < 0) {
            tz = (blockMaxZ - startZ) / dirZ;
            hitZFaceIsMax = true;
        }

        // 3. 比较 tx, ty, tz，最大的那个就是“最后进入方块”的轴
        // 也就是说，射线在进入另外两个轴的范围时，还没碰到这个轴的范围。
        // 当三个轴都进入范围时，才是真正的碰撞。所以最大值即为碰撞点。
        // (注意：这里我们假设 t 必须 >= 0，因为是向前飞)

        double maxT = tx;
        int hitAxis = 0; // 0=X, 1=Y, 2=Z

        if (ty > maxT) {
            maxT = ty;
            hitAxis = 1;
        }
        if (tz > maxT) {
            maxT = tz;
            hitAxis = 2;
        }

        // 4. 根据结果构建坐标
        // 算出精确撞击坐标：P = Start + Velocity * t
        Location hitLoc = startLoc.clone().add(velocity.clone().multiply(maxT));

        // 根据命中轴把坐标锁定到方块表面。
        // 其他两个轴的坐标保持算出来的精确值
        if (hitAxis == 0) { // Hit X
            hitLoc.setX(hitXFaceIsMax ? blockMaxX : blockMinX);
        } else if (hitAxis == 1) { // Hit Y
            hitLoc.setY(hitYFaceIsMax ? blockMaxY : blockMinY);
        } else { // Hit Z
            hitLoc.setZ(hitZFaceIsMax ? blockMaxZ : blockMinZ);
        }

        return hitLoc;
    }

    /**
     * Remove the damage effect caused by the explosion created by the fireball
     *
     */
    @EventHandler
    public void fireballExplosionHit(EntityDamageByEntityEvent e) {
        if (!(e.getDamager() instanceof Fireball)) return;
        if (algorithm == FireballAlgorithm.ASTRA && pluginMetadata(e.getDamager(), "bw1058") != null
                && Arena.getArenaByIdentifier(e.getDamager().getWorld().getName()) != null) {
            // 同时禁用原版直击；未参赛玩家和实体也不能额外受到原版的 6 HP。
            e.setCancelled(true);
            return;
        }
        if (!(e.getEntity() instanceof Player)) return;

        if (Arena.getArenaByPlayer((Player) e.getEntity()) == null) return;

        e.setCancelled(true);
    }

    @EventHandler
    public void fireballPrime(ExplosionPrimeEvent e) {
        if (!(e.getEntity() instanceof Fireball)) return;
        Fireball fireball = (Fireball) e.getEntity();
        ProjectileSource shooter = fireball.getShooter();
        if (!(shooter instanceof Player)) return;
        Player player = (Player) shooter;
        if (isAstraSettled(fireball)) {
            e.setCancelled(true);
            return;
        }
        if (algorithm == FireballAlgorithm.ASTRA && pluginMetadata(fireball, "bw1058") != null) {
            IArena arena = Arena.getArenaByIdentifier(fireball.getWorld().getName());
            if (arena == null) return;
            boolean cancelled = e.isCancelled();
            e.setCancelled(true);
            fireball.setMetadata("bw1058-astra-settled", new FixedMetadataValue(BedWars.plugin, true));
            if (cancelled || arena.getStatus() != GameState.playing) return;
            Object impact = pluginMetadata(fireball, "bw1058-impact");
            if (!(impact instanceof Location) || !fireball.getWorld().equals(((Location) impact).getWorld())) {
                BedWars.plugin.getLogger().warning("Fireball " + fireball.getUniqueId() + ": missing or invalid bw1058-impact");
                return;
            }
            AstraFireballExplosion.explode(fireball, player, arena, (Location) impact);
            return;
        }
        if (Arena.getArenaByPlayer(player) == null) return;
        e.setFire(fireballMakeFire);
    }

    public static FireballAlgorithm getAlgorithm() {
        return algorithm;
    }

    public static boolean isAstraSettled(Entity entity) {
        return entity != null && Boolean.TRUE.equals(pluginMetadata(entity, "bw1058-astra-settled"));
    }

    private static Object pluginMetadata(Entity entity, String key) {
        for (MetadataValue value : entity.getMetadata(key)) {
            if (value.getOwningPlugin() == BedWars.plugin) return value.value();
        }
        return null;
    }

}
package com.andrei1058.bedwars.support.version.v1_8_R3;

import net.minecraft.server.v1_8_R3.EntityLargeFireball;
import net.minecraft.server.v1_8_R3.EntityLiving;
import net.minecraft.server.v1_8_R3.MovingObjectPosition;
import net.minecraft.server.v1_8_R3.Vec3D;
import net.minecraft.server.v1_8_R3.World;
import org.bukkit.Location;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;

/** 在原版爆炸修改世界之前记录实际碰撞位置。 */
final class BedWarsFireball extends EntityLargeFireball {
    private final Plugin plugin;
    private boolean impacted;

    BedWarsFireball(World world, EntityLiving shooter, double x, double y, double z, Plugin plugin) {
        super(world, shooter, x, y, z);
        this.plugin = plugin;
    }

    @Override
    protected void a(MovingObjectPosition hit) {
        if (impacted) return;
        impacted = true;
        Vec3D point = hit.pos;
        if (hit.entity != null) {
            MovingObjectPosition intersection = hit.entity.getBoundingBox().grow(0.3, 0.3, 0.3)
                    .a(new Vec3D(locX, locY, locZ), new Vec3D(locX + motX, locY + motY, locZ + motZ));
            point = intersection == null ? new Vec3D(locX, locY, locZ) : intersection.pos;
        }
        Location center = new Location(world.getWorld(), point.a, point.b, point.c);
        if (hit.entity == null && hit.direction != null) {
            center.add(hit.direction.getAdjacentX() * 0.0001,
                    hit.direction.getAdjacentY() * 0.0001, hit.direction.getAdjacentZ() * 0.0001);
        }
        getBukkitEntity().setMetadata("bw1058-impact", new FixedMetadataValue(plugin, center));
        super.a(hit);
    }
}

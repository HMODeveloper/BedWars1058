package com.andrei1058.bedwars.support.version.v1_8_R3;

import com.google.common.base.Predicate;
import net.minecraft.server.v1_8_R3.EntityCreature;
import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.EntityLiving;
import net.minecraft.server.v1_8_R3.PathfinderGoalNearestAttackableTarget;

public class GolemPathfinderGoalNearestAttackableTarget<T extends EntityLiving> extends PathfinderGoalNearestAttackableTarget<T> {
    public GolemPathfinderGoalNearestAttackableTarget(EntityCreature entitycreature, Class<T> oclass, int i, boolean flag, boolean flag1, Predicate<? super T> predicate) {
        super(entitycreature, oclass, i, flag, flag1, predicate);
        this.c = t0 -> {
            if (predicate != null && !predicate.apply(t0)) {
                return false;
            } else {
                if (t0 instanceof EntityHuman) {
                    double d0 = GolemPathfinderGoalNearestAttackableTarget.this.f();
                    if (t0.isSneaking()) {
                        d0 *= 0.8F;
                    }

                    //Cancel the invisible check
//                    if (t0.isInvisible()) {
//                        float f = ((EntityHuman) t0).bY();
//                        if (f < 0.1F) {
//                            f = 0.1F;
//                        }
//
//                        d0 *= 0.7F * f;
//                    }

                    if ((double) t0.g(GolemPathfinderGoalNearestAttackableTarget.this.e) > d0) {
                        return false;
                    }
                }

                return GolemPathfinderGoalNearestAttackableTarget.this.a(t0, false);
            }
        };
    }
}

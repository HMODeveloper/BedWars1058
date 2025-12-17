/*
 * BedWars1058 - A bed wars mini-game.
 * Copyright (C) 2021 Andrei Dascălu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Contact e-mail: andrew.dascalu@gmail.com
 */

package com.andrei1058.bedwars.arena.tasks;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.andrei1058.bedwars.api.events.gameplay.EggBridgeBuildEvent;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.configuration.Sounds;
import com.andrei1058.bedwars.listeners.EggBridge;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import static com.andrei1058.bedwars.BedWars.nms;
import static java.lang.Math.floor;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("WeakerAccess")
public class EggBridgeTask implements Runnable {

    private Egg projectile;
    private TeamColor teamColor;
    private Player player;
    private IArena arena;
    private BukkitTask task;

    // 延迟两个 tick 来避免撞上自己生成的方块
    private Queue<Location> locationHistory = new LinkedList<>();
    private static final int DELAY_TICKS = 2;

    public EggBridgeTask(Player player, Egg projectile, TeamColor teamColor) {
        IArena a = Arena.getArenaByPlayer(player);
        if (a == null) return;
        this.arena = a;
        this.projectile = projectile;
        this.teamColor = teamColor;
        this.player = player;
        task = Bukkit.getScheduler().runTaskTimer(BedWars.plugin, this, 0, 1);
    }

    public TeamColor getTeamColor() {
        return teamColor;
    }

    public Egg getProjectile() {
        return projectile;
    }

    public Player getPlayer() {
        return player;
    }

    public IArena getArena() {
        return arena;
    }

    @Override
    public void run() {
        if (getProjectile().isDead()
                || !arena.isPlayer(getPlayer())) {
            EggBridge.removeEgg(projectile);
            return;
        }

        // 延迟两个 tick
        locationHistory.add(getProjectile().getLocation());
        if (locationHistory.size() <= DELAY_TICKS) {
            return;
        }
        Location loc = locationHistory.poll();

        // 进行距离检查
        double distance = getPlayer().getLocation().distance(loc);
        double heightDiff = getPlayer().getLocation().getY() - loc.getY();
        if (distance > 27 || heightDiff > 10) {
            EggBridge.removeEgg(projectile);
            return;
        }

        if (getPlayer().getLocation().distance(loc) > 4.0D) {

            double deltaX;
            if (loc.getX() - floor(loc.getX()) < 0.5) {
                deltaX = -1.0D;
            } else {
                deltaX = 1.0D;
            }

            double deltaZ;
            if (loc.getZ() - floor(loc.getZ()) < 0.5) {
                deltaZ = -1.0D;
            } else {
                deltaZ = 1.0D;
            }

            Block b2 = loc.clone().add(0.0D, -2.0D, 0.0D).getBlock();
            createBridgeBlock(b2, loc);

            Block b3 = loc.clone().add(deltaX, -2.0D, 0.0D).getBlock();
            createBridgeBlock(b3, loc);

            Block b4 = loc.clone().add(0.0D, -2.0D, deltaZ).getBlock();
            createBridgeBlock(b4, loc);

            Block b5 = loc.clone().add(deltaX, -2.0D, deltaZ).getBlock();
            createBridgeBlock(b5, loc);
        }
    }

    // 创建方块逻辑
    private void createBridgeBlock(Block block, Location effectLoc) {
        if (!Misc.isBuildProtected(block.getLocation(), getArena())) {
            if (block.getType() == Material.AIR) {
                block.setType(nms.woolMaterial());
                nms.setBlockTeamColor(block, getTeamColor());
                getArena().addPlacedBlock(block);
                Bukkit.getPluginManager().callEvent(new EggBridgeBuildEvent(getTeamColor(), getArena(), block));
                effectLoc.getWorld().playEffect(block.getLocation(), nms.eggBridge(), 3);
                Sounds.playSound("egg-bridge-block", getPlayer());
            }
        }
    }

    public void cancel(){
        task.cancel();
        locationHistory.clear();
    }
}

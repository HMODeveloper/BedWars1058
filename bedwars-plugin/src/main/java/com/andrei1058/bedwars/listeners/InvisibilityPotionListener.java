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

package com.andrei1058.bedwars.listeners;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import com.andrei1058.bedwars.api.events.player.PlayerInvisibilityPotionEvent;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.sidebar.SidebarService;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.NotNull;

import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.BedWars;

import static com.andrei1058.bedwars.BedWars.nms;
import static com.andrei1058.bedwars.BedWars.plugin;

/**
 * This is used to hide and show player name tag above head when he drinks an invisibility
 * potion or when the potion is gone. It is required because it is related to scoreboards.
 */
public class InvisibilityPotionListener implements Listener {

    public InvisibilityPotionListener() {
        // Task to handle visibility and particles for teammates/spectators
        int interval = BedWars.plugin.getConfig().getInt(ConfigPath.GENERAL_CONFIGURATION_INVISIBILITY_PARTICLES_INTERVAL);
        if (interval < 1) interval = 1;
        
        Bukkit.getScheduler().runTaskTimer(plugin, () -> {
            // Get configured amount (re-read in case of reload, though reload usually restarts tasks)
            int amount = BedWars.plugin.getConfig().getInt(ConfigPath.GENERAL_CONFIGURATION_INVISIBILITY_PARTICLES_AMOUNT);
            if (amount < 1) amount = 1;

            for (IArena arena : Arena.getArenas()) {
                if (arena.getStatus() != com.andrei1058.bedwars.api.arena.GameState.playing) continue;

                // Process invisible players
                for (Player p : arena.getShowTime().keySet()) {
                    if (p == null || !p.isOnline()) continue;
                    ITeam team = arena.getTeam(p);
                    if (team == null) continue;

                    java.util.List<Player> observers = new java.util.ArrayList<>();

                    // Add teammates
                    for (Player member : team.getMembers()) {
                        if (member.isOnline() && !member.equals(p)) {
                            observers.add(member);
                        }
                    }

                    // Add spectators
                    for (Player spec : arena.getSpectators()) {
                        if (spec.isOnline() && !spec.equals(p)) {
                            observers.add(spec);
                        }
                    }

                    if (!observers.isEmpty()) {
                        // Play particles
                        nms.playInvisibilityParticles(p, observers, amount);
                        // Ensure they are visible (remove invisibility effect visually)
                        for (Player obs : observers) {
                            nms.removeInvisibilityEffect(p, obs);
                        }
                    }
                }
            }
        }, interval, interval);

        startInvisibilityWatchdog();
    }

    /**
     * Fix for: enemies seeing invisible player's armor when coming from distance.
     * The move event listener isn't enough because it only triggers on chunk change.
     * We need to refresh hide armor packets for players entering the tracking range.
     * <p>
     * Running at 2 ticks to minimize the delay between entering tracking range and hiding armor.
     */
    private void startInvisibilityWatchdog() {
        Bukkit.getScheduler().runTaskTimer(plugin, () -> {
            for (IArena arena : Arena.getArenas()) {
                if (arena.getStatus() != com.andrei1058.bedwars.api.arena.GameState.playing) continue;
                if (arena.getShowTime().isEmpty()) continue;

                for (java.util.Map.Entry<Player, Integer> entry : arena.getShowTime().entrySet()) {
                    Player invisible = entry.getKey();
                    if (invisible == null || !invisible.isOnline()) continue;

                    // We need to hide armor for enemies
                    ITeam team = arena.getTeam(invisible);
                    if (team == null) continue;

                    // Iterate over players in the same world to find enemies nearby
                    for (Player target : invisible.getWorld().getPlayers()) {
                        if (target.equals(invisible)) continue;
                        if (arena.isSpectator(target)) continue;
                        if (team.isMember(target)) continue;

                        // Check distance (simple optimization)
                        // Using a value slightly larger than default tracking range (48-64)
                        // 5000 is roughly 70 blocks
                        if (target.getLocation().distanceSquared(invisible.getLocation()) <= 5000) {
                            nms.hideArmor(invisible, target);
                        }
                    }
                }
            }
        }, 20L, 2L);
    }

    public static boolean shouldHideArmor(int entityId, Player observer) {
        // Find player by entity ID
        Player invisible = null;
        for (IArena arena : Arena.getArenas()) {
            if (arena.getStatus() != com.andrei1058.bedwars.api.arena.GameState.playing) continue;
            for (Player p : arena.getShowTime().keySet()) {
                if (p.getEntityId() == entityId) {
                    invisible = p;
                    break;
                }
            }
            if (invisible != null) break;
        }

        if (invisible == null) return false;

        IArena arena = Arena.getArenaByPlayer(invisible);
        if (arena == null) return false;
        
        // Don't hide for spectators
        if (arena.isSpectator(observer)) return false;

        // Don't hide for teammates
        ITeam team = arena.getTeam(invisible);
        if (team != null && team.isMember(observer)) return false;

        return true;
    }

    @EventHandler
    public void onPotion(@NotNull PlayerInvisibilityPotionEvent e) {
        if (e.getTeam() == null) return;
        SidebarService.getInstance().handleInvisibility(
                e.getTeam(), e.getPlayer(), e.getType() == PlayerInvisibilityPotionEvent.Type.ADDED
        );

        // Immediate visibility update for teammates/spectators
        if (e.getType() == PlayerInvisibilityPotionEvent.Type.ADDED) {
            IArena arena = e.getArena();
            Player p = e.getPlayer();
            ITeam team = e.getTeam();

            for (Player obs : arena.getWorld().getPlayers()) {
                if (obs.equals(p)) continue;
                boolean isTeam = (arena.getTeam(obs) != null && arena.getTeam(obs).equals(team));
                boolean isSpec = arena.isSpectator(obs);

                if (isTeam || isSpec) {
                    nms.removeInvisibilityEffect(p, obs);
                }
            }
        }
    }

    @EventHandler
    public void onDrink(PlayerItemConsumeEvent e) {
        IArena a = Arena.getArenaByPlayer(e.getPlayer());
        if (a == null) return;
        if (e.getItem().getType() != Material.POTION) return;
        // remove potion bottle
        Bukkit.getScheduler().runTaskLater(plugin, () ->
                        nms.minusAmount(e.getPlayer(), new ItemStack(Material.GLASS_BOTTLE), 1),
                5L);
        //

        if (nms.isInvisibilityPotion(e.getItem())) {
            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                for (PotionEffect pe : e.getPlayer().getActivePotionEffects()) {
                    if (pe.getType().toString().contains("INVISIBILITY")) {
                        // if is already invisible
                        if (a.getShowTime().containsKey(e.getPlayer())) {
                            ITeam t = a.getTeam(e.getPlayer());
                            // increase invisibility timer
                            // keep trace of invisible players to send hide armor packet when required
                            // because potions do not hide armors
                            a.getShowTime().replace(e.getPlayer(), pe.getDuration() / 20);
                            // call custom event
                            Bukkit.getPluginManager().callEvent(new PlayerInvisibilityPotionEvent(PlayerInvisibilityPotionEvent.Type.ADDED, t, e.getPlayer(), t.getArena()));
                        } else {
                            // if not already invisible
                            ITeam t = a.getTeam(e.getPlayer());
                            // keep trace of invisible players to send hide armor packet when required
                            // because potions do not hide armors
                            a.getShowTime().put(e.getPlayer(), pe.getDuration() / 20);
                            //
                            for (Player p1 : e.getPlayer().getWorld().getPlayers()) {
                                if (a.isSpectator(p1)) continue;
                                if (t != a.getTeam(p1)) {
                                    // hide player armor to other teams
                                    nms.hideArmor(e.getPlayer(), p1);
                                }
                            }
                            // call custom event
                            Bukkit.getPluginManager().callEvent(new PlayerInvisibilityPotionEvent(PlayerInvisibilityPotionEvent.Type.ADDED, t, e.getPlayer(), t.getArena()));
                        }
                        break;
                    }
                }
            }, 5L);
        }
    }
}

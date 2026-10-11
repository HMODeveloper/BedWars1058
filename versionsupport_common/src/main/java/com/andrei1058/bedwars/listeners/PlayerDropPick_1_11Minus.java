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

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.events.player.PlayerGeneratorCollectEvent;
import com.andrei1058.bedwars.api.server.ServerType;
import com.andrei1058.bedwars.support.version.common.VersionCommon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerDropPick_1_11Minus implements Listener {

    private static BedWars api;

    // Why is it unused????????
    public PlayerDropPick_1_11Minus(BedWars bedWars){
        api = bedWars;
    }

    /* This Class is used for versions from 1.8.8 to 1.11 included */

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onPickup(PlayerPickupItemEvent e) {
        if (api.getServerType() == ServerType.MULTIARENA) {
            //noinspection ConstantConditions
            if (e.getPlayer().getLocation().getWorld().getName().equalsIgnoreCase(api.getLobbyWorld())) {
                e.setCancelled(true);
                return;
            }
        }

        IArena a = api.getArenaUtil().getArenaByPlayer(e.getPlayer());
        if (a == null) return;

        if (!a.isPlayer(e.getPlayer())) {
            e.setCancelled(true);
            return;
        }

        if (a.getStatus() != GameState.playing) {
            e.setCancelled(true);
            return;
        }

        if (a.getRespawnSessions().containsKey(e.getPlayer())) {
            e.setCancelled(true);
            return;
        }

        if (e.getItem().getItemStack().getType() == Material.ARROW){
            e.getItem().setItemStack(api.getVersionSupport().createItemStack(e.getItem().getItemStack().getType().toString(), e.getItem().getItemStack().getAmount(), (short) 0));
            return;
        }

        if (VersionCommon.api.getVersionSupport().isBed(e.getItem().getItemStack().getType())) {
            e.setCancelled(true);
            e.getItem().remove();
        } else if (api.getVersionSupport().getTag(e.getItem().getItemStack(), "bw1058-generator-drop") != null) {
            if (api.getAFKUtil().isPlayerAFK(e.getPlayer())) {
                e.setCancelled(true);
                return;
            }

            PlayerGeneratorCollectEvent event = new PlayerGeneratorCollectEvent(e.getPlayer(), e.getItem(), a);
            Bukkit.getPluginManager().callEvent(event);
            if (event.isCancelled()) {
                e.setCancelled(true);
            } else {
                ItemStack resource = e.getItem().getItemStack();
                // Remove the unique ground-drop marker before the resource enters the inventory.
                e.getItem().setItemStack(new ItemStack(resource.getType(), resource.getAmount(), resource.getDurability()));
            }
        }
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        if (api.getServerType() == ServerType.MULTIARENA) {
            //noinspection ConstantConditions
            if (e.getPlayer().getLocation().getWorld().getName().equalsIgnoreCase(api.getLobbyWorld())) {
                e.setCancelled(true);
                return;
            }
        }
        IArena a = api.getArenaUtil().getArenaByPlayer(e.getPlayer());
        if (a == null) return;

        if (!a.isPlayer(e.getPlayer())) {
            e.setCancelled(true);
            return;
        }

        if (a.getStatus() != GameState.playing) {
            e.setCancelled(true);
        } else {
            ItemStack i = e.getItemDrop().getItemStack();
            if (i.getType() == Material.COMPASS) {
                e.setCancelled(true);
                return;
            }
        }

        if (a.getRespawnSessions().containsKey(e.getPlayer())) {
            e.setCancelled(true);
        }
    }
}

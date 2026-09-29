package com.andrei1058.bedwars.listeners;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Warnings implements Listener {
    private final BedWars plugin;

    public Warnings(BedWars plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if(!player.isOp()) return;

        if (Bukkit.getPluginManager().isPluginEnabled("Multiverse-Core")) {
            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                player.sendMessage(Language.getMsg(player, Messages.SERVER_MULTIVERSE_WARNING));
            }, 5); // run after 5 ticks to make sure its after any update spam on join
        }

        if(Bukkit.getServer().getSpawnRadius() > 0) {
            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                player.sendMessage(Language.getMsg(player, Messages.SERVER_SPAWN_PROTECTION_WARNING));
            }, 5);
        }
    }
}

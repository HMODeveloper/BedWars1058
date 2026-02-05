package com.andrei1058.bedwars.listeners;

import com.andrei1058.bedwars.api.events.player.PlayerJoinArenaEvent;
import com.andrei1058.bedwars.api.events.player.PlayerLeaveArenaEvent;
import com.andrei1058.bedwars.api.events.player.PlayerReJoinEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ArenaOpFilterListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onArenaJoin(PlayerJoinArenaEvent event) {
        applyFilter(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onArenaReJoin(PlayerReJoinEvent event) {
        applyFilter(event.getPlayer());
    }

    private void applyFilter(Player player) {
        // Inject packet interceptor to block stubborn messages
        PacketInterceptor.inject(player);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onArenaLeave(PlayerLeaveArenaEvent event) {
        removeAttachment(event.getPlayer());
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        removeAttachment(event.getPlayer());
    }

    private void removeAttachment(Player player) {
        PacketInterceptor.uninject(player);
    }
}

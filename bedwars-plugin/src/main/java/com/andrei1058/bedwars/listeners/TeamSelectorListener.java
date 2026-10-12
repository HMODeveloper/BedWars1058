package com.andrei1058.bedwars.listeners;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.team.TeamSelector;
import com.andrei1058.bedwars.arena.team.TeamSelector.TeamSelectorHolder;
import com.andrei1058.bedwars.configuration.Sounds;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class TeamSelectorListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = false)
    public void onInteract(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_AIR && event.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        if (!hasMarker(event.getItem(), "TEAM_SELECTOR")) return;
        Player player = event.getPlayer();
        IArena arena = Arena.getArenaByPlayer(player);
        if (!(arena instanceof Arena) || !((Arena) arena).canSelectTeam(player)) return;
        event.setCancelled(true);
        TeamSelector.open((Arena) arena, player);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onClick(InventoryClickEvent event) {
        Inventory top = event.getView().getTopInventory();
        if (!(top.getHolder() instanceof TeamSelectorHolder)) {
            if (isProtected(event.getCurrentItem()) || isProtected(event.getCursor())) {
                event.setCancelled(true);
            }
            int hotbar = event.getHotbarButton();
            if (hotbar >= 0 && isProtected(event.getWhoClicked().getInventory().getItem(hotbar))) {
                event.setCancelled(true);
            }
            return;
        }

        event.setCancelled(true);
        if (!(event.getWhoClicked() instanceof Player)) return;
        Player player = (Player) event.getWhoClicked();
        TeamSelectorHolder holder = (TeamSelectorHolder) top.getHolder();
        Arena arena = holder.getArena();
        if (Arena.getArenaByPlayer(player) != arena || !arena.canSelectTeam(player)) {
            closeNextTick(player, holder);
            return;
        }
        if (event.getClick() != ClickType.LEFT && event.getClick() != ClickType.RIGHT) return;
        int slot = event.getRawSlot();
        if (slot < 0 || slot >= top.getSize()) return;
        int bottom = top.getSize() - 9;
        if (slot == bottom + 4) {
            arena.clearSelectedTeam(player);
            closeNextTick(player, holder);
        } else if (slot == bottom) {
            holder.turnPage(player, -1);
        } else if (slot == bottom + 8) {
            holder.turnPage(player, 1);
        } else {
            ITeam team = holder.getTeamAt(slot);
            if (team == null) return;
            if (!arena.getTeams().contains(team)) {
                closeNextTick(player, holder);
                return;
            }
            if (arena.selectTeam(player, team)) {
                closeNextTick(player, holder);
            } else {
                player.sendMessage(Language.getMsg(player, Messages.TEAM_SELECTOR_FULL));
            }
        }
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onDrag(InventoryDragEvent event) {
        if (event.getView().getTopInventory().getHolder() instanceof TeamSelectorHolder) {
            event.setCancelled(true);
            return;
        }
        if (isProtected(event.getOldCursor()) || isProtected(event.getCursor())) {
            event.setCancelled(true);
            return;
        }
        for (ItemStack item : event.getNewItems().values()) {
            if (isProtected(item)) {
                event.setCancelled(true);
                return;
            }
        }
        for (int slot : event.getRawSlots()) {
            if (isProtected(event.getView().getItem(slot))) {
                event.setCancelled(true);
                return;
            }
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onOpen(InventoryOpenEvent event) {
        if (event.getInventory().getHolder() instanceof TeamSelectorHolder && event.getPlayer() instanceof Player) {
            Sounds.playSound(ConfigPath.SOUNDS_TEAM_SELECTOR_OPEN, (Player) event.getPlayer());
        }
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onClose(InventoryCloseEvent event) {
        if (event.getInventory().getHolder() instanceof TeamSelectorHolder && event.getPlayer() instanceof Player) {
            Sounds.playSound(ConfigPath.SOUNDS_TEAM_SELECTOR_CLOSE, (Player) event.getPlayer());
        }
    }

    private static void closeNextTick(Player player, TeamSelectorHolder holder) {
        IArena currentArena = Arena.getArenaByPlayer(player);
        Bukkit.getScheduler().runTask(BedWars.plugin, () -> {
            if (player.isOnline() && Arena.getArenaByPlayer(player) == currentArena
                    && player.getOpenInventory().getTopInventory().getHolder() == holder) {
                player.closeInventory();
            }
        });
    }

    private static boolean hasMarker(ItemStack item, String marker) {
        return item != null && item.getType() != Material.AIR && BedWars.nms.isCustomBedWarsItem(item)
                && marker.equals(BedWars.nms.getCustomData(item));
    }

    private static boolean isProtected(ItemStack item) {
        if (item == null || item.getType() == Material.AIR || !BedWars.nms.isCustomBedWarsItem(item)) return false;
        String marker = BedWars.nms.getCustomData(item);
        return "TEAM_SELECTOR".equals(marker) || "TEAM_PREVIEW_ARMOR".equals(marker);
    }
}

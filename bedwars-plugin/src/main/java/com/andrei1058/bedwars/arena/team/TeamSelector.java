package com.andrei1058.bedwars.arena.team;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.team.ITeam;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

/** Waiting-room items and menus; selections remain owned by the arena. */
public final class TeamSelector {

    private static final int TEAMS_PER_PAGE = 45;
    private static final String SELECTOR_MARKER = "TEAM_SELECTOR";
    private static final String ARMOR_MARKER = "TEAM_PREVIEW_ARMOR";

    private TeamSelector() {
    }

    public static void giveItem(Arena arena, Player player) {
        if (!arena.canSelectTeam(player)) return;
        ITeam selected = arena.getSelectedTeam(player);
        ItemStack item = wool(selected);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Language.getMsg(player, Messages.TEAM_SELECTOR_ITEM_NAME));
        String teamName = selected == null ? Language.getMsg(player, Messages.TEAM_SELECTOR_NONE)
                : selected.getDisplayName(Language.getPlayerLanguage(player));
        List<String> lore = new ArrayList<>();
        for (String line : Language.getList(player, Messages.TEAM_SELECTOR_ITEM_LORE)) {
            lore.add(line.replace("{team}", teamName));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        player.getInventory().setItem(4, BedWars.nms.addCustomData(item, SELECTOR_MARKER));
    }

    public static void updatePreview(Arena arena, Player player) {
        if (!arena.canSelectTeam(player)) {
            clearPreview(player);
            return;
        }
        giveItem(arena, player);
        ITeam selected = arena.getSelectedTeam(player);
        if (selected == null) {
            clearArmor(player);
        } else {
            player.getInventory().setBoots(armor(Material.LEATHER_BOOTS, selected));
            player.getInventory().setLeggings(armor(Material.LEATHER_LEGGINGS, selected));
            player.getInventory().setChestplate(armor(Material.LEATHER_CHESTPLATE, selected));
            player.getInventory().setHelmet(armor(Material.LEATHER_HELMET, selected));
        }
        player.updateInventory();
    }

    public static void open(Arena arena, Player player) {
        if (!arena.canSelectTeam(player)) return;
        TeamSelectorHolder holder = new TeamSelectorHolder(arena);
        int size = ((Math.min(holder.teams.size(), TEAMS_PER_PAGE) + 17) / 9) * 9;
        holder.inventory = Bukkit.createInventory(holder, size, Language.getMsg(player, Messages.TEAM_SELECTOR_TITLE));
        holder.refresh(player);
        player.openInventory(holder.inventory);
    }

    public static void refreshOpenMenus(Arena arena) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Inventory inventory = player.getOpenInventory().getTopInventory();
            if (!(inventory.getHolder() instanceof TeamSelectorHolder)) continue;
            TeamSelectorHolder holder = (TeamSelectorHolder) inventory.getHolder();
            if (holder.arena == arena && arena.canSelectTeam(player)) {
                holder.refresh(player);
            }
        }
    }

    public static void clearPreview(Player player) {
        for (int slot = 0; slot < player.getInventory().getSize(); slot++) {
            if (isPreviewItem(player.getInventory().getItem(slot))) {
                player.getInventory().setItem(slot, null);
            }
        }
        clearArmor(player);
        if (isPreviewItem(player.getItemOnCursor())) player.setItemOnCursor(null);
        player.updateInventory();
    }

    private static void clearArmor(Player player) {
        if (isPreviewItem(player.getInventory().getBoots())) player.getInventory().setBoots(null);
        if (isPreviewItem(player.getInventory().getLeggings())) player.getInventory().setLeggings(null);
        if (isPreviewItem(player.getInventory().getChestplate())) player.getInventory().setChestplate(null);
        if (isPreviewItem(player.getInventory().getHelmet())) player.getInventory().setHelmet(null);
    }

    private static boolean isPreviewItem(ItemStack item) {
        if (item == null || item.getType() == Material.AIR || !BedWars.nms.isCustomBedWarsItem(item)) return false;
        String marker = BedWars.nms.getCustomData(item);
        return SELECTOR_MARKER.equals(marker) || ARMOR_MARKER.equals(marker);
    }

    private static ItemStack wool(ITeam team) {
        ItemStack item = new ItemStack(BedWars.nms.woolMaterial(), 1);
        return team == null ? item : BedWars.nms.colourItem(item, team);
    }

    private static ItemStack armor(Material material, ITeam team) {
        ItemStack item = new ItemStack(material);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(team.getColor().bukkitColor());
        BedWars.nms.setUnbreakable(meta);
        item.setItemMeta(meta);
        return BedWars.nms.addCustomData(item, ARMOR_MARKER);
    }

    private static ItemStack button(Player player, Material material, String name, String lorePath) {
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Language.getMsg(player, name));
        if (lorePath != null) meta.setLore(Language.getList(player, lorePath));
        item.setItemMeta(meta);
        return item;
    }

    public static final class TeamSelectorHolder implements InventoryHolder {

        private final Arena arena;
        private final List<ITeam> teams;
        private int page;
        private Inventory inventory;

        private TeamSelectorHolder(Arena arena) {
            this.arena = arena;
            this.teams = new ArrayList<>(arena.getTeams());
        }

        public Arena getArena() {
            return arena;
        }

        @Override
        public Inventory getInventory() {
            return inventory;
        }

        public ITeam getTeamAt(int slot) {
            if (slot < 0 || slot >= inventory.getSize() - 9) return null;
            int index = page * TEAMS_PER_PAGE + slot;
            return index < teams.size() ? teams.get(index) : null;
        }

        public void turnPage(Player player, int direction) {
            int next = page + direction;
            if (next < 0 || next * TEAMS_PER_PAGE >= teams.size()) return;
            page = next;
            refresh(player);
        }

        public void refresh(Player player) {
            inventory.clear();
            ITeam selected = arena.getSelectedTeam(player);
            int offset = page * TEAMS_PER_PAGE;
            int count = Math.min(TEAMS_PER_PAGE, teams.size() - offset);
            for (int slot = 0; slot < count; slot++) {
                ITeam team = teams.get(offset + slot);
                ItemStack item = wool(team);
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(team.getDisplayName(Language.getPlayerLanguage(player)));
                String state = team == selected ? Language.getMsg(player, Messages.TEAM_SELECTOR_SELECTED) : "";
                String size = String.valueOf(arena.getSelectedTeamSize(team));
                String maximum = String.valueOf(arena.getMaxInTeam());
                List<String> lore = new ArrayList<>();
                for (String line : Language.getList(player, Messages.TEAM_SELECTOR_TEAM_LORE)) {
                    lore.add(line.replace("{selected}", size).replace("{max}", maximum).replace("{state}", state));
                }
                // 等候选择独立于正式成员，名单与菜单预留人数保持一致。
                for (Player member : arena.getPlayers()) {
                    if (!arena.isSpectator(member) && arena.getSelectedTeam(member) == team) {
                        lore.add(team.getColor().chat() + member.getName());
                    }
                }
                meta.setLore(lore);
                item.setItemMeta(meta);
                inventory.setItem(slot, item);
            }
            int bottom = inventory.getSize() - 9;
            inventory.setItem(bottom + 4, button(player, Material.BARRIER,
                    Messages.TEAM_SELECTOR_CANCEL_NAME, Messages.TEAM_SELECTOR_CANCEL_LORE));
            if (page > 0) {
                inventory.setItem(bottom, button(player, Material.ARROW, Messages.TEAM_SELECTOR_PREVIOUS_PAGE, null));
            }
            if (offset + TEAMS_PER_PAGE < teams.size()) {
                inventory.setItem(bottom + 8, button(player, Material.ARROW, Messages.TEAM_SELECTOR_NEXT_PAGE, null));
            }
        }
    }
}

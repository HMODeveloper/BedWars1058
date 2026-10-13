package com.andrei1058.bedwars.support.version.v1_8_R3;

import com.andrei1058.bedwars.api.arena.generator.GeneratorDrop;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

/** Removes legacy per-stack generator IDs before inventory capacity is calculated. */
public final class GeneratorDropMigration implements Listener {
    private static final String LEGACY_KEY = "bw1058-generator-drop";

    public void migrateLoadedData() {
        for (World world : Bukkit.getWorlds()) {
            for (Chunk chunk : world.getLoadedChunks()) migrateChunk(chunk);
        }
        for (Player player : Bukkit.getOnlinePlayers()) migratePlayer(player);
    }

    private ItemStack normalize(ItemStack stack) {
        if (stack == null) return null;
        Material material = stack.getType();
        if (material != Material.IRON_INGOT && material != Material.GOLD_INGOT
                && material != Material.DIAMOND && material != Material.EMERALD) return stack;
        if (!stack.hasItemMeta()) return stack;
        net.minecraft.server.v1_8_R3.ItemStack nms = CraftItemStack.asNMSCopy(stack);
        NBTTagCompound tag = nms.getTag();
        if (tag == null || !tag.hasKey(LEGACY_KEY)) return stack;
        tag.remove(LEGACY_KEY);
        if (tag.isEmpty()) nms.setTag(null);
        return CraftItemStack.asBukkitCopy(nms);
    }

    private void migrateItem(Item item) {
        ItemStack original = item.getItemStack();
        ItemStack normalized = normalize(original);
        if (normalized != original) {
            item.setItemStack(normalized);
            GeneratorDrop.mark(item, false);
        }
    }

    private void migrateInventory(Inventory inventory) {
        for (int slot = 0; slot < inventory.getSize(); slot++) {
            ItemStack original = inventory.getItem(slot);
            ItemStack normalized = normalize(original);
            if (normalized != original) inventory.setItem(slot, normalized);
        }
    }

    private void migrateChunk(Chunk chunk) {
        for (Entity entity : chunk.getEntities()) {
            if (entity instanceof Item) migrateItem((Item) entity);
        }
        for (BlockState state : chunk.getTileEntities()) {
            if (state instanceof InventoryHolder) migrateInventory(((InventoryHolder) state).getInventory());
        }
    }

    private void migratePlayer(Player player) {
        migrateInventory(player.getInventory());
        migrateInventory(player.getEnderChest());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChunkLoad(ChunkLoadEvent event) {
        migrateChunk(event.getChunk());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onItemSpawn(ItemSpawnEvent event) {
        migrateItem(event.getEntity());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
        migratePlayer(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onInventoryOpen(InventoryOpenEvent event) {
        Inventory top = event.getView().getTopInventory();
        Inventory bottom = event.getView().getBottomInventory();
        migrateInventory(top);
        if (bottom != top) migrateInventory(bottom);
    }
}

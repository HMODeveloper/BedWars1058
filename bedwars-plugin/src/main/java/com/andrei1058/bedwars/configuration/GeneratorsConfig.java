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

package com.andrei1058.bedwars.configuration;

import com.andrei1058.bedwars.api.configuration.ConfigManager;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.plugin.Plugin;

public class GeneratorsConfig extends ConfigManager {

    private static final String INTERVAL_VERSION = "generator-interval-version";

    public GeneratorsConfig(Plugin plugin, String name, String dir) {
        super(plugin, name, dir);
        YamlConfiguration yml = getYml();
        boolean migrated = migrateIntervals(yml);

        if (migrated) {
            Path file = new java.io.File(dir, name + ".yml").toPath();
            Path backup = file.resolveSibling(file.getFileName() + ".pre-interval.bak");
            try {
                if (!Files.exists(backup)) Files.copy(file, backup);
                Path temporary = Files.createTempFile(file.getParent(), name + "-interval-", ".tmp");
                try {
                    Files.write(temporary, yml.saveToString().getBytes(StandardCharsets.UTF_8));
                    Files.move(temporary, file, StandardCopyOption.REPLACE_EXISTING);
                } finally {
                    Files.deleteIfExists(temporary);
                }
                plugin.getLogger().info("Migrated generator delays to intervals; backup: " + backup);
            } catch (IOException ex) {
                throw new IllegalStateException("Could not migrate " + file + "; existing configuration is unchanged", ex);
            }
        }

        yml.options().header(plugin.getDescription().getName() + " by andrei1058." +
                "\ngenerators.yml uses interval values in seconds.\n");
        yml.addDefault("Default." + ConfigPath.GENERATOR_IRON_DELAY, 2);
        yml.addDefault("Default." + ConfigPath.GENERATOR_IRON_AMOUNT, 5);
        yml.addDefault("Default." + ConfigPath.GENERATOR_GOLD_DELAY, 6);
        yml.addDefault("Default." + ConfigPath.GENERATOR_GOLD_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_IRON_SPAWN_LIMIT, 48);
        yml.addDefault("Default." + ConfigPath.GENERATOR_GOLD_SPAWN_LIMIT, 16);
        yml.addDefault(ConfigPath.GENERATOR_STACK_ITEMS, false);
        yml.addDefault(ConfigPath.GENERATOR_ENABLE_GEN_SPLIT, true);
        yml.addDefault(ConfigPath.GENERATOR_GEN_SPLIT_RADIUS, 2D);

        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_I_DELAY, 30);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_I_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_I_SPAWN_LIMIT, 8);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_II_DELAY, 20);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_II_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_II_SPAWN_LIMIT, 8);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_II_START, 240);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_III_DELAY, 15);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_III_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_III_SPAWN_LIMIT, 8);
        yml.addDefault("Default." + ConfigPath.GENERATOR_DIAMOND_TIER_III_START, 720);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_I_DELAY, 70);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_I_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_I_SPAWN_LIMIT, 4);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_II_DELAY, 50);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_II_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_II_SPAWN_LIMIT, 6);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_II_START, 480);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_III_DELAY, 30);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_III_AMOUNT, 1);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_III_SPAWN_LIMIT, 8);
        yml.addDefault("Default." + ConfigPath.GENERATOR_EMERALD_TIER_III_START, 960);
        save();
    }

    static boolean migrateIntervals(YamlConfiguration yml) {
        if (yml.getInt(INTERVAL_VERSION) >= 1) return false;
        List<String> delayPaths = new ArrayList<>();
        for (String path : yml.getKeys(true)) {
            if (path.endsWith(".delay")) delayPaths.add(path);
        }
        for (String delayPath : delayPaths) {
            int delay = yml.getInt(delayPath);
            if (delay < 0 || delay == Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Generator delay cannot be migrated at " + delayPath);
            }
            yml.set(delayPath.substring(0, delayPath.length() - 6) + ".interval", delay + 1);
            yml.set(delayPath, null);
        }
        yml.set(INTERVAL_VERSION, 1);
        return true;
    }
}

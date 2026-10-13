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

package com.andrei1058.bedwars.stats;

import com.andrei1058.bedwars.BedWars;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class StatsManager {

    private final Map<UUID, StatsSession> stats = new ConcurrentHashMap<>();
    // Preloads survive the previous connection's quit, but abandoned logins expire.
    private final Cache<UUID, PlayerStats> preloadedStats = CacheBuilder.newBuilder()
            .expireAfterWrite(1, TimeUnit.MINUTES).build();

    public StatsManager() {
        Bukkit.getPluginManager().registerEvents(new StatsListener(), BedWars.plugin);
    }

    public void remove(Player player) {
        // Player equality can compare UUIDs; ownership must compare connections.
        stats.computeIfPresent(player.getUniqueId(), (uuid, session) ->
                session.owner == player ? null : session);
    }

    public void prepare(UUID uuid, PlayerStats playerStats) {
        preloadedStats.put(uuid, playerStats);
    }

    public boolean activate(Player player) {
        UUID uuid = player.getUniqueId();
        PlayerStats data = getUnsafe(uuid);
        if (data == null) data = preloadedStats.getIfPresent(uuid);
        if (data == null) return false;
        data.setName(player.getName());
        stats.put(uuid, new StatsSession(player, data));
        return true;
    }

    private static final class StatsSession {
        private final Player owner;
        private final PlayerStats stats;

        private StatsSession(Player owner, PlayerStats stats) {
            this.owner = owner;
            this.stats = stats;
        }
    }

    @NotNull
    public PlayerStats get(UUID uuid) {
        PlayerStats playerStats = getUnsafe(uuid);
        if (playerStats == null) {
            throw new IllegalStateException("Trying to get stats data of an unloaded player!");
        }
        return playerStats;
    }

    @Nullable
    public PlayerStats getUnsafe(UUID uuid) {
        StatsSession session = stats.get(uuid);
        return session == null ? null : session.stats;
    }
}

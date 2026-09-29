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

package com.andrei1058.bedwars.commands.bedwars.subcmds.sensitive.setup;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.api.server.SetupType;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.arena.SetupSession;
import com.andrei1058.bedwars.configuration.ArenaConfig;
import com.andrei1058.bedwars.configuration.Permissions;
import com.andrei1058.bedwars.configuration.Sounds;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.andrei1058.bedwars.BedWars.mainCmd;
import static com.andrei1058.bedwars.commands.Misc.createArmorStand;
import static com.andrei1058.bedwars.commands.Misc.removeArmorStand;

public class SetKillDropsLoc extends SubCommand {


    public SetKillDropsLoc(ParentCommand parent, String name) {
        super(parent, name);
        setArenaSetupCommand(true);
        setPermission(Permissions.PERMISSION_SETUP_ARENA);
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        SetupSession ss = SetupSession.getSession(p.getUniqueId());
        if (ss == null) {
            return false;
        }
        ArenaConfig arena = ss.getConfig();
        if (args.length < 1) {
            String foundTeam = "";
            double distance = 100;
            if (ss.getConfig().getYml().getConfigurationSection("Team") == null) {
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS));
                com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE), 5, 40, 5);
                Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);
                return true;
            }
            for (String team : ss.getConfig().getYml().getConfigurationSection("Team").getKeys(false)) {
                if (ss.getConfig().getYml().get("Team." + team + ".Spawn") == null) continue;
                double dis = ss.getConfig().getArenaLoc("Team." + team + ".Spawn").distance(p.getLocation());
                if (dis <= ss.getConfig().getInt(ConfigPath.ARENA_ISLAND_RADIUS)) {
                    if (dis < distance) {
                        distance = dis;
                        foundTeam = team;
                    }
                }
            }
            if (!foundTeam.isEmpty()) {
                if (ss.getConfig().getYml().get("Team." + foundTeam + "." + ConfigPath.ARENA_TEAM_KILL_DROPS_LOC) != null) {
                    removeArmorStand("kill-drops", ss.getConfig().getArenaLoc("Team." + foundTeam + "." + ConfigPath.ARENA_TEAM_KILL_DROPS_LOC), null);
                }
                arena.set("Team." + foundTeam + "." + ConfigPath.ARENA_TEAM_KILL_DROPS_LOC, arena.stringLocationArenaFormat(p.getLocation()));
                String team = ss.getTeamColor(foundTeam) + foundTeam;
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET).replace("{team}", team));
                createArmorStand(Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM).replace("{team}", team), p.getLocation(), null, "kill-drops");
                com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE).replace("{team}", team), 5, 40, 5);
                Sounds.playSound(ConfigPath.SOUNDS_BOUGHT, p);

                if (ss.getSetupType() == SetupType.ASSISTED) {
                    Bukkit.dispatchCommand(p, getParent().getName());
                }
                return true;
            }

            p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_USAGE).replace("{command}", mainCmd));
            return true;
        }

        String foundTeam = ss.getNearestTeam();

        if (foundTeam.isEmpty()) {
            p.sendMessage("");
            p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND));
            p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST), Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_MANUAL_HINT).replace("{subcommand}", getSubCommandName()), Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
            com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE), 5, 60, 5);
            Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);
            return true;
        }

        if (args.length == 1) {
            if (arena.getYml().get("Team." + args[0]) != null) {
                foundTeam = args[0];
            } else {
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_NOT_FOUND));
                if (arena.getYml().get("Team") != null) {
                    p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_AVAILABLE_TEAMS));
                    for (String team : Objects.requireNonNull(arena.getYml().getConfigurationSection("Team")).getKeys(false)) {
                        p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY).replace("{team}", ss.getTeamColor(team) + team), Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER).replace("{team}", ss.getTeamColor(team) + team), "/" + mainCmd + " setKillDrops " + team, ClickEvent.Action.RUN_COMMAND));
                    }
                }
                return true;
            }
        }

        arena.set("Team." + foundTeam + "." + ConfigPath.ARENA_TEAM_KILL_DROPS_LOC, arena.stringLocationArenaFormat(p.getLocation()));
        p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_KILL_DROPS_SET).replace("{team}", ss.getTeamColor(foundTeam) + foundTeam));

        if (ss.getSetupType() == SetupType.ASSISTED) {
            Bukkit.dispatchCommand(p, getParent().getName());
        }
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return new ArrayList<>();
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {
        if (s instanceof ConsoleCommandSender) return false;

        Player p = (Player) s;
        if (!SetupSession.isInSetupSession(p.getUniqueId())) return false;

        return hasPermission(s);
    }
}

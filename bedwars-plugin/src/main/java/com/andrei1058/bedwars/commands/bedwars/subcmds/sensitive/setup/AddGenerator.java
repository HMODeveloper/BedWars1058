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
import com.andrei1058.bedwars.configuration.Permissions;
import com.andrei1058.bedwars.configuration.Sounds;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.andrei1058.bedwars.commands.Misc.createArmorStand;

public class AddGenerator extends SubCommand {

    public AddGenerator(ParentCommand parent, String name) {
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

        if (args.length == 0 && ss.getSetupType() == SetupType.ASSISTED) {
            String team = ss.getNearestTeam();
            if (team.isEmpty()) {
                // save emerald or diamond generator if is standing on a block of this type
                if (p.getLocation().add(0, -1, 0).getBlock().getType() == Material.DIAMOND_BLOCK) {
                    Bukkit.dispatchCommand(p, getParent().getName() + " " + getSubCommandName() + " diamond");
                    return true;
                } else if (p.getLocation().add(0, -1, 0).getBlock().getType() == Material.EMERALD_BLOCK) {
                    Bukkit.dispatchCommand(p, getParent().getName() + " " + getSubCommandName() + " emerald");
                    return true;
                }

                // else send usage message
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND));
                p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST), Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
                p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_MANUAL_HINT).replace("{subcommand}", getSubCommandName()), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
                p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
                com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE), 5, 60, 5);
                Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);
                return true;
            }
            // save team generators
            saveTeamGen(p.getLocation(), team, ss, "Iron");
            saveTeamGen(p.getLocation(), team, ss, "Gold");
            saveTeamGen(p.getLocation(), team, ss, "Emerald");

            createArmorStand(Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM).replace("{team}", ss.getTeamColor(team) + team), p.getLocation(), ss.getConfig().stringLocationArenaFormat(p.getLocation()), "team-generator");
            p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_SET).replace("{team}", ss.getTeamColor(team) + team));

            Bukkit.dispatchCommand(p, getParent().getName());

            com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE).replace("{team}", ss.getTeamColor(team) + team), 5, 60, 5);
            Sounds.playSound(ConfigPath.SOUNDS_BOUGHT, p);
            return true;
        } else if (args.length == 1 && (args[0].equalsIgnoreCase("diamond") || args[0].equalsIgnoreCase("emerald"))) {
            // add emerald or diamond generator to the list if it was not added yet
            List<Location> locations = ss.getConfig().getArenaLocations("generator." + args[0].substring(0, 1).toUpperCase() + args[0].substring(1).toLowerCase());
            for (Location l : locations) {
                if (ss.getConfig().compareArenaLoc(l, p.getLocation())) {
                    p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_EXISTS));
                    com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE), 5, 30, 5);
                    Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);
                    return true;
                }
            }
            String gen = args[0].substring(0, 1).toUpperCase() + args[0].substring(1).toLowerCase();

            ArrayList<String> saved;
            if (ss.getConfig().getYml().get("generator." + gen) == null) {
                saved = new ArrayList<>();
            } else {
                saved = (ArrayList<String>) ss.getConfig().getYml().getStringList("generator." + gen);
            }
            saved.add(ss.getConfig().stringLocationArenaFormat(p.getLocation()));

            ss.getConfig().set("generator." + gen, saved);
            p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADDED).replace("{generator}", gen));
            createArmorStand(Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM).replace("{generator}", gen), p.getLocation(), ss.getConfig().stringLocationArenaFormat(p.getLocation()), gen.toLowerCase());
            if (ss.getSetupType() == SetupType.ASSISTED) {
                Bukkit.dispatchCommand(p, getParent().getName());
            }
            com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE).replace("{generator}", gen), 5, 60, 5);
            Sounds.playSound(ConfigPath.SOUNDS_BOUGHT, p);
            return true;
        } else if (args.length >= 1 && (args[0].equalsIgnoreCase("iron") || args[0].equalsIgnoreCase("gold") || args[0].equalsIgnoreCase("upgrade")) && ss.getSetupType() == SetupType.ADVANCED) {
            String team;
            if (args.length == 1) {
                team = ss.getNearestTeam();
            } else {
                team = args[1];
                if (ss.getConfig().getYml().get("Team." + team + ".Color") == null) {
                    p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND).replace("{team}", team));
                    p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT));
                    ss.displayAvailableTeams();
                    com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE), 5, 60, 5);
                    Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);
                    return true;
                }
            }
            // find nearest team to set the generator else send usage msg
            if (team.isEmpty()) {
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND));
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT));
                return true;
            }

            String gen = args[0].substring(0, 1).toUpperCase() + args[0].substring(1).toLowerCase();
            if (gen.equalsIgnoreCase("upgrade")) {
                gen = "Emerald";
            }

            createArmorStand(Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM).replace("{generator}", gen).replace("{team}", ss.getTeamColor(team) + team), p.getLocation(), ss.getConfig().stringLocationArenaFormat(p.getLocation()), gen.toLowerCase());
            p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET).replace("{generator}", gen).replace("{team}", ss.getTeamColor(team) + team));
            saveTeamGen(p.getLocation(), team, ss, gen);
            com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE).replace("{generator}", gen).replace("{team}", ss.getTeamColor(team) + team), 5, 60, 5);
            Sounds.playSound(ConfigPath.SOUNDS_BOUGHT, p);
            return true;
        } else if (args.length == 1 && ss.getSetupType() == SetupType.ASSISTED) {
            String team = args[0];
            if (ss.getConfig().getYml().get("Team." + team + ".Color") == null) {
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND).replace("{team}", team));
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT));
                ss.displayAvailableTeams();
                com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND).replace("{team}", team), 5, 40, 5);
                Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);
                return true;
            }

            saveTeamGen(p.getLocation(), team, ss, "Iron");
            saveTeamGen(p.getLocation(), team, ss, "Gold");
            saveTeamGen(p.getLocation(), team, ss, "Emerald");
            createArmorStand(Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM).replace("{team}", ss.getTeamColor(team) + team), p.getLocation(), ss.getConfig().stringLocationArenaFormat(p.getLocation()), "team-generator");
            p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_SET).replace("{team}", ss.getTeamColor(team) + team));
            Bukkit.dispatchCommand(p, getParent().getName());

            com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE).replace("{team}", ss.getTeamColor(team) + team), 5, 60, 5);
            Sounds.playSound(ConfigPath.SOUNDS_BOUGHT, p);
            return true;
        }
        if (ss.getSetupType() == SetupType.ASSISTED) {
            p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));

        }
        if (ss.getSetupType() == SetupType.ADVANCED) {
            p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
        }
        p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE), Language.getMsg(p, Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return Arrays.asList("Diamond", "Emerald", "Iron", "Gold", "Upgrade");
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {
        if (s instanceof ConsoleCommandSender) return false;

        Player p = (Player) s;
        if (!SetupSession.isInSetupSession(p.getUniqueId())) return false;

        return hasPermission(s);
    }

    /**
     * Save team generator.
     *
     * @param l    location.
     * @param t    team.
     * @param ss   setup session.
     * @param type Iron/ Gold.
     */
    private static void saveTeamGen(Location l, String t, @NotNull SetupSession ss, String type) {
        Object o = ss.getConfig().getYml().get("Team." + t + "." + type);
        List<String> locs;
        if (o == null) {
            locs = new ArrayList<>();
        } else if (o instanceof String) {
            locs = new ArrayList<>();
            locs.add((String) o);
        } else {
            locs = ss.getConfig().getList("Team." + t + "." + type);
        }

        locs.add(ss.getConfig().stringLocationArenaFormat(l));
        ss.getConfig().set("Team." + t + "." + type, locs);
    }
}

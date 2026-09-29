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

package com.andrei1058.bedwars.commands.bedwars.subcmds.sensitive;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.arena.SetupSession;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import com.andrei1058.bedwars.configuration.ArenaConfig;
import com.andrei1058.bedwars.configuration.Permissions;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.andrei1058.bedwars.BedWars.config;
import static com.andrei1058.bedwars.BedWars.plugin;

public class ArenaGroup extends SubCommand {

    public ArenaGroup(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(8);
        showInList(true);
        setPermission(Permissions.PERMISSION_ARENA_GROUP);
        setDisplayInfo(Misc.msgHoverClick(Language.getMsg(null, Messages.COMMAND_ARENA_GROUP_DISPLAY).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()), Language.getMsg(null, Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER),
                "/" + getParent().getName() + " " + getSubCommandName(), ClickEvent.Action.RUN_COMMAND));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        if (!MainCommand.isLobbySet(p)) return true;
        if (args.length < 2 && (args.length < 1 || !args[0].equalsIgnoreCase("list"))) {
            sendArenaGroupCmdList(p);
        } else if (args[0].equalsIgnoreCase("create")) {
            if (args[0].contains("+")) {
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_ARENA_SYMBOL).replace("{arena}", args[0]));
                return true;
            }
            java.util.List<String> groups;
            if (config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS) == null) {
                groups = new ArrayList<>();
            } else {
                groups = config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS);
            }
            if (groups.contains(args[1])) {
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_EXISTS));
                return true;
            }
            groups.add(args[1]);
            config.set(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS, groups);
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_CREATED));
        } else if (args[0].equalsIgnoreCase("remove")) {
            List<String> groups;
            if (config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS) == null) {
                groups = new ArrayList<>();
            } else {
                groups = config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS);
            }
            if (!groups.contains(args[1])) {
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_NOT_FOUND));
                return true;
            }
            groups.remove(args[1]);
            config.set(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS, groups);
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_DELETED));
        } else if (args[0].equalsIgnoreCase("list")) {
            List<String> groups;
            if (config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS) == null) {
                groups = new ArrayList<>();
            } else {
                groups = config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS);
            }
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_HEADER));
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_DEFAULT));
            for (String gs : groups) {
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_ENTRY).replace("{group}", gs));
            }
        } else if (args[0].equalsIgnoreCase("set")) {
            if (args.length < 3) {
                sendArenaGroupCmdList(p);
                return true;
            }
            if (config.getYml().get(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS) != null) {
                if (config.getYml().getStringList(ConfigPath.GENERAL_CONFIGURATION_ARENA_GROUPS).contains(args[2])) {
                    File arena = new File(plugin.getDataFolder(), "/Arenas/" + args[1] + ".yml");
                    if (!arena.exists()) {
                        p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND).replace("{arena}", args[1]));
                        return true;
                    }
                    ArenaConfig cm = new ArenaConfig(BedWars.plugin, args[1], plugin.getDataFolder().getPath() + "/Arenas");
                    cm.set("group", args[2]);
                    if (Arena.getArenaByName(args[1]) != null) {
                        Arena.getArenaByName(args[1]).setGroup(args[2]);
                    }
                    p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_ASSIGNED).replace("{arena}", args[1]).replace("{group}", args[2]));
                } else {
                    p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_UNKNOWN).replace("{group}", args[2]));
                    Bukkit.dispatchCommand(p, "/bw list");
                }
            } else {
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_UNKNOWN).replace("{group}", args[2]));
                Bukkit.dispatchCommand(p, "/bw list");
            }
        } else {
            sendArenaGroupCmdList(p);
        }
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return Arrays.asList("create", "remove", "list", "set");
    }

    private void sendArenaGroupCmdList(Player p) {
        p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_CREATE_USAGE).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()),
                Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_CREATE_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " create", ClickEvent.Action.SUGGEST_COMMAND));
        p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_LIST_USAGE).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()),
                Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_LIST_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " list", ClickEvent.Action.RUN_COMMAND));
        p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()),
                Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " remove", ClickEvent.Action.SUGGEST_COMMAND));
        p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_SET_USAGE).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()),
                Language.getMsg(p, Messages.COMMAND_ARENA_GROUP_SET_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " set", ClickEvent.Action.SUGGEST_COMMAND));
    }

    @Override
    public boolean canSee(CommandSender s, com.andrei1058.bedwars.api.BedWars api) {
        if (s instanceof ConsoleCommandSender) return false;

        Player p = (Player) s;
        if (Arena.isInArena(p)) return false;

        if (SetupSession.isInSetupSession(p.getUniqueId())) return false;
        return hasPermission(s);
    }
}

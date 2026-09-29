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
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.arena.SetupSession;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import com.andrei1058.bedwars.configuration.Permissions;
import net.md_5.bungee.api.chat.ClickEvent;
import org.apache.commons.io.FileUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.andrei1058.bedwars.BedWars.plugin;

public class CloneArena extends SubCommand {
    public CloneArena(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(7);
        showInList(true);
        setPermission(Permissions.PERMISSION_CLONE);
        setDisplayInfo(Misc.msgHoverClick(Language.getMsg(null, Messages.COMMAND_CLONE_ARENA_DISPLAY).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()), Language.getMsg(null, Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER),
                "/" + getParent().getName() + " " + getSubCommandName(), ClickEvent.Action.SUGGEST_COMMAND));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        if (!MainCommand.isLobbySet(p)) return true;
        if (args.length != 2) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_CLONE_ARENA_USAGE).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()));
            return true;
        }
        if (!BedWars.getAPI().getRestoreAdapter().isWorld(args[0])) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_NOT_FOUND).replace("{arena}", args[0]));
            return true;
        }
        File yml1 = new File(plugin.getDataFolder(), "/Arenas/" + args[0] + ".yml"), yml2 = new File(plugin.getDataFolder(), "/Arenas/" + args[1] + ".yml");
        if (!yml1.exists()) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_ARENA_NOT_FOUND).replace("{arena}", args[0]));
            return true;
        }
        if (BedWars.getAPI().getRestoreAdapter().isWorld(args[1]) && yml2.exists()) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_CLONE_ARENA_EXISTS).replace("{arena}", args[1]));
            return true;
        }
        if (args[1].contains("+")) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_ARENA_SYMBOL).replace("{arena}", args[1]));
            return true;
        }
        if (Arena.getArenaByName(args[0]) != null) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST).replace("{arena}", args[0]));
            return true;
        }
        BedWars.getAPI().getRestoreAdapter().cloneArena(args[0], args[1]);
        if (yml1.exists()) {
            try {
                FileUtils.copyFile(yml1, yml2, true);
            } catch (IOException e) {
                e.printStackTrace();
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_CLONE_ARENA_COPY_ERROR));
            }
        }
        p.sendMessage(Language.getMsg(p, Messages.COMMAND_CLONE_ARENA_SUCCESS));
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        List<String> tab = new ArrayList<>();
        File dir = new File(plugin.getDataFolder(), "/Arenas");
        if (dir.exists()) {
            File[] fls = dir.listFiles();
            for (File fl : Objects.requireNonNull(fls)) {
                if (fl.isFile()) {
                    if (fl.getName().contains(".yml")) {
                        tab.add(fl.getName().replace(".yml", ""));
                    }
                }
            }
        }
        return tab;
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

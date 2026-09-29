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
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import static com.andrei1058.bedwars.BedWars.plugin;
import static com.andrei1058.bedwars.arena.Arena.getArenaByName;

public class DelArena extends SubCommand {

    private static HashMap<Player, Long> delArenaConfirm = new HashMap<>();

    public DelArena(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(4);
        showInList(true);
        setPermission(Permissions.PERMISSION_DEL_ARENA);
        setDisplayInfo(Misc.msgHoverClick(Language.getMsg(null, Messages.COMMAND_DEL_ARENA_DISPLAY).replace("{command}", MainCommand.getInstance().getName()).replace("{subcommand}", getSubCommandName()), Language.getMsg(null, Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER),
                "/" + MainCommand.getInstance().getName() + " "+getSubCommandName(), ClickEvent.Action.SUGGEST_COMMAND));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        if (!MainCommand.isLobbySet(p)) return true;
        if (args.length != 1) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_DEL_ARENA_USAGE).replace("{command}", MainCommand.getInstance().getName()));
            return true;
        }
        if (!BedWars.getAPI().getRestoreAdapter().isWorld(args[0])) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND).replace("{arena}", args[0]));
            return true;
        }
        if (getArenaByName(args[0]) != null) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST));
            return true;
        }
        File ac = new File(plugin.getDataFolder(), "/Arenas/" + args[0]+ ".yml");
        if (!ac.exists()) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_DEL_ARENA_NOT_FOUND));
            return true;
        }
        if (delArenaConfirm.containsKey(p)) {
            if (System.currentTimeMillis() - 2000 <= delArenaConfirm.get(p)) {
                BedWars.getAPI().getRestoreAdapter().deleteWorld(args[0]);
                FileUtils.deleteQuietly(ac);
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_DEL_ARENA_SUCCESS).replace("{arena}", args[0]));
                return true;
            }
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_DEL_ARENA_CONFIRM));
            delArenaConfirm.replace(p, System.currentTimeMillis());
        } else {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_DEL_ARENA_CONFIRM));
            delArenaConfirm.put(p, System.currentTimeMillis());
        }
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

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
import com.andrei1058.bedwars.api.events.player.PlayerXpGainEvent;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.arena.SetupSession;
import com.andrei1058.bedwars.configuration.LevelsConfig;
import com.andrei1058.bedwars.configuration.Permissions;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Level extends SubCommand {

    public Level(ParentCommand parent, String name) {
        super(parent, name);
        setPermission(Permissions.PERMISSION_LEVEL);
        setPriority(10);
        showInList(true);
        setDisplayInfo(Misc.msgHoverClick(Language.getMsg(null, Messages.COMMAND_LEVEL_DISPLAY).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()), Language.getMsg(null, Messages.COMMAND_LEVEL_DISPLAY_HOVER),
                "/" + getParent().getName() + " " + getSubCommandName(), ClickEvent.Action.RUN_COMMAND));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (args.length == 0) {
            sendSubCommands(s, BedWars.getAPI());
            return true;
        }
        if (args[0].equalsIgnoreCase("setlevel")) {
            if (args.length != 3) {
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_SET_USAGE));
                return true;
            }
            Player pl = Bukkit.getPlayer(args[1]);
            if (pl == null) {
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND));
                return true;
            }

            int level;

            try {
                level = Integer.parseInt(args[2]);
            } catch (Exception e) {
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_INVALID_LEVEL));
                return true;
            }

            BedWars.getAPI().getLevelsUtil().setLevel(pl, level);

            int nextLevelCost =  LevelsConfig.levels.getYml().get("levels." + level + ".rankup-cost") == null ?
                    LevelsConfig.levels.getInt("levels.others.rankup-cost") : LevelsConfig.levels.getInt("levels." + level + ".rankup-cost");

            String levelName = LevelsConfig.levels.getYml().get("levels." + level + ".name") == null ?
                    LevelsConfig.levels.getYml().getString("levels.others.name") : LevelsConfig.levels.getYml().getString("levels." + level + ".name");


            BedWars.plugin.getServer().getScheduler().runTaskAsynchronously(BedWars.plugin, () -> {
                BedWars.getRemoteDatabase().setLevelData(pl.getUniqueId(), level, 0, levelName, nextLevelCost);
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_SET_SUCCESS).replace("{player}", pl.getName()).replace("{level}", args[2]));
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_REJOIN));
            });
        } else if (args[0].equalsIgnoreCase("givexp")) {
            if (args.length != 3) {
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_XP_USAGE));
                return true;
            }
            Player pl = Bukkit.getPlayer(args[1]);
            if (pl == null) {
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND));
                return true;
            }

            int amount;

            try {
                amount = Integer.parseInt(args[2]);
            } catch (Exception e) {
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_INVALID_AMOUNT));
                return true;
            }

            BedWars.getAPI().getLevelsUtil().addXp(pl, amount, PlayerXpGainEvent.XpSource.OTHER);

            BedWars.plugin.getServer().getScheduler().runTaskAsynchronously(BedWars.plugin, () -> {
                Object[] data = BedWars.getRemoteDatabase().getLevelData(pl.getUniqueId());
                BedWars.getRemoteDatabase().setLevelData(pl.getUniqueId(), (Integer) data[0], ((Integer)data[1]) + amount, (String) data[2], (Integer)data[3]);
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_XP_SUCCESS).replace("{amount}", args[2]).replace("{player}", pl.getName()));
                s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_LEVEL_REJOIN));
            });
        } else {
            sendSubCommands(s, BedWars.getAPI());
        }
        return true;
    }

    private void sendSubCommands(CommandSender s, com.andrei1058.bedwars.api.BedWars api) {
        if (s instanceof Player) {
            Player p = (Player) s;
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LEVEL_SET_USAGE), Language.getMsg(p, Messages.COMMAND_LEVEL_SET_HOVER),
                    "/" + getParent().getName() + " " + getSubCommandName() + " setLevel", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LEVEL_XP_USAGE), Language.getMsg(p, Messages.COMMAND_LEVEL_XP_HOVER),
                    "/" + getParent().getName() + " " + getSubCommandName() + " giveXp", ClickEvent.Action.SUGGEST_COMMAND));
        } else {
            s.sendMessage(Language.getMsg(null, Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE));
            s.sendMessage(Language.getMsg(null, Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE));
        }
    }

    @Override
    public List<String> getTabComplete() {
        return null;
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

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
import com.andrei1058.bedwars.api.arena.team.TeamColor;
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
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.andrei1058.bedwars.BedWars.mainCmd;
import static com.andrei1058.bedwars.commands.Misc.createArmorStand;
import static com.andrei1058.bedwars.commands.Misc.removeArmorStand;

public class SetUpgrade extends SubCommand {

    public SetUpgrade(ParentCommand parent, String name) {
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
            s.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_NOT_IN_SESSION));
            return true;
        }
        if (args.length == 0) {
            String foundTeam = ss.getNearestTeam();
            if (foundTeam.isEmpty()) {
                p.sendMessage("");
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND));
                p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST), Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
                p.spigot().sendMessage(Misc.msgHoverClick(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_MANUAL_HINT).replace("{subcommand}", getSubCommandName()), Language.getMsg(p, Messages.COMMAND_SETUP_UPGRADE_HOVER), "/" + getParent().getName() + " " + getSubCommandName() + " ", ClickEvent.Action.SUGGEST_COMMAND));
                com.andrei1058.bedwars.BedWars.nms.sendTitle(p, " ", Language.getMsg(p, Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE), 0, 60, 10);
                Sounds.playSound(ConfigPath.SOUNDS_INSUFF_MONEY, p);

            } else {
                Bukkit.dispatchCommand(s, getParent().getName() + " " + getSubCommandName() + " " + foundTeam);
            }
        } else {
            if (ss.getConfig().getYml().get("Team." + args[0]) == null) {
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_NOT_FOUND));
                if (ss.getConfig().getYml().get("Team") != null) {
                    p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_AVAILABLE_TEAMS));
                    for (String team : Objects.requireNonNull(ss.getConfig().getYml().getConfigurationSection("Team")).getKeys(false)) {
                        p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY).replace("{team}", ss.getTeamColor(team) + team), Language.getMsg(p, Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER).replace("{team}", TeamColor.getChatColor(Objects.requireNonNull(ss.getConfig().getYml().getString("Team." + team + ".Color"))) + team), "/" + mainCmd + " setUpgrade " + team, ClickEvent.Action.RUN_COMMAND));
                    }
                }
            } else {
                String teamm = ss.getTeamColor(args[0]) + args[0];
                if (ss.getConfig().getYml().get("Team." + args[0] + ".Upgrade") != null) {
                    removeArmorStand("upgrade", ss.getConfig().getArenaLoc("Team." + args[0] + ".Upgrade"), null);
                }
                createArmorStand(Language.getMsg(p, Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM).replace("{team}", teamm), p.getLocation(), null, "upgrade");
                ss.getConfig().saveArenaLoc("Team." + args[0] + ".Upgrade", p.getLocation());
                p.sendMessage(ss.getPrefix() + Language.getMsg(p, Messages.COMMAND_SETUP_UPGRADE_SET).replace("{team}", teamm));

                if (ss.getSetupType() == SetupType.ASSISTED) {
                    Bukkit.dispatchCommand(p, getParent().getName());
                }
            }
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

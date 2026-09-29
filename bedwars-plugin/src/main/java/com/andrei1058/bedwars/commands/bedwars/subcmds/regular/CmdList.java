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

package com.andrei1058.bedwars.commands.bedwars.subcmds.regular;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.api.server.SetupType;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.arena.SetupSession;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Objects;

import static com.andrei1058.bedwars.BedWars.*;
import static com.andrei1058.bedwars.api.language.Language.getList;

public class CmdList extends SubCommand {

    public CmdList(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(11);
        showInList(true);
        setDisplayInfo(Misc.msgHoverClick(Language.getMsg(null, Messages.COMMAND_LIST_DISPLAY).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()), Language.getMsg(null, Messages.COMMAND_LIST_DISPLAY_HOVER), "/" + getParent().getName() + " " + getSubCommandName(), ClickEvent.Action.RUN_COMMAND));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        if (SetupSession.isInSetupSession(p.getUniqueId())) {
            SetupSession ss = SetupSession.getSession(p.getUniqueId());
            Objects.requireNonNull(ss).getConfig().reload();

            boolean waitingSpawn = ss.getConfig().getYml().get("waiting.Loc") != null,
                    pos1 = ss.getConfig().getYml().get("waiting.Pos1") != null,
                    pos2 = ss.getConfig().getYml().get("waiting.Pos2") != null,
                    pos = pos1 && pos2;
            StringBuilder spawnNotSetNames = new StringBuilder();
            StringBuilder bedNotSet = new StringBuilder();
            StringBuilder shopNotSet = new StringBuilder();
            StringBuilder killDropsNotSet = new StringBuilder();
            StringBuilder upgradeNotSet = new StringBuilder();
            StringBuilder spawnNotSet = new StringBuilder();
            StringBuilder generatorNotSet = new StringBuilder();
            int teams = 0;

            if (ss.getConfig().getYml().get("Team") != null) {
                for (String team : ss.getConfig().getYml().getConfigurationSection("Team").getKeys(true)) {
                    if (ss.getConfig().getYml().get("Team." + team + ".Color") == null) continue;
                    ChatColor color = TeamColor.getChatColor(ss.getConfig().getYml().getString("Team." + team + ".Color"));
                    if (ss.getConfig().getYml().get("Team." + team + ".Spawn") == null) {
                        spawnNotSet.append(color).append("▋");
                        spawnNotSetNames.append(color).append(team).append(" ");
                    }
                    if (ss.getConfig().getYml().get("Team." + team + ".Bed") == null) {
                        bedNotSet.append(color).append("▋");
                    }
                    if (ss.getConfig().getYml().get("Team." + team + ".Shop") == null) {
                        shopNotSet.append(color).append("▋");
                    }
                    if (ss.getConfig().getYml().get("Team." + team + "." + ConfigPath.ARENA_TEAM_KILL_DROPS_LOC) == null) {
                        killDropsNotSet.append(color).append("▋");
                    }
                    if (ss.getConfig().getYml().get("Team." + team + ".Upgrade") == null) {
                        upgradeNotSet.append(color).append("▋");
                    }
                    if (ss.getConfig().getYml().get("Team." + team + ".Iron") == null || ss.getConfig().getYml().get("Team." + team + ".Gold") == null) {
                        generatorNotSet.append(color).append("▋");
                    }
                    teams++;
                }
            }
            int emGen = 0, dmGen = 0;
            if (ss.getConfig().getYml().get("generator.Emerald") != null) {
                emGen = ss.getConfig().getYml().getStringList("generator.Emerald").size();
            }
            if (ss.getConfig().getYml().get("generator.Diamond") != null) {
                dmGen = ss.getConfig().getYml().getStringList("generator.Diamond").size();
            }

            String notSet = Language.getMsg(p, Messages.COMMAND_LIST_NOT_SET);
            String set = Language.getMsg(p, Messages.COMMAND_LIST_SET);
            String allSet = Language.getMsg(p, Messages.COMMAND_LIST_ALL_SET);
            String posMsg, group = notSet;
            if (pos1 && !pos2) {
                posMsg = Language.getMsg(p, Messages.COMMAND_LIST_POS2_NOT_SET);
            } else if (!pos1 && pos2) {
                posMsg = Language.getMsg(p, Messages.COMMAND_LIST_POS1_NOT_SET);
            } else if (pos1) {
                posMsg = set;
            } else {
                posMsg = notSet + " " + Language.getMsg(p, Messages.COMMAND_LIST_OPTIONAL);
            }

            String g2 = ss.getConfig().getYml().getString("group");
            if (g2 != null) {
                if (!g2.equalsIgnoreCase("default")) {
                    group = ChatColor.GREEN + "(" + g2 + ")";
                }
            }

            int maxInTeam = ss.getConfig().getInt("maxInTeam");

            String remaining = Language.getMsg(p, Messages.COMMAND_LIST_REMAINING);
            String setWaitingSpawn = Language.getMsg(p, Messages.COMMAND_LIST_WAITING_SPAWN).replace("{dot}", ss.dot()).replace("{strike}", waitingSpawn ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", waitingSpawn ? set : notSet);
            String waitingPos = Language.getMsg(p, Messages.COMMAND_LIST_WAITING_POS).replace("{dot}", ss.dot()).replace("{strike}", pos ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", posMsg);
            String setSpawn = Language.getMsg(p, Messages.COMMAND_LIST_SET_SPAWN).replace("{dot}", ss.dot()).replace("{strike}", spawnNotSet.length() == 0 ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", spawnNotSet.length() == 0 ? allSet : remaining.replace("{remaining}", spawnNotSet.toString()));
            String setBed = Language.getMsg(p, Messages.COMMAND_LIST_SET_BED).replace("{dot}", ss.dot()).replace("{strike}", bedNotSet.length() == 0 ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", bedNotSet.length() == 0 ? allSet : remaining.replace("{remaining}", bedNotSet.toString()));
            String setShop = Language.getMsg(p, Messages.COMMAND_LIST_SET_SHOP).replace("{dot}", ss.dot()).replace("{strike}", shopNotSet.length() == 0 ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", shopNotSet.length() == 0 ? allSet : remaining.replace("{remaining}", shopNotSet.toString()));
            String setKillDrops = Language.getMsg(p, Messages.COMMAND_LIST_SET_KILL_DROPS).replace("{dot}", ss.dot()).replace("{strike}", killDropsNotSet.length() == 0 ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", killDropsNotSet.length() == 0 ? allSet : remaining.replace("{remaining}", killDropsNotSet.toString()));
            String setUpgrade = Language.getMsg(p, Messages.COMMAND_LIST_SET_UPGRADE).replace("{dot}", ss.dot()).replace("{strike}", upgradeNotSet.length() == 0 ? ChatColor.STRIKETHROUGH.toString() : "").replace("{status}", upgradeNotSet.length() == 0 ? allSet : remaining.replace("{remaining}", upgradeNotSet.toString()));
            String addGenerator = Language.getMsg(p, Messages.COMMAND_LIST_ADD_GENERATOR).replace("{dot}", ss.dot()).replace("{remaining}", generatorNotSet.length() == 0 ? "" : remaining.replace("{remaining}", generatorNotSet.toString()) + " ").replace("{iron}", String.valueOf(emGen)).replace("{gold}", String.valueOf(dmGen));
            String setSpectatorSpawn = Language.getMsg(p, Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN).replace("{dot}", ss.dot()).replace("{strike}", ss.getConfig().getYml().get(ConfigPath.ARENA_SPEC_LOC) == null ? "" : ChatColor.STRIKETHROUGH.toString()).replace("{status}", ss.getConfig().getYml().get(ConfigPath.ARENA_SPEC_LOC) == null ? notSet : set);

            s.sendMessage("");
            s.sendMessage(Language.getMsg(p, Messages.COMMAND_LIST_SETUP_HEADER).replace("{dot}", String.valueOf(com.andrei1058.bedwars.commands.bedwars.MainCommand.getDot())).replace("{plugin}", plugin.getDescription().getName()).replace("{version}", plugin.getDescription().getVersion()).replace("{world}", ss.getWorldName()));
            p.spigot().sendMessage(Misc.msgHoverClick(setWaitingSpawn, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_WAITING_SPAWN), "/" + getParent().getName() + " setWaitingSpawn", ss.getSetupType() == SetupType.ASSISTED ? ClickEvent.Action.RUN_COMMAND : ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(waitingPos, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_WAITING_POS), "/" + getParent().getName() + " waitingPos ", ClickEvent.Action.SUGGEST_COMMAND));
            if (ss.getSetupType() == SetupType.ADVANCED) {
                p.spigot().sendMessage(Misc.msgHoverClick(setSpectatorSpawn, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN), "/" + getParent().getName() + " setSpectSpawn", ClickEvent.Action.RUN_COMMAND));
            }
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_AUTO_CREATE_TEAMS).replace("{dot}", ss.dot()), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS), "/" + getParent().getName() + " autoCreateTeams", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_CREATE_TEAM).replace("{dot}", ss.dot()).replace("{teams}", String.valueOf(teams)), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_CREATE_TEAM), "/" + getParent().getName() + " createTeam ", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_REMOVE_TEAM).replace("{dot}", ss.dot()), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_REMOVE_TEAM), "/" + mainCmd + " removeTeam ", ClickEvent.Action.SUGGEST_COMMAND));

            p.spigot().sendMessage(Misc.msgHoverClick(setSpawn, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_SPAWN).replace("{spawnNames}", spawnNotSetNames.toString()), "/" + getParent().getName() + " setSpawn ", ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(setBed, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_BED), "/" + getParent().getName() + " setBed", ss.getSetupType() == SetupType.ASSISTED ? ClickEvent.Action.RUN_COMMAND : ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(setShop, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_SHOP), "/" + getParent().getName() + " setShop", ss.getSetupType() == SetupType.ASSISTED ? ClickEvent.Action.RUN_COMMAND : ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(setUpgrade, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_UPGRADE), "/" + getParent().getName() + " setUpgrade", ss.getSetupType() == SetupType.ASSISTED ? ClickEvent.Action.RUN_COMMAND : ClickEvent.Action.SUGGEST_COMMAND));
            if (ss.getSetupType() == SetupType.ADVANCED) {
                p.spigot().sendMessage(Misc.msgHoverClick(setKillDrops, Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS), "/" + getParent().getName() + " setKillDrops ", ClickEvent.Action.SUGGEST_COMMAND));
            }
            String genHover = Language.getMsg(p, ss.getSetupType() == SetupType.ADVANCED ? Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED : Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED).replace("{command}", getParent().getName());
            p.spigot().sendMessage(Misc.msgHoverClick(addGenerator, genHover, "/" + getParent().getName() + " addGenerator ", ss.getSetupType() == SetupType.ASSISTED ? ClickEvent.Action.RUN_COMMAND : ClickEvent.Action.SUGGEST_COMMAND));
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_REMOVE_GENERATOR).replace("{dot}", ss.dot()), genHover, "/" + getParent().getName() + " removeGenerator", ss.getSetupType() == SetupType.ASSISTED ? ClickEvent.Action.RUN_COMMAND : ClickEvent.Action.SUGGEST_COMMAND));
            if (ss.getSetupType() == SetupType.ADVANCED) {
                p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_SET_MAX_IN_TEAM).replace("{dot}", ss.dot()).replace("{size}", String.valueOf(maxInTeam)), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM), "/" + mainCmd + " setMaxInTeam ", ClickEvent.Action.SUGGEST_COMMAND));
                p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_ARENA_GROUP).replace("{dot}", ss.dot()).replace("{group}", group), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_ARENA_GROUP), "/" + mainCmd + " arenaGroup ", ClickEvent.Action.SUGGEST_COMMAND));
            } else {
                p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_SET_TYPE).replace("{dot}", ss.dot()).replace("{group}", group), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SET_TYPE), "/" + getParent().getName() + " setType", ClickEvent.Action.RUN_COMMAND));
            }
            p.spigot().sendMessage(Misc.msgHoverClick(Language.getMsg(p, Messages.COMMAND_LIST_SAVE).replace("{dot}", ss.dot()), Language.getMsg(p, Messages.COMMAND_LIST_HOVER_SAVE), "/" + getParent().getName() + " save", ClickEvent.Action.SUGGEST_COMMAND));
        } else {
            TextComponent credits = new TextComponent(Language.getMsg(p, Messages.COMMAND_LIST_CREDITS).replace("{dot}", String.valueOf(com.andrei1058.bedwars.commands.bedwars.MainCommand.getDot())).replace("{plugin}", plugin.getName()).replace("{version}", plugin.getDescription().getVersion()));
            credits.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, link));
            credits.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Language.getMsg(p, Messages.COMMAND_LIST_CREDITS_HOVER).replace("{arenaColor}", Arena.getArenas().isEmpty() ? ChatColor.RED.toString() : ChatColor.GREEN.toString()).replace("{arenas}", String.valueOf(Arena.getArenas().size()))).create()));
            ((Player) s).spigot().sendMessage(credits);
            for (String string : getList((Player) s, Messages.COMMAND_MAIN)) {
                s.sendMessage(string);
            }
        }
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return null;
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {

        if (s instanceof Player) {
            Player p = (Player) s;
            if (Arena.isInArena(p)) return false;

            if (SetupSession.isInSetupSession(p.getUniqueId())) return false;
        }

        return hasPermission(s);
    }
}

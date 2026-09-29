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
// This Language file was created by Monzu77, contact on discord for any questions regarding this language file. Dicsord: Itsmemonzu#6732
package com.andrei1058.bedwars.language;


import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.andrei1058.bedwars.BedWars.mainCmd;

public class Bangla extends Language {
    public Bangla() {
        super(BedWars.plugin, "bd");

        YamlConfiguration yml = getYml();
        yml.options().copyDefaults(true);
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Bangla");

        // this must stay here
        // move message to new path
        if (yml.get("player-die-knocked-regular") != null && yml.get(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL) == null) {
            yml.set(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, yml.getString("player-die-knocked-regular"));
            yml.set("player-die-knocked-regular", null);
        }
        if (yml.get("player-die-knocked-final") != null && yml.get(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL) == null) {
            yml.set(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, yml.getString("player-die-knocked-final"));
            yml.set("player-die-knocked-final", null);
        }

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(dorshok)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "server.properties-e spawn-protection chalu ache; eti BedWars arenagulike probhabit korte pare. Eti 0 kora banchhoniyo.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "&c[BedWars1058] Multiverse-Core paowa geche! Eti soran othoba nishchit korun je eti BedWars map poriborton korbe na!");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "&aBukkit worlds container theke {world} load kora hocche.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "&aNotun void map toiri kora hocche: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7Baboharkari ID: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7Download ID: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eBortoman arena-y barta pathan");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fBortoman arena-y shob khelowarke barta pathan.\n&fBabohar: /{command} echo <barta>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperator&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eNirbachito arena-y barta pathan");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fNirbachito arena-y shob khelowarke barta pathan.\n&fBabohar: /{command} echoto <arena> <barta>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eShob arena-y barta pathan");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fShob arena-r khelowarke barta pathan.\n&fBabohar: /{command} echoall <barta>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cBabohar: /bw echo <barta>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&a{arena} arena-y barta pathano hoyeche");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cApni kono arena-y nei.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cBabohar: /bw echoto <arena> <barta>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&a{arena} arena-y barta pathano hoyeche");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cBabohar: /bw echoall <barta>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aShob arena-y barta pathano hoyeche.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena paowa jayni: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cEi komandti shudhu khelowarder jonno.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aApni prostut!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aApni ar prostut non.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aShob khelowar prostut! Countdown 10 second-e komano hoyeche!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aProstuti porikkha chalu kora hoyeche.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aProstuti porikkha bondho kora hoyeche.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cEi komandti bondho.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cApni khelay nei!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cEkhon ei komandti babohar korte parben na.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cDorshokra ei komandti babohar korte parben na.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aProstut");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cOprostut");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Prostut hote dan klik korun!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Prostuti batil korte dan klik korun!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Khela shuru korar jonno jotesto khelowar nei!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aVanilla dorshok mode chalu kora hoyeche.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aSadharon dorshok mode chalu kora hoyeche.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cApnar inventory purno!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aPoridhan kora hoyeche!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Upolopdho Bhasa:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Babohar: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cEi bhasa biddoman nei!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aBhasa bodle gelo!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cApni match er vitore language change korte parben na.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Babohar: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&c{name} Ei name e kono arena ba arena group nei.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cEi arena ti purno!\n&aAro sujoger jonno donate korar bibechona korun.");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cEi muhurte kono arena upolobdho nei. ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cDukkhito kintu ei arena ti purno. \n&cArena ti Staff ebong onno donorder diye purno.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cEi arena ti te jog dite apnar dol onek boro :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cShudhu doler neta arena nirbachon korte parben.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &ejog diyechen! (&b{on}&e/&b{max}&e)");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Apni ekhon dekhchen §9{arena}§6.\n{prefix}§eApni §c/leave§e diye je kono somoy ber hote parben.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cEi arena te dorshokder onumoti nei!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cKhelowarke paowa jayni!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cEi khelowar kono BedWars arena te nei!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cEi khelowarer arena ekhono shuru hoyni!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cBabohar: /bw tp <username>");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cKono rejoin korar moto arena nei!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cApni ar arena ti te abar jog dite parben na. Khela shesh hoyeche othoba apnar bichana bhanga hoyeche.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eApni &a{arena} arena te jog dicchen&e!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &eabar jog diyechen!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cApni ei arena te nei!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &eberiye gelen!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cApni khelay eti korte parben na.");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cKomandti nei othoba eti baboharer onumoti nei!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aDoler komand:",
                "&e/party help &7- &bEi sahajjo barta dekhan",
                "&e/party invite <player> &7- &bKhelowarke dole amontron korun",
                "&e/party leave &7- &bDol theke beriye jan",
                "&e/party remove <player> &7- &bKhelowarke dol theke soran",
                "&e/party info &7- &bDoler sodosso o malik dekhan",
                "&e/party promote <player> &7- &bDoler malikana din",
                "&e/party accept <player> &7- &bDole jogdaner onumoti din",
                "&e/party disband &7- &bDol bhenghe din")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eBabohar: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eonline nei!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&7{player} &e party invite dewa holo&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &eApnake dole amontron korechen! &o&7(Jog dite klik korun)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cApni nijeke invite korte parben na!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cGrohon korar moto kono doler onurodh nei");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eApni itimoddhe ekti party te achen!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cSudhu matro party malik eti korte parben!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eBabohar: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &eparty te jog dilen!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cApni ekti party te nei!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cApni doler malik hoye ber hote parben na!\n&b/party disband &e babohar korun!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eparty theke biday nilen!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eParty disband hoye giyeche!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Babohar: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &eke dol theke sorano hoyeche,");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &eapnar dole nei!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&e{player}-ke sofolbhabe doler malik kora hoyeche");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eApnake doler malik kora hoyeche");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player}-ke doler malik kora hoyeche");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eDoler malik: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eDoler sodosso:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Apni khelchen na!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Countdown chhoto kora hoyeche!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Apni arena ti jor kore shuru korte parben na.\n§7VIP boishishto pete donate korun.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cApni ekhono eti korte parben na! {seconds} opekkha korun!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cDukkhito, ekjon donor arena-y jog deway apnake ber kore dewa hoyeche.\n&aAro boishishtor jonno donate korar bibechona korun. &7&o(klik)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cJotesto khelowar nei! Countdown bondho hoye gelo!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eApni je arena-y jog diyechilen ta abar shuru hocche.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cKhela cholche");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Abar shuru hocche");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Opekkha §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Shuru hocche §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Jog dite klik korun!");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Obostha: {status}", "&7Khelowar: &f{on}&7/&f{max}", "&7Dhoron: &a{group}", "", "&aJog dite bam klik korun", "&eDekhতে dan klik korun."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eKhela &6{time} &esecond-e shuru hobe!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cAro khelowarer jonno opekkha korchi..");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aSHURU");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l    আপনার বিছানা রক্ষা করুন এবং শত্রুদের বিছানা ধ্বংস করুন।",
                "&e&l      সম্পদ সংগ্রহ করে নিজের ও দলের উন্নতি করুন",
                "&e&l   উৎপাদক থেকে লোহা, সোনা, পান্না ও হীরা সংগ্রহ করে",
                "&e&l             শক্তিশালী উন্নতি অর্জন করুন।", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));

        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cDukkhito, ei muhurte arena-y jog dite parben na. Dekhte dan klik korun!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cDukkhito, ei muhurte arena dekhte parben na. Jog dite bam klik korun!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cDukkhito, BedWarsProxy babohar kore arena-y jog dite hobe. \n&eArena setup korte bw.setup permission niye sorasori server-e jog din!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Khelowar dekhun");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Shastho: &f{health}%", "&7Khudha: &f{food}", "", "&7Dekhতে bam klik korun"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lLobby-te phire jan");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Lobby chharte dan klik korun!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&a{player}-ke dekha hocche");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cBero hote SNEAK chapun");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eDorshok mode theke beriye jacchi");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cDoler malik beriye jaoyay dol bhenghe dewa hoyeche!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eStôr &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamond");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEmerald");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&e{seconds} &esecond-e asbe");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} generator &c{tier} &estôr-e unnoto hoyeche");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[SHADHARON] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[DORSHAK] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aShastho"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 APNAR DOL");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fOnusoron: {team} &f- Durotto: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[SHADHARON]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[DORSHAK]");
        yml.addDefault(Messages.MEANING_FULL, "Purno");
        yml.addDefault(Messages.MEANING_SHOUT, "Shadharon");
        yml.addDefault(Messages.MEANING_NOBODY, "Keu noy");
        yml.addDefault(Messages.MEANING_NEVER, "Kokhono noy");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Iron");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Iron");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Gold");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Gold");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Emerald");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Emerald");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamond");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamond");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cApni ekhane block boshate parben na!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cApni shudhu khelowarer boshano block bhangte parben!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cApni nijer bichana bhangte parben na!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lBICHANA DHONGSHO > {PlayerColor}{PlayerName} {TeamColor}{TeamName} &7bichana dhongsho korechen!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cBIChANA DHONGSHO HOYE GECHE!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fApni ar abar jonmo niben na!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lBICHANA DHONGSHO > {PlayerColor}{PlayerName} &7apnar bichana dhongsho korechen!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cEi dolti bad poreche, tai ei chest khulte parben na!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cKhoti pawar karone apni ar odrishyo non!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7shunnotay pore gelen.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7shunnotay pore gelen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{KillerColor}{KillerName}&7 {PlayerColor}{PlayerName}-ke &7shunnotay phele diyechen.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{KillerColor}{KillerName}&7 {PlayerColor}{PlayerName}-ke &7shunnotay phele diyechen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er sathe lorai-er somoy songjog bichchhinno korechen.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er sathe lorai-er somoy songjog bichchhinno korechen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{KillerColor}{KillerName} {PlayerColor}{PlayerName}-ke &7dhakka diyechen.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{KillerColor}{KillerName} {PlayerColor}{PlayerName}-ke &7dhakka diyechen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er boma-y &7shunnotay pore gelen.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er boma-y &7shunnotay pore gelen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7bomar karone shunnotay pore gelen.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7bomar karone shunnotay pore gelen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er hate &7nihoto hoyechen.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er hate &7nihoto hoyechen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7nihoto hoyechen.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7nihoto hoyechen. &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er &7tir-er aghate porechen!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName}-er &7tir-er aghate porechen! &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}-er BedBug-er karone &7aghato hoyechen!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}-er BedBug-er karone &7aghato hoyechen! &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}-er Iron Golem-er karone &7aghato hoyechen!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}-er Iron Golem-er karone &7aghato hoyechen! &b&lCHURANTO HOTTYA!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cAPNI MORLEN!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eApni &c{time} &esecond-e abar jonmo niben");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eApni &c{time} &esecond-e abar jonmo niben");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aAPNI ABAR JONMO NILEN!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cApni bad porechen!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName}-er &7kache &c{amount} &7HP &7ache!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lKHELA SHESH!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lBIJOY!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &ateam khela jitese!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("", "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &lProthom hottyakari &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                        &lDitiyo hottyakari &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                        &lTritiyo hottyakari &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "", "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lApnar bichana rokkha korun!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lApnar bichana dhongsho hoyeche!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bDOLER UNNOTI,&e&lDAN KLIK");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bEKOK UNNOTI,&e&lDAN KLIK");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bDOLER DOKAN,&e&lDAN KLIK");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bITEM DOKAN,&e&lDAN KLIK");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lDOL BAD > {TeamColor}{TeamName} &cdolti bad poreche!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cBichana dhongsho");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamond II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamond III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fAkoshmik mrityu");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEmerald II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEmerald III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Khela shesh");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cBICHANA DHONGSHO HOYE GECHE!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fShob doler bichana dhongsho hoyeche!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lShob doler bichana dhongsho hoyeche!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cAkoshmik mrityu");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cAKOSHMIK MRITYU: &6&b{TeamDragons} {TeamColor}{TeamName} dragon esheche!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} BedWars oviggota peyechhen (Khelar somoy).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} BedWars oviggota peyechhen (Khela joy).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} BedWars oviggota peyechhen (Doler sahajjo).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} BedWars oviggota peyechhen (Bichana dhongsho).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} BedWars oviggota peyechhen (Sadharon hottya).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} BedWars oviggota peyechhen (Churanto hottya).");
        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} koyen peyechhen (Khelar somoy).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} koyen peyechhen (Khela joy).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} koyen peyechhen (Doler sahajjo).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} koyen peyechhen (Bichana dhongsho).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} koyen peyechhen (Churanto hottya).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} koyen peyechhen (Sadharon hottya).");

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&ePorisongkhan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fApnar porisongkhan dekhte dan klik korun!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eArena nirbachon");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fArena nirbachon korte dan klik korun!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eHub-e phire jan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBedWars chharte dan klik korun!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&ePorisongkhan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fApnar porisongkhan dekhte dan klik korun!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eLobby-te phire jan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fArena chharte dan klik korun!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eKhelowar dekhun");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eLobby-te phire jan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fArena chharte dan klik korun!"));
        /* save default items messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8{player}-er porisongkhan");
        addDefaultStatsMsg(yml, "wins", "&6Joy", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Porajoy", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Hottya", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Mrityu", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Churanto hottya", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Churanto mrityu", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Dhongsito bichana", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Prothom khela", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Shesh khela", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Khela hoyeche", "&f{gamesPlayed}");


        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fApnar stor: {level}",
                "",
                "&fOgrogoti: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fKoyen: &a{money}" ,
                "",
                "&fMot joy: &a{wins}",
                "&fMot hottya: &a{kills}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fManch: &a{map}",
                "",
                "&fKhelowar: &a{on}/{max}",
                "",
                "&fOpekkha korche,&fOpekkha korche.,&fOpekkha korche..,&fOpekkha korche...",
                "",
                "&fDhôrôn: &a{group}",
                "&fSongskoron: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Dorshon korchen",
                "&fManch: &a{map}",
                "",
                "&fKhelowar: &a{on}/{max}",
                "",
                "&fOpekkha korche,&fOpekkha korche.,&fOpekkha korche..,&fOpekkha korche...",
                "",
                "&fDhôrôn: &a{group}",
                "&fSongskoron: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fManch: &a{map}",
                "",
                "&fKhelowar: &a{on}/{max}",
                "",
                "&f&ashuru hobe &a{time}s e",
                "",
                "§fDhôrôn: &a{group}",
                "&fSongskoron: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Dorshon korchen",
                "&fManch: &a{map}",
                "",
                "&fKhelowar: &a{on}/{max}",
                "",
                "&f&ashuru hobe &a{time}s e",
                "",
                "§fDhôrôn: &a{group}",
                "&fSongskoron: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&6Bijoyi: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lShirsho hottya:",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_WIN1, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&6Bijoyi: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lShirsho hottya:",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_WIN2, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&6Bijoyi: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lShirsho hottya:",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_LOSER, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&6Bijoyi: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lShirsho hottya:",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                "",
                "&e{serverIp}")
        );


        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "Doubles"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "Doubles"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "Doubles"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fHottya: &a{kills}",
                "&fChuranto hottya: &a{finalKills}",
                "&fDhongsito bichana: &a{beds}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fHottya: &a{kills}",
                "&fChuranto hottya: &a{finalKills}",
                "&fDhongsito bichana: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fHottya: &a{kills}",
                "&fChuranto hottya: &a{finalKills}",
                "&fDhongsito bichana: &a{beds}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7{spectatorTarget}-ke dekha hocche",
                "&f{nextEvent} &a{time}-e",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fHottya: &a{kills}",
                "&fChuranto hottya: &a{finalKills}",
                "&fDhongsito bichana: &a{beds}",
                "",
                "&e{serverIp}")
        );
        // End of Sidebar

        // start of TAB
        // main lobby tab format
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_FOOTER, List.of(
                "",
                "&fEi lobby-te khelowar: {on}",
                "{poweredBy}-er dara porichalito,&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_PREFIX, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_SUFFIX, List.of(" {level}"));
        // player waiting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_FOOTER, List.of(
                "",
                "Aro khelowarer jonno opekkha,Aro khelowarer jonno opekkha.,Aro khelowarer jonno opekkha.., Aro khelowarer jonno opekkha...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX, List.of(" {level}"));
        // spectator waiting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_FOOTER_SPEC, List.of(
                "",
                "&7&oApni khela dekhchen",
                "Aro khelowarer jonno opekkha,Aro khelowarer jonno opekkha.,Aro khelowarer jonno opekkha.., Aro khelowarer jonno opekkha...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&f&a{time} &fsecond-e shuru hobe,&f&a{time} &fsecond-e shuru hobe.,&f&a{time} &fsecond-e shuru hobe..,&f&a{time} &fsecond-e shuru hobe...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                "",
                "&7&oআপনি দর্শক হিসেবে দেখছেন"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&f&a{time} &fsecond-e shuru hobe,&f&a{time} &fsecond-e shuru hobe.,&f&a{time} &fsecond-e shuru hobe..,&f&a{time} &fsecond-e shuru hobe...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                "",
                "{time}-e {nextEvent}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fApni {teamColor}{teamName} dole khelchen",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                "",
                "{time}-e {nextEvent}",
                "",
                "&7&oApni bad porechen,&f&oApni bad porechen"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fApni {teamColor}{teamName} dole khelechen",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oDorshok "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oBad poreche {teamColor}&o{teamName}", " {teamColor}&oBad poreche {vPrefix}", "{teamColor}&oBad poreche {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                "",
                "{time}-e {nextEvent}",
                "",
                "&7&oআপনি দর্শক হিসেবে দেখছেন"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oDorshok "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lApnar dol khela jitese! &6⭐",
                "&7{date}", "&7Manch: &f{map} &7Dhoron: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lApni {teamColor}&l{teamName} dole jitেছেন&6&l!,&6&lApni {teamColor}&l{teamName} dole jitেছেন&6&l!,&f&lApni {teamColor}&l{teamName} dole jitেছেন&f&l!",
                "&7Ei khelay porisongkhan",
                "&eHottya: &f{kills} &8| &eChuranto hottya: &f{finalKills} &8| &eDhongsito bichana: &f{beds} &8| &eMrityu: &f{deaths},&eHottya: &7{kills} &8| &eChuranto hottya: &7{finalKills} &8| &eDhongsito bichana: &7{beds} &8| &eMrityu: &7{deaths}",
                "",
                "&fKhelar jonno dhonnobad, {player}!",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} dol khela jitese! &6⭐",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lApni {teamColor}&l{teamName} dole jitেছেন&6&l!,&6&lApni {teamColor}&l{teamName} dole jitেছেন&6&l!,&f&lApni {teamColor}&l{teamName} dole jitেছেন&f&l!",
                "&7Ei khelay porisongkhan",
                "&eHottya: &f{kills} &8| &eChuranto hottya: &f{finalKills} &8| &eDhongsito bichana: &f{beds} &8| &eMrityu: &f{deaths},&eHottya: &7{kills} &8| &eChuranto hottya: &7{finalKills} &8| &eDhongsito bichana: &7{beds} &8| &eMrityu: &7{deaths}",

                "&fKhelar jonno dhonnobad, {player}!",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oBad poreche", " {level}", " &c&oBad poreche"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} dol khela jitese! &6⭐",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fApni {teamColor}{teamName} doler kache herechen",
                "&7Ei khelay porisongkhan",
                "&eHottya: &f{kills} &8| &eChuranto hottya: &f{finalKills} &8| &eDhongsito bichana: &f{beds} &8| &eMrityu: &f{deaths},&eHottya: &7{kills} &8| &eChuranto hottya: &7{finalKills} &8| &eDhongsito bichana: &7{beds} &8| &eMrityu: &7{deaths}",
                "&fKhelar jonno dhonnobad, {player}!",
                "&a{serverIp}",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oBad poreche", " {level}", " &c&oBad poreche"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} dol khela jitese! &6⭐",
                "&7{date}",
                "&7Manch: &f{map} &7Dhoron: &f{group}",
                "",
                "&fKhelar jonno dhonnobad, {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy}-er dara porichalito",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oDorshok "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Druto kena");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Druto kenay jog hocche...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cApnar kache porjapto {currency} ney! Apnar aro {amount} beshi lagbe!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aApni &6{item} &akinlen.");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cApni eti agei kinechen!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Bibhag");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Samogri"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bDruto kena");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cKhali slot!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Eti ekti druto kena slot!", "&7Kono item add korte", "&7Ekhane &bSneak klik &7korun."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eKinte klik korun!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cApnar kache porjaptop {currency} ney");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aSorbochcho!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&7Druto kenay jog korte &bSneak klik &7korun");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&7Druto kena theke sorate &bSneak klik &7korun!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Block", "&aBlock", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Uল", Arrays.asList("&7Khoroch: &f{cost} {currency}", "", "&7Sেতু toirir jonno darun", "&7dweep. Apnar doler rong hobe",
                "&7", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Shokto mati", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Bichana rokkhar moulik block.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Bisforon-protirodhi kach", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Bisforone surokkhito.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Shesh pathor", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Bichana rokkhar shokto block.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Mochan", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Gache atke thaka beral bachate", "&7sahajjo kore.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidian", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Bichanar chorom surokkha.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Kath", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Bichana rokkhar shokto block", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Kachakachi", "&aKachakachi", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Pathorer torbari", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Lohar torbari", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Diamond torbari", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Lathi (Dure thela I)", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Bormo", "&aBormo", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Sthayi chainmail bormo", Arrays.asList("&7Khoroch: {cost} {currency}",
                "", "&7Chainmail pant o boot", "&7ja niye shobshomoy jonmo neben", "&7", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Sthayi lohar bormo", Arrays.asList("&7Khoroch: {cost} {currency}",
                "", "&7Lohar pant o boot ja", "&7niye shobshomoy jonmo neben.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Sthayi diamond bormo", Arrays.asList("&7Khoroch: {cost} {currency}",
                "", "&7Diamond pant o boot ja", "&7niye shobshomoy jonmo neben.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Jontro", "&aJontro", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Sthayi kachi", Arrays.asList("&7Khoroch: {cost} {currency}",
                "", "&7Uler theke mukti pete darun. Apni", "&7shobshomoy ei kachi niye jonmaben.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kodal {tier}", Arrays.asList("&7Khoroch: {cost} {currency}", "&7Stor: &e{tier}",
                "", "&7Eti unnoyonযোগ্য samogri.", "&7Mrityur por 1ti stor harabe.", "&7mrityu!", "", "&7Apni sthayibhabe", "&7shobcheye kom store abar jonmo neben.", "", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kuthar {tier}", Arrays.asList("&7Khoroch: {cost} {currency}", "&7Stor: &e{tier}",
                "", "&7Eti unnoyonযোগ্য samogri.", "&7Mrityur por 1ti stor harabe.", "&7mrityu!", "", "&7Apni sthayibhabe", "&7shobcheye kom store abar jonmo neben.", "", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Durborti", "&aDurborti", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Tir", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhonuk", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhonuk (Power I)", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhonuk (Power I, Punch I)", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Oushodh", "&aOushodh", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Goti {level} Oushodh ({duration} second)", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Laf {level} Oushodh ({duration} second)", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Odrishyo Oushodh ({duration} second)", Arrays.asList("&7Khoroch: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Upokoron", "&aUpokoron", Collections.singletonList("&eDekhতে klik korun!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sonar apel", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Shorbotom niramoy.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}BedBug", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Jekhane tusharball pore sekhane",
                "&7silverfish toiri kore shotruder", "&7bivroto kore. 15 second thake.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Shopno rokkhak", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Iron Golem apnar ghor rokkha korte",
                "&7sahajjo kore. 4 minute thake.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Aguner gola", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Chalanor jonno dan klik korun! Darun",
                "&7patla setur shotruder dure", "&7soriye dite", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Sathe sathe jole othe, bisforoner",
                "&7jonno upojukto!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender mukta", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Shotru ghati akromoner drutotomo upay",
                "&7ghati.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Joler balti", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Kache asa shotruder dhir korte darun",
                "&7shotru. Echaro rokkha kore", "&7TNT theke.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Setu dim", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Ei dim nikkheper pore",
                "&7ekti setu toiri kore.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Jadukar dudh", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Khawar por 60 second fand",
                "&7chalu howa eray.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Spanj", Arrays.asList("&7Khoroch: {cost} {currency}", "", "&7Pani shoshar jonno darun.",
                "", "{quick_buy}", "{buy_status}"));

        //
        yml.addDefault(Messages.MEANING_NO_TRAP, "Kono fand nei!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Khoroch: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Kinte klik korun!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Apnar kache porjapto {currency} ney");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cABODDHO");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}MUKTO");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} &6{upgradeName} &akinlen.");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Lohar karkhana");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Apnar dwipe sompod utpadon baray", "&7", "", "{tier_1_color}Stor 1: +50% sompod, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Stor 2: +100% sompod, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Stor 3: panna utpadon, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Stor 4: +200% sompod, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Sonar karkhana");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Pannar karkhana");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Gola karkhana");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eEkti fand kinun");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Kena fand", "&7dan dike sariboddho hobe.", "", "&eDekhতে klik korun!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Dharoal torbari");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Apnar dol sthayibhabe", "&7shob torbari o kuthare", "&7Dharoal I pay!", "", "{tier_1_color}Khoroch: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Shokto bormo I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Apnar dol sthayibhabe shob bormay", "&7Protirodh pay!", "", "{tier_1_color}Stor 1: Protirodh I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Stor 2: Protirodh II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Stor 3: Protirodh III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Stor 4: Protirodh IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Shokto bormo II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Shokto bormo III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Shokto bormo IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Pagol khoni I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Apnar doler shob khelowar", "&7sthayi druto-kaj paben.", "", "{tier_1_color}Stor 1: Druto-kaj I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Stor 2: Druto-kaj II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Pagol khoni II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Aroggo khetro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Apnar ghorer charpashe", "&7punorujjibon khetro toiri kore!", "", "{tier_1_color}Khoroch: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Dragon shokti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Deathmatch-e apnar dole", "&7ekti-r bodole 2ti dragon thakbe!", "", "{tier_1_color}Khoroch: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Kena jay");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Fander sari"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Fand #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Prothom shotru je asbe", "&7apnar ghore dhukle chalu korbe", "&7ei fand!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7Fand kinle eti", "&7ekhane sariboddho hobe. Khoroch", "&7nirvor korbe", "&7sarite thaka fander upor.", "", "&7Porer fand: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Fand #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Ditiyo shotru je asbe", "&7apnar ghore dhukle chalu korbe", "&7ei fand!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7Fand kinle eti", "&7ekhane sariboddho hobe. Khoroch", "&7nirvor korbe", "&7sarite thaka fander upor.", "", "&7Porer fand: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Fand #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Tritiyo shotru je asbe", "&7apnar ghore dhukle chalu korbe", "&7ei fand!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7Fand kinle eti", "&7ekhane sariboddho hobe. Khoroch", "&7nirvor korbe", "&7sarite thaka fander upor.", "", "&7Porer fand: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Eti ekti fand!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Ondhotto o dhirgota dey", "&75 second-er jonno.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Palta-akromon fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Kachakachi mitroder 15 second-er jonno Druto-kaj I dey", "&7", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Sotorkota fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Odrishyo khelowarder prokash kore", "&7tader nam o dol shoho.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Khoni-klanti fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&710 second-er jonno khoni-klanti dey", "&7second.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aPichhone");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7দলের উন্নতিতে ফিরে যান"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Ekti fand sarite din");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cFander sari purno!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} chalu hoyeche!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cFAND CHALU!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fApnar {trap} chalu hoyeche!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&l{color}&l{team} doler &7&l{player} &c&l-er dara sotorkota fand chalu!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARM!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&f{color}{team} doler dara sotorkota fand chalu!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNaam set kora hoyni");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cLore set kora hoyni"));
yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7অ্যারেনা {arena} বিদ্যমান নেই!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} শ্রেণিতে যুক্ত করা হয়েছে: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7অ্যারেনার শ্রেণি তৈরি হয়েছে!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "অ্যারেনার শ্রেণি তৈরি করুন। আরও বিস্তারিত আমাদের wiki-তে।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fডিফল্ট");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7অ্যারেনার শ্রেণি মুছে ফেলা হয়েছে!");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eবিস্তারিত দেখতে ক্লিক করুন");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fঅ্যারেনার শ্রেণি পরিচালনা করুন।");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7এই শ্রেণিটি ইতিমধ্যে রয়েছে!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7উপলব্ধ অ্যারেনা শ্রেণি:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "উপলব্ধ শ্রেণি দেখুন।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7এই শ্রেণিটি বিদ্যমান নেই!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "অ্যারেনার শ্রেণি সরান। আরও বিস্তারিত আমাদের wiki-তে।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "অ্যারেনার শ্রেণি নির্ধারণ করুন। আরও বিস্তারিত আমাদের wiki-তে।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7এই নামে কোনো শ্রেণি নেই: {group}");
yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} নির্ধারিত)");
yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fউপলব্ধ অ্যারেনা দেখুন");
yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cদেখানোর মতো কোনো অ্যারেনা নেই।");
yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fWl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 চালু করা খেলা: \n ");
yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7পরের পৃষ্ঠার জন্য /§a{command} arenaList {page}§7 লিখুন।");
yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7ব্যবহার: §o/{command} {subcommand} <mapName>");
yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7আপনি আর ব্লক বসাতে বা ভাঙতে পারবেন না!");
yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §eনির্মাণের অনুমতি");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fনির্মাণের অনুমতি চালু বা বন্ধ করুন।\n§fএতে ব্লক ভাঙতে বা বসাতে পারবেন।");
yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7এখন আপনি ব্লক বসাতে ও ভাঙতে পারবেন।");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7মানচিত্রের বিন্যাস নকল করার সময় ত্রুটি ঘটেছে। কনসোল দেখুন।");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7প্রথমে {arena} বন্ধ করুন!");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fবিদ্যমান অ্যারেনার অনুলিপি তৈরি করুন।");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} ইতিমধ্যে বিদ্যমান!");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7হয়ে গেছে :D.");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7ব্যবহার: §o/{command} {subcommand} <mapName> <newArena>");
yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7নিশ্চিত করতে আবার লিখুন।");
yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fমানচিত্র ও এর বিন্যাস মুছে ফেলুন।");
yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7এই অ্যারেনাটি বিদ্যমান নেই!");
yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} মুছে ফেলা হয়েছে!");
yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7ব্যবহার: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} নামে কোনো জগতের ডিরেক্টরি নেই!");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7এই অ্যারেনাটি ইতিমধ্যে বন্ধ!");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fএকটি অ্যারেনা বন্ধ করুন।\nবন্ধ করার আগে এখান থেকে খেলোয়াড়দের\n§fসরিয়ে দেওয়া হবে।");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7এই অ্যারেনায় খেলা চলছে, খেলা শেষ হওয়ার পর এটি বন্ধ করুন!");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7অ্যারেনা বন্ধ করা হচ্ছে...");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7এই অ্যারেনাটি ইতিমধ্যে চালু!");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fএকটি অ্যারেনা চালু করুন।");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7এই অ্যারেনাটি ইতিমধ্যে চালুর অপেক্ষমাণ সারিতে আছে!");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7অ্যারেনা চালু করা হচ্ছে...");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7ব্যবহার: §o/{command} enableRotation <mapName>");
yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eবিস্তারিত দেখতে ক্লিক করুন");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fখেলোয়াড়ের স্তর পরিচালনা করুন।");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cপরিমাণ অবশ্যই পূর্ণসংখ্যা হতে হবে!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cস্তর অবশ্যই পূর্ণসংখ্যা হতে হবে!");
yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7খেলোয়াড় পাওয়া যায়নি!");
yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7পরিবর্তনটি দেখতে খেলোয়াড়কে আবার যোগ দিতে হতে পারে।");
yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "একজন খেলোয়াড়ের স্তর নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7{player}-এর স্তর নির্ধারণ করা হয়েছে: {level}");
yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7ব্যবহার: /bw level setLevel §o<player> <level>");
yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "একজন খেলোয়াড়কে অভিজ্ঞতা দিন।");
yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{player}-কে {amount} xp দেওয়া হয়েছে");
yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7ব্যবহার: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "ব্যবহার করতে ক্লিক করুন।");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7ব্যবহার: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7এই অ্যারেনার দলের খেলোয়াড়সংখ্যা দেখাতে §e{players} §7ব্যবহার করতে পারেন§7।");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bনির্ধারণ করা হয়েছে!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §eযোগদানের NPC তৈরি করুন");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fযোগদানের NPC তৈরি করুন  \n§fআরও বিস্তারিতের জন্য ক্লিক করুন।");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fযোগদানের NPC তৈরি করতে এই নির্দেশ ব্যবহার করুন।\n§fনির্দেশের গঠন দেখতে ক্লিক করুন।");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7ব্যবহার: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fসরাতে NPC-টির সামনে দাঁড়ান।");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7ব্যবহার: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bকাছাকাছি কোনো NPC নেই।");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bএখনও কোনো NPC নির্ধারিত নেই!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bলক্ষ্য NPC সরিয়ে ফেলা হয়েছে!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bলক্ষ্য শ্রেণি: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7অ্যারেনার বিন্যাস: {config} পুনরায় লোড হয়েছে!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} পুনরায় লোড হয়েছে!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §eবার্তা পুনরায় লোড করুন");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fবার্তা পুনরায় লোড করুন।\n§cসুপারিশ করা হয় না!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} পুনরায় লোড হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7আপনি ইতিমধ্যে একটি প্রস্তুতি অধিবেশনে আছেন!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7-তে বড় হাতের অক্ষর থাকা চলবে না! আপনার ডিরেক্টরির নাম দিন: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7প্রথমে এটি বন্ধ করুন!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fঅ্যারেনা তৈরি বা সম্পাদনা করুন।\nঅ্যারেনার নামে '_' এবং '-' দেখানো হবে না।");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena}-তে এই চিহ্ন থাকা চলবে না: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7ব্যবহার: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lএখানে ক্লিক করে পাওয়া দল তৈরি করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fপাওয়া দল তৈরি করতে ক্লিক করুন!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lনতুন দল পাওয়া গেছে:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7কোনো নতুন দল পাওয়া যায়নি।\n§6 ▪ §7ম্যানুয়ালি দল তৈরি করুন: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7দল খোঁজা হচ্ছে। এতে বিলম্ব হতে পারে।");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7সময় শেষ। দল খুঁজতে আবার লিখুন।");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fখেলা শুরু হলে অপেক্ষাকক্ষ অদৃশ্য করতে চাইলে,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lঅপেক্ষাকক্ষ সরানো:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7এই ধাপটি ঐচ্ছিক। এড়িয়ে যেতে §6/{command} দিন");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fWorldEdit-এর নির্বাচনের মতো নিচের নির্দেশগুলো ব্যবহার করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "উপলব্ধ দল: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6বিছানা নির্ধারিত");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "একটি দলের বিছানা যোগ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "{team}-এর জন্য বিছানা নির্ধারিত হয়েছে");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§a{team}-এর জন্য বিছানা নির্ধারিত হয়েছে");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fএকটি দলের বিছানা নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cএই নির্দেশ ব্যবহারের সময় আপনাকে বিছানার উপর থাকতে হবে!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cআপনাকে বিছানার উপর থাকতে হবে।");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§f{team}-এর বিছানা নির্ধারণ করুন");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7সর্বোচ্চ নির্মাণ উচ্চতা Y নির্ধারিত: §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7ব্যবহার: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7উপলব্ধ রং: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7তৈরি হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7{team} দলটি ইতিমধ্যে রয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7অবৈধ রং!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7ব্যবহার: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "{generator} জেনারেটর যোগ করা হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a জেনারেটর যোগ করা হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "একটি দলের জেনারেটর যোগ করুন।\nদলটি স্বয়ংক্রিয়ভাবে শনাক্ত হবে।");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "চেষ্টা করুন: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{generator} জেনারেটর দলের জন্য যোগ করা হয়েছে: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "{generator} জেনারেটর দলের জন্য যোগ করা হয়েছে: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6{generator}§a জেনারেটর {team}-এর জন্য যোগ করা হয়েছে§a!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (দল স্বয়ংক্রিয়ভাবে শনাক্ত করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "দল তৈরি করতে চাইলে ব্যবহার করুন: /bw createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cএই জেনারেটর ইতিমধ্যে নির্ধারিত!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cএই জেনারেটর ইতিমধ্যে নির্ধারিত!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} নির্ধারিত");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "অন্য ব্যবহার: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "একটি পান্না বা হীরার জেনারেটর যোগ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6দলের জন্য জেনারেটর নির্ধারিত: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "একটি দলের জেনারেটর যোগ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cদল পাওয়া যায়নি: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "দলের জন্য জেনারেটর নির্ধারিত: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aদলের জন্য জেনারেটর নির্ধারিত: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "আগে দল তৈরি করুন!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cআগে দল তৈরি করুন!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6{team}-এর হত্যার পর পড়ে থাকা সামগ্রী");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "একটি দলের জন্য হত্যার পর পড়ে থাকা সামগ্রীর স্থান নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "{team}-এর জন্য হত্যার পর পড়ে থাকা সামগ্রীর স্থান নির্ধারিত হয়েছে");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ {team}-এর হত্যার পর পড়ে থাকা সামগ্রী (নির্ধারণ করতে ক্লিক করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§f{team}-এর জন্য হত্যার পর পড়ে থাকা সামগ্রীর স্থান নির্ধারণ করুন");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "দলের জন্য হত্যার পর পড়ে থাকা সামগ্রীর স্থান নির্ধারিত হয়েছে: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aদলের জন্য হত্যার পর পড়ে থাকা সামগ্রীর স্থান নির্ধারিত হয়েছে: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cব্যবহার: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7দলে সর্বোচ্চ সংখ্যা নির্ধারিত হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7ব্যবহার: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cকাছাকাছি কোনো দল পাওয়া যায়নি।");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cকাছাকাছি কোনো দল পাওয়া যায়নি।");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7আপনি কোনো প্রস্তুতি অধিবেশনে নেই!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "কাছাকাছি কোনো জেনারেটর পাওয়া যায়নি (পরিসর 2x2)।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cকাছাকাছি কোনো জেনারেটর পাওয়া যায়নি।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "{generator} জেনারেটর সরানো হয়েছে, অবস্থান: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§a{generator} জেনারেটর সরানো হয়েছে।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "যে জেনারেটরের হলোগ্রাম সরাতে চান, তার কাছে দাঁড়ান।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §a{generator} জেনারেটর সরানো হয়েছে।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "{team}-এর জেনারেটরগুলো সরানো হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "{team}-এর {generator} জেনারেটর সরানো হয়েছে, অবস্থান: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "{team}-এর জেনারেটর সরানো হয়েছে।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7{team} সরান §7(সরাতে ক্লিক করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "এই দলটি বিদ্যমান নেই: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cদল পাওয়া যায়নি: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "দল সরানো হয়েছে: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aদল সরানো হয়েছে: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cব্যবহার: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "এখন এটি চালু করতে ব্যবহার করুন:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aএই অ্যারেনা চালু করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (চালু করতে ক্লিক করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "অ্যারেনার পরিবর্তন সংরক্ষণ করা হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6দোকান নির্ধারিত");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "একটি দলের দোকান নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "অন্য ব্যবহার: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "{team}-এর জন্য দোকান নির্ধারিত হয়েছে");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7{team}-এর দোকান নির্ধারণ করুন");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6জন্মস্থান নির্ধারিত");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "বাকি: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ {team}-এর জন্য জন্মস্থান নির্ধারিত");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "দলের তালিকা: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "{team}-এর জন্মস্থান নির্ধারণ করুন (নির্ধারণ করতে ক্লিক করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§f{team}-এর জন্মস্থান নির্ধারণ করুন");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cলক্ষ্য দল পাওয়া যায়নি: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cব্যবহার: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "দর্শকের অবস্থান নির্ধারিত হয়েছে!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cব্যবহার: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "অথবা জন্মস্থান নির্ধারণ করেও স্বয়ংক্রিয়ভাবে না পেলে ব্যবহার করুন: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cএই দলটি বিদ্যমান নেই!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(নির্ধারণ করতে ক্লিক করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "প্রথমে দলের জন্মস্থান নির্ধারণ করুন!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fএকটি দলের জন্মস্থান নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9উপলব্ধ ধরন: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7অ্যারেনার শ্রেণি বদলে হয়েছে: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(নির্ধারণ করতে ক্লিক করুন)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dঅ্যারেনাকে {type} করতে ক্লিক করুন");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7ব্যবহার: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6আপগ্রেড নির্ধারিত");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "একটি দলের জন্য আপগ্রেডের NPC নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "{team}-এর জন্য আপগ্রেডের NPC নির্ধারিত হয়েছে");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§f{team}-এর আপগ্রেডের NPC নির্ধারণ করুন");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dঅবস্থান {position} নির্ধারণ করুন");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7বাকি অবস্থান নির্ধারণ করুন:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7অবস্থান {position} নির্ধারিত!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7না করে থাকলে দলের জন্মস্থান নির্ধারণ করুন!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7ব্যবহার: /{command} {subcommand} 1 অথবা 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7§e{arena}§7-এর জন্য অপেক্ষার জন্মস্থান নির্ধারিত!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aমূল অপেক্ষাকক্ষ নির্ধারণ করুন। §fএটি আবশ্যক, কিন্তু\n§f§eBUNGEE §fধরনে সার্ভার ব্যবহার করলে অপেক্ষাকক্ষের অবস্থান\n§fব্যবহৃত হবে §eনা§f।\n§eপুরোনো জন্মস্থানের অবস্থান বদলাতে আবার লিখুন।");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4অ্যারেনায় এই নির্দেশ ব্যবহার করা যাবে না। এটি মূল অপেক্ষাকক্ষের জন্য!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(নির্ধারিত নয়)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(নির্ধারিত)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7অপেক্ষাকক্ষের অবস্থান নির্ধারিত হয়েছে!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- প্রস্তুতি যাচাই চালু বা বন্ধ করুন।");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8 - §eজোর করে অ্যারেনা শেষ করুন");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "§fবিজয়ী ছাড়াই জোর করে অ্যারেনা শেষ করুন।\n§fঅনুমতি: §c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "§cখেলা চলছে না।");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "§aখেলা জোর করে শেষ করা হচ্ছে...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8 - §eজোর করে অ্যারেনা শুরু করুন");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "§fজোর করে অ্যারেনা শুরু করুন।\n§fঅনুমতি: §c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8 - §eশুরুর ক্ষণগণনা ৫ সেকেন্ডে কমান");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "§fঅ্যারেনায় শুরুর ক্ষণগণনা ৫ সেকেন্ডে কমান।\n§fঅনুমতি: §c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "§e/{command} {subcommand} §7- প্রস্তুতির অবস্থা বদলান।");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "§6 ▪ §7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "§fঅ্যারেনার GUI খুলুন।");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "§6 ▪ §7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "§fনাম বা শ্রেণি দিয়ে অ্যারেনায় যোগ দিন।\n§f/{command} join random - এলোমেলো অ্যারেনায় যোগ দিন।");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "§6 ▪ §7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "§fআপনার ভাষা পরিবর্তন করুন।");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "§6 ▪ §7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "§fঅ্যারেনা ছেড়ে যান।");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "§6 ▪ §7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "§fপরিসংখ্যানের GUI খুলুন।");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "§6 ▪ §7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "§fVanilla দর্শক ধরন ও প্লাগইনের দর্শক ধরন বদলান।");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "§8&l{dot} &6{plugin} v{version} &7- §c প্রশাসনিক নির্দেশ");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "§f   bw safemode &eচালু/ বন্ধ");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "§fএই মুহূর্তে কনসোলের জন্য কোনো নির্দেশ নেই।");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "§c❌ §7প্রথমে অপেক্ষাকক্ষের অবস্থান নির্ধারণ করুন!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "আপনার এখানে থাকার কথা নয়।");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}         &8 - §e খেলোয়াড়ের নির্দেশ দেখুন");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "§fখেলোয়াড়ের নির্দেশ দেখুন।");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "§7&l{dot}&6{plugin} v{version}&7- &a{world}-এর নির্দেশ");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version}, নির্মাতা andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "§7অ্যারেনা: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "§c(নির্ধারিত নয়)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "§a(নির্ধারিত)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "§7&oঐচ্ছিক");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "§a(সব নির্ধারিত)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "§c(বাকি: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "§c(অবস্থান ১ নির্ধারিত নয়)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "§c(অবস্থান ২ নির্ধারিত নয়)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(স্বয়ংক্রিয় শনাক্তকরণ)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} তৈরি)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (নির্ধারিত: {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fগেম শুরু হওয়ার আগে খেলোয়াড়রা\n&fযেখানে অপেক্ষা করবে সেই স্থান নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fশুরু হলে অপেক্ষার কক্ষ অদৃশ্য হবে এমন ব্যবস্থা করুন।\n&fWorldEdit-এর অঞ্চল হিসেবে এটি নির্বাচন করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fদর্শকদের জন্মস্থানের স্থান নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fদ্বীপের রঙের ভিত্তিতে দল তৈরি করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fএকটি দল তৈরি করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fনাম দিয়ে একটি দল সরান।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fএকটি দলের জন্মস্থান নির্ধারণ করুন।\n&fযেসব দলের জন্মস্থান নির্ধারিত নয়:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fএকটি দলের বিছানার অবস্থান নির্ধারণ করুন।\n&fদলের নাম দিতে হবে না।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fএকটি দলের NPC নির্ধারণ করুন।\n&fদলের নাম দিতে হবে না।\n&fগেম শুরু হলেই এটি তৈরি হবে।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fএকটি দলের উন্নতি NPC নির্ধারণ করুন।\n&fদলের নাম দিতে হবে না।\n&fখেলা শুরু হলেই এটি তৈরি হবে।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fশত্রুকে হত্যা করার পর তার জিনিসপত্র\n&fযেখানে ফেলা হবে সেই স্থান নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fজেনারেটর বসানোর স্থান যোগ করুন।\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fহীরার জেনারেটর বসাতে হীরার খণ্ডের উপর দাঁড়ান।\n&fপান্নার জেনারেটর বসাতে পান্নার খণ্ডের উপর দাঁড়ান।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fজেনারেটর বসানোর স্থান যোগ করুন।\n&eদলের জেনারেটর বসাতে দলের দ্বীপে দাঁড়ান\n&fহীরার জেনারেটর বসাতে হীরার খণ্ডের উপর দাঁড়ান।\n&fপান্নার জেনারেটর বসাতে পান্নার খণ্ডের উপর দাঁড়ান।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fদলের সর্বোচ্চ সদস্যসংখ্যা নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fঅ্যারেনার শ্রেণি নির্ধারণ করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fঅ্যারেনাকে একটি শ্রেণিতে যোগ করুন।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fঅ্যারেনা সংরক্ষণ করে অপেক্ষাকক্ষে ফিরে যান");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cঅ্যারেনা {arena} লোড করার চেষ্টা হয়েছে, কিন্তু এটি চালুর অপেক্ষমাণ সারিতে আগে থেকেই আছে।");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cঅ্যারেনা {arena} লোড করার চেষ্টা হয়েছে, কিন্তু এটি আগে থেকেই চালু।");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "অ্যারেনা {arena}-এর জন্য কোনো দল নির্ধারণ করেননি");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&c{arena}-তে অন্তত ২টি দল নির্ধারণ করতে হবে");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&c{arena} নামে কোনো মানচিত্র নেই");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cঅ্যারেনা {arena}-এর {team} দলে অবৈধ রং");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&cঅ্যারেনা {arena}-তে {team} দলের জন্য {setting} নির্ধারিত নয়");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cঅ্যারেনা {arena}-তে কোনো হীরার জেনারেটর নির্ধারিত নেই");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cঅ্যারেনা {arena}-তে কোনো পান্নার জেনারেটর নির্ধারিত নেই");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cঅ্যারেনা {arena}-তে অপেক্ষার জন্মস্থান নির্ধারিত নয়");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "§8প্রস্তুতির পদ্ধতি বেছে নিন");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lসহায়তাপ্রাপ্ত প্রস্তুতি");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aসহজ ও দ্রুত প্রস্তুতি!", "&7নতুনদের ও অলস কর্মীদের জন্য :D", "", "&3কম বিকল্প।"));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lউন্নত প্রস্তুতি");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aবিস্তারিত প্রস্তুতি!", "&7অভিজ্ঞ কর্মীদের জন্য :D", "", "&3উন্নত বিকল্প।"));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ §7{arena} লোড হচ্ছে");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ §7{arena}-এর প্রস্তুতি বাতিল হয়েছে!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aআপনাকে &6{arena}&a-এর জন্মস্থানে পাঠানো হয়েছে।");
        yml.addDefault(Messages.SETUP_GREETING, "&aস্বাগতম {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fঅপেক্ষার জন্মস্থান নির্ধারণ করুন।");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fগেম শুরু হওয়া পর্যন্ত খেলোয়াড়রা এই স্থানে অপেক্ষা করবে।");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6অপেক্ষাকক্ষ নির্ধারণ করতে এখানে ক্লিক করুন    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dঅপেক্ষার জন্মস্থান নির্ধারণ করতে ক্লিক করুন।");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eঅথবা লিখুন: &7/{command} — নির্দেশের তালিকা দেখতে।");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fনির্দেশের তালিকা দেখুন।");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6{teamColor}{team} দলের জন্য {generator} জেনারেটর যোগ হয়েছে");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6জন্মস্থান নির্ধারিত");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6বিছানা নির্ধারিত");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6দোকান নির্ধারিত");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6আপগ্রেড নির্ধারিত");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6{team}-এর হত্যার পর পড়ে থাকা সামগ্রী");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} জেনারেটর নির্ধারিত");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "লোহা");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "সোনা");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "পান্না");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "হীরা");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "উপলব্ধ দল: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cপ্রস্তুতি অধিবেশন শুরু করা যায়নি। অনুগ্রহ করে কনসোল দেখুন।");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cVault সমর্থন অনুপস্থিত!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lত্রুটি: এর জন্য Vault সমর্থন দরকার! অনুগ্রহ করে Vault প্লাগইন ইনস্টল করুন!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7অ্যারেনা {arena}-এর জন্য ফলক সংরক্ষিত হয়েছে");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7এখনও কোনো অ্যারেনা নির্ধারণ করেননি!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 পুনরায় লোড হয়েছে! (প্লাগইন পুনরায় লোড করবেন না)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lশুভ হ্যালোইন!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} xp!");
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8দলের উন্নতি");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

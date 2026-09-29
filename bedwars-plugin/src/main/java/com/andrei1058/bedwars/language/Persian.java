/*
 * BedWars1058 - A bistar wars mini-game.
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

public class Persian extends Language {

    public Persian() {
        super(BedWars.plugin, "fa");

        YamlConfiguration yml = getYml();
        yml.options().header("Translation by Alijk#2951");
        yml.options().copyDefaults(true);
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Persian");

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

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(spectator)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "spawn-protection dar server.properties fa'al ast; momken ast bar maidan-haye BedWars asar bezarad. Pishnahad mishavad an ra rooye 0 gharar dahid.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Multiverse-Core tashkhis dade shod; an ra hazf konid ya motmaen shavid ke map-haye BedWars ra taghir nemidahad.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "{world} az container-e world-haye Bukkit dar hale load shodan ast.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Dar hale sakht-e yek void map-e jadid: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7Shenase Karbari: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7Shenase Daryaft: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Ghabeliyat-e check amade boodan ra taghir dahid.");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &ePayam be maidan feli befrestid");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fPayam be hame bazikon haye maidan feli befrestid.\n&fRavesh estefade: /{command} echo <payam>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cModir&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &ePayam be yek maidan befrestid");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fPayam be hame bazikon haye maidan mored nazar befrestid.\n&fRavesh estefade: /{command} echoto <arena> <payam>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &ePayam be hame maidan ha befrestid");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fPayam be hame bazikon haye hame maidan ha befrestid.\n&fRavesh estefade: /{command} echoall <payam>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cRavesh estefade: /bw echo <payam>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aPayam be maidan {arena} ferestade shod");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cShoma dar maidan nistid.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cRavesh estefade: /bw echoto <arena> <payam>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aPayam be maidan {arena} ferestade shod");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cRavesh estefade: /bw echoall <payam>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aPayam be hame maidan ha ferestade shod.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cMaidan peida nashod: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cIn dastoor faghat baraye bazikon ast.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aShoma amade hastid!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aShoma digar amade nistid.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aHame bazikon ha amade hastand! Shomaresh makoos be 10 saniye kahesh yaft!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aBarresi amadegi faal shod.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aBarresi amadegi gheyr faal shod.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cIn dastoor gheyr faal ast.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cShoma dar bazi nistid!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cAlan nemitavanid az in dastoor estefade konid.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cTamashagar ha nemitavanand az in dastoor estefade konand.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aAmade");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cAmade nist");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Baraye amade shodan rast dabayein konid!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Baraye laghv amadegi rast dabayein konid!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Bazikon kafi baraye shoroo bazi vojood nadarad!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aHalat tamashagar Vanilla faal shod.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aHalat tamashagar mamooli faal shod.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cBhandar por ast!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aPooshide shode!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Zaban haye mojood:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Ravesh Estefade: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cIn zaban vojood nadarad!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aZaban taghir kard!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cShoma nemitavanid hengami ke dar game hastid zaban ra agvaz konid.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Ravesh Estefade: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cHich maidan ya maidan group i be in nam vojood nadarad: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cIn maidan por shode!\n&aBaraye dashtan ghabeliat haye bishtar mitoonid ma ro daan dein konid. &7&o(dabayein)");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cHich maidan i dar hale hazer khali nist ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cMotasefane maidan mored nazar por shode.\n&cMa midoonim ke shoma kharidaar hastid ama in maidan az ghabl ba karmand/kharidaar ha por shode.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cTedad afradi ke dar dal shoma hastand monaseb in maidan nist :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cFaghat saheb dal emkan entekhab maidan dare.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &evared shod (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Shoma darhale dekhein kardan §9{arena} §6hastid.\n{prefix}§eBaraye kharej shodan az maidan az §c/leave §eestefade konid.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cEmkan vared shodan tamashagar be in maidan vojood nadarad!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cKhiladi peida nashod!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cIn khiladi dar yek maidan BedWars nist!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cMaidan i ke khiladi dakhelesh hast hanooz shuru nashode!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cRavesh estefade: /bw tp <username>");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cMaidan baraye mojadadan vared shodan mojood nist!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cShoma dige nemitoonid mojadadan vared maidan beshid. Bazi tamoom ya hazf shode.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eDarhale vorood be maidan &a{arena}&e!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &emojadadan vared shod!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cShoma dar maidan nistid!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &ekharej shod!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cShoma nemitavanid inkar ra zamani ke dar game hastid anjam dahid.");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cCommand yaft nashod ya shoma dastresi lazem ro nadarid!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aDastoorat Dal:",
                "&e/party help &7- &bPayam help (hamin payam) ra neshan midahad",
                "&e/party invite <khiladi> &7- &bInvite dadan be khiladi mored nazar",
                "&e/party leave &7- &bKharej shodan az dal feli",
                "&e/party remove <khiladi> &7- &bHazf khiladi az dal",
                "&e/party info &7- &bNeshan dadan aza va saheb dal",
                "&e/party promote <khiladi> &7- &bEnteghal sahebi dal",
                "&e/party accept <khiladi> &7- &bGhabool kardan yek invite",
                "&e/party disband &7- &bAz bein bordan dal")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eRavesh Estefade: &7/party invite <khiladi>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eInvite be &7{player} &eersal shod&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &eshoma ro be dal davat karde! &o&7(Baraye ghabool kardan dabayein inja konid)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cShoma nemitoonid khodetoon ro invite bistari!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eoffline hast!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cHich darkhast dal i baraye ghabool kardan vojood nadare");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eShoma darhale hazer dar yek dal hastid!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cFaghat saheb dal emkan in kar ro dare!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eRavesh Estefade: &7/party accept <khiladi>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &evared dal shod!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cShoma dar dal nistid!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cShoma nemitoonid az dal khodetoon niklein bistari!\n&eDastoor baraye hazf dal: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eaz dal kharej shod!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eDal az bein raft!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Ravesh Estefade: &e/party remove <khiladi>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &eaz dal hazf shod,");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &edakhel dal shoma nist!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eShoma {player} ra saheb dal kardid");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eShoma saheb dal shodid");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} saheb dal shod");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eSaheb dal: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS, "{prefix}&eAza ye dal:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Shoma bazi nemikonid!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Shomaresh makoos kootah shod!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Shoma nemitavanid in maidan ro forcestart konid.\n§7Lotfan baraye daryaft ghabeliat haye vizhe server ro daan dein konid.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cShoma hanooz nemitoonid in kar ro anjam bistarid! Lotfan {seconds} sanie sabr konid!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cMotasefane shoma bistaralil vorood yek kharidaar be maidan kick shodid.\n&aLotfan baraye daryaft ghabeliat haye vizhe server ro daan dein konid. &7&o(dabayein)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cKhiladi ha baraye shoroo kafi nistand! Shomaresh makoos motevaghef shod!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eMaidan i ke shoma dakhelesh budid dar hale rah andazi mojadad hast.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cDakhel Bazi");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Dobara shuru ho raha hai");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Dar Entezar §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Darhale Shoroo §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Entekhab Arena");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Halat: {status}", "&7Khiladi Ha: &f{on}&7/&f{max}", "&7No: &a{group}", "", "&aBaraye vared shodan Chap-dabayein konid.", "&eBaraye dekhein kardan Daaya-dabayein konid."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eBazi dar &6{time} &esanie digar shoro khahad shod.");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cDar entezare khiladi haye bishtar..");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aBERID");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l    Az bistar khodetoon hefazat konid va bistar baghie ro bekanid.",
                "&e&l   Ba daryaft Iron, Gold, Emerald va Diamond az generator ha",
                "&e&l              Khodetoon va daletoon ro ertegha bistarid",
                "&e&l                  ta ghodratmand tar beshid.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cMotasefane darhale hazer nemitoonid vared in maidan beshid. Baraye dekhein kardan az Daaya-dabayein estefade konid!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cMotasefane darhale hazer nemitoonid in maidan ro dekhein konid. Baraye vared shodan az Chap-dabayein estefade konid!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cShoma bayad az tarighe BedWarsProxy vared bazi beshid. \n&eAgar mikhaid maidan jadidi ijad konid motmaen shid ke permission bw.setup darid ta betoonid mostaghiman vared server beshid!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teleporter");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Salamat: &f{health}%", "&7Ghaza: &f{food}", "", "&7Chap-dabayein dekhne ke liye"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lBazgasht be lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Baraye bargasht be lobby Daaya-dabayein konid!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aDarhale dekhein kardan &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cBaryae khorooj SNEAK konid");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eDarhale khorooj az halat Tamashagar");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cSaheb dal az server kharej shod va dal az bein raft!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eTier &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamond");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEmerald");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eSpawn dar &c{seconds} &esanie");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Janak ha &eertegha peida kardand be Tier &c{tier}");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[CHILLANA] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[DEKHNE WALA] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aSwasthya"));

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 SHOMA");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fDarhale Track: {team} &f- Fasele: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[CHILLANA]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[DEKHNE WALA]");
        yml.addDefault(Messages.MEANING_FULL, "Kamel");
        yml.addDefault(Messages.MEANING_SHOUT, "chillana");
        yml.addDefault(Messages.MEANING_NOBODY, "Hichkas");
        yml.addDefault(Messages.MEANING_NEVER, "Hichvaght");
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
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cShoma Nemitavanid Inja Block Bezarid.");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cFaghat Block Hayi Ke Khiladi Ha Gozashtan Ghabele Kandan Ast.");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cShoma Nemitavanid Bistar Khodetoon Ra Bekanid.");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lBED AZ BEYN RAFT > {TeamColor}{TeamName} Bistar &7Tavasote {PlayerColor}{PlayerName} &7Az Beyn Raft!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cBED AZ BEYN RAFT!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fShoma Digar Reutpan Nakhahid Shod.");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lBED AZ BEYN RAFT > &7Bistar Shoma Tavasote {PlayerColor}{PlayerName} &7Az Beyn Raft");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cShoma Nemitavanid In Chest Ro Be Dalil Inke Khiladi Haye Dal Hanoz Namordan Baz Konid!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cShoma dige namarei nistid chon damage daryaft kardid!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7Dakhel Void Oftad.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7Dakhel Void Oftad. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7Be Dakhel Void Part Shod.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7Be Dakhel Void Part Shod. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7Hengame Mobareze Ba {KillerColor}{KillerName} &7Az Server Kharej Shod.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7Hengame Mobareze Ba {KillerColor}{KillerName} &7Az Server Kharej Shod. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7Part shod.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7Part Shod. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7Bar Asar Enfejar Mord.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7Bar Asar Enfejar Mord. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7Bar Asar Enfejar Mord.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7Bar Asar Enfejar Mord. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7maara Shod!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7maara Shod! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7Mord.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7Mord. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7teer se mara gaya!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote {KillerColor}{KillerName} &7teer se mara gaya! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7Tavasote BedBug {KillerColor}{KillerTeamName} &7maara Shod!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote BedBug {KillerColor}{KillerTeamName} &7maara Shod! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7Tavasote Iron Golem {KillerColor}{KillerTeamName} Koshte Shod!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7Tavasote Iron Golem {KillerColor}{KillerTeamName} &7maara Shod! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cSHOMA MORDID!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eShoma dar &c{time} &esanie dige punarjanm lenge!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eShoma dar &c{time} &esanie dige punarjanm lenge!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aRESPAWN SHID!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cShoma hazf shodid!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7alan &c{amount} &7HP dare!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lBAZI TAMOOM SHOD!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lBORD!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &abarande bazi shodan!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &lMagham #1 &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                        &lMagham #2 &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                        &lMagham #3 &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lAz Bistar khodetoon hefazat konid!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lBistar shoma az bein raft!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bBEHBOOD HAYE DAL,&e&lRAST DABAYEIN");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bBEHBOOD HAYE EKAL,&e&lRAST DABAYEIN");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bFOROOSHGAH DAL,&e&lRAST DABAYEIN");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bFOROOSHGAH SAMAN,&e&lRAST DABAYEIN");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lDAL BAD HUA > {TeamColor} Dal {TeamName} &chazf shod!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cHazf Bistar Ha");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fErtegha Diamond II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fErtegha Diamond III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fHamle Dragon");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fErtegha Emerald II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fErtegha Emerald III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Payan Bazi");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cBED AZ BEIN RAFT!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fHameye bistar ha az bein raftand!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lTamami bistar ha az bein raftand!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cMarg-e nagahani");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cMARG-E NAGAHANI: &6&b{TeamDragons} {TeamColor}{TeamName} Dragon!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Tajrobe BedWars Daryaft Kardid (Khelne ka samay).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Tajrobe BedWars Daryaft Kardid (Bord Bazi).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Tajrobe BedWars Daryaft Kardid (Hemayat Az Dal).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Tajrobe BedWars Daryaft Kardid (Az Bein Raftan Bistar).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Tajrobe BedWars Daryaft Kardid (Kill e Addi).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Tajrobe BedWars Daryaft Kardid (Kill e Payani).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Sikke (Khelne ka samay).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Sikke (Bord Bazi).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Sikke (Hemayat Az Dal).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Sikke (Az Bein Raftan Bistar).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Sikke (Kill e Payani).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Sikke (Kill e Addi).");

        /* Lobby Command Samagris */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eAmar");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fBaraye didan amaretoon Daaya-dabayein konid!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eEntekhab Maidan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fBaraye entekhab maidan Daaya-dabayein konid!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eBazgasht be Hub");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBaraye raftan az BedWars Daaya-dabayein konid!"));
        /* Pre Game Command Samagris */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eAmar");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fBaraye didan amaretoon Daaya-dabayein konid!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eBazgasht be Lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBaraye raftan az maidan Daaya-dabayein konid!"));
        /* Dekhne wala Command Samagris */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeleport Konande");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eBazgasht be Lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBaraye raftan az maidan Daaya-dabayein konid!"));

        /* save default vastus messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8{player} Amar");
        addDefaultStatsMsg(yml, "wins", "&6Bord", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Bakht", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Kill", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Maut", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Kill Haye Payani", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Maut Haye Payani", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Bistar haye Kande Shode", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Avalin Bazi Anjam Shode", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Akharin Bazi Anjam Shode", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Tedad Bazi Anjam Shode", "&f{gamesPlayed}");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fLevel Shoma: {level}",
                "",
                "&fPishraft: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fSikke: &a{money}",
                "",
                "&fKul jeet: &a{wins}",
                "&fKul hatya: &a{kills}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fManch: &a{map}",
                "",
                "&fKhiladi Ha: &a{on}/{max}",
                "",
                "&fDar Entezar,&fDar Entezar.,&fDar Entezar..,&fDar Entezar...",
                "",
                "&fNo: &a{group}",
                "&fSanskaran: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Dekh rahe hain",
                "&fManch: &a{map}",
                "",
                "&fKhiladi Ha: &a{on}/{max}",
                "",
                "&fDar Entezar,&fDar Entezar.,&fDar Entezar..,&fDar Entezar...",
                "",
                "&fNo: &a{group}",
                "&fSanskaran: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fManch: &a{map}",
                "",
                "&fKhiladi Ha: &a{on}/{max}",
                "",
                "&fShoroo dar &a{time}s",
                "",
                "&fNo: &a{group}",
                "&fSanskaran: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Dekh rahe hain",
                "&fManch: &a{map}",
                "",
                "&fKhiladi Ha: &a{on}/{max}",
                "",
                "&fShoroo dar &a{time}s",
                "",
                "&fNo: &a{group}",
                "&fSanskaran: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} ke baad &a{time}",
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
                "&o&7Dekh rahe hain {spectatorTarget}",
                "",
                "&f{nextEvent} ke baad &a{time}",
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
                "&o&7Dekh rahe hain {spectatorTarget}",
                "",
                "&f{nextEvent} ke baad &a{time}",
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
                "&6Vijeta: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lSabse adhik hatya:",
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
                "&6Vijeta: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lSabse adhik hatya:",
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
                "&6Vijeta: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lSabse adhik hatya:",
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
                "&6Vijeta: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lSabse adhik hatya:",
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
                "&f{nextEvent} dar &a{time}",
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
                "&o&7Dekh rahe hain {spectatorTarget}",
                "&f{nextEvent} dar &a{time}",
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
                "&o&7Dekh rahe hain {spectatorTarget}",
                "&f{nextEvent} dar &a{time}",
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
                "&f{nextEvent} dar &a{time}",
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
                "&fHatya: &a{kills}",
                "&fAntim hatya: &a{finalKills}",
                "&fToote bistar: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Dekh rahe hain {spectatorTarget}",
                "&f{nextEvent} dar &a{time}",
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
                "&o&7Dekh rahe hain {spectatorTarget}",
                "&f{nextEvent} dar &a{time}",
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
                "&fHatya: &a{kills}",
                "&fAntim hatya: &a{finalKills}",
                "&fToote bistar: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} dar &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fHatya: &a{kills}",
                "&fAntim hatya: &a{finalKills}",
                "&fToote bistar: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Dekh rahe hain {spectatorTarget}",
                "&f{nextEvent} dar &a{time}",
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
                "&o&7Dekh rahe hain {spectatorTarget}",
                "&f{nextEvent} dar &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fHatya: &a{kills}",
                "&fAntim hatya: &a{finalKills}",
                "&fToote bistar: &a{beds}",
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
                "&fIs lobby mein {on} khiladi hain",
                "{poweredBy} se sanchalit,&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_PREFIX, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_SUFFIX, List.of(" {level}"));
        // khiladi waiting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_FOOTER, List.of(
                "",
                "Aur khiladiyon ka intezar,Aur khiladiyon ka intezar.,Aur khiladiyon ka intezar.., Aur khiladiyon ka intezar...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
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
                "&7&oAap dekh rahe hain",
                "Aur khiladiyon ka intezar,Aur khiladiyon ka intezar.,Aur khiladiyon ka intezar.., Aur khiladiyon ka intezar...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // khiladi starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&fShuru hone mein &a{time} &fseconds,&fShuru hone mein &a{time} &fseconds.,&fShuru hone mein &a{time} &fseconds..,&fShuru hone mein &a{time} &fseconds..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                "",
                "&7&oتماشاگر بازی هستید"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fShuru hone mein &a{time} &fseconds,&fShuru hone mein &a{time} &fseconds.,&fShuru hone mein &a{time} &fseconds..,&fShuru hone mein &a{time} &fseconds..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // khiladi playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                "",
                "{nextEvent} ke baad {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fAap is dal mein khel rahe hain: {teamColor}{teamName} Dal",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // khiladi eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                "",
                "{nextEvent} ke baad {time}",
                "",
                "&7&oAap bahar ho gaye,&f&oAap bahar ho gaye"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fAapne isme khela: {teamColor}{teamName} Dal",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oTamashagar "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oHazf shod {teamColor}&o{teamName}", " {teamColor}&oHazf shod {vPrefix}", "{teamColor}&oHazf shod {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                "",
                "{nextEvent} ke baad {time}",
                "",
                "&7&oتماشاگر بازی هستید"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oTamashagar "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lAapki dal ne khel jeeta! &6⭐",
                "&7{date}", "&7Manch: &f{map} &7Prakar: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lAap jeete: {teamColor}&l{teamName} Dal&6&l!,&6&lAap jeete: {teamColor}&l{teamName} Dal&6&l!,&f&lAap jeete: {teamColor}&l{teamName} Dal&f&l!",
                "&7Is match ke aankde",
                "&eHatya: &f{kills} &8| &eAntim hatya: &f{finalKills} &8| &eToote bistar: &f{beds} &8| &eMauten: &f{deaths},&eHatya: &7{kills} &8| &eAntim hatya: &7{finalKills} &8| &eToote bistar: &7{beds} &8| &eMauten: &7{deaths}",
                "",
                "&fKhelne ke liye dhanyavaad {player}!",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} Dal ne khel jeeta! &6⭐",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lAap jeete: {teamColor}&l{teamName} Dal&6&l!,&6&lAap jeete: {teamColor}&l{teamName} Dal&6&l!,&f&lAap jeete: {teamColor}&l{teamName} Dal&f&l!",
                "&7Is match ke aankde",
                "&eHatya: &f{kills} &8| &eAntim hatya: &f{finalKills} &8| &eToote bistar: &f{beds} &8| &eMauten: &f{deaths},&eHatya: &7{kills} &8| &eAntim hatya: &7{finalKills} &8| &eToote bistar: &7{beds} &8| &eMauten: &7{deaths}",

                "&fKhelne ke liye dhanyavaad {player}!",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oHazf shod", " {level}", " &c&oHazf shod"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} Dal ne khel jeeta! &6⭐",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fAap haar gaye: {teamColor}{teamName} Dal",
                "&7Is match ke aankde",
                "&eHatya: &f{kills} &8| &eAntim hatya: &f{finalKills} &8| &eToote bistar: &f{beds} &8| &eMauten: &f{deaths},&eHatya: &7{kills} &8| &eAntim hatya: &7{finalKills} &8| &eToote bistar: &7{beds} &8| &eMauten: &7{deaths}",
                "&fKhelne ke liye dhanyavaad {player}!",
                "&a{serverIp}",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oHazf shod", " {level}", " &c&oHazf shod"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} Dal ne khel jeeta! &6⭐",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                "",
                "&fKhelne ke liye dhanyavaad {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oTamashagar "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Kharid Sari");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Ezafe be Kharid Sari...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cShoma be andaze kafi {currency} nadarid! Shoma {amount} ta bishtar mikhaid!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aShoma &6{item} &akharidid");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cShoma az ghabl in ro kharidid!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Daste Bandi Ha");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Samagri Ha"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bKharid Sari");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cSlot Khali!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Inja jaye slot Kharid Sari hast!", "&7Har vastu ba &bchupke Dabayein &7bezanid ta", "&7inja ezafe beshe"));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eBaraye kharid Dabayein konid!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cShoma be andaze kafi {currency} nadarid!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aAKHARIN LEVEL!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bBaraye ezafe kardan be Kharid Sari SNEAK Dabayein konid");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bBaraye hazf az Kharid Sari SNEAK Dabayein konid!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Block Ha", "&aBlock Ha", Collections.singletonList("&eBaraye moshahede Dabayein konid!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wool", Arrays.asList("&7Gheimat: &f{cost} {currency}", "", "&7Monaseb pol zadan be", "&7dweep ha. Be range daletoon",
                "&7daletoon dar miad.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Clay Mohkam", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Block sade baraye defa kardan az bistar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Glass Zedde Enfejar", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Zedde enfejar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}End Stone", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Block sade baraye defa kardan az bistar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Ladder", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Baraye balaraftan va gir endakhtan dushman ha", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidian", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Block ghodratmand baraye defa az bistar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wood", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Block sade baraye defa kardan az bistar", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Nazdeeki", "&aNazdeeki", Collections.singletonList("&eBaraye Moshahede Dabayein Konid!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Pathar ki Talwar", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Iron ki Talwar", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Diamond ki Talwar", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Lathi (KnockBack I)", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Bormo", "&aBormo", Collections.singletonList("&eBaraye Moshahede Dabayein Konid!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Chainmail Bormo Daemi", Arrays.asList("&7Gheimat: {cost} {currency}",
                "", "&7Chainmail legging va boot ke", "&7hamishe ba oon ha utpan mishid", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Iron Bormo Daemi", Arrays.asList("&7Gheimat: {cost} {currency}",
                "", "&7Iron legging va boot ke", "&7hamishe ba oon ha utpan mishid.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Diamond Bormo Daemi", Arrays.asList("&7Gheimat: {cost} {currency}",
                "", "&7Diamond legging va boot ke", "&7hamishe ba oon ha utpan mishid.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Tool Ha", "&aTool Ha", Collections.singletonList("&eBaraye Moshahede Dabayein Konid!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Shears Daemi", Arrays.asList("&7Gheimat: {cost} {currency}",
                "", "&7Monaseb kandan wool. Shoma", "&7hamishe ba in shears ha utpan mishid.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Pickaxe {tier}", Arrays.asList("&7Gheimat: {cost} {currency}", "&7Star: &e{tier}",
                "", "&7In yek vastu unnayan yogya erteghast.", "&7Maut par 1 star kho jayega", "&7midid!", "", "&7Shoma hamishe", "&7hadaghal ba paein tarin tier", "&7punarjanm lenge.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Axe {tier}", Arrays.asList("&7Gheimat: {cost} {currency}", "&7Star: &e{tier}",
                "", "&7In yek vastu unnayan yogya erteghast.", "&7Maut par 1 star kho jayega", "&7midid!", "", "&7Shoma hamishe", "&7hadaghal ba paein tarin tier", "&7punarjanm lenge.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Durer", "&aDurer", Collections.singletonList("&eBaraye Moshahede Dabayein Konid!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Teer", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhanush", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhanush (Power I)", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhanush (Power I, Punch I)", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Oshudh Ha", "&aOshudh Ha", Collections.singletonList("&eBaraye Moshahede Dabayein Konid!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Gati {level} Oshudh ({duration} sanie)", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Chhalang {level} Oshudh ({duration} sanie)", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Adrishyata Oshudh ({duration} sanie)", Arrays.asList("&7Gheimat: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Upokoron", "&aUpokoron", Collections.singletonList("&eBaraye Moshahede Dabayein Konid!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sone ka Seb", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Monaseb bala raftan HP.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}BedBug", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Makani ke partab mishan silver fish",
                "&7baraye part kardan havas dal", "&7bemodat 15 sanie utpan hote hain.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sapna Rakshak", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Iron Golem be shoma dar hefazat az",
                "&7basetoon bemodat 4 daghighe mishe.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Aag ka Gola", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Partab ba Daaya-dabayein! Monaseb",
                "&7part kardan dushman az rooye", "&7pol haei ke roosh rah miran", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Dar lahze roshan mishe, monaseb",
                "&7monfajer kardan chizaye mokhtalef!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender Moti", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Sari tarin ravesh baraye hamle",
                "&7be base dushman ha.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Paani ki Balti", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Monaseb baraye dashtan yek forood",
                "&7narm dar base dushman. Hamchenin mitoonid", "&7bahash ba TNT moghabele konid.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Pul ka Anda", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7In egg yek pol jadid",
                "&7bad az partab shodan misaze.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Jadui Doodh", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Baraye 60 sanie bad az masraf",
                "&7tale ha rooye shoma kar nemikonan.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sponge", Arrays.asList("&7Gheimat: {cost} {currency}", "", "&7Monaseb jam kardan ab.",
                "", "{quick_buy}", "{buy_status}"));

        //
        yml.addDefault(Messages.MEANING_NO_TRAP, "Hich tale i nadarid!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Gheimat: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Baraye kharid Dabayein konid!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Shoma be meghdar kafi {currency} nadarid");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cGHOFL");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}BAZ");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} yek &6{upgradeName} &akharid");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Iron Bhatti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Ertegha resource jo", "&7dweep shoma utpan hote hain.", "", "{tier_1_color}Star 1: +50% Sansadhan adhik, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Star 2: +100% Sansadhan adhik, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Star 3: Spawn shodan Emerald, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Star 4: +200% Sansadhan adhik, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Sone ki Bhatti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Emerald Bhatti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Pighli Bhatti");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eKharid Tale");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Tale haye kharide shode", "&7dar saf samte rast gharar migiran.", "", "&eDekhne ke liye dabayein!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Shamshir-haye Tiz");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Dal shoma daeman", "&7Sharpness I rooye hame sword va", "&7axe ha migiran!", "", "{tier_1_color}Gheimat: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Mazboot Bormo I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Dal shoma daeman", "&7sabhi bormo par Protection milti hai!", "", "{tier_1_color}Star 1: Protection I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Star 2: Protection II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Star 3: Protection III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Star 4: Protection IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Mazboot Bormo II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Mazboot Bormo III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Mazboot Bormo IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Pagal Khoni I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Tamam khiladi haye dal shoma", "&7daeman Haste migiran.", "", "{tier_1_color}Star 1: Haste I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Star 2: Haste II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Pagal Khoni II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Hoz-e Darman");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Yek mantaghe regeneration", "&7atraf base shoma misaze!", "", "{tier_1_color}Gheimat: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Afzayesh-e Dragon");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Dal shoma bejaye 1 dragon", "&72ta dragon migire!", "", "{tier_1_color}Gheimat: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Ghabel Kharid");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Safe Tale"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Tale #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Avalin dushman ke vared", "&7base shoma beshe in", "&7tale faal mishe!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7Bad az kharid yek tale dar saf", "&7inja gharar migire. Gheimat tale ha", "&7bar asase tedad tale haye mojood", "&7taghir peida mikone.", "", "&7Tale Badi: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Tale #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Dovomin dushman ke vared", "&7base shoma beshe in", "&7tale faal mishe!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7Bad az kharid yek tale dar saf", "&7inja gharar migire. Gheimat tale ha", "&7bar asase tedad tale haye mojood", "&7taghir peida mikone.", "", "&7Tale Badi: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Tale #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Sevomin dushman ke vared", "&7base shoma beshe in", "&7tale faal mishe!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7Bad az kharid yek tale dar saf", "&7inja gharar migire. Gheimat tale ha", "&7bar asase tedad tale haye mojood", "&7taghir peida mikone.", "", "&7Tale Badi: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Tale Sade!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Hengam vorood dushman ha be dweep", "&7baraye 5 sanie koor va kond mishan.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Counter-Offensive Fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&715 second ke liye Gati I deta hai", "&7aapke base ke paas mitra khiladiyon ko.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Tale Alarm");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Hengam Vorood Afrade Adrishya", "&7Be Daletoon Hoshdar Dade Mishe.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Fand Miner Fatigue");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Baraye 10 sanie Miner Fatigue Dushman", "&7Haei Ke Vared Base Mishano Faal Mikone.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aBazgasht");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7بازگشت به ارتقاهای گروه"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Dar saf gharar dadan Tale");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cEmkan Kharid Tale Bishtar Ra Nadarid.");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} khamoosh shod!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cTALE FAAL SHOD!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&f{trap} Shoma Faal Shod.");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lHoshdar Tale Tavasote &7&l{player} &c&laz dal {color}&l{team} &c&lGheyre Faal Shod!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lHOSHDAR!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fAlarm Tale Tavasote Dal {color}{team} &fGheyre Faal Shod!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNaam set nashode ast");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cLore set nashode ast"));
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7میدان {arena} وجود ندارد!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7میدان {arena} به گروه {group} افزوده شد");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7گروه ساخته شد!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "یک گروه میدان بسازید. جزئیات بیشتر در ویکی ما.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fپیش‌فرض");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7گروه حذف شد!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eبرای جزئیات کلیک کنید");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fمدیریت گروه‌های میدان.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7این گروه از پیش وجود دارد!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7گروه‌های میدان موجود:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "گروه‌های موجود را ببینید.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7این گروه وجود ندارد!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "یک گروه میدان را حذف کنید. جزئیات بیشتر در ویکی ما.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "گروه میدان را تعیین کنید. جزئیات بیشتر در ویکی ما.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7گروهی با نام {group} وجود ندارد");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} تنظیم‌شده)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fنمایش میدان‌های موجود");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cمیدانی برای نمایش نیست.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "شناسه: §e{arena} §fگروه: §e{group} §fبازیکنان: §e{players} §fوضعیت: {status} §fبارگذاری جهان: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 بازی‌های ساخته‌شده: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7برای صفحه بعدی بنویسید /§a{command} arenaList {page}§7.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7روش استفاده: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7دیگر نمی‌توانید بلوک بگذارید یا بشکنید!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §eمجوز ساخت‌وساز");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fحالت ساخت‌وساز را روشن یا خاموش کنید\n§fتا بتوانید بلوک‌ها را بشکنید یا بگذارید.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7اکنون می‌توانید بلوک بگذارید و بشکنید.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7هنگام رونویسی پیکربندی نقشه خطایی رخ داد. کنسول را بررسی کنید.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7ابتدا میدان {arena} را غیرفعال کنید!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fاز یک میدان موجود رونوشت بسازید.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} از پیش وجود دارد!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7انجام شد :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7روش استفاده: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7برای تأیید دوباره بنویسید.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fیک نقشه و پیکربندی آن را حذف کنید.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7این میدان وجود ندارد!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7میدان {arena} حذف شد!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7روش استفاده: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7پوشه جهان {arena} وجود ندارد!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7این میدان از پیش غیرفعال است!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fیک میدان را غیرفعال کنید.\nاین کار پیش از غیرفعال‌سازی بازیکنان را\n§fاز میدان بیرون می‌برد.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7بازی در این میدان در جریان است؛ پس از پایان بازی آن را غیرفعال کنید!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7در حال غیرفعال‌سازی میدان...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7این میدان از پیش فعال است!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fیک میدان را فعال کنید.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7این میدان از پیش در صف فعال‌سازی است!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7در حال فعال‌سازی میدان...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7روش استفاده: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eبرای جزئیات کلیک کنید");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fسطح یک بازیکن را مدیریت کنید.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cمقدار باید عدد صحیح باشد!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cسطح باید عدد صحیح باشد!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7بازیکن پیدا نشد!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7ممکن است بازیکن برای دیدن تغییرات نیاز به ورود دوباره داشته باشد.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "سطح یک بازیکن را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7سطح {player} روی {level} تنظیم شد");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7روش استفاده: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "به یک بازیکن تجربه بدهید.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7مقدار {amount} تجربه به {player} داده شد");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7روش استفاده: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "برای استفاده کلیک کنید.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7روش استفاده: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7برای شمار بازیکنان این §7گروه میدان می‌توانید از §e{players} §7استفاده کنید.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bشخصیت {name} §bتنظیم شد!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §eساخت شخصیت ورود");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fیک شخصیت ورود بسازید  \n§fبرای جزئیات بیشتر کلیک کنید.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fبرای ساخت شخصیت ورود از این دستور استفاده کنید.\n§fبرای دیدن دستور کلیک کنید.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7روش استفاده: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fبرای حذف شخصیت، روبه‌روی آن بایستید.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7روش استفاده: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bهیچ شخصیتی در نزدیکی نیست.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bهنوز هیچ شخصیتی تنظیم نشده است!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bشخصیت موردنظر حذف شد!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bگروه‌های مقصد: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7پیکربندی میدان {config} دوباره بارگذاری شد!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} دوباره بارگذاری شد!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §eبارگذاری دوباره پیام‌ها");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fپیام‌ها را دوباره بارگذاری کنید.\n§cپیشنهاد نمی‌شود!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} دوباره بارگذاری شد!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7شما از پیش در نشست پیکربندی هستید!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 نباید حروف بزرگ داشته باشد! نام پوشه را به §a{lowercase} تغییر دهید");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7لطفاً ابتدا آن را غیرفعال کنید!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fیک میدان بسازید یا ویرایش کنید.\n'_' و '-' در نام میدان نمایش داده نمی‌شوند.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} نباید این نماد را داشته باشد: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7روش استفاده: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lبرای ساخت گروه‌های پیدا‌شده اینجا کلیک کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fبرای ساخت گروه‌های پیدا‌شده کلیک کنید!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lگروه‌های تازه پیدا شدند:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7گروه تازه‌ای پیدا نشد.\n§6 ▪ §7گروه‌ها را دستی بسازید: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7در حال جست‌وجوی گروه‌ها. این کار ممکن است باعث کندی شود.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7زمان به پایان رسید. برای جست‌وجوی گروه‌ها دوباره دستور را وارد کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fاگر می‌خواهید لابی با آغاز بازی ناپدید شود،");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lحذف لابی انتظار:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7این مرحله اختیاری است. برای رد کردن آن بنویسید §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fلطفاً فرمان‌های بعدی را مانند انتخاب ناحیه در ویرایش جهان به کار ببرید.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "گروه‌های موجود: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6تخت تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "تخت یک گروه را اضافه کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "تخت برای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aتخت برای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fتخت یک گروه را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cهنگام اجرای این فرمان باید روی تخت بایستید!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cباید روی تخت بایستید.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fتخت {team} را تنظیم کنید");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7بیشترین ارتفاع ساخت Y روی §e{height}§7 تنظیم شد!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7روش استفاده: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7رنگ‌های موجود: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7ساخته شد!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7گروه {team} از پیش وجود دارد!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7رنگ نامعتبر است!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7روش استفاده: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "مولد {generator} افزوده شد!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6مولد {generator}§a افزوده شد!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "مولد یک گروه را اضافه کنید.\nگروه به‌طور خودکار شناسایی می‌شود.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "این فرمان را امتحان کنید: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6مولد {generator} برای گروه {team} افزوده شد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "مولد {generator} برای گروه {team} افزوده شد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6مولد {generator}§a برای گروه {team}§a افزوده شد!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (شناسایی خودکار گروه)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "برای ساخت گروه از این فرمان استفاده کنید: /bw createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cاین مولد از پیش تنظیم شده است!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cاین مولد از پیش تنظیم شده است!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "روش دیگر: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "یک مولد زمرد یا الماس اضافه کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6مولد برای گروه {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "یک مولد گروهی اضافه کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cگروه {team} پیدا نشد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "مولد برای گروه {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aمولد برای گروه {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "لطفاً ابتدا گروه‌ها را بسازید!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cلطفاً ابتدا گروه‌ها را بسازید!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6غنیمت کشتن {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "جایگاه افتادن غنیمت برای یک گروه را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "جایگاه غنیمت برای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ غنیمت کشتن {team} (برای تنظیم کلیک کنید)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fغنیمت کشتن {team} را تنظیم کنید");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "جایگاه غنیمت برای گروه {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aجایگاه غنیمت برای گروه {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cروش استفاده: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7بیشترین شمار اعضای گروه تنظیم شد!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7روش استفاده: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cهیچ گروهی در نزدیکی پیدا نشد.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cهیچ گروهی در نزدیکی پیدا نشد.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7شما در نشست پیکربندی نیستید!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "هیچ مولدی در نزدیکی پیدا نشد (محدوده 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cهیچ مولدی در نزدیکی پیدا نشد.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "مولد {generator} از جایگاه X:{x} Y:{y} Z:{z} برداشته شد");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aمولد {generator} برداشته شد.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "برای برداشتن مولد باید نزدیک هولوگرام آن بایستید.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §aمولد {generator} برداشته شد.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "مولدهای گروه {team} برداشته شدند!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "مولد {generator} گروه {team} از جایگاه X:{x} Y:{y} Z:{z} برداشته شد");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "مولد گروه {team} برداشته شد.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7گروه {team} را بردارید §7(برای حذف کلیک کنید)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "این گروه وجود ندارد: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cگروه پیدا نشد: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "گروه برداشته شد: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aگروه برداشته شد: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cروش استفاده: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "اکنون می‌توانید آن را با این فرمان فعال کنید:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aاین میدان را فعال کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (برای فعال‌سازی کلیک کنید)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "تغییرهای میدان ذخیره شدند!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6فروشگاه تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "فروشگاه یک گروه را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "روش دیگر: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "فروشگاه برای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7فروشگاه گروه {team} را تنظیم کنید");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6نقطه بازپیدایش تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "باقی‌مانده: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ نقطه بازپیدایش برای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "فهرست گروه‌ها: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "نقطه بازپیدایش {team} را تنظیم کنید (برای تنظیم کلیک کنید)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fنقطه بازپیدایش {team} را تنظیم کنید");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cگروه مقصد پیدا نشد: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cروش استفاده: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "جایگاه تماشاگر تنظیم شد!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cروش استفاده: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "یا اگر نقطه بازپیدایش را تنظیم کردید اما خودکار پیدا نشد، این را اجرا کنید: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cاین گروه وجود ندارد!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(برای تنظیم کلیک کنید)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "ابتدا نقطه بازپیدایش گروه را تنظیم کنید!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fنقطه بازپیدایش یک گروه را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9گونه‌های موجود: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7گروه میدان به این گونه تغییر کرد: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(برای تنظیم کلیک کنید)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dبرای تبدیل میدان به {type} کلیک کنید");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7روش استفاده: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6ارتقا تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "شخصیت ارتقای گروه را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "شخصیت ارتقا برای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fشخصیت ارتقای {team} تنظیم شد");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dجایگاه {position} را تنظیم کنید");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7جایگاه باقی‌مانده را تنظیم کنید:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7جایگاه {position} تنظیم شد!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7اگر نقطه بازپیدایش گروه‌ها را تنظیم نکرده‌اید، تنظیم کنید!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7روش استفاده: /{command} {subcommand} 1 یا 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7نقطه انتظار برای §e{arena}§7 تنظیم شد!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aلابی اصلی را تنظیم کنید. §fاین کار لازم است اما\n§fاگر سرور را در حالت §eBUNGEE §fاجرا می‌کنید،\n§fجایگاه لابی §eاستفاده §fنخواهد شد.\n§eبرای جایگزینی نقطه بازپیدایش قبلی، فرمان را دوباره وارد کنید.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4این فرمان را نمی‌توان در میدان‌ها اجرا کرد؛ برای لابی اصلی است!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(تنظیم نشده)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(تنظیم شده)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7جایگاه لابی تنظیم شد!");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eپایان اجباری میدان");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fمیدان را بدون برنده به پایان برسانید.\n&fمجوز: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cبازی در حال اجرا نیست.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aپایان اجباری بازی...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eآغاز اجباری میدان");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fآغاز اجباری یک میدان.\n&fمجوز: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eکاهش شمارش آغاز به ۵ ثانیه");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fشمارش آغاز میدان را به ۵ ثانیه کاهش دهید.\n&fمجوز: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- تغییر وضعیت آمادگی.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fرابط میدان را باز می‌کند.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fبا نام یا گروه وارد میدان شوید.\n&f/{command} join random - ورود به میدان تصادفی.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fزبان خود را تغییر دهید.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fاز میدان خارج شوید.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fرابط آمار را باز می‌کند.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fمیان حالت تماشاگر Vanilla و حالت تماشاگر افزونه جابه‌جا شوید.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c فرمان‌های مدیریت");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eفعال/ غیرفعال");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fاکنون فرمانی برای کنسول موجود نیست.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7ابتدا باید جایگاه لابی را تنظیم کنید!");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e نمایش فرمان‌های بازیکن");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fنمایش فرمان‌های بازیکن.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &aفرمان‌های {world}");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} به‌دست andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7میدان‌ها: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(تنظیم نشده)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(تنظیم شده)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oاختیاری");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(همه تنظیم شده)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(باقی‌مانده: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(جایگاه ۱ تنظیم نشده)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(جایگاه ۲ تنظیم نشده)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(شناسایی خودکار)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} ساخته‌شده)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (روی {size} تنظیم شده)");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fجایی را تنظیم کنید که بازیکنان باید\n&fپیش از آغاز بازی منتظر بمانند.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fکاری کنید که لابی انتظار در آغاز ناپدید شود.\n&fآن را به‌عنوان محدوده ویرایش جهان برگزینید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fجایگاه پدیدارشدن تماشاگران را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fبر پایه رنگ جزیره‌ها گروه بسازید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fیک گروه بسازید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fگروهی را با نام آن بردارید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fنقطه بازپیدایش یک گروه را تنظیم کنید.\n&fگروه‌های بدون نقطه بازپیدایش:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fجایگاه تخت یک گروه را تنظیم کنید.\n&fنیازی به نوشتن نام گروه نیست.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fشخصیت فروشگاه یک گروه را تنظیم کنید.\n&fنیازی به نوشتن نام گروه نیست.\n&fاین شخصیت تنها هنگام آغاز بازی پدیدار می‌شود.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fشخصیت ارتقای یک گروه را تنظیم کنید.\n&fنیازی به نوشتن نام گروه نیست.\n&fاین شخصیت تنها هنگام آغاز بازی پدیدار می‌شود.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fجایگاهی را برای انداختن\n&fوسایل دشمنان پس از کشتنشان تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fجایگاه پدیدارشدن مولد را بیفزایید.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fبرای تنظیم مولد الماس روی بلوک الماس بایستید.\n&fبرای تنظیم مولد زمرد روی بلوک زمرد بایستید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fجایگاه پدیدارشدن مولد را بیفزایید.\n&eبرای تنظیم مولد گروهی روی جزیره گروه بایستید\n&fبرای تنظیم مولد الماس روی بلوک الماس بایستید.\n&fبرای تنظیم مولد زمرد روی بلوک زمرد بایستید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fبیشترین شمار اعضای گروه را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fگروه میدان را تنظیم کنید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fمیدان را به یک گروه بیفزایید.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fمیدان را ذخیره کنید و به لابی بازگردید");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "قرار نبود اینجا باشید.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cتلاش شد میدان {arena} بارگذاری شود، اما از پیش در صف فعال‌سازی است.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cتلاش شد میدان {arena} بارگذاری شود، اما از پیش فعال است.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "هیچ گروهی برای میدان {arena} تنظیم نکرده‌اید");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cباید دست‌کم ۲ گروه برای {arena} تنظیم کنید");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cنقشه‌ای با نام {arena} وجود ندارد");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cرنگ گروه {team} در میدان {arena} نامعتبر است");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} برای گروه {team} در {arena} تنظیم نشده است");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cهیچ مولد الماسی در {arena} تنظیم نشده است");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cهیچ مولد زمردی در {arena} تنظیم نشده است");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cنقطه انتظار در {arena} تنظیم نشده است");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8یک روش پیکربندی برگزینید");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lپیکربندی راهنمایی‌شده");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aپیکربندی آسان و سریع!", "&7برای تازه‌کاران و کارکنان کم‌حوصله :D", "", "&3گزینه‌های کمتر."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lپیکربندی پیشرفته");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aپیکربندی با جزئیات!", "&7برای کارکنان باتجربه :D", "", "&3گزینه‌های پیشرفته."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7در حال بارگذاری {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7پیکربندی {arena} لغو شد!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aبه نقطه بازپیدایش میدان &6{arena}&a انتقال یافتید.");
        yml.addDefault(Messages.SETUP_GREETING, "&aدرود {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fلطفاً نقطه انتظار را تنظیم کنید.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fاین جایگاهی است که بازیکنان تا آغاز بازی در آن منتظر می‌مانند.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6برای تنظیم لابی انتظار اینجا کلیک کنید    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dبرای تنظیم نقطه انتظار کلیک کنید.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eیا بنویسید: &7/{command} تا فهرست فرمان‌ها را ببینید.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fنمایش فهرست فرمان‌ها.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6مولد {generator} برای گروه {teamColor}{team} افزوده شد");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6نقطه بازپیدایش تنظیم شد");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6تخت تنظیم شد");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6فروشگاه تنظیم شد");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6ارتقا تنظیم شد");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6غنیمت کشتن {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} تنظیم شد");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "آهن");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "طلا");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "زمرد");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "الماس");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "گروه‌های موجود: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cآغاز نشست پیکربندی ممکن نشد. لطفاً کنسول را بررسی کنید.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cپشتیبانی Vault در دسترس نیست!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lخطا: این کار به پشتیبانی Vault نیاز دارد! لطفاً افزونه Vault را نصب کنید!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7تابلو برای میدان {arena} ذخیره شد");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7هنوز هیچ میدانی تنظیم نکرده‌اید!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 دوباره بارگذاری شد! (افزونه‌ها را دوباره بارگذاری نکنید)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lهالووین مبارک!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} امتیاز تجربه!");
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8ارتقاهای گروه");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

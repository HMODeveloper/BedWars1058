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

public class Hindi extends Language {
    public Hindi() {
        super(BedWars.plugin, "hi");

        YamlConfiguration yml = getYml();
        yml.options().copyDefaults(true);
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Hindi");

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
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "server.properties mein spawn-protection enabled hai; yeh BedWars maidans ko prabhavit kar sakta hai. Ise 0 par set karne ki salah di jati hai.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Multiverse-Core ka pata chala hai; ise hata dein ya sunishchit karein ki yeh BedWars maps ko modify na kare.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Bukkit worlds container se {world} load kiya ja raha hai.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Naya void map banaya ja raha hai: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7उपयोगकर्ता आईडी: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7डाउनलोड आईडी: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Taiyari janch suvidha ko chalu ya band karein.");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eAbhi ke maidan mein sandesh bhejein");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fApne maidan ke sabhi khiladiyon ko sandesh bhejein.\n&fUpyog: /{command} echo <sandesh>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cPrashasak&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eKisi maidan mein sandesh bhejein");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fChune hue maidan ke sabhi khiladiyon ko sandesh bhejein.\n&fUpyog: /{command} echoto <arena> <sandesh>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eSabhi maidan mein sandesh bhejein");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fSabhi maidan ke khiladiyon ko sandesh bhejein.\n&fUpyog: /{command} echoall <sandesh>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cUpyog: /bw echo <sandesh>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&a{arena} maidan mein sandesh bheja gaya");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cAp kisi maidan mein nahi hain.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cUpyog: /bw echoto <arena> <sandesh>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&a{arena} maidan mein sandesh bheja gaya");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cUpyog: /bw echoall <sandesh>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aSabhi maidan mein sandesh bheja gaya.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cMaidan nahi mila: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cYe command sirf khiladiyon ke liye hai.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aAp ab taiyar hain!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aAp ab taiyar nahi hain.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aSabhi khiladi taiyar hain! Countdown 10 second ka ho gaya!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aTaiyari ki jaanch chalu hai.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aTaiyari ki jaanch band hai.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cYe command band hai.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cAp game mein nahi hain!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cAbhi ye command use nahi kar sakte.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cDekhne wala ye command use nahi kar sakte.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aTaiyar");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cTaiyar nahi");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Taiyar hone ke liye daaya dabayein karein!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Taiyari hatane ke liye daaya dabayein karein!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Game shuru karne ke liye khiladi kam hain!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aVanilla tamashagar mode chalu ho gaya.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aSamanya tamashagar mode chalu ho gaya.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cBhandar bhar gaya!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aPehna hua!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Upalabdh bhaasa:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Upyog: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cYe bhaasa maujud nahi hai!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aBhaasa badal gaya!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cAp game ke beech mein bhaasa nahin badal sakte.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Upyog: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cKoi maidan ya maidan group nahi mila: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cYe maidan purna hai!\n&aAur features ke liye daan dein karein. &7&o(dabayein)");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cIs samay koi bhee maidan upalabdh nahin hai ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cHam khama chahte hein lekin ye maidan purna hai.\n&cHam jante hei ki ap ek kharidaar ho lekin ye maidan karmand or/aur donator se bhara hai.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cIs maidan shamil karne liye apka dal bohot bada hai. :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cKeeval Leader maidan select kar sakte hai.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &eshamil kiye (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Ap abhi §9{arena} §6dekhein kar rahe hai.\n{prefix}§eAp kabhi bhi §c/leave §euse karke niklein kar sakte hai.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cIs maidan me tamashagarha mojaz ast nahi hain!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cKhiladi nahi miley!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cYe khiladi ek maidan me nahi hein!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cYe khiladi jis maidan me hai wo maidan abhi bhi shuru nahi hua!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cUpyog: /bw tp <khiladi>");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cReshamil karne ke liye koi maidan nahi hai!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cAp is maidan ko aur reshamil nahi kar sakte. Game khatam ho gaya ya apka Bistar nasht ho gaya.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eAp &a{arena} &emaidan shamil kar rahe hai!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &ereconnect kiye!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cAp maidan me nahi ho!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &eniklein kiye!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cAp game ke dauraan ye nahi kar sakte.");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cCommand nahi mila ya apka command use karne ka permission nahi hai");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aDal ke command:",
                "&e/party help &7- &bYe madad sandesh dekhein",
                "&e/party invite <khiladi> &7- &bKhiladi ko dal me invite karte hai",
                "&e/party leave &7- &bDal niklein karte hai",
                "&e/party remove <khiladi> &7- &bKhiladi ko dal se remove karte hai",
                "&e/party info &7- &bDal ke sadasya aur malik dekhein",
                "&e/party promote <khiladi> &7- &bDal ka netritva saupein",
                "&e/party accept <khiladi> &7- &bDal invite accept karte hai",
                "&e/party disband &7- &bDal disband karte hai")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eUpyog: &7/party invite <khiladi>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&7{player} &ako dal pe invite kiye&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &eapko dal pe invite kiye! &o&7(Accept karne ke liye dabayein kare)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cAp khud ko invite nahi kar sakte!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eoffline hai!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cKoi bhi dal request nahi hai");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eAp pehle se hee ekta dal pe hai!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cSirf dal owner ye kar sakte hai!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eUpyog: &7/party accept <khiladi>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &edal shamil kiye!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cAp dal me nahi hai!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cAp khudke dal niklein nahi kar sakte!\n&b/party disband &euse karne ki koshir kare.");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &edal niklein kiye!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eDal disband ho gaya!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Upyog: &e/party remove <khiladi>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &edal se hata diya gaya,");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &eapke dal pe nahi hai!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eApne {player} ko dal ka malik banaya");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eAp dal ke malik ban gaye hain");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} dal ke malik ban gaye hain");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eDal r malik: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eDal ke sadasya:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Ap khel nahi rahe!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Countdown chota ho gaya!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Ap maidan forceshuru nahi kar sakte.\n§7Aur features ke liye daan dein karein.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cAp ise abhi bhi kar nahi sakte! Aur {seconds} second intezar karein!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cKhama kare, lekin apako bahar nikaal diya gaya kyonki ek kharidaar maidan mein shaamil ho gaye.\n&aAur features ke liye daan dein karein. &7&o(dabayein)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cParyaapt khiladis nahi hai! Countdown stop ho gaya!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eApka shamil kiya hua maidan dobara shuru no hara hai.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cKhel rahe hain");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Dobara shuru ho raha hai");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Intezaar §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Shuru §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Arena Chune");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Sthiti: {status}", "&7Khiladi: &f{on}&7/&f{max}", "&7Prakar: &a{group}", "", "&aBaaye-dabayein mein shamil hone ke liye.", "&eDaaye-dabayein dekhne ke liye."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eYe game &6{time} &emey shuru hoga!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cAur khiladis ke liye intezar kar rahe hai..");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aCHALIYE");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                &lBedWars", "",
                "&e&l    Apke bistar ka rakhsha kare aur dushman ka bistar nasht kare.",
                "&e&l             Shaktishali unnayan upayog karane ke liye",
                "&e&l     Generator se Iron, Gold, Emerald aur Diamond ikattha karke",
                "&e&l              Khudko aur apke dal ko unnayan kare.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cKhama kare lekin is samay ap ye maidan me shamil nahi ho sakte. Dekhein karne ke liye Daaye-dabayein kare!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cKhama kare lekin is samay ap ye maidan ko dekhein nahi kar sakte. Shamil karne ke liye Baaye-dabayein kare!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cKhama kare lekin aapako BedWarsProxy ka upayog karke ek maidan shamil karna padega. \n&eAgar ap ek maidan setup karna chahte hai to ap khudko bw.setup permission dein taaki ap directly server shamil kar sake!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teleporter");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Swasthya: &f{health}%", "&7Bhojan: &f{food}", "", "&7Dekhein karne ke liye Baaye-dabayein kare"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lLobby pe wapas jaye");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Lobby niklein karne ke liye Daaye-dabayein kare!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aDekh rahe hain &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cExit karne ke liye SNEAK kare");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eDekhne wala mode se bahar nikal rahe hai");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cDal ke owner niklein kiye aur dal disband ho gaya!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eTier &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamond");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEmerald");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eAayega &c{seconds} &esecond");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Janaks &eunnayan hua star tak &c{tier}");
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
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 AAP");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fAnusaran: {team} &f- Doori: {distance}m");
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
        yml.addDefault(Messages.MEANING_FULL, "Purna");
        yml.addDefault(Messages.MEANING_SHOUT, "chillana");
        yml.addDefault(Messages.MEANING_NOBODY, "Koi nahi");
        yml.addDefault(Messages.MEANING_NEVER, "Kabhi nahi");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Iron");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Iron");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Gold");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Gold");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Emerald");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Emeralds");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamond");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamonds");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cAp yahape blocks place nahi kar sakte!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cAp sirf ek khiladi dvaara place kiye gaye blocks tod sakte hai!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cAp khudke bistar nahi tod sakte!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lBISTAR NASHT > {TeamColor}{TeamName} {PlayerColor}{PlayerName} &7ke bistar nasht kiye!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cBED TUTA!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fAp aur repsawn nahi ho sakte!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lBISTAR NASHT > {PlayerColor}{PlayerName} &7Apka bistar nasht kiye!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cAp ye chest open nahi kar sakte kyuki ye dal eliminate nahi hua hai!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cAp ab invisible nahi rahe kyuku apne damage kiya hein!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7void me gire.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7void me gire. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{KillerColor}{KillerName} {PlayerColor}{PlayerName} &7ko void me gira diye.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{KillerColor}{KillerName} {PlayerColor}{PlayerName} &7ko void me gira diye. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7ke sath fight karne ke waqt disconnect kiye.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7ke sath fight karne ke waqt disconnect kiye. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7dvaara diye gaye.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7dvaara diye gaye. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7ke bomb dvaara gire.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7ke bomb dvaara gire. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7Ek bomb se mar gaye.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7Ek bomb se mar gaye. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7Dvaara mare gaye.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7Dvaara mare gaye. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7mar gaye.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7mar gaye. &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7ke teer se mare!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerName} &7ke teer se mare! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}&7 ne BedBug se mare!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}&7 ne BedBug se mare! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}&7 ne Iron Golem se mare!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} {KillerColor}{KillerTeamName}&7 ne Iron Golem se mare! &b&lANTIM HATYA!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cAP MAR GAYE!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eAp &c{time} &esecond me reutpan honge!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eAp &c{time} &esecond me reutpan honge!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aAP RESPAWN HO GAYE!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cAp eliminate ho gaye!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7Ka &c{amount} &7HP baki hai!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lGAME KHATAM HO GAYA!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVIJAY!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &adal game jeete!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &lPehla Killer &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                        &lDusra Killer &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                        &lTeesra Killer &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lApke bistar ko rakhsha kare!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lApka bistar tut gaya!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bDAL UNNAYAN,&e&lDAAYA DABAYEIN");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bEKAL UNNAYAN,&e&lDAAYA DABAYEIN");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bDAL DUKAN,&e&lDAAYA DABAYEIN");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bSAMAN DUKAN,&e&lDAAYA DABAYEIN");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lDAL BAD HUA > {TeamColor}{TeamName} Dal &celiminate ho gaya!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cBistar vinash");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamond unnayan II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamond unnayan III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fAchanak maut");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEmerald unnayan II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEmerald unnayan III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Khel samapt");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cBED TUTA!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fSabhi bistar nasht ho gaya!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lSabhi bistar nasht ho gaya!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cAchanak maut");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cACHANAK MAUT: &6&b{TeamDragons} {TeamColor}{TeamName} Dragon!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} BedWars praapt kiye (Khelne ka samay).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} BedWars praapt kiye (Khel ki jeet).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} BedWars Anubhav praapt kiye (Dal ki sahayata).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} BedWars Anubhav praapt kiye (Bistar nasht).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} BedWars Anubhav praapt kiye (Samanya hatya).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} BedWars Anubhav praapt kiye (Antim hatya).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Sikke mile (Khelne ka samay).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Sikke mile (Khel ki jeet).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Sikke mile (Dal ki sahayata).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Sikke mile (Bistar nasht).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Sikke mile (Antim hatya).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Sikke mile (Samanya hatya).");

        /* Lobby Command Samagris */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eAankde");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fAankde dekhne ke liye Daaye-dabayein kare!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eMaidan chayan");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fMaidan choose karne ke liye Daaye-dabayein kare!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eHub par lautain");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBedWars niklein karne ke liye Daaye-dabayein kare!"));
        /* Pre Game Command Samagris */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eAankde");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fAankde dekhne ke liye Daaye-dabayein kare!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eLobby par lautain");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBedWars niklein karne ke liye Daaye-dabayein kare!"));
        /* Dekhne wala Command Samagris */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeleporter");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eLobby wapas jaye");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fMaidan nikleinv karne ke liye Daaye-dabayein kare!"));

        /* save default vastus messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8{player} Aankde");
        addDefaultStatsMsg(yml, "wins", "&6Jeet", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Haar", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Hatya", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Mauten", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Antim hatyas", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Final Mauten", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Tooti hui bistar", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Pehli khel", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Aakhri khel", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Khele gaye khel", "&f{gamesPlayed}");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fAapka star: {level}",
                "",
                "&fPragati: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fSikke: &a{money}" ,
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
                "&fKhiladi: &a{on}/{max}",
                "",
                "&fIntezaar,&fIntezaar.,&fIntezaar..,&fIntezaar...",
                "",
                "&fPrakar: &a{group}",
                "&fSanskaran: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",

                "&7{date} &8{server}",
                "&o&lDekh rahe hain",
                "&fManch: &a{map}",
                "",
                "&fKhiladi: &a{on}/{max}",
                "",
                "&fIntezaar,&fIntezaar.,&fIntezaar..,&fIntezaar...",
                "",
                "&fPrakar: &a{group}",
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
                "&fKhiladi: &a{on}/{max}",
                "",
                "&f{time}s mein &ashuru",
                "",
                "§fPrakar: &a{group}",
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
                "&fKhiladi: &a{on}/{max}",
                "",
                "&f{time}s mein &ashuru",
                "",
                "§fPrakar: &a{group}",
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
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "Doubles"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Dekh rahe hain {spectatorTarget}",
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
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "Doubles"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Dekh rahe hain {spectatorTarget}",
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
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
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
                "",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Dekh rahe hain {spectatorTarget}",
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
                "&f{nextEvent} ke baad &a{time}",
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
                "&f{nextEvent} ke baad &a{time}",
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
                "&f{nextEvent} ke baad &a{time}",
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
                "&7&oआप दर्शक हैं"
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
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oDekhne wala "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oBahar {teamColor}&o{teamName}", " {teamColor}&oBahar {vPrefix}", "{teamColor}&oBahar {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Manch: &f{map} &7Prakar: &f{group}",
                "",
                "{nextEvent} ke baad {time}",
                "",
                "&7&oआप दर्शक हैं"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy} se sanchalit",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oDekhne wala "));
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
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oBahar", " {level}", " &c&oBahar"));
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
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oBahar", " {level}", " &c&oBahar"));
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
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oDekhne wala "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Tvarit Kharid");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Tvarit Kharid me jode...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cApke paas paryaapt {currency} nahi hai! Apko aur {amount} jarurat hai!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aApne &6{item} &akharida");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cAp ise pehle se khareed chuke hain!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Bibhag");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Samagri"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bTvarit Kharid");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cKhali slot!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Ye ek Tvarit Kharid Slot hai!", "&7Koi vastu add karne ke liye", "&7Yahape &bSneal Dabayein &7kare."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eKharid karne ke liye dabayein kare!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cApke paas paryaapt {currency} nahi hai!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aPuri tarah!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&7Tvarit Kharid pe add karne ke liye &bchupke Dabayein &7kare");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&7Tvarit Kharid se remove karne ke liye &bchupke Dabayein &7kare");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Block", "&aBlock", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wool", Arrays.asList("&7Moolya: &f{cost} {currency}", "", "&7Dweep ke beech pul banane ke liye upyogi", "&7dweepon par. Aapki dal ke",
                "&7color.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Hardened Clay", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Bistar ki raksha ke liye mool block.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Blast-Proof Glass", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Visphoton se surakshit.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}End Stone", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Bistar ki raksha ke liye majboot block.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Ladder", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Pedon mein fanse billi ko bachane ke liye", "&7upyogi.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidian", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Aapke bistar ki behtareen raksha.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lakdi", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Bistar ki raksha ke liye majboot block.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Nazdeeki", "&aNazdeeki", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Pathar ki Talwar", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Iron ki Talwar", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Diamond ki Talwar", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Lathi (KnockBack I)", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Bormo", "&aBormo", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Sthayi Chainmail Bormo", Arrays.asList("&7Moolya: {cost} {currency}",
                "", "&7Chainmail ki leggings aur jute", "&7ke saath hamesha janm lenge.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Sthayi Iron Bormo", Arrays.asList("&7Moolya: {cost} {currency}",
                "", "&7Iron ki leggings aur jute ke", "&7saath hamesha janm lenge.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Sthayi Diamond Bormo", Arrays.asList("&7Moolya: {cost} {currency}",
                "", "&7Diamond ki leggings aur jute ke", "&7saath hamesha janm lenge.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Jontro", "&aJontro", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Sthayi Kainchi", Arrays.asList("&7Moolya: {cost} {currency}",
                "", "&7Wool hatane ke liye behtareen.", "&7In kainchiyon ke saath hamesha", "&7janm lenge.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kudali {tier}", Arrays.asList("&7Moolya: {cost} {currency}", "&7Star: &e{tier}",
                "", "&7Yeh unnayan yogya vastu hai.", "&7Maut par 1 star kho jayega!", "", "&7Hamesha kam se kam", "&7sabse nichle star ke saath", "&7punarjanm lenge.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kulhadi {tier}", Arrays.asList("&7Moolya: {cost} {currency}", "&7Star: &e{tier}",
                "", "&7Yeh unnayan yogya vastu hai.", "&7Maut par 1 star kho jayega!", "", "&7Hamesha kam se kam", "&7sabse nichle star ke saath", "&7punarjanm lenge.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Durer", "&aDurer", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Teer", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhanush", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhanush (Power I)", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Dhanush (Power I, Punch I)", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Jadu oshudh", "&aJadu oshudh", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Gati {level} Oshudh ({duration} second)", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Chhalang {level} Oshudh ({duration} second)", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Adrishyata Oshudh ({duration} second)", Arrays.asList("&7Moolya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Upokoron", "&aUpokoron", Collections.singletonList("&eDekhne ke liye dabayein karein!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sone ka Seb", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Sampoorna upchar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}BedBug", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Jahan",
                "&7barf ka gola girkar aapke", "&7dushmanon ko bhatkata hai. 15 second tak.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sapna Rakshak", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Iron Golem aapke base ki raksha mein",
                "&7base ki raksha karta hai. 4 minute tak.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Aag ka Gola", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Chhodne ke liye Daaye-dabayein! Behtareen",
                "&7pul par chalne wale dushmanon ko peeche dhakelne ke liye", "&7patle pul", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Turant jalta hai, cheezon ko",
                "&7cheezen udaane ke liye!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender Moti", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Dushman ke base par hamla karne ka",
                "&7bases par hamla karne ka", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Paani ki Balti", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Nazdeek aa rahe dushmanon ko dheema karne",
                "&7enemies. Can also protect", "&7against TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Pul ka Anda", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Yeh anda phenke jaane par",
                "&7phenkne par apne raste mein pul banata hai.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Jadui Doodh", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Khaane ke baad 60 second tak",
                "&7khane ke baad second tak fand sakriya nahi hoga.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sponge", Arrays.asList("&7Moolya: {cost} {currency}", "", "&7Paani sokhne ke liye behtareen.",
                "", "{quick_buy}", "{buy_status}"));

        //
        yml.addDefault(Messages.MEANING_NO_TRAP, "Koi fand nahi!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Moolya: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Kharid karne ke liye Dabayein kare!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Apke paas paryaapt {currency} nahi hai");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBand");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}Khula");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} kharida &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Iron Bhatti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Apne dweep par resource utpadan badhaen.", "&7", "", "{tier_1_color}Star 1: +50% Sansadhan, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Star 2: +100% Sansadhan, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Star 3: Emerald paida karein, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Star 4: +200% Sansadhan, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Sone ki Bhatti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Emerald Bhatti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Pighli Bhatti");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eFand kharidein");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Kharide gaye fand", "&7daayi taraf jama honge.", "", "&eDekhne ke liye dabayein karein!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Tez Talware");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Aapki dal hamesha paati hai", "&7Sharpness I sabhi talwaron par", "&7kulhadiyon par!", "", "{tier_1_color}&7Moolya: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Mazboot Bormo I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Aapki dal hamesha paati hai", "&7sabhi bormo par Protection!", "", "{tier_1_color}Star 1: Protection I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Star 2: Protection II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Star 3: Protection III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Star 4: Protection IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Mazboot Bormo II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Mazboot Bormo III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Mazboot Bormo IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Pagal Khoni I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Aapke dal ke sabhi khiladi", "&7hamesha Haste paate hain.", "", "{tier_1_color}Star 1: Haste I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Star 2: Haste II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Pagal Khoni II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Niramay Kund");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Regeneration ka kshetra banata hai", "&7aapke base ke charon or!", "", "{tier_1_color}Moolya: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Dragon Shakti");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Aapki dal ke paas 2 dragons honge", "&7deathmatch mein 1 ke bajay!", "", "{tier_1_color}Moolya: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Kharidne yogya");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Fandon ki sari"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Fand #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Aapke base mein chal kar aane wala pehla", "&7dushman is fand ko sakriya karega!", "&7yeh fand!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7Fand kharidne par", "&7yeh yahan jama hoga. Iski keemat", "&7jama fandon ki sankhya ke", "&7anusaar badhegi.", "", "&7Agla fand: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Fand #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7doosra dushman jo aapke base mein", "&7dushman is fand ko sakriya karega!", "&7yeh fand!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7Fand kharidne par", "&7yeh yahan jama hoga. Iski keemat", "&7jama fandon ki sankhya ke", "&7anusaar badhegi.", "", "&7Agla fand: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Fand #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7teesra dushman jo aapke base mein", "&7dushman is fand ko sakriya karega!", "&7yeh fand!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7Fand kharidne par", "&7yeh yahan jama hoga. Iski keemat", "&7jama fandon ki sankhya ke", "&7anusaar badhegi.", "", "&7Agla fand: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Yeh ek fand hai!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&75 second ke liye Andhapan aur dheemapan", "&7deta hai.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Counter-Offensive Fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Aapke base ke paas mitra khiladiyon ko", "&715 second ke liye Gati I deta hai.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Alarm Fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Adrishya khiladiyon aur", "&7unka naam aur dal dikhata hai.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Miner Fatigue Fand");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&710 second ke liye", "&7Mining Fatigue deta hai.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aWapas");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7दल के सुधार पर वापस जाएँ"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Fand jama karein");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cFandon ki sari bhari hai!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} sakriya ho gaya!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cFAND SAKRIYA!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fAapka {trap} sakriya ho gaya!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lAlarm fand sakriya kiya &7&l{player} &c&lse {color}&l{team} &c&ldal ne!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARM!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fAlarm fand sakriya kiya {color}{team} &fdal ne!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNaam set nahi hai");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cLore set nahi hai"));
yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7एरीना {arena} मौजूद नहीं है!");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} को समूह {group} में जोड़ा गया");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7समूह बनाया गया!");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "एरीना समूह बनाएँ। अधिक जानकारी हमारी विकी पर देखें।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fडिफ़ॉल्ट");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7समूह हटा दिया गया!");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eविवरण देखने के लिए दबाएँ");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fएरीना समूह प्रबंधित करें।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7यह समूह पहले से मौजूद है!");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7उपलब्ध एरीना समूह:");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "उपलब्ध समूह देखें।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7यह समूह मौजूद नहीं है!");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "एरीना समूह हटाएँ। अधिक जानकारी हमारी विकी पर देखें।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "एरीना समूह निर्धारित करें। अधिक जानकारी हमारी विकी पर देखें।");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7इस नाम का कोई समूह नहीं है: {group}");
yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} सेट)");
yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fउपलब्ध एरीना दिखाएँ");
yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cदिखाने के लिए कोई एरीना नहीं है।");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "आईडी: §e{arena} §fसमूह: §e{group} §fखिलाड़ी: §e{players} §fस्थिति: {status} §fविश्व लोड स्थिति: §e{worldLoaded}");
yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 सक्रिय खेल: \n ");
yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7अगले पृष्ठ के लिए /§a{command} arenaList {page}§7 लिखें।");
yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7उपयोग: §o/{command} {subcommand} <mapName>");
yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7अब आप ब्लॉक रख या तोड़ नहीं सकते!");
yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §eनिर्माण अनुमति");
yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fनिर्माण सत्र चालू या बंद करें \n§fताकि आप ब्लॉक तोड़ या रख सकें।");
yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7अब आप ब्लॉक रख और तोड़ सकते हैं।");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7मानचित्र का विन्यास कॉपी करते समय त्रुटि हुई। कंसोल जाँचें।");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7कृपया पहले {arena} को बंद करें!");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fमौजूदा एरीना की प्रतिलिपि बनाएँ।");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} पहले से मौजूद है!");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7हो गया :D।");
yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7उपयोग: §o/{command} {subcommand} <mapName> <newArena>");
yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "§fइस समय कंसोल के लिए कोई कमांड उपलब्ध नहीं है।");
yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "§f   bw safemode §eचालू/ बंद");
yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7पुष्टि करने के लिए फिर से लिखें।");
yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fमानचित्र और उसका विन्यास हटाएँ।");
yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7यह एरीना मौजूद नहीं है!");
yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} हटा दिया गया!");
yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7उपयोग: §o/{command} delArena <mapName>");
yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7विश्व फ़ोल्डर के रूप में {arena} मौजूद नहीं है!");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7यह एरीना पहले से बंद है!");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fएरीना बंद करें।\nइससे खिलाड़ी हट जाएँगे \n§fऔर एरीना बंद हो जाएगा।");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7इस एरीना में खेल चल रहा है, कृपया खेल समाप्त होने के बाद इसे बंद करें!");
yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7एरीना बंद किया जा रहा है...");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7यह एरीना पहले से चालू है!");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fएरीना चालू करें।");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7यह एरीना पहले से चालू करने की कतार में है!");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7एरीना चालू किया जा रहा है...");
yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7उपयोग: §o/{command} enableRotation <mapName>");
yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8 - §eएरीना का खेल बलपूर्वक समाप्त करें");
yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "§fविजेता के बिना एरीना का खेल बलपूर्वक समाप्त करें।\n§fअनुमति: §c{permission}");
yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "§cखेल चल नहीं रहा है।");
yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "§aखेल बलपूर्वक समाप्त किया जा रहा है...");
yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8 - §eएरीना तुरंत शुरू करें");
yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "§fएरीना तुरंत शुरू करें।\n§fअनुमति: §c{permission}");
yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "§8&l{dot} &6{plugin} v{version} &7- &c प्रशासनिक कमांड");
yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "आपका यहाँ होना अपेक्षित नहीं है।");
yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cएरीना {arena} लोड करने का प्रयास किया गया, लेकिन यह पहले से चालू करने की कतार में है।");
yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cएरीना {arena} लोड करने का प्रयास किया गया, लेकिन यह पहले से चालू है।");
yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "एरीना {arena} के लिए कोई दल निर्धारित नहीं किया गया।");
yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cआपको {arena} पर कम से कम 2 दल निर्धारित करने होंगे।");
yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&c{arena} नाम का कोई मानचित्र मौजूद नहीं है।");
yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cएरीना {arena} में दल {team} का रंग अमान्य है।");
yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&cएरीना {arena} में दल {team} के लिए {setting} निर्धारित नहीं है।");
yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cएरीना {arena} में कोई Diamond जनरेटर निर्धारित नहीं है।");
yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cएरीना {arena} में कोई Emerald जनरेटर निर्धारित नहीं है।");
yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cएरीना {arena} में प्रतीक्षा स्पॉन निर्धारित नहीं है।");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fएरीना का GUI खोलें।");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fनाम या समूह के आधार पर एरीना में शामिल हों।\n&f/{command} join random - किसी भी एरीना में शामिल हों।");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fअपनी भाषा बदलें।");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fएरीना छोड़ें।");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fआँकड़ों का GUI खोलें।");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fMinecraft के सामान्य दर्शक मोड और प्लगइन दर्शक मोड के बीच बदलें।");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eशुरुआत की उलटी गिनती घटाकर 5 सेकंड करें");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fएरीना में शुरुआत की उलटी गिनती 5 सेकंड करें।\n&fअनुमति: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- तैयार होने की स्थिति बदलें।");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7आपको पहले लॉबी का स्थान निर्धारित करना होगा!");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &eखिलाड़ी कमांड देखें");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fखिलाड़ी कमांड देखें।");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &a{world} कमांड");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} द्वारा andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7एरीना: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(निर्धारित नहीं)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(निर्धारित)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oवैकल्पिक");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(सभी निर्धारित)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(शेष: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(स्थान 1 निर्धारित नहीं)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(स्थान 2 निर्धारित नहीं)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(स्वतः खोजें)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} बनाए गए)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (मान {size} निर्धारित)");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fवह स्थान निर्धारित करें जहाँ खिलाड़ियों को\n&fखेल शुरू होने से पहले प्रतीक्षा करनी है।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fशुरुआत पर प्रतीक्षा लॉबी हटाने की व्यवस्था करें।\n&fइसे WorldEdit क्षेत्र के रूप में चुनें।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fदर्शकों के आने का स्थान निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fद्वीपों के रंगों के आधार पर दल बनाएँ।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fएक दल बनाएँ।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fनाम से कोई दल हटाएँ।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fदल के आने का स्थान निर्धारित करें।\n&fजिन दलों का आगमन स्थान निर्धारित नहीं है:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fदल के बिस्तर का स्थान निर्धारित करें।\n&fदल का नाम बताना आवश्यक नहीं है।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fदल का NPC निर्धारित करें।\n&fदल का नाम बताना आवश्यक नहीं है।\n&fयह केवल खेल शुरू होने पर दिखाई देगा।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fदल के सुधार NPC का स्थान निर्धारित करें।\n&fदल का नाम बताना आवश्यक नहीं है।\n&fयह केवल खेल शुरू होने पर दिखाई देगा।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fदुश्मनों को मारने के बाद उनकी वस्तुएँ\n&fगिराने का स्थान निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fजनरेटर का आगमन स्थान जोड़ें।\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fDiamond जनरेटर निर्धारित करने के लिए Diamond ब्लॉक पर खड़े हों।\n&fEmerald जनरेटर निर्धारित करने के लिए Emerald ब्लॉक पर खड़े हों।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fजनरेटर का आगमन स्थान जोड़ें।\n&eदल के जनरेटर के लिए दल के द्वीप पर खड़े हों।\n&fDiamond जनरेटर निर्धारित करने के लिए Diamond ब्लॉक पर खड़े हों।\n&fEmerald जनरेटर निर्धारित करने के लिए Emerald ब्लॉक पर खड़े हों।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fदल में खिलाड़ियों की अधिकतम संख्या निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fएरीना का समूह निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fएरीना को किसी समूह में जोड़ें।");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fएरीना सहेजें और लॉबी पर लौटें।");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7एरीना विन्यास: {config} फिर से लोड किया गया!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} फिर से लोड किया गया!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §eसंदेश फिर से लोड करें");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fसंदेश फिर से लोड करें।\n§cअनुशंसित नहीं!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} फिर से लोड की गई!");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eविवरण देखने के लिए दबाएँ");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fखिलाड़ी का स्तर प्रबंधित करें।");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cमात्रा पूर्णांक होनी चाहिए!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cस्तर पूर्णांक होना चाहिए!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7खिलाड़ी नहीं मिला!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7बदलाव देखने के लिए खिलाड़ी को दोबारा जुड़ना पड़ सकता है।");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "खिलाड़ी का स्तर निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7{player} का स्तर {level} निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7उपयोग: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "खिलाड़ी को अनुभव दें।");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{player} को {amount} xp दिया गया");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7उपयोग: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "उपयोग करने के लिए दबाएँ।");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7उपयोग: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7इस एरीना §7समूह में खिलाड़ियों की संख्या के लिए §e{players} §7का उपयोग कर सकते हैं।");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bनिर्धारित किया गया!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §eप्रवेश NPC बनाएँ");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fप्रवेश NPC बनाएँ  \n§fअधिक जानकारी के लिए दबाएँ।");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fप्रवेश NPC बनाने के लिए यह कमांड चलाएँ।\n§fप्रारूप देखने के लिए दबाएँ।");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7उपयोग: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fNPC हटाने के लिए उसके सामने खड़े हों।");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7उपयोग: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bआस-पास कोई NPC नहीं है।");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bअभी तक कोई NPC निर्धारित नहीं किया गया!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bचुना हुआ NPC हटा दिया गया!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bलक्षित समूह: §6{groups}");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7आप पहले से ही सेटअप सत्र में हैं!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 में बड़े अक्षर नहीं होने चाहिए! फ़ोल्डर का नाम बदलकर यह रखें: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7कृपया पहले इसे बंद करें!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fएरीना बनाएँ या उसमें बदलाव करें।\nएरीना के नाम में '_' और '-' दिखाई नहीं देंगे।");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} में यह चिह्न नहीं होना चाहिए: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7उपयोग: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lमिले हुए दल बनाने के लिए यहाँ दबाएँ।");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fमिले हुए दल बनाने के लिए दबाएँ!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lनए दल मिले:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7कोई नया दल नहीं मिला।\n§6 ▪ §7दल स्वयं बनाने के लिए यह कमांड चलाएँ: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7दल खोजे जा रहे हैं। इससे खेल धीमा हो सकता है।");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7समय समाप्त हुआ। दल खोजने के लिए फिर से कमांड चलाएँ।");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fयदि आप चाहते हैं कि खेल शुरू होते ही लॉबी हट जाए,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lप्रतीक्षा लॉबी हटाना:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7यह चरण वैकल्पिक है। इसे छोड़ने के लिए §6/{command} चलाएँ");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fनीचे दिए गए आदेशों का उपयोग WorldEdit चयन की तरह करें।");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "उपलब्ध दल: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6बिस्तर निर्धारित");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "दल का बिस्तर जोड़ें।");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "{team} के लिए बिस्तर निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§a{team} के लिए बिस्तर निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fदल का बिस्तर निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cइस कमांड का उपयोग करते समय आपको बिस्तर पर खड़ा होना होगा!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cआपको बिस्तर पर खड़ा होना होगा।");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§f{team} का बिस्तर निर्धारित करें");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7अधिकतम निर्माण ऊँचाई Y को §e{height}§7 निर्धारित किया गया!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7उपयोग: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7उपलब्ध रंग: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7बना दिया गया!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7{team} दल पहले से मौजूद है!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7रंग मान्य नहीं है!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7उपयोग: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "{generator} जनरेटर जोड़ दिया गया!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a जनरेटर जोड़ा गया!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "दल का जनरेटर जोड़ें।\nदल अपने आप पहचाना जाएगा।");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "यह कमांड आज़माएँ: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{team} दल के लिए {generator} जनरेटर जोड़ा गया");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "{team} दल के लिए {generator} जनरेटर जोड़ा गया");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6{team} दल के लिए §a{generator}§a जनरेटर जोड़ दिया गया!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (दल अपने आप पहचानें)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "दल बनाना हो तो यह चलाएँ: /bw createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cयह जनरेटर पहले से निर्धारित है!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cयह जनरेटर पहले से निर्धारित है!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} निर्धारित");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "दूसरा उपयोग: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Emerald या Diamond जनरेटर जोड़ें।");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6दल {team} के लिए जनरेटर निर्धारित");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "दल का जनरेटर जोड़ें।");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cदल नहीं मिला: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "दल {team} के लिए जनरेटर निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aदल {team} के लिए जनरेटर निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "पहले दल बनाएँ!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cपहले दल बनाएँ!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6{team} की मृत्यु पर गिरने वाली वस्तुएँ");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "दल की मृत्यु-वस्तुओं का स्थान निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "{team} के लिए मृत्यु-वस्तुओं का स्थान निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ {team} की मृत्यु-वस्तुएँ (निर्धारित करने के लिए दबाएँ)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§f{team} के लिए मृत्यु-वस्तुएँ निर्धारित करें");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "दल {team} के लिए मृत्यु-वस्तुओं का स्थान निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aदल {team} के लिए मृत्यु-वस्तुओं का स्थान निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cउपयोग: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7दल में अधिकतम खिलाड़ियों की संख्या निर्धारित की गई!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7उपयोग: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cआस-पास कोई दल नहीं मिला।");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cआस-पास कोई दल नहीं मिला।");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7आप किसी सेटअप सत्र में नहीं हैं!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "आस-पास कोई जनरेटर नहीं मिला (सीमा 2x2)।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cआस-पास कोई जनरेटर नहीं मिला।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "स्थान X:{x} Y:{y} Z:{z} से {generator} जनरेटर हटाया गया");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§a{generator} जनरेटर हटा दिया गया।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "जिस जनरेटर का होलोग्राम हटाना है, उसके पास खड़े हों।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §a{generator} जनरेटर हटा दिया गया।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "{team} के जनरेटर हटा दिए गए!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "स्थान X:{x} Y:{y} Z:{z} से दल {team} का {generator} जनरेटर हटाया गया");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "{team} का जनरेटर हटा दिया गया।");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7{team} हटाएँ §7(हटाने के लिए दबाएँ)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "यह दल मौजूद नहीं है: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cदल नहीं मिला: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "दल हटाया गया: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aदल हटाया गया: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cउपयोग: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "अब आप इसे इस कमांड से चालू कर सकते हैं:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aयह एरीना चालू करें।");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (चालू करने के लिए दबाएँ)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "एरीना के बदलाव सहेज दिए गए!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6दुकान निर्धारित");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "दल की दुकान निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "अन्य उपयोग: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "{team} के लिए दुकान निर्धारित की गई");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7{team} के लिए दुकान निर्धारित करें");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6आगमन स्थान निर्धारित");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "शेष: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ {team} के लिए आगमन स्थान निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "दल सूची: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "{team} के लिए आगमन स्थान निर्धारित करें (निर्धारित करने के लिए दबाएँ)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§f{team} के लिए आगमन स्थान निर्धारित करें");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cलक्षित दल नहीं मिला: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cउपयोग: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "दर्शक का स्थान निर्धारित किया गया!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cउपयोग: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "यदि आगमन स्थान तय करने के बाद दल अपने आप नहीं मिला, तो यह चलाएँ: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cयह दल मौजूद नहीं है!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(निर्धारित करने के लिए दबाएँ)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "पहले दल का आगमन स्थान निर्धारित करना सुनिश्चित करें!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fदल का आगमन स्थान निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9उपलब्ध प्रकार: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7एरीना समूह का प्रकार बदलकर §d{type} कर दिया गया");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(निर्धारित करने के लिए दबाएँ)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dएरीना को {type} बनाने के लिए दबाएँ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7उपयोग: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6सुधार निर्धारित");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "दल के लिए सुधार NPC निर्धारित करें।");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "{team} के लिए सुधार NPC निर्धारित किया गया");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§f{team} के लिए सुधार NPC निर्धारित करें");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dस्थान {position} निर्धारित करें");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7शेष स्थान निर्धारित करें:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7स्थान {position} निर्धारित किया गया!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7यदि दलों के आगमन स्थान तय नहीं किए हैं, तो अब करें!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7उपयोग: /{command} {subcommand} 1 या 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7§e{arena}§7 के लिए प्रतीक्षा स्थान निर्धारित किया गया!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aमुख्य लॉबी निर्धारित करें। §fयह आवश्यक है, लेकिन\n§fयदि सर्वर §eBUNGEE §fमोड में चलाएँगे,\n§fतो लॉबी का स्थान §eउपयोग नहीं §fहोगा।\n§eपुराना आगमन स्थान बदलने के लिए कमांड फिर से चलाएँ।");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4यह कमांड एरीना में नहीं चलाई जा सकती। यह मुख्य लॉबी के लिए है!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(निर्धारित नहीं)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(निर्धारित)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7लॉबी का स्थान निर्धारित किया गया!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "§6+{xp} xp!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 फिर से लोड किया गया! (प्लगइन फिर से लोड न करें)");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "उपलब्ध दल: ");
        yml.addDefault(Messages.SETUP_CANCELLED, "§6 ▪ §7{arena} का सेटअप रद्द किया गया!");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "§eया कमांड सूची देखने के लिए लिखें: §7/{command}");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "§fकमांड सूची दिखाएँ।");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "हीरा");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "पन्ना");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "सोना");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "लोहा");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "§6{generator} निर्धारित");
        yml.addDefault(Messages.SETUP_GREETING, "§aनमस्ते {player}!");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "§8सेटअप का तरीका चुनें");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "§e§lनिर्देशित सेटअप");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "§aआसान और तेज़ सेटअप!", "§7शुरुआती और आलसी कर्मचारियों के लिए :D", "", "§3कम विकल्प।"));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "§c§lविस्तृत सेटअप");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "§aविस्तृत सेटअप!", "§7अनुभवी कर्मचारियों के लिए :D", "", "§3विस्तृत विकल्प।"));
        yml.addDefault(Messages.SETUP_LOADING, "§6 ▪ §7{arena} लोड हो रहा है");
        yml.addDefault(Messages.SETUP_START_FAILED, "§cसेटअप सत्र शुरू नहीं हो सका। कृपया कंसोल जाँचें।");
        yml.addDefault(Messages.SETUP_TELEPORTED, "§aआपको §6{arena}§a के आगमन स्थान पर भेज दिया गया।");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "§fकृपया प्रतीक्षा स्थान निर्धारित करें।");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "§fयहीं खिलाड़ी खेल शुरू होने तक प्रतीक्षा करेंगे।");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "§9     ▪     §6प्रतीक्षा लॉबी निर्धारित करने के लिए यहाँ दबाएँ    §9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "§dप्रतीक्षा स्थान निर्धारित करने के लिए दबाएँ।");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "§6{teamColor}{team} दल के लिए {generator} जनरेटर जोड़ा गया");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} §6आगमन स्थान निर्धारित");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} §6बिस्तर निर्धारित");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} §6दुकान निर्धारित");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} §6सुधार निर्धारित");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "§6{team} की मृत्यु-वस्तुएँ");
        yml.addDefault(Messages.SIGN_SAVED, "§a▪ §7एरीना {arena} के लिए चिह्न सहेजा गया");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "§c▪ §7आपने अभी तक कोई एरीना निर्धारित नहीं किया!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "§4§lत्रुटि: Vault समर्थन आवश्यक है! कृपया Vault प्लगइन स्थापित करें!");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "§cVault समर्थन उपलब्ध नहीं है!");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "§6§lहैलोवीन की शुभकामनाएँ!");
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8दल के सुधार");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

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

public class Polish extends Language{

    public Polish() {
        super(BedWars.plugin, "pl");
        YamlConfiguration yml = getYml();
        yml.options().header("Polish translation by RarstManPL#0616 and Creper132#7570 Updated by Seriously Not Beluga#0082");
        yml.addDefault(Messages.PREFIX, "");
        yml.options().copyDefaults(true);
        yml.addDefault("name", "Polski");

        // this must stay here
        // move message to new path
        if (yml.get("player-die-knocked-regular") != null && yml.get(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL) == null){
            yml.set(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, yml.getString("player-die-knocked-regular"));
            yml.set("player-die-knocked-regular", null);
        }
        if (yml.get("player-die-knocked-final") != null && yml.get(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL) == null){
            yml.set(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, yml.getString("player-die-knocked-final"));
            yml.set("player-die-knocked-final", null);
        }

        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Uzyj: /" + mainCmd + " join §o<arena/grupa>");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cNie mozesz tego zrobic.");
        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(spectator)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "Opcja spawn-protection w pliku server.properties jest włączona; może to wpływać na areny BedWars. Zalecamy ustawić ją na 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Wykryto Multiverse-Core; usuń go lub upewnij się, że nie modyfikuje map BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Wczytywanie {world} z kontenera światów Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Tworzenie nowej pustej mapy: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7Identyfikator użytkownika: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7Identyfikator pobierania: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eWyślij wiadomość na obecną arenę");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fWyślij wiadomość do wszystkich graczy na obecnej arenie.\n&fUżyj: /{command} echo <wiadomość>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperator&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eWyślij wiadomość na wybraną arenę");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fWyślij wiadomość do wszystkich graczy na wybranej arenie.\n&fUżyj: /{command} echoto <arena> <wiadomość>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eWyślij wiadomość na wszystkie areny");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fWyślij wiadomość do graczy na wszystkich arenach.\n&fUżyj: /{command} echoall <wiadomość>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cUżyj: /bw echo <wiadomość>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aWiadomość wysłana na arenę {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cNie jesteś na arenie.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cUżyj: /bw echoto <arena> <wiadomość>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aWiadomość wysłana na arenę {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cUżyj: /bw echoall <wiadomość>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aWiadomość wysłana na wszystkie areny.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cNie znaleziono areny: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cTa komenda jest tylko dla graczy.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aJesteś gotowy!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aNie jesteś już gotowy.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aWszyscy gracze są gotowi! Odliczanie skrócono do 10 sekund!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aSprawdzanie gotowości włączone.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aSprawdzanie gotowości wyłączone.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cTa komenda jest wyłączona.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cNie jesteś w grze!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cNie możesz teraz użyć tej komendy.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cObserwatorzy nie mogą użyć tej komendy.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aGotowy");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cNiegotowy");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Kliknij prawym przyciskiem, aby być gotowym!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Kliknij prawym przyciskiem, aby anulować gotowość!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Za mało graczy, aby rozpocząć grę!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aWłączono tryb obserwatora Vanilla.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aWłączono zwykły tryb obserwatora.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cEkwipunek jest pełny!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aZałożona!");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cTa arena jast pelna!\n&aRozwaz kupno rangi VIP+ aby odblokowac mase nowych funkcji. &7&o(kliknij)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cTa arena jest pelna.\n&cJako VIP mozesz wchodzic na pelne areny, lecz na tej arenie znajduje sie juz 1. lub wiecej vipow.");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cNie istnieje zadna arena o nazwie: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cObecnie nie ma zadnej dostepnej areny ;(");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cNie jestes na arenie!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Dostepne jezyki:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Uzyj: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cTen jezyk nie jest dostepny na serwerze!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aJezyk zostal zmieniony!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cNie znaleziono gracza!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cTego gracza nie ma na arenie!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cArena na której jest ten gracza, jeszcze się nie rozpoczeła!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cUżyj: /bw tp <gracz>");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &eponownie się połączył!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cNie mozesz zmienic jezyka podczas gry.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cTwoje party jest zbyt duze abo dolaczyc do tej areny w pelnym skladzie :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cTylko lider party moze wybrac arene.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &edolaczyl do gry (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &eopuscil gre!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aKomendy grupy:",
                "&e/party help &7- &bPokazuje ta wiadomosc",
                "&e/party invite <player> &7- &bZaprasza gracza do twojego party",
                "&e/party leave &7- &bOpuszczasz obecne party",
                "&e/party info &7- &bPokaż członków i właściciela grupy",
                "&e/party promote <player> &7- &bPrzekaż własność grupy",
                "&e/party remove <player> &7- &bWyrzuca gracza z twojego party",
                "&e/party accept <player> &7- &bAkceptuje zaproszenie do party",
                "&e/party disband &7- &bRozwiazuje party")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eUzyj: &7/party invite <nick>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eZaprosiles gracza &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &ezaprosil cie do swojego party! &o&7(Kliknijaby dolaczyc)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cNie mozesz zaprosic siebie samego!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cNie masz zadnego zaproszenia do party.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eJuz jestes w party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cTylko lider party moze to zrobic!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eUzyj: &7/party accept <nick>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &edolaczyl do party!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cNie jestes w party!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cNie mozesz opuscic swojego party!\n&eSprobuj: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eopuscil party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eParty zostalo rozwiazane!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Uzyj: &e/party remove <nick>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &ezostal wyrzucony z party.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &enie jest w twoim party!!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&ePomyślnie awansowałeś {player} na właściciela");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eZostałeś awansowany na właściciela grupy");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} został awansowany na właściciela");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eWłaścicielem grupy jest: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eCzłonkowie grupy to:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cKomenda nie istnieje lub nie masz do niej uprawnien!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Nie jestes w zadnej grze!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Odliczanie zostalo skrocone!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&cNie mozesz glosowac na natychmiastowy start areny.\n&7Rozwaz kupno rangi VIP+ aby odblokowac mase nowych funkcji!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Obserwujesz teraz arene &9{arena}&6.\n{prefix}§eMozesz opuscic gre wpisujac &c/leave&e.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &ejest offline!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cWidzowie nei mają wstępu na tę arene!");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cNie możesz tego zrobić! Poczekaj {seconds}!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teleporter");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Zycie: &f{health}%", "&7Jedzenie: &f{food}", "", "&7Kliknij lewym by oglądać"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lPowroc do lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Kliknij PPM aby wyjsc do lobby!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aObserwujesz &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cKUCNIJ aby wyjść");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eWychodzisz z trybu widza!");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cZalozyciel party opuscil gre, party zostaje rozwiazane!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cZostales wyrzucony, poniewaz gracz z ranga VIP lub wyzsza dolaczyl na arene.\n&aRozwaz kupno rangi VIP+ aby odblokowac mase nowych funkcji. &7&o(kliknij)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}&cBrak wystarczajacej ilosci graczy! Odliczanie zostalo przerwane!");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eArena na ktorej jestes zostala zrestartowana.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cGra");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Restartowanie");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Oczekiwanie §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Rozpoczynanie §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Dostepne areny");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Status: {status}", "&7Gracze: &f{on}&7/&f{max}", "&7Typ: &a{group}", "", "&aKliknij lewym przyciskiem, aby dołączyć.", "&eKliknij prawym przyciskiem, aby obserwować."));
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eGra zaczyna sie za &6{time} &esekund/y!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cCzekamy na więcej graczy...");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l        Chron swoje lozko i niszcz je innym.",
                "&e&l   Ulepsz wyposazenie swojej druzyny poprzez zdobywanie",
                "&e&lZelaza, Zlota, Szmaragdow, i Diamentow z generatorow ktore znajdziesz",
                "&e&l        na wyspach aby odblokowac potezne ulepszenia.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aZACZYNAMY");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cAktualnie nie możesz dołączyć do tej areny, kliknij PPM aby oglądać arene");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cAktualnie nie możesz obserwować tej areny, kliknij LMP aby dołączyć");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cPrzykro nam, ale musisz dołączyć do areny używając BedWarsProxy. \n&eJeśli chcesz utworzyć arenę, upewnij się, że nadałeś sobie uprawnienia bw.setup, aby móc bezpośrednio dołączyć do serwera!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&ePoziom &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamentow");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lSzmaragdow");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&ePojawi sie za &c{seconds} &esekund/y");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}&eGenerator {generatorType} &ezostal ulepszony do stopnia &c{tier}");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[OGÓLNY] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[OBSERWATOR] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aZYCIA"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 TY");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fSledzenie: {team} &f- Dystans: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[GLOBALNY]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[DUCH]");
        yml.addDefault(Messages.MEANING_SHOUT, "okrzyk");
        yml.addDefault(Messages.MEANING_NOBODY, "Nikt");
        yml.addDefault(Messages.MEANING_FULL, "Pełna");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Zelaza");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Zelaza");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Zlota");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Zlota");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Szmaragdow");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Szmaragdy");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamentow");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamenty");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.MEANING_NEVER, "NIGDY");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cNie mozesz tutaj stawiac blokow!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&c&cMozesz zniszczyc tylko bloki postawione przez graczy!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cNie mozesz zniszczyc swojego lozka!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lDESTRUCKJA LOZKA > {TeamColor}{TeamName}&7Zostalo usmażone w głębokim tłuszczu przez {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cLOZKO ZNISZCZONE!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fNie będziesz już się odradzał!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lDESTRUKCJA ŁÓŻKA > &7Twoje łóżko zostało zniszczone przez {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cNie mozesz otworzyc skrzyni tej druzyny poniewaz zostala ona wyeliminowana!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cNie jesteś już niewidzialny, ponieważ otrzymałeś obrażenia!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7spadl do pustki.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7spadl do pustki. &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7zostal zepchniety do pustki przez {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7zostal zepchniety do pustki przez {KillerColor}{KillerName}&7. &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7został popchnięty do pustki {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7został popchnięty do pustki {KillerColor}{KillerName}&7. &b&lOSTATECZNE ZABÓJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7zostal zabity przez bombe gracza {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7zostal zabity przez bombe gracza {KillerColor}{KillerName}&7. &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7zostal zabity przez {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7zostal zabity przez {KillerColor}{KillerName}&7. &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7wyszedł podczas walki z {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7wyszedł podczas walki z {KillerColor}{KillerName}&7. &b&lOSTATECZNE ZABÓJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cUMARLES");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eOdrodzisz sie za &c{time} &esekund/y!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eOdrodzisz sie za &c{time} &esekund/y!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aODRODZILES SIE!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cZostales wyeliminowany!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7posiada &c{amount} &7HP!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7umarl.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7umarl. &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7został zastrzelony {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7został zastrzelony {KillerColor}{KillerName}&7! &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7został zabity przez pluskwe {KillerColor}{KillerTeamName}");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7został zabity przez pluskwe {KillerColor}{KillerTeamName} &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7został zabity przez golema {KillerColor}{KillerTeamName}");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7został zabity przez golema {KillerColor}{KillerTeamName} &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");

        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7zostal zabity przez bombe.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7zostal zabity przez bombe. &b&lOSTATECZNE ZABOJSTWO!");
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8{player} Statystyki");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lPRZEGRANA!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lWYGRANA!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("", "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                   &6⭐ &lTOP 1 Zabojca &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                     &lTOP 2 Zabojca &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                     &lTOP 3 Zabojca &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &awygral gre!");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&dZniszczenie lozek&f:");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&bDiament &cII&f:");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&bDiament &cIII&f:");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&cNagla Smierc&f:");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&2Szmaragd &cII&f:");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&2Szmargd &cIII&f:");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Koniec gry&f:");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cLOZKO ZOSTALO ZNISZCZONE!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fWszystkie lozka zostaly zniszczone!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lWszystkie lozka zostaly zniszczone!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cNagla Smierc");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cNAGLA SMIERC: &6&b{TeamDragons} &cSmok: {TeamColor}{TeamName}");

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eStatystyki");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fKliknij PPM aby zobaczyc swoje statystyki!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eAreny");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fWybierz arene!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eWroc do lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fPPM aby wyjsc do lobby!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eStatystyki");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fKliknij prawym przyciskiem, aby zobaczyć statystyki!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eWroc do lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fPPM aby wyjsc do lobby!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeleporter");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eWroc do lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fPPM aby wyjsc do lobby!"));

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fTwoj poziom: {level}",
                "",
                "&fPostęp: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fMonety: &a{money}",
                "",
                "&fWygrane: &a{wins}",
                "&fZabojstwa: &a{kills}",
                "", "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fMapa: &a{map}",
                "",
                "&fGracze: &a{on}/{max}",
                "",
                "&fOczekiwanie,&fOczekiwanie.,&fOczekiwanie..,&fOczekiwanie...",
                "",
                "&fTryb: &a{group}",
                "&fWersja: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Obserwujesz",
                "&fMapa: &a{map}",
                "",
                "&fGracze: &a{on}/{max}",
                "",
                "&fOczekiwanie,&fOczekiwanie.,&fOczekiwanie..,&fOczekiwanie...",
                "",
                "&fTryb: &a{group}",
                "&fWersja: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fMapa: &a{map}",
                "",
                "&fGracze: &a{on}/{max}",
                "",
                "&fRozpoczecie &a{time}s",
                "",
                "&fTryb: &a{group}",
                "&fWersja: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Obserwujesz",
                "&fMapa: &a{map}",
                "",
                "&fGracze: &a{on}/{max}",
                "",
                "&fRozpoczecie &a{time}s",
                "",
                "&fTryb: &a{group}",
                "&fWersja: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} za &a{time}",
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
                "&o&7Obserwujesz {spectatorTarget}",
                "",
                "&f{nextEvent} za &a{time}",
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
                "&o&7Obserwujesz {spectatorTarget}",
                "",
                "&f{nextEvent} za &a{time}",
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
                "&6Zwycięzca: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lNajwięcej zabójstw:",
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
                "&6Zwycięzca: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lNajwięcej zabójstw:",
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
                "&6Zwycięzca: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lNajwięcej zabójstw:",
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
                "&6Zwycięzca: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lNajwięcej zabójstw:",
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
                "&f{nextEvent} za &a{time}",
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
                "&o&7Obserwujesz {spectatorTarget}",
                "&f{nextEvent} za &a{time}",
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
                "&o&7Obserwujesz {spectatorTarget}",
                "&f{nextEvent} za &a{time}",
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
                "&f{nextEvent} za &a{time}",
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
                "&fZabojstwa: &a{kills}",
                "&fOstateczne Zabojstwa: &a{finalKills}",
                "&fZniszczone Lozka: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Obserwujesz {spectatorTarget}",
                "&f{nextEvent} za &a{time}",
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
                "&o&7Obserwujesz {spectatorTarget}",
                "&f{nextEvent} za &a{time}",
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
                "&fZabojstwa: &a{kills}",
                "&fOstateczne Zabojstwa: &a{finalKills}",
                "&fZniszczone Lozka: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} za &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fZabojstwa: &a{kills}",
                "&fOstateczne Zabojstwa: &a{finalKills}",
                "&fZniszczone Lozka: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Obserwujesz {spectatorTarget}",
                "&f{nextEvent} za &a{time}",
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
                "&o&7Obserwujesz {spectatorTarget}",
                "&f{nextEvent} za &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fZabojstwa: &a{kills}",
                "&fOstateczne Zabojstwa: &a{finalKills}",
                "&fZniszczone Lozka: &a{beds}",
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
                "&fNa tym lobby jest {on} graczy",
                "Obsługiwane przez {poweredBy},&a{serverIp}",
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
                "Czekamy na więcej graczy,Czekamy na więcej graczy.,Czekamy na więcej graczy.., Czekamy na więcej graczy...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
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
                "&7&oObserwujesz grę",
                "Czekamy na więcej graczy,Czekamy na więcej graczy.,Czekamy na więcej graczy.., Czekamy na więcej graczy...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&fRozpoczęcie za &a{time} &fsekund,&fRozpoczęcie za &a{time} &fsekund.,&fRozpoczęcie za &a{time} &fsekund..,&fRozpoczęcie za &a{time} &fsekund..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                "",
                "&7&oObserwujesz"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fRozpoczęcie za &a{time} &fsekund,&fRozpoczęcie za &a{time} &fsekund.,&fRozpoczęcie za &a{time} &fsekund..,&fRozpoczęcie za &a{time} &fsekund..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                "",
                "{nextEvent} za {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fGrasz w drużynie {teamColor}{teamName}",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                "",
                "{nextEvent} za {time}",
                "",
                "&7&oZostałeś wyeliminowany,&f&oZostałeś wyeliminowany"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fGrałeś w drużynie {teamColor}{teamName}",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oObserwator "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oWykluczony {teamColor}&o{teamName}", " {teamColor}&oWykluczony {vPrefix}", "{teamColor}&oWykluczony {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                "",
                "{nextEvent} za {time}",
                "",
                "&7&oObserwujesz"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oObserwator "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lTwoja drużyna wygrała grę! &6⭐",
                "&7{date}", "&7Mapa: &f{map} &7Tryb: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lWygrałeś w drużynie {teamColor}&l{teamName}&6&l!,&6&lWygrałeś w drużynie {teamColor}&l{teamName}&6&l!,&f&lWygrałeś w drużynie {teamColor}&l{teamName}&f&l!",
                "&7Statystyki z tej gry",
                "&eZabójstwa: &f{kills} &8| &eOstateczne zabójstwa: &f{finalKills} &8| &eZniszczone łóżka: &f{beds} &8| &eŚmierci: &f{deaths},&eZabójstwa: &7{kills} &8| &eOstateczne zabójstwa: &7{finalKills} &8| &eZniszczone łóżka: &7{beds} &8| &eŚmierci: &7{deaths}",
                "",
                "&fDziękujemy za grę {player}!",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lDrużyna {winnerTeamName} wygrała grę! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lWygrałeś w drużynie {teamColor}&l{teamName}&6&l!,&6&lWygrałeś w drużynie {teamColor}&l{teamName}&6&l!,&f&lWygrałeś w drużynie {teamColor}&l{teamName}&f&l!",
                "&7Statystyki z tej gry",
                "&eZabójstwa: &f{kills} &8| &eOstateczne zabójstwa: &f{finalKills} &8| &eZniszczone łóżka: &f{beds} &8| &eŚmierci: &f{deaths},&eZabójstwa: &7{kills} &8| &eOstateczne zabójstwa: &7{finalKills} &8| &eZniszczone łóżka: &7{beds} &8| &eŚmierci: &7{deaths}",

                "&fDziękujemy za grę {player}!",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oWykluczony", " {level}", " &c&oWykluczony"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lDrużyna {winnerTeamName} wygrała grę! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fPrzegrałeś w drużynie {teamColor}{teamName}",
                "&7Statystyki z tej gry",
                "&eZabójstwa: &f{kills} &8| &eOstateczne zabójstwa: &f{finalKills} &8| &eZniszczone łóżka: &f{beds} &8| &eŚmierci: &f{deaths},&eZabójstwa: &7{kills} &8| &eOstateczne zabójstwa: &7{finalKills} &8| &eZniszczone łóżka: &7{beds} &8| &eŚmierci: &7{deaths}",
                "&fDziękujemy za grę {player}!",
                "&a{serverIp}",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oWykluczony", " {level}", " &c&oWykluczony"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&lDrużyna {winnerTeamName} wygrała grę! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Tryb: &f{group}",
                "",
                "&fDziękujemy za grę {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&fObsługiwane przez {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oObserwator "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Otrzymano doswiedczenie BedWars (Czas grania).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Otrzymano doswiedczenie BedWars (Wygrana gra).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Otrzymano doświadczenie BedWars (Wsparcie drużyny).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Otrzymano doświadczenie BedWars (Zniszczone łóżko).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Otrzymano doświadczenie BedWars (Zwykłe zabójstwo).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Otrzymano doświadczenie BedWars (Ostateczne zabójstwo).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Monety (Czas grania).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Monety (Wygrana gra).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Monety (Druzynowa wspolpraca).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Monety (Zniszczone lozko).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Monety (Ostateczne zabójstwo).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Monety (Zwykłe zabójstwo).");

        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lWYELIMINOWANA DRUZYNA > {TeamColor}{TeamName} &cdruzyna &czostala wyeliminowana!\n");
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lChron swojego lozka!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lTwoje lozko zostalo zniszczone!");

        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bDRUŻYNOWE ULEPSZENIA,&e&lKLIKNIJ PRAWYM");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bSOLO ULEPSZENIA,&e&lKLIKNIJ PRAWYM");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bSKLEP Z PRZEDMIOTAMI,&e&lKLIKNIJ PRAWYM");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bSKLEP Z PRZEDMIOTAMI,&e&lKLIKNIJ PRAWYM");

        //SHOP
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Szybkie kupowanie");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Dodaj do szybkich zakupów");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cNie masz wymaganej ilosci {currency}! Potrzebujesz {amount} wiecej!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aKupiles &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cJuz to kupiles!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Pluskwa");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Kategorie");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Przedmioty"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bSzybkie kupowanie");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cPuste miejsce!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7To jest miejsce szybkiego kupowania!", "&bKliknij z Shiftem &7na przedmiot", "&7w sklepie, aby go tutaj dodać."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eKliknij aby kupić!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cNie masz wystarczająco {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aMAX!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bKucnij &7by dodać do szybkiego kupowania");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bKucnij &7by usunąć z szybkiego kupowania");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Bloki", "&aBloki", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Welna", Arrays.asList("&7Koszt: &f{cost} {currency}", "", "&7Swietna do budowania mostow", "&7miedzy wyspami. Przyjmuje kolor", "&7twojej druzyny.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Utwardzona Glina", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Podstawowy blok do ochrony lozka.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wybucho-Odporne Szklo", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Odporne na wybuchy.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Kamien Kresu", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Solidny blok do ochrony lozka.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Drabina", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Pomaga dotrzec na wyzsze poziomy.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsydian", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Wyjatkowo mocna ochrona lozka.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Debowe Deski", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Solidny blok do ochrony lozka", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Miecze", "&aMiecze", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Kamienny Miecz", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Zelazny Miecz", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Diamentowy Miecz", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Patyk (Odrzut I)", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Zbroja", "&aZbroja", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Trwala Zbroja Kolcza", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Kolcze spodnie i buty, ktore", "&7zachowasz po odrodzeniu.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Trwala Zelazna Zbroja", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Zelazne spodnie i buty, ktore", "&7zachowasz po odrodzeniu.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Trwala Diamentowa Zbroja", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Diamentowe spodnie i buty, ktore", "&7zachowasz po odrodzeniu.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Narzedzia", "&aNarzedzia", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Trwale Nozyczki", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Szybko usuwaja welne. Zachowasz", "&7je po odrodzeniu.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kilof {tier}", Arrays.asList("&7Koszt: {cost} {currency}", "&7Poziom: &e{tier}", "", "&7To narzedzie mozna ulepszac.", "&7Po smierci traci jeden poziom,", "&7ale odrodzisz sie z jego", "&7podstawowa wersja.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Siekiera {tier}", Arrays.asList("&7Koszt: {cost} {currency}", "&7Poziom: &e{tier}", "", "&7To narzedzie mozna ulepszac.", "&7Po smierci traci jeden poziom,", "&7ale odrodzisz sie z jego", "&7podstawowa wersja.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Luki", "&aLuki", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Strzaly", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Luk", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Luk (Moc I)", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Luk (Moc I, Uderzenie I)", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Mikstury", "&aMikstury", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Zwiekszona szybkosc {level} ({duration} sekund)", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Zwiekszony skok {level} ({duration} sekund)", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Niewidzialnosc ({duration} sekund)", Arrays.asList("&7Koszt: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Uzyteczne", "&aUzyteczne", Collections.singletonList("&eKliknij aby przegladac!"));
        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Zlote Jablko", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Skutecznie przywraca zdrowie.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Pluskwa", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Przywoluje rybiki tam, gdzie", "&7upadnie sniezka. Odwracaja uwage", "&7wrogow przez 15 sekund.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Obronca Snow", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Zelazny golem broni twojej", "&7bazy przez 4 minuty.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ognista Kula", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Kliknij prawym, aby wystrzelic!", "&7Odrzuca wrogow na waskich mostach.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Zapala sie natychmiast i wysadza", "&7przeszkody!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Perla Kresu", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Najszybszy sposob na wtargniecie", "&7do bazy wroga.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Wiadro Wody", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Spowalnia nadchodzacych wrogow", "&7i chroni przed TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Jajko Mostu", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Po rzuceniu tworzy most", "&7na swojej trasie.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Magiczne Mleko", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Przez 60 sekund po wypiciu", "&7nie uruchamiasz pulapek.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Gabka", Arrays.asList("&7Koszt: {cost} {currency}", "", "&7Doskonale pochlania wode.", "", "{quick_buy}", "{buy_status}"));

        yml.addDefault("upgrades.Default.generators.tier1.name", "&eZelazne Ulepszenie");
        yml.addDefault("upgrades.Default.generators.tier1.lore", Arrays.asList("&7Zwieksza przyrost pojawiania sie", "&7Zelaza &7oraz &6Zlota &7o 50%.", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier2.name", "&eZlote Ulepszenie");
        yml.addDefault("upgrades.Default.generators.tier2.lore", Arrays.asList("&7Zwieksza przyrost pojawiania sie", "&7Zelaza &7oraz &6Zlota &7o 100%.", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier3.name", "&eSzmaragdowe Ulepszenie");
        yml.addDefault("upgrades.Default.generators.tier3.lore", Arrays.asList("&7Aktywuje pojawianie sie &2Szmaragdow", "&7w generatorze twojej druzyny.", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.maniacMiner.tier1.name", "&eZwariowany Gornik");
        yml.addDefault("upgrades.Default.maniacMiner.tier1.lore", Arrays.asList("&7Wszystkie osoby z twojej druzyny", "&7otrzymuja Pospiech I na czas rozgrywki", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.sharpSword.tier1.name", "&eOstry Miecz");
        yml.addDefault("upgrades.Default.sharpSword.tier1.lore", Arrays.asList("&7Twoja druzyna otrzymuje Ostrosc I", "&7na wszystkich mieczach!", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.reinforced.tier1.name", "&eWzmocniony Pancerz");
        yml.addDefault("upgrades.Default.reinforced.tier1.lore", Arrays.asList("&7Twoja druzyna otrzymuje Ochrone I", "&7na kazdej czesci pancerza!", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.trap.tier1.name", "&eTo jest pulapka!");
        yml.addDefault("upgrades.Default.trap.tier1.lore", Arrays.asList("&7Pierwszy przeciwnik w twojej bazie", "&7otrzymuje oslepienie i spowolnienie!", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.miningFatigue.tier1.name", "&eWyczerpanie gornika");
        yml.addDefault("upgrades.Default.miningFatigue.tier1.lore", Arrays.asList("&7Pierwszy przeciwnik w twojej bazie", "&7otrzyma wyczerpani na 10 sekund!", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.healPool.tier1.name", "&ePole Regeneracyjne");
        yml.addDefault("upgrades.Default.healPool.tier1.lore", Arrays.asList("&7Tworzy Pole Regeneracyjne", "&7wokol twojej bazy!", "", "&7Koszt:&b {cost} {currency}", "", "{loreFooter}"));


        /* save default items messages for stats gui */
        addDefaultStatsMsg(yml, "wins", "&6Wygrane", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Przegrane", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Wygrane", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Smierci", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Ostateczne Zabojstwa", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Ostateczne Smierci", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Zniszczone Lozka", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&66Ostatnia gra", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Ostatnia gra", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Rozegrane gry", "&f{gamesPlayed}");

        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cBrak areny do rejoinu");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cNie możesz rejoinować!");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eDołączasz do &a{arena}&e!");

        yml.addDefault(Messages.MEANING_NO_TRAP, "Brak pułapki!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Koszt: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Kliknij, aby kupić!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Nie masz wystarczającej ilości {currency}");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cZABLOKOWANE");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}ODBLOKOWANE");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} kupił &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Żelazna kuźnia");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Zwiększa generowanie zasobów", "&7na twojej wyspie.", "", "{tier_1_color}Poziom 1: +50% zasobów, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Poziom 2: +100% zasobów, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Poziom 3: generuje szmaragdy, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Poziom 4: +200% zasobów, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Złota kuźnia");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Szmaragdowa kuźnia");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Rozpalona kuźnia");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eKup pułapkę");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Kupione pułapki zostaną", "&7dodane do kolejki po prawej.", "", "&eKliknij, aby przeglądać!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Ostrzone miecze");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"), Arrays.asList("&7Twoja drużyna otrzymuje na stałe", "&7Ostrość I na wszystkich mieczach i", "&7toporach!", "", "{tier_1_color}Koszt: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Wzmocniona zbroja I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"), Arrays.asList("&7Twoja drużyna otrzymuje na stałe", "&7Ochronę na wszystkich elementach zbroi!", "", "{tier_1_color}Poziom 1: Ochrona I, &b{tier_1_cost} {tier_1_currency}", "{tier_2_color}Poziom 2: Ochrona II, &b{tier_2_cost} {tier_2_currency}", "{tier_3_color}Poziom 3: Ochrona III, &b{tier_3_cost} {tier_3_currency}", "{tier_4_color}Poziom 4: Ochrona IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Wzmocniona zbroja II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Wzmocniona zbroja III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Wzmocniona zbroja IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Szalony górnik I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"), Arrays.asList("&7Wszyscy gracze w twojej drużynie", "&7otrzymują na stałe Pośpiech.", "", "{tier_1_color}Poziom 1: Pośpiech I, &b{tier_1_cost} {tier_1_currency}", "{tier_2_color}Poziom 2: Pośpiech II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Szalony górnik II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Pole regeneracji");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"), Arrays.asList("&7Tworzy pole regeneracji", "&7wokół twojej bazy!", "", "{tier_1_color}Koszt: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Smocze wzmocnienie");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"), Arrays.asList("&7Podczas nagłej śmierci twoja drużyna", "&7będzie miała 2 smoki zamiast 1!", "", "{tier_1_color}Koszt: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Dostępne do kupienia");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Kolejka pułapek"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Pułapka nr 1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Pierwszy przeciwnik, który wejdzie", "&7do twojej bazy, uruchomi tę pułapkę!", "&7Ta pułapka zostanie aktywowana natychmiast!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first", Arrays.asList("", "&7Kupienie pułapki doda ją do kolejki.", "&7Jej koszt zależy od liczby pułapek.", "&7oczekujących w kolejce.", "&7i wzrośnie przy kolejnych zakupach.", "", "&7Następna pułapka: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Pułapka nr 2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Drugi przeciwnik, który wejdzie", "&7do twojej bazy, uruchomi tę pułapkę!", "&7Ta pułapka zostanie aktywowana natychmiast!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second", Arrays.asList("", "&7Kupienie pułapki doda ją do kolejki.", "&7Jej koszt zależy od liczby pułapek.", "&7oczekujących w kolejce.", "&7i wzrośnie przy kolejnych zakupach.", "", "&7Następna pułapka: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Pułapka nr 3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Trzeci przeciwnik, który wejdzie", "&7do twojej bazy, uruchomi tę pułapkę!", "&7Ta pułapka zostanie aktywowana natychmiast!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third", Arrays.asList("", "&7Kupienie pułapki doda ją do kolejki.", "&7Jej koszt zależy od liczby pułapek.", "&7oczekujących w kolejce.", "&7i wzrośnie przy kolejnych zakupach.", "", "&7Następna pułapka: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}To pułapka!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Nakłada Ślepotę i Spowolnienie", "&7na 5 sekund.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Pułapka kontrataku");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Daje sojusznikom w pobliżu bazy", "&7efekt Szybkość I na 15 sekund.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Pułapka alarmowa");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Ujawnia niewidzialnych graczy", "&7oraz ich nazwę i drużynę.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Pułapka zmęczenia górnika");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Nakłada Zmęczenie górnika na 10", "&7sekund.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aWstecz");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7Do ulepszeń drużyny"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Dodaj pułapkę");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cKolejka pułapek jest pełna!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} została uruchomiona!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cPUŁAPKA ZOSTAŁA URUCHOMIONA!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fTwoja pułapka {trap} została uruchomiona!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lPułapka alarmowa uruchomiona przez &7&l{player} &c&lz drużyny {color}&l{team}!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARM!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fPułapka alarmowa uruchomiona przez drużynę {color}{team}&f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNazwa nie została ustawiona");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cOpis nie został ustawiony"));
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7Arena {arena} nie istnieje!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} dodano do grupy: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Utworzono grupę!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Utwórz grupę aren. Więcej informacji znajdziesz na naszej wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fDomyślna");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Usunięto grupę!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §ekliknij, aby zobaczyć szczegóły");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fZarządzaj grupami aren.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Ta grupa już istnieje!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Dostępne grupy aren:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Wyświetl dostępne grupy.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Ta grupa nie istnieje!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Usuń grupę aren. Więcej informacji znajdziesz na naszej wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Ustaw grupę aren. Więcej informacji znajdziesz na naszej wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Nie istnieje grupa o nazwie: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} ustawionych)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fPokaż dostępne areny");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cBrak aren do wyświetlenia.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fŚw: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Uruchomione gry: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Wpisz /§a{command} arenaList {page}§7, aby wyświetlić następną stronę.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Użycie: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Nie możesz już stawiać ani niszczyć bloków!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §epermisja budowania");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fWłącz lub wyłącz tryb budowania, \n§faby móc niszczyć lub stawiać bloki.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Możesz teraz stawiać i niszczyć bloki.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Wystąpił błąd podczas kopiowania konfiguracji mapy. Sprawdź konsolę.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Najpierw wyłącz {arena}!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fSklonuj istniejącą arenę.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} już istnieje!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Gotowe :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Użycie: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Wpisz ponownie, aby potwierdzić.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fUsuń mapę i jej konfigurację.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Ta arena nie istnieje!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7Usunięto arenę {arena}!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Użycie: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} nie istnieje jako folder świata!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Ta arena jest już wyłączona!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fWyłącz arenę.\nSpowoduje to usunięcie graczy \n§fz areny przed jej wyłączeniem.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7Na tej arenie trwa gra, wyłącz ją po zakończeniu gry!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Wyłączanie areny...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Ta arena jest już włączona!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fWłącz arenę.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Ta arena jest już w kolejce włączania!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Włączanie areny...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Użycie: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §ekliknij, aby zobaczyć szczegóły");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fZarządzaj poziomem gracza.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cLiczba musi być całkowita!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cPoziom musi być całkowity!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Nie znaleziono gracza!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Gracz może musieć połączyć się ponownie, aby zobaczyć aktualizację.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Ustaw poziom gracza.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7Poziom gracza {player} ustawiono na: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Użycie: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Daj graczowi doświadczenie.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7Dodano {amount} PD graczowi: {player}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Użycie: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Kliknij, aby użyć.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Użycie: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Możesz użyć §e{players} §7jako liczby graczy w tej §7grupie aren.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bzostał ustawiony!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §eutwórz NPC dołączania");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fUtwórz NPC dołączania  \n§fKliknij, aby zobaczyć szczegóły.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fUżyj tej komendy, aby utworzyć NPC dołączania.\n§fKliknij, aby zobaczyć składnię.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Użycie: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fStań przed NPC, aby go usunąć.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Użycie: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bW pobliżu nie ma żadnego NPC.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bNie ustawiono jeszcze żadnego NPC!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bUsunięto wybranego NPC!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bGrupy docelowe: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Przeładowano konfigurację areny: {config}!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7Przeładowano {config}!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §eprzeładuj wiadomości");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fPrzeładuj wiadomości.\n§cNiezalecane!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7Przeładowano {language}!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Jesteś już w sesji konfiguracji!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 nie może zawierać wielkich liter! Zmień nazwę folderu na: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Najpierw ją wyłącz!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fUtwórz lub edytuj arenę.\nZnaki '_' i '-' nie będą wyświetlane w nazwie areny.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} nie może zawierać tego symbolu: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Użycie: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lKliknij tutaj, aby utworzyć znalezione drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fKliknij, aby utworzyć znalezione drużyny!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lZNALEZIONO NOWE DRUŻYNY:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Nie znaleziono nowych drużyn.\n§6 ▪ §7Utwórz drużyny ręcznie za pomocą: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Wyszukiwanie drużyn. Może to powodować lagi.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Przekroczono limit czasu. Wpisz ponownie, aby wyszukać drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fJeśli chcesz, aby lobby zniknęło po rozpoczęciu gry,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lUSUWANIE LOBBY OCZEKIWANIA:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Ten krok jest OPCJONALNY. Aby go pominąć, wpisz §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fużyj poniższych komend jak zaznaczenia WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Dostępne drużyny: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6ŁÓŻKO USTAWIONE");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Dodaj łóżko drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Ustawiono łóżko dla: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aUstawiono łóżko dla: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fUstaw łóżko drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cPodczas używania tej komendy musisz stać na łóżku!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cMusisz stać na łóżku.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fUstaw łóżko dla {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Ustawiono maksymalną wysokość budowania Y na §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Użycie: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Dostępne kolory: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7Utworzono drużynę {team}!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7Drużyna {team} już istnieje!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Nieprawidłowy kolor!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Użycie: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "Dodano generator {generator}!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6Dodano generator {generator}§a!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Dodaj generator drużyny.\nDrużyna zostanie wykryta automatycznie.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Spróbuj użyć: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6Dodano generator {generator} dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Dodano generator {generator} dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6Dodano generator {generator}§a dla drużyny {team}§a!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (automatyczne wykrywanie drużyny)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Użyj /bw createTeam, jeśli chcesz ją utworzyć.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cTen generator został już ustawiony!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cTen generator został już ustawiony!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} USTAWIONY");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Inne użycie: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Dodaj generator szmaragdów/diamentów.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Generator ustawiony dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Dodaj generator drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cNie znaleziono drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Ustawiono generator dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aUstawiono generator dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Najpierw utwórz drużyny!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cNajpierw utwórz drużyny!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Łupy za zabójstwa {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Ustaw miejsce łupów za zabójstwa dla drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Ustawiono łupy za zabójstwa dla: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Łupy za zabójstwa {team} (kliknij, aby ustawić)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fUstaw łupy za zabójstwa dla {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Ustawiono łupy za zabójstwa dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aUstawiono łupy za zabójstwa dla drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cUżycie: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Ustawiono maksymalną liczbę graczy w drużynie!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Użycie: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cNie znaleziono żadnej pobliskiej drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cNie znaleziono żadnej pobliskiej drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Nie jesteś w sesji konfiguracji!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Nie znaleziono pobliskiego generatora (zasięg 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cNie znaleziono pobliskiego generatora.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Usunięto generator {generator} w lokalizacji: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aUsunięto generator {generator}.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Musisz stać blisko hologramu generatora, który chcesz usunąć.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §aUsunięto generator {generator}.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "Usunięto generatory drużyny {team}!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Usunięto generator {generator} drużyny {team} w lokalizacji: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Usunięto generator drużyny {team}.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Usuń {team} §7(kliknij, aby usunąć)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Ta drużyna nie istnieje: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cNie znaleziono drużyny: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Usunięto drużynę: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aUsunięto drużynę: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cUżycie: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Możesz teraz ją włączyć za pomocą:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aWłącz tę arenę.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (kliknij, aby włączyć)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Zapisano zmiany areny!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6SKLEP USTAWIONY");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Ustaw sklep drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Inne użycie: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Ustawiono sklep dla: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Ustaw sklep dla {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6SPAWN USTAWIONY");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Pozostało: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Ustawiono spawn dla: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Lista drużyn: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Ustaw spawn dla: {team} (kliknij, aby ustawić)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fUstaw spawn dla {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cNie znaleziono wybranej drużyny: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cUżycie: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "Ustawiono lokalizację obserwatorów!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cUżycie: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Jeśli ustawiono spawn, ale nie znaleziono go automatycznie, spróbuj użyć: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cTa drużyna nie istnieje!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(kliknij, aby ustawić)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Upewnij się, że najpierw ustawiono spawn drużyny!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fUstaw spawn drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Dostępne typy: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Zmieniono grupę areny na: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(kliknij, aby ustawić)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dKliknij, aby ustawić arenę jako {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Użycie: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6ULEPSZENIE USTAWIONE");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Ustaw NPC ulepszeń drużyny.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "Ustawiono NPC ulepszeń dla: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fUstaw NPC ulepszeń dla {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dUstaw pozycję {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Ustaw pozostałą pozycję:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7Ustawiono pozycję {position}!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Ustaw spawn drużyn, jeśli jeszcze tego nie zrobiono!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Użycie: /{command} {subcommand} 1 lub 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Ustawiono spawn oczekiwania dla §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aUstaw główne lobby. §fJest ono wymagane, ale\n§fjeśli serwer będzie działał w trybie §eBUNGEE§f,\n§flokalizacja lobby §enie §fbędzie używana.\n§eWpisz ponownie, aby zastąpić starą lokalizację spawnu.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Tej komendy nie można używać na arenach. Jest przeznaczona dla głównego lobby!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(nieustawione)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(ustawione)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Ustawiono lokalizację lobby!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Włącz lub wyłącz sprawdzanie gotowości.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eWymuś zakończenie areny");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fWymuś zakończenie areny bez zwycięzcy.\n&fUprawnienie: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cGra nie jest uruchomiona.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aWymuszanie zakończenia gry...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eWymuś rozpoczęcie areny");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fWymuś rozpoczęcie areny.\n&fUprawnienie: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eSkróć odliczanie rozpoczęcia do 5 s");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fSkróć odliczanie rozpoczęcia na arenie do 5 s.\n&fUprawnienie: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Przełącz status gotowości.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fOtwiera GUI aren.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fDołącz do areny po nazwie lub grupie.\n&f/{command} join random - dołącz do losowej areny.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fZmień swój język.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fOpuść arenę.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fOtwiera GUI statystyk.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fPrzełączaj między waniliowym trybem obserwatora a trybem obserwatora pluginu.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Komendy administratora");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &ewłącz/ wyłącz");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fBrak dostępnych obecnie komend konsoli.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Najpierw musisz ustawić lokalizację lobby!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Nie powinno cię tu być.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e wyświetl komendy gracza");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fWyświetl komendy gracza.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &a{world} komendy");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} autorstwa andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Areny: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(NIE USTAWIONO)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(USTAWIONO)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oOPCJONALNE");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(USTAWIONO WSZYSTKO)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Pozostało: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(POZ. 1 NIEUSTAWIONA)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(POZ. 2 NIEUSTAWIONA)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(automatyczne wykrywanie)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} UTWORZONO)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (USTAWIONO NA {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fUstaw miejsce, w którym gracze będą\n&fczekać przed rozpoczęciem gry.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fSpraw, aby lobby oczekiwania zniknęło po rozpoczęciu.\n&fZaznacz je jako region WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fUstaw miejsce odradzania obserwatorów.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fUtwórz drużyny na podstawie kolorów wysp.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fUtwórz drużynę.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fUsuń drużynę po nazwie.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fUstaw spawn drużyny.\n&fDrużyny bez ustawionego spawnu:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fUstaw lokalizację łóżka drużyny.\n&fNie musisz podawać nazwy drużyny.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fUstaw NPC drużyny.\n&fNie musisz podawać nazwy drużyny.\n&fZostanie utworzony dopiero po rozpoczęciu gry.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fUstaw NPC ulepszeń drużyny.\n&fNie musisz podawać nazwy drużyny.\n&fZostanie utworzony dopiero po rozpoczęciu gry.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fUstaw miejsce upuszczania\n&fprzedmiotów wroga po jego zabiciu.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fDodaj punkt odradzania generatora.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fStań na bloku diamentu, aby ustawić generator diamentów.\n&fStań na bloku szmaragdu, aby ustawić generator szmaragdów.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fDodaj punkt odradzania generatora.\n&eStań na wyspie drużyny, aby ustawić generator drużyny\n&fStań na bloku diamentu, aby ustawić generator diamentów.\n&fStań na bloku szmaragdu, aby ustawić generator szmaragdów.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fUstaw maksymalny rozmiar drużyny.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fUstaw grupę areny.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fDodaj arenę do grupy.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fZapisz arenę i wróć do lobby");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cPróbowano wczytać arenę {arena}, ale jest już w kolejce włączania.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cPróbowano wczytać arenę {arena}, ale jest już włączona.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "Nie ustawiono żadnej drużyny dla areny: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cMusisz ustawić co najmniej 2 drużyny na: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cNie ma mapy o nazwie {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cNieprawidłowy kolor drużyny: {team} na arenie: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&cNie ustawiono {setting} dla drużyny {team} na: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cNie ustawiono generatora diamentów na: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cNie ustawiono generatora szmaragdów na: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cNie ustawiono spawnu oczekiwania na: {arena}");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Wybierz metodę konfiguracji");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lKONFIGURACJA WSPOMAGANA");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aŁatwa i szybka konfiguracja!", "&7Dla początkujących i leniwego personelu :D", "", "&3Ograniczone opcje."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lKONFIGURACJA ZAAWANSOWANA");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aSzczegółowa konfiguracja!", "&7Dla doświadczonego personelu :D", "", "&3Zaawansowane opcje."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7Wczytywanie {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7Konfiguracja {arena} anulowana!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aTeleportowano cię na spawn areny &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&aWitaj {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fUstaw spawn oczekiwania.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fTo miejsce, w którym gracze będą czekać na rozpoczęcie gry.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6KLIKNIJ TUTAJ, ABY USTAWIĆ LOBBY OCZEKIWANIA    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dKliknij, aby ustawić spawn oczekiwania.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eLub wpisz: &7/{command}, aby zobaczyć listę komend.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fPokaż listę komend.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6{generator} generator dodany dla drużyny: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6SPAWN USTAWIONY");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6ŁÓŻKO USTAWIONE");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6SKLEP USTAWIONY");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6ULEPSZENIE USTAWIONE");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Łupy za zabójstwa {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} USTAWIONY");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Żelazo");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Złoto");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Szmaragd");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Diament");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Dostępne drużyny: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cNie udało się rozpocząć sesji konfiguracji. Sprawdź konsolę.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cBrak obsługi Vault!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lBŁĄD: To wymaga obsługi Vault! Zainstaluj plugin Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Zapisano tabliczkę dla areny: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Nie ustawiono jeszcze żadnej areny!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 został PRZEŁADOWANY! (nie przeładowuj pluginów)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lWesołego Halloween!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} PD!");
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Ulepszenia drużyny");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

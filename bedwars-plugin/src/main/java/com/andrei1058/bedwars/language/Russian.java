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

public class Russian extends Language{

    public Russian() {
        super(BedWars.plugin, "ru");
        YamlConfiguration yml = getYml();
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Pусский");

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

        yml.options().copyDefaults(true);
        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(spectator)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "В файле server.properties включён параметр spawn-protection; это может повлиять на арены BedWars. Рекомендуется установить значение 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Обнаружен Multiverse-Core; удалите его или убедитесь, что он не изменяет карты BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Загрузка {world} из контейнера миров Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Создание новой пустой карты: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7ID пользователя: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7ID загрузки: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eОтправить сообщение на текущую арену");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fОтправить сообщение всем игрокам текущей арены.\n&fИспользуйте: /{command} echo <message>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cОператор&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eОтправить сообщение на выбранную арену");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fОтправить сообщение всем игрокам выбранной арены.\n&fИспользуйте: /{command} echoto <arena> <message>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eОтправить сообщение на все арены");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fОтправить сообщение всем игрокам на всех аренах.\n&fИспользуйте: /{command} echoall <message>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cИспользуйте: /bw echo <message>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aСообщение отправлено на арену {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cВы не на арене.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cИспользуйте: /bw echoto <arena> <message>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aСообщение отправлено на арену {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cИспользуйте: /bw echoall <message>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aСообщение отправлено на все арены.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cАрена не найдена: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cЭта команда только для игроков.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aТеперь вы готовы!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aВы больше не готовы.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aВсе игроки готовы! Отсчёт сокращён до 10 секунд!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aПроверка готовности включена.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aПроверка готовности отключена.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cЭта команда отключена.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cВы не в игре!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cСейчас эту команду использовать нельзя.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cНаблюдатели не могут использовать эту команду.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aГотов");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cНе готов");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Нажмите ПКМ, чтобы стать готовым!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Нажмите ПКМ, чтобы отменить готовность!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Недостаточно игроков для начала игры!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aВключён режим наблюдателя Vanilla.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aВключён обычный режим наблюдателя.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cИнвентарь заполнен!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aНадето!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cИзвините, но вас выгнали, потому что к арене присоединился донатер.\n&aЧтобы иметь больше возможностей - купите донат. &7&o(жми)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cЭта арена полная!\n&aЧтобы иметь больше возможностей - купите донат. &7&o(жми)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cПриносим извинения, но эта арена полная.\n&cМы знаем, что вы являетесь донатером, но на самом деле эта арена полна сотрудников и/или донатеров.");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cНедостаточно игроков! Обратный отсчет остановился!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eАрена, в которой вы были, перезапускается.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cИдет Игра");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Перезапуск");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Ожидание §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Начало §c{full}");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cНе существует какой-либо арены или арены: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cСейчас нет какой-либо арены ;(");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cТы не на арене!");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Доступные арены");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Статус: {status}", "&7Игроков: &f{on}&7/&f{max}", "&7Тип: &a{group}", "", "&aЛКМ для входа.", "&eПКМ для слежки."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Доступные языки:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Используйте: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cЭтот язык не существует!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aЯзык сменен!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cВы не можете изменить язык во время игры.");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cИгрок не найден!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cЭтот игрок не на bedwars арене!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cИгра на арене, где находится игрок, еще не началась!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cИспользуйте: /bw tp <username>");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cВаша партия слишком велика для того, чтобы присоединиться к этой арене как команде :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cТолько лидер может выбрать арену.");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &eпереподключился!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eУровень &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lАлмаз");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lЭмеральд");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eСпавн через &c{seconds} &eсекунд");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &eвошел в игру (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &eвышел из игры!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eИгра начнется через &6{time} &eсекунд!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cОжидание игроков..");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[ВСЕМ] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[НАБЛЮДАТЕЛЬ] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l Защищайте свою кровать и уничтожайте кровати врагов.",
                "&e&l      Улучшайте себя и свою команду, собирая",
                "&e&l   Железо, Золото, Эмеральды и Алмазы из генераторов",
                "&e&l     чтобы получить доступ к мощным улучшениям.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.MEANING_SHOUT, "крик");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aПОГНАЛИ");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fКарта: &a{map}",
                "",
                "&fИгроков: &a{on}/{max}",
                "",
                "&fОжидание,&fОжидание.,&fОжидание..,&fОжидание...",
                "",
                "&fТип: &a{group}",
                "&fВерсия: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Наблюдение",
                "&fКарта: &a{map}",
                "",
                "&fИгроков: &a{on}/{max}",
                "",
                "&fОжидание,&fОжидание.,&fОжидание..,&fОжидание...",
                "",
                "&fТип: &a{group}",
                "&fВерсия: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fКарта: &a{map}",
                "",
                "&fИгроков: &a{on}/{max}",
                "",
                "&fСтарт через &a{time}s",
                "",
                "&fТип: &a{group}",
                "&fВерсия: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Наблюдение",
                "&fКарта: &a{map}",
                "",
                "&fИгроков: &a{on}/{max}",
                "",
                "&fСтарт через &a{time}s",
                "",
                "&fТип: &a{group}",
                "&fВерсия: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} через &a{time}",
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
                "&o&7Наблюдение {spectatorTarget}",
                "",
                "&f{nextEvent} через &a{time}",
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
                "&o&7Наблюдение {spectatorTarget}",
                "",
                "&f{nextEvent} через &a{time}",
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
                "&6Победитель: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lЛучшие убийцы:",
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
                "&6Победитель: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lЛучшие убийцы:",
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
                "&6Победитель: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lЛучшие убийцы:",
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
                "&6Победитель: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lЛучшие убийцы:",
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
                "&f{nextEvent} через &a{time}",
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
                "&o&7Наблюдение {spectatorTarget}",
                "&f{nextEvent} через &a{time}",
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
                "&o&7Наблюдение {spectatorTarget}",
                "&f{nextEvent} через &a{time}",
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
                "&f{nextEvent} через &a{time}",
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
                "&fУбийств: &a{kills}",
                "&fФинальных убийств: &a{finalKills}",
                "&fКроватей уничтожено: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Наблюдение {spectatorTarget}",
                "&f{nextEvent} через &a{time}",
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
                "&o&7Наблюдение {spectatorTarget}",
                "&f{nextEvent} через &a{time}",
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
                "&fУбийств: &a{kills}",
                "&fФинальных убийств: &a{finalKills}",
                "&fКроватей уничтожено: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} через &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fУбийств: &a{kills}",
                "&fФинальных убийств: &a{finalKills}",
                "&fКроватей уничтожено: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Наблюдение {spectatorTarget}",
                "&f{nextEvent} через &a{time}",
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
                "&o&7Наблюдение {spectatorTarget}",
                "&f{nextEvent} через &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fУбийств: &a{kills}",
                "&fФинальных убийств: &a{finalKills}",
                "&fКроватей уничтожено: &a{beds}",
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
                "&fВ этом лобби игроков: {on}",
                "При поддержке {poweredBy},&a{serverIp}",
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
                "Ожидание игроков,Ожидание игроков.,Ожидание игроков.., Ожидание игроков...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
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
                "&7&oВы наблюдаете",
                "Ожидание игроков,Ожидание игроков.,Ожидание игроков.., Ожидание игроков...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&fНачало через &a{time} &fсекунд,&fНачало через &a{time} &fсекунд.,&fНачало через &a{time} &fсекунд..,&fНачало через &a{time} &fсекунд..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                "&7&oВы наблюдаете",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fНачало через &a{time} &fсекунд,&fНачало через &a{time} &fсекунд.,&fНачало через &a{time} &fсекунд..,&fНачало через &a{time} &fсекунд..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                "",
                "{nextEvent} через {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fВы играете за команду {teamColor}{teamName}",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                "",
                "{nextEvent} через {time}",
                "",
                "&7&oВы были устранены,&f&oВы были устранены"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fВы играли за команду {teamColor}{teamName}",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oНаблюдатель "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oВыбывший {teamColor}&o{teamName}", " {teamColor}&oВыбывший {vPrefix}", "{teamColor}&oВыбывший {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                "",
                "{nextEvent} через {time}",
                "",
                "&7&oВы наблюдаете"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oНаблюдатель "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lВаша команда победила! &6⭐",
                "&7{date}", "&7Карта: &f{map} &7Режим: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lВы победили с командой {teamColor}&l{teamName}&6&l!,&6&lВы победили с командой {teamColor}&l{teamName}&6&l!,&f&lВы победили с командой {teamColor}&l{teamName}&f&l!",
                "&7Статистика этой игры",
                "&eУбийства: &f{kills} &8| &eФинальные убийства: &f{finalKills} &8| &eУничтоженные кровати: &f{beds} &8| &eСмерти: &f{deaths},&eУбийства: &7{kills} &8| &eФинальные убийства: &7{finalKills} &8| &eУничтоженные кровати: &7{beds} &8| &eСмерти: &7{deaths}",
                "",
                "&fСпасибо за игру {player}!",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lКоманда {winnerTeamName} победила! &6⭐",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lВы победили с командой {teamColor}&l{teamName}&6&l!,&6&lВы победили с командой {teamColor}&l{teamName}&6&l!,&f&lВы победили с командой {teamColor}&l{teamName}&f&l!",
                "&7Статистика этой игры",
                "&eУбийства: &f{kills} &8| &eФинальные убийства: &f{finalKills} &8| &eУничтоженные кровати: &f{beds} &8| &eСмерти: &f{deaths},&eУбийства: &7{kills} &8| &eФинальные убийства: &7{finalKills} &8| &eУничтоженные кровати: &7{beds} &8| &eСмерти: &7{deaths}",

                "&fСпасибо за игру {player}!",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oВыбывший", " {level}", " &c&oВыбывший"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lКоманда {winnerTeamName} победила! &6⭐",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fВы проиграли команде {teamColor}{teamName}",
                "&7Статистика этой игры",
                "&eУбийства: &f{kills} &8| &eФинальные убийства: &f{finalKills} &8| &eУничтоженные кровати: &f{beds} &8| &eСмерти: &f{deaths},&eУбийства: &7{kills} &8| &eФинальные убийства: &7{finalKills} &8| &eУничтоженные кровати: &7{beds} &8| &eСмерти: &7{deaths}",
                "&fСпасибо за игру {player}!",
                "&a{serverIp}",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oВыбывший", " {level}", " &c&oВыбывший"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&lКоманда {winnerTeamName} победила! &6⭐",
                "&7{date}",
                "&7Карта: &f{map} &7Режим: &f{group}",
                "",
                "&fСпасибо за игру {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&fПри поддержке {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oНаблюдатель "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aЗдоровье"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 Вы");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fОтслеживание: {team} &f- Дистанция: {distance}m");
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lЗащищайте свою кровать!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cТы не можешь открыть этот сундук, так как команда уничтожена!");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cВы не можете ставить блоки здесь!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cВы можете ломать блоки только игроков!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cВы не можете разрушить свою кровать!");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lУНИЧТОЖЕНИЕ КОММАНДЫ > {TeamColor}{TeamName} команда &cбыла уничтожена!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lУНИЧТОЖЕНИЕ КРОВАТИ > {TeamColor}{TeamName} Кровать &7разушена игроком {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cВАША КРОВАТЬ УНИЧТОЖЕНА!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fВы больше не сможете возродиться!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lУНИЧТОЖЕНИЕ КРОВАТИ > &7Ваша кровать разрушена игроком {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cВы больше не невидимы, потому что получили урон!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7упал.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7упал. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7был скинут в бездну {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7был скинут в бездну игроком {KillerColor}{KillerName}&7. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7был сбит игроком {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7был сбит игроком {KillerColor}{KillerName}&7. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7был поражен любимой бомбой игрока {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7был поражен любимой бомбой игрока {KillerColor}{KillerName}&7. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7был убит игроком {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7был убит игроком {KillerColor}{KillerName}&7. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7откючился пока сражался с {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7откючился пока сражался с {KillerColor}{KillerName}&7. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lВаша кровать сломана!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cВЫ ПОГИБЛИ!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eВы возродитесь через &c{time} &eсекунд!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eВы возродитесь через &c{time} &eсекунд!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aВОЗРОЖДЕН!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cВы были устранены!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7теперь &c{amount} &7HP!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lИГРА ОКОНЧЕНА!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lПОБЕДА!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("", "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &l1-1 Убийца &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                        &l2-й Убийца &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                        &l3-й Убийца &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        //yml.addDefault(gameOverReward, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
        //        "&f                                   &lReward Summary", "", "",
        //        "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &aвыиграл игру!");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        //yml.addDefault(tablistFormat, "{TeamColor}&l{TeamLetter}&r {TeamColor}{PlayerName} &e{PlayerHealth}");//{TeamColor}{TeamName}{TeamHealth}{PlayerName}{PlayerHealth}
        yml.addDefault(Messages.MEANING_NOBODY, "Никто");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Генератор &eбыл улучшен до уровня &c{tier}");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bКОМАНДНЫЕ УЛУЧШЕНИЯ, &e&lПКМ");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bСОЛО УЛУЧШЕНИЯ, &e&lПКМ");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bМАГАЗИН, &e&lПКМ");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bМАГАЗИН, &e&lПКМ");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} BedWars Опыта получено (Игровое время).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} BedWars Опыта получено (Победа в игре).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} BedWars Опыта получено (Поддержка команды).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} BedWars Опыта получено (Разрушение кровати).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} BedWars Опыта получено (Убийство).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} BedWars Опыта получено (Финальное убийство).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Монет (Игровое время).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Монет (Победа в игре).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Монет (Поддержка команды).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Монет (Разрушение кровати).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Монет (Финальное убийство).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Монет (Убийство).");

        //SHOP
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Быстрая покупка");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cТебе нехватает {currency}! Нужно еще {amount}!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aТы купил &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cТы уже купил это!");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Добавить в быструю покупку");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Категории");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Предметы"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bБыстрая покупка");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cПустой слот!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Это слот быстрой покупки!", "&bШифт-клик &7на любой предмет", "&7для добавления его сюда."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eНажми для покупки!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cТебе нехватает {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aМАКСИМАЛЬНО!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bШифт-клик для добавления в быструю покупку");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bШифт-клик для удаления из быстрой покупки!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Блоки", "&aБлоки", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Шерсть", Arrays.asList("&7Цена: &f{cost} {currency}", "", "&7Отлично подходит для строительства мостов через", "&7острова. Приобретает цвет вашей команды.",
                "&7цвет вашей команды.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Глина", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Стандартный блок для защиты кровати.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Взрывоустойчивое стекло", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Имеет имунитет к взрывам.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Эндерняк", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Солидный блок для защиты кровати.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Лестницы", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Полезно когда кошки застревают", "&7на деревьях.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Обсидиан", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Лучший блок для защиты кровати.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Дерево", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Хороший блок для защиты кровати.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Оружие", "&aОружие", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Каменный меч", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Железный меч", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Алмазный меч", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Палка (Отдача I)", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Броня", "&aБроня", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Кольчужная броня", Arrays.asList("&7Цена: {cost} {currency}",
                "", "&7Кольчужные штаны и сапоги", "&7Вы всегда будете появляться", "&7с ними при смерти.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Железная броня", Arrays.asList("&7Цена: {cost} {currency}",
                "", "&7Железные штаны и сапоги, которые", "&7вы всегда будете носить.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Постоянная алмазная броня", Arrays.asList("&7Цена: {cost} {currency}",
                "", "&7Алмазные штаны и сапоги, которые", "&7вы всегда будете носить.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Инструменты", "&aИнструменты", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Ножницы", Arrays.asList("&7Цена: {cost} {currency}",
                "", "&7Отличный инструмент для ломания шерсти.", "&7Вы всегда будете появляться с ножницами.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Кирка {tier}", Arrays.asList("&7Цена: {cost} {currency}", "&7Фаза: &e{tier}",
                "", "&7Это улучшаемый предмет.", "&7Если вы умрёте, то он.", "&7потеряет одну фазу!", "", "&7Если вы ухудшите свой", "&7предметы до последней фазы", "&7то вы всегда будете появляться с самой нижней фазой.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Топор {tier}", Arrays.asList("&7Цена: {cost} {currency}", "&7Фаза: &e{tier}",
                "", "&7Это улучшаемый предмет.", "&7Если вы умрёте, то он.", "&7потеряет одну фазу!", "", "&7Если вы ухудшите свой", "&7предметы до последней фазы", "&7то вы всегда будете появляться с самой нижней фазой.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Луки", "&aЛуки", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Стрела", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Лук", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Лук (Сила I)", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Лук (Сила  I, Отдача I)", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Зелья", "&aЗелья", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Зелье на Скорость {level} ({duration} секунд)", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Зелье на Прыжок {level} ({duration} секунд)", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Зелье невидимости (30 секунд)", Arrays.asList("&7Цена: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Разное", "&aРазное", Collections.singletonList("&eНажмите для просмотра!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Золотое Яблоко", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Хорошо восстанавливает здоровье.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Чешуйница", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Спавнит чешуйниц при",
                "&7бросания снежка.", "&7Может скинуть врагов, действует 15 секунд.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Железный Голем", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Железный голем для защиты вашей",
                "&7базы. Действует 4 минуты.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Фаербол", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Нажми ПКМ чтобы запустить!",
                "&7Огненный заряд хорошенько поджарит", "&7мосты ваших противников!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Динамит", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Автоматически поджигаеться, при",
                "&7размещении!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Эндер-пёрл", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Самый быстрый способ добраться",
                "&7до базы вашего врага.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ведро Воды", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Отличный метод замедлить ваших",
                "&7противников. Также может", "&7защитить от взрыва динамита.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Яйцо", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Создаёт мост, по заданной",
                "&7траектории после броска.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Магическое Молоко", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Снимает эффекты всех ловушек,",
                "&7поставленных на базу противника, в течении 60 секунд.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Губка", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Вжимает в себя воду.",
                "", "{quick_buy}", "{buy_status}"));


        yml.addDefault(Messages.MEANING_FULL, "Полный");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Железо");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Железа");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Золото");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Золота");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Изумруд");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Изумрудов");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Алмаз");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Алмазов");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");

        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Используйте: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cВы не можете этого сделать.");
        yml.addDefault("upgrades.Default.generators.tier1.name", "&eЖелезная кузница");
        yml.addDefault("upgrades.Default.generators.tier1.lore", Arrays.asList("&7Увеличивает скорость спавна", "&7Железа и золота на 50%..", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier2.name", "&eЗолотая кузница");
        yml.addDefault("upgrades.Default.generators.tier2.lore", Arrays.asList("&7Увеличивает скорость спавна", "&7железа и золота на 100%..", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier3.name", "&eИзумрудная кузница");
        yml.addDefault("upgrades.Default.generators.tier3.lore", Arrays.asList("&7Активирует заклинателя «Изумруд»", "&7В кузнице вашей команды.", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.maniacMiner.tier1.name", "&eМаньяк-майнер");
        yml.addDefault("upgrades.Default.maniacMiner.tier1.lore", Arrays.asList("&7Все игроки вашей команды", "&7Навсегда получат ускорение I", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.sharpSword.tier1.name", "&eЗаостренные мечи");
        yml.addDefault("upgrades.Default.sharpSword.tier1.lore", Arrays.asList("&7Ваша команда получит Резкость I", "&7На всех мечах!", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.reinforced.tier1.name", "&eУкрепленная броня");
        yml.addDefault("upgrades.Default.reinforced.tier1.lore", Arrays.asList("&7Ваша команда поолучит Защиту I", "&7На всей броне!", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.trap.tier1.name", "&eЭто ловушка!");
        yml.addDefault("upgrades.Default.trap.tier1.lore", Arrays.asList("&7Враг, пытающийся зайти на вашу базу", "&7Получит слепоту", "&7и медлительность!", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.miningFatigue.tier1.name", "&eШахтерская усталостная ловушка");
        yml.addDefault("upgrades.Default.miningFatigue.tier1.lore", Arrays.asList("&7Враг, пытающийся зайти на вашу базу", "&7В течении 10 секунд получит", "&7усталость!", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.healPool.tier1.name", "&eИсцеляющее поле");
        yml.addDefault("upgrades.Default.healPool.tier1.lore", Arrays.asList("&7Создает поле регенирации", "&7вокруг вашей базы!", "", "&7Цена:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7умер.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7умер. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7был убит выстрелом игрока {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7был убит выстрелом игрока {KillerColor}{KillerName}&7! &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7был убит чешуйницей игрока {KillerColor}{KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7был убит Чешуйницей игрока {KillerColor}{KillerTeamName}! &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7был убит Железным Големом игрока {KillerColor}{KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7был убит Железным Големом игрока {KillerColor}{KillerTeamName}! &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");

        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7был взорван бомбой.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7был взорван бомбой. &b&lФИНАЛЬНОЕ УБИЙСТВО!");
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8Статистика игрока {player}");

        /* save default items messages for stats gui */
        addDefaultStatsMsg(yml, "wins", "&6Побед", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Проигрышей", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Убийств", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Смертей", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Финальных убийств", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Финальных смертей", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Кроватей уничтожено", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Первая игра", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Последняя игра", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Игр сыграно", "&f{gamesPlayed}");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");

        yml.addDefault(Messages.MEANING_NEVER, "Никогда");
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fВаш уровень: {level}",
                "",
                "&fПрогресс: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fМонет: &a{money}",
                "",
                "&fВсего побед: &a{wins}",
                "&fВсего убйиств: &a{kills}",
                "",
                "&e{serverIp}")
        );

        /* party commands */
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aКоманды пати:",
                "&e/party help &7- &bПоказывает все доступные команды",
                "&e/party invite <player> &7- &bПригласить игрока в ваше пати",
                "&e/party leave &7- &bВыйти из пати",
                "&e/party info &7- &bПоказать участников и владельца группы",
                "&e/party promote <player> &7- &bПередать владение группой",
                "&e/party remove <player> &7- &bВыгнать игрока из пати",
                "&e/party accept <player> &7- &bПринять приглашение в пати",
                "&e/party disband &7- &bРасфирмировать текующую группу")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eИспользуйте: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eПриглашение отправлено &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &eпригласил вас в пати! &o&7(Нажмите, чтобы принять)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cВы не можете пригласить самого себя!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cНет приглашений в пати.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eВы уже в пати!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cТолько владелец партии может это сделать!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eИспользуйте: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &eприсоединился к группе!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cВы не в группе!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cВы не можете покинуть свою собственное пати!\n&eПопробуйте: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eвышел из пати!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eПати расфармированно!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Используйте: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &eбыл удален из пати.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &eне состоит в вашем пати!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eВы успешно повысили {player} до владельца");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eВы были повышены до владельца группы");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} был повышен до владельца группы");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eВладелец группы: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eУчастники группы:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cУничтожение кроватей");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fАлмазы II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fАлмазы III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fВнезапная смерть");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fИзумруды II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fИзумруды III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Игра закончиться");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cВАША КРОВАТЬ УНИЧТОЖЕНА!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fВсе кровати были уничтожены!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lВсе кровати были уничтожены!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cСмерть");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cСМЕРТЬ: &6&b{TeamDragons} {TeamColor}{TeamName} Dragon!");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cКоманда не найдена или у вас нет прав!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Вы не играете!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Обратный отсчет сокращен!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Вы не можете сократить время старта.\n§7Подумайте о том, чтобы купить донат.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Ты теперь наблюдаешь за §9{arena}§6.\n{prefix}§eДля выхода с арены используй §c/leave§e.");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Телепортер"); // Да-да :D
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Здоровье: &f{health}%", "&7Насыщенность: &f{food}", "", "&7ЛКМ для слежки"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lВернутья в лобби");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Щелкните правой кнопкой мыши, чтобы вернуться в лобби!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aСлежка за &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cШИФТ для выхода");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eПокидание режима слежки");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eоффлайн!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cНа этой арене отключена слежка!");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cВладелец пати покинут сервер, пати распущена!"); // Можно сменить на команду в целом, сленговое слово пати тоже норм.
                                                                                                                         // Добавлено Matveev_: согл, сленговое лучше, харош

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eСтатистика");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fПКМ, чтобы увидеть свою статистику!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eАрены");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fВыберите арену!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eВернутья в лобби");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fЩелкните правой кнопкой мыши, чтобы вернуться в лобби!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eСтатистика");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fПКМ, чтобы увидеть свою статистику!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eВернутья в лобби");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fЩелкните правой кнопкой мыши, чтобы вернуться в лобби!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eТелепортер");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eВернутья в лобби");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fЩелкните правой кнопкой мыши, чтобы вернуться в лобби!"));

        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cВы не можете сделать этого! Подождите еще {seconds} секунд!");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[ВСЕМ]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[НАБЛЮДАТЕЛЬ]");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cИзвините, но вы не можете пресоедениться к этой арене прямо сейчас. Используйте ПКМ для режима наблюдателей!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cИзвините, но вы не можете наблюдать за этой ареной прямо сейчас. Используйте ЛКМ для входа в игру!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cИзвините, но вы должны подключиться к арене, используя BedWarsProxy. \n&eЕсли вы хотите настроить арену, убедитесь, что у вас есть право bw.setup, чтобы подключаться к серверу напрямую!");

        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cАрен для перезахода не найдено!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cВы больше не можете перезайти. Игра окончена или ваша кровать была разрушена.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eПереносим вас в игру, на карту &a{arena}&e!");


        yml.addDefault(Messages.MEANING_NO_TRAP, "Ловушки отсутствуют!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Цена: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Нажми для покупки!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Тебе не хватает {currency}");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cЗАБЛОКИРОВАНО");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}РАЗБЛОКИРОВАНО");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} купил &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Железная Печь");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Делает быстрее спавнер", "&7ресурсов вашего острова.", "", "{tier_1_color}Фаза 1: +50% К ресурсам, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Фаза 2: +100% К ресурсам, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Фаза 3: Спавнит изумруды, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Фаза 4: +200% К ресурсам, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Золотая Печь");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Изумрудная Печь");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Алмазная Печь");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eКупить ловушку");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Купленные ловушки будут", "&7размещенны в очереди.", "", "&eНажмите чтобы посмотреть!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Заострённые Мечи");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Ваша команда получит", "&7Остроту I на все мечи,", "&7а также топоры!", "", "{tier_1_color}Цена: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Защищёная Броня I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Ваша команда получит", "&7Защиту I на всю броню!", "", "{tier_1_color}Фаза 1: Защита I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Фаза 2: Защита II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Фаза 3: Защита III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Фаза 4: Защита IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Защищёная Броня II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Защищёная Броня III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Защищёная Броня IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Быстрый Шахтёр I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Ваша команда получит", "&7Спешку I.", "", "{tier_1_color}Фаза 1: Спешка I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Фаза 2: Спешка II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Быстрый Шахтёр II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Исцеляющее Поле");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Создаёт исцеляющее поле", "&7вокруг вашей базы!", "", "{tier_1_color}Цена: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Драконы");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Ваша команда будет иметь 2 драконов,", "&7вместо 1 во время конца игры!", "", "{tier_1_color}Цена: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Покупаемое");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Очередь Ловушек"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Ловушка #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Первый человек который зайдёт", "&7на базу, активирует", "&7эту ловушку!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7Покупка ловушки,", "&7добавит её в очередь. Её цена", "&7будет увеличиваться по мере", "&7числа купленных ловушек.", "", "&7Следущяя ловушка: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Ловушка #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Второй человек который зайдёт", "&7на базу, активирует", "&7эту ловушку!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7Покупка ловушки,", "&7добавит её в очередь. Её цена", "&7будет увеличиваться по мере", "&7числа купленных ловушек.", "", "&7Следущяя ловушка: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Ловушка #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Третий человек который зайдёт", "&7на базу, активирует", "&7эту ловушку!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7Покупка ловушки,", "&7добавит её в очередь. Её цена", "&7будет увеличиваться по мере", "&7числа купленных ловушек.", "", "&7Следущяя ловушка: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Это ловушка!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Накладывает Слепоту и Медлительность", "&7на 5 секунд.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Ловушка-Помощник");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Даёт вам и вашим союзникам", "&7скорость I на 15 секунд.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Ловушка с Тревогой");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Показывает игроков, которые были", "&7с зельем невидимости.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Ловушка Медленный Шахтёр");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Замедляет копание на", "&710 секунд.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aНазад");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7К улучшениям команды"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Очередь ловушек");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cОчередь ловушек переполнена!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&lВаша {trap} был(а) отключена!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cЛОВУШКА БЫЛА АКТИВИРОВАНА!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fВаша {trap} был(а) активирован(а)!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lЛовушка была активирована игроком &7&l{player} &c&lиз {color}&l{team} &c&lкоманды!"); // set off = активирована?
                                                                                                                                                           // Добавлено Matveev_: не ебу
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lВНИМАНИЕ!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fЛовушка была активирована командой {color}{team} &f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cНазвание не задано");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cОписание не задано"));
        // Additional command, setup, and administration messages.
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7Арена {arena} не существует!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} добавлена в группу: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Группа создана!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Создать группу арен. Подробнее в нашей вики.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fПо умолчанию");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Группа удалена!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eнажмите для подробностей");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fУправление группами арен.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Такая группа уже существует!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Доступные группы арен:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Просмотреть доступные группы.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Эта группа не существует!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Удалить группу арен. Подробнее в нашей вики.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Установить группу арены. Подробнее в нашей вики.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Группы с названием {group} не существует");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} наборов)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fПоказать доступные арены");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cНет арен для отображения.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fWl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Созданные игры: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Введите /§a{command} arenaList {page}§7 для следующей страницы.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Использование: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Вы больше не можете ставить и ломать блоки!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §eправо на строительство");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fВключить или выключить режим строительства,\n§fчтобы ставить и ломать блоки.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Теперь вы можете ставить и ломать блоки.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Произошла ошибка при копировании конфигурации карты. Проверьте консоль.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Сначала отключите {arena}!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fКлонировать существующую арену.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} уже существует!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Готово :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Использование: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Введите ещё раз для подтверждения.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fУдалить карту и её конфигурацию.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Эта арена не существует!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} удалена!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Использование: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} не существует как папка мира!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Эта арена уже отключена!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fОтключить арену.\nЭто удалит игроков \n§fс арены перед отключением.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7На этой арене идёт игра, отключите её после окончания игры!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Отключение арены...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Эта арена уже включена!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fВключить арену.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Эта арена уже находится в очереди включения!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Включение арены...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Использование: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eнажмите для подробностей");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fУправление уровнем игрока.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cКоличество должно быть целым числом!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cУровень должен быть целым числом!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Игрок не найден!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Игроку может потребоваться перезайти, чтобы увидеть обновление.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Установить уровень игрока.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7Уровень игрока {player} установлен на: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Использование: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Выдать опыт игроку.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7Игроку {player} выдано опыта: {amount}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Использование: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Нажмите, чтобы использовать.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Использование: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Для количества игроков в этой группе арены можно использовать §e{players}§7.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bустановлен!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §eсоздать NPC для входа");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fСоздать NPC для входа в игру.  \n§fНажмите для подробностей.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fИспользуйте эту команду для создания NPC входа в игру.\n§fНажмите, чтобы увидеть синтаксис.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Использование: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fВстаньте перед NPC, чтобы удалить его.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Использование: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bПоблизости нет NPC.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bNPC ещё не установлен!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bВыбранный NPC удалён!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bЦелевые группы: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Конфигурация арены {config} перезагружена!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} перезагружена!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §eперезагрузить сообщения");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fПерезагрузить сообщения.\n§cНе рекомендуется!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7Язык {language} перезагружен!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Вы уже находитесь в процессе настройки!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 не должен содержать заглавные буквы! Переименуйте папку в: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Сначала отключите её!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fСоздать или изменить арену.\nСимволы '_' и '-' не отображаются в названии арены.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} не должен содержать этот символ: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Использование: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lНажмите здесь, чтобы создать найденные команды.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fНажмите, чтобы создать найденные команды!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lНАЙДЕНЫ НОВЫЕ КОМАНДЫ:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Новые команды не найдены.\n§6 ▪ §7Создайте команды вручную: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Поиск команд. Это может вызвать задержки.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Время ожидания истекло. Введите команду снова для поиска команд.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fЕсли вы хотите, чтобы лобби исчезало при начале игры,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lУДАЛЕНИЕ ЛОББИ ОЖИДАНИЯ:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Этот шаг НЕОБЯЗАТЕЛЕН. Чтобы пропустить его, выполните §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fиспользуйте следующие команды, как выделение WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Доступные команды: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6КРОВАТЬ УСТАНОВЛЕНА");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Добавить кровать команды.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Кровать установлена для: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aКровать установлена для: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fУстановить кровать команды.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cПри использовании этой команды вы должны стоять на кровати!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cВы должны стоять на кровати.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fУстановить кровать для {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Максимальная высота строительства Y установлена: §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Использование: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Доступные цвета: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7Команда {team} §7создана!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7Команда {team} уже существует!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Недопустимый цвет!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Использование: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "Генератор {generator} добавлен!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6Генератор {generator} §aдобавлен!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Добавить генератор команды.\nКоманда будет определена автоматически.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Попробуйте: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6Генератор {generator} добавлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Генератор {generator} добавлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6Генератор {generator}§a для команды {team}§a добавлен!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (определить команду автоматически)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Используйте /bw createTeam, если хотите создать команду.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cЭтот генератор уже установлен!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cЭтот генератор уже установлен!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6ГЕНЕРАТОР {generator} УСТАНОВЛЕН");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Другой вариант: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Добавить генератор изумрудов или алмазов.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Генератор установлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Добавить генератор команды.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cНе удалось найти команду: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Генератор установлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aГенератор установлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Сначала создайте команды!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cСначала создайте команды!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Дроп за убийства {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Установить место дропа за убийства для команды.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Дроп за убийства установлен для: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Дроп за убийства {team} (нажмите для установки)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fУстановить дроп за убийства для {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Дроп за убийства установлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aДроп за убийства установлен для команды: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cИспользование: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Максимум игроков в команде установлен!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Использование: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cПоблизости не удалось найти команду.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cПоблизости не удалось найти команду.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Вы не находитесь в процессе настройки!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Поблизости не удалось найти генератор (радиус 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cПоблизости не удалось найти генератор.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Генератор {generator} удалён в точке: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aГенератор {generator} удалён.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Вы должны стоять рядом с голограммой генератора, который хотите удалить.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §aГенератор {generator} удалён.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "Генераторы команды {team} удалены!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Генератор {generator} команды {team} удалён в точке: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Генератор команды {team} удалён.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Удалить {team} §7(нажмите для удаления)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Эта команда не существует: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cКоманда не найдена: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Команда удалена: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aКоманда удалена: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cИспользование: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Теперь вы можете включить арену с помощью:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aВключить эту арену.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (нажмите для включения)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Изменения арены сохранены!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6МАГАЗИН УСТАНОВЛЕН");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Установить магазин команды.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Другой вариант: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Магазин установлен для: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Установить магазин для {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6ТОЧКА ПОЯВЛЕНИЯ УСТАНОВЛЕНА");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Оставшиеся команды: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Точка появления установлена для: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Список команд: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Установить точку появления для: {team} (нажмите для установки)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fУстановить точку появления для {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cНе удалось найти целевую команду: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cИспользование: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "Место появления наблюдателей установлено!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cИспользование: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Если точка появления установлена, но команда не найдена автоматически, попробуйте: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cЭта команда не существует!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(нажмите для установки)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Сначала установите точку появления команды!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fУстановить точку появления команды.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Доступные типы: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Группа арены изменена на: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(нажмите для установки)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dНажмите, чтобы сделать арену типа {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Использование: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6УЛУЧШЕНИЯ УСТАНОВЛЕНЫ");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Установить NPC улучшений команды.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "NPC улучшений установлен для: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fNPC улучшений установлен для {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dУстановить позицию {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Установите оставшуюся позицию:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7Позиция {position} установлена!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Установите точки появления команд, если ещё не сделали этого!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Использование: /{command} {subcommand} 1 or 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Точка ожидания установлена для §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aУстановить главное лобби. §fЭто обязательно, но\n§fесли сервер работает в режиме §eBUNGEE§f,\n§fместо лобби §eне §fбудет использоваться.\n§eВведите снова, чтобы заменить старую точку появления.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Эту команду нельзя использовать на аренах. Она предназначена для главного лобби!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(не установлено)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(установлено)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Место лобби установлено!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Переключить проверку готовности.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eПринудительно завершить арену");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fПринудительно завершить арену без победителя.\n&fПраво: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cИгра ещё не началась.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aПринудительное завершение игры...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eПринудительно начать арену");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fПринудительно начать арену.\n&fПраво: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eСократить обратный отсчёт начала до 5 секунд");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fСократить обратный отсчёт начала арены до 5 секунд.\n&fПраво: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Переключить статус готовности.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fОткрывает меню арены.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fВойти на арену по имени или группе.\n&f/{command} join random - войти на случайную арену.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fИзменить язык.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fПокинуть арену.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fОткрыть меню статистики.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fПереключаться между режимом наблюдателя Vanilla и режимом наблюдателя плагина.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Команды администратора");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eenable/ disable");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fВ данный момент нет доступных команд консоли.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Сначала установите место лобби!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Вы не должны здесь находиться.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e просмотр команд игрока");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fПросмотреть команды игрока.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &a{world} команды");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} от andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Арены: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(НЕ УСТАНОВЛЕНО)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(УСТАНОВЛЕНО)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oНЕОБЯЗАТЕЛЬНО");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(ВСЁ УСТАНОВЛЕНО)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Осталось: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(ПОЗИЦИЯ 1 НЕ УСТАНОВЛЕНА)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(ПОЗИЦИЯ 2 НЕ УСТАНОВЛЕНА)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(автоопределение)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} СОЗДАНО)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (УСТАНОВЛЕНО: {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fУстановить место, где игроки будут\n&fожидать начала игры.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fСделать так, чтобы лобби ожидания исчезало при начале игры.\n&fВыделите его как регион WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fУстановить место появления наблюдателей.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fСоздать команды на основе цветов островов.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fСоздать команду.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fУдалить команду по названию.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fУстановить точку появления команды.\n&fКоманды без установленной точки появления:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fУстановить место кровати команды.\n&fУказывать название команды не нужно.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fУстановить NPC команды.\n&fУказывать название команды не нужно.\n&fОн появится только при начале игры.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fУстановить NPC улучшений команды.\n&fУказывать название команды не нужно.\n&fОн появится только при начале игры.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fУстановить место для выпадения\n&fпредметов врагов после их убийства.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fДобавить точку появления генератора.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fВстаньте на алмазный блок, чтобы установить генератор алмазов.\n&fВстаньте на изумрудный блок, чтобы установить генератор изумрудов.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fДобавить точку появления генератора.\n&eВстаньте на острове команды, чтобы установить генератор команды\n&fВстаньте на алмазный блок, чтобы установить генератор алмазов.\n&fВстаньте на изумрудный блок, чтобы установить генератор изумрудов.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fУстановить максимальный размер команды.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fУстановить группу арены.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fДобавить арену в группу.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fСохранить арену и вернуться в лобби");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cПопытка загрузить арену {arena}, но она уже в очереди включения.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cПопытка загрузить арену {arena}, но она уже включена.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "Вы не установили ни одной команды для арены: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cНа арене {arena} необходимо установить как минимум 2 команды");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cНе существует карты с названием {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cНедопустимый цвет команды {team} на арене {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} не установлен для команды {team} на арене {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cНа арене {arena} не установлен генератор алмазов");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cНа арене {arena} не установлен генератор изумрудов");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cНа арене {arena} не установлена точка ожидания");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Выберите способ настройки");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lУПРОЩЁННАЯ НАСТРОЙКА");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aПростая и быстрая настройка!", "&7Для новичков и ленивых администраторов :D", "", "&3Меньше параметров."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lРАСШИРЕННАЯ НАСТРОЙКА");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aПодробная настройка!", "&7Для опытных администраторов :D", "", "&3Расширенные параметры."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7Загрузка {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7Настройка {arena} отменена!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aВы телепортированы к точке появления арены &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&aЗдравствуйте, {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fУстановите точку ожидания.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fЗдесь игроки будут ожидать начала игры.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6НАЖМИТЕ ЗДЕСЬ, ЧТОБЫ УСТАНОВИТЬ ЛОББИ ОЖИДАНИЯ    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dНажмите, чтобы установить точку ожидания.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eИли введите: &7/{command}, чтобы увидеть список команд.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fПоказать список команд.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6Генератор {generator} добавлен для команды: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6ТОЧКА ПОЯВЛЕНИЯ УСТАНОВЛЕНА");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6КРОВАТЬ УСТАНОВЛЕНА");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6МАГАЗИН УСТАНОВЛЕН");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6УЛУЧШЕНИЕ УСТАНОВЛЕНО");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Дроп за убийства {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} УСТАНОВЛЕН");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Железо");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Золото");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Изумруд");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Алмаз");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Доступные команды: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cНе удалось запустить настройку. Проверьте консоль.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cПоддержка Vault отсутствует!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lОШИБКА: Требуется поддержка Vault! Установите плагин Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Табличка сохранена для арены: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Вы ещё не установили ни одной арены!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 был ПЕРЕЗАГРУЖЕН! (не перезагружайте плагины)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lСчастливого Хэллоуина!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} опыта!");
        addContentMessages(yml, "Compact Pop-up Tower", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Компактная выдвижная башня", Arrays.asList("&7Цена: {cost} {currency}", "", "&7Установите компактную", "&7оборонительную башню!", "", "{quick_buy}", "{buy_status}"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Улучшения команды");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

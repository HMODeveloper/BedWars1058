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

public class Romanian extends Language {

    public Romanian() {
        super(BedWars.plugin, "ro");
        YamlConfiguration yml = getYml();
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Română");

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

        yml.options().copyDefaults(true);

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(spectator)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "spawn-protection este activat în server.properties; acest lucru poate afecta arenele BedWars. Se recomandă setarea la 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Multiverse-Core a fost detectat; elimină-l sau asigură-te că nu modifică hărțile BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Se încarcă {world} din containerul de lumi Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Se creează o nouă hartă goală: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7ID utilizator: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7ID descărcare: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7Arena {arena} nu există!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} a fost adăugată grupului: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Grup creat!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Creează un grup de arene. Mai multe detalii pe wiki-ul nostru.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fImplicit");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Grup șters!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eclic pentru detalii");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fGestionează grupurile de arene.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Acest grup există deja!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Grupuri de arene disponibile:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Vezi grupurile disponibile.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Acest grup nu există!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Elimină un grup de arene. Mai multe detalii pe wiki-ul nostru.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Setează grupul arenei. Mai multe detalii pe wiki-ul nostru.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Nu există niciun grup numit: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} setate)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fAfișează arenele disponibile");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cNu există arene de afișat.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fWl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Jocuri inițializate: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Tastează /§a{command} arenaList {page}§7 pentru pagina următoare.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Utilizare: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Nu mai poți plasa și sparge blocuri!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §epermisiune de construire");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fActivează sau dezactivează sesiunea de construire \n§fpentru a putea sparge sau plasa blocuri.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Acum poți plasa și sparge blocuri.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7A apărut o eroare la copierea configurației hărții. Verifică consola.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Dezactivează mai întâi {arena}!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fClonează o arenă existentă.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} există deja!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Gata :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Utilizare: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Tastează din nou pentru confirmare.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fȘterge o hartă și configurația acesteia.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Această arenă nu există!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} a fost ștearsă!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Utilizare: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} nu există ca folder de lume!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Această arenă este deja dezactivată!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fDezactivează o arenă.\nAceasta va elimina jucătorii \n§fdin arenă înainte de dezactivare.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7Există un joc în desfășurare în această arenă; dezactiveaz-o după terminarea jocului!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Se dezactivează arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Această arenă este deja activată!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fActivează o arenă.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Această arenă este deja în coada de activare!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Se activează arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Utilizare: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eclic pentru detalii");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fGestionează nivelul unui jucător.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cCantitatea trebuie să fie un număr întreg!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cNivelul trebuie să fie un număr întreg!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Jucătorul nu a fost găsit!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Jucătorul poate fi nevoit să se reconecteze pentru a vedea actualizarea.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Setează nivelul unui jucător.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7Nivelul lui {player} a fost setat la: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Utilizare: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Oferă XP unui jucător.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{amount} XP a fost oferit lui: {player}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Utilizare: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Clic pentru utilizare.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Utilizare: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Poți folosi §e{players} §7pentru numărul de jucători din acest §7grup de arene.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §ba fost setat!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §ecreează un NPC de intrare");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fCreează un NPC de intrare  \n§fClic pentru mai multe detalii.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fFolosește această comandă pentru a crea un NPC de intrare.\n§fClic pentru a vedea sintaxa.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Utilizare: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fStai în fața unui NPC pentru a-l elimina.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Utilizare: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bNu există niciun NPC în apropiere.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bNu a fost setat încă niciun NPC!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bNPC-ul țintă a fost eliminat!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bGrupuri țintă: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Configurația arenei {config} a fost reîncărcată!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} a fost reîncărcat!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §ereîncarcă mesajele");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fReîncarcă mesajele.\n§cNerecomandat!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} a fost reîncărcată!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Ești deja într-o sesiune de configurare!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 nu trebuie să conțină litere majuscule! Redenumește folderul în: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Dezactiveaz-o mai întâi!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fCreează sau editează o arenă.\n'_' și '-' nu vor fi afișate în numele arenei.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} nu trebuie să conțină acest simbol: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Utilizare: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lClic aici pentru a crea echipele găsite.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fClic pentru a crea echipele găsite!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lECHIPE NOI GĂSITE:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Nu au fost găsite echipe noi.\n§6 ▪ §7Creează manual echipele cu: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Se caută echipe. Acest lucru poate cauza lag.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Timpul a expirat. Tastează din nou pentru a căuta echipe.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fDacă vrei ca lobby-ul să dispară când începe jocul,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lELIMINAREA LOBBY-ULUI DE AȘTEPTARE:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Acest pas este OPȚIONAL. Pentru a-l sări, tastează §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§ffolosește următoarele comenzi ca pe o selecție WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Echipe disponibile: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6PAT SETAT");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Adaugă patul unei echipe.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Pat setat pentru: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aPat setat pentru: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fSetează patul unei echipe.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cTrebuie să stai pe un pat cât timp folosești această comandă!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cTrebuie să stai pe un pat.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fSetează patul pentru {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Înălțimea maximă de construire Y a fost setată la §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Utilizare: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Culori disponibile: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7a fost creată!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7Echipa {team} există deja!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Culoare invalidă!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Utilizare: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "Generatorul {generator} a fost adăugat!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a generator adăugat!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Adaugă un generator de echipă.\nEchipa va fi detectată automat.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Încearcă să folosești: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{generator} generator adăugat pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Generatorul {generator} a fost adăugat pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6{generator}§a generator pentru {team}§a a fost adăugat!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (detectează automat echipa)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Folosește: /bw createTeam dacă vrei să creezi una.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cAcest generator a fost deja setat!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cAcest generator a fost deja setat!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} SETAT");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Altă utilizare: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Adaugă un generator de smaralde/ diamante.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Generator setat pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Adaugă un generator de echipă.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cNu s-a putut găsi echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Generator setat pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aGenerator setat pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Creează mai întâi echipele!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cCreează mai întâi echipele!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Dropuri de ucidere {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Setează locația dropurilor de ucidere pentru o echipă.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Dropuri de ucidere setate pentru: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Dropuri de ucidere {team} (clic pentru setare)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fSetează dropurile de ucidere pentru {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Dropuri de ucidere setate pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aDropuri de ucidere setate pentru echipa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cUtilizare: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Numărul maxim din echipă a fost setat!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Utilizare: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cNu s-a găsit nicio echipă în apropiere.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cNu s-a găsit nicio echipă în apropiere.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Nu ești într-o sesiune de configurare!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Nu s-a găsit niciun generator în apropiere (rază 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cNu s-a găsit niciun generator în apropiere.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Generatorul {generator} a fost eliminat la locația: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aGeneratorul {generator} a fost eliminat.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Trebuie să stai aproape de holograma generatorului pe care vrei să-l elimini.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §ageneratorul {generator} a fost eliminat.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "Generatoarele echipei {team} au fost eliminate!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Generatorul {generator} al echipei {team} a fost eliminat la locația: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Generatorul echipei {team} a fost eliminat.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Elimină {team} §7(clic pentru eliminare)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Această echipă nu există: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cEchipă negăsită: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Echipă eliminată: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aEchipă eliminată: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cUtilizare: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Acum o poți activa folosind:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aActivează această arenă.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (clic pentru activare)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Modificările arenei au fost salvate!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6MAGAZIN SETAT");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Setează magazinul unei echipe.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Altă utilizare: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Magazin setat pentru: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Setează magazinul pentru {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6SPAWN SETAT");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Rămase: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Spawn setat pentru: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Lista echipelor: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Setează spawnul pentru: {team} (clic pentru setare)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fSetează spawnul pentru {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cNu s-a găsit echipa țintă: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cUtilizare: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "Locația spectatorului a fost setată!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cUtilizare: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Sau, dacă ai setat spawnul și nu a fost găsit automat, încearcă: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cAceastă echipă nu există!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(clic pentru setare)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Asigură-te că setezi mai întâi spawnul echipei!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fSetează spawnul unei echipe.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Tipuri disponibile: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Grupul arenei a fost schimbat în: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(clic pentru setare)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dClic pentru a face arena de tipul {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Utilizare: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6ÎMBUNĂTĂȚIRI SETATE");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Setează NPC-ul de îmbunătățiri al unei echipe.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "NPC de îmbunătățiri setat pentru: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fNPC de îmbunătățiri setat pentru {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dSetează poziția {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Setează poziția rămasă:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7Poziția {position} a fost setată!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Setează spawnul echipelor dacă nu ai făcut-o!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Utilizare: /{command} {subcommand} 1 sau 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Spawnul de așteptare a fost setat pentru §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aSetează lobby-ul principal. §fEste necesar, dar\n§fdacă vei folosi serverul în modul §eBUNGEE §f\n§flocația lobby-ului §enu §fva fi folosită.\n§eTastează din nou pentru a înlocui locația veche de spawn.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Această comandă nu poate fi folosită în arene. Este destinată lobby-ului principal!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(nesetat)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(setat)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Locația lobby-ului a fost setată!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Activează sau dezactivează verificarea pregătirii.");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eTrimite un mesaj arenei curente");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fTrimite un mesaj tuturor jucătorilor din arena curentă.\n&fFolosește: /{command} echo <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperator&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eTrimite un mesaj unei arene anume");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fTrimite un mesaj tuturor jucătorilor dintr-o anumită arenă.\n&fFolosește: /{command} echoto <arena> <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eTrimite un mesaj tuturor arenelor");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fTrimite un mesaj jucătorilor din toate arenele.\n&fFolosește: /{command} echoall <mesaj>");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eForțează încheierea unei arene");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fForțează încheierea unei arene fără câștigător.\n&fPermisiune: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cJocul nu este în desfășurare.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aSe forțează încheierea jocului...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eForțează pornirea unei arene");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fForțează pornirea unei arene.\n&fPermisiune: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eScurtează numărătoarea inversă de pornire la 5s");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fScurtează numărătoarea inversă de pornire la 5s într-o arenă.\n&fPermisiune: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Activează sau dezactivează starea de pregătire.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fDeschide GUI-ul arenei.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fIntră într-o arenă după nume sau grup.\n&f/{command} join random - intră într-o arenă aleatorie.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fSchimbă-ți limba.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fPărăsește o arenă.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fDeschide GUI-ul statisticilor.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fComută între modul spectator vanilla și modul spectator al pluginului.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Comenzi administrative");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eenable/ disable");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fNu există momentan comenzi disponibile pentru consolă.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Trebuie să setezi mai întâi locația lobby-ului!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Nu ar trebui să fii aici.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e vezi comenzile jucătorilor");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fVezi comenzile jucătorilor.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &acomenzile {world}");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} de andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Arene: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(NESETAT)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(SETAT)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oOPȚIONAL");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(TOATE SETATE)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Rămase: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(POS 1 NESETATĂ)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(POS 2 NESETATĂ)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(detectare automată)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} CREATE)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (SETAT LA {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fSetează locul în care jucătorii vor\n&faștepta înainte de începerea jocului.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fFă lobby-ul de așteptare să dispară la pornire.\n&fSelectează-l ca regiune WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fSetează locul de spawn al spectatorilor.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fCreează echipe pe baza culorilor insulelor.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fCreează o echipă.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fElimină o echipă după nume.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fSetează spawnul unei echipe.\n&fEchipe fără spawn setat:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fSetează locația patului unei echipe.\n&fNu trebuie să specifici numele echipei.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fSetează NPC-ul magazinului unei echipe.\n&fNu trebuie să specifici numele echipei.\n&fVa fi generat doar când începe jocul.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fSetează NPC-ul de îmbunătățiri al unei echipe.\n&fNu trebuie să specifici numele echipei.\n&fVa fi generat doar când începe jocul.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fSetează locul unde vor fi aruncate\n&fobiectele inamicilor după ce îi omori.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fAdaugă un punct de spawn pentru un generator.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fStai pe un bloc de diamant pentru a seta generatorul de diamante.\n&fStai pe un bloc de smarald pentru a seta generatorul de smaralde.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fAdaugă un punct de spawn pentru un generator.\n&eStai pe o insulă de echipă pentru a seta un generator de echipă\n&fStai pe un bloc de diamant pentru a seta generatorul de diamante.\n&fStai pe un bloc de smarald pentru a seta generatorul de smaralde.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fSetează dimensiunea maximă a echipei.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fSetează grupul arenei.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fAdaugă arena într-un grup.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fSalvează arena și revino în lobby");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cS-a încercat încărcarea arenei {arena}, dar aceasta este deja în coada de activare.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cS-a încercat încărcarea arenei {arena}, dar aceasta este deja activată.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "Nu ai setat nicio echipă pentru arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cTrebuie să setezi cel puțin 2 echipe pe: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cNu există nicio hartă numită {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cCuloare invalidă la echipa: {team} în arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} nu este setat pentru echipa {team} în: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cNu este setat niciun generator de diamante în: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cNu este setat niciun generator de smaralde în: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cSpawnul de așteptare nu este setat în: {arena}");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Alege o metodă de configurare");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lCONFIGURARE ASISTATĂ");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aConfigurare ușoară și rapidă!", "&7Pentru începători și staff leneș :D", "", "&3Opțiuni reduse."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lCONFIGURARE AVANSATĂ");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aConfigurare detaliată!", "&7Pentru staff experimentat :D", "", "&3Opțiuni avansate."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7Se încarcă {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7Configurarea arenei {arena} a fost anulată!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aAi fost teleportat la spawnul arenei &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&aSalut {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fSetează spawnul de așteptare.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fAcesta este locul în care jucătorii vor aștepta începerea jocului.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6CLIC AICI PENTRU A SETA LOBBY-UL DE AȘTEPTARE    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dClic pentru a seta spawnul de așteptare.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eSau tastează: &7/{command} pentru a vedea lista comenzilor.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fAfișează lista comenzilor.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6Generator {generator} adăugat pentru echipa: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6SPAWN SETAT");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6PAT SETAT");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6MAGAZIN SETAT");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6ÎMBUNĂTĂȚIRI SETATE");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Dropuri de ucidere {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} SETAT");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Fier");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Aur");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Smarald");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Diamant");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Echipe disponibile: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cNu s-a putut porni sesiunea de configurare. Verifică consola.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cLipsește suportul Vault!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lEROARE: Aceasta necesită suport Vault! Instalează pluginul Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Semn salvat pentru arena: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Nu ai setat încă nicio arenă!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 a fost REÎNCĂRCAT! (nu reîncărca pluginurile)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lHalloween fericit!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} XP!");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cFolosește: /bw echo <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aMesaj trimis în arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cNu ești într-o arenă.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cFolosește: /bw echoto <arena> <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aMesaj trimis în arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cFolosește: /bw echoall <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aMesaj trimis în toate arenele.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena nu a fost găsită: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cAceastă comandă este doar pentru jucători.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aAcum ești pregătit!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aNu mai ești pregătit.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aToți jucătorii sunt pregătiți! Numărătoarea redusă la 10 secunde!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aVerificarea pregătirii a fost activată.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aVerificarea pregătirii a fost dezactivată.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cAceastă comandă este dezactivată.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cNu ești într-un joc!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cNu poți folosi această comandă acum.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cSpectatorii nu pot folosi această comandă.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aPregătit");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cNepregătit");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Clic dreapta pentru a fi pregătit!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Clic dreapta pentru a anula pregătirea!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Nu sunt destui jucători pentru a începe jocul!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aModul spectator Vanilla a fost activat.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aModul spectator normal a fost activat.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cInventarul este plin!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aEchipată!");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cArena este plină!\n&aAi putea lua în considerare donarea pentru mai multe facilități. &7&o(clic)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cNe pare rau dar arena este plina.\n&cStim ca esti donator dar arena este deja plina cu persoane care au prioritate.");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cNu exista arene sau grupuri cu numele: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cNu sunt arene disponibile momentan ;(");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cNu esti intr-o arena!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Limbi disponibile:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Foloseste: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cAceasta limba nu exista!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aLimba a fost schimbata!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cNu poti schimba limba in timpul meciului.");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cJucătorul nu a fost găsit!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cAcest jucător nu este într-o arenă BedWars!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cArena în care se află jucătorul nu a început încă!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cFolosește: /bw tp <player>");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cGrupul este prea mare pentru a intra ca o singură echipă :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cDoar liderul poate alege arena.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &ea intrat (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &es-a reconectat!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &ea iesit!");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Folosire: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cNu poti face asta in timpul meciului.");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aComenzi de grup:",
                "&e/party help &7- &bAfișează acest mesaj de ajutor",
                "&e/party invite <player> &7- &bInvită un jucător în grup",
                "&e/party leave &7- &bPărăsește un grup",
                "&e/party info &7- &bArată membrii și proprietarul grupului",
                "&e/party promote <player> &7- &bTransferă conducerea grupului",
                "&e/party remove <player> &7- &bScoate un jucător din grup",
                "&e/party accept <player> &7- &bAcceptă o invitație",
                "&e/party disband &7- &bȘterge grupul")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eFolosire: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eInvitația a fost trimisă lui &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &ete-a invitat într-un grup! &o&7(Clic pentru a accepta)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cNu te poți invita singur!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cNu ai cereri de acceptat.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eEști deja într-un grup!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cDoar deținătorul grupului poate face asta!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eFolosire: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &ea intrat în grup!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cNu ești într-un grup!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cNu poți ieși din propriul grup!\n&eÎncearcă: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &ea ieșit din grup!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eGrupul a fost șters!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Folosire: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &ea fost scos din grup.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &enu este în acest grup!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eAi promovat cu succes pe {player} ca proprietar");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eAi fost promovat ca proprietar al grupului");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} a fost promovat ca proprietar");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eProprietarul grupului este: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS, "{prefix}&eMembrii grupului sunt:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cComanda nu a fost gasita sau nu ai permisiunea!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Nu esti in joc!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Numaratoarea a fost redusa!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Nu poti forta arena sa inceapa.\n§7Ai putea lua in considerare donarea pentru mai multe facilitati.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Acum urmaresti meciul din §9{arena}§6.\n{prefix}§ePoti parasi arena folosind §c/leave§e.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eeste offline!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cSpectatorii nu sunt permisi in aceasta arena!");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cNu poti face asta inca! Mai asteapta {seconds} secunde!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teleportor");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Viață: &f{health}%", "&7Hrană: &f{food}", "", "&7Clic stânga pentru a urmări."));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lÎntoarce-te în hol");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Clic dreapta pentru a merge în hol!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aUrmărești pe &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cFURIȘEAZĂ-TE pentru a ieși");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eIeși din modul spectator");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cNe pare rău, dar locul tău a fost rezervat unui donator.\n&aAi putea lua în considerare donarea pentru mai multe facilități. &7&o(clic)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cNu sunt destui jucatori! Numaratoarea a fost oprita!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eArena in care te aflai se reporneste.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cIn joc");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Se reporneste");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2In Asteptare §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Porneste §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Clic pentru a intra");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Stare: {status}", "&7Jucători: &f{on}&7/&f{max}", "&7Tip: &a{group}", "", "&aClic stânga pentru a intra.", "&eClic dreapta pentru a urmări."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eJocul incepe in &6{time} &esecunde!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cSe așteaptă mai mulți jucători..");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&lProtejeaza-ti patul si distruge paturile inamicilor.",
                "&e&l          Cumpara arme si upgrade-uri colectand",
                "&e&l   Fier, Aur, Emeralde si Diamonte de la generatoare.",
                "&e&l       pentru a accesa îmbunătățiri puternice.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aÎNCEPE");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cGrupul a fost șters deoarece deținătorul a ieșit!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cNe pare rău, dar nu poți intra chiar acum. Folosește clic dreapta pentru a urmări!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cNe pare rău, dar nu poți urmări arena chiar acum. Folosește clic stânga pentru a juca!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cÎmi pare rău, dar trebuie să intri într-o arenă folosind BedWarsProxy. \n&eDacă vrei să configurezi o arenă, asigură-te că îți acorzi permisiunea bw.setup pentru a putea intra direct pe server!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eNivel &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamant");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lSmarald");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eSe spawneaza in &c{seconds} &esecunde");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}&eGeneratoarele de {generatorType} &eau fost upgradate la nivelul &c{tier}");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[STRIGĂT] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[ OBSERVATOR ] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aViață"));

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 TU");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fUrmaresti: {team} &f- Distanta: {distance}m");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[STRIGAT]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[ OBSERVATOR ]");
        yml.addDefault(Messages.MEANING_SHOUT, "strigăt");
        yml.addDefault(Messages.MEANING_NOBODY, "Nimeni");
        yml.addDefault(Messages.MEANING_FULL, "Plin");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Fier");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Fier");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Aur");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Aur");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Smarald");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Smaralde");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamant");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamante");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.MEANING_NEVER, "Niciodata");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cNu poti deschide acest cufar pentru ca echipa nu a fost eliminata!");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cNu poti pune blocuri aici!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cPoți sparge doar blocurile plasate de un jucător!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cNu iti poti distruge propriul pat!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lPAT DISTRUS > {TeamColor}Patul Echipei {TeamName} &7a fost distrus de {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cPAT DISTRUS!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fNu te mai poti respawna!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lPAT DISTRUS > &7Patul tau a fost distrus de {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cNu mai ești invizibil deoarece ai primit daune!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7a cazut in void.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7a cazut in void. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7a fost impins in void de {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost impins in void de {KillerColor}{KillerName}&7. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7a fost impins de {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost impins de {KillerColor}{KillerName}&7. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7a fost lovit de tnt-ul lui {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost lovit de tnt-ul lui {KillerColor}{KillerName}&7. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7a fost ucis de {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost ucis de {KillerColor}{KillerName}&7. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7s-a deconectat in timpul luptei cu {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7s-a deconectat in timpul luptei cu {KillerColor}{KillerName}&7. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cESTI BLEG!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eTe vei respawna in &c{time} &esecunde!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eTe vei respawna in &c{time} &esecunde!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aRESPAWNAT!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cAi fost eliminat!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7a ramas cu &c{amount} &7HP!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7a murit.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7a murit. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7a fost impuscat de {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost impuscat de {KillerColor}{KillerName}&7! &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7a fost ucis de {KillerColor}Sobolanul Echipei {KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost ucis de {KillerColor}Sobolanul Echipei {KillerTeamName}! &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7a fost ucis de {KillerColor}Gardianul Echipei {KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7a fost ucis de {KillerColor}Gardianul Echipei {KillerTeamName}! &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7a fost lovit de o bomba.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &a fost lovit de o bomba. &b&lUCIDERE FINALA!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lJOC TERMINAT!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVICTORIE!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                 &6⭐ &lPrimul Ucigas &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                    &lAl 2-lea Ucigas &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                    &lAl 3-lea Ucigas &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}Echipa {TeamName} &aa castigat!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bÎMBUNĂTĂȚIRI ECHIPĂ,&e&lCLIC DREAPTA");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bÎMBUNĂTĂȚIRI,&e&lCLIC DREAPTA");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bMAGAZIN ECHIPĂ,&e&lCLIC DREAPTA");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bMAGAZIN SOLO,&e&lCLIC DREAPTA");
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lApără-ți patul!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lPatul tău a fost distrus!");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lECHIPĂ ELIMINATĂ > {TeamColor}Echipa {TeamName} &ca fost eliminată!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cDistrugerea paturilor");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamant II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamant III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fMoarte bruscă");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fSmarald II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fSmarald III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Sfârșitul jocului");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cPATUL A FOST DISTRUS!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fToate paturile au fost distruse!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lToate paturile au fost distruse!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cMoarte bruscă");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cMOARTE BRUSCĂ: &6&b{TeamDragons} {TeamColor}dragonul {TeamName}!");

        /* Lobby Command Obiecte */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eStatistici");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fClic dreapta pentru a-ți vedea statisticile!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eSelector de arene");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fClic dreapta pentru a alege o arenă."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eÎnapoi în hol");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fClic dreapta pentru a părăsi BedWars!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eStatistici");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fClic dreapta pentru a-ți vedea statisticile!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eÎnapoi în hol");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fClic dreapta pentru a părăsi BedWars!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeleportor");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "teleporter"), Collections.singletonList("&fClic dreapta pentru a urmări un jucător!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eÎnapoi în hol");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fClic dreapta pentru a părăsi arena!"));

        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cNu ai o arena pe care sa te reintorci!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cNu mai poti face asta. Jocul s-a terminat sau patul a fost distrus.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eIntri pe arena &a{arena}&e!");

        /* save default Obiecte messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8Statisticile lui {player}");
        addDefaultStatsMsg(yml, "wins", "&6Victorii", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Pierderi", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Ucideri", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Decese", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Ucideri Finale", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Decese Finale", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Paturi Distruse", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Primul Meci", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Ultimul Meci", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Partide Jucate", "&f{gamesPlayed}");

        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fNivelul tău: {level}",
                "",
                "&fProgres: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fBani: &a{money}",
                "",
                "&fVictorii: &a{wins}",
                "&fUcideri: &a{kills}",
                "",
                "&e{serverIp}")
        );
        // start of sidebar
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fHarta: &a{map}",
                "",
                "&fJucatori: &a{on}/{max}",
                "",
                "&fIn asteptare,&fIn asteptare.,&fIn asteptare..,&fIn asteptare...",
                "",
                "&fMod: &a{group}",
                "&fVersiune: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Esti spectator",
                "&fHarta: &a{map}",
                "",
                "&fJucatori: &a{on}/{max}",
                "",
                "&fIn asteptare,&fIn asteptare.,&fIn asteptare..,&fIn asteptare...",
                "",
                "&fMod: &a{group}",
                "&fVersiune: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fHartă: &a{map}",
                "",
                "&fJucatori: &a{on}/{max}",
                "",
                "&fIncepe in &a{time}s",
                "",
                "§fMod: &a{group}",
                "&fVersiune: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Esti spectator",
                "&fHartă: &a{map}",
                "",
                "&fJucatori: &a{on}/{max}",
                "",
                "&fIncepe in &a{time}s",
                "",
                "§fMod: &a{group}",
                "&fVersiune: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} în &a{time}",
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
                "&o&7Spectator {spectatorTarget}",
                "",
                "&f{nextEvent} în &a{time}",
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
                "&o&7Spectator {spectatorTarget}",
                "",
                "&f{nextEvent} în &a{time}",
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
                "&6Câștigător: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lCele mai multe ucideri:",
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
                "&6Câștigător: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lCele mai multe ucideri:",
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
                "&6Câștigător: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lCele mai multe ucideri:",
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
                "&6Câștigător: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lCele mai multe ucideri:",
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
                "&f{nextEvent} în &a{time}",
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
                "&o&7Spectator {spectatorTarget}",
                "&f{nextEvent} în &a{time}",
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
                "&o&7Spectator {spectatorTarget}",
                "&f{nextEvent} în &a{time}",
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
                "&f{nextEvent} în &a{time}",
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
                "&fUcideri: &a{kills}",
                "&fUcideri Finale: &a{finalKills}",
                "&fPaturi Distruse: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Spectator {spectatorTarget}",
                "&f{nextEvent} în &a{time}",
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
                "&o&7Spectator {spectatorTarget}",
                "&f{nextEvent} în &a{time}",
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
                "&fUcideri: &a{kills}",
                "&fUcideri Finale: &a{finalKills}",
                "&fPaturi Distruse: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} în &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fUcideri: &a{kills}",
                "&fUcideri Finale: &a{finalKills}",
                "&fPaturi Distruse: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Spectator {spectatorTarget}",
                "&f{nextEvent} în &a{time}",
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
                "&o&7Spectator {spectatorTarget}",
                "&f{nextEvent} în &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fUcideri: &a{kills}",
                "&fUcideri Finale: &a{finalKills}",
                "&fPaturi Distruse: &a{beds}",
                "",
                "&e{serverIp}")
        );

        // end of sidebar

        // start of TAB
        // main lobby tab format
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_LOBBY_FOOTER, List.of(
                "",
                "&fSunt {on} jucători în acest hol",
                "Oferit de {poweredBy},&a{serverIp}",
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
                "Se așteaptă mai mulți jucători,Se așteaptă mai mulți jucători.,Se așteaptă mai mulți jucători.., Se așteaptă mai mulți jucători...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
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
                "&7&oEști spectator",
                "Se așteaptă mai mulți jucători,Se așteaptă mai mulți jucători.,Se așteaptă mai mulți jucători.., Se așteaptă mai mulți jucători...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&fÎncepe în &a{time} &fsecunde,&fÎncepe în &a{time} &fsecunde.,&fÎncepe în &a{time} &fsecunde..,&fÎncepe în &a{time} &fsecunde..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                "",
                "&7&oEști spectator"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fÎncepe în &a{time} &fsecunde,&fÎncepe în &a{time} &fsecunde.,&fÎncepe în &a{time} &fsecunde..,&fÎncepe în &a{time} &fsecunde..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                "",
                "{nextEvent} în {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fJoci în echipa {teamColor}{teamName}",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                "",
                "{nextEvent} în {time}",
                "",
                "&7&oAi fost eliminat,&f&oAi fost eliminat"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fAi jucat în echipa {teamColor}{teamName}",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oSpectator "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oEliminat {teamColor}&o{teamName}", " {teamColor}&oEliminat {vPrefix}", "{teamColor}&oEliminat {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                "",
                "{nextEvent} în {time}",
                "",
                "&7&oEști spectator"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oSpectator "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lEchipa ta a câștigat jocul! &6⭐",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lAi câștigat cu echipa {teamColor}&l{teamName}&6&l!,&6&lAi câștigat cu echipa {teamColor}&l{teamName}&6&l!,&f&lAi câștigat cu echipa {teamColor}&l{teamName}&f&l!",
                "&7Statistici din acest meci",
                "&eUcideri: &f{kills} &8| &eUcideri finale: &f{finalKills} &8| &ePaturi distruse: &f{beds} &8| &eMorți: &f{deaths},&eUcideri: &7{kills} &8| &eUcideri finale: &7{finalKills} &8| &ePaturi distruse: &7{beds} &8| &eMorți: &7{deaths}",
                "",
                "&fMulțumim că ai jucat, {player}!",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} a câștigat jocul! &6⭐",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lAi câștigat cu echipa {teamColor}&l{teamName}&6&l!,&6&lAi câștigat cu echipa {teamColor}&l{teamName}&6&l!,&f&lAi câștigat cu echipa {teamColor}&l{teamName}&f&l!",
                "&7Statistici din acest meci",
                "&eUcideri: &f{kills} &8| &eUcideri finale: &f{finalKills} &8| &ePaturi distruse: &f{beds} &8| &eMorți: &f{deaths},&eUcideri: &7{kills} &8| &eUcideri finale: &7{finalKills} &8| &ePaturi distruse: &7{beds} &8| &eMorți: &7{deaths}",
                "&fMulțumim că ai jucat, {player}!",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oEliminat", " {level}", " &c&oEliminat"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} a câștigat jocul! &6⭐",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fAi pierdut cu echipa {teamColor}{teamName}",
                "&7Statistici din acest meci",
                "&eUcideri: &f{kills} &8| &eUcideri finale: &f{finalKills} &8| &ePaturi distruse: &f{beds} &8| &eMorți: &f{deaths},&eUcideri: &7{kills} &8| &eUcideri finale: &7{finalKills} &8| &ePaturi distruse: &7{beds} &8| &eMorți: &7{deaths}",
                "&fMulțumim că ai jucat, {player}!",
                "&a{serverIp}",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oEliminat", " {level}", " &c&oEliminat"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} a câștigat jocul! &6⭐",
                "&7{date}",
                "&7Hartă: &f{map} &7Mod: &f{group}",
                "",
                "&fMulțumim că ai jucat, {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&fOferit de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oSpectator "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Experiență BedWars primită (Timp de joc).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Experiență BedWars primită (Victorie).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Experiență BedWars primită (Sprijinul echipei).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Experiență BedWars primită (Pat distrus).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Experiență BedWars primită (Ucidere normală).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Experiență BedWars primită (Ucidere finală).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Monede (Timp de joc).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Monede (Victorie).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Monede (Sprijinul echipei).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Monede (Pat distrus).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Monede (Ucidere finală).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Monede (Ucidere normală).");

        //shop
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Cumpărare rapidă");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Adaugă la cumpărare...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cNu ai destul {currency}! Mai ai nevoie de încă {amount}!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aAi cumpărat &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cAi cumpărat deja acest obiect!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Peștișor de argint");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Categorii");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Obiecte"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bCumpărare rapidă");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cSlot liber!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Acesta este un slot pentru cumpărarea rapidă!", "&bFurișează-te și clic &7pe orice obiect din", "&7magazin pentru a-l adăuga aici."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eClic pentru a cumpăra!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cNu ai destul {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aNIVEL MAXIM!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bFurișează-te și clic pentru cumpărare rapidă");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bFurișează-te și clic pentru a elimina din cumpărarea rapidă!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Blocuri", "&aBlocuri", Collections.singletonList("&eClic pentru a vedea!"));
        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lână", Arrays.asList("&7Preț: &f{cost} {currency}", "", "&7Excelentă pentru a construi poduri între", "&7insule. Capătă culoarea echipei tale.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lut întărit", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Bloc de bază pentru a-ți proteja patul.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Sticlă Anti-Explozibil", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Imună împotriva exploziilor.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Piatră de End", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Bloc solid pentru a-ți proteja patul.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Scară", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Utilă pentru a salva pisicile blocate", "&7în copaci.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidian", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Protecție extrema pentru pat.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lemn", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Bloc solid pentru a-ți proteja patul.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Luptă corp la corp", "&aLuptă corp la corp", Collections.singletonList("&eClic pentru a vedea!"));
        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Sabie De Piatră", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Sabie De Fier", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Sabie De Diamant", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Băț (Împingere I)", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Armură", "&aArmură", Collections.singletonList("&eClic pentru a vedea!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armură permanentă de zale", Arrays.asList("&7Preț: {cost} {currency}",
                "", "&7Pantaloni și cizme de zale", "&7cu care te vei renaște mereu.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armură permanentă de fier", Arrays.asList("&7Preț: {cost} {currency}",
                "", "&7Pantaloni și cizme de fier", "&7cu care te vei renaște mereu.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armură permanentă de diamant", Arrays.asList("&7Preț: {cost} {currency}",
                "", "&7Pantaloni și cizme de diamant", "&7cu care te vei renaște mereu.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Unelte", "&aUnelte", Collections.singletonList("&eClic pentru a vedea!"));
        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Foarfece permanente", Arrays.asList("&7Preț: {cost} {currency}",
                "", "&7Perfecte pentru a tăia lâna. Te vei", "&7renaște mereu cu ele.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Târnăcop {tier}", Arrays.asList("&7Preț: {cost} {currency}", "&7Nivel: &e{tier}",
                "", "&7Acesta este un obiect îmbunătățibil.", "&7Vei pierde un nivel când vei muri!", "", "&7Te vei renaște mereu", "&7cu cel puțin primul nivel", "&7al acestui obiect.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Topor {tier}", Arrays.asList("&7Preț: {cost} {currency}", "&7Nivel: &e{tier}",
                "", "&7Acesta este un obiect îmbunătățibil.", "&7Vei pierde un nivel când vei muri!", "", "&7Te vei renaște mereu", "&7cu cel puțin primul nivel", "&7al acestui obiect.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Atac la distanță", "&aAtac la distanță", Collections.singletonList("&eClic pentru a vedea!"));
        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Sageți", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arc", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arc (Putere I)", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arc (Putere I, Împingere I)", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Poțiuni", "&aPoțiuni", Collections.singletonList("&eClic pentru a vedea!"));
        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Viteză {level} ({duration} secunde)", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Săritură {level} ({duration} secunde)", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Invizibilitate ({duration} secunde)", Arrays.asList("&7Preț: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Utilități", "&aUtilități", Collections.singletonList("&eClic pentru a vedea!"));
        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Măr auriu", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Vindecare completă.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Gândac de pat", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Generează un peștișor de argint acolo unde", "&7aterizează bulgărele de zăpadă, pentru a", "&7distrage inamicii. Trăiește 15 secunde.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Apărătorul viselor", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Un golem de fier care te ajută să", "&7îți protejezi baza. Trăiește 4 minute.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Minge de foc", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Clic dreapta pentru a arunca!", "&7Împinge inamicii de pe", "&7poduri.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Se aprinde instantaneu, potrivit", "&7pentru a arunca lucruri în aer!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Perlă de End", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Cel mai rapid mod de a invada", "&7bazele inamice.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Găleată cu apă", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Utilă pentru a încetini inamicii.", "&7Te poate proteja și de TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ou de pod", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Acest ou creează un pod în", "&7direcția în care este aruncat.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Lapte magic", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Evită capcanele timp de 60", "&7de secunde după ce îl bei.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Burete", Arrays.asList("&7Preț: {cost} {currency}", "", "&7Util pentru a absorbi apa.",
                "", "{quick_buy}", "{buy_status}"));

        yml.addDefault("upgrades.Default.generators.tier1.name", "&eGenerator de fier");
        yml.addDefault("upgrades.Default.generators.tier1.lore", Arrays.asList("&7Crește rata de generare a fierului", "&7și aurului cu 50%.", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier2.name", "&eGenerator de aur");
        yml.addDefault("upgrades.Default.generators.tier2.lore", Arrays.asList("&7Crește rata de generare a fierului", "&7și aurului cu 100%.", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier3.name", "&eGenerator de smaralde");
        yml.addDefault("upgrades.Default.generators.tier3.lore", Arrays.asList("&7Activează generatorul de smaralde", "&7în baza echipei tale.", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.maniacMiner.tier1.name", "&eMiner maniac");
        yml.addDefault("upgrades.Default.maniacMiner.tier1.lore", Arrays.asList("&7Toți jucătorii din echipa ta primesc", "&7efectul Grabă I permanent.", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.sharpSword.tier1.name", "&eSăbii ascuțite");
        yml.addDefault("upgrades.Default.sharpSword.tier1.lore", Arrays.asList("&7Echipa ta primește Ascutență I", "&7pentru toate săbiile!", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.reinforced.tier1.name", "&eArmură întărită");
        yml.addDefault("upgrades.Default.reinforced.tier1.lore", Arrays.asList("&7Echipa ta primește Protecție I", "&7pentru toată armura!", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.trap.tier1.name", "&eEste o capcană!");
        yml.addDefault("upgrades.Default.trap.tier1.lore", Arrays.asList("&7Primul inamic care intră în", "&7baza ta va primi Orbire", "&7și Încetinire!", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.miningFatigue.tier1.name", "&eCapcană de oboseală minieră");
        yml.addDefault("upgrades.Default.miningFatigue.tier1.lore", Arrays.asList("&7Următorul inamic care intră în", "&7baza ta va primi Oboseală minieră", "&7timp de 10 secunde!", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.healPool.tier1.name", "&eIzvor de vindecare");
        yml.addDefault("upgrades.Default.healPool.tier1.lore", Arrays.asList("&7Creează un câmp de regenerare", "&7a vieții în baza ta!", "", "&7Preț:&b {cost} {currency}", "", "{loreFooter}"));

        yml.addDefault(Messages.MEANING_NO_TRAP, "Nicio capcană!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Preț: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Apasă pentru a cumpăra!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Nu ai destul {currency}");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBLOCAT");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}DEBLOCAT");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} a cumpărat &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Forjă de fier");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Îmbunătățește generarea resurselor", "&7pe insula ta.", "", "{tier_1_color}Nivelul 1: +50% resurse, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nivelul 2: +100% resurse, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Nivelul 3: generează smaralde, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nivelul 4: +200% resurse, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Forjă de aur");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Forjă de smarald");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Forjă topită");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eCumpără o capcană");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Capcanele cumpărate vor fi", "&7puse în coadă în dreapta.", "", "&eApasă pentru a vedea!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Săbii ascuțite");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                        Arrays.asList("&7Echipa ta primește permanent", "&7Ascutență I pentru toate săbiile și", "&7topoarele!", "", "{tier_1_color}Preț: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Armură întărită I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Echipa ta primește permanent", "&7Protecție pentru toate piesele de armură!", "", "{tier_1_color}Nivelul 1: Protecție I, &b{tier_1_cost} {tier_1_currency}", "{tier_2_color}Nivelul 2: Protecție II, &b{tier_2_cost} {tier_2_currency}", "{tier_3_color}Nivelul 3: Protecție III, &b{tier_3_cost} {tier_3_currency}", "{tier_4_color}Nivelul 4: Protecție IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Armură întărită II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Armură întărită III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Armură întărită IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Miner maniac I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"), Arrays.asList("&7Toți jucătorii din echipa ta", "&7primesc permanent Grabă.", "", "{tier_1_color}Nivelul 1: Grabă I, &b{tier_1_cost} {tier_1_currency}", "{tier_2_color}Nivelul 2: Grabă II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Miner maniac II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Izvor de vindecare");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"), Arrays.asList("&7Creează un câmp de regenerare", "&7în jurul bazei tale!", "", "{tier_1_color}Preț: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Bonus dragon");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"), Arrays.asList("&7Echipa ta va avea 2 dragoni", "&7în loc de 1 în timpul meciului decisiv!", "", "{tier_1_color}Preț: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Achiziționabil");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Coada de capcane"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Capcană #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Primul dușman care intră", "&7în baza ta va activa", "&7această capcană!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first", Arrays.asList("", "&7Cumpărând o capcană, aceasta va fi", "&7pusă aici în coadă. Costul ei", "&7crește în funcție de numărul", "&7capcanelor din coadă.", "", "&7Următoarea capcană: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Capcană #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Al doilea dușman care intră", "&7în baza ta va activa", "&7această capcană!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second", Arrays.asList("", "&7Cumpărând o capcană, aceasta va fi", "&7pusă aici în coadă. Costul ei", "&7crește în funcție de numărul", "&7capcanelor din coadă.", "", "&7Următoarea capcană: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Capcană #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Al treilea dușman care intră", "&7în baza ta va activa", "&7această capcană!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third", Arrays.asList("", "&7Cumpărând o capcană, aceasta va fi", "&7pusă aici în coadă. Costul ei", "&7crește în funcție de numărul", "&7capcanelor din coadă.", "", "&7Următoarea capcană: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Este o capcană!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Provoacă Orbire și Încetinire", "&7timp de 5 secunde.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Capcană contraofensivă");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Oferă Viteză I timp de 15 secunde", "&7jucătorilor aliați de lângă bază.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Capcană alarmă");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Dezvăluie jucătorii invizibili", "&7precum și numele și echipa lor.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Capcană oboseală minieră");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Provoacă Oboseală minieră timp de 10", "&7secunde.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aÎnapoi");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7La îmbunătățirile echipei"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Coadă de capcane");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cCoada de capcane este plină!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} a fost activată!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cCAPCANĂ ACTIVATĂ!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fCapcana {trap} a fost activată!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lCapcană alarmă activată de &7&l{player} &c&ldin echipa {color}&l{team}! ");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARMĂ!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fCapcană alarmă activată de echipa {color}{team} &f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNumele nu este setat");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cDescrierea nu este setată"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Îmbunătățiri echipă");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

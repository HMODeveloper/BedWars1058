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
import static com.andrei1058.bedwars.api.language.Messages.*;

public class Italian extends Language {

    public Italian() {
        super(BedWars.plugin, "it");
        YamlConfiguration yml = getYml();
        yml.options().copyDefaults(true);
        yml.options().header("Traduzione in italiano di Fabian03#4583 aggiornata da Xx_yuri2005_xX");
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Italiano");

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

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/gruppo>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(spettatore)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "spawn-protection è attivo in server.properties; potrebbe influire sulle arene BedWars. Si consiglia di impostarlo su 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Rilevato Multiverse-Core; rimuovilo oppure assicurati che non modifichi le mappe di BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Caricamento di {world} dal contenitore dei mondi di Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Creazione di una nuova mappa vuota: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7ID utente: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7ID download: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7L'arena {arena} non esiste!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} è stata aggiunta al gruppo: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Gruppo creato!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Crea un gruppo di arene. Maggiori dettagli sulla nostra wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fPredefinito");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Gruppo eliminato!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eclicca per i dettagli");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fGestisci i gruppi di arene.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Questo gruppo esiste già!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Gruppi di arene disponibili:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Visualizza i gruppi disponibili.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Questo gruppo non esiste!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Rimuovi un gruppo di arene. Maggiori dettagli sulla nostra wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Imposta il gruppo dell'arena. Maggiori dettagli sulla nostra wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Non esiste alcun gruppo chiamato: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} impostate)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fMostra le arene disponibili");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cNessuna arena da visualizzare.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fWl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Partite inizializzate: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Digita /§a{command} arenaList {page}§7 per la pagina successiva.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Utilizzo: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Non puoi più piazzare e rompere blocchi!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §epermesso di costruzione");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fAbilita o disabilita la modalità costruzione \n§fper poter rompere o piazzare blocchi.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Ora puoi piazzare e rompere blocchi.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Si è verificato un errore copiando la configurazione della mappa. Controlla la console.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Disabilita prima {arena}!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fClona un'arena esistente.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} esiste già!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Fatto :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Utilizzo: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Digita di nuovo per confermare.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fElimina una mappa e la sua configurazione.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Questa arena non esiste!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} è stata eliminata!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Utilizzo: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} non esiste come cartella del mondo!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Questa arena è già disabilitata!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fDisabilita un'arena.\nQuesto rimuoverà i giocatori \n§fdall'arena prima della disabilitazione.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7C'è una partita in corso in questa arena, disabilitala al termine della partita!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Disabilitazione dell'arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Questa arena è già abilitata!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fAbilita un'arena.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Questa arena è già nella coda di abilitazione!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Abilitazione dell'arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Utilizzo: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eclicca per i dettagli");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fGestisci il livello di un giocatore.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cLa quantità deve essere un numero intero!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cIl livello deve essere un numero intero!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Giocatore non trovato!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Il giocatore potrebbe dover rientrare per vedere l'aggiornamento.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Imposta il livello di un giocatore.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7Il livello di {player} è stato impostato a: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Utilizzo: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Dai XP a un giocatore.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{amount} XP sono stati dati a: {player}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Utilizzo: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Clicca per usare.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Utilizzo: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Puoi usare §e{players} §7per il numero di giocatori in questo §7gruppo di arene.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bè stato impostato!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §ecrea un NPC d'ingresso");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fCrea un NPC d'ingresso  \n§fClicca per maggiori dettagli.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fUsa questo comando per creare un NPC d'ingresso.\n§fClicca per vedere la sintassi.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Utilizzo: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fResta davanti a un NPC per rimuoverlo.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Utilizzo: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bNon c'è alcun NPC nelle vicinanze.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bNon è ancora stato impostato alcun NPC!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bL'NPC selezionato è stato rimosso!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bGruppi selezionati: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Configurazione dell'arena {config} ricaricata!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} ricaricata!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §ericarica i messaggi");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fRicarica i messaggi.\n§cNon consigliato!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} ricaricata!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Sei già in una sessione di configurazione!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 non deve contenere lettere maiuscole! Rinomina la cartella in: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Disabilitala prima!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fCrea o modifica un'arena.\n'_' e '-' non verranno visualizzati nel nome dell'arena.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena}§7 non deve contenere questo simbolo: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Utilizzo: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lClicca qui per creare le squadre trovate.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fClicca per creare le squadre trovate!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lNUOVE SQUADRE TROVATE:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Non è stata trovata alcuna nuova squadra.\n§6 ▪ §7Crea manualmente le squadre con: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Ricerca delle squadre. Potrebbe causare lag.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Tempo scaduto. Digita di nuovo per cercare le squadre.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fSe vuoi che la lobby scompaia quando inizia la partita,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lRIMOZIONE DELLA LOBBY D'ATTESA:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Questo passaggio è OPZIONALE. Per saltarlo digita §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fusa i seguenti comandi come una selezione di WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Squadre disponibili: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6LETTO IMPOSTATO");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Aggiungi il letto di una squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Letto impostato per: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aLetto impostato per: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fImposta il letto di una squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cDevi restare su un letto mentre usi questo comando!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cDevi restare su un letto.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fImposta il letto per {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Altezza massima di costruzione Y impostata a §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Utilizzo: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Colori disponibili: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7creata!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7La squadra {team} esiste già!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Colore non valido!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Utilizzo: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "Il generatore {generator} è stato aggiunto!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a generatore aggiunto!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Aggiungi un generatore di squadra.\nLa squadra verrà rilevata automaticamente.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Prova a usare: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{generator} generatore aggiunto per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Il generatore {generator} è stato aggiunto per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6{generator}§a generatore per {team}§a aggiunto!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (rileva automaticamente la squadra)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Usa: /bw createTeam se vuoi crearne una.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cQuesto generatore è già stato impostato!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cQuesto generatore è già stato impostato!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} IMPOSTATO");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Altro utilizzo: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Aggiungi un generatore di smeraldi/diamanti.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Generatore impostato per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Aggiungi un generatore di squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cImpossibile trovare la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Generatore impostato per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aGeneratore impostato per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Crea prima le squadre!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cCrea prima le squadre!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Drop delle uccisioni {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Imposta il luogo dei drop delle uccisioni per una squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Drop delle uccisioni impostati per: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Drop delle uccisioni {team} (clicca per impostare)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fImposta i drop delle uccisioni per {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Drop delle uccisioni impostati per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aDrop delle uccisioni impostati per la squadra: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cUtilizzo: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Numero massimo nella squadra impostato!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Utilizzo: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cImpossibile trovare squadre nelle vicinanze.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cImpossibile trovare squadre nelle vicinanze.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Non sei in una sessione di configurazione!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Impossibile trovare generatori nelle vicinanze (raggio 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cImpossibile trovare generatori nelle vicinanze.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Generatore {generator} rimosso alla posizione: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aGeneratore {generator} rimosso.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Devi stare vicino all'ologramma del generatore che vuoi rimuovere.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §ageneratore {generator} rimosso.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "I generatori di {team} sono stati rimossi!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Generatore {generator} di {team} rimosso alla posizione: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Il generatore di {team} è stato rimosso.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Rimuovi {team} §7(clicca per rimuovere)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Questa squadra non esiste: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cSquadra non trovata: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Squadra rimossa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aSquadra rimossa: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cUtilizzo: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Ora puoi abilitarla usando:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aAbilita questa arena.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (clicca per abilitare)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Modifiche dell'arena salvate!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6NEGOZIO IMPOSTATO");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Imposta il negozio di una squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Altro utilizzo: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Negozio impostato per: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Imposta il negozio per {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6SPAWN IMPOSTATO");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Rimanenti: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Spawn impostato per: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Elenco squadre: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Imposta lo spawn per: {team} (clicca per impostare)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fImposta lo spawn per {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cImpossibile trovare la squadra selezionata: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cUtilizzo: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "Posizione spettatore impostata!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cUtilizzo: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Oppure, se hai impostato lo spawn e non è stato trovato automaticamente, prova a usare: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cQuesta squadra non esiste!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(clicca per impostare)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Assicurati di impostare prima lo spawn della squadra!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fImposta lo spawn di una squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Tipi disponibili: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Gruppo dell'arena cambiato in: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(clicca per impostare)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dClicca per impostare l'arena come {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Utilizzo: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6POTENZIAMENTI IMPOSTATI");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Imposta l'NPC dei potenziamenti della squadra.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "NPC dei potenziamenti impostato per: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fNPC dei potenziamenti impostato per {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dImposta la posizione {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Imposta la posizione rimanente:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7Posizione {position} impostata!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Imposta lo spawn delle squadre se non l'hai fatto!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Utilizzo: /{command} {subcommand} 1 or 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Spawn d'attesa impostato per §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aImposta la lobby principale. §fÈ necessaria, ma\n§fse utilizzerai il server in modalità §eBUNGEE §f\n§fla posizione della lobby §enon §fsarà utilizzata.\n§eDigita di nuovo per sostituire la vecchia posizione dello spawn.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Questo comando non può essere usato nelle arene. Serve per la lobby principale!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(non impostata)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(impostata)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Posizione della lobby impostata!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Attiva/disattiva il controllo dei pronti.");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eInvia un messaggio all’arena attuale");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fInvia un messaggio a tutti i giocatori nella tua arena.\n&fUtilizzo: /{command} echo <messaggio>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperatore&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eInvia un messaggio a un’arena specifica");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fInvia un messaggio a tutti i giocatori di un’arena specifica.\n&fUtilizzo: /{command} echoto <arena> <messaggio>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eInvia un messaggio a tutte le arene");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fInvia un messaggio a tutti i giocatori di tutte le arene.\n&fUtilizzo: /{command} echoall <messaggio>");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eForza la fine di un'arena");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fForza la fine di un'arena senza vincitore.\n&fPermesso: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cLa partita non è in corso.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aFine forzata della partita...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eForza l'avvio di un'arena");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fForza l'avvio di un'arena.\n&fPermesso: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eRiduci il conto alla rovescia iniziale a 5s");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fRiduci a 5 secondi il conto alla rovescia iniziale di un'arena.\n&fPermesso: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Attiva/disattiva lo stato di pronto.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fApre la GUI delle arene.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fEntra in un'arena per nome o gruppo.\n&f/{command} join random - entra in un'arena casuale.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fCambia la tua lingua.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fLascia un'arena.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fApre la GUI delle statistiche.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fPassa dalla modalità spettatore vanilla a quella del plugin.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Comandi amministrativi");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eenable/ disable");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fAl momento non sono disponibili comandi da console.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Devi prima impostare la posizione della lobby!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Non dovresti essere qui.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e visualizza i comandi dei giocatori");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fVisualizza i comandi dei giocatori.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &aComandi di {world}");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} di andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Arene: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(NON IMPOSTATO)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(IMPOSTATO)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oOPZIONALE");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(TUTTO IMPOSTATO)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Rimanenti: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(POS 1 NON IMPOSTATA)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(POS 2 NON IMPOSTATA)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(rilevamento automatico)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} CREATE)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (IMPOSTATO A {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fImposta il luogo in cui i giocatori\n&fattenderanno l'inizio della partita.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fFai scomparire la lobby d'attesa all'inizio.\n&fSelezionala come regione di WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fImposta il punto di spawn degli spettatori.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fCrea squadre in base ai colori delle isole.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fCrea una squadra.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fRimuovi una squadra per nome.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fImposta lo spawn di una squadra.\n&fSquadre senza spawn impostato:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fImposta la posizione del letto di una squadra.\n&fNon devi specificare il nome della squadra.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fImposta l'NPC del negozio di una squadra.\n&fNon devi specificare il nome della squadra.\n&fVerrà generato solo all'inizio della partita.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fImposta l'NPC dei potenziamenti di una squadra.\n&fNon devi specificare il nome della squadra.\n&fVerrà generato solo all'inizio della partita.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fImposta il luogo in cui far cadere\n&fgli oggetti dei nemici dopo averli uccisi.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fAggiungi un punto di spawn del generatore.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fResta su un blocco di diamante per impostare il generatore di diamanti.\n&fResta su un blocco di smeraldo per impostare il generatore di smeraldi.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fAggiungi un punto di spawn del generatore.\n&eResta su un'isola di squadra per impostare un generatore di squadra\n&fResta su un blocco di diamante per impostare il generatore di diamanti.\n&fResta su un blocco di smeraldo per impostare il generatore di smeraldi.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fImposta la dimensione massima della squadra.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fImposta il gruppo dell'arena.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fAggiungi l'arena a un gruppo.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fSalva l'arena e torna alla lobby");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cTentativo di caricare l'arena {arena}, ma è già nella coda di abilitazione.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cTentativo di caricare l'arena {arena}, ma è già abilitata.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "Non hai impostato alcuna squadra per l'arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cDevi impostare almeno 2 squadre su: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cNon esiste alcuna mappa chiamata {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cColore non valido per la squadra: {team} nell'arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} non impostato per la squadra {team} su: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cNon è stato impostato alcun generatore di diamanti su: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cNon è stato impostato alcun generatore di smeraldi su: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cSpawn d'attesa non impostato su: {arena}");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Metodo di configurazione");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lCONFIGURAZIONE ASSISTITA");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aConfigurazione facile e rapida!", "&7Per principianti e staff pigro :D", "", "&3Opzioni ridotte."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lCONFIGURAZIONE AVANZATA");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aConfigurazione dettagliata!", "&7Per staff esperto :D", "", "&3Opzioni avanzate."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7Caricamento di {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7Configurazione di {arena} annullata!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aSei stato teletrasportato allo spawn di &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&aCiao {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fImposta lo spawn d'attesa.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fÈ il luogo in cui i giocatori attenderanno l'inizio della partita.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6CLICCA QUI PER IMPOSTARE LA LOBBY D'ATTESA    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dClicca per impostare lo spawn d'attesa.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eOppure digita: &7/{command} per vedere l'elenco dei comandi.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fMostra l'elenco dei comandi.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6Generatore {generator} aggiunto per la squadra: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6SPAWN IMPOSTATO");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6LETTO IMPOSTATO");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6NEGOZIO IMPOSTATO");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6POTENZIAMENTI IMPOSTATI");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Drop delle uccisioni {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} IMPOSTATO");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Ferro");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Oro");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Smeraldo");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Diamante");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Squadre disponibili: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cImpossibile avviare la sessione di configurazione. Controlla la console.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cSupporto Vault mancante!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lERRORE: Questa funzione richiede il supporto Vault! Installa il plugin Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Cartello salvato per l'arena: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Non hai ancora impostato alcuna arena!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 è stato RICARICATO! (non ricaricare i plugin)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lBuon Halloween!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} XP!");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cUtilizzo: /bw echo <messaggio>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aMessaggio inviato all’arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cNon sei in un’arena.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cUtilizzo: /bw echoto <arena> <messaggio>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aMessaggio inviato all’arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cUtilizzo: /bw echoall <messaggio>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aMessaggio inviato a tutte le arene.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena non trovata: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cQuesto comando è riservato ai giocatori.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aOra sei pronto!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aNon sei più pronto.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aTutti i giocatori sono pronti! Conto alla rovescia ridotto a 10 secondi!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aControllo dei pronti attivato.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aControllo dei pronti disattivato.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cQuesto comando è disattivato.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cNon sei in partita!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cNon puoi usare questo comando ora.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cGli spettatori non possono usare questo comando.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aPronto");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cNon pronto");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Clic destro per essere pronto!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Clic destro per non essere più pronto!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Giocatori insufficienti per iniziare la partita!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aModalità spettatore Vanilla attivata.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aModalità spettatore normale attivata.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cInventario pieno!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aEquipaggiata!");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Utilizzo: /" + mainCmd + " join §o<arena/gruppo>");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cNon puoi eseguire questa azione.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cArena piena!\n&aPrendi in considerazione il fatto di donare per entrare anche quando le arene sono piene. &7&o(clicca qui)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cArena piena.\n&cSappiamo che sei un donatore ma al momento questa arena è piena di staffer o donatori.");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cNon esiste nessun gruppo o arena chiamato: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cNon ci sono arene disponibili al momento ;(");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cNon sei in gioco!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Lingue disponibili:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Utilizzo: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cQuesta lingua non esiste!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aLingua modificata!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cNon puoi cambiare la lingua durante il gioco.");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cGiocatore non trovato!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cQuesto giocatore non è in un’arena BedWars!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cL'arena dove si trova il giocatore non è ancora iniziata!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cUtilizzo: /bw tp <giocatore>");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cIl tuo party è troppo grande per entrare in questa arena come una squadra :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cSolo il creatore del party può scegliere l'arena.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &eè entrato in gioco (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &esi è riconnesso!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &esi è disconnesso!");

        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                        "&aComandi del party:",
                        "&e/party help &7- &bStampa questa lista di comandi",
                        "&e/party invite <player> &7- &bInvita il giocatore nel tuo party",
                        "&e/party leave &7- &bLascia il party attuale",
                        "&e/party remove <player> &7- &bRimuovi il giocatore dal party",
                        "&e/party info &7- &bMostra membri e proprietario del party",
                        "&e/party promote <player> &7- &bTrasferisci la proprietà del party",
                        "&e/party accept <player> &7- &bAccetta un invito al party",
                        "&e/party disband &7- &bScioglie il tuo party"));
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eUtilizzo: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eInvito inviato a &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &eti ha invitato nel party! &o&7(Clicca per accettare)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cNon puoi invitare te stesso!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cNon ci sono richieste di invito ad un party da accettare");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eSei già in un party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cSolo il proprietario del party può eseguire questa azione!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eUtilizzo: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &eè entrato nel party!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cNon sei in un party!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cNon puoi uscire dal tuo party!\n&eUtilizzo corretto: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eè uscito dal party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eParty sciolto!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&eUtilizzo: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &eè stato rimosso dal party.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &enon è nel tuo party!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eHai promosso con successo {player} a proprietario");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eSei stato promosso a proprietario del party");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} è stato promosso a proprietario");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eIl proprietario del party è: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eI membri del party sono:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cIl comando non è stato trovato o non hai abbastanza permessi!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Non sei in gioco!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Conto alla rovescia diminuito!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Non puoi forzare l'inizio del gioco.\n§7Prendi in considerazione il fatto di donare per avere più cose.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Stai spectando l'arena §9{arena}§6.\n{prefix}§ePuoi uscire dall'arena in qualsiasi momento utilizzando §c/leave§e.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eè offline!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cGli spettatori non sono ammessi in questa arena!");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cAspetta {seconds} scondi prima di usare ancora questo comando!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cIl comando non è stato trovato o non hai abbastanza permessi!\n&aPotresti fare una donazione per ottenere permessi vip. &7&o(clic)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cNon ci sono abbastanza giocatori! Conto alla rovescia fermato!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eL'arena in cui ti trovavi si sta restartando.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cIn gioco");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4In riavvio");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2In attesa §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6In avvio §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Arene disponibili");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Stato: {status}", "&7Giocatori: &f{on}&7/&f{max}", "&7Tipo: &a{group}", "", "&aClic sinistro per entrare.", "&eClic destro per guardare."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eIl gioco avrà inizio in &6{time} &esecondi!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cAttendendo più giocatori..");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                        "&f                                   &lBedWars", "",
                        "&e&l    Proteggi il tuo letto e distruggi quello degli avversari.",
                        "&e&l      Potenzia te e il tuo team collezionando",
                        "&e&l   Ferro, Oro, Smeraldi, e Diamanti dai generatori",
                        "&e&l             per avere accesso a forti potenziamenti.", "",
                        "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aVIA");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teletrasporto");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Vita: &f{health}%", "&7Cibo: &f{food}", "", "&7Clic sinistro per guardare"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lRitorna alla lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Clic destro per tornare alla lobby!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aGuardando &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cMAIUSC per uscire");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eUscita Dalla Modalità Spettatore");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cIl proprietario del party è uscito e il party è stato sciolto!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cCi dispiace, ma attualmente non puoi entrare in quest'arena. Usa Clic destro per guardare!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cCi dispiace, ma attualmente non puoi guardare questa partita. Usa Clic sinistro per giocare!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cMi spiace ma devi entrare in un'arena usando BedWarsProxy. \n&eSe vuoi impostare un'arena assicurati di darti il permesso bw.setup in modo da entrare direttamente nel server!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eLivello &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamante");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lSmeraldo");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eAppare tra &c{seconds} &esecondi");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}&eI generatori di {generatorType} &esono stati potenziati a livello &c{tier}");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[SHOUT] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[SPECTATOR] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aVita"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 TU");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fObbiettivo: {team} &f- Distanza: {distance}m");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[SHOUT]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[SPETTATORE]");
        yml.addDefault(Messages.MEANING_SHOUT, "shout");
        yml.addDefault(Messages.MEANING_NOBODY, "Nessuno");
        yml.addDefault(Messages.MEANING_FULL, "Pieno");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Ferro");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Ferro");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Oro");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Oro");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Smeraldo");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Smeraldi");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamante");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamanti");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.MEANING_NEVER, "Never");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cNon puoi piazzare blocchi in questa area!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cPuoi rompere solo i blocchi che sono stati piazzati dai giocatori!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cNon puoi distruggere il tuo letto!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lLETTO DISTRUTTO > Il letto del team {TeamColor}{TeamName} &7è stato fatto a pezzi da {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cLETTO DISTRUTTO!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fNon verrai più respawnato!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lLETTO DISTRUTTO > &7Il tuo letto è stato distrutto da {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cNon puoi aprire questa cesta, perchè il team non è stato eliminato.");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cNon sei più invisibile perchè hai preso danno!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7è caduto nel vuoto.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7è caduto nel vuoto. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7è caduto nel vuoto con l'aiuto di {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7è caduto nel vuoto con l'aiuto di {KillerColor}{KillerName}&7. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7è stato spinto da {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7è stato spinto da {KillerColor}{KillerName}&7. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7è saltato in aria a causa di {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7è saltato in aria a causa di {KillerColor}{KillerName}&7. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7è stato ucciso da {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7è stato ucciso da {KillerColor}{KillerName}&7. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7si è disconnesso mentre combatteva con {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7si è disconnesso mentre combatteva con {KillerColor}{KillerName}&7. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cSEI MORTO!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eVerrai respawnato in &c{time} &esecondi!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eVerrai respawnato in &c{time} &esecondi!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aRESPAWNATO!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cSei stato eliminato!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7è rimasto con &c{amount} &7HP!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7è morto.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7è morto. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7è stato sparato da {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7è stato sparato da {KillerColor}{KillerName}&7! &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7è stato ucciso dal BedBug {KillerColor}{KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7è stato ucciso dal BedBug {KillerColor}{KillerTeamName}! &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7è stato ucciso dal Dream Defender {KillerColor}{KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7è stato ucciso dal Dream Defender {KillerColor}{KillerTeamName}! &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7è stato colpito da una bomba.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7è stato colpito da una bomba. &b&lUCCISIONE FINALE!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lGAME OVER!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVITTORIA!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("",
                        "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                        "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                        "&6                      &6⭐ &l1° Uccisore &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                        "&e                        &l2° Uccisore &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                        "&c                        &l3° Uccisore &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                        "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &aha vinto il gioco!");
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lDifendi il tuo letto!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lIl tuo letto è stato distrutto!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bPOTENZIAMENTI DEL TEAM,&e&lCLICK DESTRO");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bPOTENZIAMENTI,&e&lCLICK DESTRO");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bNEGOZIO OGGETTI,&e&lCLICK DESTRO");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bNEGOZIO OGGETTI,&e&lCLICK DESTRO");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cDistruzione letti");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamante II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamante III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fMorte Brusca");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEmerald II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEmerald III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Fine gioco");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cLETTO DISTRUTTO!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fTutti i letti sono stati distrutti!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lTutti i letti sono stati distrutti!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cMorte Brusca");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cMORTE BRUSCA: &6&b{TeamDragons} Drago {TeamColor}{TeamName}!");
        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eStatistiche");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fClic destro per vedere le tue statistiche!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eSelettore Arena");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fClic destro per selezionare un'arena!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eTorna all'hub");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fClic destro per lasciare BedWars!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eStatistiche");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fClic destro per vedere le tue statistiche!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eTorna nella lobby");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fClic destro per lasciare l'arena!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeletrasporto");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fClic destro per lasciare BedWars!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eTorna nella Lobby");

        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cNon c'è un'arena su cui ritornare!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cNon puoi tornare più. Partita finita o letto distrutto.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eStai entrando sull'arena &a{arena}&e!");

        /* save default items messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8Statistiche di {player}");
        addDefaultStatsMsg(yml, "wins", "&6Vittorie", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Sconfitte", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Uccisioni", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Decessi", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Uccisioni finali", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Decessi finali", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Letti distrutti", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Prima partita", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Ultima partita", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Partite giocate", "&f{gamesPlayed}");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date} &8{server}",
                        "",
                        "&fMappa: &a{map}",
                        "",
                        "&fGiocatori: &a{on}/{max}",
                        "",
                        "&fIn attesa,&fIn attesa.,&fIn attesa..,&fIn attesa...",
                        "",
                        "&fModalità: &a{group}",
                        "&fVersione: &7{version}",
                        "",
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date} &8{server}",
                        "&o&7Spettatore",
                        "&fMappa: &a{map}",
                        "",
                        "&fGiocatori: &a{on}/{max}",
                        "",
                        "&fIn attesa,&fIn attesa.,&fIn attesa..,&fIn attesa...",
                        "",
                        "&fModalità: &a{group}",
                        "&fVersione: &7{version}",
                        "",
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date} &8{server}",
                        "",
                        "&fMappa: &a{map}",
                        "",
                        "&fGiocatori: &a{on}/{max}",
                        "",
                        "&fInizio in &a{time}s",
                        "",
                        "&fModalità: &a{group}",
                        "&fVersione: &7{version}",
                        "",
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date} &8{server}",
                        "&o&7Guardando",
                        "&fMappa: &a{map}",
                        "",
                        "&fGiocatori: &a{on}/{max}",
                        "",
                        "&fInizio in &a{time}s",
                        "",
                        "&fModalità: &a{group}",
                        "&fVersione: &7{version}",
                        "",
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Guardando {spectatorTarget}",
                        "",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_SPEC, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&6Vincitore: {winnerTeamColor}{winnerTeamName} &6⭐",
                        "",
                        "&7&lTop uccisioni:",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_WIN1, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&6Vincitore: {winnerTeamColor}{winnerTeamName} &6⭐",
                        "",
                        "&7&lTop uccisioni:",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_WIN2, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&6Vincitore: {winnerTeamColor}{winnerTeamName} &6⭐",
                        "",
                        "&7&lTop uccisioni:",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_RESTARTING_LOSER, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&6Vincitore: {winnerTeamColor}{winnerTeamName} &6⭐",
                        "",
                        "&7&lTop uccisioni:",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "&f{topTeamColor}{topPlayerDisplayName}&7 - &l{topValue}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "Doubles"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "Doubles"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "Doubles"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&f{nextEvent} tra &a{time}",
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
                        "&fUccisioni: &a{kills}",
                        "&fUccisioni Finali: &a{finalKills}",
                        "&fLetti Distrutti: &a{beds}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "&f{nextEvent} tra &a{time}",
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
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "&f{nextEvent} tra &a{time}",
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
                        "&fUccisioni: &a{kills}",
                        "&fUccisioni Finali: &a{finalKills}",
                        "&fLetti Distrutti: &a{beds}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "",
                        "&f{nextEvent} tra &a{time}",
                        "",
                        "{team}",
                        "{team}",
                        "{team}",
                        "{team}",
                        "",
                        "&fUccisioni: &a{kills}",
                        "&fUccisioni Finali: &a{finalKills}",
                        "&fLetti Distrutti: &a{beds}",
                        "",
                        "&e{serverIp}"));

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "&f{nextEvent} tra &a{time}",
                        "",
                        "{team}",
                        "{team}",
                        "{team}",
                        "{team}",
                        "",
                        "",
                        "&e{serverIp}"));
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&7{date}",
                        "&o&7Spettatore {spectatorTarget}",
                        "&f{nextEvent} tra &a{time}",
                        "",
                        "{team}",
                        "{team}",
                        "{team}",
                        "{team}",
                        "",
                        "&fUccisioni: &a{kills}",
                        "&fUccisioni Finali: &a{finalKills}",
                        "&fLetti Distrutti: &a{beds}",
                        "",
                        "&e{serverIp}"));
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
                        "&fCi sono {on} giocatori in questa lobby",
                        "Offerto da {poweredBy},&a{serverIp}",
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
                        "In attesa di altri giocatori,In attesa di altri giocatori.,In attesa di altri giocatori.., In attesa di altri giocatori...",
                        "&f{on}&a/&f{max}",
                        "",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
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
                        "&7&oStai guardando",
                        "In attesa di altri giocatori,In attesa di altri giocatori.,In attesa di altri giocatori.., In attesa di altri giocatori...",
                        "&f{on}&a/&f{max}",
                        "",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                        "                                                                                                        ",
                        "&a{serverIp}",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                        "",
                        "&fInizia tra &a{time} &fsecondi,&fInizia tra &a{time} &fsecondi.,&fInizia tra &a{time} &fsecondi..,&fInizia tra &a{time} &fsecondi..",
                        "&f{on}&a/&f{max}",
                        "",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                        "                                                                                                        ",
                        "&a{serverIp}",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        "",
                        "&7&oStai guardando"
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                        "",
                        "&fInizia tra &a{time} &fsecondi,&fInizia tra &a{time} &fsecondi.,&fInizia tra &a{time} &fsecondi..,&fInizia tra &a{time} &fsecondi..",
                        "&f{on}&a/&f{max}",
                        "",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                        "                                                                                                        ",
                        "&a{serverIp}",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        "",
                        "{nextEvent} tra {time}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                        "",
                        "&fStai giocando nella squadra {teamColor}{teamName}",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                        "                                                                                                        ",
                        "&a{serverIp}",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        "",
                        "{nextEvent} tra {time}",
                        "",
                        "&7&oSei stato eliminato,&f&oSei stato eliminato"
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                        "",
                        "&fHai giocato nella squadra {teamColor}{teamName}",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oSpettatore "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oEliminato {teamColor}&o{teamName}", " {teamColor}&oEliminato {vPrefix}", "{teamColor}&oEliminato {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                        "                                                                                                        ",
                        "&a{serverIp}",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        "",
                        "{nextEvent} tra {time}",
                        "",
                        "&7&oStai guardando"
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                        "",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oSpettatore "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                        "                                                                                                        ",
                        "&6⭐ {winnerTeamColor}&lLa tua squadra ha vinto la partita! &6⭐",
                        "&7{date}", "&7Mappa: &f{map} &7Modalità: &f{group}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                        "",
                        "&6&lHai vinto nella squadra {teamColor}&l{teamName}&6&l!,&6&lHai vinto nella squadra {teamColor}&l{teamName}&6&l!,&f&lHai vinto nella squadra {teamColor}&l{teamName}&f&l!",
                        "&7Statistiche di questa partita",
                        "&eUccisioni: &f{kills} &8| &eUccisioni finali: &f{finalKills} &8| &eLetti distrutti: &f{beds} &8| &eMorti: &f{deaths},&eUccisioni: &7{kills} &8| &eUccisioni finali: &7{finalKills} &8| &eLetti distrutti: &7{beds} &8| &eMorti: &7{deaths}",
                        "",
                        "&fGrazie per aver giocato, {player}!",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                        "                                                                                                        ",
                        "&6⭐ {winnerTeamColor}&l{winnerTeamName} ha vinto la partita! &6⭐",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                        "",
                        "&6&lHai vinto nella squadra {teamColor}&l{teamName}&6&l!,&6&lHai vinto nella squadra {teamColor}&l{teamName}&6&l!,&f&lHai vinto nella squadra {teamColor}&l{teamName}&f&l!",
                        "&7Statistiche di questa partita",
                        "&eUccisioni: &f{kills} &8| &eUccisioni finali: &f{finalKills} &8| &eLetti distrutti: &f{beds} &8| &eMorti: &f{deaths},&eUccisioni: &7{kills} &8| &eUccisioni finali: &7{finalKills} &8| &eLetti distrutti: &7{beds} &8| &eMorti: &7{deaths}",
                        "&fGrazie per aver giocato, {player}!",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oEliminato", " {level}", " &c&oEliminato"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                        "                                                                                                        ",
                        "&6⭐ {winnerTeamColor}&l{winnerTeamName} ha vinto la partita! &6⭐",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                        "",
                        "&fHai perso nella squadra {teamColor}{teamName}",
                        "&7Statistiche di questa partita",
                        "&eUccisioni: &f{kills} &8| &eUccisioni finali: &f{finalKills} &8| &eLetti distrutti: &f{beds} &8| &eMorti: &f{deaths},&eUccisioni: &7{kills} &8| &eUccisioni finali: &7{finalKills} &8| &eLetti distrutti: &7{beds} &8| &eMorti: &7{deaths}",
                        "&fGrazie per aver giocato, {player}!",
                        "&a{serverIp}",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oEliminato", " {level}", " &c&oEliminato"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                        "                                                                                                        ",
                        "&a{serverIp}",
                        "&6⭐ {winnerTeamColor}&l{winnerTeamName} ha vinto la partita! &6⭐",
                        "&7{date}",
                        "&7Mappa: &f{map} &7Modalità: &f{group}",
                        "",
                        "&fGrazie per aver giocato, {player}!",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                        "",
                        "&fOfferto da {poweredBy}",
                        ""
                ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oSpettatore "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                        "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                        "&fLivello: {level}",
                        "",
                        "&fProgresso: &a{currentXp}&7/&b{requiredXp}",
                        "{progress}",
                        "",
                        "&7{player}",
                        "",
                        "&fSoldi: &a{money}",
                        "",
                        "&fVittorie: &a{wins}",
                        "&fUccisioni: &a{kills}",
                        "", "&e{serverIp}"));
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lTEAM ELIMINATO > Il team {TeamColor}{TeamName} &cè stato eliminato\n");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Esperienza BedWars ricevuta (Tempo di Gioco).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Esperienza BedWars ricevuta (Vittoria).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Esperienza BedWars ricevuta (Supporto Team).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Esperienza BedWars ricevuta (Distruzione letto).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Esperienza BedWars ricevuta (Uccisione).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Esperienza BedWars ricevuta (Uccisione Finale).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Monete (Tempo di Gioco).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Monete (Vittoria).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Monete (Supporto Team).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Monete (Distruzione letto).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Monete (Uccisione finale).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Monete (Uccisione).");

        //shop
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Acquisto rapido");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Aggiungi all'acquisto");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cNon hai abbastanza {currency}! Te ne occorre {amount} in più!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aHai comprato &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cHai già comprato questo!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Categorie");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Oggetti"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bAcquisto rapido");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cSlot libero!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Questo è uno slot per l'acquisto rapido!", "&bShift + clic &7su un oggetto nel", "&7negozio per aggiungerlo qui."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eClicca per acquistare");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cNon hai abbastanza {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aMASSIMO!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bShift clic per aggiungere all'acquisto rapido");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bShift clic per rimuovere dall'acquisto rapido!");

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Blocchi", "&aBlocchi", Collections.singletonList("&eClicca per sfogliare!"));
        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lana", Arrays.asList("&7Costo: &f{cost} {currency}", "", "&7Buono per costruire ponti tra", "&7le isole. Prende il colore", "&7del tuo team.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Argilla indurita", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Blocco base per proteggere  il letto.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Vetro Anti Esplosione", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Immune alle esplosioni.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Pietra dell'End", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Blocco solido per difendere il letto.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Scala", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Utile per salvare gatti bloccati", "&7sugli alberi.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Legna", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Blocco solido per difendere il letto.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Spade", "&aSpade", Collections.singletonList("&eClicca per sfogliare!"));
        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Spada di pietra", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Spada di ferro", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Spada di diamante", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Bastone (Contraccolpo I)", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Armatura", "&aArmatura", Collections.singletonList("&eClicca per sfogliare!"));
        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armatura di maglia permanente", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Gambali e stivali di maglia", "&7con cui rinascerai sempre", "&7equipaggiato.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armatura di ferro permanente", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Gambali e stivali di ferro", "&7con cui rinascerai sempre", "&7equipaggiato.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armatura di diamante permanente", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Gambali e stivali di diamante", "&7con cui rinascerai sempre", "&7equipaggiato.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Utensili", "&aUtensili", Collections.singletonList("&eClicca per sfogliare!"));
        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Cesoie Permanenti", Arrays.asList("&7Costo: {cost} {currency}",
                "", "&7Utile per tagliare la lana.", "&7Respawnerai sempre con questo utensile.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Piccone {tier}", Arrays.asList("&7Costo: {cost} {currency}", "&7Tier: &e{tier}",
                "", "&7Questo è un item upgradabile.", "&7Perderai un tier alla tua morte.", "", "&7Respawnerai sempre con", "&7questo item avendo almeno", "&7il tier pià basso.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Ascia {tier}", Arrays.asList("&7Costo: {cost} {currency}", "&7Tier: &e{tier}",
                "", "&7Questo è un item upgradabile.", "&7Perderai un tier alla tua morte.", "", "&7Respawnerai sempre con", "&7questo item avendo almeno", "&7il tier pià basso.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Distanza", "&aArchi", Collections.singletonList("&eClicca per sfogliare!"));
        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Frecce", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco (Potenza I)", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco (Potenza I, Contraccolpo I)", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Pozioni", "&aPozioni", Collections.singletonList("&eClicca per sfogliare!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Pozione Rapidità {level} ({duration} secondi)", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Pozione Salto {level} ({duration} secondi)", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Pozione Invisibilità ({duration} secondi)", Arrays.asList("&7Costo: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Utilità", "&aUtilità", Collections.singletonList("&eClicca per sfogliare!"));
        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Mela D'oro", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Mela rigeneratrice di vita.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}BedBug", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Spawna un silverfish dove arriva", "&7la palla di neve, per distrare", "&7gli avversari. Vive 15 secondi.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Difensore dei sogni", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Un Golem di ferro che ti aiuta a proteggere", "&7la tua base. Vive 4 minuti.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Palla di fuoco", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Clic-destro per lanciare! Ottima per", "&7spingere gli avversari sui ponti", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Si accende instantaneamente, utile per", "&7far esplodere cose!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender Pearl", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Il metodo pià veloce per invadere", "&7la base degli avversari.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Secchio D'acqua", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Utile per rallentare gli", "&7inamici. Può anche proteggere", "&7dalla TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Bridge Egg", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Questo uovo crea un ponte in sua", "&7direzione dopo averlo lanciato.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Latte Magico", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Evita le trappole per 60 secondi", "&7dopo averlo consumato.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Spugna", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Utile per succhiare l'acqua :)).", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "Compact Pop-up Tower", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Torre Pop-up Compatta", Arrays.asList("&7Costo: {cost} {currency}", "", "&7Piazza una Torre Pop-up", "&7compatta per difenderti!", "", "{quick_buy}", "{buy_status}"));

        yml.addDefault(Messages.MEANING_NO_TRAP, "Nessuna Trappola!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Costo: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Clicca per acquistare!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Non hai abbastanza {currency}");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBLOCCATO");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}SBLOCCATO");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} ha acquisistato &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Forgia di Ferro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                        Arrays.asList("&7Potenzia la generazione di risorse", "&7nella tua isola.", "", "{tier_1_color}Livello 1: +50% risorse, &b{tier_1_cost} {tier_1_currency}",
                                "{tier_2_color}Livello 2: +100% risorse, &b{tier_2_cost} {tier_2_currency}",
                                "{tier_3_color}Livello 3: genera smeraldi, &b{tier_3_cost} {tier_3_currency}",
                                "{tier_4_color}Livello 4: +200% risorse, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Forgia d'Oro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Forgia di Smeraldi");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Forgia Finale");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eCompra una trappola");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Le trappole acquistate saranno", "&7messe in coda sulla destra.", "", "&eClic per sfogliare!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Spade Affilate");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                        Arrays.asList("&7Il tuo team otterrà Affilatezza I", "&7permanentemente su tutte le spade", "&7e ascie!", "", "{tier_1_color}Costo: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Armatura Rinforzata I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                        Arrays.asList("&7Il tuo team ottiene Protezione", "&7permanentemente su tutti i pezzi d'armatura!", "", "{tier_1_color}Livello 1: Protezione I, &b{tier_1_cost} {tier_1_currency}",
                                "{tier_2_color}Livello 2: Protezione II, &b{tier_2_cost} {tier_2_currency}", "{tier_3_color}Livello 3: Protezione III, &b{tier_3_cost} {tier_3_currency}", "{tier_4_color}Livello 4: Protezione IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Armatura Rinforzata II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Armatura Rinforzata III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Armatura Rinforzata IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Minatore Maniaco I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                        Arrays.asList("&7Tutti i giocatori del tuo team", "&7otterranno permanentemente Rapidità.", "", "{tier_1_color}Livello 1: Rapidità I, &b{tier_1_cost} {tier_1_currency}", "{tier_2_color}Livello 2: Rapidità II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Minatore Maniaco II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Pozza Rigenerativa");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                        Arrays.asList("&7Crea un campo di rigenerazione", "&7attorno alla tua base!", "", "{tier_1_color}Costo: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Bonus Drago");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                        Arrays.asList("&7Il tuo team avrà 2 draghi invece", "&7di 1 durante la morte improvvisa!", "", "{tier_1_color}Costo: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Acquistabile");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Coda trappole"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Trappola #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Il primo nemico che entrerà", "&7nella tua base attiverà", "&7questa trappola!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first", Arrays.asList("", "&7Acquistando una trappola verrà", "&7messa in coda qui. Il costo", "&7aumenterà in base al numero", "&7di trappole in coda.", "", "&7Prossima trappola: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Trappola #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Il secondo nemico che entrerà", "&7nella tua base attiverà", "&7questa trappola!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second", Arrays.asList("", "&7Acquistando una trappola verrà", "&7messa in coda qui. Il costo", "&7aumenterà in base al numero", "&7di trappole in coda.", "", "&7Prossima trappola: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Trappola #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Il terzo nemico che entrerà", "&7nella tua base attiverà", "&7questa trappola!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third", Arrays.asList("", "&7Acquistando una trappola verrà", "&7messa in coda qui. Il costo", "&7aumenterà in base al numero", "&7di trappole in coda.", "", "&7Prossima trappola: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}È una trappola!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Infligge Cecità e Lentezza", "&7per 5 secondi.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Trappola controffensiva");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Conferisce Velocità I per 15 secondi", "&7agli alleati vicino alla tua base.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Trappola d'allarme");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Rivela i giocatori invisibili", "&7e il loro nome e squadra.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Trappola della fatica mineraria");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Infligge Fatica mineraria per 10", "&7secondi.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aIndietro");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7Ai Potenziamenti Squadra"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Coda trappole");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cCoda trappole piena!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} è stata attivata!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cTRAPPOLA ATTIVATA!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fLa tua trappola {trap} è stata attivata!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lAllarme attivata da &7&l{player} &c&ldel team {color}&l{team} &c&l!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALLARME!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fAllarme attivata dal team {color}{team}&f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNome non impostato");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cDescrizione non impostata"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Potenziamenti Squadra");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

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

public class Spanish extends Language {

    public Spanish() {
        super(BedWars.plugin, "es");
        YamlConfiguration yml = getYml();
        yml.options().header("Translation by JuliCarles#1783 and Danidev819#7465");
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Espanol");

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
        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/grupo>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(espectador)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "spawn-protection está habilitado en server.properties; esto puede afectar a las arenas de BedWars. Se recomienda establecerlo en 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Se ha detectado Multiverse-Core; elimínalo o asegúrate de que no modifique los mapas de BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Cargando {world} desde el contenedor de mundos de Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Creando un nuevo mapa vacío: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7ID de usuario: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7ID de descarga: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7¡La arena {arena} no existe!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} se añadió al grupo: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7¡Grupo creado!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Crea un grupo de arenas. Consulta más detalles en nuestra wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fPredeterminado");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7¡Grupo eliminado!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §ehaz clic para ver detalles");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fGestiona los grupos de arenas.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7¡Este grupo ya existe!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Grupos de arenas disponibles:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Ver los grupos disponibles.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7¡Este grupo no existe!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Elimina un grupo de arenas. Consulta más detalles en nuestra wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Establece el grupo de la arena. Consulta más detalles en nuestra wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7No existe ningún grupo llamado: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} establecidos)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fMuestra las arenas disponibles");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cNo hay arenas para mostrar.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fJ: §e{players} §fE: {status} §fMc: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Partidas instanciadas: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Escribe /§a{command} arenaList {page}§7 para la siguiente página.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Uso: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7¡Ya no puedes colocar ni romper bloques!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §epermiso de construcción");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fActiva o desactiva la sesión de construcción \n§fpara poder romper o colocar bloques.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Ahora puedes colocar y romper bloques.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Ocurrió un error al copiar la configuración del mapa. Revisa la consola.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7¡Desactiva {arena} primero!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fClona una arena existente.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7¡{arena} ya existe!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Hecho :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Uso: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Escribe de nuevo para confirmar.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fElimina un mapa y su configuración.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7¡Esta arena no existe!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7¡{arena} ha sido eliminada!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Uso: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7¡{arena} no existe como carpeta de mundo!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7¡Esta arena ya está desactivada!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fDesactiva una arena.\nEsto expulsará a los jugadores \n§fde la arena antes de desactivarla.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7Hay una partida en curso en esta arena; ¡desactívala después de la partida!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Desactivando arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7¡Esta arena ya está activada!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fActiva una arena.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7¡Esta arena ya está en la cola de activación!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Activando arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Uso: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §ehaz clic para ver detalles");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fGestiona el nivel de un jugador.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§c¡La cantidad debe ser un número entero!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§c¡El nivel debe ser un número entero!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7¡Jugador no encontrado!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Es posible que el jugador deba volver a conectarse para ver la actualización.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Establece el nivel de un jugador.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7El nivel de {player} se estableció en: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Uso: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Da XP a un jugador.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7Se dieron {amount} xp a: {player}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Uso: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Haz clic para usarlo.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Uso: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Puedes usar §e{players} §7para el número de jugadores de este §7grupo de arenas.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §b¡establecido!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §ecrear un NPC de unión");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fCrea un NPC de unión  \n§fHaz clic para más detalles.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fUsa este comando para crear un NPC de unión.\n§fHaz clic para ver la sintaxis.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Uso: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fPonte delante de un NPC para eliminarlo.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Uso: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bNo hay ningún NPC cerca.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §b¡Aún no hay ningún NPC establecido!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §b¡Se eliminó el NPC seleccionado!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bGrupos seleccionados: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7¡Configuración de arena {config} recargada!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7¡{config} recargado!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §erecargar mensajes");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fRecarga los mensajes.\n§c¡No recomendado!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7¡{language} recargado!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7¡Ya estás en una sesión de configuración!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 no debe contener mayúsculas. Cambia el nombre de tu carpeta a: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7¡Desactívala primero!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fCrea o edita una arena.\n'_' y '-' no se mostrarán en el nombre de la arena.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} no debe contener este símbolo: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Uso: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lHaz clic aquí para crear los equipos encontrados.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§f¡Haz clic para crear los equipos encontrados!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lNUEVOS EQUIPOS ENCONTRADOS:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7No se encontraron equipos nuevos.\n§6 ▪ §7Crea equipos manualmente con: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Buscando equipos. Esto puede causar lag.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Tiempo agotado. Escribe de nuevo para buscar equipos.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fSi quieres que el lobby desaparezca cuando empiece la partida,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lELIMINACIÓN DEL LOBBY DE ESPERA:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Este paso es OPCIONAL. Si quieres omitirlo, ejecuta §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fusa los siguientes comandos como una selección de WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Equipos disponibles: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6CAMA ESTABLECIDA");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Añade la cama de un equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Cama establecida para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aCama establecida para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fEstablece la cama de un equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§c¡Debes permanecer sobre una cama al usar este comando!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cDebes permanecer sobre una cama.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fEstablece la cama de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7¡La altura máxima de construcción Y se estableció en §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Uso: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Colores disponibles: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7¡{team} §7creado!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7¡El equipo {team} ya existe!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7¡Color no válido!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Uso: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "¡Generador {generator} añadido!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a ¡generador añadido!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Añade un generador de equipo.\nEl equipo se detectará automáticamente.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Prueba usando: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6Generador {generator} añadido para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Generador {generator} añadido para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6Generador {generator}§a añadido para {team}§a!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (detectar equipo automáticamente)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Usa: /bw createTeam si quieres crear uno.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§c¡Este generador ya estaba establecido!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§c¡Este generador ya estaba establecido!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} GENERADOR ESTABLECIDO");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Otro uso: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Añade un generador de esmeraldas/diamantes.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Generador establecido para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Añade un generador de equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cNo se encontró el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Generador establecido para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aGenerador establecido para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "¡Crea primero los equipos!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§c¡Crea primero los equipos!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Drops de eliminación {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Establece la ubicación de los drops de eliminación de un equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Drops de eliminación establecidos para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Drops de eliminación {team} (haz clic para establecer)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fEstablece los drops de eliminación para {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Drops de eliminación establecidos para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aDrops de eliminación establecidos para el equipo: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cUso: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7¡Máximo por equipo establecido!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Uso: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cNo se encontró ningún equipo cercano.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cNo se encontró ningún equipo cercano.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7¡No estás en una sesión de configuración!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "No se encontró ningún generador cercano (rango 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cNo se encontró ningún generador cercano.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Generador {generator} eliminado en la ubicación: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aGenerador {generator} eliminado.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Debes estar cerca del holograma del generador que quieres eliminar.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §aGenerador {generator} eliminado.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "¡Se eliminaron los generadores de {team}!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Generador {generator} de {team} eliminado en la ubicación: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Generador de {team} eliminado.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Elimina {team} §7(haz clic para eliminar)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Este equipo no existe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cEquipo no encontrado: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Equipo eliminado: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aEquipo eliminado: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cUso: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Ahora puedes activarla usando:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aActiva esta arena.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (haz clic para activar)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "¡Cambios de la arena guardados!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6TIENDA ESTABLECIDA");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Establece la tienda de un equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Otro uso: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Tienda establecida para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Establece la tienda de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6SPAWN ESTABLECIDO");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Restantes: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Spawn establecido para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Lista de equipos: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Spawn establecido para: {team} (haz clic para establecer)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fEstablece el spawn de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cNo se encontró el equipo seleccionado: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cUso: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "¡Ubicación del espectador establecida!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cUso: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "O si estableciste el spawn y no se encontró automáticamente, prueba: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§c¡Este equipo no existe!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(haz clic para establecer)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "¡Asegúrate de establecer primero el spawn del equipo!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fEstablece el spawn de un equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Tipos disponibles: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Grupo de arena cambiado a: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(haz clic para establecer)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dHaz clic para convertir la arena en {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Uso: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6MEJORAS ESTABLECIDAS");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Establece el NPC de mejoras del equipo.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "NPC de mejoras establecido para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fEstablece el NPC de mejoras de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dEstablece la posición {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Establece la posición restante:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7¡Posición {position} establecida!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7¡Establece el spawn de los equipos si aún no lo has hecho!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Uso: /{command} {subcommand} 1 or 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7¡Spawn de espera establecido para §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aEstablece el lobby principal. §fEs obligatorio, pero\n§fsi vas a usar el servidor en modo §eBUNGEE §f\n§fno se usará la ubicación del lobby.\n§eEscribe de nuevo para reemplazar la ubicación de spawn anterior.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Este comando no puede usarse en arenas. ¡Está destinado al lobby principal!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(no establecido)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(establecido)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7¡Ubicación del lobby establecida!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Activa o desactiva la comprobación de preparación.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eFuerza el final de una arena");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fFuerza el final de una arena sin ganador.\n&fPermiso: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cLa partida no está en curso.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aFinalizando la partida a la fuerza...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eFuerza el inicio de una arena");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fFuerza el inicio de una arena.\n&fPermiso: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eAcorta la cuenta regresiva de inicio a 5 s");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fAcorta la cuenta regresiva de inicio a 5 s en una arena.\n&fPermiso: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Activa o desactiva el estado de listo.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fAbre la GUI de arenas.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fÚnete a una arena por nombre o por grupo.\n&f/{command} join random - únete a una arena aleatoria.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fCambia tu idioma.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fSal de una arena.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fAbre la GUI de estadísticas.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fAlterna entre el modo espectador Vanilla y el modo espectador del plugin.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Comandos de administración");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eenable/ disable");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fNo hay comandos de consola disponibles ahora.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7¡Primero debes establecer la ubicación del lobby!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "No deberías estar aquí.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e ver comandos de jugador");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fMuestra los comandos del jugador.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &aComandos de {world}");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} por andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Arenas: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(NO ESTABLECIDO)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(ESTABLECIDO)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oOPCIONAL");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(TODO ESTABLECIDO)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Restante: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(POS 1 NO ESTABLECIDA)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(POS 2 NO ESTABLECIDA)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(detección automática)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} CREADOS)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (ESTABLECIDO EN {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fEstablece el lugar donde los jugadores\n&fesperarán antes de que comience la partida.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fHaz que el lobby de espera desaparezca al comenzar.\n&fSelecciónalo como una región de WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fEstablece dónde aparecerán los espectadores.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fCrea equipos según los colores de las islas.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fCrea un equipo.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fElimina un equipo por nombre.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fEstablece el spawn de un equipo.\n&fEquipos sin spawn establecido:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fEstablece la ubicación de la cama de un equipo.\n&fNo tienes que especificar el nombre del equipo.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fEstablece el NPC de un equipo.\n&fNo tienes que especificar el nombre del equipo.\n&fSolo aparecerá cuando comience la partida.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fEstablece el NPC de mejoras de un equipo.\n&fNo tienes que especificar el nombre del equipo.\n&fSolo aparecerá cuando comience la partida.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fEstablece la ubicación donde se\n&fdejarán los objetos enemigos después de matarlos.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fAñade un punto de aparición de generador.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fPermanece sobre un bloque de diamante para establecer el generador de diamantes.\n&fPermanece sobre un bloque de esmeralda para establecer el generador de esmeraldas.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fAñade un punto de aparición de generador.\n&ePermanece en una isla de equipo para establecer un generador de equipo\n&fPermanece sobre un bloque de diamante para establecer el generador de diamantes.\n&fPermanece sobre un bloque de esmeralda para establecer el generador de esmeraldas.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fEstablece el tamaño máximo del equipo.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fEstablece el grupo de la arena.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fAñade la arena a un grupo.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fGuarda la arena y vuelve al lobby");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cSe intentó cargar la arena {arena}, pero ya está en la cola de activación.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cSe intentó cargar la arena {arena}, pero ya está activada.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "No estableciste ningún equipo para la arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cDebes establecer al menos 2 equipos en: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cNo existe ningún mapa llamado {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cColor no válido en el equipo: {team} de la arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} no establecido para el equipo {team} en: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cNo hay ningún generador de diamantes establecido en: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cNo hay ningún generador de esmeraldas establecido en: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cEl spawn de espera no está establecido en: {arena}");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Método de configuración");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lCONFIGURACIÓN ASISTIDA");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&a¡Configuración fácil y rápida!", "&7Para principiantes y personal perezoso :D", "", "&3Opciones reducidas."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lCONFIGURACIÓN AVANZADA");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&a¡Configuración detallada!", "&7Para personal experimentado :D", "", "&3Opciones avanzadas."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7Cargando {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7¡Configuración de {arena} cancelada!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aHas sido teletransportado al spawn de &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&a¡Hola {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fEstablece el spawn de espera.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fEs el lugar donde los jugadores esperarán a que comience la partida.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6HAZ CLIC AQUÍ PARA ESTABLECER EL LOBBY DE ESPERA    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dHaz clic para establecer el spawn de espera.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eO escribe: &7/{command} para ver la lista de comandos.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fMuestra la lista de comandos.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6Generador {generator} añadido para el equipo: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6SPAWN ESTABLECIDO");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6CAMA ESTABLECIDA");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6TIENDA ESTABLECIDA");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6MEJORAS ESTABLECIDAS");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Drops de eliminación {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} GENERADOR ESTABLECIDO");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Hierro");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Oro");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Esmeralda");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Diamante");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Equipos disponibles: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cNo se pudo iniciar la sesión de configuración. Revisa la consola.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&c¡Falta el soporte de Vault!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lERROR: ¡Esto requiere soporte de Vault! ¡Instala el plugin Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Cartel guardado para la arena: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7¡Aún no has establecido ninguna arena!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "¡BedWars1058 SE RECARGÓ! (no recargues plugins)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&l¡Feliz Halloween!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} xp!");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eEnviar mensaje a la arena actual");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fEnvía un mensaje a todos los jugadores de tu arena.\n&fUso: /{command} echo <mensaje>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperador&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eEnviar mensaje a una arena específica");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fEnvía un mensaje a todos los jugadores de una arena específica.\n&fUso: /{command} echoto <arena> <mensaje>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eEnviar mensaje a todas las arenas");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fEnvía un mensaje a todos los jugadores de todas las arenas.\n&fUso: /{command} echoall <mensaje>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cUso: /bw echo <mensaje>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aMensaje enviado a la arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cNo estás en una arena.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cUso: /bw echoto <arena> <mensaje>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aMensaje enviado a la arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cUso: /bw echoall <mensaje>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aMensaje enviado a todas las arenas.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena no encontrada: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cEste comando es solo para jugadores.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&a¡Ya estás listo!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aYa no estás listo.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&a¡Todos están listos! ¡Cuenta regresiva reducida a 10 segundos!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aComprobación de preparación activada.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aComprobación de preparación desactivada.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cEste comando está desactivado.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&c¡No estás en una partida!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cNo puedes usar este comando ahora.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cLos espectadores no pueden usar este comando.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aListo");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cNo listo");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7¡Haz clic derecho para estar listo!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7¡Haz clic derecho para dejar de estar listo!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7¡No hay suficientes jugadores para comenzar la partida!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aModo espectador Vanilla activado.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aModo espectador normal activado.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&c¡Inventario lleno!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&a¡Equipada!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cHas sido expulsado ya que un VIP se ha unido a la partida.\n&aConsidere hacer una donación para obtener más funciones. &7&o(clic)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cEsta arena está llena!\n&aConsidere hacer una donación para obtener más funciones. &7&o(clic)");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cLo sentimos, pero esta arena está llena.\n&cSabemos que eres donante, pero la arena está llena de personal o donantes.");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cNo hay suficientes jugadores! La cuenta regresiva ha sido frenada!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eLa arena en la que estabas se está reiniciando.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cEn Juego");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Reiniciando");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2En Espera §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Comenzando §c{full}");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cNo existe una arena o grupos de arena llamadas: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cNo hay arenas disponibles por el momento ;(");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cNo estas en ninguna arena!");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Arenas disponibles");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Estado: {status}", "&7Jugadores: &f{on}&7/&f{max}", "&7Tipo: &a{group}", "", "&aClic izquierdo para unirte!", "&eClic derecho para espectar!"));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Idiomas disponibles:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Usa: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cJugador no encontrado!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cEste jugador no está en una arena de bedwars.!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cLa arena donde está el jugador aún no comenzó.!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cUso: /bw tp <usuario>");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &ese ha vuelto a conectar!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cEste idioma no existe!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aIdioma cambiado!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cNo puedes cambiar tu idioma mientras estas en juego.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cTu party es demasiado grande para unirte a esta partida como equipo. Considera reducir el tamaño o ingresar a una arena más grande.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cSolo el lider puede unirse a una partida.");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eNivel &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamante");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEsmeralda");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eAparece en &c{seconds} &esegundos");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &ese ha unido (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &eha salido!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eEl juego comenzara en &6{time} &esegundo(s)!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cEsperando más jugadores..");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[GRITA] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[ESPECTADOR] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l    Protege tu cama y destruye camas enemigas.",
                "&e&l Consigue mejoras para ti y para tu equipo consiguiendo",
                "&e&l   Hierro, Oro, Esmeralda, y Diamantes de los generadores",
                "&e&l         para acceder a importantes mejoras.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.MEANING_SHOUT, "grita");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aVAMOS");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fMapa: &a{map}",
                "",
                "&fJugador: &a{on}/{max}",
                "",
                "&fEsperando,&fEsperando.,&fEsperando..,&fEsperando...",
                "",
                "&fModo: &a{group}",
                "&fVersión: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Espectando",
                "&fMapa: &a{map}",
                "",
                "&fJugador: &a{on}/{max}",
                "",
                "&fEsperando,&fEsperando.,&fEsperando..,&fEsperando...",
                "",
                "&fModo: &a{group}",
                "&fVersión: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fMapa: &a{map}",
                "",
                "&fJugador: &a{on}/{max}",
                "",
                "&fComenzando en &a{time}s",
                "",
                "&fModo: &a{group}",
                "&fVersión: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Espectando",
                "&fMapa: &a{map}",
                "",
                "&fJugador: &a{on}/{max}",
                "",
                "&fComenzando en &a{time}s",
                "",
                "&fModo: &a{group}",
                "&fVersión: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} en &a{time}",
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
                "&o&7Espectando {spectatorTarget}",
                "",
                "&f{nextEvent} en &a{time}",
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
                "&o&7Espectando {spectatorTarget}",
                "",
                "&f{nextEvent} en &a{time}",
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
                "&6Ganador: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMás asesinatos:",
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
                "&6Ganador: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMás asesinatos:",
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
                "&6Ganador: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMás asesinatos:",
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
                "&6Ganador: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMás asesinatos:",
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
                "&f{nextEvent} en &a{time}",
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
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} en &a{time}",
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
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} en &a{time}",
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
                "&f{nextEvent} en &a{time}",
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
                "&finalAsesinatos: &a{kills}",
                "&fAsesinatos Finales: &a{finalKills}",
                "&fCamas Destruidas: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} en &a{time}",
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
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} en &a{time}",
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
                "&finalAsesinatos: &a{kills}",
                "&fAsesinatos Finales: &a{finalKills}",
                "&fCamas Destruidas: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} en &a{time}",
                "",
                "{team}", "{team}", "{team}", "{team}",
                "",
                "&fAsesinatos: &a{kills}",
                "&fAsesinatos finales: &a{finalKills}",
                "&fCamas destruidas: &a{beds}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} en &a{time}",
                "",
                "{team}", "{team}", "{team}", "{team}",
                "",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC_ELIMINATED.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} en &a{time}",
                "",
                "{team}", "{team}", "{team}", "{team}",
                "",
                "&fAsesinatos: &a{kills}",
                "&fAsesinatos finales: &a{finalKills}",
                "&fCamas destruidas: &a{beds}",
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
                "&fHay {on} jugadores en este lobby",
                "Con tecnología de {poweredBy},&a{serverIp}",
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
                "Esperando más jugadores,Esperando más jugadores.,Esperando más jugadores.., Esperando más jugadores...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
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
                "&7&oEstás espectando",
                "Esperando más jugadores,Esperando más jugadores.,Esperando más jugadores.., Esperando más jugadores...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&fComenzando en &a{time} &fsegundos,&fComenzando en &a{time} &fsegundos.,&fComenzando en &a{time} &fsegundos..,&fComenzando en &a{time} &fsegundos..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                "",
                "&7&oEstás espectando"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fComenzando en &a{time} &fsegundos,&fComenzando en &a{time} &fsegundos.,&fComenzando en &a{time} &fsegundos..,&fComenzando en &a{time} &fsegundos..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                "",
                "{nextEvent} en {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fJuegas en el equipo {teamColor}{teamName}",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                "",
                "{nextEvent} en {time}",
                "",
                "&7&oHas sido eliminado,&f&oHas sido eliminado"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fHas jugado en el equipo {teamColor}{teamName}",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oEspectador "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oEliminado {teamColor}&o{teamName}", " {teamColor}&oEliminado {vPrefix}", "{teamColor}&oEliminado {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                "",
                "{nextEvent} en {time}",
                "",
                "&7&oEstás espectando"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oEspectador "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l¡Tu equipo ganó la partida! &6⭐",
                "&7{date}", "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lHas ganado en el equipo {teamColor}&l{teamName}&6&l!,&6&lHas ganado en el equipo {teamColor}&l{teamName}&6&l!,&f&lHas ganado en el equipo {teamColor}&l{teamName}&f&l!",
                "&7Estadísticas de esta partida",
                "&eAsesinatos: &f{kills} &8| &eFinal Asesinatos: &f{finalKills} &8| &eCamas destruidas: &f{beds} &8| &eMuertes: &f{deaths},&eAsesinatos: &7{kills} &8| &eFinal Asesinatos: &7{finalKills} &8| &eCamas destruidas: &7{beds} &8| &eMuertes: &7{deaths}",
                "",
                "&fGracias por jugar {player}!",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l¡El equipo {winnerTeamName} ganó la partida! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lHas ganado en el equipo {teamColor}&l{teamName}&6&l!,&6&lHas ganado en el equipo {teamColor}&l{teamName}&6&l!,&f&lHas ganado en el equipo {teamColor}&l{teamName}&f&l!",
                "&7Estadísticas de esta partida",
                "&eAsesinatos: &f{kills} &8| &eFinal Asesinatos: &f{finalKills} &8| &eCamas destruidas: &f{beds} &8| &eMuertes: &f{deaths},&eAsesinatos: &7{kills} &8| &eFinal Asesinatos: &7{finalKills} &8| &eCamas destruidas: &7{beds} &8| &eMuertes: &7{deaths}",

                "&fGracias por jugar {player}!",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oEliminado", " {level}", " &c&oEliminado"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l¡El equipo {winnerTeamName} ganó la partida! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fHas perdido en el equipo {teamColor}{teamName}",
                "&7Estadísticas de esta partida",
                "&eAsesinatos: &f{kills} &8| &eFinal Asesinatos: &f{finalKills} &8| &eCamas destruidas: &f{beds} &8| &eMuertes: &f{deaths},&eAsesinatos: &7{kills} &8| &eFinal Asesinatos: &7{finalKills} &8| &eCamas destruidas: &7{beds} &8| &eMuertes: &7{deaths}",
                "&fGracias por jugar {player}!",
                "&a{serverIp}",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oEliminado", " {level}", " &c&oEliminado"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&l¡El equipo {winnerTeamName} ganó la partida! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                "",
                "&fGracias por jugar {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&fCon tecnología de {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oEspectador "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab


        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aSalud"));
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 TU'");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fBuscando: {team} &f- Distancia: {distance}m");
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lDefiende tu cama!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cNo puedes destruir tu propia cama!");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cNo puedes colocar bloques aqui!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cSolo puedes romper bloques puesto por jugadores!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lCAMA DESTRUIDA > La cama del equipo {TeamColor}{TeamName} &7ha sido destruida por {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cCAMA DESTRUÍDA!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fYa no reaparecerás!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lCAMA DESTRUIDA > &7Tu cama ha sido destruida por {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cYa no eres invisible porque has recibido daño!");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lEQUIPO ELIMINADO > El equipo {TeamColor}{TeamName} &cha sido eliminado\n");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7ha caído al vacio.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7ha caído al vacio. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7fue empujado al vacio por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7fue empujado al vacio por {KillerColor}{KillerName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7fue empujado por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7fue empujado por {KillerColor}{KillerName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7fue golpeado por una bomba por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7fue golpeado por una bomba por {KillerColor}{KillerName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7fue asesinado por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7fue asesinado por {KillerColor}{KillerName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7se ha desconectado mientras luchaba con {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7se ha desconectado mientras luchaba con {KillerColor}{KillerName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lTu cama ha sido destruida!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cHAS MUERTO!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eReaparecerás en &c{time} &esegundos!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eReaparecerás en &c{time} &esegundos!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aHAS REAPARECIDO!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cHas sido eliminado!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7tiene &c{amount} &7de vida!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lJUEGO FINALIZADO!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVICTORIA!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("", "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                     &6⭐ &l1er Asesino &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                       &l2do Asesino &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                       &l3er Asesino &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        //yml.addDefault(gameOverReward, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
        //        "&f                                   &lReward Summary", "", "",
        //        "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &aha ganado el juego!");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        //yml.addDefault(tablistFormat, "{TeamColor}&l{TeamLetter}&r {TeamColor}{PlayerName} &e{PlayerHealth}");//{TeamColor}{TeamName}{TeamHealth}{PlayerName}{PlayerHealth}
        yml.addDefault(Messages.MEANING_NOBODY, "Nadie");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Los generadores &ehan sido mejorados al nivel &c{tier}");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bMEJORAS DE EQUIPO,&e&lClic DERECHO");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bMEJORAS SOLO,&e&lClic DERECHO");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bTIENDA,&e&lClic DERECHO");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bTIENDA,&e&lClic DERECHO");

        yml.addDefault(Messages.MEANING_FULL, "Llena");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Hierro");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Hierros");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Oro");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Oros");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Esmeralda");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Esmeraldas");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamante");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamantes");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");

        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Usa: /" + mainCmd + " join §o<arena/grupo>");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cNo tienes permisos para hacer esto.");
        yml.addDefault("upgrades.Default.generators.tier1.name", "&eFundidor de Hierro");
        yml.addDefault("upgrades.Default.generators.tier1.lore", Arrays.asList("&7Incrementa la velocidad de aparicion de Hierro", "&7y Oro un 50%..", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier2.name", "&eFundidor de Oro");
        yml.addDefault("upgrades.Default.generators.tier2.lore", Arrays.asList("&7Incrementa la velocidad de aparicion de Hierro", "&7y Oro un 100%..", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.generators.tier3.name", "&eFundidor de Esmeralda");
        yml.addDefault("upgrades.Default.generators.tier3.lore", Arrays.asList("&7Activa la aparicion de Esmeraldas del", "&7generador de tu equipo.", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.maniacMiner.tier1.name", "&eMinero Maniaco");
        yml.addDefault("upgrades.Default.maniacMiner.tier1.lore", Arrays.asList("&7Todos los jugadores de tu quipo", "&7tendran permanentemente Apuro I", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.sharpSword.tier1.name", "&eEspadas Afiladas");
        yml.addDefault("upgrades.Default.sharpSword.tier1.lore", Arrays.asList("&7Tu equipo consigue Filo I en", "&7todas las espadas!", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.reinforced.tier1.name", "&eArmadura Reforzada");
        yml.addDefault("upgrades.Default.reinforced.tier1.lore", Arrays.asList("&7Tu equipo conseguira Proteccion I en", "&7en todas las armaduras!", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.trap.tier1.name", "&eEs una trampa!");
        yml.addDefault("upgrades.Default.trap.tier1.lore", Arrays.asList("&7El proximo enemigo en entrar", "&7a tú base recibirá efecto", "&7v!", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.miningFatigue.tier1.name", "&eTrampa de Fatiga Minera");
        yml.addDefault("upgrades.Default.miningFatigue.tier1.lore", Arrays.asList("&7El próximo enemigo en entrar a tú", "&7base recibirá Fatiga al minar", "&7por 10 segundos!", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault("upgrades.Default.healPool.tier1.name", "&ePiscina de Salud");
        yml.addDefault("upgrades.Default.healPool.tier1.lore", Arrays.asList("&7Crea una capsula de regeneracion", "&7alrededor de tu base!", "", "&8Precio:&b {cost} {currency}", "", "{loreFooter}"));
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7murió.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7murió. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7ha sido disparado por {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7ha sido disparado por {KillerColor}{KillerName}&7! &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7&7fue asesinado por la BedBug de {KillerColor}{KillerTeamName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7&7fue asesinado por la BedBug de {KillerColor}{KillerTeamName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7fue asesinado por el Golem de {KillerColor}{KillerTeamName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7fue asesinado por el Golem de {KillerColor}{KillerTeamName}&7. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");

        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7fue golpeado por una bomba.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7fue golpeado por una bomba. &b&lMUERTE FINAL!");
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8{player} Estadistícas");

        /* save default items messages for stats gui */
        addDefaultStatsMsg(yml, "wins", "&6Victorias", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Derrotas", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Asesinatos", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Muertes", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Asesinatos Finales", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Muertes Finales", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Camas Destruidas", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Primera Partida", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Última Partida", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Juegos Jugados", "&f{gamesPlayed}");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");

        yml.addDefault(Messages.MEANING_NEVER, "Nunca");
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fTu nivel: {level}",
                "",
                "&fProgreso: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fDinero: &a{money}",
                "",
                "&fVictorias totales: &a{wins}",
                "&fAsesinatos totales: &a{kills}",
                "",
                "&e{serverIp}")
        );

        /* party commands */
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aComandos de Party:",
                "&e/party help &7- &bMuestra este mismo mensaje",
                "&e/party invite <player> &7- &bInvita a un jugador a tu party",
                "&e/party info &7- &bMuestra los miembros y dueño del grupo",
                "&e/party promote <player> &7- &bTransfiere el liderazgo del grupo",
                "&e/party leave &7- &bDeja tu actual party",
                "&e/party remove <player> &7- &bExpulsa a un jugador de tu party",
                "&e/party accept <player> &7- &bAcepta la invitacion a una party",
                "&e/party disband &7- &bRompe una party")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eUso: &7/party invite <jugador>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eInvitación enviada a &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &ete ha invitado a una party! &o&7(Clic para aceptar)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cNo puedes invitarte a ti mismo!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cNo hay mas solicitudes para aceptar.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eYa estas en una party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cSolo el jefe de la party puede hacer eso!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eUso: &7/party accept <jugador>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &ese ha unido a la party!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cTu no estas en una party!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cNo puedes dejar tu propia party!\n&eIntenta utilizando: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eha abandonado tu party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eHas roto la party!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Usa: &e/party remove <jugador>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &efue expulsado de tu party.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &eno está en tu party!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eHas promovido exitosamente a {player} a dueño");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eHas sido promovido a dueño del grupo");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} ha sido promovido a dueño");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eEl dueño del grupo es: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS, "{prefix}&eLos miembros del grupo son:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cBOOM Camas");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamante II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamante III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fMuerte Súbita");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEsmeralda II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEsmeralda III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Fin del Juego");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cCAMAS DESTRUIDAS!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fTodas las camas fueron destruidas!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&cTodas las camas fueron destruidas!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cMuerte súbita");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cMUERTE SÚBITA: &6&b{TeamDragons} {TeamColor}{TeamName} Dragon!");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cComando no encontrado o permisos insuficientes!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7No estas jugando!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Cuenta regresiva comenzada!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Tu no puedes forzar el comienzo de la arena.\n§7Esta es una funcion que solo miembros staff pueden utilizar.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Estas ahora espectando la arena §9{arena}§6.\n{prefix}§ePuedes dejar la arena en cualquier momento escribiendo §c/leave§e.");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cNo puedes abrir este cofre ya que el equipo ha sido totalmente eliminado!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&lTransportador");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Salud: &f{health}%", "&7Comida: &f{food}", "", "&7Clic izquierdo para espectar al jugador."));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lRegresar al Lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Clic derecho para regresar al lobby!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&eModo Espectador: &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cSHIFT para salir");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eSalir del Modo Espectador");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eno está conectado!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cLos espectadores no están permitidos en esta arena!");

        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Experiencia de BedWars recibida (Cama Destruida).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Experiencia de BedWars recibida (Asesinato).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Experiencia de BedWars recibida (Asesinato Final).");


        //tienda
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Añadir a compra rápida");

        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cEl dueño de la party se fue y la party se disolvió!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Experiencia de BedWars recibida (Tiempo de juego).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Experiencia de BedWars recibida (Victoria).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Experiencia de BedWars recibida (Ayuda al equipo).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Monedas (Tiempo de juego).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Monedas (Victoria).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Monedas (Ayuda al equipo).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Monedas (Cama Destruida).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Monedas (Asesinato Final).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Monedas (Asesinato).");

        //shop
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Compra rapida");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cNo tienes suficiente {currency}! Necesitas {amount} más!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aHas comprado &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cYa has comprado esto!");

        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Categorías");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Items"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bCompra rapida");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cRanura vacía!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Esta es una ranura de compra rápida!", "&bMayús + clic &7en cualquier objeto", "&7de la tienda para agregarlo aquí."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eHaga clic para comprar!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cNo tienes suficiente {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aMAXIMIZADO!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bHaz Mayús + clic para agregarlo a la compra rápida!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bHaz Mayús + clic para quitarlo de la compra rápida!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Bloques", "&aBloques", Collections.singletonList("&eClic para ver!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lana", Arrays.asList("&7Precio: &f{cost} {currency}", "", "&7Genial para cruzar", "&7islas. Se convierte en el color de tu equipo.",
                "&7color.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Arcilla", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Bloque básico para defender tu cama.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Vidrio anti explosiones", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Inmune a explosiones.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}End Stone", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Bloque sólido para defender tu cama.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Escalera", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Útil para salvar gatos atrapados en", "&7arboles.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidiana", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Protección extrema para tu cama.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Madera", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Bloque sólido para defender tu cama", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Espada", "&aEspada", Collections.singletonList("&eClic para ver!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Espada de piedra", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Espada de hierro", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Espada de diamante", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Palo (KnockBack I)", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Armadura", "&aArmadura", Collections.singletonList("&eClic para ver!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armadura de malla permanente", Arrays.asList("&7Precio: {cost} {currency}",
                "", "&7Pantalones y botas de malla", "&7que siempre spawnearas", "&7con ella.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armadura de hierro permanente", Arrays.asList("&7Precio: {cost} {currency}",
                "", "&7Pantalones y botas de hierro", "&7que siempre spawnearas con ellos.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armadura de diamante permanente", Arrays.asList("&7Precio: {cost} {currency}",
                "", "&7Pantalones y botas de diamante", "&7que siempre spawnearas con ellos", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Herramientas", "&aHerramientas", Collections.singletonList("&eClic para ver!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Tijeras permanentes", Arrays.asList("&7Precio: {cost} {currency}",
                "", "&7Genial para deshacerse de la lana.", "&7Siempre spawnearas con ellos", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Pico {tier}", Arrays.asList("&7Precio: {cost} {currency}", "&7Nivel: &e{tier}",
                "", "&7Este es un item mejorable.", "&7Perderas un nivel cuando.", "&7mueras!", "", "&7Permanentemente", "&7reapareceras al menos con", "&7el nivel mas bajo", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Hacha {tier}", Arrays.asList("&7Precio: {cost} {currency}", "&7Nivel: &e{tier}",
                "", "&7Este es un item mejorable.", "&7Perderas un nivel cuando.", "&7mueras!", "", "&7Permanentemente", "&7reapareceras al menos con", "&7el nivel mas bajo", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8A distancia", "&aA distancia", Collections.singletonList("&eClic para ver"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Flechas", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco (Poder I)", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco (Poder I, Empuje I)", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Pociones", "&aPociones", Collections.singletonList("&eClic para ver!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Pocion de velocidad {level} ({duration} segundos)", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Pocion de salto {level} ({duration} segundos)", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Pocion de invisibilidad ({duration} segundos)", Arrays.asList("&7Precio: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Utilidad", "&aUtilidad", Collections.singletonList("&eClic para ver!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Manzana de oro", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Curación completa.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}BedBug", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Genera un silverfish donde la",
                "&7bola de nieve caiga para distraer a tus", "&7enemigos. Dura 15 segundos.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Defensor de los sueños", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Un Golem de Hierro para ayudar a defender tu",
                "&7base. Dura 4 minutos.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Bola de fuego", Arrays.asList("&7Precio: {cost} {currency}", "", "&7¡Haz clic derecho para volar! Genial para",
                "&7derribar a enemigos en", "&7los puentes", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Se enciende al instante, apropiado",
                "&7para explotar cosas!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender Pearl", Arrays.asList("&7Precio: {cost} {currency}", "", "&7La forma más rápida de invadir las bases",
                "&7enemigas.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Cubo de Agua", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Genial para frenar a los",
                "&7enemigos. Puedes protegerte", "&7de TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Puente Huevo", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Este huevo crea un puente en su",
                "&7recorrido.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Leche Magica", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Evite disparar trampas durante 60",
                "&7segundos despues de consumirla.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Esponja", Arrays.asList("&7Precio: {cost} {currency}", "", "&7Genial para absorber agua.",
                "", "{quick_buy}", "{buy_status}"));

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&lEstadistícas");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&7Utiliza este objeto para ver tus estadísticas."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eJugar");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&7Utiliza este objeto para seleccionar tu arena y jugar"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&c&lSalir");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&7Utiliza este objeto para regresar al lobby."));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&lEstadistícas");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&7Utiliza este objeto para ver tus estadísticas."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&c&lSalir");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&7Utiliza este objeto para regresar al lobby."));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeletransportarse");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&c&lSalir");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&7Utiliza este objeto para regresar al lobby."));

        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cNo puedes hacer eso aún! Espera {seconds} segundos más!");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[GRITA]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[ESPECTADOR]");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cLo lamentamos, pero no puedes ingresar a esta arena por el momento. Usa Clic derecho para entrar en modo espectador!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cLo lamentamos, pero no puedes espectar esta arena en este momento. Utiliza Clic izquierdo para jugar!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cLo siento, pero debes unirte a una arena usando BedWarsProxy. \n&eSi desea configurar una arena, asegúrese de otorgarse el permiso bw.setup para que pueda unirse al servidor directamente!");

        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cNo hay arena a la cual unirse. Recuerda que sólo puedes ingresar a una 5 minutos después del comienzo de la partida!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cNo puedes unirte a esa partida. El juego ha terminado o tu cama ha sido destruida.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eHas ingresado nuevamente a &a{arena}&e!");

        yml.addDefault(Messages.MEANING_NO_TRAP, "Sin trampa!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Precio: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Clic para comprar!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}No tienes suficiente {currency}");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}DESBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} ha comprado &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Forja de Hierro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Actualice la generación de recursos en", "&7su isla.", "", "{tier_1_color}Nivel 1: +50% de Recursos, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nivel 2: +100% de Recursos, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Nivel 3: Aparecen esmeraldas, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nivel 4: +200% de Recursos, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Forja de Oro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Forja de Esmeraldas");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Forja Fundida");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eCompra una trampa");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Las trampas compradas serán", "&7guardadas en la cola.", "", "&eClic para navegar!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Espadas afiladas");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Tu equipo recibira", "&7Afilado I en espadas", "&7y hachas!", "", "{tier_1_color}Precio: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Armadura Reforzada I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Tu equipo recibira", "&7proteccion permanente!", "", "{tier_1_color}Nivel 1: Proteccion I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nivel 2: Proteccion II, &b{tier_2_cost} {tier_2_currency}s",
                        "{tier_3_color}Nivel 3: Proteccion III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nivel 4: Proteccion IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Armadura Reforzada II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Armadura Reforzada III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Armadura Reforzada IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Minero Maniaco I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Todos los jugadores de tu equipo recibiran", "&7prisa minera Permanentemente.", "", "{tier_1_color}Nivel 1: Prisa I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nivel 2: Prisa II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Minero Maniaco II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Piscina de curación");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Crea un area de regeneracion", "&7en tu base!", "", "{tier_1_color}Precio: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Mejora de dragón");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Tu equipo tendra 2 dragones", "&7en vez de 1 durante la muerte súbita!", "", "{tier_1_color}Precio: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Comprable");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Cola de Trampas"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Trampa #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7El primer enemigo en caminar", "&7en tu base activara", "&7esta trampa!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7La compra de una trampa.", "&7la pondra en cola aqui. Su costo", "&7se basará en una escala del", "&7numero de trampas.", "", "&7Siguiente trampa: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Trampa #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7El segundo enemigo en caminar", "&7en tu base activara", "&7esta trampa!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7La compra de una trampa.", "&7la pondra en cola aqui. Su costo", "&7se basará en una escala del", "&7numero de trampas.", "", "&7Siguiente trampa: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Trampa #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7El tercer enemigo en caminar", "&7en tu base activara", "&7esta trampa!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7La compra de una trampa.", "&7la pondra en cola aqui. Su costo", "&7se basará en una escala del", "&7numero de trampas.", "", "&7Siguiente trampa: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Es una trampa!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Inflige ceguera y lentitud", "&7por 5 segundos.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Trampa de contraofensiva");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Otorga velocidad I durante 15 segundos a los", "&7jugadores aliados en la base.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Trampa de alarma");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Reveales jugadores invisibles", "&7tambien su nomrbe y equipo.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Trampa de fatiga minera");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Infligir fatiga minera por 10", "&7segundos.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aVolver");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7A las mejoras de equipo"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Cola de una trampa");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cCola de trampas llena!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} desactivada!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cTRAMPA ACTIVADA!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fLa trampa {trap} ha sido activada!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lTrampa de alarma activada por &7&l{player} &c&ldesde el equipo {color}&l{team}!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARMA!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fTrampa de alarma activada por el equipo {color}{team}&f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNombre no establecido");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cDescripción no establecida"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Mejoras de equipo");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

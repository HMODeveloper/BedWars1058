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

public class Portuguese extends Language {

    public Portuguese() {
        super(BedWars.plugin, "pt");
        YamlConfiguration yml = getYml();
        yml.options().copyDefaults(true);
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Português");

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

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/group>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(espectador)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "spawn-protection está ativado em server.properties; isso pode afetar as arenas do BedWars. Recomenda-se defini-lo como 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Multiverse-Core detectado; remova-o ou certifique-se de que não modifique os mapas do BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Carregando {world} do contêiner de mundos do Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Criando um novo mapa vazio: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7ID do usuário: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7ID de download: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7A arena {arena} não existe!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} foi adicionada ao grupo: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Grupo criado!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Crie um grupo de arenas. Mais detalhes na nossa wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fPadrão");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Grupo excluído!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eclique para detalhes");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fGerencie grupos de arenas.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Este grupo já existe!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Grupos de arenas disponíveis:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Veja os grupos disponíveis.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Este grupo não existe!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Remova um grupo de arenas. Mais detalhes na nossa wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Defina o grupo da arena. Mais detalhes na nossa wiki.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Não existe nenhum grupo chamado: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} definido(s))");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fMostre as arenas disponíveis");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cNenhuma arena para exibir.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fWl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Partidas instanciadas: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Digite /§a{command} arenaList {page}§7 para a próxima página.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Uso: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Você não pode mais colocar ou quebrar blocos!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §epermissão de construção");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fAtive ou desative o modo de construção \n§fpara poder quebrar ou colocar blocos.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Agora você pode colocar e quebrar blocos.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Ocorreu um erro ao copiar a configuração do mapa. Verifique o console.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Desative {arena} primeiro!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fClone uma arena existente.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} já existe!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Pronto :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Uso: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Digite novamente para confirmar.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fExclua um mapa e sua configuração.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Esta arena não existe!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} foi excluída!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Uso: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} não existe como pasta de mundo!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Esta arena já está desativada!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fDesative uma arena.\nIsso removerá os jogadores \n§fda arena antes de desativá-la.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7Há uma partida em andamento nesta arena; desative-a após o jogo!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Desativando arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Esta arena já está ativada!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fAtive uma arena.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Esta arena já está na fila de ativação!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Ativando arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Uso: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eclique para detalhes");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fGerencie o nível de um jogador.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cA quantidade deve ser um número inteiro!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cO nível deve ser um número inteiro!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Jogador não encontrado!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7O jogador pode precisar reconectar-se para ver a atualização.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Defina o nível de um jogador.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7O nível de {player} foi definido para: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Uso: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Dê XP a um jogador.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{amount} xp foi concedido a: {player}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Uso: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Clique para usar.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Uso: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Você pode usar §e{players} §7para a contagem de jogadores neste §7grupo de arenas.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bfoi definido!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §ecrie um NPC de entrada");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fCrie um NPC de entrada  \n§fClique para mais detalhes.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fUse este comando para criar um NPC de entrada.\n§fClique para ver a sintaxe.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Uso: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fFique em frente a um NPC para removê-lo.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Uso: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bNão há nenhum NPC por perto.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bAinda não há nenhum NPC definido!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bO NPC selecionado foi removido!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bGrupos selecionados: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Configuração da arena {config} recarregada!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} recarregada!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §erecarregue as mensagens");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fRecarregue as mensagens.\n§cNão recomendado!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} recarregado!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Você já está em uma sessão de configuração!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 não pode conter letras maiúsculas! Renomeie sua pasta para: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Desative-a primeiro!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fCrie ou edite uma arena.\n'_' e '-' não serão exibidos no nome da arena.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} não pode conter este símbolo: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Uso: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lClique aqui para criar as equipes encontradas.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fClique para criar as equipes encontradas!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lNOVAS EQUIPES ENCONTRADAS:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Nenhuma equipe nova foi encontrada.\n§6 ▪ §7Crie equipes manualmente com: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Procurando equipes. Isso pode causar lag.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Tempo esgotado. Digite novamente para procurar equipes.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fSe quiser que o lobby desapareça quando o jogo começar,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lREMOÇÃO DO LOBBY DE ESPERA:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Esta etapa é OPCIONAL. Para ignorá-la, use §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fuse os comandos a seguir como uma seleção do WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Equipes disponíveis: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6CAMA DEFINIDA");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Adicione a cama de uma equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Cama definida para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aCama definida para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fDefina a cama de uma equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cVocê deve ficar sobre uma cama ao usar este comando!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cVocê deve ficar sobre uma cama.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fDefina a cama de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Altura máxima de construção Y definida para §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Uso: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Cores disponíveis: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7criada!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7A equipe {team} já existe!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Cor inválida!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Uso: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "O gerador de {generator} foi adicionado!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a gerador adicionado!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Adicione um gerador de equipe.\nA equipe será detectada automaticamente.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Tente usar: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{generator} gerador adicionado para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Gerador de {generator} adicionado para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6Gerador de {generator}§a para {team}§a foi adicionado!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (detectar equipe automaticamente)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Use: /bw createTeam se quiser criar uma.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cEste gerador já foi definido!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cEste gerador já foi definido!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} DEFINIDO");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Outro uso: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Adicione um gerador de esmeralda/diamante.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Gerador definido para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Adicione um gerador de equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cNão foi possível encontrar a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Gerador definido para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aGerador definido para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Crie as equipes primeiro!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cCrie as equipes primeiro!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Drops de abate {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Defina o local dos drops de abate de uma equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Drops de abate definidos para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Drops de abate {team} (clique para definir)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fDefina os drops de abate para {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Drops de abate definidos para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aDrops de abate definidos para a equipe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cUso: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Máximo por equipe definido!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Uso: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cNão foi possível encontrar nenhuma equipe próxima.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cNão foi possível encontrar nenhuma equipe próxima.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Você não está em uma sessão de configuração!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Não foi possível encontrar nenhum gerador próximo (alcance 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cNão foi possível encontrar nenhum gerador próximo.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Gerador de {generator} removido na localização: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aGerador de {generator} removido.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Você deve ficar perto do holograma do gerador que deseja remover.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §aGerador de {generator} removido.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "Os geradores de {team} foram removidos!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Gerador de {team} {generator} removido na localização: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Gerador de {team} removido.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Remova {team} §7(clique para remover)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Esta equipe não existe: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cEquipe não encontrada: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Equipe removida: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aEquipe removida: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cUso: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Agora você pode ativá-la usando:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aAtive esta arena.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (clique para ativar)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Alterações da arena salvas!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6LOJA DEFINIDA");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Defina a loja de uma equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Outro uso: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Loja definida para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Defina a loja de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6SPAWN DEFINIDO");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Restante: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Spawn definido para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Lista de equipes: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Defina o spawn de: {team} (clique para definir)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fDefina o spawn de {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cNão foi possível encontrar a equipe selecionada: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cUso: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "Local do espectador definido!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cUso: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Ou, se você definiu o spawn e ele não foi encontrado automaticamente, tente usar: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cEsta equipe não existe!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(clique para definir)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Certifique-se de definir primeiro o spawn da equipe!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fDefina o spawn de uma equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Tipos disponíveis: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Grupo da arena alterado para: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(clique para definir)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dClique para tornar a arena {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Uso: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6MELHORIA DEFINIDA");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Defina o NPC de melhorias de uma equipe.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "NPC de melhorias definido para: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fNPC de melhorias definido para {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dDefina a posição {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Defina a posição restante:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7Posição {position} definida!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Defina o spawn das equipes, caso ainda não tenha feito isso!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Uso: /{command} {subcommand} 1 or 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Spawn de espera definido para §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aDefina o lobby principal. §fIsso é obrigatório, mas\n§fse você usar o servidor no modo §eBUNGEE\n§fo local do lobby §enão §fserá usado.\n§eDigite novamente para substituir o local de spawn antigo.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Este comando não pode ser usado em arenas. Ele serve para o lobby principal!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(não definido)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(definido)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Local do lobby definido!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Ative ou desative a verificação de prontidão.");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eEnvie uma mensagem para a arena atual");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fEnvie uma mensagem a todos os jogadores da sua arena.\n&fUse: /{command} echo <mensagem>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperador&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eEnvie uma mensagem para uma arena específica");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fEnvie uma mensagem a todos os jogadores de uma arena específica.\n&fUse: /{command} echoto <arena> <mensagem>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eEnvie uma mensagem para todas as arenas");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fEnvie uma mensagem aos jogadores de todas as arenas.\n&fUse: /{command} echoall <mensagem>");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eEncerre uma arena à força");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fEncerre uma arena sem vencedor.\n&fPermissão: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cA partida não está em andamento.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aEncerrando a partida à força...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eInicie uma arena à força");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fInicie uma arena à força.\n&fPermissão: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eReduza a contagem regressiva inicial para 5s");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fReduza a contagem regressiva inicial para 5s em uma arena.\n&fPermissão: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Alterne seu status de prontidão.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fAbre a GUI da arena.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fEntre em uma arena pelo nome ou grupo.\n&f/{command} join random - entre em uma arena aleatória.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fAltere seu idioma.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fSaia de uma arena.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fAbre a GUI de estatísticas.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fAlterne entre o modo espectador vanilla e o modo espectador do plugin.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Comandos administrativos");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eativar/ desativar");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fNenhum comando de console disponível no momento.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Você precisa definir o local do lobby primeiro!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Você não deveria estar aqui.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e veja os comandos de jogador");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fVeja os comandos de jogador.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &aComandos de {world}");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} por andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Arenas: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(NÃO DEFINIDO)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(DEFINIDO)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oOPCIONAL");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(TUDO DEFINIDO)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Restante: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(POSIÇÃO 1 NÃO DEFINIDA)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(POSIÇÃO 2 NÃO DEFINIDA)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(detectar automaticamente)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} CRIADAS)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (DEFINIDO COMO {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fDefina o local onde os jogadores\n&fvão esperar antes do jogo começar.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fFaça o lobby de espera desaparecer no início.\n&fSelecione-o como uma região do WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fDefina onde os espectadores devem surgir.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fCrie equipes com base nas cores das ilhas.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fCrie uma equipe.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fRemova uma equipe pelo nome.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fDefina o spawn de uma equipe.\n&fEquipes sem spawn definido:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fDefina o local da cama de uma equipe.\n&fVocê não precisa especificar o nome da equipe.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fDefina o NPC de uma equipe.\n&fVocê não precisa especificar o nome da equipe.\n&fEle surgirá somente quando o jogo começar.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fDefina o NPC de melhorias de uma equipe.\n&fVocê não precisa especificar o nome da equipe.\n&fEle surgirá somente quando o jogo começar.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fDefina o local onde os itens dos inimigos\n&fserão largados após abatê-los.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fAdicione um ponto de surgimento de gerador.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fFique sobre um bloco de diamante para definir o gerador de diamante.\n&fFique sobre um bloco de esmeralda para definir o gerador de esmeralda.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fAdicione um ponto de surgimento de gerador.\n&eFique em uma ilha de equipe para definir um gerador de equipe\n&fFique sobre um bloco de diamante para definir o gerador de diamante.\n&fFique sobre um bloco de esmeralda para definir o gerador de esmeralda.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fDefina o tamanho máximo da equipe.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fDefina o grupo da arena.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fAdicione a arena a um grupo.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fSalve a arena e volte ao lobby");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cFoi tentado carregar a arena {arena}, mas ela já está na fila de ativação.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cFoi tentado carregar a arena {arena}, mas ela já está ativada.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "Você não definiu nenhuma equipe para a arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cVocê deve definir pelo menos 2 equipes em: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cNão existe nenhum mapa chamado {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cCor inválida na equipe: {team} na arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} não definido para a equipe {team} em: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cNenhum gerador de diamante foi definido em: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cNenhum gerador de esmeralda foi definido em: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cO spawn de espera não foi definido em: {arena}");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Método de configuração");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lCONFIGURAÇÃO ASSISTIDA");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aConfiguração fácil e rápida!", "&7Para iniciantes e staffs preguiçosos :D", "", "&3Opções reduzidas."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lCONFIGURAÇÃO AVANÇADA");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aConfiguração detalhada!", "&7Para staffs experientes :D", "", "&3Opções avançadas."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ §7Carregando {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ §7Configuração de {arena} cancelada!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aVocê foi teletransportado para o spawn de &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&aOlá, {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fDefina o spawn de espera.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fÉ o local onde os jogadores esperarão o jogo começar.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6CLIQUE AQUI PARA DEFINIR O LOBBY DE ESPERA    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dClique para definir o spawn de espera.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eOu digite: &7/{command} para ver a lista de comandos.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fMostre a lista de comandos.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6{generator} gerador adicionado para a equipe: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6SPAWN DEFINIDO");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6CAMA DEFINIDA");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6LOJA DEFINIDA");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6MELHORIA DEFINIDA");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Drops de abate {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} DEFINIDO");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Ferro");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Ouro");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Esmeralda");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Diamante");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Equipes disponíveis: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cNão foi possível iniciar a sessão de configuração. Verifique o console.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cSuporte ao Vault ausente!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lERRO: Isto requer suporte ao Vault! Instale o plugin Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Placa salva para a arena: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Você ainda não definiu nenhuma arena!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 foi RECARREGADO! (não recarregue plugins)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lFeliz Halloween!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} xp!");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cUse: /bw echo <message>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aMensagem enviada para a arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cVocê não está em uma arena.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cUse: /bw echoto <arena> <message>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aMensagem enviada para a arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cUse: /bw echoall <message>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aMensagem enviada para todas as arenas.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena não encontrada: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cEste comando é apenas para jogadores.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aVocê está pronto!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aVocê não está mais pronto.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aTodos estão prontos! Contagem regressiva reduzida para 10 segundos!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aVerificação de prontidão ativada.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aVerificação de prontidão desativada.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cEste comando está desativado.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cVocê não está em uma partida!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cVocê não pode usar este comando agora.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cEspectadores não podem usar este comando.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aPronto");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cNão pronto");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Clique com o botão direito para ficar pronto!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Clique com o botão direito para cancelar sua prontidão!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Não há jogadores suficientes para iniciar a partida!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aModo espectador Vanilla ativado.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aModo espectador normal ativado.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cInventário cheio!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aEquipada!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Idiomas disponíveis:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Use: /lang &f&o<linguagem>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cEsta linguagem não existe!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aIdioma alterado!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cVocê não pode mudar o idioma durante a partida.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Use: /" + mainCmd + " join §o<arena/grupo>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cNão existe nenhuma arena ou grupo de arena chamado: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cEsta arena está cheia!\n&aVocê pode adquirir vantagens doando. &7&o(clique)");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cNão há nenhuma arena disponível no momento ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cPedimos desculpas, mas esta arena está cheia.\n&cSabemos que é um doador, mas esta arena já está cheia de staffs e/ou doadores.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cA sua party é muito grande para poder entrar na arena. :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cApenas o líder da party pode escolher a arena.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &eentrou (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Você agora está assistindo §9{arena}§6.\n{prefix}§eVocê pode sair da arena a qualquer momento com §c/leave§e.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cEspectadores não são permitidos nesta arena!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cJogador não encontrado!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cEste jogador não está em uma arena de bedwars!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cA arena onde o jogador está ainda não começou!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cUse: /bw tp <player>");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cNão tem partidas para você se reconectar.");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cVocê não pode mais se juntar à arena. Jogo terminou ou cama destruída.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eEntrando na arena &a{arena}&e!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &ese reconectou!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cVocê não está em uma arena!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &esaiu!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cVocê não pode fazer isso durante o jogo.");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cComando não encontrado ou você não tem permissão!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aComandos da Party:",
                "&e/party help &7- &bIrá mostrar essa mensagem",
                "&e/party invite <player> &7- &bConvida o jogador para sua party",
                "&e/party leave &7- &bSaia da sua party",
                "&e/party info &7- &bMostre os membros e o dono da party",
                "&e/party remove <player> &7- &bRemova o jogador da party",
                "&e/party promote <player> &7- &bTransfira a liderança da party",
                "&e/party accept <player> &7- &bAceite um pedido de party",
                "&e/party disband &7- &bDesfaça a party")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eUse: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&ePedido enviado para &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &econvidou você para uma party! &o&7(Clique para aceitar)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cVocê não pode se convidar!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &enão está online.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cVocê não tem solicitações de party.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eVocê já está em uma party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cSomente o dono da party pode fazer isso!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eUse: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &eentrou na party.");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cVocê não está em uma party.");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cVocê não pode sair da sua party.\n&eTente usar: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &esaiu da party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eA party foi desfeita");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Use: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &efoi removido da party.");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &enão está na sua party!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eVocê promoveu com sucesso {player} a dono");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eVocê foi promovido a dono do grupo");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} foi promovido a dono");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eO dono do grupo é: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eMembros do grupo são:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Você não está jogando!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Contagem regressiva encurtada!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Você não pode inicializar uma partida.\n§7Por favor, considere doar para obter vantagens VIP.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cVocê não pode fazer isso ainda! Aguarde mais {seconds} segundos!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cDesculpe, mas você foi expulso porque um doador entrou na arena.\n&aPor favor, considere doar para mais vantagens. &7&o(clique)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cNão há jogadores suficientes! Contagem regressiva parada!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eA arena em que você estava está reiniciando.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cJogando");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Reiniciando");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Esperando §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Iniciando §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Clique para entrar!");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Status: {status}", "&7Jogadores: &f{on}&7/&f{max}", "&7Tipo: &a{group}", "", "&aBotão esquerdo para entrar.", "&eBotão direito para assistir."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eO jogo começa em &6{time} &esegundos!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cAguardando mais jogadores...");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aCOMEÇOU");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "",
                "&e&l    Proteja sua cama e destrua as camas inimigas.",
                "&e&l      Melhore você e sua equipe coletando",
                "&e&l   Ferro, Ouro, Esmeralda e Diamante de geradores",
                "&e&l             para adquirir as melhorias.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cDesculpe, mas você não pode participar desta partida neste momento. Use o botão direito do mouse para espectar.");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cDesculpe, mas você não pode espectar esta partida neste momento. Utilize o botão esquerdo para entrar na partida.");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cDesculpe, mas precisa entrar em uma arena usando BedWarsProxy. \n&eSe você quiser configurar uma arena, certifique-se de dar a si mesmo a permissão bw.setup para que você possa entrar no servidor diretamente!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teletransportador");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Vida: &f{health}%", "&7Fome: &f{food}", "", "&7Clique para teletransportar."));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lRetornar ao lobby");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Clique com o botão direito para sair."));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aEspectando: &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cUtilize o SHIFT para sair.");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eSaindo do modo espectador!");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cO dono da party saiu e a party foi desfeita.");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eNível &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lDiamante");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lEsmeralda");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eGera em &c{seconds} &esegundos.");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}Geradores de {generatorType} &emelhorados para nível &c{tier}");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[SHOUT] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[SPECTATOR] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aVida"));

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 VOCÊ");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fRastreando: {team} &f- Distância: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[SHOUT]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[ESPECTADOR]");
        yml.addDefault(Messages.MEANING_FULL, "Lotado");
        yml.addDefault(Messages.MEANING_SHOUT, "shout");
        yml.addDefault(Messages.MEANING_NOBODY, "Ninguém");
        yml.addDefault(Messages.MEANING_NEVER, "Nunca");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Ferro");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Ferros");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Ouro");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Ouros");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Esmeralda");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Esmeraldas");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Diamante");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Diamantes");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cVocê não pode colocar blocos aqui!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cVocê só pode quebrar blocos colocados por um jogador!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cVocê não pode destruir sua própria cama!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lCAMA DESTRUIDA > {TeamColor}Cama do time {TeamName} &7foi destruida por {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cCAMA DESTRUIDA !");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fVocê não vai mais renascer!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lCAMA DESTRUIDA > &7Sua cama foi destruida por {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cVocê não pode abrir este baú porque esse time não foi eliminado!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cSua invisibilidade foi removida pois você tomou dano!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7caiu no void.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7caiu no void. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7foi jogado no void por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi jogado no void por {KillerColor}{KillerName}&7. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7desconectou em combate com {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7desconectou em combate com {KillerColor}{KillerName}&7. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7foi empurrado por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi empurrado por {KillerColor}{KillerName}&7. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7foi atingido por uma TNT de {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi atingido por uma TNT de {KillerColor}{KillerName}&7. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7foi atingido por uma TNT.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi atingido por uma TNT. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7foi morto por {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi morto por {KillerColor}{KillerName}&7. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7morreu.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7morreu. &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7foi flechado por {KillerColor}{KillerName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi flechado por {KillerColor}{KillerName}&7! &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7foi morto por pela Traça de {KillerColor}{KillerTeamName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi morto por pela Traça de {KillerColor}{KillerTeamName}&7! &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7foi morto pelo Golem do {KillerColor}{KillerTeamName}&7!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7foi morto pelo Golem do {KillerColor}{KillerTeamName}&7! &b&lKILL FINAL!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cVOCÊ MORREU!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eRenascendo em &c{time} &esegundos.");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eVocê irá renascer em &c{time} &esegundos.");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aRENASCIDO!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cVocê foi eliminado!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7está com &c{amount} &7de vida!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lFIM DE JOGO!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lVITÓRIA!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &aganhou o jogo!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lBedWars", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &l1º Assassino &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                        &l2º Assassino &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                        &l3º Assassino &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lDefenda sua cama!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lSua cama foi destruída!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bMELHORIAS DA EQUIPE,&e&lCLIQUE DIREITO");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bMELHORIAS,&e&lCLIQUE DIREITO");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bLOJA DA EQUIPE,&e&lCLIQUE DIREITO");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bLOJA,&e&lCLIQUE DIREITO");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lEQUIPE ELIMINADA > &cO time {TeamColor}{TeamName} &cfoi eliminado!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cDestruição da Cama");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fDiamante II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fDiamante III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fMorte Súbita");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fEsmeraldas II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fEsmeraldas III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Fim do jogo");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cCAMA DESTRUÍDA!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fTodas as camas foram destruídas!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lTodas as camas foram destruídas!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cMorte Súbita");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cMORTE SÚBITA: &6&b{TeamDragons} dragões do {TeamColor}{TeamName}!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Experiência BedWars recebida (Tempo de jogo).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Experiência BedWars recebida (Vitória).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Experiência BedWars recebida (Suporte da equipe).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Experiência BedWars recebida (Cama destruída).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Experiência BedWars recebida (Abate normal).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Experiência BedWars recebida (Abate final).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Moedas (Tempo de jogo).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Moedas (Vencer o jogo).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Moedas (Suporte da equipe).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Moedas (Cama destruída).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Moedas (Abate final).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Moedas (Abate normal).");

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eEstatísticas");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fBotão direito para ver estatísticas! "));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eSeletor de Arena");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fBotão direito para escolher arena."));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eSair do BedWars");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBotão direito para sair do BedWars!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eEstatísticas");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fBotão direito para ver estatísticas!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eSair da Partida");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBotão direito para sair da arena!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eTeletransportador");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eSair da Partida");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBotão direito para sair da arena!"));

        /* save default items messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8Estatísticas de {player}");
        addDefaultStatsMsg(yml, "wins", "&6Vitórias", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Perdas", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Abates", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Mortes", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Abates Finais", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Mortes Finais", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Camas Destruidas", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Primeira Partida", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Última Partida", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Partidas", "&f{gamesPlayed}");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fSeu nivel: {level}",
                "",
                "&fProgresso: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fMoedas: &a{money}",
                "",
                "&fTotal de vitórias: &a{wins}",
                "&fTotal de abates: &a{kills}",
                "", "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fMapa: &a{map}",
                "",
                "&fJogadores: &a{on}/{max}",
                "",
                "&fEsperando,&fEsperando.,&fEsperando..,&fEsperando...",
                "",
                "&fModo: &a{group}",
                "&fVersão: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Espectando",
                "&fMapa: &a{map}",
                "",
                "&fJogadores: &a{on}/{max}",
                "",
                "&fEsperando,&fEsperando.,&fEsperando..,&fEsperando...",
                "",
                "&fModo: &a{group}",
                "&fVersão: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fMapa: &a{map}",
                "",
                "&fJogadores: &a{on}/{max}",
                "",
                "&fInicio em &a{time}s",
                "",
                "&fModo: &a{group}",
                "&fVersão: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Espectando",
                "&fMapa: &a{map}",
                "",
                "&fJogadores: &a{on}/{max}",
                "",
                "&fInicio em &a{time}s",
                "",
                "&fModo: &a{group}",
                "&fVersão: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} em &a{time}",
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
                "&f{nextEvent} em &a{time}",
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
                "&f{nextEvent} em &a{time}",
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
                "&6Vencedor: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMais abates:",
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
                "&6Vencedor: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMais abates:",
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
                "&6Vencedor: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMais abates:",
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
                "&6Vencedor: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lMais abates:",
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
                "&f{nextEvent} em &a{time}",
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
                "&f{nextEvent} em &a{time}",
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
                "&f{nextEvent} em &a{time}",
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
                "&f{nextEvent} em &a{time}",
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
                "&fAbates: &a{kills}",
                "&fAbates finais: &a{finalKills}",
                "&fCamas destruídas: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} em &a{time}",
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
                "&f{nextEvent} em &a{time}",
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
                "&fAbates: &a{kills}",
                "&fAbates finais: &a{finalKills}",
                "&fCamas destruídas: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} in &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fAbates: &a{kills}",
                "&fAbates finais: &a{finalKills}",
                "&fCamas destruídas: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} em &a{time}",
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
                "&o&7Espectando {spectatorTarget}",
                "&f{nextEvent} em &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fAbates: &a{kills}",
                "&fAbates finais: &a{finalKills}",
                "&fCamas destruídas: &a{beds}",
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
                "&fHá {on} jogadores neste lobby",
                "Desenvolvido por {poweredBy},&a{serverIp}",
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
                "Aguardando mais jogadores,Aguardando mais jogadores.,Aguardando mais jogadores.., Aguardando mais jogadores...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
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
                "&7&oVocê está espectando",
                "Aguardando mais jogadores,Aguardando mais jogadores.,Aguardando mais jogadores.., Aguardando mais jogadores...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
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
                "&fComeçando em &a{time} &fsegundos,&fComeçando em &a{time} &fsegundos.,&fComeçando em &a{time} &fsegundos..,&fComeçando em &a{time} &fsegundos..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
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
                "&7&oVocê está espectando"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fComeçando em &a{time} &fsegundos,&fComeçando em &a{time} &fsegundos.,&fComeçando em &a{time} &fsegundos..,&fComeçando em &a{time} &fsegundos..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
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
                "{nextEvent} em {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fVocê está jogando no time {teamColor}{teamName}",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
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
                "{nextEvent} em {time}",
                "",
                "&7&oVocê foi eliminado,&f&oVocê foi eliminado"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fVocê jogou no time {teamColor}{teamName}",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
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
                "{nextEvent} em {time}",
                "",
                "&7&oVocê está espectando"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&fDesenvolvido por {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oEspectador "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lSeu time venceu o jogo! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lVocê venceu com o time {teamColor}&l{teamName}&6&l!,&6&lVocê venceu com o time {teamColor}&l{teamName}&6&l!,&f&lVocê venceu com o time {teamColor}&l{teamName}&f&l!",
                "&7Estatísticas desta partida",
                "&eAbates: &f{kills} &8| &eAbates finais: &f{finalKills} &8| &eCamas destruídas: &f{beds} &8| &eMortes: &f{deaths},&eAbates: &7{kills} &8| &eAbates finais: &7{finalKills} &8| &eCamas destruídas: &7{beds} &8| &eMortes: &7{deaths}",
                "",
                "&fObrigado por jogar, {player}!",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} venceu o jogo! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lVocê venceu com o time {teamColor}&l{teamName}&6&l!,&6&lVocê venceu com o time {teamColor}&l{teamName}&6&l!,&f&lVocê venceu com o time {teamColor}&l{teamName}&f&l!",
                "&7Estatísticas desta partida",
                "&eAbates: &f{kills} &8| &eAbates finais: &f{finalKills} &8| &eCamas destruídas: &f{beds} &8| &eMortes: &f{deaths},&eAbates: &7{kills} &8| &eAbates finais: &7{finalKills} &8| &eCamas destruídas: &7{beds} &8| &eMortes: &7{deaths}",
                "&fObrigado por jogar, {player}!",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oEliminado", " {level}", " &c&oEliminado"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} venceu o jogo! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fVocê perdeu com o time {teamColor}{teamName}",
                "&7Estatísticas desta partida",
                "&eAbates: &f{kills} &8| &eAbates finais: &f{finalKills} &8| &eCamas destruídas: &f{beds} &8| &eMortes: &f{deaths},&eAbates: &7{kills} &8| &eAbates finais: &7{finalKills} &8| &eCamas destruídas: &7{beds} &8| &eMortes: &7{deaths}",
                "&fObrigado por jogar, {player}!",
                "&a{serverIp}",
                "&fDesenvolvido por {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oEliminado", " {level}", " &c&oEliminado"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} venceu o jogo! &6⭐",
                "&7{date}",
                "&7Mapa: &f{map} &7Modo: &f{group}",
                "",
                "&fObrigado por jogar, {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&fDesenvolvido por {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oEspectador "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Compra rápida");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Adicionando à compra rápida...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cVocê não tem {currency} suficiente! Precisa de mais {amount}!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aVocê comprou &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cVocê já comprou isso!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Traça");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Categorias");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Itens"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bCompra rápida");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cEspaço vazio!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Este é um slot de compra rápida!", "&7Clique em um item segurando o", "&7shift para adicionar neste slot."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eClique para comprar!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cVocê não tem o suficiente de {currency}!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aMÁXIMO!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bClique + shift para por na Compra Rápida");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bClique + shift para tirar da Compra Rápida");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Blocos", "&aBlocos", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Lã", Arrays.asList("&7Preço: &f{cost} {currency}", "", "&7Ótimo para atravessar", "&7ilhas. Transforma-se na cor", "&7do seu time.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Argila Endurecida", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Bloco básico para defender sua cama.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Vidro à prova de explosão", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Imune a explosões.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Pedra do Fim", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Bloco sólido para defender sua cama.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Escada", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Útil para salvar gatos presos", "&7de arvores.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidiana", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Proteção extrema para sua cama.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Madeira", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Bloco sólido para defender sua cama.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Corpo a corpo", "&aCorpo a corpo", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Espada de Pedra", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Espada de Ferro", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Espada de Diamante", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Graveto (Repulsão I)", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&aArmadura", "&aArmadura", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armadura de Malha Permanente", Arrays.asList("&7Preço: {cost} {currency}",
                "", "&7Calças e botas de malha", "&7que você sempre irá renascer", "&7com elas.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armadura de Ferro Permanente", Arrays.asList("&7Preço: {cost} {currency}",
                "", "&7Calças e botas de ferro", "&7que você sempre irá renascer", "com elas.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armadura de Diamante Permanente", Arrays.asList("&7Preço: {cost} {currency}",
                "", "&7Calças e botas de diamante", "&7que você sempre irá renascer", "com elas.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Ferramentas", "&aFerramentas", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Tesouras Permanentes", Arrays.asList("&7Preço: {cost} {currency}",
                "", "&7Ótimo para se livrar da lã. Você", "&7sempre irá nascer com as tesouras.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Picareta {tier}", Arrays.asList("&7Preço: {cost} {currency}", "&7Nível: &e{tier}",
                "", "&7Este é um item melhorável.", "&7Ele perderá 1 nível após.", "&7você morer!", "", "&7Você vai permanentemente", "&7renascer com pelo menos o", "&7nível mais baixo.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Machado {tier}", Arrays.asList("&7Preço: {cost} {currency}", "&7Nível: &e{tier}",
                "", "&7Este é um item melhorável.", "&7Ele perderá 1 nível após.", "&7você morer!", "", "&7Você vai permanentemente", "&7renascer com pelo menos o", "&7nível mais baixo.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Arcos", "&aArcos", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Flecha", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco (Força I)", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Arco (Força I, Impacto I)", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Poções", "&aPoções", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Poção de Agilidade {level} ({duration} segundos)", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Poção de Super Pulo {level} ({duration} segundos)", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Poção de Invisibilidade ({duration} segundos)", Arrays.asList("&7Preço: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Utilidades", "&aUtilidades", Collections.singletonList("&eClique para ver!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Maça Dourada", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Cura completa.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Traça", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Gera traças onde a bola",
                "&7de neve cai para distrair seus", "&7inimigos. Dura 15 segundos.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Defesa dos Sonhos", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Golem de Ferro para defender sua",
                "&7base. Dura 4 minutos.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Bola de Fogo", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Botão direito para atirar! Ótimo para",
                "&7repelir os inimigos andando", "&7por pontes.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Explode instantaneamente, apropriado",
                "&7para explodir coisas!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Pérola do Fim", Arrays.asList("&7Preço: {cost} {currency}", "", "&7A maneira mais rápida de invadir",
                "&7a base do inimigo.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Balde de Água", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Ótimo para atrasar inimigos. Também",
                "&7protege contra TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ovo das Pontes", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Este ovo cria uma ponte na",
                "&7direção que for jogada.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Leite Mágico", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Evite acionar armadilhas por 60",
                "&7segundos após o consumo.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Esponja", Arrays.asList("&7Preço: {cost} {currency}", "", "&7Ótimo para absorver a água.",
                "", "{quick_buy}", "{buy_status}"));

        //
        yml.addDefault(Messages.MEANING_NO_TRAP, "Sem armadilha!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Preço: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Clique para comprar!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Você não tem o suficiente de {currency}.");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}DESBLOQUEADO");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} compro &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Forja de Ferro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Melhore a geração de recursos", "&7na sua base.", "", "{tier_1_color}Nível 1: +50% de recursos, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nível 2: +100% de recursos, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Nível 3: Gerar esmeraldas, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nível 4: +200% de recursos, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Forja de Ouro");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Forja de Esmeralda");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Forja Melhorada");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eCompre uma armadilha");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7As armadilhas compradas serão", "&7enfileiradas abaixo.", "", "&eClique para navegar!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Espadas Afiadas");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Seu time recebe permanentemente", "&7Afiação I em todas as espadas e", "&7machados!", "", "{tier_1_color}Preço: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Armadura Reforçada I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Sua equipe ganha permanentemente", "&7proteção em toda a armadura!", "", "{tier_1_color}Nível 1: Proteção I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nível 2: Proteção II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Nível 3: Proteção III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Nível 4: Proteção IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Armadura Reforçada II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Armadura Reforçada III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Armadura Reforçada IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Minerador Maníaco I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Todos os jogadores do seu time irão", "&7ganhar permanentemente Pressa.", "", "{tier_1_color}Nível 1: Pressa I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Nível 2: Pressa II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Minerador Maníaco II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Regeneração na Ilha");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Cria um campo de regeneração", "&7em torno de sua base!", "", "{tier_1_color}Preço: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Fortalecimento dos Dragões");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Sua equipe terá 2 dragões", "&7em vez de 1 durante a morte súbita!", "", "{tier_1_color}Preço: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Adquirível");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Fila de armadilhas"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Armadilha #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7O primeiro inimigo a andar", "&7em sua base irá acionar", "&7esta armadilha!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7A compra de uma armadilha", "&7fica nesta fila. Seu custo", "&7será com base no número", "&7de armadilhas enfileiradas.", "", "&7Próxima armadilha: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Armadilha #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7O segundo inimigo a andar", "&7em sua base irá acionar", "&7esta armadilha!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7A compra de uma armadilha", "&7fica nesta fila. Seu custo", "&7será com base no número", "&7de armadilhas enfileiradas.", "", "&7Próxima armadilha: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Armadilha #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7O terceiro inimigo a andar", "&7em sua base irá acionar", "&7esta armadilha!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7A compra de uma armadilha", "&7fica nesta fila. Seu custo", "&7será com base no número", "&7de armadilhas enfileiradas.", "", "&7Próxima armadilha: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}É uma armadilha!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Isso irá causar cegueira e lentidão", "&7durante 5 segundos nos invasores.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Armadilha Contra-ofensiva");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Concede Velocidade I por 15 segundos a", "&7jogadores aliados próximos à sua base.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Alarme");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Irá revelar jogadores invisíveis,", "&7bem como seu nome e time.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Cansaço");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Os inimigos irão receber fadiga I ao entrar", "&7na sua base com duração de 10 segundos.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aVoltar");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7Às Melhorias da Equipe"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Enfileirar uma armadilha");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cFila de armadilhas cheia!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&lA armadilha {trap} foi acionada!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cARMADILHA ACIONADA!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fSua {trap} foi acionada!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lArmadilha de alarme acionada por &7&l{player} &c&ldo time {color}&l{team}&c&l!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARME!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fAlarme acionado pelo time {color}{team}&f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNome não definido");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cDescrição não definida"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Melhorias da Equipe");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

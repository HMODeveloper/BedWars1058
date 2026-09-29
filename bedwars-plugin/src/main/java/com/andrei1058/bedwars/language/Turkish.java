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

public class Turkish extends Language {

    public Turkish() {
        super(BedWars.plugin, "tr");

        YamlConfiguration yml = getYml();
        yml.options().copyDefaults(true);
        yml.options().header("Turkish translation by https://kuzeeeyk.me [kuzeeeyk#7268 or @kuzeeeyk]");
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Türkçe");

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
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "server.properties içinde spawn-protection etkin; bu BedWars arenalarını etkileyebilir. 0 olarak ayarlanması önerilir.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "&c[BedWars1058] Multiverse-Core algılandı! Lütfen kaldırın veya BedWars haritalarına dokunmadığından emin olun!");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "&aBukkit dünyalar kapsayıcısından {world} yükleniyor.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "&aYeni bir boş harita oluşturuluyor: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7Kullanıcı ID'si: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7İndirme ID'si: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7Arena {arena} mevcut değil!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} §7şu gruba eklendi: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Grup oluşturuldu!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Arena grubu oluştur. Daha fazla ayrıntı wiki'mizde.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fVarsayılan");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Grup silindi!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eayrıntılar için tıkla");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fArena gruplarını yönet.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Bu grup zaten mevcut!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Mevcut arena grupları:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Mevcut grupları görüntüle.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Bu grup mevcut değil!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Arena grubunu kaldır. Daha fazla ayrıntı wiki'mizde.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Arena grubunu ayarla. Daha fazla ayrıntı wiki'mizde.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Şu adlı bir grup yok: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} ayarlı)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fMevcut arenaları göster");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cGösterilecek arena yok.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fO: §e{players} §fD: {status} §fYl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Başlatılmış oyunlar: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Sonraki sayfa için /§a{command} arenaList {page}§7 yaz.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Kullanım: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Artık blok yerleştirip kıramazsın!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §einşa izni");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fİnşa oturumunu etkinleştir veya devre dışı bırak \n§fböylece blok kırıp yerleştirebilirsin.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Artık blok yerleştirip kırabilirsin.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Harita yapılandırması kopyalanırken hata oluştu. Konsolu kontrol et.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Önce {arena} arenasını devre dışı bırak!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fMevcut bir arenayı klonla.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} zaten mevcut!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Tamamlandı :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Kullanım: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Onaylamak için tekrar yaz.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fBir haritayı ve yapılandırmasını sil.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Bu arena mevcut değil!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} silindi!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Kullanım: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} bir dünya klasörü olarak mevcut değil!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Bu arena zaten devre dışı!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fBir arenayı devre dışı bırak.\nDevre dışı bırakmadan önce arenadaki oyuncular \n§farenadan çıkarılır.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7Bu arenada devam eden bir oyun var, lütfen oyun bittikten sonra devre dışı bırak!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Arena devre dışı bırakılıyor...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Bu arena zaten etkin!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fBir arenayı etkinleştir.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Bu arena zaten etkinleştirme kuyruğunda!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Arena etkinleştiriliyor...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Kullanım: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eayrıntılar için tıkla");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fOyuncu seviyesini yönet.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cMiktar bir tam sayı olmalı!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cSeviye bir tam sayı olmalı!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Oyuncu bulunamadı!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Güncellemeyi görmek için oyuncunun yeniden katılması gerekebilir.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Bir oyuncunun seviyesini ayarla.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7{player} oyuncusunun seviyesi şu olarak ayarlandı: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Kullanım: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Bir oyuncuya XP ver.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{player} oyuncusuna {amount} XP verildi");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Kullanım: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Kullanmak için tıkla.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Kullanım: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Bu arena §7grubundaki oyuncu sayısı için §e{players} §7kullanabilirsin.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §bayarlandı!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §ekatılım NPC'si oluştur");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fKatılım NPC'si oluştur  \n§fDaha fazla ayrıntı için tıkla.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fKatılım NPC'si oluşturmak için bu komutu kullan.\n§fSözdizimini görmek için tıkla.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Kullanım: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fKaldırmak istediğin NPC'nin önünde dur.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Kullanım: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bYakında NPC yok.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bHenüz hiçbir NPC ayarlanmadı!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bHedef NPC kaldırıldı!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bHedef gruplar: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Arena yapılandırması: {config} yeniden yüklendi!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} yeniden yüklendi!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §emesajları yeniden yükle");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fMesajları yeniden yükle.\n§cÖnerilmez!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} yeniden yüklendi!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Zaten bir kurulum oturumundasın!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 büyük harf içeremez! Klasörünü şu şekilde yeniden adlandır: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Lütfen önce onu devre dışı bırak!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fBir arena oluştur veya düzenle.\nArena adında '_' ve '-' görüntülenmez.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} şu sembolü içeremez: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Kullanım: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lBulunan takımları oluşturmak için buraya tıkla.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fBulunan takımları oluşturmak için tıkla!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lYENİ TAKIMLAR BULUNDU:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Yeni takım bulunamadı.\n§6 ▪ §7Takımları manuel oluşturmak için: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Takımlar aranıyor. Bu gecikmeye neden olabilir.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Zaman aşımı. Takımları aramak için tekrar yaz.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fOyun başladığında bekleme lobisinin kaybolmasını istiyorsan,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lBEKLEME LOBİSİNİ KALDIRMA:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Bu adım İSTEĞE BAĞLIDIR. Atlamak için §6/{command} yaz");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fsonraki komutları bir WorldEdit seçimi gibi kullan.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Mevcut takımlar: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6YATAK AYARLANDI");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Bir takım yatağı ekle.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "{team} için yatak ayarlandı");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§a{team} için yatak ayarlandı");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fBir takım yatağı ayarla.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cBu komutu kullanırken bir yatağın üzerinde durmalısın!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cBir yatağın üzerinde durmalısın.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§f{team} için yatak ayarla");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Maksimum yapı yüksekliği Y §e{height}§7 olarak ayarlandı!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Kullanım: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Mevcut renkler: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7oluşturuldu!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7{team} takımı zaten mevcut!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Geçersiz renk!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Kullanım: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "{generator} üreticisi eklendi!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a üreticisi eklendi!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Bir takım üreticisi ekle.\nTakım otomatik olarak algılanır.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Şunu kullanmayı dene: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{team} takımı için {generator} üreticisi eklendi");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "{team} takımı için {generator} üreticisi eklendi");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6{generator}§a {team} takımı için üretici olarak §aeklendi!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (takımı otomatik algıla)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Bir takım oluşturmak istiyorsan /bw createTeam kullan.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cBu üretici zaten ayarlanmış!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cBu üretici zaten ayarlanmış!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} AYARLANDI");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Diğer kullanım: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Zümrüt/elmas üreticisi ekle.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Takım için üretici ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Bir takım üreticisi ekle.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cTakım bulunamadı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Takım için üretici ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aTakım için üretici ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Lütfen önce takımları oluştur!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cLütfen önce takımları oluştur!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6{team} öldürme ganimetleri");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Bir takım için öldürme ganimeti konumunu ayarla.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Şunun için öldürme ganimeti ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ {team} öldürme ganimetleri (ayarlamak için tıkla)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§f{team} için öldürme ganimetlerini ayarla");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Takım için öldürme ganimeti ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aTakım için öldürme ganimeti ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cKullanım: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Takım başına maksimum oyuncu ayarlandı!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Kullanım: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cYakında hiçbir takım bulunamadı.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cYakında hiçbir takım bulunamadı.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Bir kurulum oturumunda değilsin!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Yakında hiçbir üretici bulunamadı (Aralık 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cYakında hiçbir üretici bulunamadı.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "{generator} üreticisi şu konumdan kaldırıldı: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§a{generator} üreticisi kaldırıldı.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Kaldırmak istediğin üretici hologramının yakınında durmalısın.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §a{generator} üreticisi kaldırıldı.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "{team} üreticileri kaldırıldı!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "{team} {generator} üreticisi şu konumdan kaldırıldı: X:{x} Y:{y} Z:{z}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "{team} üreticisi kaldırıldı.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7{team} takımını kaldır §7(kaldırmak için tıkla)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Bu takım mevcut değil: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cTakım bulunamadı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Takım kaldırıldı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aTakım kaldırıldı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cKullanım: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Artık şunu kullanarak etkinleştirebilirsin:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aBu arenayı etkinleştir.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (etkinleştirmek için tıkla)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Arena değişiklikleri kaydedildi!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6MARKET AYARLANDI");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Bir takım marketi ayarla.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Diğer kullanım: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Market şunun için ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7{team} için market ayarla");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6DOĞMA NOKTASI AYARLANDI");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Kalan: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ §7Doğma noktası şunun için ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Takım listesi: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Şunun için doğma noktası ayarla: {team} (ayarlamak için tıkla)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§f{team} için doğma noktası ayarla");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cHedef takım bulunamadı: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cKullanım: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "İzleyici konumu ayarlandı!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cKullanım: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Ya da doğma noktasını ayarladıysan ve otomatik bulunamadıysa şunu kullanmayı dene: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cBu takım mevcut değil!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(ayarlamak için tıkla)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Önce takımın doğma noktasını ayarladığından emin ol!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fBir takım doğma noktası ayarla.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Mevcut türler: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Arena grubu şu olarak değiştirildi: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(ayarlamak için tıkla)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dArenayı {type} yapmak için tıkla");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Kullanım: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6YÜKSELTME AYARLANDI");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Bir takım için takım yükseltme NPC'si ayarla.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "Yükseltme NPC'si şunun için ayarlandı: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§f{team} için yükseltme NPC'si ayarla");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§d{position} konumunu ayarla");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Kalan konumu ayarla:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7{position} konumu ayarlandı!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Ayarlamadıysan takım doğma noktalarını ayarla!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Kullanım: /{command} {subcommand} 1 or 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Bekleme doğma noktası §e{arena}§7 için ayarlandı!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aAna lobiyi ayarla. §fBu gereklidir ancak\n§feğer sunucuyu §eBUNGEE §fmodunda kullanacaksan\n§flobi konumu §ekullanılmaz§f.\n§eEski doğma konumunu değiştirmek için tekrar yaz.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Bu komut arenalarda kullanılamaz. Ana lobi içindir!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(ayarlanmadı)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(ayarlandı)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Lobi konumu ayarlandı!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Hazır kontrolü özelliğini aç/kapat.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eBir arenayı zorla bitir");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fBir arenayı kazanan olmadan zorla bitir.\n&fİzin: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cOyun oynanmıyor.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aOyun zorla bitiriliyor...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eBir arenayı zorla başlat");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fBir arenayı zorla başlat.\n&fİzin: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &eBaşlangıç geri sayımını 5 saniyeye kısalt");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fBir arenadaki başlangıç geri sayımını 5 saniyeye kısalt.\n&fİzin: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Hazır durumunu aç/kapat.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fArena GUI'sini açar.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fBir arenaya adıyla veya grubuyla katıl.\n&f/{command} join random - rastgele arenaya katıl.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fDilini değiştir.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fArenadan ayrıl.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fİstatistik GUI'sini açar.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fVanilla izleyici modu ile eklenti izleyici modu arasında geçiş yap.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Yönetici Komutları");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eenable/ disable");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fŞu anda kullanılabilir konsol komutu yok.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Önce lobi konumunu ayarlamalısın!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Burada bulunmaman gerekiyor.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e oyuncu komutlarını görüntüle");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fOyuncu komutlarını görüntüle.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &a{world} komutları");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} - andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Arenalar: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(AYARLANMADI)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(AYARLANDI)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oİSTEĞE BAĞLI");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(HEPSİ AYARLANDI)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Kalan: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(KONUM 1 AYARLANMADI)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(KONUM 2 AYARLANMADI)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(otomatik algıla)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} OLUŞTURULDU)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (ŞU DEĞERE AYARLANDI: {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fOyuncuların oyun başlamadan önce\n&fbekleyeceği yeri ayarla.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fBekleme lobisinin başlangıçta kaybolmasını sağla.\n&fBunu bir WorldEdit bölgesi olarak seç.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fİzleyicilerin doğacağı yeri ayarla.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fAdaların renklerine göre takımlar oluştur.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fBir takım oluştur.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fBir takımı adına göre kaldır.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fBir takımın doğma noktasını ayarla.\n&fDoğma noktası ayarlanmamış takımlar:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fBir takımın yatak konumunu ayarla.\n&fTakım adını belirtmen gerekmez.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fBir takımın NPC'sini ayarla.\n&fTakım adını belirtmen gerekmez.\n&fYalnızca oyun başladığında ortaya çıkar.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fBir takımın yükseltme NPC'sini ayarla.\n&fTakım adını belirtmen gerekmez.\n&fYalnızca oyun başladığında ortaya çıkar.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fDüşmanları öldürdükten sonra eşyalarının\n&fbırakılacağı yeri ayarla.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fBir üretici doğma noktası ekle.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fElmas üreticisini ayarlamak için elmas bloğunun üzerinde dur.\n&fZümrüt üreticisini ayarlamak için zümrüt bloğunun üzerinde dur.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fBir üretici doğma noktası ekle.\n&eTakım üreticisini ayarlamak için takım adasında dur\n&fElmas üreticisini ayarlamak için elmas bloğunun üzerinde dur.\n&fZümrüt üreticisini ayarlamak için zümrüt bloğunun üzerinde dur.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fMaksimum takım boyutunu ayarla.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fArena grubunu ayarla.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fArenayı bir gruba ekle.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fArenayı kaydet ve lobiye dön");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cArena {arena} yüklenmeye çalışıldı ancak zaten etkinleştirme kuyruğunda.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cArena {arena} yüklenmeye çalışıldı ancak zaten etkin.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "{arena} arenası için hiçbir takım ayarlamadın");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&c{arena} üzerinde en az 2 takım ayarlamalısın");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&c{arena} adlı bir harita yok");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&c{arena} arenasındaki {team} takımının rengi geçersiz");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{arena} arenasındaki {team} takımı için {setting} ayarlanmadı");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&c{arena} üzerinde hiçbir Elmas üreticisi ayarlanmadı");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&c{arena} üzerinde hiçbir Zümrüt üreticisi ayarlanmadı");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&c{arena} üzerinde bekleme doğma noktası ayarlanmadı");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Bir kurulum yöntemi seç");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lYARDIMLI KURULUM");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aKolay ve hızlı kurulum!", "&7Yeni başlayan ve tembel yetkililer için :D", "", "&3Azaltılmış seçenekler."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lGELİŞMİŞ KURULUM");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aAyrıntılı kurulum!", "&7Deneyimli yetkililer için :D", "", "&3Gelişmiş seçenekler."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ &7{arena} yükleniyor");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ &7{arena} kurulumu iptal edildi!");
        yml.addDefault(Messages.SETUP_GREETING, "&aMerhaba {player}!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&a&6{arena}&a doğma noktasına ışınlandın.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fLütfen bekleme doğma noktasını ayarla.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fOyuncuların oyunun başlamasını bekleyeceği yerdir.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6BEKLEME LOBİSİNİ AYARLAMAK İÇİN BURAYA TIKLA    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dBekleme doğma noktasını ayarlamak için tıkla.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eVeya şunu yaz: &7/{command} komut listesini görmek için.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fKomut listesini göster.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6{teamColor}{team} takımı için {generator} üreticisi eklendi");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6DOĞMA NOKTASI AYARLANDI");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6YATAK AYARLANDI");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6MARKET AYARLANDI");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6YÜKSELTME AYARLANDI");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6{team} öldürme ganimetleri");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} AYARLANDI");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Demir");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Altın");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Zümrüt");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Elmas");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Mevcut takımlar: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cKurulum oturumu başlatılamadı. Lütfen konsolu kontrol et.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cVault desteği eksik!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lHATA: Bu özellik Vault desteği gerektirir! Lütfen Vault eklentisini kur!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Arena tabelası kaydedildi: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Henüz hiçbir arena ayarlamadın!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 YENİDEN YÜKLENDİ! (eklentileri yeniden yükleme)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lMutlu Cadılar Bayramı!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} XP!");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eMevcut arenaya mesaj gönder");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fMevcut arenadaki tüm oyunculara mesaj gönder.\n&fKullanım: /{command} echo <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cYetkili&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eBelirli bir arenaya mesaj gönder");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fBelirli bir arenadaki tüm oyunculara mesaj gönder.\n&fKullanım: /{command} echoto <arena> <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eTüm arenalara mesaj gönder");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fTüm arenalardaki tüm oyunculara mesaj gönder.\n&fKullanım: /{command} echoall <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cKullanım: /bw echo <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aMesaj {arena} arenasına gönderildi");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cBir arenada değilsin.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cKullanım: /bw echoto <arena> <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aMesaj {arena} arenasına gönderildi");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cKullanım: /bw echoall <mesaj>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aMesaj tüm arenalara gönderildi.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena bulunamadı: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cBu komut sadece oyuncular içindir.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aArtık hazırsın!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aArtık hazır değilsin.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aTüm oyuncular hazır! Geri sayım 10 saniyeye düşürüldü!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aHazır olma kontrolü etkinleştirildi.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aHazır olma kontrolü devre dışı bırakıldı.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cBu komut devre dışı.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cBir oyunda değilsin!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cBu komutu şu anda kullanamazsın.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cİzleyiciler bu komutu kullanamaz.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aHazır");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cHazır değil");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Hazır olmak için sağ tıkla!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Hazırlığı iptal etmek için sağ tıkla!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Oyunu başlatmak için yeterli oyuncu yok!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aVanilla izleyici moduna geçildi.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aNormal izleyici moduna geçildi.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cEnvanter dolu!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aKuşanıldı!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Mevcut diller:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Kullanım: /lang &f&o<iso>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cBu dil bulunmuyor!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aDil değiştirildi!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cOyun sırasında dili değiştiremezsin.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Kullanım: /" + mainCmd + " join §o<arena/group>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&c{name} adında bir grup veya harita bulunamadı!");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cBu harita dolu!\n&aDaha fazla özellik için bağış yapmayı düşünebilirsin. &7&o(tıkla)");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cŞu anda hiç boş harita bulunamadı ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cÜzgünüz fakat bu harita dolu.\n&cBağışçı olduğunu biliyoruz ama bu harita diğer bağışçı ya da yetkililer ile dolu.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cPartin bu harita bir takım olarak katılabilmek için çok büyük!");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cSadece parti lideri harita seçebilir.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &ekatıldı (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Şu anda §9{arena}§6 haritasını seyrediyorsun.\n{prefix}§eHaritadan ayrılmak için §c/leave§e komudunu kullanabilirsin.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cBu harita seyircilere kapalı!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cOyuncu bulunamadı!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cBu oyuncu bir haritada değil!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cOyuncunun bulunduğu haritada oyun henüz başlamadı!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cKullanım: /bw tp <username>");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cYeniden katılabilmen için bir harita bulunmuyor.");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cYeniden katılımazsın çünkü yataklar kırılmış ya da oyun bitmiş.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&a{arena}&e haritasına yeniden katılıyorsun!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &eyeniden katıldı!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cHaritada değilsin!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &eayrıldı!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cBu komutu oyun sırasında kullanamazsın!");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cBu komut bulunamadı veya yetkin yok!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aParti Komutları:",
                "&e/party help &7- &bBu mesajı yazdırır",
                "&e/party invite <player> &7- &bOyuncuyu partine davet eder",
                "&e/party leave &7- &bPartiden ayrılır",
                "&e/party info &7- &bParti üyelerini ve sahibini gösterir",
                "&e/party promote <player> &7- &bParti sahipliğini devreder",
                "&e/party remove <player> &7- &bOyuncuyu partiden kovar",
                "&e/party accept <player> &7- &bParti davetini kabul eder",
                "&e/party disband &7- &bPartiyi dağıtır")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eKullanım: &7/party invite <player>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&7{player}&6 adlı oyuncuya parti daveti gönderildi.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &eadlı oyuncu seni bir partiye davet etti! &o&7(Kabul Et)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cKendini davet edemezsin!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &eadlı oyuncu çevrimdışı!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&cKabul etmek için bir davet bulunmuyor!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eZaten bir partidesin!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cSadece parti lideri bu komutu kullanabilir.");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eKullanım: &7/party accept <player>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &eadlı oyuncu partiye katıldı!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cHerhangi bir partide değilsin!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cKendi partinden ayrılamazsın!\n&ePartiyi dağıtmayı dene: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &eadlı oyuncu partiden ayrıldı!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eParti dağıtıldı!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Kullanım: &e/party remove <player>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &eadlı oyuncu partiden kovuldu,");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &eadlı oyuncu parti üyesi değil!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&e{player}'i sahibi yaptın!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eGrup sahibi sen oldun!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} artık grup sahibi!");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&eGrup sahibi: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eGrup üyeleri:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Oyunda değilsin!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Geris sayım kısaltıldı!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Bu işlemi uygulayamazsın.\n§7VIP özellikleri için bağış yapmayı düşünebilirsin.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cŞu anda bunu yapamazsın! {seconds} saniye sonra tekrar dene.");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cÜzgünüm, bir bağışçı haritaya katılmaya çalıştığı için haritadan atıldın!\n&aDaha fazla özellik için bağış yapmayı düşünebilirsin. &7&o(tıkla)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cOyun başlamıyor! §7Yeterli oyuncu yok!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eBulunduğun harita yeniden başlatılıyor");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cOynanıyor");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Yeniden Başlatılıyor");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Bekleniyor §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Başlatılıyor §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Katılm");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Durum: {status}", "&7Oyuncular: &f{on}&7/&f{max}", "&7Tür: &a{group}", "", "&aKatılmak için sol tıkla.", "&eİzlemek için sağ tıkla."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&eOyun, &6{time} &esaniye içinde başlıyor!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cDaha fazla oyuncu bekleniyor...");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aGO");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &l&cBed&r&lWars", "",
                "&e&l    Yatağını savun ve düşman yataklarını parçala!",
                "&e&l      Üreticilerden Demir, Altın, Zümrüt ve Elmas",
                "&e&l   kazanarak yükseltmelere erişim sağla ve takımını",
                "&e&l             güçlendir. Bol şans!", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cÜzgünüm ama bu haritaya şu anda katılamazsın. Seyirci olmak için sağ tıkla.");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cÜzgünüm ama bu haritayı şu anda seyredemezsin. Katılmak için sol tıkla.");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cÜzgünüm ama BedWarsProxy kullanmalısın. \n&eEğer haritayı düzenlemek istiyorsan kendine bw.setup yetkisini vermeyi unutma!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Işınlayıcı");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Can: &f{health}%", "&7Açlık: &f{food}", "", "&7Seyretmek için sol tıkla"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lLobiye dön");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Lobiye dönmek için sol tıkla."));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&7{player} &aseyrediliyor");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cAyrılmak için eğilme tuşuna bas.");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eSeyirci modundan ayrılınıyor...");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cParti sahibi oyundan ayrıldı ve parti kapatıldı.");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eSeviye &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lElmas");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lZümrüt");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&c{seconds} &esaniye sonra üretiliyor");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Üreticileri &eSeviye &c{tier} &eoldu!");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "{level}{vPrefix}&6[GENEL] {team} &7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "{level}{vPrefix}&f{team}&7 {player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "{level}{vPrefix}&7[İZLEYİCİ] {player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aCan"));

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 SEN");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fHedef: {team} &f- Mesafe: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[HERKES]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[SEYIRCI]");
        yml.addDefault(Messages.MEANING_FULL, "Tam");
        yml.addDefault(Messages.MEANING_SHOUT, "Herkes");
        yml.addDefault(Messages.MEANING_NOBODY, "Kimse");
        yml.addDefault(Messages.MEANING_NEVER, "Asla");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Demir");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Demir");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Altın");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Altın");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Zümrüt");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Zümrüt");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Elmas");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Elmas");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "₺");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "₺");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cBuraya blok koyamazsın!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cSadece oyuncular tarafından yerleştirilen blokları kırabilirsin!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cKendi yatağını kıramazsın!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lYATAK KIRMA > {TeamColor}{TeamName} Yatak&7 {PlayerColor}{PlayerName}&7 tarafından parçalandı!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cYATAK KIRILDI");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fArtık yeniden doğamayacaksın!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lYATAK KIRILDI > &7Yatağın {PlayerColor}{PlayerName}&7 tarafından yok edildi!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cElenmemiş bir takımın sandığını açamazsın!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cHasar aldığın için artık görünmez değilsin!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7boşluğa düştü.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7boşluğa düştü. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7 adlı oyuncu {KillerColor}{KillerName}&7 tarafından boşluğa atıldı.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından boşluğa atıldı. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 ile savaşırken oyundan ayrıldı.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 ile savaşırken oyundan ayrıldı. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından uçuruldu.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından uçuruldu. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından bombalandı.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından bombalandı. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7bombalandı.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7bombalandı. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından öldürüldü.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından öldürüldü. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7öldü.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7öldü. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından ok ile vuruldu.");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerName}&7 tarafından ok ile vuruldu. &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerTeamName} Takım&7'ın Yatak Böceği tarafından katledildi!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerTeamName} Takım&7'ın Yatak Böceği tarafından katledildi! &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerTeamName} Takım&7'ın Demir Golemi tarafından katledildi!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7adlı oyuncu {KillerColor}{KillerTeamName} Takım&7'ın Demir Golemi tarafından katledildi! &b&lSON ÖLDÜRME!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cÖLDÜN!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&c{time} &esaniye sonra yeniden doğacaksın!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&e{time} &esaniye sonra yeniden doğacaksın!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aYENİDEN DOĞDUN!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cOyundan elendin!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7 adlı oyuncu &c{amount} &7cana sahip!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lOYUN BİTTİ");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lGALİBİYET!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &aoyunu kazandı!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("", "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &l&cBed&r&lWars", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &l1. Oyuncu &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue} &7öldürme",
                "&e                        &l2. Oyuncu &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue} &7öldürme",
                "&c                        &l3. Oyuncu &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue} &7öldürme", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lYatağını savun!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lYatağın kırıldı!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bTAKIM YÜKSELTMELERİ,&e&lSAĞ TIKLA");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bOYUNCU YÜKSELTMELERİ,&e&lSAĞ TIKLA");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bTAKIM MARKETİ,&e&lSAĞ TIKLA");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bEŞYA MARKETİ,&e&lSAĞ TIKLA");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lTAKIM ELENDİ > {TeamColor}{TeamName} Takım &celendi!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cYatak Kırma");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fElmas II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fElmas III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fEjderha Saldırısı");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fZümrüt II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fZümrüt III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Oyun Sonu");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cYATAK KIRMA!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fTüm yataklar parçalandı!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lTüm yataklar parçalandı!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cEjderha Saldırısı");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cEJDERHA SALDIRISI: &6&b{TeamDragons} {TeamColor}{TeamName} Ejderha!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} BedWars puanı kazanıldı (Oynama Süresi)");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} BBedWars puanı kazanıldı (Galibiyet)");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} BedWars puanı kazanıldı (Takım Yardımı)");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} BedWars puanı kazanıldı (Yatak Kırma)");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} BedWars puanı kazanıldı (Öldürme)");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} BedWars puanı kazanıldı (Son öldürme)");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Para (Oynama Süresi)");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Para (Galibiyet)");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Para (Takım Yardımı)");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Para (Yatak Kırma)");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Para (Son öldürme)");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Para (Öldürme)");

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eİstatistikler");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fİstatistiklerini görmek için sağ tıkla!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&eHarita Seçici");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fHarita seçmek için sağ tıkla!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eLobiye Dön");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fBedWars'tan ayrılmak için sağ tıkla!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eİstatistikler");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fİstatistiklerini görmek için sağ tıkla!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eLobiye Dön");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&7Lobiye dönmek için sağ tıkla!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&eIşınlayıcı");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eLobiye Dön");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fHaritadan ayrılmak için sağ tıkla!"));

        /* save default items messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8{player} İstatistikleri");
        addDefaultStatsMsg(yml, "wins", "&6Galibiyet", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Malubiyet", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Öldürme", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Ölüm", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Son Öldürme", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Son Ölüm", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Yatak Kırma", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6İlk Oyun", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Son Oyun", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Oynanan Oyun", "&f{gamesPlayed}");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fSeviyen: {level}",
                "",
                "&fİlerleme: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fPara: &a{money}",
                "",
                "&fGalibiyet: &a{wins}",
                "&fToplam Öldürme: &a{kills}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fHarita: &a{map}",
                "",
                "&fOyuncular: &a{on}/{max}",
                "",
                "&fBekleniyor,&fBekleniyor.,&fBekleniyor..,&fBekleniyor...",
                "",
                "&fTür: &a{group}",
                "&fSürüm: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7İzleniyor",
                "&fHarita: &a{map}",
                "",
                "&fOyuncular: &a{on}/{max}",
                "",
                "&fBekleniyor,&fBekleniyor.,&fBekleniyor..,&fBekleniyor...",
                "",
                "&fTür: &a{group}",
                "&fSürüm: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fHarita: &a{map}",
                "",
                "&fOyuncular: &a{on}/{max}",
                "",
                "&f&a{time}s sonra başlatılıyor",
                "",
                "&fTür: &a{group}",
                "&fSürüm: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7İzleniyor",
                "&fHarita: &a{map}",
                "",
                "&fOyuncular: &a{on}/{max}",
                "",
                "&f&a{time}s sonra başlatılıyor",
                "",
                "&fTür: &a{group}",
                "&fSürüm: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&a{time} sonra &f{nextEvent}",
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
                "&o&7İzleniyor {spectatorTarget}",
                "",
                "&a{time} sonra &f{nextEvent}",
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
                "&o&7İzleniyor {spectatorTarget}",
                "",
                "&a{time} sonra &f{nextEvent}",
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
                "&6Kazanan: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lEn Çok Öldürenler:",
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
                "&6Kazanan: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lEn Çok Öldürenler:",
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
                "&6Kazanan: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lEn Çok Öldürenler:",
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
                "&6Kazanan: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lEn Çok Öldürenler:",
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
                "&a{time} sonra &f{nextEvent}",
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
                "&o&7İzleniyor {spectatorTarget}",
                "&a{time} sonra &f{nextEvent}",
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
                "&o&7İzleniyor {spectatorTarget}",
                "&a{time} sonra &f{nextEvent}",
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
                "&a{time} sonra &f{nextEvent}",
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
                "&fÖldürme: &a{kills}",
                "&fSon Öldürme: &a{finalKills}",
                "&fYatak Kırma: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7İzleniyor {spectatorTarget}",
                "&a{time} sonra &f{nextEvent}",
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
                "&o&7İzleniyor {spectatorTarget}",
                "&a{time} sonra &f{nextEvent}",
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
                "&fÖldürme: &a{kills}",
                "&fSon Öldürme: &a{finalKills}",
                "&fYatak Kırma: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&a{time} sonra &f{nextEvent}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fÖldürme: &a{kills}",
                "&fSon Öldürme: &a{finalKills}",
                "&fYatak Kırma: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7İzleniyor {spectatorTarget}",
                "&a{time} sonra &f{nextEvent}",
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
                "&o&7İzleniyor {spectatorTarget}",
                "&a{time} sonra &f{nextEvent}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fÖldürme: &a{kills}",
                "&fSon Öldürme: &a{finalKills}",
                "&fYatak Kırma: &a{beds}",
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
                "&fBu lobide {on} oyuncu var",
                "{poweredBy} tarafından desteklenmektedir,&a{serverIp}",
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
                "Daha fazla oyuncu bekleniyor,Daha fazla oyuncu bekleniyor.,Daha fazla oyuncu bekleniyor.., Daha fazla oyuncu bekleniyor...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
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
                "&7&oİzliyorsun",
                "Daha fazla oyuncu bekleniyor,Daha fazla oyuncu bekleniyor.,Daha fazla oyuncu bekleniyor.., Daha fazla oyuncu bekleniyor...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&f&a{time} &f saniye içinde başlıyor,&f&a{time} &f saniye içinde başlıyor.,&f&a{time} &f saniye içinde başlıyor..,&f&a{time} &f saniye içinde başlıyor..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                "",
                "&7&oİzliyorsun"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&f&a{time} &f saniye içinde başlıyor,&f&a{time} &f saniye içinde başlıyor.,&f&a{time} &f saniye içinde başlıyor..,&f&a{time} &f saniye içinde başlıyor..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                "",
                "{nextEvent} {time} sonra",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&f{teamColor}{teamName} takımında oynuyorsun",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                "",
                "{nextEvent} {time} sonra",
                "",
                "&7&o&7Elendin,&f&o&7Elendin"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&f{teamColor}{teamName} takımında oynadın",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oİzleyici "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oElendi {teamColor}&o{teamName}", " {teamColor}&oElendi {vPrefix}", "{teamColor}&oElendi {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                "",
                "{nextEvent} {time} sonra",
                "",
                "&7&oİzliyorsun"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oİzleyici "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&lTakımın oyunu kazandı! &6⭐",
                "&7{date}", "&7Harita: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&l{teamColor}&l{teamName} takımında kazandın&6&l!,&6&l{teamColor}&l{teamName} takımında kazandın&6&l!,&f&l{teamColor}&l{teamName} takımında kazandın&f&l!",
                "&7Bu maçın istatistikleri",
                "&eÖldürme: &f{kills} &8| &eSon Öldürme: &f{finalKills} &8| &eKırılan yatak: &f{beds} &8| &eÖlüm: &f{deaths},&eÖldürme: &7{kills} &8| &eSon Öldürme: &7{finalKills} &8| &eKırılan yatak: &7{beds} &8| &eÖlüm: &7{deaths}",
                "",
                "&fOynadığın için teşekkürler {player}!",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} takımı oyunu kazandı! &6⭐",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&l{teamColor}&l{teamName} takımında kazandın&6&l!,&6&l{teamColor}&l{teamName} takımında kazandın&6&l!,&f&l{teamColor}&l{teamName} takımında kazandın&f&l!",
                "&7Bu maçın istatistikleri",
                "&eÖldürme: &f{kills} &8| &eSon Öldürme: &f{finalKills} &8| &eKırılan yatak: &f{beds} &8| &eÖlüm: &f{deaths},&eÖldürme: &7{kills} &8| &eSon Öldürme: &7{finalKills} &8| &eKırılan yatak: &7{beds} &8| &eÖlüm: &7{deaths}",
                "&fOynadığın için teşekkürler {player}!",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oElendi", " {level}", " &c&oElendi"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} takımı oyunu kazandı! &6⭐",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&f{teamColor}{teamName} takımında kaybettin",
                "&7Bu maçın istatistikleri",
                "&eÖldürme: &f{kills} &8| &eSon Öldürme: &f{finalKills} &8| &eKırılan yatak: &f{beds} &8| &eÖlüm: &f{deaths},&eÖldürme: &7{kills} &8| &eSon Öldürme: &7{finalKills} &8| &eKırılan yatak: &7{beds} &8| &eÖlüm: &7{deaths}",
                "&fOynadığın için teşekkürler {player}!",
                "&a{serverIp}",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oElendi", " {level}", " &c&oElendi"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ {winnerTeamColor}&l{winnerTeamName} takımı oyunu kazandı! &6⭐",
                "&7{date}",
                "&7Harita: &f{map} &7Mod: &f{group}",
                "",
                "&fOynadığın için teşekkürler {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&f{poweredBy} tarafından desteklenmektedir",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oİzleyici "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Hızlı Alım");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Hızlı Alıma ekleniyor...");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cYeteri kadar {currency} sahibi değilsin! {amount} tane daha bulmalısın!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&6{item} &asatın aldın");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cBunu zaten satın aldın!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Böcek");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Kategoriler");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Eşyalar"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bHızlı Alım");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cBoş slot!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Bu bir Hızlı Alım slotu!", "&7Buraya eşya eklemek için marketteki", "&7bir eşyaya eğilme tuşu ile tıkla!"));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eSatın almak için tıkla!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cYeteri kadar {currency} sahibi değilsin!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aEN YÜKSEK SEVİYEDE!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bHızlı Alıma eklemek için eğilerek tıkla");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bHızlı Alımdan kaldırmak için eğilerek tıkla");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Bloklar", "&aBloklar", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Yün", Arrays.asList("&7Ücret: &f{cost} {currency}", "", "&7Düşman adalara yol yapmak", "&7için ideal. Takımının",
                "&7rengine bürünür.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Kil", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Yatağını savunmak için harika.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Cam", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Patlamaları etkisiz kılar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}End Taşı", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Sert bir savunma.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Merdiven", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Ağaçlarda mahsur kalan", "&7kedileri kurtarmak için süper", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidyen", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Rakiplerin senden nefret edecek!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Tahta", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Yatak savunması için ucuz bir çözüm.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Yakın Saldırı", "&aYakın Saldırı", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Taş Kılıç", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Demir Kılıç", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Elmas Kılıç", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Çubuk (Savurma I)", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Zırh", "&aZırh", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Zincir Zırh", Arrays.asList("&7Ücret: {cost} {currency}",
                "", "&7Ölünce kaybolmayan", "&7zincir pantolon ve ayakkabı", "&7ile doğarsın.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Demir Zırh", Arrays.asList("&7Ücret: {cost} {currency}",
                "", "&7Ölünce kaybolmayan", "&7demir pantolon ve ayakkabı", "ile doğarsın.", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Elmas Zırh", Arrays.asList("&7Ücret: {cost} {currency}",
                "", "&7Ölünce kaybolmayan", "&7elmas pantolon ve ayakkabı", "ile doğarsın.", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Alet", "&8Alet", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Makas", Arrays.asList("&7Ücret: {cost} {currency}",
                "", "&7Ölünce kaybolmayan bir makas. Yünlerden", "&7kurtulmak için dört dörtlük.", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kazma {tier}", Arrays.asList("&7Ücret: {cost} {currency}", "&7Seviye: &e{tier}",
                "", "&7Bu bir yükseltilebilir eşya.", "&7Her öldüğünde", "1 seviye düşer", "", "&7Bu eşya, ölsen bile", "&7en düşük seviyesi ile", "&7üstünde kalır.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Balta {tier}", Arrays.asList("&7Ücret: {cost} {currency}", "&7Seviye: &e{tier}",
                "", "&7Bu bir yükseltilebilir eşya.", "&7Her öldüğünde", "1 seviye düşer", "", "&7Bu eşya, ölsen bile", "&7en düşük seviyesi ile", "&7üstünde kalır.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Uzun Mesafe", "&aUzun Mesafe", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Ok", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Yay", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Yay (Güç I)", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Yay (Güç I, Yumruk I)", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8İksirler", "&8İksirler", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Hız {level} İksiri ({duration} saniye)", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Zıplama Desteği {level} İksiri ({duration} saniye)", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Görünmezlik İksiri (30 saniye)", Arrays.asList("&7Ücret: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Diğer", "&8Diğer", Collections.singletonList("&eGörmek için tıkla!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Altın Elma", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Dengeli iyileştirme sağlar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Yatak Böceği", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Kartopunu attığın yerde",
                "&7rakiplerin dikkatini dağıtmak için", "&7böcekler doğurur. 15 saniye sonra kaybolur.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Demir Golem", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Takımını savunmana yardım",
                "&7eder. 4 dakika sonra kaybolur.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ateş Topu", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Sağ tıklayarak ateşle! Rakiplerinin",
                "&7yürüdükleri köprüleri patlatmak", "&7için harika bir ürün!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Direkt ateşlenir, diğer takımların",
                "&7korumaları için iyi bir çözüm", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender İncisi", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Diğer takımların adalarına",
                "&7gitmenin en hızlı yolu.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Su Kovası", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Yaklaşan düşmanları yavaşlatmak için", "&7harikadır. TNT'ye karşı da korur.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Köprü Yumurtası", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Atılan doğrultuda",
                "&7bir köprü yapar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sihirli Süt", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7İçildikten sonra 60 saniye",
                "&7boyunca düşman tuzaklarından korur.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Sünger", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Suyu yok etmenin basit bir yolu.",
                "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "Compact Pop-up Tower", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Compact Pop-up Tower", Arrays.asList("&7Ücret: {cost} {currency}", "", "&7Kompakt bir açılır", "&7kule savunması yerleştir!", "", "{quick_buy}", "{buy_status}"));
        //
        yml.addDefault(Messages.MEANING_NO_TRAP, "Tuzak yok!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Ücret: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Satın almak için tıkla!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Yeteri kadar {currency} yok!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cKİLİTLENDİ");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}KİLİT KALDIRILDI");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} adlı oyuncu &6{upgradeName} satın aldı");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Demir Ocağı");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Adanda üretilen kaynak", "&7sayısını arttırır.", "", "{tier_1_color}Seviye 1: +50% Kaynak Artışı, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Seviye 2: +100% Kaynak Artışı, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Seviye 3: Zümrüt üretir, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Seviye 4: +200% Kaynak Artışı, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Altın Ocağı");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Zümrüt Ocağı");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Mistik Ocak");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&eTuzak satın al");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Alınan tuzaklar", "&7sağda sıralanacak.", "", "&eGöz atmak için tıkla!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Keskin Kılıçlar");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Takımının kılıç ve", "&7baltalarında kalıcı olarak", "&7Keskinlik I olacak!", "", "{tier_1_color}Ücret: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Korumalı Zırh I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Takımının zırhlarında kalıcı", "&7koruma olur!", "", "{tier_1_color}Seviye 1: Koruma I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Seviye 2: Koruma II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Seviye 3: Koruma III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Seviye 4: Koruma IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Korumalı Zırh II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Korumalı Zırh III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Korumalı Zırh IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Manyak Madenci I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Takımındaki oyuncular, kalıcı", "&7Acele efektine sahip olurlar.", "", "{tier_1_color}Seviye 1: Acele I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Seviye 2: Acele II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Manyak Madenci II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Can Havuzu");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Adanda durduğun sürece", "&7canın yenilenir!", "", "{tier_1_color}Ücret: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Ejderha Güçlendirmesi");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Ejderha Saldırısı sırasında", "&7takımın 2 Ejderhaya sahip olur", "", "{tier_1_color}Ücret: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Satın Alınabilir");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Tuzak Listesi"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Tuzak #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Adana giren ilk", "&7kişi bu tuzağı", "&7aktifleştirir!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7Bu tuzağı satın almak,", "&7tuzağı sıraya ekler. Fiyat,", "&7adandaki tuzak sayısına", "&7göre belirlenir.", "", "&7Sıradaki tuzak: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Tuzak #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Adana giren ikinci", "&7kişi bu tuzağı", "&7aktifleştirir!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7Bu tuzağı satın almak,", "&7tuzağı sıraya ekler. Fiyat,", "&7adandaki tuzak sayısına", "&7göre belirlenir.", "", "&7Sıradaki tuzak: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Tuzak #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Adana giren üçüncü", "&7kişi bu tuzağı", "&7aktifleştirir!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7Bu tuzağı satın almak,", "&7tuzağı sıraya ekler. Fiyat,", "&7adandaki tuzak sayısına", "&7göre belirlenir.", "", "&7Sıradaki tuzak: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Bu bir tuzak!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&75 saniye boyunca Körlük ve", "&7Yavaşlık verir.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Karşı Saldırı Tuzağı");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Tetiklendiğinde, adandaki takım arkadaşlarına", "&7Hız efekti verir.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Alaram Tuzağı");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Görünmez oyuncuları", "&7görünür kılar.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Madenci Yorgunluğu Tuzağı");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&710 saniye boyunca", "&7Madenci Yorgunluğu verir.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aGeri");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7Takım Yükseltmelerine dön"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Tuzak Ekle");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cTuzak sırası dolu!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} tetiklendi!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cTUZAK TETİKLENDİ!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&f{trap} &ftuzağın tetiklendi!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lAlarm, {color}&l{team} &c&ltakımdaki &7&l{player} &c&ltarafından tetiklendi!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARM!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fAlarm, {color}{team} &fTakım tarafından tetiklendi!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cAd ayarlanmadı");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cAçıklama ayarlanmadı"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Takım Yükseltmeleri");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

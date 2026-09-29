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

public class Indonesia extends Language {

    public Indonesia() {
        super(BedWars.plugin, "id");

        YamlConfiguration yml = getYml();
        yml.options().copyDefaults(true);
        yml.addDefault(Messages.PREFIX, "");
        yml.addDefault("name", "Indonesia");

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

        yml.addDefault(Messages.COMMAND_MAIN, Arrays.asList("", "&2▪ &7/" + mainCmd + " stats", "&2▪ &7/" + mainCmd + " join &o<arena/grup>", "&2▪ &7/" + mainCmd + " leave", "&2▪ &7/" + mainCmd + " lang", "&2▪ &7/" + mainCmd + " gui", "&2▪ &7/" + mainCmd + " start &3(vip)", "&2▪ &7/" + mainCmd + " specmode &3(penonton)"));
        yml.addDefault(Messages.SERVER_SPAWN_PROTECTION_WARNING, "spawn-protection di server.properties aktif; ini dapat memengaruhi arena BedWars. Disarankan untuk mengaturnya ke 0.");
        yml.addDefault(Messages.SERVER_MULTIVERSE_WARNING, "Multiverse-Core terdeteksi; hapus atau pastikan plugin ini tidak mengubah map BedWars.");
        yml.addDefault(Messages.RESTORE_LOAD_WORLD, "Memuat {world} dari kontainer dunia Bukkit.");
        yml.addDefault(Messages.RESTORE_CREATE_VOID_MAP, "Membuat map kosong baru: {world}");
        yml.addDefault(Messages.CUSTOMER_DETAILS_HEADER, "&8[&f{plugin} v{version}&8]&7&m---------------------------");
        yml.addDefault(Messages.CUSTOMER_DETAILS_USER_ID, "&7ID Pengguna: &f%%__USER__%%");
        yml.addDefault(Messages.CUSTOMER_DETAILS_DOWNLOAD_ID, "&7ID Unduhan: &f%%__NONCE__%%");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ARENA_NOT_FOUND, "§c▪ §7Arena {arena} tidak ada!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ASSIGNED, "§6 ▪ §7{arena} ditambahkan ke grup: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATED, "§6 ▪ §7Grup dibuat!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_HOVER, "Buat grup arena. Detail selengkapnya ada di wiki kami.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_CREATE_USAGE, "§6 ▪ §7/{command} {subcommand} create §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DEFAULT, "§6 ▪ §fBawaan");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DELETED, "§6 ▪ §7Grup dihapus!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8- §eklik untuk melihat detail");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_DISPLAY_HOVER, "§fKelola grup arena.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_ENTRY, "§6 ▪ §f{group}");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_EXISTS, "§c▪ §7Grup ini sudah ada!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_HEADER, "§7Grup arena yang tersedia:");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_HOVER, "Lihat grup yang tersedia.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_LIST_USAGE, "§6 ▪ §7/{command} {subcommand} list");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_NOT_FOUND, "§c▪ §7Grup ini tidak ada!");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_HOVER, "Hapus grup arena. Detail selengkapnya ada di wiki kami.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_REMOVE_USAGE, "§6 ▪ §7/{command} {subcommand} remove §o<groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_HOVER, "Atur grup arena. Detail selengkapnya ada di wiki kami.");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_SET_USAGE, "§6 ▪ §7/{command} {subcommand} §r§7set §o<arenaName> <groupName>");
        yml.addDefault(Messages.COMMAND_ARENA_GROUP_UNKNOWN, "§6 ▪ §7Tidak ada grup bernama: {group}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY, "§6 ▪ §7/{command} {subcommand}{countColor}({count} diatur)");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_DISPLAY_HOVER, "§fTampilkan arena yang tersedia");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_EMPTY, "§cTidak ada arena untuk ditampilkan.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_ENTRY, "ID: §e{arena} §fG: §e{group} §fP: §e{players} §fS: {status} §fWl: §e{worldLoaded}");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_HEADER, " \n§1|| §3{plugin}§7 Permainan yang dibuat: \n ");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_NEXT_PAGE, "§7Ketik /§a{command} arenaList {page}§7 untuk halaman berikutnya.");
        yml.addDefault(Messages.COMMAND_ARENA_LIST_SPACER, " ");
        yml.addDefault(Messages.COMMAND_ARENA_USAGE, "§c▪ §7Penggunaan: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_BUILD_DISABLED, "§6 ▪ §7Kamu tidak dapat menempatkan atau menghancurkan blok lagi!");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8 - §eizin membangun");
        yml.addDefault(Messages.COMMAND_BUILD_DISPLAY_HOVER, "§fAktifkan atau nonaktifkan sesi membangun \n§fagar kamu dapat menghancurkan atau menempatkan blok.");
        yml.addDefault(Messages.COMMAND_BUILD_ENABLED, "§6 ▪ §7Sekarang kamu dapat menempatkan dan menghancurkan blok.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_COPY_ERROR, "§c▪ §7Terjadi kesalahan saat menyalin konfigurasi map. Periksa konsol.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISABLE_FIRST, "§c▪ §7Nonaktifkan {arena} terlebih dahulu!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName> <newName>");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_DISPLAY_HOVER, "§fKlon arena yang sudah ada.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_EXISTS, "§c▪ §7{arena} sudah ada!");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_SUCCESS, "§6 ▪ §7Selesai :D.");
        yml.addDefault(Messages.COMMAND_CLONE_ARENA_USAGE, "§c▪ §7Penggunaan: §o/{command} {subcommand} <mapName> <newArena>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_CONFIRM, "§6 ▪ §7Ketik lagi untuk mengonfirmasi.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_DISPLAY_HOVER, "§fHapus map beserta konfigurasinya.");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_NOT_FOUND, "§c▪ §7Arena ini tidak ada!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_SUCCESS, "§c▪ §7{arena} telah dihapus!");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_USAGE, "§c▪ §7Penggunaan: §o/{command} delArena <mapName>");
        yml.addDefault(Messages.COMMAND_DEL_ARENA_WORLD_NOT_FOUND, "§c▪ §7{arena} tidak ada sebagai folder dunia!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_ALREADY_DISABLED, "§c▪ §7Arena ini sudah dinonaktifkan!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_DISPLAY_HOVER, "§fNonaktifkan arena.\nPemain akan dikeluarkan dari arena \n§fsebelum dinonaktifkan.");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_PLAYING, "§6 ▪ §7Ada permainan yang sedang berlangsung di arena ini, nonaktifkan setelah permainan selesai!");
        yml.addDefault(Messages.COMMAND_DISABLE_ARENA_START, "§6 ▪ §7Menonaktifkan arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_ALREADY_ENABLED, "§c▪ §7Arena ini sudah diaktifkan!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY, "§6 ▪ §7/{command} {subcommand} §6<worldName>");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_DISPLAY_HOVER, "§fAktifkan arena.");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_QUEUED, "§c▪ §7Arena ini sudah berada dalam antrean pengaktifan!");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_START, "§6 ▪ §7Mengaktifkan arena...");
        yml.addDefault(Messages.COMMAND_ENABLE_ARENA_USAGE, "§c▪ §7Penggunaan: §o/{command} enableRotation <mapName>");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY, "§6 ▪ §7/{command} {subcommand} §8      - §eklik untuk melihat detail");
        yml.addDefault(Messages.COMMAND_LEVEL_DISPLAY_HOVER, "§fKelola level pemain.");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_AMOUNT, "§cJumlah harus berupa bilangan bulat!");
        yml.addDefault(Messages.COMMAND_LEVEL_INVALID_LEVEL, "§cLevel harus berupa bilangan bulat!");
        yml.addDefault(Messages.COMMAND_LEVEL_PLAYER_NOT_FOUND, "§c ▪ §7Pemain tidak ditemukan!");
        yml.addDefault(Messages.COMMAND_LEVEL_REJOIN, "§6 ▪ §7Pemain mungkin perlu masuk kembali agar perubahan terlihat.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_CONSOLE_USAGE, "§6bw level setLevel <player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_HOVER, "Atur level pemain.");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_SUCCESS, "§6 ▪ §7Level {player} diatur menjadi: {level}");
        yml.addDefault(Messages.COMMAND_LEVEL_SET_USAGE, "§6 ▪ §7Penggunaan: /bw level setLevel §o<player> <level>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_CONSOLE_USAGE, "§6bw level giveXp <player> <amount>");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_HOVER, "Berikan XP kepada pemain.");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_SUCCESS, "§6 ▪ §7{amount} XP diberikan kepada: {player}");
        yml.addDefault(Messages.COMMAND_LEVEL_XP_USAGE, "§6 ▪ §7Penggunaan: /bw level giveXp §o<player> <amount>");
        yml.addDefault(Messages.COMMAND_NPC_ADD_HOVER, "Klik untuk menggunakan.");
        yml.addDefault(Messages.COMMAND_NPC_ADD_USAGE, "§f\n§c▪ §7Penggunaan: §e§o/{command} {subcommand} add <skin> <arenaGroup> <§7line1§9\\n§7line2§e>\n§7Gunakan §e{players} §7untuk jumlah pemain di §7grup arena ini.");
        yml.addDefault(Messages.COMMAND_NPC_CREATED, "§a§c▪ §bNPC: {name} §btelah diatur!");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY, "§6 ▪ §7/{command} {subcommand}         §8   - §ebuat NPC bergabung");
        yml.addDefault(Messages.COMMAND_NPC_DISPLAY_HOVER, "§fBuat NPC bergabung  \n§fKlik untuk detail selengkapnya.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_HOVER, "§fGunakan perintah ini untuk membuat NPC bergabung.\n§fKlik untuk melihat sintaks.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_ADD_USAGE, "§f\n§c▪ §7Penggunaan: §e/{command} {subcommand} add");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_HOVER, "§fBerdirilah di depan NPC untuk menghapusnya.");
        yml.addDefault(Messages.COMMAND_NPC_MAIN_REMOVE_USAGE, "§c▪ §7Penggunaan: §e/{command} {subcommand} remove");
        yml.addDefault(Messages.COMMAND_NPC_NONE_NEARBY, "§c▪ §bTidak ada NPC di dekat sini.");
        yml.addDefault(Messages.COMMAND_NPC_NONE_SET, "§c▪ §bBelum ada NPC yang diatur!");
        yml.addDefault(Messages.COMMAND_NPC_REMOVED, "§c▪ §bNPC yang dituju telah dihapus!");
        yml.addDefault(Messages.COMMAND_NPC_TARGET_GROUPS, "§a§c▪ §bGrup tujuan: §6{groups}");
        yml.addDefault(Messages.COMMAND_RELOAD_ARENA, "§6 ▪ §7Konfigurasi arena: {config} dimuat ulang!");
        yml.addDefault(Messages.COMMAND_RELOAD_CONFIG, "§6 ▪ §7{config} dimuat ulang!");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY, "§6 ▪ §7/{command} {subcommand}       §8 - §emuat ulang pesan");
        yml.addDefault(Messages.COMMAND_RELOAD_DISPLAY_HOVER, "§fMuat ulang pesan.\n§cTidak disarankan!");
        yml.addDefault(Messages.COMMAND_RELOAD_LANGUAGE, "§6 ▪ §7{language} dimuat ulang!");
        yml.addDefault(Messages.COMMAND_SETUP_ALREADY_IN_SESSION, "§c ▪ §7Kamu sudah berada dalam sesi pengaturan!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_CAPITALS, "§c▪ §c{arena}§7 tidak boleh mengandung huruf kapital! Ganti nama folder menjadi: §a{lowercase}");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISABLE_FIRST, "§c▪ §7Nonaktifkan terlebih dahulu!");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY, "§6 ▪ §7/{command} setupArena §6<worldName>");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_DISPLAY_HOVER, "§fBuat atau edit arena.\n'_' dan '-' tidak akan ditampilkan dalam nama arena.");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_SYMBOL, "§c▪ §7{arena} tidak boleh mengandung simbol ini: §c+");
        yml.addDefault(Messages.COMMAND_SETUP_ARENA_USAGE, "§c▪ §7Penggunaan: §o/{command} {subcommand} <mapName>");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM, "§6 ▪ §7§lKlik di sini untuk membuat tim yang ditemukan.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_CONFIRM_HOVER, "§fKlik untuk membuat tim yang ditemukan!");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_ENTRY, "§f ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_FOUND_HEADER, "§6§lTIM BARU DITEMUKAN:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_NONE, "§6 ▪ §7Tidak ada tim baru yang ditemukan.\n§6 ▪ §7Buat tim secara manual dengan: §6/{command} createTeam");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_SEARCH, "§6 ▪ §7Mencari tim. Ini dapat menyebabkan lag.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_TIMEOUT, "§c ▪ §7Waktu habis. Ketik lagi untuk mencari tim.");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_DESCRIPTION, "§fJika kamu ingin lobi menghilang saat permainan dimulai,");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_HEADER, "§6§lPENGHAPUSAN LOBI MENUNGGU:");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_OPTIONAL, "§7Langkah ini OPSIONAL. Untuk melewatinya, lakukan §6/{command}");
        yml.addDefault(Messages.COMMAND_SETUP_AUTO_TEAMS_WAITING_SELECTION, "§fgunakan perintah berikut seperti memilih wilayah dengan WorldEdit.");
        yml.addDefault(Messages.COMMAND_SETUP_AVAILABLE_TEAMS, "Tim yang tersedia: ");
        yml.addDefault(Messages.COMMAND_SETUP_BED_HOLOGRAM, "{team} §6KASUR DIATUR");
        yml.addDefault(Messages.COMMAND_SETUP_BED_MANUAL_HOVER, "Tambahkan kasur tim.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET, "Kasur diatur untuk: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SET_TITLE, "§aKasur diatur untuk: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BED_SPAWN_HOVER, "§fAtur kasur tim.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED, "§cKamu harus berdiri di atas kasur saat menggunakan perintah ini!");
        yml.addDefault(Messages.COMMAND_SETUP_BED_STAND_ON_BED_TITLE, "§cKamu harus berdiri di atas kasur.");
        yml.addDefault(Messages.COMMAND_SETUP_BED_TEAM_HOVER, "§fAtur kasur untuk {team}");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_SET, "§6 ▪ §7Ketinggian bangunan maksimum Y diatur ke §e{height}§7!");
        yml.addDefault(Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE, "§c▪ §7Penggunaan: /{command} setMaxBuildHeight <int>");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_COLORS, "§6 ▪ §7Warna yang tersedia: {colors}");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_CREATED, "§6 ▪ §7{team} §7dibuat!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_EXISTS, "§c▪ §7Tim {team} sudah ada!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_INVALID_COLOR, "§c▪ §7Warna tidak valid!");
        yml.addDefault(Messages.COMMAND_SETUP_CREATE_TEAM_USAGE, "§c▪ §7Penggunaan: /{command} createTeam §o<name> §o<color>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED, "Generator {generator} telah ditambahkan!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADDED_TITLE, "§6{generator}§a generator ditambahkan!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_HOVER, "Tambahkan generator tim.\nTim akan dideteksi secara otomatis.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_AUTO_USAGE, "/bw addGenerator <iron/ gold/ upgrade>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HINT, "Coba gunakan: /bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_HOLOGRAM, "§6{generator} generator ditambahkan untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_SET, "Generator {generator} ditambahkan untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_TITLE, "§6{generator}§a generator untuk {team}§a telah ditambahkan!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_ADVANCED_USAGE, "/bw addGenerator <iron/ gold/ upgrade> <team>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_AUTO_USAGE, "/bw addGenerator (deteksi tim secara otomatis)");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_CREATE_TEAM_HINT, "Gunakan: /bw createTeam jika ingin membuatnya.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS, "§cGenerator ini sudah diatur!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_EXISTS_TITLE, "§cGenerator ini sudah diatur!");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_HOLOGRAM, "§6{generator} DIATUR");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HINT, "Penggunaan lain: /bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_OTHER_HOVER, "Tambahkan generator zamrud dan berlian.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_RESOURCE_USAGE, "/bw addGenerator <emerald/ diamond>");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOLOGRAM, "§6Generator diatur untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_HOVER, "Tambahkan generator tim.");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_NOT_FOUND, "§cTidak dapat menemukan tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET, "Generator diatur untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_SET_TITLE, "§aGenerator diatur untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_GENERATOR_TEAM_USAGE, "/bw addGenerator <team>");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS, "Buat tim terlebih dahulu!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_CREATE_TEAMS_TITLE, "§cBuat tim terlebih dahulu!");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOLOGRAM, "§6Drop pembunuhan {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_HOVER, "Atur lokasi drop pembunuhan untuk tim.");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_SET, "Drop pembunuhan diatur untuk: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_ENTRY, "§6 ▪ Drop pembunuhan {team} (klik untuk mengatur)");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_HOVER, "§fAtur drop pembunuhan untuk {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET, "Drop pembunuhan diatur untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_TEAM_SET_TITLE, "§aDrop pembunuhan diatur untuk tim: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_KILL_DROPS_USAGE, "§cPenggunaan: /{command} setKillDrops <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_SET, "§6 ▪ §7Maksimum anggota tim diatur!");
        yml.addDefault(Messages.COMMAND_SETUP_MAX_IN_TEAM_USAGE, "§c▪ §7Penggunaan: /{command} setMaxInTeam <int>");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND, "§cTidak dapat menemukan tim di dekat sini.");
        yml.addDefault(Messages.COMMAND_SETUP_NEARBY_TEAM_NOT_FOUND_TITLE, "§cTidak dapat menemukan tim di dekat sini.");
        yml.addDefault(Messages.COMMAND_SETUP_NOT_IN_SESSION, "§c ▪ §7Kamu tidak berada dalam sesi pengaturan!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND, "Tidak dapat menemukan generator di dekat sini (jangkauan 2x2).");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_NOT_FOUND_TITLE, "§cTidak dapat menemukan generator di dekat sini.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_AT, "Generator {generator} di lokasi X:{x} Y:{y} Z:{z} dihapus");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_REMOVED_TITLE, "§aGenerator {generator} dihapus.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_STAND_CLOSE, "Kamu harus berdiri dekat hologram generator yang ingin dihapus.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_GENERATOR_REMOVED_TITLE, "{team} §aGenerator {generator} dihapus.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED, "Generator {team} telah dihapus!");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_AT, "Generator {generator} {team} di lokasi X:{x} Y:{y} Z:{z} dihapus");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_GENERATOR_TEAM_REMOVED_TITLE, "Generator {team} dihapus.");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_HOVER, "§7Hapus {team} §7(klik untuk menghapus)");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND, "Tim ini tidak ada: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_NOT_FOUND_TITLE, "§cTim tidak ditemukan: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS, "Tim dihapus: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_SUCCESS_TITLE, "§aTim dihapus: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_REMOVE_TEAM_USAGE, "§cPenggunaan: /{command} removeTeam <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HINT, "Sekarang kamu dapat mengaktifkannya dengan:");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_HOVER, "§aAktifkan arena ini.");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_ENABLE_OPTION, "§6/{command} enableArena {arena}§7 (klik untuk mengaktifkan)");
        yml.addDefault(Messages.COMMAND_SETUP_SAVE_SUCCESS, "Perubahan arena disimpan!");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOLOGRAM, "{team} §6TOKO DIATUR");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_HOVER, "Atur toko tim.");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_OTHER_USAGE, "Penggunaan lain: /bw setShop <teamName>");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_SET, "Toko diatur untuk: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SHOP_TEAM_HOVER, "§7Atur toko untuk {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_HOLOGRAM, "{team} §6SPAWN DIATUR");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_REMAINING, "Tersisa: {teams}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_SET, "§6 ▪ Spawn diatur untuk: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAMS_HEADER, "Daftar tim: ");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_ENTRY, "Atur spawn untuk: {team} (klik untuk mengatur)");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_HOVER, "§fAtur spawn untuk {team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_TEAM_NOT_FOUND, "§cTidak dapat menemukan tim tujuan: §c{team}");
        yml.addDefault(Messages.COMMAND_SETUP_SPAWN_USAGE, "§cPenggunaan: /{command} setSpawn <team>");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_SET, "Lokasi penonton diatur!");
        yml.addDefault(Messages.COMMAND_SETUP_SPECTATOR_USAGE, "§cPenggunaan: /{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_ENTRY, "§6 ▪ {team}");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_MANUAL_HINT, "Atau jika spawn sudah diatur tetapi tidak ditemukan otomatis, coba gunakan: /bw {subcommand} <team>");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_NOT_FOUND, "§cTim ini tidak ada!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SELECT_ENTRY, "§6 ▪ {team} §7(klik untuk mengatur)");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SET_SPAWN_FIRST, "Pastikan spawn tim sudah diatur terlebih dahulu!");
        yml.addDefault(Messages.COMMAND_SETUP_TEAM_SPAWN_HOVER, "§fAtur spawn tim.");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_AVAILABLE, "§9Jenis yang tersedia: ");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_CHANGED, "§6 ▪ §7Grup arena diubah menjadi: §d{type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION, "§1 ▪ §e{type} §7(klik untuk mengatur)");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_OPTION_HOVER, "§dKlik untuk menjadikan arena {type}");
        yml.addDefault(Messages.COMMAND_SETUP_TYPE_USAGE, "§9 ▪ §7Penggunaan: {command} {subcommand} <type>");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOLOGRAM, "{team} §6PENINGKATAN DIATUR");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_HOVER, "Atur NPC peningkatan tim untuk sebuah tim.");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_SET, "NPC peningkatan diatur untuk: {team}");
        yml.addDefault(Messages.COMMAND_SETUP_UPGRADE_TEAM_HOVER, "§fNPC peningkatan diatur untuk {team}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION, "§c ▪ §7/{command} waitingPos {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_OPTION_HOVER, "§dAtur posisi {position}");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_REMAINING, "§c ▪ §7Atur posisi yang tersisa:");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_SET, "§6 ▪ §7Posisi {position} diatur!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_TEAMS_REMINDER, "§6 ▪ §7Atur spawn tim jika belum!");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_POS_USAGE, "§c▪ §7Penggunaan: /{command} {subcommand} 1 atau 2");
        yml.addDefault(Messages.COMMAND_SETUP_WAITING_SPAWN_SET, "§6 ▪ §7Spawn menunggu diatur untuk §e{arena}§7!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY, "§6 ▪ §7/{command} setLobby{status}");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_DISPLAY_HOVER, "§aAtur lobi utama. §fIni wajib, tetapi\n§fjika server akan digunakan dalam mode §eBUNGEE§f,\n§flokasi lobi §etidak §fakan digunakan.\n§eKetik lagi untuk mengganti lokasi spawn lama.");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_IN_ARENA, "§6 ▪ §4Perintah ini tidak dapat digunakan di arena. Perintah ini ditujukan untuk lobi utama!");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_NOT_SET, " §c(belum diatur)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SET, " §a(diatur)");
        yml.addDefault(Messages.COMMAND_SET_LOBBY_SUCCESS, "§6 ▪ §7Lokasi lobi diatur!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISPLAY, "§e/bw toggleReady §7- Aktifkan atau nonaktifkan fitur pemeriksaan kesiapan.");
        yml.addDefault(Messages.COMMAND_ECHO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eKirim pesan ke arena saat ini");
        yml.addDefault(Messages.COMMAND_ECHO_HOVER, "&fKirim pesan ke semua pemain di arena saat ini.\n&fGunakan: /{command} echo <pesan>");
        yml.addDefault(Messages.COMMAND_ECHO_PREFIX, "&8[&cOperator&8] &f");
        yml.addDefault(Messages.COMMAND_ECHOTO_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eKirim pesan ke arena tertentu");
        yml.addDefault(Messages.COMMAND_ECHOTO_HOVER, "&fKirim pesan ke semua pemain di arena tertentu.\n&fGunakan: /{command} echoto <arena> <pesan>");
        yml.addDefault(Messages.COMMAND_ECHOALL_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8- &eKirim pesan ke semua arena");
        yml.addDefault(Messages.COMMAND_ECHOALL_HOVER, "&fKirim pesan ke semua pemain di semua arena.\n&fGunakan: /{command} echoall <pesan>");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &ePaksa akhiri arena");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER, "&fPaksa akhiri arena tanpa pemenang.\n&fIzin: &c{permission}");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING, "&cPermainan sedang tidak berlangsung.");
        yml.addDefault(Messages.COMMAND_FORCE_END_GAME_SUCCESS, "&aMengakhiri permainan secara paksa...");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &ePaksa mulai arena");
        yml.addDefault(Messages.COMMAND_FORCE_START_DISPLAY_HOVER, "&fPaksa mulai arena.\n&fIzin: &c{permission}");
        yml.addDefault(Messages.COMMAND_START_DISPLAY, "&6 ▪ &7/{command} {subcommand} &8 - &ePersingkat hitung mundur mulai menjadi 5 detik");
        yml.addDefault(Messages.COMMAND_START_DISPLAY_HOVER, "&fPersingkat hitung mundur mulai menjadi 5 detik di arena.\n&fIzin: &c{permission}");
        yml.addDefault(Messages.COMMAND_READY_DISPLAY, "&e/{command} {subcommand} &7- Aktifkan atau nonaktifkan status siap.");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_GUI_DISPLAY_HOVER, "&fMembuka GUI arena.");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY, "&6 ▪ &7/{command} {subcommand} &e<random/ arena/ groupName>");
        yml.addDefault(Messages.COMMAND_JOIN_DISPLAY_HOVER, "&fBergabung ke arena berdasarkan nama atau grup.\n&f/{command} join random - bergabung ke arena acak.");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LANG_DISPLAY_HOVER, "&fGanti bahasamu.");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_LEAVE_DISPLAY_HOVER, "&fTinggalkan arena.");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY, "&6 ▪ &7/{command} {subcommand}");
        yml.addDefault(Messages.COMMAND_STATS_DISPLAY_HOVER, "&fMembuka GUI statistik.");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY, "&6 ▪ &7/{command} specmode");
        yml.addDefault(Messages.COMMAND_SPEC_MODE_DISPLAY_HOVER, "&fBeralih antara mode penonton vanilla dan mode penonton plugin.");
        yml.addDefault(Messages.COMMAND_ADMIN_HEADER, "&8&l{dot} &6{plugin} v{version} &7- &c Perintah Admin");
        yml.addDefault(Messages.COMMAND_CONSOLE_SAFEMODE, "&f   bw safemode &eenable/ disable");
        yml.addDefault(Messages.COMMAND_CONSOLE_NO_COMMANDS, "&fBelum ada perintah konsol yang tersedia.");
        yml.addDefault(Messages.COMMAND_LOBBY_NOT_SET, "&c❌ &7Kamu harus mengatur lokasi lobi terlebih dahulu!");
        yml.addDefault(Messages.ARENA_UNEXPECTED_PLAYER_KICK, "Kamu seharusnya tidak berada di sini.");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY, "&6 ▪ &7/{command} {subcommand}         &8 - &e lihat perintah pemain");
        yml.addDefault(Messages.COMMAND_LIST_DISPLAY_HOVER, "&fLihat perintah pemain.");
        yml.addDefault(Messages.COMMAND_LIST_SETUP_HEADER, "&7&l{dot}&6{plugin} v{version}&7- &a{world} commands");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS, "&9&l{dot} &6{plugin} &7v{version} oleh andrei1058");
        yml.addDefault(Messages.COMMAND_LIST_CREDITS_HOVER, "&7Arena: {arenaColor}{arenas}");
        yml.addDefault(Messages.COMMAND_LIST_NOT_SET, "&c(BELUM DIATUR)");
        yml.addDefault(Messages.COMMAND_LIST_SET, "&a(DIATUR)");
        yml.addDefault(Messages.COMMAND_LIST_OPTIONAL, "&7&oOPSIONAL");
        yml.addDefault(Messages.COMMAND_LIST_ALL_SET, "&a(SEMUA DIATUR)");
        yml.addDefault(Messages.COMMAND_LIST_REMAINING, "&c(Tersisa: {remaining}&c)");
        yml.addDefault(Messages.COMMAND_LIST_POS1_NOT_SET, "&c(POS 1 BELUM DIATUR)");
        yml.addDefault(Messages.COMMAND_LIST_POS2_NOT_SET, "&c(POS 2 BELUM DIATUR)");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_SPAWN, "{dot}{strike}setWaitingSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_WAITING_POS, "{dot}{strike}waitingPos 1/2&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPAWN, "{dot}{strike}setSpawn <teamName>&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_BED, "{dot}{strike}setBed&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_SHOP, "{dot}{strike}setShop&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_KILL_DROPS, "{dot}{strike}setKillDrops&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_SET_UPGRADE, "{dot}{strike}setUpgrade&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_ADD_GENERATOR, "{dot}addGenerator {remaining}&e(&2E{iron} &bD{gold}&e)");
        yml.addDefault(Messages.COMMAND_LIST_SET_SPECTATOR_SPAWN, "{dot}{strike}setSpectSpawn&r {status}");
        yml.addDefault(Messages.COMMAND_LIST_AUTO_CREATE_TEAMS, "{dot}autoCreateTeams &e(deteksi otomatis)");
        yml.addDefault(Messages.COMMAND_LIST_CREATE_TEAM, "{dot}createTeam <name> <color> &e({teams} DIBUAT)");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_TEAM, "{dot}removeTeam <name>");
        yml.addDefault(Messages.COMMAND_LIST_REMOVE_GENERATOR, "{dot}removeGenerator");
        yml.addDefault(Messages.COMMAND_LIST_SET_MAX_IN_TEAM, "{dot}setMaxInTeam <int> (DIATUR KE {size})");
        yml.addDefault(Messages.COMMAND_LIST_ARENA_GROUP, "{dot}arenaGroup {group}");
        yml.addDefault(Messages.COMMAND_LIST_SET_TYPE, "{dot}setType <type> {group}");
        yml.addDefault(Messages.COMMAND_LIST_SAVE, "{dot}save");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_SPAWN, "&fAtur tempat pemain\n&fmenunggu sebelum permainan dimulai.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_WAITING_POS, "&fBuat lobi menunggu menghilang saat mulai.\n&fPilih sebagai wilayah WorldEdit.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SPECTATOR_SPAWN, "&fAtur tempat munculnya penonton.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_AUTO_CREATE_TEAMS, "&fBuat tim berdasarkan warna pulau.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_CREATE_TEAM, "&fBuat tim.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_REMOVE_TEAM, "&fHapus tim berdasarkan nama.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SPAWN, "&fAtur spawn tim.\n&fTim yang spawn-nya belum diatur:\n{spawnNames}");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_BED, "&fAtur lokasi kasur tim.\n&fKamu tidak perlu menentukan nama tim.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_SHOP, "&fAtur NPC tim.\n&fKamu tidak perlu menentukan nama tim.\n&fNPC hanya muncul saat permainan dimulai.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_UPGRADE, "&fAtur NPC peningkatan tim.\n&fKamu tidak perlu menentukan nama tim.\n&fNPC hanya muncul saat permainan dimulai.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_KILL_DROPS, "&fAtur lokasi untuk menjatuhkan\n&fbarang musuh setelah kamu membunuhnya.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ADVANCED, "&fTambahkan titik spawn generator.\n&e/{command} addGenerator <Iron/ Gold/ Emerald, Diamond>\n&fBerdirilah di blok berlian untuk mengatur generator berlian.\n&fBerdirilah di blok zamrud untuk mengatur generator zamrud.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ADD_GENERATOR_ASSISTED, "&fTambahkan titik spawn generator.\n&eBerdiamlah di pulau tim untuk mengatur generator tim\n&fBerdirilah di blok berlian untuk mengatur generator berlian.\n&fBerdirilah di blok zamrud untuk mengatur generator zamrud.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_MAX_IN_TEAM, "&fAtur ukuran maksimum tim.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_ARENA_GROUP, "&fAtur grup arena.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SET_TYPE, "&fTambahkan arena ke sebuah grup.");
        yml.addDefault(Messages.COMMAND_LIST_HOVER_SAVE, "&fSimpan arena dan kembali ke lobi");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_QUEUED, "&cPercobaan memuat arena {arena} gagal karena sudah berada dalam antrean pengaktifan.");
        yml.addDefault(Messages.ARENA_LOAD_ALREADY_ENABLED, "&cPercobaan memuat arena {arena} gagal karena sudah diaktifkan.");
        yml.addDefault(Messages.ARENA_LOAD_NO_TEAMS, "Kamu belum mengatur tim apa pun untuk arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_NOT_ENOUGH_TEAMS, "&cKamu harus mengatur setidaknya 2 tim di: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WORLD_MISSING, "&cTidak ada map bernama {arena}");
        yml.addDefault(Messages.ARENA_LOAD_INVALID_TEAM_COLOR, "&cWarna tidak valid pada tim: {team} di arena: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_TEAM_SETTING_MISSING, "&c{setting} belum diatur untuk tim {team} di: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_DIAMOND_GENERATOR_MISSING, "&cBelum ada generator Berlian yang diatur di: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_EMERALD_GENERATOR_MISSING, "&cBelum ada generator Zamrud yang diatur di: {arena}");
        yml.addDefault(Messages.ARENA_LOAD_WAITING_SPAWN_MISSING, "&cSpawn menunggu belum diatur di: {arena}");
        yml.addDefault(Messages.SETUP_GUI_TITLE, "&8Pilih metode pengaturan");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_NAME, "&e&lPENGATURAN TERBANTU");
        yml.addDefault(Messages.SETUP_GUI_ASSISTED_LORE, Arrays.asList("", "&aPengaturan yang mudah dan cepat!", "&7Untuk pemula dan staf yang malas :D", "", "&3Pilihan yang lebih sedikit."));
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_NAME, "&c&lPENGATURAN LANJUTAN");
        yml.addDefault(Messages.SETUP_GUI_ADVANCED_LORE, Arrays.asList("", "&aPengaturan terperinci!", "&7Untuk staf berpengalaman :D", "", "&3Pilihan lanjutan."));
        yml.addDefault(Messages.SETUP_LOADING, "&6 ▪ §7Memuat {arena}");
        yml.addDefault(Messages.SETUP_CANCELLED, "&6 ▪ §7Pengaturan {arena} dibatalkan!");
        yml.addDefault(Messages.SETUP_TELEPORTED, "&aKamu diteleportasi ke spawn &6{arena}&a.");
        yml.addDefault(Messages.SETUP_GREETING, "&aHalo {player}!");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_PROMPT, "&fAtur spawn menunggu.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_EXPLANATION, "&fIni adalah tempat pemain menunggu permainan dimulai.");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_CLICK, "&9     ▪     &6KLIK DI SINI UNTUK MENGATUR LOBI MENUNGGU    &9 ▪");
        yml.addDefault(Messages.SETUP_WAITING_SPAWN_HOVER, "&dKlik untuk mengatur spawn menunggu.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HINT, "&eAtau ketik: &7/{command} untuk melihat daftar perintah.");
        yml.addDefault(Messages.SETUP_COMMAND_LIST_HOVER, "&fTampilkan daftar perintah.");
        yml.addDefault(Messages.SETUP_TEAM_GENERATOR_MARKER, "&6Generator {generator} ditambahkan untuk tim: {teamColor}{team}");
        yml.addDefault(Messages.SETUP_TEAM_SPAWN_MARKER, "{teamColor}{team} &6SPAWN DIATUR");
        yml.addDefault(Messages.SETUP_TEAM_BED_MARKER, "{teamColor}{team} &6KASUR DIATUR");
        yml.addDefault(Messages.SETUP_TEAM_SHOP_MARKER, "{teamColor}{team} &6TOKO DIATUR");
        yml.addDefault(Messages.SETUP_TEAM_UPGRADE_MARKER, "{teamColor}{team} &6PENINGKATAN DIATUR");
        yml.addDefault(Messages.SETUP_TEAM_KILL_DROPS_MARKER, "&6Drop pembunuhan {team}");
        yml.addDefault(Messages.SETUP_GENERATOR_MARKER, "&6{generator} DIATUR");
        yml.addDefault(Messages.SETUP_GENERATOR_IRON, "Besi");
        yml.addDefault(Messages.SETUP_GENERATOR_GOLD, "Emas");
        yml.addDefault(Messages.SETUP_GENERATOR_EMERALD, "Zamrud");
        yml.addDefault(Messages.SETUP_GENERATOR_DIAMOND, "Berlian");
        yml.addDefault(Messages.SETUP_AVAILABLE_TEAMS, "Tim yang tersedia: ");
        yml.addDefault(Messages.SETUP_START_FAILED, "&cTidak dapat memulai sesi pengaturan. Periksa konsol.");
        yml.addDefault(Messages.VAULT_SUPPORT_MISSING, "&cDukungan Vault tidak tersedia!");
        yml.addDefault(Messages.SHOP_VAULT_REQUIRED, "&4&lKESALAHAN: Ini memerlukan dukungan Vault! Silakan pasang plugin Vault!");
        yml.addDefault(Messages.SIGN_SAVED, "&a▪ &7Papan tanda disimpan untuk arena: {arena}");
        yml.addDefault(Messages.SIGN_NO_ARENAS, "&c▪ &7Kamu belum mengatur arena apa pun!");
        yml.addDefault(Messages.PLUGIN_RELOAD_KICK, "BedWars1058 telah DIMUAT ULANG! (jangan muat ulang plugin)");
        yml.addDefault(Messages.SHOP_HALLOWEEN_PUMPKIN_NAME, "&6&lSelamat Halloween!");
        yml.addDefault(Messages.HALLOWEEN_COBWEB_XP, "&6+{xp} XP!");
        yml.addDefault(Messages.COMMAND_ECHO_USAGE, "{prefix}&cGunakan: /bw echo <pesan>");
        yml.addDefault(Messages.COMMAND_ECHO_SENT, "{prefix}&aPesan terkirim ke arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHO_NOT_IN_ARENA, "{prefix}&cKamu tidak berada di arena.");
        yml.addDefault(Messages.COMMAND_ECHOTO_USAGE, "{prefix}&cGunakan: /bw echoto <arena> <pesan>");
        yml.addDefault(Messages.COMMAND_ECHOTO_SENT, "{prefix}&aPesan terkirim ke arena {arena}");
        yml.addDefault(Messages.COMMAND_ECHOALL_USAGE, "{prefix}&cGunakan: /bw echoall <pesan>");
        yml.addDefault(Messages.COMMAND_ECHOALL_SENT, "{prefix}&aPesan terkirim ke semua arena.");
        yml.addDefault(Messages.COMMAND_ARENA_NOT_FOUND, "{prefix}&cArena tidak ditemukan: {arena}");
        yml.addDefault(Messages.COMMAND_NOT_PLAYER, "{prefix}&cPerintah ini hanya untuk pemain.");
        yml.addDefault(Messages.COMMAND_READY_SUCCESS, "{prefix}&aKamu sekarang siap!");
        yml.addDefault(Messages.COMMAND_UNREADY_SUCCESS, "{prefix}&aKamu tidak siap lagi.");
        yml.addDefault(Messages.COMMAND_READY_COUNTDOWN_SHORTENED, "{prefix}&aSemua pemain siap! Hitung mundur dipersingkat menjadi 10 detik!");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_ENABLED, "{prefix}&aFitur pemeriksaan kesiapan diaktifkan.");
        yml.addDefault(Messages.COMMAND_TOGGLE_READY_DISABLED, "{prefix}&aFitur pemeriksaan kesiapan dinonaktifkan.");
        yml.addDefault(Messages.COMMAND_READY_DISABLED, "{prefix}&cPerintah ini dinonaktifkan.");
        yml.addDefault(Messages.COMMAND_READY_NOT_IN_GAME, "{prefix}&cKamu tidak berada dalam permainan!");
        yml.addDefault(Messages.COMMAND_READY_NOT_WAITING, "{prefix}&cKamu tidak dapat menggunakan perintah ini sekarang.");
        yml.addDefault(Messages.COMMAND_READY_SPECTATOR, "{prefix}&cPenonton tidak dapat menggunakan perintah ini.");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_READY, "&aSiap");
        yml.addDefault(Messages.COMMAND_READY_ITEM_NAME_NOT_READY, "&cBelum Siap");
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_READY, Arrays.asList("&7Klik kanan untuk bersiap!"));
        yml.addDefault(Messages.COMMAND_READY_ITEM_LORE_NOT_READY, Arrays.asList("&7Klik kanan untuk membatalkan kesiapan!"));
        yml.addDefault(Messages.COMMAND_START_NOT_ENOUGH_PLAYERS, "&c▪ &7Pemain tidak cukup untuk memulai permainan!");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA, "{prefix}&aBeralih ke mode penonton Vanilla.");
        yml.addDefault(Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL, "{prefix}&aBeralih ke mode penonton normal.");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_INVENTORY_SPACE, "{prefix}&cInventaris penuh!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_ARMOR, "&aTerpasang!");
        yml.addDefault(Messages.COMMAND_LANG_LIST_HEADER, "{prefix} &2Bahasa Tersedia:");
        yml.addDefault(Messages.COMMAND_LANG_LIST_FORMAT, "&a▪  &7{iso} - &f{name}");
        yml.addDefault(Messages.COMMAND_LANG_USAGE, "{prefix}&7Gunakan: /lang &f&o<bahasa>");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_NOT_EXIST, "{prefix}&cBahasa ini tidak tersedia!");
        yml.addDefault(Messages.COMMAND_LANG_SELECTED_SUCCESSFULLY, "{prefix}&aBahasa terganti!");
        yml.addDefault(Messages.COMMAND_LANG_USAGE_DENIED, "{prefix}&cAnda tidak bisa ganti bahasa saat dalam permainan.");
        yml.addDefault(Messages.COMMAND_JOIN_USAGE, "§a▪ §7Gunakan: /" + mainCmd + " join §o<arena/grup>");
        yml.addDefault(Messages.COMMAND_JOIN_GROUP_OR_ARENA_NOT_FOUND, "{prefix}&cTidak ada arena atau group yang bernama: {name}");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL, "{prefix}&cArena tersebut penuh!\n&aSilakan pertimbangkan untuk menyumbang untuk lebih banyak fitur. &7&o(klik)");
        yml.addDefault(Messages.COMMAND_JOIN_NO_EMPTY_FOUND, "{prefix}&cTidak ada arena yang tersedia untuk sekarang ;(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_IS_FULL_OF_VIPS, "{prefix}&cKami meminta maaf tapi arena sedang penuh.\n&cKami tahu Anda seorang donatur tetapi sebenarnya arena ini penuh dengan staf atau/dan donatur.");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_PARTY_TOO_BIG, "{prefix}&cParty anda terlalu ramai untuk memasuki arena sebagai team :(");
        yml.addDefault(Messages.COMMAND_JOIN_DENIED_NOT_PARTY_LEADER, "{prefix}&cHanya pemimpin yang dapat memilih arena.");
        yml.addDefault(Messages.COMMAND_JOIN_PLAYER_JOIN_MSG, "{prefix}&7{player} &etelah masuk (&b{on}&e/&b{max}&e)!");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_MSG, "{prefix}§6Kamu sekarang menonton §9{arena}§6.\n{prefix}§eKamu bisa keluar arena kapan pun dengan cara §c/leave§e.");
        yml.addDefault(Messages.COMMAND_JOIN_SPECTATOR_DENIED_MSG, "&cPenonton tidak diperbolehkan di arena tersebut!");
        yml.addDefault(Messages.COMMAND_TP_PLAYER_NOT_FOUND, "{prefix}&cPemain tidak ditemukan!");
        yml.addDefault(Messages.COMMAND_TP_NOT_IN_ARENA, "{prefix}&cPlayer tersebut tidak ada di arena!");
        yml.addDefault(Messages.COMMAND_TP_NOT_STARTED, "{prefix}&cArena dimana player tersebut berada belum dimulai!");
        yml.addDefault(Messages.COMMAND_TP_USAGE, "{prefix}&cGunakan: /bw tp <nama pengguna>");
        yml.addDefault(Messages.REJOIN_NO_ARENA, "{prefix}&cTidak ada arena untuk bergabung kembali!");
        yml.addDefault(Messages.REJOIN_DENIED, "{prefix}&cKamu tidak dapat bergabung ke arena kembali. Pertandingan selesai atau bed kamu telah dihancurkan.");
        yml.addDefault(Messages.REJOIN_ALLOWED, "{prefix}&eMemasuki arena &a{arena}&e!");
        yml.addDefault(Messages.COMMAND_REJOIN_PLAYER_RECONNECTED, "{prefix}&7{player} &etelah terhubung kembali!");
        yml.addDefault(Messages.COMMAND_LEAVE_DENIED_NOT_IN_ARENA, "{prefix}&cKamu sedang tidak di arena!");
        yml.addDefault(Messages.COMMAND_LEAVE_MSG, "{prefix}&7{player} &etelah keluar!");
        yml.addDefault(Messages.COMMAND_NOT_ALLOWED_IN_GAME, "{prefix}&cAnda tidak dapat melakukan ini selama pertandingan.");
        yml.addDefault(Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS, "{prefix}&cPerintah tidak ditemukan atau Anda tidak memiliki izin!");
        yml.addDefault(Messages.COMMAND_PARTY_HELP, Arrays.asList("&6▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&aPerintah Party:",
                "&e/party help &7- &bCetak pesan bantuan ini",
                "&e/party invite <player> &7- &bMengundang pemain ke party Anda",
                "&e/party leave &7- &bMeninggalkan party yang anda masuki",
                "&e/party info &7- &bTampilkan anggota dan pemilik party",
                "&e/party promote <player> &7- &bAlihkan kepemilikan party",
                "&e/party remove <player> &7- &bKeluarkan pemain dari party",
                "&e/party accept <player> &7- &bTerima undangan party",
                "&e/party disband &7- &bBubarkan party")
        );
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_USAGE, "{prefix}&eGunakan: &7/party invite <pemain>");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT, "{prefix}&eUndangan dikirim kepada &7{player}&6.");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_SENT_TARGET_RECEIVE_MSG, "{prefix}&b{player} &etelah mengundangmu ke party! &o&7(Klik untuk menerima)");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_CANNOT_INVITE_YOURSELF, "{prefix}&cKamu tidak dapat mengundang diri anda sendiri!");
        yml.addDefault(Messages.COMMAND_PARTY_INVITE_DENIED_PLAYER_OFFLINE, "{prefix}&7{player} &esedang offline!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_NO_INVITE, "{prefix}&eTidak ada undangan party yang perlu kamu terima!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_DENIED_ALREADY_IN_PARTY, "{prefix}&eKamu sedang berada di party!");
        yml.addDefault(Messages.COMMAND_PARTY_INSUFFICIENT_PERMISSIONS, "{prefix}&cHanya pemilik party yang dapat melakukan ini!");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_USAGE, "{prefix}&eGunakan: &7/party accept <pemain>");
        yml.addDefault(Messages.COMMAND_PARTY_ACCEPT_SUCCESS, "{prefix}&7{player} &etelah memasuki party!");
        yml.addDefault(Messages.COMMAND_PARTY_GENERAL_DENIED_NOT_IN_PARTY, "{prefix}&cKamu tidak berada di party!");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_DENIED_IS_OWNER_NEEDS_DISBAND, "{prefix}&cKamu tidak dapat keluar dari party kamu sendiri!\n&eCoba gunakan: &b/party disband");
        yml.addDefault(Messages.COMMAND_PARTY_LEAVE_SUCCESS, "{prefix}&7{player} &etelah keluar party!");
        yml.addDefault(Messages.COMMAND_PARTY_DISBAND_SUCCESS, "{prefix}&eParty dibubarkan!");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_USAGE, "{prefix}&7Gunakan: &e/party remove <pemain>");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_SUCCESS, "{prefix}&7{player} &etelah dikeluarkan dari party,");
        yml.addDefault(Messages.COMMAND_PARTY_REMOVE_DENIED_TARGET_NOT_PARTY_MEMBER, "{prefix}&7{player} &etidak ada di party!");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_SUCCESS, "{prefix}&eKamu telah menjadikan {player} pemilik party");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_OWNER, "{prefix}&eKamu telah menjadi pemilik party");
        yml.addDefault(Messages.COMMAND_PARTY_PROMOTE_NEW_OWNER, "{prefix}&7 &e{player} telah menjadi pemilik party");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_OWNER, "\n{prefix}&ePemilik party: &7{owner}");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYERS,"{prefix}&eAnggota party:");
        yml.addDefault(Messages.COMMAND_PARTY_INFO_PLAYER, "&7{player}");
        yml.addDefault(Messages.COMMAND_FORCESTART_NOT_IN_GAME, "§c▪ §7Kamu sedang tidak bermain!");
        yml.addDefault(Messages.COMMAND_FORCESTART_SUCCESS, "§c▪ §7Hitung mundur dipersingkat!");
        yml.addDefault(Messages.COMMAND_FORCESTART_NO_PERM, "{prefix}&7Anda tidak dapat memaksa memulai arena.\n§7Harap pertimbangkan untuk menyumbang untuk fitur VIP.");
        yml.addDefault(Messages.COMMAND_COOLDOWN, "&cAnda belum bisa melakukannya! Tunggu {seconds} detik lagi!");
        yml.addDefault(Messages.ARENA_JOIN_VIP_KICK, "{prefix}&cMaaf, tapi Anda dikeluarkan karena donatur bergabung ke arena.\n&aHarap pertimbangkan untuk menyumbang untuk lebih banyak fitur. &7&o(klik)");
        yml.addDefault(Messages.ARENA_START_COUNTDOWN_STOPPED_INSUFF_PLAYERS_CHAT, "{prefix}§cTidak ada cukup pemain! Hitung mundur dihentikan!");
        yml.addDefault(Messages.ARENA_RESTART_PLAYER_KICK, "{prefix}&eArena tempat Anda berada sedang dimulai ulang.");
        yml.addDefault(Messages.ARENA_STATUS_PLAYING_NAME, "&cBermain");
        yml.addDefault(Messages.ARENA_STATUS_RESTARTING_NAME, "&4Memulai Kembali");
        yml.addDefault(Messages.ARENA_STATUS_WAITING_NAME, "&2Menunggu §c{full}");
        yml.addDefault(Messages.ARENA_STATUS_STARTING_NAME, "&6Mulai §c{full}");
        yml.addDefault(Messages.ARENA_GUI_INV_NAME, "&8Klik untuk bergabung!");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_NAME, "&a&l{name}");
        yml.addDefault(Messages.ARENA_GUI_ARENA_CONTENT_LORE, Arrays.asList("", "&7Status: {status}", "&7Pemain: &f{on}&7/&f{max}", "&7Tipe: &a{group}", "", "&aKlik Kiri untuk bergabung.", "&eKlik Kanan untuk menonton."));
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_NAME, "&r{serverIp}");
        yml.addDefault(Messages.ARENA_GUI_SKIPPED_ITEM_LORE, Collections.emptyList());
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CHAT, "{prefix}&ePermainan dimulai dalam &6{time} &edetik!");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE, "&a{second}");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-5", "&e❺");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-4", "&e❹");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-3", "&c❸");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-2", "&c❷");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_SUB_TITLE + "-1", "&c❶");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_TITLE, " ");
        yml.addDefault(Messages.ARENA_STATUS_START_COUNTDOWN_CANCELLED_SUB_TITLE, "&cMenunggu lebih banyak pemain..");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TITLE, "&aMULAI");
        yml.addDefault(Messages.ARENA_STATUS_START_PLAYER_TUTORIAL, Arrays.asList("&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lPerang Kasur", "",
                "&e&l    Lindungi kasur Anda dan hancurkan kasur musuh.",
                "&e&l  Tingkatkan diri Anda dan tim Anda dengan mengumpulkan",
                "&e&l   Besi, Emas, Zamrud, dan Berlian dari generator",
                "&e&l   untuk mendapatkan akses peningkatan yang kuat.", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.ARENA_JOIN_DENIED_SELECTOR, "{prefix}&cMaaf, tetapi sementara Anda tidak dapat bergabung ke arena tersebut. Gunakan Klik Kanan untuk menonton!");
        yml.addDefault(Messages.ARENA_SPECTATE_DENIED_SELECTOR, "{prefix}&cMaaf tapi sementara kamu tidak bisa menonton arena ini. Gunakan Klik Kiri untuk bergabung!");
        yml.addDefault(Messages.ARENA_JOIN_DENIED_NO_PROXY, "&cMaaf, tetapi Anda harus bergabung ke arena menggunakan BedWarsProxy. \n&eJika Anda ingin menyiapkan arena, pastikan untuk memberi diri Anda izin bw.setup sehingga Anda dapat bergabung dengan server secara langsung!");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_NAME, "&8Teleporter");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_NAME, "{teamColor}{team} - {vPrefix}{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_TELEPORTER_GUI_HEAD_LORE, Arrays.asList("&7Hati: &f{health}%", "&7Bar Kelaparan: &f{food}", "", "&7Klik kiri untuk menonton!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_NAME, "&c&lKembali ke lobi");
        yml.addDefault(Messages.ARENA_SPECTATOR_LEAVE_ITEM_LORE, Collections.singletonList("&7Klik kanan untuk keluar ke lobi!"));
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_TITLE, "&aMenonton &7{player}");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_ENTER_SUBTITLE, "&cSNEAK untuk keluar");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_TITLE, "&eKeluar dari mode Penonton");
        yml.addDefault(Messages.ARENA_SPECTATOR_FIRST_PERSON_LEAVE_SUBTITLE, "");
        yml.addDefault(Messages.ARENA_LEAVE_PARTY_DISBANDED, "{prefix}§cPemilik party telah pergi dan party itu dibubarkan!");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIER, "&eTingkat &c{tier}");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_DIAMOND, "&b&lBerlian");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TYPE_EMERALD, "&a&lZamrud");
        yml.addDefault(Messages.GENERATOR_HOLOGRAM_TIMER, "&eMuncul dalam &c{seconds} &edetik");
        yml.addDefault(Messages.GENERATOR_UPGRADE_CHAT_ANNOUNCEMENT, "{prefix}{generatorType} Generator &etelah ditingkatkan ke Tingkat &c{tier}");
        yml.addDefault(Messages.FORMATTING_CHAT_LOBBY, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_WAITING, "{level}{vPrefix}&7{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SHOUT, "&6[SHOUT] {team} {level}{vPrefix}&7{player}&f{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_TEAM, "&f{team} {level}{vPrefix}&7{player}{vSuffix} {message}");
        yml.addDefault(Messages.FORMATTING_CHAT_SPECTATOR, "&7[PENONTON] {level}{vPrefix}{player}{vSuffix}: {message}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_HEALTH, Arrays.asList("&c❤", "&aKesehatan"));

        yml.addDefault(Messages.FORMATTING_SCOREBOARD_DATE, "dd/MM/yy");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_GENERIC, "{TeamColor}{TeamLetter}&f {TeamName}: {TeamStatus}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ELIMINATED, "&c&l✘");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_BED_DESTROYED, "&a{remainingPlayers}");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_TEAM_ALIVE, "&a&l✓");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_NEXEVENT_TIMER, "mm:ss");
        yml.addDefault(Messages.FORMATTING_SCOREBOARD_YOUR_TEAM, "&7 KAMU");
        yml.addDefault(Messages.FORMATTING_ACTION_BAR_TRACKING, "&fMelacak: {team} &f- Jarak: {distance}m");
        yml.addDefault(Messages.FORMATTING_TEAM_WINNER_FORMAT, "      {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_SOLO_WINNER_FORMAT, "                 {TeamColor}{TeamName} &7- {members}");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER1, "I");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER2, "II");
        yml.addDefault(Messages.FORMATTING_GENERATOR_TIER3, "III");
        yml.addDefault(Messages.FORMATTING_DESPAWNABLE_UTILITY_NPC_HEALTH, "▮ ");
        yml.addDefault(Messages.FORMATTING_STATS_DATE_FORMAT, "yyyy/MM/dd HH:mm");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_TEAM, "{TeamColor}[{TeamName}]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SHOUT, "&6[SHOUT]");
        yml.addDefault(Messages.FORMAT_PAPI_PLAYER_TEAM_SPECTATOR, "&7[PENONTON]");
        yml.addDefault(Messages.MEANING_FULL, "Penuh");
        yml.addDefault(Messages.MEANING_SHOUT, "shout");
        yml.addDefault(Messages.MEANING_NOBODY, "Bukan Siapa Siapa");
        yml.addDefault(Messages.MEANING_NEVER, "Tidak Pernah");
        yml.addDefault(Messages.MEANING_IRON_SINGULAR, "Besi");
        yml.addDefault(Messages.MEANING_IRON_PLURAL, "Besi");
        yml.addDefault(Messages.MEANING_GOLD_SINGULAR, "Emas");
        yml.addDefault(Messages.MEANING_GOLD_PLURAL, "Emas");
        yml.addDefault(Messages.MEANING_EMERALD_SINGULAR, "Zamrud");
        yml.addDefault(Messages.MEANING_EMERALD_PLURAL, "Zamrud");
        yml.addDefault(Messages.MEANING_DIAMOND_SINGULAR, "Berlian");
        yml.addDefault(Messages.MEANING_DIAMOND_PLURAL, "Berlian");
        yml.addDefault(Messages.MEANING_VAULT_SINGULAR, "$");
        yml.addDefault(Messages.MEANING_VAULT_PLURAL, "$");
        yml.addDefault(Messages.INTERACT_CANNOT_PLACE_BLOCK, "{prefix}&cAnda tidak dapat menempatkan blok di sini!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_BLOCK, "{prefix}&cAnda hanya dapat memecahkan blok yang ditempatkan oleh pemain!");
        yml.addDefault(Messages.INTERACT_CANNOT_BREAK_OWN_BED, "&cAnda tidak dapat menghancurkan kasur Anda sendiri!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT, "\n&f&lPENGHANCURAN KASUR > {TeamColor}{TeamName} Kasur &7telah dihancurkan oleh {PlayerColor}{PlayerName}&7!\n");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_TITLE_ANNOUNCEMENT, "&cKASUR HANCUR!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_SUBTITLE_ANNOUNCEMENT, "&fAnda tidak akan respawn kembali!");
        yml.addDefault(Messages.INTERACT_BED_DESTROY_CHAT_ANNOUNCEMENT_TO_VICTIM, "&f&lPENGHANCURKAN KASUR N > &7Kasur Anda telah dihancurkan oleh {PlayerColor}{PlayerName}&7!");
        yml.addDefault(Messages.INTERACT_CHEST_CANT_OPEN_TEAM_ELIMINATED, "&cAnda tidak dapat membuka peti ini karena tim ini belum tereliminasi!");
        yml.addDefault(Messages.INTERACT_INVISIBILITY_REMOVED_DAMGE_TAKEN, "&cAnda tidak lagi tidak terlihat karena terkena serangan!");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_REGULAR_KILL, "{PlayerColor}{PlayerName} &7jatuh ke void.");
        yml.addDefault(Messages.PLAYER_DIE_VOID_FALL_FINAL_KILL, "{PlayerColor}{PlayerName} &7jatuh ke void. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_REGULAR_KILL, "{PlayerColor}{PlayerName} &7terlempar ke dalam void oleh {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_IN_VOID_FINAL_KILL, "{PlayerColor}{PlayerName} &7terlempar ke dalam void oleh {KillerColor}{KillerName}&7. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_REGULAR, "{PlayerColor}{PlayerName} &7terputus saat bertarung dengan {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_LOG_OUT_FINAL, "{PlayerColor}{PlayerName} &7terputus saat bertarung dengan {KillerColor}{KillerName}&7. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_REGULAR_KILL, "{PlayerColor}{PlayerName} &7didorong oleh {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_KNOCKED_BY_FINAL_KILL, "{PlayerColor}{PlayerName} &7didorong oleh {KillerColor}{KillerName}&7. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_REGULAR_KILL, "{PlayerColor}{PlayerName} &7terkena bom cinta dari {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITH_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7terkena bom cinta dari {KillerColor}{KillerName}&7. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_REGULAR, "{PlayerColor}{PlayerName} &7terkena bom.");
        yml.addDefault(Messages.PLAYER_DIE_EXPLOSION_WITHOUT_SOURCE_FINAL_KILL, "{PlayerColor}{PlayerName} &7terkena bom. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_PVP_REGULAR_KILL, "{PlayerColor}{PlayerName} &7dibunuh oleh {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_PVP_FINAL_KILL, "{PlayerColor}{PlayerName} &7dibunuh oleh {KillerColor}{KillerName}&7. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_REGULAR, "{PlayerColor}{PlayerName} &7mati.");
        yml.addDefault(Messages.PLAYER_DIE_UNKNOWN_REASON_FINAL_KILL, "{PlayerColor}{PlayerName} &7mati. &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_REGULAR, "{PlayerColor}{PlayerName} &7ditembak oleh {KillerColor}{KillerName}&7.");
        yml.addDefault(Messages.PLAYER_DIE_SHOOT_FINAL_KILL, "{PlayerColor}{PlayerName} &7ditembak oleh {KillerColor}{KillerName}&7! &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_REGULAR, "{PlayerColor}{PlayerName} &7dibunuh oleh {KillerColor}BedBug si {KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_DEBUG_FINAL_KILL, "{PlayerColor}{PlayerName} &7dibunuh oleh {KillerColor}{KillerTeamName}'s &7BedBug! &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_REGULAR, "{PlayerColor}{PlayerName} &7dibunuh oleh {KillerColor}Iron Golem si {KillerTeamName}!");
        yml.addDefault(Messages.PLAYER_DIE_IRON_GOLEM_FINAL_KILL, "{PlayerColor}{PlayerName} &7dibunuh oleh {KillerColor}Iron Golem si {KillerTeamName}! &b&lPEMBUNUHAN TERAKHIR!");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_DIAMOND, "{prefix}&b+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_EMERALD, "{prefix}&a+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_IRON, "{prefix}&f+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_REWARD_GOLD, "{prefix}&6+{amount} {meaning}");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_TITLE, "&cKAMU MATI!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_SUBTITLE, "&eAnda akan muncul kembali dalam &c{time} &edetik!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWN_CHAT, "{prefix}&eAnda akan muncul kembali dalam &c{time} &edetik!");
        yml.addDefault(Messages.PLAYER_DIE_RESPAWNED_TITLE, "&aMUNCUL KEMBALI!");
        yml.addDefault(Messages.PLAYER_DIE_ELIMINATED_CHAT, "{prefix}&cKamu telah dieliminasi!");
        yml.addDefault(Messages.PLAYER_HIT_BOW, "{prefix}{TeamColor}{PlayerName} &7berada di &c{amount} &7HP!");
        yml.addDefault(Messages.GAME_END_GAME_OVER_PLAYER_TITLE, "&c&lPERMAINAN SELESAI!");
        yml.addDefault(Messages.GAME_END_VICTORY_PLAYER_TITLE, "&6&lKEMENANGAN!");
        yml.addDefault(Messages.GAME_END_TEAM_WON_CHAT, "{prefix}{TeamColor}{TeamName} &atelah memenangkan permainan!");
        yml.addDefault(Messages.GAME_END_TOP_PLAYER_CHAT, Arrays.asList("",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬",
                "&f                                   &lPerang Kasur", "", "{winnerFormat}", "", "",
                "&6                      &6⭐ &lPembunuh Pertama &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&e                        &lPembunuh Kedua &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}",
                "&c                        &lPembunuh Ketiga &7- {topTeamColor}{topPlayerDisplayName} &7- &l{topValue}", "",
                "&a▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"));
        yml.addDefault(Messages.BED_HOLOGRAM_DEFEND, "&c&lPertahankan Kasur Anda!");
        yml.addDefault(Messages.BED_HOLOGRAM_DESTROYED, "&c&lKasur anda telah dihancurkan!");
        yml.addDefault(Messages.NPC_NAME_TEAM_UPGRADES, "&bPENINGKATAN TIM,&e&lKLIK KANAN");
        yml.addDefault(Messages.NPC_NAME_SOLO_UPGRADES, "&bPENINGKATAN INDIVIDU,&e&lKLIK KANAN");
        yml.addDefault(Messages.NPC_NAME_TEAM_SHOP, "&bTOKO TIM,&e&lKLIK KANAN");
        yml.addDefault(Messages.NPC_NAME_SOLO_SHOP, "&bTOKO BARANG,&e&lKLIK KANAN");
        yml.addDefault(Messages.TEAM_ELIMINATED_CHAT, "\n&f&lTIM ELIMINASI > {TeamColor}Tim {TeamName} &ctelah dieliminasi!\n");
        yml.addDefault(Messages.NEXT_EVENT_BEDS_DESTROY, "&cPenghancuran Kasur");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_II, "&fBerlian II");
        yml.addDefault(Messages.NEXT_EVENT_DIAMOND_UPGRADE_III, "&fBerlian III");
        yml.addDefault(Messages.NEXT_EVENT_DRAGON_SPAWN, "&fKematian Mendadak");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_II, "&fZamrud II");
        yml.addDefault(Messages.NEXT_EVENT_EMERALD_UPGRADE_III, "&fZamrud III");
        yml.addDefault(Messages.NEXT_EVENT_GAME_END, "&4Permainan Berakhir");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_BEDS_DESTROYED, "&cKASUR HANCUR!");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_BEDS_DESTROYED, "&fSemua kasur telah dihancurkan!");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_BEDS_DESTROYED, "&c&lSemua kasur telah dihancurkan!");
        yml.addDefault(Messages.NEXT_EVENT_TITLE_ANNOUNCE_SUDDEN_DEATH, "&cKematian Mendadak");
        yml.addDefault(Messages.NEXT_EVENT_SUBTITLE_ANNOUNCE_SUDDEN_DEATH, "");
        yml.addDefault(Messages.NEXT_EVENT_CHAT_ANNOUNCE_SUDDEN_DEATH, "&cKEMATIAN MENDADAK: &6&b{TeamDragons} {TeamColor}Naga {TeamName}!");
        yml.addDefault(Messages.XP_REWARD_PER_MINUTE, "{prefix}&6+{xp} Pengalaman BedWars diterima (Waktu bermain).");
        yml.addDefault(Messages.XP_REWARD_WIN, "{prefix}&6+{xp} Pengalaman BedWars diterima (Memenangkan permainan).");
        yml.addDefault(Messages.XP_REWARD_PER_TEAMMATE, "{prefix}&6+{xp} Pengalaman BedWars diterima (Dukungan tim).");
        yml.addDefault(Messages.XP_REWARD_BED_DESTROY, "{prefix}&6+{xp} Pengalaman BedWars diterima (Menghancurkan kasur).");
        yml.addDefault(Messages.XP_REWARD_REGULAR_KILL, "{prefix}&6+{xp} Pengalaman BedWars diterima (Pembunuhan biasa).");
        yml.addDefault(Messages.XP_REWARD_FINAL_KILL, "{prefix}&6+{xp} Pengalaman BedWars diterima (Pembunuhan terakhir).");

        yml.addDefault(Messages.MONEY_REWARD_PER_MINUTE, "{prefix}&6+{money} Koin (Waktu Bermain).");
        yml.addDefault(Messages.MONEY_REWARD_WIN, "{prefix}&6+{money} Koin (Memenangkan Permainan).");
        yml.addDefault(Messages.MONEY_REWARD_PER_TEAMMATE, "{prefix}&6+{money} Koin (Dukungan Tim).");
        yml.addDefault(Messages.MONEY_REWARD_BED_DESTROYED, "{prefix}&6+{money} Koin (Menghancurkan Kasur).");
        yml.addDefault(Messages.MONEY_REWARD_FINAL_KILL, "{prefix}&6+{money} Koin (Pembunuhan Terakhir).");
        yml.addDefault(Messages.MONEY_REWARD_REGULAR_KILL, "{prefix}&6+{money} Koin (Pembunuhan Biasa).");

        /* Lobby Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "stats"), "&eStatistik");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fKlik Kanan untuk melihat statistik!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "arena-selector"), "&ePemilih Arena");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "arena-selector"), Collections.singletonList("&fKlik Kanan untuk memilih Arena!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_NAME.replace("%path%", "leave"), "&eKembali ke Pusat");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_LOBBY_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fKlik Kanan untuk keluar dari Bed Wars!"));
        /* Pre Game Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "stats"), "&eStatistik");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "stats"), Collections.singletonList("&fKlik Kanan untuk melihat statistik!"));
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_NAME.replace("%path%", "leave"), "&eKembali ke Lobi");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_WAITING_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fKlik kanan untuk keluar Arena!"));
        /* Spectator Command Items */
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "teleporter"), "&ePemindah Teleportasi");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_NAME.replace("%path%", "leave"), "&eKembali ke Lobi");
        yml.addDefault(Messages.GENERAL_CONFIGURATION_SPECTATOR_ITEMS_LORE.replace("%path%", "leave"), Collections.singletonList("&fKlik kanan untuk keluar Arena!"));

        /* save default items messages for stats gui */
        yml.addDefault(Messages.PLAYER_STATS_GUI_INV_NAME, "&8Statistik {player}");
        addDefaultStatsMsg(yml, "wins", "&6Kememenangan", "&f{wins}");
        addDefaultStatsMsg(yml, "losses", "&6Kekalahan", "&f{losses}");
        addDefaultStatsMsg(yml, "kills", "&6Membunuh", "&f{kills}");
        addDefaultStatsMsg(yml, "deaths", "&6Mati", "&f{deaths}");
        addDefaultStatsMsg(yml, "final-kills", "&6Pembunuhan Terakhir", "&f{finalKills}");
        addDefaultStatsMsg(yml, "final-deaths", "&6Kematian Terakhir", "&f{finalDeaths}");
        addDefaultStatsMsg(yml, "beds-destroyed", "&6Menghancurkan Kasur", "&f{bedsDestroyed}");
        addDefaultStatsMsg(yml, "first-play", "&6Pertama Kali Bermain", "&f{firstPlay}");
        addDefaultStatsMsg(yml, "last-play", "&6Terakhir Kali Bermain", "&f{lastPlay}");
        addDefaultStatsMsg(yml, "games-played", "&6Pertandingan Dimainkan", "&f{gamesPlayed}");

        // Start of Sidebar
        yml.addDefault(Messages.SCOREBOARD_LOBBY, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&fLevel Anda: {level}",
                "",
                "&fProgres: &a{currentXp}&7/&b{requiredXp}",
                "{progress}",
                "",
                "&7{player}",
                "",
                "&fKoin: &a{money}",
                "",
                "&fTotal Kemenangan: &a{wins}",
                "&fTotal Membunuh: &a{kills}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fPeta: &a{map}",
                "",
                "&fPemain: &a{on}/{max}",
                "",
                "&fMenunggu,&fMenunggu.,&fMenunggu..,&fMenunggu...",
                "",
                "&fJenis: &a{group}",
                "&fVersi: &7{version}",
                "", "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_WAITING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Sedang menonton",
                "&fPeta: &a{map}",
                "",
                "&fPemain: &a{on}/{max}",
                "",
                "&fMenunggu,&fMenunggu.,&fMenunggu..,&fMenunggu...",
                "",
                "&fJenis: &a{group}",
                "&fVersi: &7{version}",
                "", "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "",
                "&fPeta: &a{map}",
                "",
                "&fPemain: &a{on}/{max}",
                "",
                "&fDimulai dalam &a{time}d",
                "",
                "&fJenis: &a{group}",
                "&fVersi: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_STARTING_SPEC, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date} &8{server}",
                "&o&7Sedang menonton",
                "&fPeta: &a{map}",
                "",
                "&fPemain: &a{on}/{max}",
                "",
                "&fDimulai dalam &a{time}d",
                "",
                "&fJenis: &a{group}",
                "&fVersi: &7{version}",
                "",
                "&e{serverIp}")
        );
        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING, Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} dalam &a{time}",
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
                "&o&7Sedang menonton {spectatorTarget}",
                "",
                "&f{nextEvent} dalam &a{time}",
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
                "&o&7Sedang menonton {spectatorTarget}",
                "",
                "&f{nextEvent} dalam &a{time}",
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
                "&6Pemenang: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lPembunuhan Terbanyak:",
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
                "&6Pemenang: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lPembunuhan Terbanyak:",
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
                "&6Pemenang: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lPembunuhan Terbanyak:",
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
                "&6Pemenang: {winnerTeamColor}{winnerTeamName} &6⭐",
                "",
                "&7&lPembunuhan Terbanyak:",
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
                "&f{nextEvent} dalam &a{time}",
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
                "&o&7Sedang menonton {spectatorTarget}",
                "&f{nextEvent} dalam &a{time}",
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
                "&o&7Sedang menonton {spectatorTarget}",
                "&f{nextEvent} dalam &a{time}",
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
                "&f{nextEvent} dalam &a{time}",
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
                "&fPembunuhan: &a{kills}",
                "&fPembunuhan Terakhir: &a{finalKills}",
                "&fKasur Dihancurkan: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "3v3v3v3"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Sedang menonton {spectatorTarget}",
                "&f{nextEvent} dalam &a{time}",
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
                "&o&7Sedang menonton {spectatorTarget}",
                "&f{nextEvent} dalam &a{time}",
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
                "&fPembunuhan: &a{kills}",
                "&fPembunuhan Terakhir: &a{finalKills}",
                "&fKasur Dihancurkan: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "",
                "&f{nextEvent} dalam &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fPembunuhan: &a{kills}",
                "&fPembunuhan Terakhir: &a{finalKills}",
                "&fKasur Dihancurkan: &a{beds}",
                "",
                "&e{serverIp}")
        );

        yml.addDefault(Messages.SCOREBOARD_DEFAULT_PLAYING_SPEC.replaceFirst("Default", "4v4v4v4"), Arrays.asList(
                "&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&lBED WARS,&f&l{poweredBy},&f&l{poweredBy},&f&l{poweredBy},&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&lBED WARS,&e&l{poweredBy},&e&l{poweredBy},&e&l{poweredBy}",
                "&7{date}",
                "&o&7Sedang menonton {spectatorTarget}",
                "&f{nextEvent} dalam &a{time}",
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
                "&o&7Sedang menonton {spectatorTarget}",
                "&f{nextEvent} dalam &a{time}",
                "",
                "{team}",
                "{team}",
                "{team}",
                "{team}",
                "",
                "&fPembunuhan: &a{kills}",
                "&fPembunuhan Terakhir: &a{finalKills}",
                "&fKasur Dihancurkan: &a{beds}",
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
                "&fAda {on} pemain di lobi ini",
                "Didukung oleh {poweredBy},&a{serverIp}",
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
                "Menunggu lebih banyak pemain,Menunggu lebih banyak pemain.,Menunggu lebih banyak pemain.., Menunggu lebih banyak pemain...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
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
                "&7&oAnda sedang menonton",
                "Menunggu lebih banyak pemain,Menunggu lebih banyak pemain.,Menunggu lebih banyak pemain.., Menunggu lebih banyak pemain...",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_PREFIX_SPEC, List.of("{vPrefix}"));
        yml.addDefault(Messages.FORMATTING_SB_TAB_WAITING_SUFFIX_SPEC, List.of(" {level}"));
        // player starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER, List.of(
                "",
                "&fDimulai dalam &a{time} &fdetik,&fDimulai dalam &a{time} &fdetik.,&fDimulai dalam &a{time} &fdetik..,&fDimulai dalam &a{time} &fdetik..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX, List.of(" {level}"));
        // spectator starting lobby
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_HEADER_SPEC, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                "",
                "&7&oKamu sedang menonton"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_FOOTER_SPEC, List.of(
                "",
                "&fDimulai dalam &a{time} &fdetik,&fDimulai dalam &a{time} &fdetik.,&fDimulai dalam &a{time} &fdetik..,&fDimulai dalam &a{time} &fdetik..",
                "&f{on}&a/&f{max}",
                "",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_PREFIX_SPEC, List.of("{vPrefix} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_STARTING_SUFFIX_SPEC, List.of(" {level}"));
        // player playing
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                "",
                "{nextEvent} dalam {time}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_FOOTER, List.of(
                "",
                "&fAnda bermain di Tim {teamColor}{teamName}",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // player eliminated - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                "",
                "{nextEvent} dalam {time}",
                "",
                "&7&oAnda telah tereliminasi,&f&oAnda telah tereliminasi"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_FOOTER, List.of(
                "",
                "&fAnda telah bermain di Tim {teamColor}{teamName}",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_PREFIX, List.of("&f&oPenonton "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_ELM_SUFFIX, List.of(" &c&oTereliminasi {teamColor}&o{teamName}", " {teamColor}&oTereliminasi {vPrefix}", "{teamColor}&oTereliminasi {level}"));
        // spectator - playing state
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                "",
                "{nextEvent} dalam {time}",
                "",
                "&7&oKamu sedang menonton"
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_FOOTER, List.of(
                "",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_PREFIX, List.of("&f&oPenonton "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_PLAYING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner alive - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ Tim {winnerTeamColor}&lAnda memenangkan permainan! &6⭐",
                "&7{date}", "&7Peta: &f{map} &7Jenis: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_FOOTER, List.of(
                "",
                "&6&lAnda menang sebagai Tim {teamColor}&l{teamName}&6&l!,&6&lAnda menang sebagai Tim {teamColor}&l{teamName}&6&l!,&f&lAnda menang sebagai Tim {teamColor}&l{teamName}&f&l!",
                "&7Statistik pertandingan ini",
                "&ePembunuhan: &f{kills} &8| &ePembunuhan Terakhir: &f{finalKills} &8| &eKasur Dihancurkan: &f{beds} &8| &eKematian: &f{deaths},&ePembunuhan: &7{kills} &8| &ePembunuhan Terakhir: &7{finalKills} &8| &eKasur Dihancurkan: &7{beds} &8| &eKematian: &7{deaths}",
                "",
                "&fTerima kasih telah bermain, {player}!",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN1_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // winner dead - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ Tim {winnerTeamColor}&l{winnerTeamName} memenangkan permainan! &6⭐",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_FOOTER, List.of(
                "",
                "&6&lAnda menang sebagai Tim {teamColor}&l{teamName}&6&l!,&6&lAnda menang sebagai Tim {teamColor}&l{teamName}&6&l!,&f&lAnda menang sebagai Tim {teamColor}&l{teamName}&f&l!",
                "&7Statistik pertandingan ini",
                "&ePembunuhan: &f{kills} &8| &ePembunuhan Terakhir: &f{finalKills} &8| &eKasur Dihancurkan: &f{beds} &8| &eKematian: &f{deaths},&ePembunuhan: &7{kills} &8| &ePembunuhan Terakhir: &7{finalKills} &8| &eKasur Dihancurkan: &7{beds} &8| &eKematian: &7{deaths}",
                "&fTerima kasih telah bermain, {player}!",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_PREFIX, List.of("&6&l⭐ {teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_WIN2_SUFFIX, List.of(" {vPrefix}", " &c&oTereliminasi", " {level}", " &c&oTereliminasi"));
        // loser - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_HEADER, List.of(
                "                                                                                                        ",
                "&6⭐ Tim {winnerTeamColor}&l{winnerTeamName} memenangkan permainan! &6⭐",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_FOOTER, List.of(
                "",
                "&fAnda kalah sebagai Tim {teamColor}{teamName}",
                "&7Statistik pertandingan ini",
                "&ePembunuhan: &f{kills} &8| &ePembunuhan Terakhir: &f{finalKills} &8| &eKasur Dihancurkan: &f{beds} &8| &eKematian: &f{deaths},&ePembunuhan: &7{kills} &8| &ePembunuhan Terakhir: &7{finalKills} &8| &eKasur Dihancurkan: &7{beds} &8| &eKematian: &7{deaths}",
                "&fTerima kasih telah bermain, {player}!",
                "&a{serverIp}",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_PREFIX, List.of("{teamColor}{teamName} "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_ELM_SUFFIX, List.of(" {vPrefix}", " &c&oTereliminasi", " {level}", " &c&oTereliminasi"));
        // spectator - restarting state
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_HEADER, List.of(
                "                                                                                                        ",
                "&a{serverIp}",
                "&6⭐ Tim {winnerTeamColor}&l{winnerTeamName} memenangkan permainan! &6⭐",
                "&7{date}",
                "&7Peta: &f{map} &7Jenis: &f{group}",
                "",
                "&fTerima kasih telah bermain {player}!",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_FOOTER, List.of(
                "",
                "&fDidukung oleh {poweredBy}",
                ""
        ));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_PREFIX, List.of("&f&oPenonton "));
        yml.addDefault(Messages.FORMATTING_SB_TAB_RESTARTING_SPEC_SUFFIX, List.of(" {vPrefix}", " {level}"));
        // end of tab

        //
        yml.addDefault(Messages.SHOP_INDEX_NAME, "&8Pembelian Cepat");
        yml.addDefault(Messages.SHOP_QUICK_ADD_NAME, "&8Tambah ke Pembelian Cepat");
        yml.addDefault(Messages.SHOP_INSUFFICIENT_MONEY, "{prefix}&cKamu tidak mempunyai {currency} yang cukup! Butuh {amount} lagi!");
        yml.addDefault(Messages.SHOP_NEW_PURCHASE, "{prefix}&aKamu membeli &6{item}");
        yml.addDefault(Messages.SHOP_ALREADY_BOUGHT, "{prefix}&cKamu telah membeli itu!!");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_SILVERFISH_NAME, "{TeamColor}&l{TeamName} &r{TeamColor}Silverfish");
        yml.addDefault(Messages.SHOP_UTILITY_NPC_IRON_GOLEM_NAME, "{TeamColor}{despawn}s &8[ {TeamColor}{health}&8]");
        yml.addDefault(Messages.SHOP_SEPARATOR_NAME, "&8⇧ Kategori");
        yml.addDefault(Messages.SHOP_SEPARATOR_LORE, Collections.singletonList("&8⇩ Barang"));
        yml.addDefault(Messages.SHOP_QUICK_BUY_NAME, "&bPembelian Cepat");
        yml.addDefault(Messages.SHOP_QUICK_BUY_LORE, new ArrayList<>());
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_NAME, "&cSlot kosong!");
        yml.addDefault(Messages.SHOP_QUICK_EMPTY_LORE, Arrays.asList("&7Ini slot Pembelian Cepat!", "&bKlik sambil jongkok &7pada barang", "&7di toko untuk menambahkannya."));
        yml.addDefault(Messages.SHOP_CAN_BUY_COLOR, "&a");
        yml.addDefault(Messages.SHOP_CANT_BUY_COLOR, "&c");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CAN_BUY, "&eKlik untuk membeli!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_CANT_AFFORD, "&cKamu tidak mempunyai {currency} yang cukup!");
        yml.addDefault(Messages.SHOP_LORE_STATUS_MAXED, "&aMAKSIMAL!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_ADD, "&bJongkok Klik untuk menambahkan ke Beli Cepat!");
        yml.addDefault(Messages.SHOP_LORE_QUICK_REMOVE, "&bJongkok Klik untuk menhapus dari Beli Cepat!");


        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "&8Blok", "&aBlok", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "wool", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Wol", Arrays.asList("&7Biaya: &f{cost} {currency}", "", "&7Bagus untuk menyebrang", "&7pulau. Berubah menjadi tim Anda",
                "&7warna tim Anda.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "clay", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Hardened Clay", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Blok dasar untuk mempertahankan kasur Anda", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "glass", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Kaca Anti Ledakan", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Kebal terhadap ledakan", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stone", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}End Stone", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Blok keras untuk mempertahankan kasur Anda", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ladder", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Tangga", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Berguna untuk menyelamatkan kucing yang terjebak", "&7di pohon.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "obsidian", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Obsidian", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Perlindungan ekstrim untuk kasur Anda", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "wood", ConfigPath.SHOP_PATH_CATEGORY_BLOCKS, "{color}Kayu", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Blok keras untuk mempertahankan kasur Anda", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_MELEE, "&8Senjata Jarak Dekat", "&aSenjata Jarak Dekat", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "stone-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Stone Sword", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Iron Sword", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-sword", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Diamond Sword", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "stick", ConfigPath.SHOP_PATH_CATEGORY_MELEE, "{color}Stik (Knockback I)", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "&8Pelindung", "&aPelindung", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "chainmail", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armor Chainmail Permanenr", Arrays.asList("&7Biaya: {cost} {currency}",
                "", "&7Celana dan sepatu chainmail yang dapat membuat", "&7kamu akan selalu muncul dengan ini", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "iron-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armor Besi Permanen", Arrays.asList("&7Biaya: {cost} {currency}",
                "", "&7Celana dan sepatu besi yang dapat membuat", "&7kamu akan selalu muncul dengan ini.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "diamond-armor", ConfigPath.SHOP_PATH_CATEGORY_ARMOR, "{color}Armor Berlian Permanen", Arrays.asList("&7Biaya: {cost} {currency}",
                "", "&7Celana dan sepatu berlian yang dapat membuat", "&7kamu akan selalu naksir dengan ini.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "&8Tools", "&aTools", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "shears", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Gunting Permanen", Arrays.asList("&7Biaya: {cost} {currency}",
                "", "&7Bagus untuk menyingkirkan wol. Kamu", "&7akan selalu muncul dengan gunting ini.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "pickaxe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Pickaxe {tier}", Arrays.asList("&7Biaya: {cost} {currency}", "&7Tingkat: &e{tier}",
                "", "&7Ini adalah item yang dapat diupgrade.", "&7Itu akan kehilangan 1 tingkat setelah.", "&7mati!", "", "&7Anda akan secara permanen", "&7respawn dengan setidaknya", "&7tingkat terendah.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "axe", ConfigPath.SHOP_PATH_CATEGORY_TOOLS, "{color}Kapak {tier}", Arrays.asList("&7Biaya: {cost} {currency}", "&7Tingkat: &e{tier}",
                "", "&7Ini adalah item yang dapat diupgrade.", "&7Itu akan kehilangan 1 tingkat setelah.", "&7mati!", "", "&7Anda akan secara permanen", "&7respawn dengan setidaknya", "&7tingkat terendah.", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_RANGED, "&8Senjata Jarak Jauh", "&aSenjata Jarak Jauh", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "arrow", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Anak Panah", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow1", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Panah", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow2", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Panah (Power I)", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bow3", ConfigPath.SHOP_PATH_CATEGORY_RANGED, "{color}Panah (Power I, Punch I)", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-1"), "{color}Tempa Besi");

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "&8Ramuan", "&aRamuan", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "speed-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Ramuan Kecepatan {level} ({duration} detik)", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "jump-potion", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Ramuan Lompat {level} ({duration} detik)", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "invisibility", ConfigPath.SHOP_PATH_CATEGORY_POTIONS, "{color}Ramuan Tak Kasat Mata ({duration} detik)", Arrays.asList("&7Biaya: {cost} {currency}", "", "{quick_buy}", "{buy_status}"));

        addCategoryMessages(yml, ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "&8Utilitas", "&aUtilitas", Collections.singletonList("&eKlik untuk melihat!"));

        addContentMessages(yml, "golden-apple", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Apel Emas", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Penyembuhan menyeluruh.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bedbug", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Kutu Kasur", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Memunculkan ikan gabus di mana",
                "&7bola salju mendarat untuk mengalihkan perhatian", "&7musuh. Berlangsung 15 detik.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "dream-defender", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Pertahanan Impian", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Iron Golem untuk membantu mempertahankan",
                "&7base. Berlangsung 4 menit.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "fireball", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Bola Api", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Klik kanan untuk meluncurkan! Bagus untuk",
                "&7memukul mundur musuh yang berjalan", "&7di jembatan tipis", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "tnt", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}TNT", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Langsung menyala, cocok",
                "&7untuk meledakkan sesuatu!", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "ender-pearl", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Ender Pearl", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Cara tercepat untuk menyerang base",
                "&7musuh.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "water-bucket", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Water Bucket", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Bagus untuk memperlambat musuh.",
                "&7Bisa juga melindungi", "&7dari serangan TNT.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "bridge-egg", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Telur Jembatan", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Telur ini menciptakan jembatan di",
                "&7percobaan setelah dilempar.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "magic-milk", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Susu Ajaib", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Hindari memicu jebakan untuk 60",
                "&7detik setelah diminum.", "", "{quick_buy}", "{buy_status}"));
        addContentMessages(yml, "sponge", ConfigPath.SHOP_PATH_CATEGORY_UTILITY, "{color}Spons", Arrays.asList("&7Biaya: {cost} {currency}", "", "&7Bagus untuk menyerap air.",
                "", "{quick_buy}", "{buy_status}"));

        //
        yml.addDefault(Messages.MEANING_NO_TRAP, "Tidak ada Perangkap!");
        yml.addDefault(Messages.FORMAT_SPECTATOR_TARGET, "{targetTeamColor}{targetDisplayName}");
        yml.addDefault(Messages.FORMAT_UPGRADE_TRAP_COST, "&7Biaya: {currencyColor}{cost} {currency}");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CAN_AFFORD, "&e");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_CANT_AFFORD, "&c");
        yml.addDefault(Messages.FORMAT_UPGRADE_COLOR_UNLOCKED, "&a");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_LOCKED, "&7");
        yml.addDefault(Messages.FORMAT_UPGRADE_TIER_UNLOCKED, "&a");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_CLICK_TO_BUY, "{color}Klik untuk membeli!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_INSUFFICIENT_MONEY, "{color}Anda tidak punya {currency} yang cukup!");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_LOCKED, "&cTERKUNCI");
        yml.addDefault(Messages.UPGRADES_LORE_REPLACEMENT_UNLOCKED, "{color}TERBUKA");
        yml.addDefault(Messages.UPGRADES_UPGRADE_BOUGHT_CHAT, "&a{player} membeli &6{upgradeName}");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "forge"),
                Arrays.asList("&7Tingkatkan pemijahan sumber daya aktif", "&7di pulau mu.", "", "{tier_1_color}Tingkat 1: +50% Sumber Daya, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Tingkat 2: +100% Sumber Daya, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Tingkat 3: Spawn zamrud, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Tingkat 4: +200% Sumber Daya, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-2"), "{color}Tempa Emas");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-3"), "{color}Tempa Zamrud");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "forge").replace("{tier}", "tier-4"), "{color}Tempa Cair");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_NAME_PATH + "traps", "&aBeli perangkap");
        yml.addDefault(Messages.UPGRADES_CATEGORY_ITEM_LORE_PATH + "traps", Arrays.asList("&7Perangkap yang dibeli akan menjadi", "&7antri di sebelah kanan.", "", "&eKlik untuk menelusuri!"));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "swords").replace("{tier}", "tier-1"), "{color}Pedang yang Diasah");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "swords"),
                Arrays.asList("&7Tim Anda memperoleh keuntungan secara permanen", "&7Ketajaman I pada semua pedang dan", "&7kapak!", "", "{tier_1_color}Biaya: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-1"), "{color}Armor Bertulang I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "armor"),
                Arrays.asList("&7Tim Anda memperoleh keuntungan secara permanen", "&7Perlindungan pada semua bagian armor!", "", "{tier_1_color}Tingkat 1: Perlindungan I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Tingkat 2: Perlindungan II, &b{tier_2_cost} {tier_2_currency}",
                        "{tier_3_color}Tingkat 3: Perlindungan III, &b{tier_3_cost} {tier_3_currency}",
                        "{tier_4_color}Tingkat 4: Perlindungan IV, &b{tier_4_cost} {tier_4_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-2"), "{color}Armor Bertulang II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-3"), "{color}Armor Bertulang III");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "armor").replace("{tier}", "tier-4"), "{color}Armor Bertulang IV");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-1"), "{color}Penambang Maniak I");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "miner"),
                Arrays.asList("&7Semua pemain di tim Anda", "&7mendapatkan Haste secara permanen.", "", "{tier_1_color}Tingkat 1: Haste I, &b{tier_1_cost} {tier_1_currency}",
                        "{tier_2_color}Tingkat 2: Haste II, &b{tier_2_cost} {tier_2_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "miner").replace("{tier}", "tier-2"), "{color}Penambang Maniak II");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "heal-pool").replace("{tier}", "tier-1"), "{color}Kolam Penyembuhan");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "heal-pool"),
                Arrays.asList("&7Membuat bidang Regenerasi", "&7di sekitar base Anda!", "", "{tier_1_color}Biaya: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_NAME.replace("{name}", "dragon").replace("{tier}", "tier-1"), "{color}Peningkatan Naga");
        yml.addDefault(Messages.UPGRADES_UPGRADE_TIER_ITEM_LORE.replace("{name}", "dragon"),
                Arrays.asList("&7Tim Anda akan memiliki 2 naga", "&7alih-alih 1 selama pertandingan terakhir!", "", "{tier_1_color}Biaya: &b{tier_1_cost} {tier_1_currency}", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "glass", "&8⬆&7Dapat Dibeli");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "glass", Collections.singletonList("&8⬇&7Antrian Perangkap"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "first", "{color}Perangkap #1: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "first", Arrays.asList("&7Musuh pertama yang berjalan", "&7ke base Anda akan memicu", "&7perangkap ini!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "first",
                Arrays.asList("", "&7Membeli perangkap akan", "&7antri disini. biayanya", "&7akan skala berdasarkan", "&7jumlah jebakan yang diantrekan.", "", "&7Perangkap Selanjutnya: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "second", "{color}Perangkap #2: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "second", Arrays.asList("&7Musuh kedua yang berjalan", "&7ke base Anda akan memicu", "&7perangkap ini!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "second",
                Arrays.asList("", "&7Membeli perangkap akan", "&7antri disini. biayanya", "&7akan skala berdasarkan", "&7jumlah jebakan yang diantrekan.", "", "&7Perangkap Selanjutnya: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_NAME_PATH + "third", "{color}Perangkap #3: {name}");
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE1_PATH + "third", Arrays.asList("&7Musuh ketiga yang berjalan", "&7ke base Anda akan memicu", "&7perangkap ini!"));
        yml.addDefault(Messages.UPGRADES_TRAP_SLOT_ITEM_LORE2_PATH + "third",
                Arrays.asList("", "&7Membeli perangkap akan", "&7antri disini. biayanya", "&7akan skala berdasarkan", "&7jumlah jebakan yang diantrekan.", "", "&7Perangkap Selanjutnya: &b{cost} {currency}"));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "1", "{color}Ini perangkap!");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "1", Arrays.asList("&7Menimbulkan Kebutaan dan Kelambatan", "&7selama 5 detik.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "2", "{color}Perangkap Serangan Balik");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "2", Arrays.asList("&7Memberikan Kecepatan I selama 15 detik kepada", "&7pemain sekutu di dekat markas Anda.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "3", "{color}Perangkap Alarm");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "3", Arrays.asList("&7Menampilkan pemain tak terlihat", "&7beserta nama dan timnya.", ""));
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_NAME_PATH + "4", "{color}Perangkap Kelelahan Penambang");
        yml.addDefault(Messages.UPGRADES_BASE_TRAP_ITEM_LORE_PATH + "4", Arrays.asList("&7Menimbulkan Kelelahan Penambangan selama 10", "&7detik.", ""));
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_NAME_PATH + "back", "&aKembali");
        yml.addDefault(Messages.UPGRADES_SEPARATOR_ITEM_LORE_PATH + "back", Collections.singletonList("&7Kembali ke Peningkatan Tim"));
        yml.addDefault(Messages.UPGRADES_CATEGORY_GUI_NAME_PATH + "traps", "&8Antrian Jebakan");
        yml.addDefault(Messages.UPGRADES_TRAP_QUEUE_LIMIT, "&cAntrian jebakan penuh!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_MSG, "&c&l{trap} telah berangkat!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_TITLE, "&cPERANGKAP TERPICU!");
        yml.addDefault(Messages.UPGRADES_TRAP_DEFAULT_SUBTITLE, "&fPerangkap {trap} telah terpicu!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_MSG + "3", "&c&lPerangkap alarm telah dipicu oleh &7&l{player} &c&ldari tim {color}&l{team}!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_TITLE + "3", "&c&lALARM!!!");
        yml.addDefault(Messages.UPGRADES_TRAP_CUSTOM_SUBTITLE + "3", "&fPerangkap alarm telah dipicu oleh tim {color}{team}&f!");
        yml.addDefault(Messages.CONFIG_ITEM_NAME_NOT_SET, "&cNama belum diatur");
        yml.addDefault(Messages.CONFIG_ITEM_LORE_NOT_SET, Collections.singletonList("&cLore belum diatur"));
        yml.addDefault(Messages.UPGRADES_MENU_GUI_NAME_DEFAULT, "&8Peningkatan Tim");
        save();
        setPrefix(m(Messages.PREFIX));
        setPrefixStatic(m(Messages.PREFIX));
    }
}

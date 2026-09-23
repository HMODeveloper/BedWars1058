# Repository Guidelines

## Scope

- This repository guidance is for Minecraft 1.8 only. Ignore newer `versionsupport_*` implementations and inactive higher-version modules.
- The active compatibility path is Spigot `1.8.8-R0.1-SNAPSHOT`, centered on `versionsupport_1_8_R3` and the shared support module.

## Project Overview

BedWars1058 is a GPL-3.0 Spigot/Paper BedWars minigame: players defend a bed, destroy opponents' beds, and stop respawning after their bed is destroyed. It uses Bukkit/Spigot APIs plus compiled NMS; server forks without compiled NMS are unsupported. See `README.md`.

## Architecture & Data Flow

- `bedwars-api` defines the public plugin API, arena/team abstractions, events, configuration helpers, restore-adapter contracts, and the `VersionSupport` NMS boundary.
- `bedwars-plugin` contains the game implementation. `com.andrei1058.bedwars.BedWars` is the `JavaPlugin` entry point; `API` implements and registers the public API through Bukkit's `ServicesManager`.
- Startup in `BedWars.onLoad()` checks Spigot, derives the server package version, loads the matching version-support class, initializes language/configuration, and selects the NMS bridge. `onEnable()` registers commands/listeners, loads arenas, starts recurring tasks, initializes integrations, and selects a world restore adapter.
- The 1.8 NMS implementation is `versionsupport_1_8_R3/.../v1_8_R3.java`; shared cross-version listener setup is in `versionsupport_common/.../VersionCommon.java`. Keep Bukkit-agnostic game logic out of the NMS module and route version-sensitive behavior through `VersionSupport`.
- Arena loading reads `plugin-data/Arenas/<name>.yml`, validates teams/generators/locations, queues the arena, then initializes it when its world is restored and loaded. `Arena` owns per-game players, teams, generators, regions, and state; it emits custom events and transitions through `waiting`, `starting`, `playing`, and `restarting`.
- `GameStartingTask`, `GamePlayingTask`, and `GameRestartingTask` drive the arena state machine on Bukkit's scheduler. Event listeners handle player, block, inventory, combat, spectator, shop, upgrade, and game events.
- World restoration is selected at runtime: compatible SlimeWorldManager/AdvancedSlimeWorldManager integrations use `resetadapter_*`; otherwise `maprestore/internal/InternalAdapter` provides the zip/unzip fallback. Implementations extend the API `RestoreAdapter` contract.

## Key Directories

- `bedwars-api/src/main/java/com/andrei1058/bedwars/api/` — public interfaces, events, models, config and server contracts.
- `bedwars-plugin/src/main/java/com/andrei1058/bedwars/` — core plugin implementation: `arena/`, `listeners/`, `commands/`, `configuration/`, `shop/`, `upgrades/`, `sidebar/`, `database/`, `maprestore/`, and optional integration packages under `support/`.
- `bedwars-plugin/src/main/resources/plugin.yml` — filtered plugin metadata, main class, and soft dependencies.
- `versionsupport_1_8_R3/src/main/java/.../v1_8_R3/` — 1.8.8 CraftBukkit/NMS mappings and version-specific entity, packet, item, and command behavior.
- `versionsupport_common/src/main/java/` — behavior shared by version modules.
- `resetadapter_slime/`, `resetadapter_aswm/`, `resetadapter_slimepaper/` — optional world-reset adapter implementations; inspect 1.8-compatible dependencies before changing them.
- `repo/` — checked-in local Maven artifacts, including SidebarLib; the root POM resolves `project-local` dependencies from here.
- `.github/workflows/` — Maven CI, snapshot deployment, and release deployment workflows.

## Development Commands

Prerequisites: Git, Java, and Maven. From the repository root:

```bash
mvn clean install
```

Verified CI workflows also use:

```bash
mvn clean install -s ci_settings.xml       # PR/non-protected branch compile
mvn clean deploy -s ci_settings.xml        # develop/master publishing
mvn javadoc:javadoc                        # release API documentation
```

The workflows mutate versions before deployment with `mvn versions:set` and `mvn versions:update-child-modules`; do not run those against a working tree unless version changes are intended. `ci_settings.xml` consumes environment-provided credentials. The plugin POM has an optional package-phase copy hook: when `BED_WARS_SERVER_DIR` is set, the built JAR is copied to `$BED_WARS_SERVER_DIR/plugins`. No repository server-start command exists.

## Code Conventions & Common Patterns

- Use the existing Java package/class naming and four-space formatting; preserve nearby style rather than introducing a new formatter or abstraction.
- Implement Bukkit behavior as `Listener` classes with `@EventHandler`, register them from `BedWars`, and use the existing custom API events for extension points. Preserve cancellation checks and event ordering.
- Treat `Arena` and its `GameState` as the source of truth for game state. Update arena/player/team collections through their existing methods so lookup maps, events, tasks, and cleanup remain consistent.
- Use `ConfigPath` constants and `ConfigManager`/module configuration classes for YAML access. Configuration is generated under the plugin data folder, loaded and saved as UTF-8; arena locations are world-relative and arena files live under `Arenas/`.
- Bukkit world, entity, inventory, and player mutations belong on the main thread. Use Bukkit synchronous delayed/t repeating tasks for gameplay transitions; reserve asynchronous tasks for database or other blocking work and pass only thread-safe data across the boundary.
- Integrations are optional: detect plugins through Bukkit's plugin/service managers, keep explicit fallbacks such as `NoParty`, `NoEconomy`, SQLite, and the internal restore adapter, and log failures with actionable context.
- Keep Spigot/NMS calls behind `VersionSupport` and the 1.8 module. Do not copy code from inactive newer version modules into the 1.8 path.
- Public API changes belong in `bedwars-api` and must be reflected by the implementation in `bedwars-plugin`; update all consumers and preserve existing event/config contracts.

## Important Files

- `pom.xml` — Maven reactor, active modules, local repository, Java source/target 11, and dependency/plugin defaults.
- `bedwars-plugin/src/main/java/com/andrei1058/bedwars/BedWars.java` — plugin lifecycle, version discovery, registration, integrations, database fallback, and restore-adapter selection.
- `bedwars-plugin/src/main/java/com/andrei1058/bedwars/API.java` — concrete public API facade.
- `bedwars-plugin/src/main/java/com/andrei1058/bedwars/arena/Arena.java` — arena configuration, lifecycle, state, teams, players, and world-facing game data.
- `bedwars-api/src/main/java/com/andrei1058/bedwars/api/server/VersionSupport.java` — version-sensitive behavior contract.
- `versionsupport_1_8_R3/src/main/java/com/andrei1058/bedwars/support/version/v1_8_R3/v1_8_R3.java` — active 1.8 NMS implementation.
- `bedwars-plugin/src/main/java/com/andrei1058/bedwars/configuration/MainConfig.java`, `bedwars-api/src/main/java/com/andrei1058/bedwars/api/configuration/ConfigManager.java`, and `ConfigPath.java` — runtime defaults, YAML persistence, and configuration keys.
- `bedwars-plugin/src/main/java/com/andrei1058/bedwars/commands/bedwars/MainCommand.java` — `/bw`/`/bedwars` command and arena setup operations.
- `bedwars-plugin/src/main/resources/plugin.yml` — packaged plugin entry point and soft dependencies.

## Runtime/Tooling Preferences

- Use Maven, not Gradle; no wrapper or Node/Bun runtime is configured.
- Prefer offline builds: `mvn -o clean install -DskipTests`; use online mode only when required dependencies are unavailable locally.
- Java 11 is the documented minimum and the Maven source/target. CI uses Temurin JDK 21; compile with Java 11+ and do not lower the target without an explicit compatibility requirement.
- Run against Spigot or Paper with compiled NMS. The 1.8 dependency graph uses Spigot `1.8.8-R0.1-SNAPSHOT`; server/plugin APIs and optional integrations are generally `provided`, not bundled.
- `plugin.yml` is resource-filtered during Maven build. Commands are registered programmatically from `BedWars`, not declared as command entries there.
- Runtime YAML is created in the plugin data directory; do not expect committed sample configs. Read source defaults and `ConfigPath` when documenting or changing configuration.
- Never hard-code CI repository credentials; use the environment indirection in `ci_settings.xml`.

## Testing & QA

- Do not add tests by default; add them only when explicitly requested.
- No `src/test` tree, test framework, coverage tool, mock Bukkit server, or automated gameplay harness is configured. There is no repository `mvn test`, lint, formatter, or server smoke-test command to rely on.
- `mvn clean install` is the documented build, not evidence of gameplay correctness. CI verifies Maven install/deploy lifecycles but does not run explicit tests or coverage.
- Behavior changes require manual verification on a Spigot/Paper 1.8.8 server with compiled NMS. Exercise the affected arena state, command, listener, integration, or restore path; include reproduction/verification steps, expected behavior, server software/version, plugin version, and relevant logs in the PR or issue.
- Bug reports follow `.github/ISSUE_TEMPLATE/bug_report.md`; contribution templates under `.github/templates/contributing/` require a verification process. Generated `target/` output and JARs are ignored by `.gitignore` and should not be treated as source.
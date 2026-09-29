package com.andrei1058.bedwars.commands.bedwars.subcmds.regular;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.api.tasks.RestartingTask;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import com.andrei1058.bedwars.configuration.Permissions;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.List;

import static com.andrei1058.bedwars.api.language.Language.getMsg;

public class CmdForceEndGame extends SubCommand {

    public CmdForceEndGame(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(16); // Just after forceStart
        showInList(true);
        setPermission(Permissions.PERMISSION_FORCE_END_GAME);
        setDisplayInfo(MainCommand.createTC(getMsg(null, Messages.COMMAND_FORCE_END_GAME_DISPLAY).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()),
                "/" + getParent().getName() + " " + getSubCommandName(), getMsg(null, Messages.COMMAND_FORCE_END_GAME_DISPLAY_HOVER).replace("{permission}", Permissions.PERMISSION_FORCE_END_GAME)));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        IArena a = Arena.getArenaByPlayer(p);

        if (a == null) {
            p.sendMessage(getMsg(p, Messages.COMMAND_FORCESTART_NOT_IN_GAME));
            return true;
        }

        if (!hasPermission(s)) {
            p.sendMessage(getMsg(p, Messages.COMMAND_FORCESTART_NO_PERM));
            return true;
        }

        if (a.getStatus() == GameState.waiting || a.getStatus() == GameState.starting || a.getStatus() == GameState.restarting) {
            p.sendMessage(getMsg(p, Messages.COMMAND_FORCE_END_GAME_NOT_PLAYING));
            return true;
        }

        // Force end the game
        p.sendMessage(getMsg(p, Messages.COMMAND_FORCE_END_GAME_SUCCESS));
        a.changeStatus(GameState.restarting);
        RestartingTask restartingTask = a.getRestartingTask();
        if (restartingTask != null) {
            restartingTask.setRestarting(8);
        }
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return null;
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {
        if (s instanceof ConsoleCommandSender) return false;

        Player p = (Player) s;

        IArena a = Arena.getArenaByPlayer(p);
        if (a != null) {
            if (a.getStatus() == GameState.playing) {
                return hasPermission(s);
            }
        }
        
        return false;
    }
}

package com.andrei1058.bedwars.commands.bedwars.subcmds.regular;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import com.andrei1058.bedwars.configuration.Permissions;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdForceStart extends AbstractCmdStart {
    public CmdForceStart(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(15);
        showInList(true);
        setDisplayInfo(com.andrei1058.bedwars.commands.bedwars.MainCommand.createTC("§6 ▪ §7/"+ MainCommand.getInstance().getName()+" "+getSubCommandName()+" §8 - §eforce start an arena",
                "/"+getParent().getName()+" "+getSubCommandName(), "§fForce start an arena.\n§fPermission: §c"+ Permissions.PERMISSION_FORCESTART));
    }

    @Override
    protected boolean hasStartPermission(CommandSender s) {
        return s.hasPermission(Permissions.PERMISSION_ALL) || s.hasPermission(Permissions.PERMISSION_FORCESTART);
    }

    @Override
    protected boolean doStart(IArena a, Player p, String[] args) {
        if (a.getStartingTask() == null){
            a.changeStatus(GameState.starting);
            if (args.length == 1 && args[0].equalsIgnoreCase("debug") && p.isOp()){
                BedWars.debug = true;
            }
        }
        if (a.getStartingTask().getCountdown() < 5) return true;
        a.getStartingTask().setCountdown(5);
        return true;
    }


}

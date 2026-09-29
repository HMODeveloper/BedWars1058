package com.andrei1058.bedwars.commands.bedwars.subcmds.sensitive.setup;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.SetupSession;
import com.andrei1058.bedwars.configuration.Permissions;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

import static com.andrei1058.bedwars.BedWars.mainCmd;

public class SetBuildHeight extends SubCommand {
    /**
     * Create a sub-command for a bedWars command
     * Make sure you return true or it will say command not found
     *
     * @param parent parent command
     * @param name   sub-command name
     */
    public SetBuildHeight(ParentCommand parent, String name) {
        super(parent, name);
        setArenaSetupCommand(true);
        setPermission(Permissions.PERMISSION_SETUP_ARENA);
    }

    /**
     * Add your sub-command code under this method
     *
     * @param args
     * @param s
     */
    @Override
    public boolean execute(String[] args, CommandSender s) {

        if (s instanceof ConsoleCommandSender) return false;

        Player p = (Player) s;
        SetupSession ss = SetupSession.getSession(p.getUniqueId());

        if (ss == null){
            s.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_NOT_IN_SESSION));
            return true;
        }

        if (args.length == 0) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE).replace("{command}", mainCmd));
        } else {
            try {
                Integer.parseInt(args[0]);
            } catch (Exception ex) {
                p.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_BUILD_HEIGHT_USAGE).replace("{command}", mainCmd));
                return true;
            }
            ss.getConfig().set("max-build-y", Integer.valueOf(args[0]));
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_SETUP_BUILD_HEIGHT_SET).replace("{height}", args[0]));
        }
        return true;
    }

    /**
     * Manage sub-command tab complete
     */
    @Override
    public List<String> getTabComplete() {
        return Arrays.asList("180", "256");
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {
        if (s instanceof ConsoleCommandSender) return false;

        Player p = (Player) s;
        if (!SetupSession.isInSetupSession(p.getUniqueId())) return false;

        return hasPermission(s);
    }
}

package com.andrei1058.bedwars.commands.bedwars.subcmds.regular;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import com.andrei1058.bedwars.configuration.Permissions;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CmdEchoAll extends SubCommand {

    public CmdEchoAll(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(23);
        showInList(true);
        setDisplayInfo(MainCommand.createTC(Language.getMsg(null, Messages.COMMAND_ECHOALL_DISPLAY).replace("{command}", getParent().getName()).replace("{subcommand}", getSubCommandName()),
                "/" + getParent().getName() + " " + getSubCommandName(), Language.getMsg(null, Messages.COMMAND_ECHOALL_HOVER).replace("{command}", getParent().getName())));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (!s.hasPermission(Permissions.PERMISSION_ALL) && !s.hasPermission(Permissions.PERMISSION_ECHO)) {
             s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS));
             return true;
        }

        if (args.length < 1) {
            s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_ECHOALL_USAGE));
            return true;
        }

        StringBuilder messageBuilder = new StringBuilder();
        for (String arg : args) {
            messageBuilder.append(arg).append(" ");
        }
        String message = ChatColor.translateAlternateColorCodes('&', messageBuilder.toString().trim());
        for (IArena arena : Arena.getArenas()) {
            sendMessageToArena(arena, message);
        }
        s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_ECHOALL_SENT));

        return true;
    }

    private void sendMessageToArena(IArena arena, String message) {
        for (Player player : arena.getPlayers()) {
            player.sendMessage(Language.getMsg(player, Messages.COMMAND_ECHO_PREFIX) + message);
        }
        for (Player spectator : arena.getSpectators()) {
            spectator.sendMessage(Language.getMsg(spectator, Messages.COMMAND_ECHO_PREFIX) + message);
        }
    }

    @Override
    public List<String> getTabComplete() {
        return null;
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {
        return s.hasPermission(Permissions.PERMISSION_ALL) || s.hasPermission(Permissions.PERMISSION_ECHO);
    }
}

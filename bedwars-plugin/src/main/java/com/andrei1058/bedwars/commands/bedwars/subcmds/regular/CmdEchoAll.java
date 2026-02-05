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
        setDisplayInfo(MainCommand.createTC("§6 ▪ §7/" + MainCommand.getInstance().getName() + " " + getSubCommandName() + " §8- §eSend message to all arenas",
                "/" + getParent().getName() + " " + getSubCommandName(), "§fSend a message to all players in all arenas.\n§fUsage: /bw echoall <message>"));
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
        String prefix = "§8[§cOperator§8] §f";

        for (IArena arena : Arena.getArenas()) {
            sendMessageToArena(arena, prefix, message);
        }
        s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_ECHOALL_SENT));

        return true;
    }

    private void sendMessageToArena(IArena arena, String prefix, String message) {
        for (Player player : arena.getPlayers()) {
            player.sendMessage(prefix + message);
        }
        for (Player spectator : arena.getSpectators()) {
            spectator.sendMessage(prefix + message);
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

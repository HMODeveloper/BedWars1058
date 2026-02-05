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
import java.util.stream.Collectors;

public class CmdEchoTo extends SubCommand {

    public CmdEchoTo(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(22);
        showInList(true);
        setDisplayInfo(MainCommand.createTC("§6 ▪ §7/" + MainCommand.getInstance().getName() + " " + getSubCommandName() + " §8- §eSend message to a specific arena",
                "/" + getParent().getName() + " " + getSubCommandName(), "§fSend a message to all players in a specific arena.\n§fUsage: /bw echoto <arena> <message>"));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (!s.hasPermission(Permissions.PERMISSION_ALL) && !s.hasPermission(Permissions.PERMISSION_ECHO)) {
             s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_NOT_FOUND_OR_INSUFF_PERMS));
             return true;
        }

        if (args.length < 2) {
            s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_ECHOTO_USAGE));
            return true;
        }

        String target = args[0];
        IArena arena = Arena.getArenaByName(target);

        if (arena == null) {
            s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_ARENA_NOT_FOUND).replace("{arena}", target));
            return true;
        }

        StringBuilder messageBuilder = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            messageBuilder.append(args[i]).append(" ");
        }
        String message = ChatColor.translateAlternateColorCodes('&', messageBuilder.toString().trim());
        String prefix = "§8[§cOperator§8] §f";

        sendMessageToArena(arena, prefix, message);
        s.sendMessage(Language.getMsg(s instanceof Player ? (Player) s : null, Messages.COMMAND_ECHOTO_SENT).replace("{arena}", arena.getArenaName()));

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
        return Arena.getArenas().stream().map(IArena::getArenaName).collect(Collectors.toList());
    }

    @Override
    public boolean canSee(CommandSender s, BedWars api) {
        return s.hasPermission(Permissions.PERMISSION_ALL) || s.hasPermission(Permissions.PERMISSION_ECHO);
    }
}

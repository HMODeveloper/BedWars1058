package com.andrei1058.bedwars.commands.bedwars.subcmds.sensitive;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** OP-only, typed changes to existing main-configuration leaves. */
public class Config extends SubCommand {
    public Config(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(12);
        showInList(true);
    }

    @Override
    public boolean hasPermission(CommandSender sender) {
        return sender.isOp();
    }

    @Override
    public boolean canSee(CommandSender sender, com.andrei1058.bedwars.api.BedWars api) {
        return sender.isOp();
    }

    @Override
    public boolean execute(String[] args, CommandSender sender) {
        Player player = sender instanceof Player ? (Player) sender : null;
        if (!sender.isOp()) {
            sender.sendMessage(Language.getMsg(player, Messages.CONFIG_SET_OP_ONLY));
            return true;
        }
        if (args.length < 3 || !args[0].equalsIgnoreCase("set")) {
            sender.sendMessage(Language.getMsg(player, Messages.CONFIG_SET_USAGE).replace("{command}", getParent().getName()));
            return true;
        }
        BedWars.configurationReloadService.setMainConfiguration(sender, args[1],
                String.join(" ", Arrays.copyOfRange(args, 2, args.length)));
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return Collections.singletonList("set");
    }
}

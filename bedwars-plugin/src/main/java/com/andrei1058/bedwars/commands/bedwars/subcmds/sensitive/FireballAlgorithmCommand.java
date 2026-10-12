package com.andrei1058.bedwars.commands.bedwars.subcmds.sensitive;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import com.andrei1058.bedwars.configuration.Permissions;
import com.andrei1058.bedwars.listeners.FireballAlgorithm;
import com.andrei1058.bedwars.listeners.FireballListener;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Locale;

/** 保存并刷新算法选择，不重载竞技场或在途火球。 */
public class FireballAlgorithmCommand extends SubCommand {
    public FireballAlgorithmCommand(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(11);
        showInList(true);
        setPermission(Permissions.PERMISSION_RELOAD);
        setDisplayInfo(MainCommand.createTC(Language.getMsg(null, Messages.COMMAND_FIREBALL_ALGORITHM_DISPLAY)
                .replace("{command}", parent.getName()), "/" + parent.getName() + " " + name,
                Language.getMsg(null, Messages.COMMAND_FIREBALL_ALGORITHM_USAGE).replace("{command}", parent.getName())));
    }

    @Override
    public boolean hasPermission(CommandSender sender) {
        return sender.isOp() && super.hasPermission(sender);
    }

    @Override
    public boolean canSee(CommandSender sender, com.andrei1058.bedwars.api.BedWars api) {
        return hasPermission(sender);
    }

    @Override
    public boolean execute(String[] args, CommandSender sender) {
        Player player = sender instanceof Player ? (Player) sender : null;
        if (!hasPermission(sender)) {
            sender.sendMessage(Language.getMsg(player, Messages.CONFIG_SET_OP_ONLY));
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage(Language.getMsg(player, Messages.COMMAND_FIREBALL_ALGORITHM_CURRENT)
                    .replace("{algorithm}", FireballListener.getAlgorithm().name().toLowerCase(Locale.ROOT)));
        } else if (args.length == 1) {
            try {
                FireballAlgorithm value = FireballAlgorithm.parse(args[0]);
                BedWars.configurationReloadService.setMainConfiguration(sender, ConfigPath.GENERAL_FIREBALL_ALGORITHM,
                        value.name().toLowerCase(Locale.ROOT));
                return true;
            } catch (IllegalArgumentException ignored) {
            }
        }
        sender.sendMessage(Language.getMsg(player, Messages.COMMAND_FIREBALL_ALGORITHM_USAGE)
                .replace("{command}", getParent().getName()));
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return List.of("default", "astra");
    }
}

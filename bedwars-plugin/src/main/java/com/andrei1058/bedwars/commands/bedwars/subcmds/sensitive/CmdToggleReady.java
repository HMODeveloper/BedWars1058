package com.andrei1058.bedwars.commands.bedwars.subcmds.sensitive;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.configuration.Permissions;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public class CmdToggleReady extends SubCommand {

    public CmdToggleReady(ParentCommand parent, String name) {
        super(parent, name);
        showInList(true);
        setPriority(25);
        setPermission(Permissions.PERMISSION_TOGGLE_READY);
        setDisplayInfo(new TextComponent(ChatColor.YELLOW + "/bw toggleReady " + ChatColor.GRAY + "- Toggle ready check feature."));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        boolean currentStatus = BedWars.config.getBoolean(ConfigPath.GENERAL_CONFIGURATION_ENABLE_READY_CHECK);
        boolean newStatus = !currentStatus;
        
        // Update config
        BedWars.config.set(ConfigPath.GENERAL_CONFIGURATION_ENABLE_READY_CHECK, newStatus);
        BedWars.config.save();
        
        Player p = (s instanceof Player) ? (Player) s : null;

        if (newStatus) {
            s.sendMessage(Language.getMsg(p, Messages.COMMAND_TOGGLE_READY_ENABLED));
        } else {
            s.sendMessage(Language.getMsg(p, Messages.COMMAND_TOGGLE_READY_DISABLED));
        }
        
        // Update all arenas
        for (IArena arena : Arena.getArenas()) {
            if (arena instanceof Arena) {
                ((Arena) arena).updateReadyStatus(newStatus);
            }
        }
        
        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return Collections.emptyList();
    }
}

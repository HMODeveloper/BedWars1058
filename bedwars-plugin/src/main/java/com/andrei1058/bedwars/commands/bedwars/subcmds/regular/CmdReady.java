package com.andrei1058.bedwars.commands.bedwars.subcmds.regular;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public class CmdReady extends SubCommand {

    public CmdReady(ParentCommand parent, String name) {
        super(parent, name);
        showInList(true);
        setPriority(20);
        setDisplayInfo(new TextComponent(ChatColor.YELLOW + "/bw ready " + ChatColor.GRAY + "- Toggle ready status."));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (!BedWars.config.getBoolean(ConfigPath.GENERAL_CONFIGURATION_ENABLE_READY_CHECK)) {
            if (s instanceof Player) {
                s.sendMessage(Language.getMsg((Player) s, Messages.COMMAND_READY_DISABLED));
            } else {
                s.sendMessage(ChatColor.RED + "This command is disabled.");
            }
            return true;
        }

        if (!(s instanceof Player)) {
            return false;
        }

        Player p = (Player) s;
        IArena arena = Arena.getArenaByPlayer(p);

        if (arena == null) {
            p.sendMessage(Language.getMsg(p, Messages.COMMAND_READY_NOT_IN_GAME));
            return true;
        }

        // Check if arena is waiting or starting
        if (arena.getStatus() != GameState.waiting && arena.getStatus() != GameState.starting) {
             p.sendMessage(Language.getMsg(p, Messages.COMMAND_READY_NOT_WAITING));
             return true;
        }

        if (arena.isSpectator(p)) {
             p.sendMessage(Language.getMsg(p, Messages.COMMAND_READY_SPECTATOR));
             return true;
        }
        
        if (arena instanceof Arena) {
            Arena a = (Arena) arena;
            boolean isReady = a.isPlayerReady(p);
            a.setPlayerReady(p, !isReady);
            // Messages are sent in setPlayerReady now
        }

        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return Collections.emptyList();
    }
}

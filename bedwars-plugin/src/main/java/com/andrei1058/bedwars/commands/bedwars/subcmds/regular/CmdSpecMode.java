/*
 * BedWars1058 - A bed wars mini-game.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Contact e-mail: andrew.dascalu@gmail.com
 */

package com.andrei1058.bedwars.commands.bedwars.subcmds.regular;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.commands.bedwars.MainCommand;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

import static com.andrei1058.bedwars.api.language.Language.getMsg;

public class CmdSpecMode extends SubCommand {

    public CmdSpecMode(ParentCommand parent, String name) {
        super(parent, name);
        setPriority(20);
        showInList(true);
        setDisplayInfo(MainCommand.createTC("§6 ▪ §7/" + MainCommand.getInstance().getName() + " specmode", "/" + getParent().getName() + " " + getSubCommandName(), "§fToggle between vanilla spectator and plugin spectator mode."));
    }

    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;

        IArena a = Arena.getArenaByPlayer(p);
        if (a == null) return false;
        if (!a.isSpectator(p)) return false;

        if (p.getGameMode() == GameMode.SPECTATOR) {
            // Switch to Normal mode
            p.setGameMode(GameMode.ADVENTURE);
            p.setAllowFlight(true);
            p.setFlying(true);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 1, false));
            a.sendSpectatorCommandItems(p);
            p.sendMessage(getMsg(p, Messages.COMMAND_SPECTATOR_MODE_SWITCH_NORMAL));
        } else {
            // Switch to Vanilla mode
            p.setGameMode(GameMode.SPECTATOR);
            p.getInventory().clear();
            p.sendMessage(getMsg(p, Messages.COMMAND_SPECTATOR_MODE_SWITCH_VANILLA));
        }

        return true;
    }

    @Override
    public List<String> getTabComplete() {
        return null;
    }

    @Override
    public boolean canSee(CommandSender s, com.andrei1058.bedwars.api.BedWars api) {
        if (s instanceof ConsoleCommandSender) return false;
        Player p = (Player) s;
        IArena a = Arena.getArenaByPlayer(p);
        return a != null && a.isSpectator(p);
    }
}

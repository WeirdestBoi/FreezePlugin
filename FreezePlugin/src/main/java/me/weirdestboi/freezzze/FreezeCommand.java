package me.weirdestboi.freezzze;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FreezeCommand implements CommandExecutor {


    Freezzze plugin;

    public FreezeCommand(Freezzze plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (plugin.FrozenPlayers.contains(target)) {
                plugin.FrozenPlayers.remove(target);
                target.sendMessage("§fYou got §aUNFROZEN§f by Staff!");
                sender.sendMessage("§fYou just Froze §a" + target.getName());
                System.out.println(ChatColor.GREEN + sender.getName() + "§fJust froze§e" + target.getName());
            } else {
                plugin.FrozenPlayers.add(target);
                target.sendMessage("§fYou got §aFROZEN§f by Staff!");
                sender.sendMessage("§fYou just unFroze §a" + target.getName());
                System.out.println(ChatColor.GREEN + sender.getName() + "§fJust unFroze§e" + target.getName());
            }
        }

        return true;
    }
}

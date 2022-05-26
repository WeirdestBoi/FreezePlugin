package me.weirdestboi.freezzze;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import me.weirdestboi.freezzze.FreezeCommand;
import me.weirdestboi.freezzze.FreezeListener;

import java.util.ArrayList;

public final class Freezzze extends JavaPlugin {
    public ArrayList<Player> FrozenPlayers = new ArrayList<>();

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("freeze").setExecutor(new FreezeCommand(this));
        getCommand("freezelist").setExecutor(new FreezeListCommand(this));
        getServer().getPluginManager().registerEvents(new FreezeListener(this), this);
    }
}

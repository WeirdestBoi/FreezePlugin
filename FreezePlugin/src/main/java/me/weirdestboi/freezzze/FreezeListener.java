package me.weirdestboi.freezzze;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;

public class FreezeListener implements Listener {

    Freezzze plugin;

    public FreezeListener(Freezzze plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        if (plugin.FrozenPlayers.contains(e.getPlayer())) {
            player.teleport(e.getFrom());
        }
    }

}

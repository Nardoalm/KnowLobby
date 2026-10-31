package com.knowplugins.lobby.listener.list;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SpawnListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);

        Player player = event.getPlayer();

        if(player == null) {
            return;
        }


    }

    private void handleVipPlayer(Player player){


        if(!player.hasPermission()) {}
        player.setAllowFlight(true);
        player.setFlying(true);

        Bukkit.broadcastMessage("")
    }

    private void sendWelcomeMessage(Player player){
        if()
    }
}

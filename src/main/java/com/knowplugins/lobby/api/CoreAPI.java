package com.knowplugins.lobby.api;

import org.bukkit.entity.Player;

public interface CoreAPI {
    boolean isVip(Player player);

    boolean isDisguise(Player player);
    String getDisguiseNick(Player player);

    void addVanish(Player player);
    void removeVanish(Player player);
    boolean isVanished(Player player);


}

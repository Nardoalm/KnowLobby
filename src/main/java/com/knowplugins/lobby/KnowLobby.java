package com.knowplugins.lobby;

import org.bukkit.plugin.java.JavaPlugin;

public class KnowLobby extends JavaPlugin {
    private static KnowLobby instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    public static KnowLobby getInstance() {
        return instance;
    }
}
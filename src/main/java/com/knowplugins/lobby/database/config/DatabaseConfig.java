package com.knowplugins.lobby.database.config;

import com.knowplugins.lobby.KnowLobby;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class DatabaseConfig {
    private final KnowLobby plugin;
    private final File file;
    private FileConfiguration config;

    public DatabaseConfig(KnowLobby plugin) {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), "database.yml");
        loadConfig();
    }

    public void loadConfig() {
        if(!file.exists()) {
            file.getParentFile().mkdirs();
            plugin.saveResource("database.yml", false);
        }

        this.config = YamlConfiguration.loadConfiguration(file);
    }

    public FileConfiguration getConfig() {
        return this.config;
    }

    public void saveConfig() {
        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

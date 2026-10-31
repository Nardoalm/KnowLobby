package com.knowplugins.lobby.database;

import com.knowplugins.lobby.database.config.DatabaseConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.bukkit.configuration.file.FileConfiguration;

public class DatabaseManager {
    private static HikariDataSource dataSource;

    public DatabaseManager(DatabaseConfig databaseConfig) {
        FileConfiguration configFile = databaseConfig.getConfig();
        HikariConfig config = new HikariConfig();

        String host = configFile.getString("database.host");
        int port = configFile.getInt("database.port");
        String database = configFile.getString("database.database", "knowlobby");
        String user = configFile.getString("database.user", "knowuser");
        String password = configFile.getString("database.password", "knowpassword");

        int maxPool = configFile.getInt("database.pool.maximum-pool-size", 10);
        int minIdle = configFile.getInt("database.pool.minimum-idle", 5);
        long timeout = configFile.getLong("database.pool.connection-timeout", 30000);

        config.setJdbcUrl("jdbc:postgresql://" + host + ":" + port + "/" + database);
        config.set
    }
}

package com.knowplugins.lobby.util;

public class Logger {
    public static void warn(String msg){
        System.out.print("§8(§7KnowLobby§8) §8[§eWARN§8]: §7" + msg);
    }

    public static void info(String msg){
        System.out.print("§8(§7KnowLobby§8) §8[§9INFO§8]: §7" + msg);
    }

    public static void debug(String msg){
        System.out.print("§8(§7KnowLobby§8) §8[§cDEBUG§8]: §7" + msg);
    }

    public static void error(String msg){
        System.out.print("§8(§7KnowLobby§8) §8[§4ERROR§8]: §7" + msg);
    }
}

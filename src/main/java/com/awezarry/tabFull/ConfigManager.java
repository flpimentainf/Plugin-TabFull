package com.awezarry.tabFull;

import org.bukkit.ChatColor;

public class ConfigManager {

    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String format(String input, String player, int ping, int online) {
        return input.replace("%player%", player)
                .replace("%ping%", String.valueOf(ping))
                .replace("%online%", String.valueOf(online))
                .replace("%site%", TabFull.getInstance().getConfig().getString("links.site"))
                .replace("%discord%", TabFull.getInstance().getConfig().getString("links.discord"));
    }
}
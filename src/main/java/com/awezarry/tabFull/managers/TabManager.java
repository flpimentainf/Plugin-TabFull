package com.awezarry.tabFull.managers;

import com.awezarry.tabFull.ConfigManager;
import com.awezarry.tabFull.TabFull;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TabManager {

    public static void setTabFor(Player player) {
        String rawHeader = TabFull.getInstance().getConfig().getString("tab.header");
        String rawFooter = TabFull.getInstance().getConfig().getString("tab.footer");

        String header = ConfigManager.color(ConfigManager.format(rawHeader, player.getName(), player.getPing(), Bukkit.getOnlinePlayers().size()));
        String footer = ConfigManager.color(ConfigManager.format(rawFooter, player.getName(), player.getPing(), Bukkit.getOnlinePlayers().size()));

        player.setPlayerListHeaderFooter(header, footer);
    }
}

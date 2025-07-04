package com.awezarry.tabFull.managers;

import com.awezarry.tabFull.ConfigManager;
import com.awezarry.tabFull.TabFull;
import org.bukkit.Bukkit;
import org.bukkit.boss.BossBar;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class BossBarManager {

    private static BossBar bossBar;

    public static void setBossBar(Player player) {

        String txtBar = ChatColor.translateAlternateColorCodes('&',
                TabFull.getInstance().getConfig().getString("bossBar.txtbar"));
        String colorBarStr = TabFull.getInstance().getConfig().getString("bossBar.colorbar");
        String sizeBarStr = TabFull.getInstance().getConfig().getString("bossBar.sizebar");
        double progressBar = TabFull.getInstance().getConfig().getDouble("bossBar.progressbar");

        BarColor colorBar;
        BarStyle styleBar;


        try {
            colorBar = BarColor.valueOf(colorBarStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            colorBar = BarColor.RED;
        }

        try {
            styleBar = BarStyle.valueOf(sizeBarStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            styleBar = BarStyle.SOLID;
        }

        if (bossBar == null) {
            bossBar = Bukkit.createBossBar(txtBar, colorBar, styleBar);
            bossBar.setProgress(Math.max(0.0, Math.min(progressBar, 1.0)));
        }

        bossBar.addPlayer(player);
    }

    public static void removeBossBar(Player player) {
        if (bossBar != null) {
            bossBar.removePlayer(player);
        }
    }
}

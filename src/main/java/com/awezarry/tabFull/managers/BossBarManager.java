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
        if (bossBar == null) {
            bossBar = Bukkit.createBossBar(
                    ChatColor.DARK_RED + "☾ " + ChatColor.RED + "Bem-vindo ao " + ChatColor.DARK_GRAY + "NYX WARS" + ChatColor.DARK_RED + " ☽",
                    BarColor.RED,
                    BarStyle.SEGMENTED_10
            );
            bossBar.setProgress(0.5);
        }

        bossBar.addPlayer(player);
    }

    public static void removeBossBar(Player player) {
        if (bossBar != null) {
            bossBar.removePlayer(player);
        }
    }
}

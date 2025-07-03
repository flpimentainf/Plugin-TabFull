package com.awezarry.tabFull.managers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TabManager {

    public static void setTabFor(Player player) {
        String header = ChatColor.DARK_RED + "" + ChatColor.BOLD + "✦ NYX WARS ✦\n" +
                ChatColor.GRAY + "Servidor Factions\n" +
                ChatColor.DARK_AQUA + "Bem-vindo, " + ChatColor.AQUA + player.getName() + "!";

        String footer = ChatColor.DARK_GRAY + "━━━━━━━━━━━━━━━━━━━━━━\n" +
                ChatColor.GOLD + "🌐 Site: " + ChatColor.YELLOW + "Em manutenção\n" +
                ChatColor.BLUE + "💬 Discord: " + ChatColor.AQUA + "discord.gg/4cSu6yZy9S\n" +
                ChatColor.GREEN + "👥 Online: " + Bukkit.getOnlinePlayers().size() +
                ChatColor.DARK_GRAY + " │ " +
                ChatColor.LIGHT_PURPLE + "📶 Ping: " + ChatColor.WHITE + player.getPing() + "ms\n" +
                ChatColor.DARK_GRAY + "━━━━━━━━━━━━━━━━━━━━━━";

        player.setPlayerListHeaderFooter(header, footer);

    }
}

package com.awezarry.tabFull;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TabFull extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        String header = ChatColor.DARK_RED + "" + ChatColor.BOLD + "✦ NIGHTFALL ✦\n" +
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

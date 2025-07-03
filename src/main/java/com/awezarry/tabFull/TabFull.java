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
        String header = ChatColor.GOLD + "" + ChatColor.BOLD +"§6NIGHTFALL\n§7Servidor Factions" + ChatColor.AQUA + "\nBem-vindo " + player.getName();
        String footer = ChatColor.GRAY + "\n§eSite: Em Manutenção\n§fDiscord: https://discord.gg/4cSu6yZy9S" + "\nOnline: " + Bukkit.getOnlinePlayers().size() + "Ping: " + player.getPing();
        player.setPlayerListHeaderFooter(header, footer);
    }
}

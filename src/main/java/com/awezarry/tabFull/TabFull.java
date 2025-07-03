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
        e.getPlayer().setPlayerListHeaderFooter(ChatColor.GOLD + "" + ChatColor.BOLD +"§6NIGHTFALL\n§7Servidor Survival",
                "§eSite: nightfall.com\n§fDiscord: discord.gg/nightfall");

        Player player = e.getPlayer();
        String header = ChatColor.AQUA + "Bem-vindo " + player.getName();
        String footer = ChatColor.GRAY + "Online: " + Bukkit.getOnlinePlayers().size();
        player.setPlayerListHeaderFooter(header, footer);
    }
}

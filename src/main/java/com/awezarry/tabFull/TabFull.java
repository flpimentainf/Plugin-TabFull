package com.awezarry.tabFull;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class TabFull extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

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

        player.sendTitle(ChatColor.RED + "✦ NYX WARS ✦",
                ChatColor.GRAY + "Servidor Factions PvP",
                10,
                70,
                20);


        if (!player.hasPlayedBefore()) {
            player.sendMessage(ChatColor.GREEN + "Essa é sua primeira vez aqui, " + player.getName() + "! Divirta-se!");
        }
        player.sendMessage(ChatColor.GOLD + "Bem-vindo ao " + ChatColor.RED + "NYX WARS" + ChatColor.GOLD + ", " + ChatColor.AQUA + player.getName() + "!");
        player.sendMessage(ChatColor.GRAY + "Use " + ChatColor.YELLOW + "/ajuda" + ChatColor.GRAY + " para ver os comandos disponíveis.");

        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
        player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 60, 0, false, false));

        getLogger().info("Jogador " + player.getName() + " entrou no servidor.");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();

        getLogger().info("Jogador " + player.getName() + " Saiu do servidor.");

    }
}

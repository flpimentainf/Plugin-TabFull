package com.awezarry.tabFull.listener;

import com.awezarry.tabFull.managers.TabManager;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import com.awezarry.tabFull.TabFull;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.Bukkit.getLogger;

public class JoinListener implements Listener {

    private final TabFull plugin;

    public JoinListener(TabFull plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        player.sendTitle(ChatColor.RED + "✦ NYX WARS ✦",
                ChatColor.GRAY + "Servidor Factions",
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

        // Tab customizado
        TabManager.setTabFor(player);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();

        getLogger().info("Jogador " + player.getName() + " Saiu do servidor.");

    }
}

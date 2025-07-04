package com.awezarry.tabFull.listener;

import com.awezarry.tabFull.ConfigManager;
import com.awezarry.tabFull.TabFull;
import com.awezarry.tabFull.managers.TabManager;
import com.awezarry.tabFull.managers.BossBarManager;
import com.awezarry.tabFull.managers.FireWorksManager;
import com.awezarry.tabFull.managers.EffectsManager;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private final TabFull plugin;

    public JoinListener(TabFull plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        String msg = plugin.getConfig().getString("join.message");
        player.sendMessage(ConfigManager.color(ConfigManager.format(msg, player.getName(), player.getPing(), Bukkit.getOnlinePlayers().size())));

        String title = plugin.getConfig().getString("join.title");
        String subtitle = plugin.getConfig().getString("join.subtitle");
        player.sendTitle(ConfigManager.color(title), ConfigManager.color(subtitle), 10, 70, 20);

        String soundName = plugin.getConfig().getString("join.sound");
        try {
            Sound sound = Sound.valueOf(soundName.toUpperCase());
            player.playSound(player.getLocation(), sound, 1.0f, 1.0f);
        } catch (IllegalArgumentException ex) {
            plugin.getLogger().warning("Som inválido em config.yml: " + soundName);
        }

        TabManager.setTabFor(player);
        BossBarManager.setBossBar(player);
        EffectsManager.setEffect(player);
        FireWorksManager.setFireWork(player);
    }
}

package com.awezarry.tabFull;

import com.awezarry.tabFull.listener.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TabFull extends JavaPlugin {

    private static TabFull instance;

    @Override
    public void onEnable() {
        instance = this;

        // Carrega config.yml
        saveDefaultConfig();

        // Eventos
        Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);

        getLogger().info("TabFull com config ativado.");
    }

    public static TabFull getInstance() {
        return instance;
    }
}

package com.awezarry.tabFull;

import com.awezarry.tabFull.listener.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TabFull extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registro de eventos
        Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
        getLogger().info("TabFull ativado com sucesso!");
    }
}

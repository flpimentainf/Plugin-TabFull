package com.awezarry.tabFull.managers;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireWorksManager {

    public static void setFireWork(Player player) {

        Firework firework = player.getPlayer().getWorld().spawn(player.getPlayer().getLocation(), Firework.class);
        FireworkMeta meta = (FireworkMeta) firework.getFireworkMeta();
        meta.addEffect(FireworkEffect.builder().withColor(Color.RED).withColor(Color.LIME).with(Type.STAR).withFlicker().build());
        meta.setPower(1);
        firework.setFireworkMeta(meta);
    }
}

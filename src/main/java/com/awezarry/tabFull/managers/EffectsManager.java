package com.awezarry.tabFull.managers;


import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectsManager {

    public static void setEffect(Player player) {
        player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED,
                200,
                3));

    }
}

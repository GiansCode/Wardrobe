package com.gianscode.wardrobe.listeners;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoin implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = (Player) e.getPlayer();

		ItemStack is = new ItemStack(Material.BOOK);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Wardrobe");
		meta.setLore(Arrays.asList(ChatColor.WHITE + "Change how you look ingame!"));
		is.setItemMeta(meta);

		if (p.getInventory().contains(is)) {
			return;
		} else {
			p.getInventory().addItem(is);
		}
	}
}
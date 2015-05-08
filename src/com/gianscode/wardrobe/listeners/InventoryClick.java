package com.gianscode.wardrobe.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.gianscode.wardrobe.Main;

public class InventoryClick implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		HumanEntity he = e.getWhoClicked();

		if (he instanceof Player) {
			Player p = (Player) he;

			if (e.getInventory().getName() == Main.getInventory().getName()) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.LEATHER_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
					p.sendMessage(ChatColor.GREEN + "You selected the leather set!");
				}

				if (clicked.getType() == Material.GOLD_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));
					p.sendMessage(ChatColor.GREEN + "You selected the gold set!");
				}

				if (clicked.getType() == Material.IRON_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
					p.sendMessage(ChatColor.GREEN + "You selected the iron set!");
				}

				if (clicked.getType() == Material.DIAMOND_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
					p.sendMessage(ChatColor.GREEN + "You selected the diamond set!");
				}

				if (clicked.getType() == Material.CHAINMAIL_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					p.sendMessage(ChatColor.GREEN + "You selected the chainmail set!");
				}
			} else return;
		}
	}
}
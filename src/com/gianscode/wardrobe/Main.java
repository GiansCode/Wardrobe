package com.gianscode.wardrobe;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import com.gianscode.wardrobe.commands.OpenMenu;
import com.gianscode.wardrobe.commands.RemoveArmor;
import com.gianscode.wardrobe.listeners.InventoryClick;
import com.gianscode.wardrobe.listeners.PlayerInteract;
import com.gianscode.wardrobe.listeners.PlayerJoin;

public class Main extends JavaPlugin implements Listener {

	static Inventory inv;

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClick(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

		getCommand("openmenu").setExecutor(new OpenMenu());
		getCommand("removearmor").setExecutor(new RemoveArmor());

		Bukkit.getServer().getLogger().info("[Wardrobe] Enabled!");
	}

	@Override
	public void onDisable() {
		Bukkit.getServer().getLogger().info("[Wardrobe] Disabled!");
	}

	public static Inventory getInventory() {
		inv = Bukkit.getServer().createInventory(null, 9 * 1, "Change how you look ingame!");

		{
			ItemStack is = new ItemStack(Material.LEATHER_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leather Armour");
			meta.setLore(Arrays.asList(ChatColor.WHITE + "Wear a full set of leather armour!"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}

		{
			ItemStack is = new ItemStack(Material.GOLD_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Armour");
			meta.setLore(Arrays.asList(ChatColor.WHITE + "Wear a full set of gold armour!"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}

		{
			ItemStack is = new ItemStack(Material.IRON_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Iron Armour");
			meta.setLore(Arrays.asList(ChatColor.WHITE + "Wear a full set of iron armour!"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}

		{
			ItemStack is = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Armour");
			meta.setLore(Arrays.asList(ChatColor.WHITE + "Wear a full set of diamond armour!"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}

		{
			ItemStack is = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chainmail Armour");
			meta.setLore(Arrays.asList(ChatColor.WHITE + "Wear a full set of chainmail armour!"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}

		return inv;
	}
}

/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.random.item.YoshiItem;
import net.mcreator.random.item.MethItem;
import net.mcreator.random.item.DildoItem;
import net.mcreator.random.item.DevarmorItem;
import net.mcreator.random.item.CocainerItem;
import net.mcreator.random.item.CheesearmorItem;
import net.mcreator.random.item.CavesItem;
import net.mcreator.random.item.BreakingbadthemeItem;
import net.mcreator.random.RandomShitMod;

public class RandomShitModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomShitMod.MODID);
	public static final RegistryObject<Item> CAVES = REGISTRY.register("caves", () -> new CavesItem());
	public static final RegistryObject<Item> BREAKINGBADTHEME = REGISTRY.register("breakingbadtheme", () -> new BreakingbadthemeItem());
	public static final RegistryObject<Item> COCAINER = REGISTRY.register("cocainer", () -> new CocainerItem());
	public static final RegistryObject<Item> METH = REGISTRY.register("meth", () -> new MethItem());
	public static final RegistryObject<Item> METHPLANT = block(RandomShitModBlocks.METHPLANT, RandomShitModTabs.TAB_SHIT);
	public static final RegistryObject<Item> YOSHI = REGISTRY.register("yoshi", () -> new YoshiItem());
	public static final RegistryObject<Item> DILDO = REGISTRY.register("dildo", () -> new DildoItem());
	public static final RegistryObject<Item> DEVARMOR_HELMET = REGISTRY.register("devarmor_helmet", () -> new DevarmorItem.Helmet());
	public static final RegistryObject<Item> DEVARMOR_CHESTPLATE = REGISTRY.register("devarmor_chestplate", () -> new DevarmorItem.Chestplate());
	public static final RegistryObject<Item> DEVARMOR_LEGGINGS = REGISTRY.register("devarmor_leggings", () -> new DevarmorItem.Leggings());
	public static final RegistryObject<Item> DEVARMOR_BOOTS = REGISTRY.register("devarmor_boots", () -> new DevarmorItem.Boots());
	public static final RegistryObject<Item> CHEESEARMOR_HELMET = REGISTRY.register("cheesearmor_helmet", () -> new CheesearmorItem.Helmet());
	public static final RegistryObject<Item> CHEESEARMOR_CHESTPLATE = REGISTRY.register("cheesearmor_chestplate",
			() -> new CheesearmorItem.Chestplate());
	public static final RegistryObject<Item> CHEESEARMOR_LEGGINGS = REGISTRY.register("cheesearmor_leggings", () -> new CheesearmorItem.Leggings());
	public static final RegistryObject<Item> CHEESEARMOR_BOOTS = REGISTRY.register("cheesearmor_boots", () -> new CheesearmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

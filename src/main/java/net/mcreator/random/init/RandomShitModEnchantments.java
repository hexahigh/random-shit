
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.random.enchantment.YEETEnchantment;
import net.mcreator.random.RandomShitMod;

public class RandomShitModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RandomShitMod.MODID);
	public static final RegistryObject<Enchantment> YEET = REGISTRY.register("yeet", () -> new YEETEnchantment());
}

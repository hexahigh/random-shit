
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.random.potion.CheeseeffectMobEffect;
import net.mcreator.random.RandomShitMod;

public class RandomShitModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RandomShitMod.MODID);
	public static final RegistryObject<MobEffect> CHEESEEFFECT = REGISTRY.register("cheeseeffect", () -> new CheeseeffectMobEffect());
}

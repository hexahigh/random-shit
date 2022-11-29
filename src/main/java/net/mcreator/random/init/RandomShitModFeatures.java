
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.random.world.features.plants.MethplantFeature;
import net.mcreator.random.RandomShitMod;

@Mod.EventBusSubscriber
public class RandomShitModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RandomShitMod.MODID);
	public static final RegistryObject<Feature<?>> METHPLANT = REGISTRY.register("methplant", MethplantFeature::feature);
}

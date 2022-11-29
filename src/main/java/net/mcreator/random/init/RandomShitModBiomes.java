
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.random.world.biome.CavesbiomeBiome;
import net.mcreator.random.RandomShitMod;

public class RandomShitModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, RandomShitMod.MODID);
	public static final RegistryObject<Biome> CAVESBIOME = REGISTRY.register("cavesbiome", CavesbiomeBiome::createBiome);
}

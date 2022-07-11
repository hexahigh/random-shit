
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.random.world.biome.CavesbiomeBiome;
import net.mcreator.random.RandomShitMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomShitModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, RandomShitMod.MODID);
	public static final RegistryObject<Biome> CAVESBIOME = REGISTRY.register("cavesbiome", () -> CavesbiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CavesbiomeBiome.init();
		});
	}
}

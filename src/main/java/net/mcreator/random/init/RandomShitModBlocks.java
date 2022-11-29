
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.random.block.MethplantBlock;
import net.mcreator.random.block.CavesPortalBlock;
import net.mcreator.random.RandomShitMod;

public class RandomShitModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomShitMod.MODID);
	public static final RegistryObject<Block> CAVES_PORTAL = REGISTRY.register("caves_portal", () -> new CavesPortalBlock());
	public static final RegistryObject<Block> METHPLANT = REGISTRY.register("methplant", () -> new MethplantBlock());
}

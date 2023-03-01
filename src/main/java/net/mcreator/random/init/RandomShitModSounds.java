
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.random.RandomShitMod;

public class RandomShitModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RandomShitMod.MODID);
	public static final RegistryObject<SoundEvent> YOSHI_ATHLETIC_THEME_TRAP_REMIX = REGISTRY.register("yoshi-athletic-theme-trap-remix",
			() -> new SoundEvent(new ResourceLocation("random_shit", "yoshi-athletic-theme-trap-remix")));
	public static final RegistryObject<SoundEvent> BREAKING_BAD = REGISTRY.register("breaking_bad",
			() -> new SoundEvent(new ResourceLocation("random_shit", "breaking_bad")));
	public static final RegistryObject<SoundEvent> SNORT = REGISTRY.register("snort",
			() -> new SoundEvent(new ResourceLocation("random_shit", "snort")));
	public static final RegistryObject<SoundEvent> DREAM_CHEESE = REGISTRY.register("dream_cheese",
			() -> new SoundEvent(new ResourceLocation("random_shit", "dream_cheese")));
}

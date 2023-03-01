package net.mcreator.random.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.random.init.RandomShitModMobEffects;

public class CheesearmorprocProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(RandomShitModMobEffects.CHEESEEFFECT.get(), 1, 1, (false), (false)));
	}
}

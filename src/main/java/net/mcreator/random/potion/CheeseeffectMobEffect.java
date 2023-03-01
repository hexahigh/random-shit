
package net.mcreator.random.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.random.procedures.CheesesmellProcedure;

public class CheeseeffectMobEffect extends MobEffect {
	public CheeseeffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_shit.cheeseeffect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CheesesmellProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

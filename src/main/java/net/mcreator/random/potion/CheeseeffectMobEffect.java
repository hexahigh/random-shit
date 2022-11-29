
package net.mcreator.random.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CheeseeffectMobEffect extends MobEffect {
	public CheeseeffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_shit.cheeseeffect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

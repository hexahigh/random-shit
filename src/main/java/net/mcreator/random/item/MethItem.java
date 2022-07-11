
package net.mcreator.random.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.random.init.RandomShitModTabs;

public class MethItem extends Item {
	public MethItem() {
		super(new Item.Properties().tab(RandomShitModTabs.TAB_SHIT).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(20).saturationMod(-10f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}
}

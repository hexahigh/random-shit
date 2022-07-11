
package net.mcreator.random.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.random.init.RandomShitModTabs;
import net.mcreator.random.init.RandomShitModSounds;

public class BreakingbadthemeItem extends RecordItem {
	public BreakingbadthemeItem() {
		super(0, RandomShitModSounds.REGISTRY.get(new ResourceLocation("random_shit:breaking_bad")),
				new Item.Properties().tab(RandomShitModTabs.TAB_SHIT).stacksTo(1).rarity(Rarity.RARE));
	}
}

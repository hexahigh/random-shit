
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.random.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomShitModTabs {
	public static CreativeModeTab TAB_SHIT;

	public static void load() {
		TAB_SHIT = new CreativeModeTab("tabshit") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomShitModItems.CAVES.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

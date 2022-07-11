
package net.mcreator.random.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.random.init.RandomShitModItems;

public class YEETEnchantment extends Enchantment {
	public YEETEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 60000;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.STICK)
			return true;
		if (stack.getItem() == RandomShitModItems.DILDO.get())
			return true;
		return false;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}

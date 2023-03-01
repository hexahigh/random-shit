package net.mcreator.random.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CheesesmellProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String randomvelocityX = "";
		String randomvelocityY = "";
		entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 0, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1))));
		{
			ItemStack _ist = new ItemStack(Items.DIAMOND_HELMET);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.DIAMOND_CHESTPLATE);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.DIAMOND_LEGGINGS);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.DIAMOND_BOOTS);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.IRON_HELMET);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.IRON_CHESTPLATE);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.IRON_LEGGINGS);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.IRON_BOOTS);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.NETHERITE_HELMET);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.NETHERITE_CHESTPLATE);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.NETHERITE_LEGGINGS);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		{
			ItemStack _ist = new ItemStack(Items.NETHERITE_BOOTS);
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}

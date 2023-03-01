
package net.mcreator.random.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.random.procedures.CheesesmellProcedure;
import net.mcreator.random.procedures.CheesearmorprocProcedure;
import net.mcreator.random.init.RandomShitModTabs;

public abstract class CheesearmorItem extends ArmorItem {
	public CheesearmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 100;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1000, 1000, 1000, 1000}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 0;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("random_shit:dream_cheese"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.RAW_GOLD_BLOCK));
			}

			@Override
			public String getName() {
				return "cheesearmor";
			}

			@Override
			public float getToughness() {
				return 9f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CheesearmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/cheesearmortex_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CheesearmorprocProcedure.execute(entity);
		}
	}

	public static class Chestplate extends CheesearmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/cheesearmortex_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CheesearmorprocProcedure.execute(entity);
		}
	}

	public static class Leggings extends CheesearmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/cheesearmortex_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CheesesmellProcedure.execute(entity);
		}
	}

	public static class Boots extends CheesearmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/cheesearmortex_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CheesearmorprocProcedure.execute(entity);
		}
	}
}

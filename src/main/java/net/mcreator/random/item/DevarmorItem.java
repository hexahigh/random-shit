
package net.mcreator.random.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.random.init.RandomShitModTabs;

public abstract class DevarmorItem extends ArmorItem {
	public DevarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{100, 100, 100, 100}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "devarmor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DevarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/dev_armor_tex_layer_1.png";
		}
	}

	public static class Chestplate extends DevarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/dev_armor_tex_layer_1.png";
		}
	}

	public static class Leggings extends DevarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/dev_armor_tex_layer_2.png";
		}
	}

	public static class Boots extends DevarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RandomShitModTabs.TAB_SHIT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_shit:textures/models/armor/dev_armor_tex_layer_1.png";
		}
	}
}

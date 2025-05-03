
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tamesdreamland.init;

import net.tameable.tamesdreamland.item.WakeUpBoostUpgradeItem;
import net.tameable.tamesdreamland.item.DreamUpgradesResetItem;
import net.tameable.tamesdreamland.item.DreamFoodUpgradeItem;
import net.tameable.tamesdreamland.item.DreamFlightUpgradeItem;
import net.tameable.tamesdreamland.item.DreamChestTier3Item;
import net.tameable.tamesdreamland.item.DreamChestTier2Item;
import net.tameable.tamesdreamland.item.DreamChestTier1Item;
import net.tameable.tamesdreamland.item.DreamCatcherItem;
import net.tameable.tamesdreamland.TamesDreamsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class TamesDreamsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TamesDreamsMod.MODID);
	public static final DeferredItem<Item> DREAM_CATCHER = REGISTRY.register("dream_catcher", DreamCatcherItem::new);
	public static final DeferredItem<Item> DREAM_CHEST = block(TamesDreamsModBlocks.DREAM_CHEST);
	public static final DeferredItem<Item> DREAM_FOOD_UPGRADE = REGISTRY.register("dream_food_upgrade", DreamFoodUpgradeItem::new);
	public static final DeferredItem<Item> DREAM_FLIGHT_UPGRADE = REGISTRY.register("dream_flight_upgrade", DreamFlightUpgradeItem::new);
	public static final DeferredItem<Item> WAKE_UP_BOOST_UPGRADE = REGISTRY.register("wake_up_boost_upgrade", WakeUpBoostUpgradeItem::new);
	public static final DeferredItem<Item> DREAM_CHEST_TIER_1 = REGISTRY.register("dream_chest_tier_1", DreamChestTier1Item::new);
	public static final DeferredItem<Item> DREAM_UPGRADES_RESET = REGISTRY.register("dream_upgrades_reset", DreamUpgradesResetItem::new);
	public static final DeferredItem<Item> DREAM_CHEST_TIER_2 = REGISTRY.register("dream_chest_tier_2", DreamChestTier2Item::new);
	public static final DeferredItem<Item> DREAM_CHEST_TIER_3 = REGISTRY.register("dream_chest_tier_3", DreamChestTier3Item::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

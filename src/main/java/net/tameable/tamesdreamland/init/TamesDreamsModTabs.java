
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tamesdreamland.init;

import net.tameable.tamesdreamland.TamesDreamsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TamesDreamsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TamesDreamsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TamesDreamsModItems.DREAM_CATCHER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TamesDreamsModItems.DREAM_FOOD_UPGRADE.get());
			tabData.accept(TamesDreamsModItems.DREAM_FLIGHT_UPGRADE.get());
			tabData.accept(TamesDreamsModItems.WAKE_UP_BOOST_UPGRADE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(TamesDreamsModItems.DREAM_CHEST_TIER_1.get());
				tabData.accept(TamesDreamsModBlocks.DREAM_ANCHOR.get().asItem());
				tabData.accept(TamesDreamsModBlocks.DREAM_ANCHOR_GREY.get().asItem());
				tabData.accept(TamesDreamsModItems.HUB_TELEPORT.get());
			}
		}
	}
}

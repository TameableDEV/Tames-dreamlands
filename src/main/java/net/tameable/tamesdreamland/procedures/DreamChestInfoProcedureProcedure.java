package net.tameable.tamesdreamland.procedures;

import net.tameable.tamesdreamland.init.TamesDreamsModBlocks;

import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import javax.annotation.Nullable;

import java.util.List;

@EventBusSubscriber(value = {Dist.CLIENT})
public class DreamChestInfoProcedureProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == TamesDreamsModBlocks.DREAM_CHEST.get().asItem() && Screen.hasShiftDown()) {
			tooltip.add(Component.literal("\u00A78The Dream Chest Allows Players to Transfer Items from the Dream Lands to Reality (aka anywhere else)"));
			tooltip.add(Component.literal("\u00A78The Higher the Tier, The more space you are granted."));
			tooltip.add(Component.literal("\u00A78Tiers Are Shared arcoss all chests, per player."));
			tooltip.add(Component.literal("\u00A78The Tiers are..."));
			tooltip.add(Component.literal("\u00A7e\u00A7lTier 0 - 3 slots"));
			tooltip.add(Component.literal("\u00A7e\u00A7lTier 1 - 9 slots"));
			tooltip.add(Component.literal("\u00A7e\u00A7lTier 2 - Barrel/Single Chest total Slots"));
			tooltip.add(Component.literal("\u00A7e\u00A7lTier 3 - Double Chest Total Slots"));
		} else if (itemstack.getItem() == TamesDreamsModBlocks.DREAM_CHEST.get().asItem()) {
			tooltip.add(Component.literal("\u00A78\u00A7oHold \u00A7r\u00A7l\u00A7o\u00A76[SHIFT] \u00A7r\u00A78\u00A7ofor more info on this item (Note: A lot of Info btw)."));
		}
	}
}

package net.tameable.tameshodpod.procedures;

import net.tameable.tameshodpod.init.TamesHodpodModItems;

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
public class DreamCatcherInfoProcedureProcedure {
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
		if (itemstack.getItem() == TamesHodpodModItems.DREAM_CATCHER.get() && Screen.hasShiftDown()) {
			tooltip.add(Component.literal("\u00A78Everyday the dream catcher will rotate between 3 different dreams"));
			tooltip.add(Component.literal("\u00A78Sky Dream, Cave Dream, Forest Dream"));
			tooltip.add(Component.literal("\u00A78Each with their own world for you to build in, but your items won't transfer"));
			tooltip.add(Component.literal("\u00A78Create a\u00A7r \u00A7l\u00A76Dream Chest\u00A7r \u00A78to either transfer items between dream and Reality."));
		} else {
			tooltip.add(Component.literal("\u00A78\u00A7oHold \u00A7r\u00A7l\u00A7o\u00A76[SHIFT] \u00A7r\u00A78\u00A7ofor more info on this item..."));
			tooltip.add(Component.literal("\u00A78\u00A7oHold \u00A7r\u00A7l\u00A7o\u00A76[SHIFT] \u00A7r\u00A78\u00A7oand Press \u00A7r\u00A7l\u00A7o\u00A76[Right Click] \u00A7r\u00A78\u00A7oto see upgrades and abilities..."));
		}
	}
}

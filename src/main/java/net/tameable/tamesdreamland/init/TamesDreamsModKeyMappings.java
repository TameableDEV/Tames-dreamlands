
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tamesdreamland.init;

import org.lwjgl.glfw.GLFW;

import net.tameable.tamesdreamland.network.DreamCatcherDisplayUpgradesMessage;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TamesDreamsModKeyMappings {
	public static final KeyMapping DREAM_CATCHER_DISPLAY_UPGRADES = new KeyMapping("key.tames_dreams.dream_catcher_display_upgrades", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new DreamCatcherDisplayUpgradesMessage(0, 0));
				DreamCatcherDisplayUpgradesMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DREAM_CATCHER_DISPLAY_UPGRADES);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				DREAM_CATCHER_DISPLAY_UPGRADES.consumeClick();
			}
		}
	}
}

package net.tameable.tamesdreamland.procedures;

import net.tameable.tamesdreamland.network.TamesDreamsModVariables;
import net.tameable.tamesdreamland.init.TamesDreamsModItems;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class DreamChestUpgradeUseProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CATCHER.get()) {
			if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier == 0 && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_1.get()) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A72\u00A7oThe Link Between Dream and Reality grows slightly stronger..."), false);
				{
					TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
					_vars.DCupgradetier = 1;
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier != 0 && ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_1.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_2.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_3.get())) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l\u00A7oYou do not meet the requirements to use this..."), false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_2.get() && entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier == 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7a\u00A7oThe Link Between Dream And Reality grows Ever Stronger and Larger..."), false);
				{
					TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
					_vars.DCupgradetier = 2;
					_vars.syncPlayerVariables(entity);
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_1.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_2.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_3.get()) && entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier != 1) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l\u00A7oYou do not meet the requirements to use this..."), false);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_3.get() && entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier == 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7e\u00A7oThe Link Between Dream and Reality has grown to it's former glory..."), false);
				{
					TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
					_vars.DCupgradetier = 3;
					_vars.syncPlayerVariables(entity);
				}
			} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_1.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_2.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_3.get()) && entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier != 2) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l\u00A7oYou do not meet the requirements to use this..."), false);
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_1.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_2.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CHEST_TIER_3.get()) && entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DCupgradetier == 3) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l\u00A7oYou're already max tier..."), true);
			}
		}
	}
}

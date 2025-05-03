package net.tameable.tamesdreamland.procedures;

import net.tameable.tamesdreamland.network.TamesDreamsModVariables;
import net.tameable.tamesdreamland.init.TamesDreamsModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class DreamCatcherRightClickUpgradesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TamesDreamsModItems.DREAM_CATCHER.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A78\u00A7o \u00A7r\u00A76\u00A7l[Dream] \u00A7r\u00A78\u00A7oUpgrades:"), false);
			if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DreamFoodUpgrade == false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7l\u00A7oThe \u00A7r\u00A75\u00A7l\u00A7o[Food Upgrade]\u00A7r\u00A74\u00A7l\u00A7o is not installed!"), false);
			} else if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DreamFoodUpgrade == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A72\u00A7l\u00A7oThe \u00A7r\u00A75\u00A7l\u00A7o[Food Upgrade]\u00A7r\u00A72\u00A7l\u00A7o is installed!"), false);
			}
			if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DreamFlightUpgrade == false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7l\u00A7oThe \u00A7r\u00A75\u00A7l\u00A7o[Flight Upgrade]\u00A7r\u00A74\u00A7l\u00A7o is not installed!"), false);
			} else if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DreamFlightUpgrade == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A72\u00A7l\u00A7oThe \u00A7r\u00A75\u00A7l\u00A7o[Flight Upgrade]\u00A7r\u00A72\u00A7l\u00A7o is installed!"), false);
			}
			if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DreamWakeUpUpgrade == false) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A74\u00A7l\u00A7oThe \u00A7r\u00A75\u00A7l\u00A7o[Wake up Boost]\u00A7r\u00A74\u00A7l\u00A7o is not installed!"), false);
			} else if (entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES).DreamWakeUpUpgrade == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A72\u00A7l\u00A7oThe \u00A7r\u00A75\u00A7l\u00A7o[Wake Up Boost]\u00A7r\u00A72\u00A7l\u00A7o is installed!"), false);
			}
		}
	}
}

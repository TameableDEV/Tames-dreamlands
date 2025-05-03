package net.tameable.tamesdreamland.procedures;

import net.tameable.tamesdreamland.network.TamesDreamsModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class DreamUpgradeResetProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
			_vars.DCupgradetier = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
			_vars.DreamFoodUpgrade = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
			_vars.DreamWakeUpUpgrade = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			TamesDreamsModVariables.PlayerVariables _vars = entity.getData(TamesDreamsModVariables.PLAYER_VARIABLES);
			_vars.DreamFlightUpgrade = false;
			_vars.syncPlayerVariables(entity);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal.spawn")), SoundSource.MASTER, 1, (float) 0.5);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal.spawn")), SoundSource.MASTER, 1, (float) 0.5, false);
			}
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7c\u00A7l!! RESETED ALL UPGRADES !!"), true);
	}
}

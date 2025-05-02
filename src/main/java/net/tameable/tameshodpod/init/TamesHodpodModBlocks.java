
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tameshodpod.init;

import net.tameable.tameshodpod.block.DreamChestBlock;
import net.tameable.tameshodpod.TamesHodpodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class TamesHodpodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TamesHodpodMod.MODID);
	public static final DeferredBlock<Block> DREAM_CHEST = REGISTRY.register("dream_chest", DreamChestBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

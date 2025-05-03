
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tamesdreamland.init;

import net.tameable.tamesdreamland.block.DreamStaticBlock;
import net.tameable.tamesdreamland.block.DreamAnchorGreyBlock;
import net.tameable.tamesdreamland.block.DreamAnchorBlock;
import net.tameable.tamesdreamland.TamesDreamsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class TamesDreamsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(TamesDreamsMod.MODID);
	public static final DeferredBlock<Block> DREAM_ANCHOR = REGISTRY.register("dream_anchor", DreamAnchorBlock::new);
	public static final DeferredBlock<Block> DREAM_ANCHOR_GREY = REGISTRY.register("dream_anchor_grey", DreamAnchorGreyBlock::new);
	public static final DeferredBlock<Block> DREAM_STATIC = REGISTRY.register("dream_static", DreamStaticBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tameshodpod.init;

import net.tameable.tameshodpod.item.DreamCatcherItem;
import net.tameable.tameshodpod.TamesHodpodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class TamesHodpodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TamesHodpodMod.MODID);
	public static final DeferredItem<Item> DREAM_CATCHER = REGISTRY.register("dream_catcher", DreamCatcherItem::new);
	public static final DeferredItem<Item> DREAM_CHEST = block(TamesHodpodModBlocks.DREAM_CHEST);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

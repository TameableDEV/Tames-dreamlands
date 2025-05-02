
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tameable.tameshodpod.init;

import net.tameable.tameshodpod.item.DreamCatcherItem;
import net.tameable.tameshodpod.TamesHodpodMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class TamesHodpodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TamesHodpodMod.MODID);
	public static final DeferredItem<Item> DREAM_CATCHER = REGISTRY.register("dream_catcher", DreamCatcherItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}

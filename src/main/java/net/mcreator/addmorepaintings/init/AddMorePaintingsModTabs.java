
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addmorepaintings.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AddMorePaintingsModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(AddMorePaintingsModBlocks.PAINTINGTABLE.get().asItem());
		}
	}
}

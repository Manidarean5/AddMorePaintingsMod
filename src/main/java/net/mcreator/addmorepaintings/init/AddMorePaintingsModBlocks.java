
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addmorepaintings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.addmorepaintings.block.PaintingtableBlock;
import net.mcreator.addmorepaintings.AddMorePaintingsMod;

public class AddMorePaintingsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AddMorePaintingsMod.MODID);
	public static final RegistryObject<Block> PAINTINGTABLE = REGISTRY.register("paintingtable", () -> new PaintingtableBlock());
}

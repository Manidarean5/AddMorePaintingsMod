
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addmorepaintings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.addmorepaintings.AddMorePaintingsMod;

public class AddMorePaintingsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AddMorePaintingsMod.MODID);
	public static final RegistryObject<PaintingVariant> DINOSAURIO_HUEVO = REGISTRY.register("dinosaurio_huevo", () -> new PaintingVariant(64, 32));
}

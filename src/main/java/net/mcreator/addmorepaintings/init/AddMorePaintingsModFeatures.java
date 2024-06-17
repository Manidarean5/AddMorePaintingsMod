
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.addmorepaintings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.addmorepaintings.world.features.MuseoPuchainaFeature;
import net.mcreator.addmorepaintings.AddMorePaintingsMod;

@Mod.EventBusSubscriber
public class AddMorePaintingsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AddMorePaintingsMod.MODID);
	public static final RegistryObject<Feature<?>> MUSEO_PUCHAINA = REGISTRY.register("museo_puchaina", MuseoPuchainaFeature::new);
}

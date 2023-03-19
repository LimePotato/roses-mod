package xyz.limepot.roses_mod.world.gen;


import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
//import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.BiomeSelectors;

import static xyz.limepot.roses_mod.RosesMod.MOD_ID;

public class ModFlowerGeneration {

	/*
	public static void generateFlowers() {
		//ROSE FLOWER
		RegistryKey<TagKey> roseFlowerTag = RegistryKey.of(RegistryKeys.TAGS, new Identifier(MOD_ID, "rose_flowers"));
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, roseFlowerTag);
		//CYAN ROSE
		RegistryKey<TagKey> cyanRoseTag = RegistryKey.of(RegistryKeys.TAGS, new Identifier(MOD_ID, "cyan_roses"));
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, cyanRoseTag);
		//CYAN ROSE BUSH
		RegistryKey<TagKey> cyanRoseBushT   ag = RegistryKey.of(RegistryKeys.TAGS, new Identifier(MOD_ID, "cyan_rose_bushes"));
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, cyanRoseBushTag);
	}
	 */
	public static void generateFlowers() {
		/*RegistryKey<ConfiguredFeature<?, ?>> cyanRoseBushTag = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MOD_ID, "cyan_rose_bush"));
		RegistryKey<PlacedFeature> cyanRoseBushTagKey = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "cyan_rose_bushes"));
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
				GenerationStep.Feature.VEGETAL_DECORATION,
				RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "cyan_rose_bush")));*/
	}
}

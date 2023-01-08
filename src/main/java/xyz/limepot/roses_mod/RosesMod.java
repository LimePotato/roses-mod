package xyz.limepot.roses_mod;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RosesMod implements ModInitializer {
	public static final String MOD_ID = "roses_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("Roses Mod");

	//ROSE
	public static final Block ROSE_FLOWER = new FlowerBlock(StatusEffects.HASTE, 8, QuiltBlockSettings.copyOf(Blocks.POPPY).nonOpaque());
	public static final Block POTTED_ROSE = new FlowerPotBlock(ROSE_FLOWER, QuiltBlockSettings.copyOf(Blocks.POTTED_POPPY));
	//Cyan Rose
	public static final Block CYAN_ROSE = new FlowerBlock(StatusEffects.NAUSEA, 8, QuiltBlockSettings.copyOf(Blocks.POPPY).nonOpaque());
	public static final Block POTTED_CYAN = new FlowerPotBlock(CYAN_ROSE, QuiltBlockSettings.copyOf(Blocks.POTTED_POPPY));
	//Cyan Rose Bush
	public static final Block CYAN_ROSE_BUSH = new TallPlantBlock(QuiltBlockSettings.copyOf(Blocks.LARGE_FERN));


	@Override
	public void onInitialize(ModContainer mod) {

		//REGISTER BLOCKS AND BLOCK ITEMS
		//TODO: ADD ITEMS TO CREATIVE TABS

		//ROSE FLOWER
			Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "rose_flower"), ROSE_FLOWER);
			Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rose_flower"), new BlockItem(ROSE_FLOWER, new QuiltItemSettings()));
				//POTTED ROSE FLOWER
				Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "potted_rose"), POTTED_ROSE);
		//CYAN ROSE
			Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "cyan_rose"), CYAN_ROSE);
			Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cyan_rose"), new BlockItem(CYAN_ROSE, new QuiltItemSettings()));
				//POTTED CYAN ROSE
				Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "potted_cyan"), POTTED_CYAN);
		//CYAN ROSE BUSH
			Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "cyan_rose_bush"), CYAN_ROSE_BUSH);
			Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cyan_rose_bush"), new BlockItem(CYAN_ROSE_BUSH, new QuiltItemSettings()));

		//CREATIVE TABS
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
			content.addAfter(Items.POPPY, ROSE_FLOWER);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
			content.addAfter(Items.BLUE_ORCHID, CYAN_ROSE);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
			content.addAfter(Items.ROSE_BUSH, CYAN_ROSE_BUSH);
		});


		//LOOT TABLES
		final Identifier ROSE_BUSH_LOOT_TABLE_ID = Blocks.ROSE_BUSH.getLootTableId();
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (source.isBuiltin() && ROSE_BUSH_LOOT_TABLE_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder().with(ItemEntry.builder(RosesMod.ROSE_FLOWER));;
				tableBuilder.pool(poolBuilder);
			}
		});



		//INIT
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}

}

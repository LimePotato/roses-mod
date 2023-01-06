package xyz.limepot.roses_mod;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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

	public static final Block ROSE_FLOWER = new Block(QuiltBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.3f));


	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "rose_flower"), ROSE_FLOWER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rose_flower"), new BlockItem(ROSE_FLOWER, new QuiltItemSettings()));

		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}

}

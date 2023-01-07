package xyz.limepot.roses_mod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.RenderLayer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import xyz.limepot.roses_mod.RosesMod;

public abstract class RosesModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.POTTED_ROSE);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.ROSE_FLOWER);
	}
}

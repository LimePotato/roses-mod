package xyz.limepot.roses_mod;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public abstract class RosesModClient implements ClientModInitializer {


	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.POTTED_ROSE);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.ROSE_FLOWER);
	}
}

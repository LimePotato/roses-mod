package xyz.limepot.roses_mod;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class RosesModClient implements ClientModInitializer {
	public void onInitializeClient(ModContainer mod) {
		//ROSE FLOWER
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.POTTED_ROSE);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.ROSE_FLOWER);

		//CYAN ROSE
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.POTTED_CYAN);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.CYAN_ROSE);

		//CYAN ROSE BUSH
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), RosesMod.CYAN_ROSE_BUSH);
	}
}

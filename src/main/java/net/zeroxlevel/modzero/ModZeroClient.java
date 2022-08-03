package net.zeroxlevel.modzero;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.zeroxlevel.modzero.block.ModBlocks;
import net.zeroxlevel.modzero.event.KeyInputHandler;

public class ModZeroClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());

        KeyInputHandler.register();
    }
}

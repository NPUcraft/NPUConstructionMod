package com.npucraft.npuconstruction;

import com.npucraft.npuconstruction.BlockEntity.ClockHand.Render.ClockHandRenderer;
import com.npucraft.npuconstruction.BlockEntity.Fan.FanRenderer;
import com.npucraft.npuconstruction.Register.MyBlockEntityRegister;
import com.npucraft.npuconstruction.Register.MyRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class NPUConstructionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        addTranslucentCutoutBlocks();
        addBlockEntityRender();
    }

    private static void addBlockEntityRender() {
        // register BlockEntityRenderer
        BlockEntityRendererRegistry.INSTANCE.register(MyBlockEntityRegister.CLOCK_HAND_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, ClockHandRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(MyBlockEntityRegister.FAN_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, FanRenderer::new);
    }


    private static void addTranslucentCutoutBlocks() {
        Block[] translucentBlockList = MyRegister.translucentBlocks.toArray(new Block[MyRegister.translucentBlocks.size()]);
        Block[] cutoutBlockList = MyRegister.cutoutBlocks.toArray(new Block[MyRegister.cutoutBlocks.size()]);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), translucentBlockList);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), cutoutBlockList);
    }

}

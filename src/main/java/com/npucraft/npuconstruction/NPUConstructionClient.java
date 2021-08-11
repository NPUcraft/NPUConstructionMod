package com.npucraft.npuconstruction;

import com.npucraft.npuconstruction.Register.MyBlockEntityRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import java.util.ArrayList;
import java.util.List;

public class NPUConstructionClient implements ClientModInitializer {
    public static List<Block> translucentBlocks = new ArrayList<Block>();
    public static List<Block> cutoutBlocks = new ArrayList<Block>();

    @Override
    public void onInitializeClient() {
        addTranslucentCutoutBlocks();
        addBlockEntityRender();

    }

    private static void addBlockEntityRender(){
//        BlockEntityRendererRegistry.INSTANCE.register(ClockHandBlockEntity.BlockEntity, ClockHandBlockEntityRenderer::new);
        MyBlockEntityRegister.registerRenderer();
    }


    private static void addTranslucentCutoutBlocks(){
        Block[] translucentBlockList = translucentBlocks.toArray(new Block[translucentBlocks.size()]);
        Block[] cutoutBlockList = cutoutBlocks.toArray(new Block[cutoutBlocks.size()]);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), translucentBlockList);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), cutoutBlockList);


    }


}

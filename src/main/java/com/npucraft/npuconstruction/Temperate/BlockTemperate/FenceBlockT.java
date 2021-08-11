package com.npucraft.npuconstruction.Temperate.BlockTemperate;

import com.npucraft.npuconstruction.NPUConstructionClient;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.FenceBlock;
import net.minecraft.client.render.RenderLayer;

public class FenceBlockT extends FenceBlock {
    protected FenceBlockT(Settings settings) {
        super(settings);
        NPUConstructionClient.translucentBlocks.add(this);
    }
}

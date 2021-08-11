package com.npucraft.npuconstruction.Block.FromForge1_12_2.Fence;

import com.npucraft.npuconstruction.Temperate.BlockTemperate.FenceBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class FenceO extends FenceBlockT {

    public FenceO(){
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

}

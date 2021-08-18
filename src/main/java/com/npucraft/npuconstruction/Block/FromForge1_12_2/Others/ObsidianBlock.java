package com.npucraft.npuconstruction.Block.FromForge1_12_2.Others;


import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;


public class ObsidianBlock extends HorizontalFacingBlockT {

    public ObsidianBlock() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

}

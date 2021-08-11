package com.npucraft.npuconstruction.Temperate.BlockTemperate;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.state.property.Properties;

public class HalfSlabBlockT extends SlabBlock {

    public HalfSlabBlockT(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.SLAB_TYPE, SlabType.BOTTOM));
    }
}

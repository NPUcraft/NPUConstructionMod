package com.npucraft.npuconstruction.Temperate.BlockTemperate;

import com.npucraft.npuconstruction.Register.MyRegister;
import net.minecraft.block.FenceBlock;

public class FenceBlockT extends FenceBlock {
    protected FenceBlockT(Settings settings) {
        super(settings);
        MyRegister.translucentBlocks.add(this);
    }
}

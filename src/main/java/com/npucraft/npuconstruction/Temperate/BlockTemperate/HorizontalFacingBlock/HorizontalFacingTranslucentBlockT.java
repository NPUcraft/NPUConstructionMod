package com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock;

import com.npucraft.npuconstruction.Register.MyRegister;

public class HorizontalFacingTranslucentBlockT extends HorizontalFacingBlockT {

    protected HorizontalFacingTranslucentBlockT(Settings settings) {
        super(settings.nonOpaque());
        MyRegister.translucentBlocks.add(this);
    }

}

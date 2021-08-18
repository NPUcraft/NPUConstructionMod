package com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock;

import com.npucraft.npuconstruction.Register.MyRegister;

public class HorizontalFacingCutoutBlockT extends HorizontalFacingBlockT {

    protected HorizontalFacingCutoutBlockT(Settings settings) {
        super(settings.nonOpaque());
        MyRegister.cutoutBlocks.add(this);
    }

}

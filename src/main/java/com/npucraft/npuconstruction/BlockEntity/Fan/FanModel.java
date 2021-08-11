package com.npucraft.npuconstruction.BlockEntity.Fan;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FanModel extends AnimatedGeoModel<FanBlockEntity> {
    @Override
    public Identifier getModelLocation(FanBlockEntity object) {
        return new Identifier("npu", "geo/fan.geo.json");
    }

    @Override
    public Identifier getTextureLocation(FanBlockEntity object) {
        return new Identifier("npu", "textures/geckolib/fan.png");
    }

    @Override
    public Identifier getAnimationFileLocation(FanBlockEntity animatable) {
        return new Identifier("npu", "animations/fan.animation.json");
    }


}

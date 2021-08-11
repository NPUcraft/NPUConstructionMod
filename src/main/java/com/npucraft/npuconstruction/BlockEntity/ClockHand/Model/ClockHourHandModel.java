package com.npucraft.npuconstruction.BlockEntity.ClockHand.Model;

import com.npucraft.npuconstruction.BlockEntity.ClockHand.ClockHandBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ClockHourHandModel extends AnimatedGeoModel<ClockHandBlockEntity> {
    @Override
    public Identifier getModelLocation(ClockHandBlockEntity object) {
        return new Identifier("npu", "geo/clockhand/clockhourhand.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ClockHandBlockEntity object) {
        return new Identifier("npu", "textures/geckolib/clockhand.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ClockHandBlockEntity animatable) {
        return null;
    }


}

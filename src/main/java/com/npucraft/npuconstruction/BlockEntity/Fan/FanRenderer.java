package com.npucraft.npuconstruction.BlockEntity.Fan;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import software.bernie.geckolib3.renderer.geo.GeoBlockRenderer;

public class FanRenderer extends GeoBlockRenderer<FanBlockEntity> {
    public FanRenderer(BlockEntityRenderDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn, new FanModel());
    }

    @Override
    public RenderLayer getRenderType(FanBlockEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }

    @Override
    protected void rotateBlock(Direction facing, MatrixStack stack) {
        switch (facing) {
            case SOUTH -> stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            case WEST -> stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            case NORTH -> stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
            case EAST -> stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            case UP -> stack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(90));
            case DOWN -> stack.multiply(Vec3f.NEGATIVE_X.getDegreesQuaternion(90));
        }
    }
}

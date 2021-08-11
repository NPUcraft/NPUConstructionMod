package com.npucraft.npuconstruction.BlockEntity.ClockHand.Render;

import com.npucraft.npuconstruction.BlockEntity.ClockHand.ClockHandBlockEntity;
import com.npucraft.npuconstruction.BlockEntity.ClockHand.Model.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.GeoModelProvider;
import software.bernie.geckolib3.renderer.geo.IGeoRenderer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;

public class ClockHandRenderer extends BlockEntityRenderer<ClockHandBlockEntity>
        implements IGeoRenderer<ClockHandBlockEntity> {

    private static int index = 0;
    private final ArrayList<AnimatedGeoModel<ClockHandBlockEntity>> modelProviderList = new ArrayList<>();

    public ClockHandRenderer(BlockEntityRenderDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
        modelProviderList.add(new ClockHourHandModel());
        modelProviderList.add(new ClockMinuteHandModel());
        modelProviderList.add(new ClockSecondHandModel());
        modelProviderList.add(new ClockHandModel());
    }

    @Override
    public void render(ClockHandBlockEntity blockEntity, float partialTicks, MatrixStack stack,
                       VertexConsumerProvider bufferIn, int packedLightIn, int combinedOverlayIn) {
        for (; index < modelProviderList.size() - 1; index++) {
            renderHourHand(modelProviderList.get(index), switch (index) {
                        case 0 -> 1 / 16f;
                        case 1 -> 2 / 16f;
                        case 2 -> 3 / 16f;
                        default -> 0;
                    }, blockEntity, partialTicks, stack, bufferIn, packedLightIn,
                    combinedOverlayIn);
        }
        renderClock(modelProviderList.get(index), blockEntity, partialTicks, stack, bufferIn, packedLightIn,
                combinedOverlayIn);
        index = 0;
    }

    private void renderHourHand(AnimatedGeoModel<ClockHandBlockEntity> modelProvider, float offset,
                                ClockHandBlockEntity tile, float partialTicks, MatrixStack stack,
                                VertexConsumerProvider bufferIn, int packedLightIn, int combinedOverlayIn) {
        Calendar calendar = Calendar.getInstance();

        GeoModel model = modelProvider.getModel(modelProvider.getModelLocation(tile));
        modelProvider.setLivingAnimations(tile, tile.hashCode());

        stack.push();
        stack.translate(0.5, 0, 0.5);

        if (modelProvider.equals(this.modelProviderList.get(0))) {
            rotateBlock(getFacing(tile), stack, (calendar.get(Calendar.HOUR)
                    + calendar.get(Calendar.MINUTE) / 60F) / 12F * 60 * 6, offset);
        } else if (modelProvider.equals(this.modelProviderList.get(1))) {
            rotateBlock(getFacing(tile), stack, calendar.get(Calendar.MINUTE) * 6, offset);
        } else if (modelProvider.equals(this.modelProviderList.get(2))) {
            rotateBlock(getFacing(tile), stack, calendar.get(Calendar.SECOND) * 6, offset);
        } else {
            rotateBlock(getFacing(tile), stack, 0, 0);
        }


        MinecraftClient.getInstance().getTextureManager().bindTexture(modelProvider.getTextureLocation(tile));
        Color renderColor = new Color(255, 255, 255, 255);
        RenderLayer renderType = RenderLayer.getEntityCutout(modelProvider.getTextureLocation(tile));


        render(model, tile, partialTicks, renderType, stack, bufferIn, null, packedLightIn,
                OverlayTexture.DEFAULT_UV,
                (float) renderColor.getRed() / 255f, (float) renderColor.getGreen() / 255f,
                (float) renderColor.getBlue() / 255f, (float) renderColor.getAlpha() / 255);
        stack.pop();
    }

    private void renderClock(AnimatedGeoModel<ClockHandBlockEntity> modelProvider, ClockHandBlockEntity blockEntity,
                             float partialTicks, MatrixStack stack, VertexConsumerProvider bufferIn,
                             int packedLightIn, int combinedOverlayIn) {

        GeoModel model = modelProvider.getModel(modelProvider.getModelLocation(blockEntity));
        modelProvider.setLivingAnimations(blockEntity, blockEntity.hashCode());

        stack.push();
        stack.translate(0.5, 0, 0.5);

        switch (getFacing(blockEntity)) {
            case SOUTH -> {
//                stack.translate(0, 0, 0.5);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            }
            case WEST -> {
//                stack.translate(-0.5, 0, 0);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
            }
            case NORTH -> {
//                stack.translate(0, 0, -0.5);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            }
            case EAST -> {
//                stack.translate(0.5, 0, 0);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            }
            case UP -> {
//                stack.translate(0, -0.5, 0);
                stack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(90));
            }
            case DOWN -> {
//                stack.translate(0, 0.5, 0);
                stack.multiply(Vec3f.NEGATIVE_X.getDegreesQuaternion(90));
            }
        }


        MinecraftClient.getInstance().getTextureManager().bindTexture(modelProvider.getTextureLocation(blockEntity));
        Color renderColor = new Color(255, 255, 255, 255);
        RenderLayer renderType = RenderLayer.getEntityCutout(modelProvider.getTextureLocation(blockEntity));


        render(model, blockEntity, partialTicks, renderType, stack, bufferIn, null, packedLightIn,
                OverlayTexture.DEFAULT_UV,
                (float) renderColor.getRed() / 255f, (float) renderColor.getGreen() / 255f,
                (float) renderColor.getBlue() / 255f, (float) renderColor.getAlpha() / 255);
        stack.pop();
    }


    protected void rotateBlock(Direction facing, MatrixStack stack, float clockHandAngel, float offset) {
        switch (facing) {
            case SOUTH -> {
                stack.translate(0, 0, 0.5 - offset);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180));
            }
            case WEST -> {
                stack.translate(-0.5 + offset, 0, 0);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90));
            }
            case NORTH -> {
                stack.translate(0, 0, -0.5 + offset);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0));
            }
            case EAST -> {
                stack.translate(0.5 - offset, 0, 0);
                stack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(270));
            }
            case UP -> {
                stack.translate(0, offset, 0);
                stack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(90));
            }
            case DOWN -> {
                stack.translate(0, -offset, 0);
                stack.multiply(Vec3f.NEGATIVE_X.getDegreesQuaternion(90));
            }
        }
        stack.translate(0, 0.5, 0);
        stack.multiply(Vec3f.NEGATIVE_Z.getDegreesQuaternion(clockHandAngel));
    }

    private Direction getFacing(BlockEntity tile) {
        BlockState blockState = tile.getCachedState();
        if (blockState.contains(HorizontalFacingBlock.FACING)) {
            return blockState.get(HorizontalFacingBlock.FACING);
        } else if (blockState.contains(FacingBlock.FACING)) {
            return blockState.get(FacingBlock.FACING);
        } else {
            return Direction.NORTH;
        }
    }

    @Override
    public GeoModelProvider getGeoModelProvider() {
        return this.modelProviderList.get(index);
    }

    @Override
    public Identifier getTextureLocation(ClockHandBlockEntity instance) {
        return this.modelProviderList.get(index).getTextureLocation(instance);
    }
}

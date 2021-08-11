package com.npucraft.npuconstruction.Register;

import com.npucraft.npuconstruction.BlockEntity.ClockHand.ClockHandBlockEntity;
import com.npucraft.npuconstruction.BlockEntity.ClockHand.Render.ClockHandRenderer;
import com.npucraft.npuconstruction.BlockEntity.Fan.FanBlockEntity;
import com.npucraft.npuconstruction.BlockEntity.Fan.FanRenderer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyBlockEntityRegister {
    public static final BlockEntityType<ClockHandBlockEntity> CLOCK_HAND_BLOCK_ENTITY_BLOCK_ENTITY_TYPE
            = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("npu", "clockhand"),
            BlockEntityType.Builder.create(ClockHandBlockEntity::new, MyBlockRegister.CLOCK_HAND).build(null));

    public static final BlockEntityType<FanBlockEntity> FAN_BLOCK_ENTITY_BLOCK_ENTITY_TYPE
            = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("npu", "fan"),
            BlockEntityType.Builder.create(FanBlockEntity::new, MyBlockRegister.FAN).build(null));

    public static void registerRenderer(){
        // register BlockEntityRenderer
        BlockEntityRendererRegistry.INSTANCE.register(CLOCK_HAND_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, ClockHandRenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(FAN_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, FanRenderer::new);
    }
}

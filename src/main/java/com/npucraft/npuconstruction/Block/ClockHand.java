package com.npucraft.npuconstruction.Block;


import com.npucraft.npuconstruction.Init.Register.MyBlockEntityRegister;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock.DirectionFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class ClockHand extends DirectionFacingBlockT implements BlockEntityProvider {

    public ClockHand() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        return VoxelShapes.fullCube();
    }

    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return MyBlockEntityRegister.CLOCK_HAND_BLOCK_ENTITY_BLOCK_ENTITY_TYPE.instantiate();
    }


    @Override
    public BlockRenderType getRenderType(BlockState blockState)
    {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

}

package com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock;

import com.npucraft.npuconstruction.Register.MyRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class DirectionFacingCutoutBlockT extends HorizontalFacingBlock {

    protected DirectionFacingCutoutBlockT(Settings settings) {
        super(settings.nonOpaque());
        MyRegister.cutoutBlocks.add(this);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

//    @Override
//    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
//        return VoxelShapes.fullCube();
//    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState) this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }
}

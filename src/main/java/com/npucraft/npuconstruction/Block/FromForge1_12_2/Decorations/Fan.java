package com.npucraft.npuconstruction.Block.FromForge1_12_2.Decorations;


import com.npucraft.npuconstruction.Register.MyBlockEntityRegister;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock.DirectionFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Fan_Data;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class Fan extends DirectionFacingBlockT implements BlockEntityProvider {

    public Fan() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return Fan_Data.getNORTH();
			case SOUTH:
				return Fan_Data.getSOUTH();
			case EAST:
				return Fan_Data.getEAST();
			case WEST:
				return Fan_Data.getWEST();
			default:
				return VoxelShapes.fullCube();
		}
	}

	@Override
	public BlockEntity createBlockEntity(BlockView blockView) {
		return MyBlockEntityRegister.FAN_BLOCK_ENTITY_BLOCK_ENTITY_TYPE.instantiate();
	}

	@Override
	public BlockRenderType getRenderType(BlockState blockState)
	{
		return BlockRenderType.ENTITYBLOCK_ANIMATED;
	}

}

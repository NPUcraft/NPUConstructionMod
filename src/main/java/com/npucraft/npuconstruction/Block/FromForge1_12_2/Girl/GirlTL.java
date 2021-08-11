package com.npucraft.npuconstruction.Block.FromForge1_12_2.Girl;


import com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock.DirectionFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Girltl_Data;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class GirlTL extends DirectionFacingBlockT {

    public GirlTL() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).lightLevel(7));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return Girltl_Data.getNORTH();
			case SOUTH:
				return Girltl_Data.getSOUTH();
			case EAST:
				return Girltl_Data.getEAST();
			case WEST:
				return Girltl_Data.getWEST();
			default:
				return VoxelShapes.fullCube();
		}
	}

}

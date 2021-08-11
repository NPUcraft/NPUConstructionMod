package com.npucraft.npuconstruction.Block.FromForge1_12_2.Platform;


import com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock.DirectionFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Classroom_microphone_Data;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class ClassroomMicrophone extends DirectionFacingBlockT {

    public ClassroomMicrophone() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return Classroom_microphone_Data.getNORTH();
			case SOUTH:
				return Classroom_microphone_Data.getSOUTH();
			case EAST:
				return Classroom_microphone_Data.getEAST();
			case WEST:
				return Classroom_microphone_Data.getWEST();
			default:
				return VoxelShapes.fullCube();
		}
	}

}

package com.npucraft.npuconstruction.Block.FromForge1_12_2.Platform;


import com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock.DirectionFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Metal_trashcan_Data;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class MetalTrashcan extends DirectionFacingBlockT {

    public MetalTrashcan() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return Metal_trashcan_Data.getNORTH();
			case SOUTH:
				return Metal_trashcan_Data.getSOUTH();
			case EAST:
				return Metal_trashcan_Data.getEAST();
			case WEST:
				return Metal_trashcan_Data.getWEST();
			default:
				return VoxelShapes.fullCube();
		}
	}

}

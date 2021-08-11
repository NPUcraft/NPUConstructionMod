package com.npucraft.npuconstruction.Block.FromForge1_12_2.Trees;


import com.npucraft.npuconstruction.Temperate.BlockTemperate.DirectionFacingBlock.DirectionFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Tree_Data;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;


public class Tree extends DirectionFacingBlockT {

    public Tree() {
		super(FabricBlockSettings.of(Material.WOOD).hardness(4.0f));
//		super(FabricBlockSettings.of(M));
    }

	@Override
	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
//    	this.stateManager.getProperties();
		return Tree_Data.getNORTH();
	}

}

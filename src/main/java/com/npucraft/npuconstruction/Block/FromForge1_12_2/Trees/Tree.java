package com.npucraft.npuconstruction.Block.FromForge1_12_2.Trees;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Tree_Data;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;


public class Tree extends HorizontalFacingBlockT {

    public Tree() {
        super(FabricBlockSettings.of(Material.WOOD).hardness(4.0f));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Tree_Data.getNORTH();
    }

}

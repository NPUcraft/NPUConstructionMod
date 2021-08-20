package com.npucraft.npuconstruction.Block.FromForge1_12_2.Plants;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Plant_Data;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingCutoutBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class Plant extends HorizontalFacingCutoutBlockT {

    public Plant() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).nonOpaque().lightLevel(2));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Plant_Data.getNORTH();
            case SOUTH -> Plant_Data.getSOUTH();
            case EAST -> Plant_Data.getEAST();
            case WEST -> Plant_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

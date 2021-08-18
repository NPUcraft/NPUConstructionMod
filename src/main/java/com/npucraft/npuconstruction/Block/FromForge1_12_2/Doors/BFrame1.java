package com.npucraft.npuconstruction.Block.FromForge1_12_2.Doors;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Bframe1_Data;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class BFrame1 extends HorizontalFacingBlockT {

    public BFrame1() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Bframe1_Data.getNORTH();
            case SOUTH -> Bframe1_Data.getSOUTH();
            case EAST -> Bframe1_Data.getEAST();
            case WEST -> Bframe1_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

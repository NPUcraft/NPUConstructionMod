package com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day228;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Fcfloor3_Data;
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


public class FCFloor3 extends HorizontalFacingBlockT {

    public FCFloor3() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).nonOpaque());
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Fcfloor3_Data.getNORTH();
            case SOUTH -> Fcfloor3_Data.getSOUTH();
            case EAST -> Fcfloor3_Data.getEAST();
            case WEST -> Fcfloor3_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

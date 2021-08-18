package com.npucraft.npuconstruction.Block.FromForge1_12_2.Drinks;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Drink6_Data;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingTranslucentBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class Drink6 extends HorizontalFacingTranslucentBlockT {

    public Drink6() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).lightLevel(7));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Drink6_Data.getNORTH();
            case SOUTH -> Drink6_Data.getSOUTH();
            case EAST -> Drink6_Data.getEAST();
            case WEST -> Drink6_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

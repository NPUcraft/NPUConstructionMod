package com.npucraft.npuconstruction.Block.FromForge1_12_2.Windows.White;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Winw2_Data;
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


public class Winw2 extends HorizontalFacingTranslucentBlockT {

    public Winw2() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).nonOpaque());
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Winw2_Data.getNORTH();
            case SOUTH -> Winw2_Data.getSOUTH();
            case EAST -> Winw2_Data.getEAST();
            case WEST -> Winw2_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

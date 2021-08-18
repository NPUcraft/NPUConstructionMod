package com.npucraft.npuconstruction.Block.FromForge1_12_2.Doors.Black;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Db5_Data;
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


public class DB5 extends HorizontalFacingTranslucentBlockT {

    public DB5() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Db5_Data.getNORTH();
            case SOUTH -> Db5_Data.getSOUTH();
            case EAST -> Db5_Data.getEAST();
            case WEST -> Db5_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

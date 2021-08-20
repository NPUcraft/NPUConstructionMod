package com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day221;

import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Fwell3_Data;
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


public class FWell3 extends HorizontalFacingCutoutBlockT {

    public FWell3() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).nonOpaque());
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Fwell3_Data.getNORTH();
            case SOUTH -> Fwell3_Data.getSOUTH();
            case EAST -> Fwell3_Data.getEAST();
            case WEST -> Fwell3_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

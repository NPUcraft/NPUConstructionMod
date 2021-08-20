package com.npucraft.npuconstruction.Block.FromForge1_12_2.Market;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Market_office_cabinet_up_Data;
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


public class MarketOfficeCabinetUp extends HorizontalFacingBlockT {

    public MarketOfficeCabinetUp() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).nonOpaque());
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Market_office_cabinet_up_Data.getNORTH();
            case SOUTH -> Market_office_cabinet_up_Data.getSOUTH();
            case EAST -> Market_office_cabinet_up_Data.getEAST();
            case WEST -> Market_office_cabinet_up_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

package com.npucraft.npuconstruction.Block.FromForge1_12_2.Market;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Market_cashier_desk_left_Data;
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


public class MarketCashierDeskLeft extends HorizontalFacingBlockT {

    public MarketCashierDeskLeft() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f).lightLevel(5));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Market_cashier_desk_left_Data.getNORTH();
            case SOUTH -> Market_cashier_desk_left_Data.getSOUTH();
            case EAST -> Market_cashier_desk_left_Data.getEAST();
            case WEST -> Market_cashier_desk_left_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

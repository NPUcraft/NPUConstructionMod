package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Market_milk_box_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(11, 0, 0, 21, 16, 16),
		Block.createCuboidShape(0, 0, 0, 10, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 11, 16, 16, 21),
		Block.createCuboidShape(0, 0, 0, 16, 16, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 0, 0, 5, 16, 16),
		Block.createCuboidShape(6, 0, 0, 16, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -5, 16, 16, 5),
		Block.createCuboidShape(0, 0, 6, 16, 16, 16)
    );

    public Market_milk_box_Data() {
    }

    public static VoxelShape getNORTH() {
        return NORTH;
    }

    public static VoxelShape getEAST() {
        return EAST;
    }

    public static VoxelShape getSOUTH() {
        return SOUTH;
    }

    public static VoxelShape getWEST() {
        return WEST;
    }
}

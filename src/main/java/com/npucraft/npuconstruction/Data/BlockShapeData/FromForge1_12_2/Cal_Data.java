package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Cal_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 2, 7, 20, 16, 8),
		Block.createCuboidShape(-2, 4, 8, 18, 13, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 2, -4, 9, 16, 20),
		Block.createCuboidShape(7, 4, -2, 8, 13, 18)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 2, 8, 20, 16, 9),
		Block.createCuboidShape(-2, 4, 7, 18, 13, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 2, -4, 8, 16, 20),
		Block.createCuboidShape(8, 4, -2, 9, 13, 18)
    );

    public Cal_Data() {
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

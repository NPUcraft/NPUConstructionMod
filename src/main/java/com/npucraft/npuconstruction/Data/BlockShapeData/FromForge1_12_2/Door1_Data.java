package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 0, 6, 6, 2, 10),
		Block.createCuboidShape(6, -16, 6, 7, 32, 10),
		Block.createCuboidShape(20, 4, 9, 23, 5, 23),
		Block.createCuboidShape(-7, 25, 6, 23, 26, 10),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 16),
		Block.createCuboidShape(24, -16, 0, 32, 32, 16),
		Block.createCuboidShape(-8, -16, 0, 6, 0, 16),
		Block.createCuboidShape(-7, 1, 7, -6, 25, 9),
		Block.createCuboidShape(-6, 24, 7, 5, 25, 9),
		Block.createCuboidShape(5, 1, 7, 6, 25, 9),
		Block.createCuboidShape(7, -16, 6, 23, -15, 10),
		Block.createCuboidShape(21, 24, 9, 23, 25, 23),
		Block.createCuboidShape(21, -15, 9, 23, -14, 23),
		Block.createCuboidShape(22, -14, 9, 23, 4, 23),
		Block.createCuboidShape(23, -16, 6, 24, 32, 10),
		Block.createCuboidShape(21, -15, 8, 23, 25, 9),
		Block.createCuboidShape(21, -15, 23, 23, 25, 24),
		Block.createCuboidShape(-8, 0, 6, -7, 32, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, -7, 10, 2, 6),
		Block.createCuboidShape(6, -16, 6, 10, 32, 7),
		Block.createCuboidShape(-7, 4, 20, 7, 5, 23),
		Block.createCuboidShape(6, 25, -7, 10, 26, 23),
		Block.createCuboidShape(0, -16, -16, 16, 32, -8),
		Block.createCuboidShape(0, -16, 24, 16, 32, 32),
		Block.createCuboidShape(0, -16, -8, 16, 0, 6),
		Block.createCuboidShape(7, 1, -7, 9, 25, -6),
		Block.createCuboidShape(7, 24, -6, 9, 25, 5),
		Block.createCuboidShape(7, 1, 5, 9, 25, 6),
		Block.createCuboidShape(6, -16, 7, 10, -15, 23),
		Block.createCuboidShape(-7, 24, 21, 7, 25, 23),
		Block.createCuboidShape(-7, -15, 21, 7, -14, 23),
		Block.createCuboidShape(-7, -14, 22, 7, 4, 23),
		Block.createCuboidShape(6, -16, 23, 10, 32, 24),
		Block.createCuboidShape(7, -15, 21, 8, 25, 23),
		Block.createCuboidShape(-8, -15, 21, -7, 25, 23),
		Block.createCuboidShape(6, 0, -8, 10, 32, -7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(10, 0, 6, 23, 2, 10),
		Block.createCuboidShape(9, -16, 6, 10, 32, 10),
		Block.createCuboidShape(-7, 4, -7, -4, 5, 7),
		Block.createCuboidShape(-7, 25, 6, 23, 26, 10),
		Block.createCuboidShape(24, -16, 0, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 16),
		Block.createCuboidShape(10, -16, 0, 24, 0, 16),
		Block.createCuboidShape(22, 1, 7, 23, 25, 9),
		Block.createCuboidShape(11, 24, 7, 22, 25, 9),
		Block.createCuboidShape(10, 1, 7, 11, 25, 9),
		Block.createCuboidShape(-7, -16, 6, 9, -15, 10),
		Block.createCuboidShape(-7, 24, -7, -5, 25, 7),
		Block.createCuboidShape(-7, -15, -7, -5, -14, 7),
		Block.createCuboidShape(-7, -14, -7, -6, 4, 7),
		Block.createCuboidShape(-8, -16, 6, -7, 32, 10),
		Block.createCuboidShape(-7, -15, 7, -5, 25, 8),
		Block.createCuboidShape(-7, -15, -8, -5, 25, -7),
		Block.createCuboidShape(23, 0, 6, 24, 32, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 10, 10, 2, 23),
		Block.createCuboidShape(6, -16, 9, 10, 32, 10),
		Block.createCuboidShape(9, 4, -7, 23, 5, -4),
		Block.createCuboidShape(6, 25, -7, 10, 26, 23),
		Block.createCuboidShape(0, -16, 24, 16, 32, 32),
		Block.createCuboidShape(0, -16, -16, 16, 32, -8),
		Block.createCuboidShape(0, -16, 10, 16, 0, 24),
		Block.createCuboidShape(7, 1, 22, 9, 25, 23),
		Block.createCuboidShape(7, 24, 11, 9, 25, 22),
		Block.createCuboidShape(7, 1, 10, 9, 25, 11),
		Block.createCuboidShape(6, -16, -7, 10, -15, 9),
		Block.createCuboidShape(9, 24, -7, 23, 25, -5),
		Block.createCuboidShape(9, -15, -7, 23, -14, -5),
		Block.createCuboidShape(9, -14, -7, 23, 4, -6),
		Block.createCuboidShape(6, -16, -8, 10, 32, -7),
		Block.createCuboidShape(8, -15, -7, 9, 25, -5),
		Block.createCuboidShape(23, -15, -7, 24, 25, -5),
		Block.createCuboidShape(6, 0, 23, 10, 32, 24)
    );

    public Door1_Data() {
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

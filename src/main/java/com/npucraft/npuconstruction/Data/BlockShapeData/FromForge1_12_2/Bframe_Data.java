package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bframe_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 4, 8, -4, 5, 20),
		Block.createCuboidShape(10, 4, 5, 22, 5, 9),
		Block.createCuboidShape(-8, 28, 0, 24, 32, 16),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 16),
		Block.createCuboidShape(24, -16, 0, 32, 32, 16),
		Block.createCuboidShape(23, -16, 5, 24, 28, 10),
		Block.createCuboidShape(22, -16, 6, 23, 27, 9),
		Block.createCuboidShape(10, 26, 6, 22, 27, 9),
		Block.createCuboidShape(10, -16, 6, 22, -15, 9),
		Block.createCuboidShape(-7, -16, 8, -5, -15, 20),
		Block.createCuboidShape(-7, 26, 8, -5, 27, 20),
		Block.createCuboidShape(10, -15, 7, 22, 4, 8),
		Block.createCuboidShape(-7, -15, 8, -6, 4, 20),
		Block.createCuboidShape(9, -16, 6, 10, 27, 8),
		Block.createCuboidShape(-7, -16, 7, -5, 27, 8),
		Block.createCuboidShape(-7, -16, 20, -5, 27, 21),
		Block.createCuboidShape(8, -16, 8, 10, 27, 9),
		Block.createCuboidShape(-8, -16, 5, -7, 28, 10),
		Block.createCuboidShape(-7, 27, 5, 23, 28, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-4, 4, -7, 8, 5, -4),
		Block.createCuboidShape(7, 4, 10, 11, 5, 22),
		Block.createCuboidShape(0, 28, -8, 16, 32, 24),
		Block.createCuboidShape(0, -16, -16, 16, 32, -8),
		Block.createCuboidShape(0, -16, 24, 16, 32, 32),
		Block.createCuboidShape(6, -16, 23, 11, 28, 24),
		Block.createCuboidShape(7, -16, 22, 10, 27, 23),
		Block.createCuboidShape(7, 26, 10, 10, 27, 22),
		Block.createCuboidShape(7, -16, 10, 10, -15, 22),
		Block.createCuboidShape(-4, -16, -7, 8, -15, -5),
		Block.createCuboidShape(-4, 26, -7, 8, 27, -5),
		Block.createCuboidShape(8, -15, 10, 9, 4, 22),
		Block.createCuboidShape(-4, -15, -7, 8, 4, -6),
		Block.createCuboidShape(8, -16, 9, 10, 27, 10),
		Block.createCuboidShape(8, -16, -7, 9, 27, -5),
		Block.createCuboidShape(-5, -16, -7, -4, 27, -5),
		Block.createCuboidShape(7, -16, 8, 8, 27, 10),
		Block.createCuboidShape(6, -16, -8, 11, 28, -7),
		Block.createCuboidShape(6, 27, -7, 11, 28, 23)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(20, 4, -4, 23, 5, 8),
		Block.createCuboidShape(-6, 4, 7, 6, 5, 11),
		Block.createCuboidShape(-8, 28, 0, 24, 32, 16),
		Block.createCuboidShape(24, -16, 0, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 16),
		Block.createCuboidShape(-8, -16, 6, -7, 28, 11),
		Block.createCuboidShape(-7, -16, 7, -6, 27, 10),
		Block.createCuboidShape(-6, 26, 7, 6, 27, 10),
		Block.createCuboidShape(-6, -16, 7, 6, -15, 10),
		Block.createCuboidShape(21, -16, -4, 23, -15, 8),
		Block.createCuboidShape(21, 26, -4, 23, 27, 8),
		Block.createCuboidShape(-6, -15, 8, 6, 4, 9),
		Block.createCuboidShape(22, -15, -4, 23, 4, 8),
		Block.createCuboidShape(6, -16, 8, 7, 27, 10),
		Block.createCuboidShape(21, -16, 8, 23, 27, 9),
		Block.createCuboidShape(21, -16, -5, 23, 27, -4),
		Block.createCuboidShape(6, -16, 7, 8, 27, 8),
		Block.createCuboidShape(23, -16, 6, 24, 28, 11),
		Block.createCuboidShape(-7, 27, 6, 23, 28, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 4, 20, 20, 5, 23),
		Block.createCuboidShape(5, 4, -6, 9, 5, 6),
		Block.createCuboidShape(0, 28, -8, 16, 32, 24),
		Block.createCuboidShape(0, -16, 24, 16, 32, 32),
		Block.createCuboidShape(0, -16, -16, 16, 32, -8),
		Block.createCuboidShape(5, -16, -8, 10, 28, -7),
		Block.createCuboidShape(6, -16, -7, 9, 27, -6),
		Block.createCuboidShape(6, 26, -6, 9, 27, 6),
		Block.createCuboidShape(6, -16, -6, 9, -15, 6),
		Block.createCuboidShape(8, -16, 21, 20, -15, 23),
		Block.createCuboidShape(8, 26, 21, 20, 27, 23),
		Block.createCuboidShape(7, -15, -6, 8, 4, 6),
		Block.createCuboidShape(8, -15, 22, 20, 4, 23),
		Block.createCuboidShape(6, -16, 6, 8, 27, 7),
		Block.createCuboidShape(7, -16, 21, 8, 27, 23),
		Block.createCuboidShape(20, -16, 21, 21, 27, 23),
		Block.createCuboidShape(8, -16, 6, 9, 27, 8),
		Block.createCuboidShape(5, -16, 23, 10, 28, 24),
		Block.createCuboidShape(5, 27, -7, 10, 28, 23)
    );

    public Bframe_Data() {
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

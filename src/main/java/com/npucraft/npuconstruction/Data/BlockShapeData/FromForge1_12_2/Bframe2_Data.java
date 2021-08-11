package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bframe2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, 4, 6, 22, 5, 11),
		Block.createCuboidShape(-7, 4, 10, -4, 5, 22),
		Block.createCuboidShape(23, -16, 6, 24, 32, 12),
		Block.createCuboidShape(-8, -16, 6, -7, 32, 12),
		Block.createCuboidShape(-16, -16, 8, -8, 32, 16),
		Block.createCuboidShape(24, -16, 8, 32, 32, 16),
		Block.createCuboidShape(-16, 0, 0, -8, 16, 16),
		Block.createCuboidShape(24, 0, 0, 32, 16, 16),
		Block.createCuboidShape(24, 16, 0, 32, 32, 8),
		Block.createCuboidShape(-16, 16, 0, -8, 32, 8),
		Block.createCuboidShape(24, -16, 0, 32, 0, 8),
		Block.createCuboidShape(-16, -16, 0, -8, 0, 8),
		Block.createCuboidShape(-8, 27, 6, 24, 28, 12),
		Block.createCuboidShape(-7, 28, 7, 23, 29, 11),
		Block.createCuboidShape(22, -16, 7, 23, 27, 11),
		Block.createCuboidShape(-7, -16, 9, -5, 27, 10),
		Block.createCuboidShape(-7, -16, 22, -5, 27, 23),
		Block.createCuboidShape(10, 26, 7, 22, 27, 11),
		Block.createCuboidShape(10, -15, 9, 22, 4, 10),
		Block.createCuboidShape(-7, -15, 10, -6, 4, 22),
		Block.createCuboidShape(10, -16, 7, 22, -15, 11),
		Block.createCuboidShape(-7, -16, 10, -5, -15, 22),
		Block.createCuboidShape(-7, 26, 10, -5, 27, 22),
		Block.createCuboidShape(9, -16, 7, 10, 27, 10),
		Block.createCuboidShape(8, -16, 10, 10, 27, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 4, 10, 10, 5, 22),
		Block.createCuboidShape(-6, 4, -7, 6, 5, -4),
		Block.createCuboidShape(4, -16, 23, 10, 32, 24),
		Block.createCuboidShape(4, -16, -8, 10, 32, -7),
		Block.createCuboidShape(0, -16, -16, 8, 32, -8),
		Block.createCuboidShape(0, -16, 24, 8, 32, 32),
		Block.createCuboidShape(0, 0, -16, 16, 16, -8),
		Block.createCuboidShape(0, 0, 24, 16, 16, 32),
		Block.createCuboidShape(8, 16, 24, 16, 32, 32),
		Block.createCuboidShape(8, 16, -16, 16, 32, -8),
		Block.createCuboidShape(8, -16, 24, 16, 0, 32),
		Block.createCuboidShape(8, -16, -16, 16, 0, -8),
		Block.createCuboidShape(4, 27, -8, 10, 28, 24),
		Block.createCuboidShape(5, 28, -7, 9, 29, 23),
		Block.createCuboidShape(5, -16, 22, 9, 27, 23),
		Block.createCuboidShape(6, -16, -7, 7, 27, -5),
		Block.createCuboidShape(-7, -16, -7, -6, 27, -5),
		Block.createCuboidShape(5, 26, 10, 9, 27, 22),
		Block.createCuboidShape(6, -15, 10, 7, 4, 22),
		Block.createCuboidShape(-6, -15, -7, 6, 4, -6),
		Block.createCuboidShape(5, -16, 10, 9, -15, 22),
		Block.createCuboidShape(-6, -16, -7, 6, -15, -5),
		Block.createCuboidShape(-6, 26, -7, 6, 27, -5),
		Block.createCuboidShape(6, -16, 9, 9, 27, 10),
		Block.createCuboidShape(5, -16, 8, 6, 27, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-6, 4, 5, 6, 5, 10),
		Block.createCuboidShape(20, 4, -6, 23, 5, 6),
		Block.createCuboidShape(-8, -16, 4, -7, 32, 10),
		Block.createCuboidShape(23, -16, 4, 24, 32, 10),
		Block.createCuboidShape(24, -16, 0, 32, 32, 8),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 8),
		Block.createCuboidShape(24, 0, 0, 32, 16, 16),
		Block.createCuboidShape(-16, 0, 0, -8, 16, 16),
		Block.createCuboidShape(-16, 16, 8, -8, 32, 16),
		Block.createCuboidShape(24, 16, 8, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 8, -8, 0, 16),
		Block.createCuboidShape(24, -16, 8, 32, 0, 16),
		Block.createCuboidShape(-8, 27, 4, 24, 28, 10),
		Block.createCuboidShape(-7, 28, 5, 23, 29, 9),
		Block.createCuboidShape(-7, -16, 5, -6, 27, 9),
		Block.createCuboidShape(21, -16, 6, 23, 27, 7),
		Block.createCuboidShape(21, -16, -7, 23, 27, -6),
		Block.createCuboidShape(-6, 26, 5, 6, 27, 9),
		Block.createCuboidShape(-6, -15, 6, 6, 4, 7),
		Block.createCuboidShape(22, -15, -6, 23, 4, 6),
		Block.createCuboidShape(-6, -16, 5, 6, -15, 9),
		Block.createCuboidShape(21, -16, -6, 23, -15, 6),
		Block.createCuboidShape(21, 26, -6, 23, 27, 6),
		Block.createCuboidShape(6, -16, 6, 7, 27, 9),
		Block.createCuboidShape(6, -16, 5, 8, 27, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, -6, 11, 5, 6),
		Block.createCuboidShape(10, 4, 20, 22, 5, 23),
		Block.createCuboidShape(6, -16, -8, 12, 32, -7),
		Block.createCuboidShape(6, -16, 23, 12, 32, 24),
		Block.createCuboidShape(8, -16, 24, 16, 32, 32),
		Block.createCuboidShape(8, -16, -16, 16, 32, -8),
		Block.createCuboidShape(0, 0, 24, 16, 16, 32),
		Block.createCuboidShape(0, 0, -16, 16, 16, -8),
		Block.createCuboidShape(0, 16, -16, 8, 32, -8),
		Block.createCuboidShape(0, 16, 24, 8, 32, 32),
		Block.createCuboidShape(0, -16, -16, 8, 0, -8),
		Block.createCuboidShape(0, -16, 24, 8, 0, 32),
		Block.createCuboidShape(6, 27, -8, 12, 28, 24),
		Block.createCuboidShape(7, 28, -7, 11, 29, 23),
		Block.createCuboidShape(7, -16, -7, 11, 27, -6),
		Block.createCuboidShape(9, -16, 21, 10, 27, 23),
		Block.createCuboidShape(22, -16, 21, 23, 27, 23),
		Block.createCuboidShape(7, 26, -6, 11, 27, 6),
		Block.createCuboidShape(9, -15, -6, 10, 4, 6),
		Block.createCuboidShape(10, -15, 22, 22, 4, 23),
		Block.createCuboidShape(7, -16, -6, 11, -15, 6),
		Block.createCuboidShape(10, -16, 21, 22, -15, 23),
		Block.createCuboidShape(10, 26, 21, 22, 27, 23),
		Block.createCuboidShape(7, -16, 6, 10, 27, 7),
		Block.createCuboidShape(10, -16, 6, 11, 27, 8)
    );

    public Bframe2_Data() {
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

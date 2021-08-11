package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bbedr_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 20, -1, 17, 25, 0),
		Block.createCuboidShape(-15, 20, 1, -14, 27, 14),
		Block.createCuboidShape(23, -16, -1, 24, 25, 3),
		Block.createCuboidShape(0, 12, 12, 22, 14, 15),
		Block.createCuboidShape(17, -14, 0, 24, -13, 15),
		Block.createCuboidShape(-14, -14, 3, 8, -13, 15),
		Block.createCuboidShape(8, -4, 3, 22, -3, 12),
		Block.createCuboidShape(-15, 19, -1, 24, 20, 16),
		Block.createCuboidShape(-15, -16, 15, -14, 25, 16),
		Block.createCuboidShape(-15, -16, -1, -14, 25, 0),
		Block.createCuboidShape(-15, 8, 0, -14, 9, 15),
		Block.createCuboidShape(-15, -14, 0, -14, -13, 15),
		Block.createCuboidShape(23, 10, 3, 24, 11, 15),
		Block.createCuboidShape(23, -16, 15, 24, 20, 16),
		Block.createCuboidShape(-13, -9, 4, -1, -8, 14),
		Block.createCuboidShape(0, -1, 3, 23, 0, 15),
		Block.createCuboidShape(-13, 17, 4, -1, 18, 14),
		Block.createCuboidShape(-14, -13, 3, -13, 18, 15),
		Block.createCuboidShape(-1, -13, 3, 0, 18, 15),
		Block.createCuboidShape(22, -13, 3, 23, -1, 14),
		Block.createCuboidShape(17, -13, 3, 18, -1, 13),
		Block.createCuboidShape(22, 0, 12, 23, 18, 15),
		Block.createCuboidShape(15, 0, 12, 16, 18, 15),
		Block.createCuboidShape(7, -13, 3, 8, -1, 13),
		Block.createCuboidShape(16, 6, 12, 22, 7, 14),
		Block.createCuboidShape(16, 17, 12, 22, 18, 14),
		Block.createCuboidShape(18, -4, 3, 22, -1, 4),
		Block.createCuboidShape(16, 0, 14, 22, 18, 15),
		Block.createCuboidShape(0, -13, 3, 7, -1, 4),
		Block.createCuboidShape(0, -13, 12, 7, -1, 13),
		Block.createCuboidShape(18, -4, 12, 22, -1, 13),
		Block.createCuboidShape(-13, -9, 3, -1, 18, 4),
		Block.createCuboidShape(-13, -13, 14, -1, 18, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(16, 20, -7, 17, 25, 17),
		Block.createCuboidShape(2, 20, -15, 15, 27, -14),
		Block.createCuboidShape(13, -16, 23, 17, 25, 24),
		Block.createCuboidShape(1, 12, 0, 4, 14, 22),
		Block.createCuboidShape(1, -14, 17, 16, -13, 24),
		Block.createCuboidShape(1, -14, -14, 13, -13, 8),
		Block.createCuboidShape(4, -4, 8, 13, -3, 22),
		Block.createCuboidShape(0, 19, -15, 17, 20, 24),
		Block.createCuboidShape(0, -16, -15, 1, 25, -14),
		Block.createCuboidShape(16, -16, -15, 17, 25, -14),
		Block.createCuboidShape(1, 8, -15, 16, 9, -14),
		Block.createCuboidShape(1, -14, -15, 16, -13, -14),
		Block.createCuboidShape(1, 10, 23, 13, 11, 24),
		Block.createCuboidShape(0, -16, 23, 1, 20, 24),
		Block.createCuboidShape(2, -9, -13, 12, -8, -1),
		Block.createCuboidShape(1, -1, 0, 13, 0, 23),
		Block.createCuboidShape(2, 17, -13, 12, 18, -1),
		Block.createCuboidShape(1, -13, -14, 13, 18, -13),
		Block.createCuboidShape(1, -13, -1, 13, 18, 0),
		Block.createCuboidShape(2, -13, 22, 13, -1, 23),
		Block.createCuboidShape(3, -13, 17, 13, -1, 18),
		Block.createCuboidShape(1, 0, 22, 4, 18, 23),
		Block.createCuboidShape(1, 0, 15, 4, 18, 16),
		Block.createCuboidShape(3, -13, 7, 13, -1, 8),
		Block.createCuboidShape(2, 6, 16, 4, 7, 22),
		Block.createCuboidShape(2, 17, 16, 4, 18, 22),
		Block.createCuboidShape(12, -4, 18, 13, -1, 22),
		Block.createCuboidShape(1, 0, 16, 2, 18, 22),
		Block.createCuboidShape(12, -13, 0, 13, -1, 7),
		Block.createCuboidShape(3, -13, 0, 4, -1, 7),
		Block.createCuboidShape(3, -4, 18, 4, -1, 22),
		Block.createCuboidShape(12, -9, -13, 13, 18, -1),
		Block.createCuboidShape(1, -13, -13, 2, 18, -1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 20, 16, 23, 25, 17),
		Block.createCuboidShape(30, 20, 2, 31, 27, 15),
		Block.createCuboidShape(-8, -16, 13, -7, 25, 17),
		Block.createCuboidShape(-6, 12, 1, 16, 14, 4),
		Block.createCuboidShape(-8, -14, 1, -1, -13, 16),
		Block.createCuboidShape(8, -14, 1, 30, -13, 13),
		Block.createCuboidShape(-6, -4, 4, 8, -3, 13),
		Block.createCuboidShape(-8, 19, 0, 31, 20, 17),
		Block.createCuboidShape(30, -16, 0, 31, 25, 1),
		Block.createCuboidShape(30, -16, 16, 31, 25, 17),
		Block.createCuboidShape(30, 8, 1, 31, 9, 16),
		Block.createCuboidShape(30, -14, 1, 31, -13, 16),
		Block.createCuboidShape(-8, 10, 1, -7, 11, 13),
		Block.createCuboidShape(-8, -16, 0, -7, 20, 1),
		Block.createCuboidShape(17, -9, 2, 29, -8, 12),
		Block.createCuboidShape(-7, -1, 1, 16, 0, 13),
		Block.createCuboidShape(17, 17, 2, 29, 18, 12),
		Block.createCuboidShape(29, -13, 1, 30, 18, 13),
		Block.createCuboidShape(16, -13, 1, 17, 18, 13),
		Block.createCuboidShape(-7, -13, 2, -6, -1, 13),
		Block.createCuboidShape(-2, -13, 3, -1, -1, 13),
		Block.createCuboidShape(-7, 0, 1, -6, 18, 4),
		Block.createCuboidShape(0, 0, 1, 1, 18, 4),
		Block.createCuboidShape(8, -13, 3, 9, -1, 13),
		Block.createCuboidShape(-6, 6, 2, 0, 7, 4),
		Block.createCuboidShape(-6, 17, 2, 0, 18, 4),
		Block.createCuboidShape(-6, -4, 12, -2, -1, 13),
		Block.createCuboidShape(-6, 0, 1, 0, 18, 2),
		Block.createCuboidShape(9, -13, 12, 16, -1, 13),
		Block.createCuboidShape(9, -13, 3, 16, -1, 4),
		Block.createCuboidShape(-6, -4, 3, -2, -1, 4),
		Block.createCuboidShape(17, -9, 12, 29, 18, 13),
		Block.createCuboidShape(17, -13, 1, 29, 18, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 20, -1, 0, 25, 23),
		Block.createCuboidShape(1, 20, 30, 14, 27, 31),
		Block.createCuboidShape(-1, -16, -8, 3, 25, -7),
		Block.createCuboidShape(12, 12, -6, 15, 14, 16),
		Block.createCuboidShape(0, -14, -8, 15, -13, -1),
		Block.createCuboidShape(3, -14, 8, 15, -13, 30),
		Block.createCuboidShape(3, -4, -6, 12, -3, 8),
		Block.createCuboidShape(-1, 19, -8, 16, 20, 31),
		Block.createCuboidShape(15, -16, 30, 16, 25, 31),
		Block.createCuboidShape(-1, -16, 30, 0, 25, 31),
		Block.createCuboidShape(0, 8, 30, 15, 9, 31),
		Block.createCuboidShape(0, -14, 30, 15, -13, 31),
		Block.createCuboidShape(3, 10, -8, 15, 11, -7),
		Block.createCuboidShape(15, -16, -8, 16, 20, -7),
		Block.createCuboidShape(4, -9, 17, 14, -8, 29),
		Block.createCuboidShape(3, -1, -7, 15, 0, 16),
		Block.createCuboidShape(4, 17, 17, 14, 18, 29),
		Block.createCuboidShape(3, -13, 29, 15, 18, 30),
		Block.createCuboidShape(3, -13, 16, 15, 18, 17),
		Block.createCuboidShape(3, -13, -7, 14, -1, -6),
		Block.createCuboidShape(3, -13, -2, 13, -1, -1),
		Block.createCuboidShape(12, 0, -7, 15, 18, -6),
		Block.createCuboidShape(12, 0, 0, 15, 18, 1),
		Block.createCuboidShape(3, -13, 8, 13, -1, 9),
		Block.createCuboidShape(12, 6, -6, 14, 7, 0),
		Block.createCuboidShape(12, 17, -6, 14, 18, 0),
		Block.createCuboidShape(3, -4, -6, 4, -1, -2),
		Block.createCuboidShape(14, 0, -6, 15, 18, 0),
		Block.createCuboidShape(3, -13, 9, 4, -1, 16),
		Block.createCuboidShape(12, -13, 9, 13, -1, 16),
		Block.createCuboidShape(12, -4, -6, 13, -1, -2),
		Block.createCuboidShape(3, -9, 17, 4, 18, 29),
		Block.createCuboidShape(14, -13, 17, 15, 18, 29)
    );

    public Bbedr_Data() {
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

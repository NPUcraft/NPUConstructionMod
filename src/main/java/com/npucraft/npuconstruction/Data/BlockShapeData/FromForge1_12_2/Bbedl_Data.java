package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bbedl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 20, -1, 23, 25, 0),
		Block.createCuboidShape(30, 20, 1, 31, 27, 14),
		Block.createCuboidShape(-8, -16, -1, -7, 25, 3),
		Block.createCuboidShape(-6, 12, 12, 16, 14, 15),
		Block.createCuboidShape(-8, -14, 0, -1, -13, 15),
		Block.createCuboidShape(8, -14, 3, 30, -13, 15),
		Block.createCuboidShape(-6, -4, 3, 8, -3, 12),
		Block.createCuboidShape(-8, 19, -1, 31, 20, 16),
		Block.createCuboidShape(30, -16, 15, 31, 25, 16),
		Block.createCuboidShape(30, -16, -1, 31, 25, 0),
		Block.createCuboidShape(30, 8, 0, 31, 9, 15),
		Block.createCuboidShape(30, -14, 0, 31, -13, 15),
		Block.createCuboidShape(-8, 10, 3, -7, 11, 15),
		Block.createCuboidShape(-8, -16, 15, -7, 20, 16),
		Block.createCuboidShape(17, -9, 4, 29, -8, 14),
		Block.createCuboidShape(-7, -1, 3, 16, 0, 15),
		Block.createCuboidShape(17, 17, 4, 29, 18, 14),
		Block.createCuboidShape(29, -13, 3, 30, 18, 15),
		Block.createCuboidShape(16, -13, 3, 17, 18, 15),
		Block.createCuboidShape(-7, -13, 3, -6, -1, 14),
		Block.createCuboidShape(-2, -13, 3, -1, -1, 13),
		Block.createCuboidShape(-7, 0, 12, -6, 18, 15),
		Block.createCuboidShape(0, 0, 12, 1, 18, 15),
		Block.createCuboidShape(8, -13, 3, 9, -1, 13),
		Block.createCuboidShape(-6, 6, 12, 0, 7, 14),
		Block.createCuboidShape(-6, 17, 12, 0, 18, 14),
		Block.createCuboidShape(-6, -4, 3, -2, -1, 4),
		Block.createCuboidShape(-6, 0, 14, 0, 18, 15),
		Block.createCuboidShape(9, -13, 3, 16, -1, 4),
		Block.createCuboidShape(9, -13, 12, 16, -1, 13),
		Block.createCuboidShape(-6, -4, 12, -2, -1, 13),
		Block.createCuboidShape(17, -9, 3, 29, 18, 4),
		Block.createCuboidShape(17, -13, 14, 29, 18, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(16, 20, -1, 17, 25, 23),
		Block.createCuboidShape(2, 20, 30, 15, 27, 31),
		Block.createCuboidShape(13, -16, -8, 17, 25, -7),
		Block.createCuboidShape(1, 12, -6, 4, 14, 16),
		Block.createCuboidShape(1, -14, -8, 16, -13, -1),
		Block.createCuboidShape(1, -14, 8, 13, -13, 30),
		Block.createCuboidShape(4, -4, -6, 13, -3, 8),
		Block.createCuboidShape(0, 19, -8, 17, 20, 31),
		Block.createCuboidShape(0, -16, 30, 1, 25, 31),
		Block.createCuboidShape(16, -16, 30, 17, 25, 31),
		Block.createCuboidShape(1, 8, 30, 16, 9, 31),
		Block.createCuboidShape(1, -14, 30, 16, -13, 31),
		Block.createCuboidShape(1, 10, -8, 13, 11, -7),
		Block.createCuboidShape(0, -16, -8, 1, 20, -7),
		Block.createCuboidShape(2, -9, 17, 12, -8, 29),
		Block.createCuboidShape(1, -1, -7, 13, 0, 16),
		Block.createCuboidShape(2, 17, 17, 12, 18, 29),
		Block.createCuboidShape(1, -13, 29, 13, 18, 30),
		Block.createCuboidShape(1, -13, 16, 13, 18, 17),
		Block.createCuboidShape(2, -13, -7, 13, -1, -6),
		Block.createCuboidShape(3, -13, -2, 13, -1, -1),
		Block.createCuboidShape(1, 0, -7, 4, 18, -6),
		Block.createCuboidShape(1, 0, 0, 4, 18, 1),
		Block.createCuboidShape(3, -13, 8, 13, -1, 9),
		Block.createCuboidShape(2, 6, -6, 4, 7, 0),
		Block.createCuboidShape(2, 17, -6, 4, 18, 0),
		Block.createCuboidShape(12, -4, -6, 13, -1, -2),
		Block.createCuboidShape(1, 0, -6, 2, 18, 0),
		Block.createCuboidShape(12, -13, 9, 13, -1, 16),
		Block.createCuboidShape(3, -13, 9, 4, -1, 16),
		Block.createCuboidShape(3, -4, -6, 4, -1, -2),
		Block.createCuboidShape(12, -9, 17, 13, 18, 29),
		Block.createCuboidShape(1, -13, 17, 2, 18, 29)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 20, 16, 17, 25, 17),
		Block.createCuboidShape(-15, 20, 2, -14, 27, 15),
		Block.createCuboidShape(23, -16, 13, 24, 25, 17),
		Block.createCuboidShape(0, 12, 1, 22, 14, 4),
		Block.createCuboidShape(17, -14, 1, 24, -13, 16),
		Block.createCuboidShape(-14, -14, 1, 8, -13, 13),
		Block.createCuboidShape(8, -4, 4, 22, -3, 13),
		Block.createCuboidShape(-15, 19, 0, 24, 20, 17),
		Block.createCuboidShape(-15, -16, 0, -14, 25, 1),
		Block.createCuboidShape(-15, -16, 16, -14, 25, 17),
		Block.createCuboidShape(-15, 8, 1, -14, 9, 16),
		Block.createCuboidShape(-15, -14, 1, -14, -13, 16),
		Block.createCuboidShape(23, 10, 1, 24, 11, 13),
		Block.createCuboidShape(23, -16, 0, 24, 20, 1),
		Block.createCuboidShape(-13, -9, 2, -1, -8, 12),
		Block.createCuboidShape(0, -1, 1, 23, 0, 13),
		Block.createCuboidShape(-13, 17, 2, -1, 18, 12),
		Block.createCuboidShape(-14, -13, 1, -13, 18, 13),
		Block.createCuboidShape(-1, -13, 1, 0, 18, 13),
		Block.createCuboidShape(22, -13, 2, 23, -1, 13),
		Block.createCuboidShape(17, -13, 3, 18, -1, 13),
		Block.createCuboidShape(22, 0, 1, 23, 18, 4),
		Block.createCuboidShape(15, 0, 1, 16, 18, 4),
		Block.createCuboidShape(7, -13, 3, 8, -1, 13),
		Block.createCuboidShape(16, 6, 2, 22, 7, 4),
		Block.createCuboidShape(16, 17, 2, 22, 18, 4),
		Block.createCuboidShape(18, -4, 12, 22, -1, 13),
		Block.createCuboidShape(16, 0, 1, 22, 18, 2),
		Block.createCuboidShape(0, -13, 12, 7, -1, 13),
		Block.createCuboidShape(0, -13, 3, 7, -1, 4),
		Block.createCuboidShape(18, -4, 3, 22, -1, 4),
		Block.createCuboidShape(-13, -9, 12, -1, 18, 13),
		Block.createCuboidShape(-13, -13, 1, -1, 18, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 20, -7, 0, 25, 17),
		Block.createCuboidShape(1, 20, -15, 14, 27, -14),
		Block.createCuboidShape(-1, -16, 23, 3, 25, 24),
		Block.createCuboidShape(12, 12, 0, 15, 14, 22),
		Block.createCuboidShape(0, -14, 17, 15, -13, 24),
		Block.createCuboidShape(3, -14, -14, 15, -13, 8),
		Block.createCuboidShape(3, -4, 8, 12, -3, 22),
		Block.createCuboidShape(-1, 19, -15, 16, 20, 24),
		Block.createCuboidShape(15, -16, -15, 16, 25, -14),
		Block.createCuboidShape(-1, -16, -15, 0, 25, -14),
		Block.createCuboidShape(0, 8, -15, 15, 9, -14),
		Block.createCuboidShape(0, -14, -15, 15, -13, -14),
		Block.createCuboidShape(3, 10, 23, 15, 11, 24),
		Block.createCuboidShape(15, -16, 23, 16, 20, 24),
		Block.createCuboidShape(4, -9, -13, 14, -8, -1),
		Block.createCuboidShape(3, -1, 0, 15, 0, 23),
		Block.createCuboidShape(4, 17, -13, 14, 18, -1),
		Block.createCuboidShape(3, -13, -14, 15, 18, -13),
		Block.createCuboidShape(3, -13, -1, 15, 18, 0),
		Block.createCuboidShape(3, -13, 22, 14, -1, 23),
		Block.createCuboidShape(3, -13, 17, 13, -1, 18),
		Block.createCuboidShape(12, 0, 22, 15, 18, 23),
		Block.createCuboidShape(12, 0, 15, 15, 18, 16),
		Block.createCuboidShape(3, -13, 7, 13, -1, 8),
		Block.createCuboidShape(12, 6, 16, 14, 7, 22),
		Block.createCuboidShape(12, 17, 16, 14, 18, 22),
		Block.createCuboidShape(3, -4, 18, 4, -1, 22),
		Block.createCuboidShape(14, 0, 16, 15, 18, 22),
		Block.createCuboidShape(3, -13, 0, 4, -1, 7),
		Block.createCuboidShape(12, -13, 0, 13, -1, 7),
		Block.createCuboidShape(12, -4, 18, 13, -1, 22),
		Block.createCuboidShape(3, -9, -13, 4, 18, -1),
		Block.createCuboidShape(14, -13, -13, 15, 18, -1)
    );

    public Bbedl_Data() {
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

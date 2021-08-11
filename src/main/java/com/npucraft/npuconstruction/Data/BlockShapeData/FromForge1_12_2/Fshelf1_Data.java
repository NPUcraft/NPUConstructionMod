package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fshelf1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, -11, 3, 15, -10, 13),
		Block.createCuboidShape(-14, -7, 2, 3, -6, 14),
		Block.createCuboidShape(-7, 11, 3, -3, 17, 14),
		Block.createCuboidShape(-13, -12, 3, 14, -11, 13),
		Block.createCuboidShape(-13, -12, 13, 2, -6, 14),
		Block.createCuboidShape(-13, -12, 2, 2, -6, 3),
		Block.createCuboidShape(-7, -12, 2, -4, -9, 14),
		Block.createCuboidShape(-12, 11, 3, -9, 16, 14),
		Block.createCuboidShape(-11, -2, 4, -6, 4, 9),
		Block.createCuboidShape(-4, -1, 3, 4, 6, 15),
		Block.createCuboidShape(5, -1, 3, 13, 6, 15),
		Block.createCuboidShape(15, -16, 0, 16, 24, 1),
		Block.createCuboidShape(15, -16, 15, 16, 24, 16),
		Block.createCuboidShape(-15, -16, 0, -14, 24, 1),
		Block.createCuboidShape(-15, -16, 15, -14, 24, 16),
		Block.createCuboidShape(-14, -13, 1, 15, -12, 15),
		Block.createCuboidShape(-14, -13, 0, 15, -12, 1),
		Block.createCuboidShape(-14, -13, 15, 15, -12, 16),
		Block.createCuboidShape(-15, -13, 1, -14, -12, 15),
		Block.createCuboidShape(15, -13, 1, 16, -12, 15),
		Block.createCuboidShape(-14, -2, 15, 15, -1, 16),
		Block.createCuboidShape(-14, -2, 0, 15, -1, 1),
		Block.createCuboidShape(-14, -2, 1, 15, -1, 15),
		Block.createCuboidShape(-15, -2, 1, -14, -1, 15),
		Block.createCuboidShape(15, -2, 1, 16, -1, 15),
		Block.createCuboidShape(-14, 10, 15, 15, 12, 16),
		Block.createCuboidShape(-14, 10, 0, 15, 12, 1),
		Block.createCuboidShape(-14, 10, 1, 15, 11, 15),
		Block.createCuboidShape(-15, 10, 1, -14, 12, 15),
		Block.createCuboidShape(15, 10, 1, 16, 12, 15),
		Block.createCuboidShape(-14, 21, 15, 15, 23, 16),
		Block.createCuboidShape(-14, 21, 0, 15, 23, 1),
		Block.createCuboidShape(-14, 21, 1, 15, 22, 15),
		Block.createCuboidShape(-15, 21, 1, -14, 23, 15),
		Block.createCuboidShape(15, 21, 1, 16, 23, 15),
		Block.createCuboidShape(-14, -12, 2, -13, -9, 14),
		Block.createCuboidShape(2, -12, 2, 3, -9, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, -11, 4, 13, -10, 15),
		Block.createCuboidShape(2, -7, -14, 14, -6, 3),
		Block.createCuboidShape(2, 11, -7, 13, 17, -3),
		Block.createCuboidShape(3, -12, -13, 13, -11, 14),
		Block.createCuboidShape(2, -12, -13, 3, -6, 2),
		Block.createCuboidShape(13, -12, -13, 14, -6, 2),
		Block.createCuboidShape(2, -12, -7, 14, -9, -4),
		Block.createCuboidShape(2, 11, -12, 13, 16, -9),
		Block.createCuboidShape(7, -2, -11, 12, 4, -6),
		Block.createCuboidShape(1, -1, -4, 13, 6, 4),
		Block.createCuboidShape(1, -1, 5, 13, 6, 13),
		Block.createCuboidShape(15, -16, 15, 16, 24, 16),
		Block.createCuboidShape(0, -16, 15, 1, 24, 16),
		Block.createCuboidShape(15, -16, -15, 16, 24, -14),
		Block.createCuboidShape(0, -16, -15, 1, 24, -14),
		Block.createCuboidShape(1, -13, -14, 15, -12, 15),
		Block.createCuboidShape(15, -13, -14, 16, -12, 15),
		Block.createCuboidShape(0, -13, -14, 1, -12, 15),
		Block.createCuboidShape(1, -13, -15, 15, -12, -14),
		Block.createCuboidShape(1, -13, 15, 15, -12, 16),
		Block.createCuboidShape(0, -2, -14, 1, -1, 15),
		Block.createCuboidShape(15, -2, -14, 16, -1, 15),
		Block.createCuboidShape(1, -2, -14, 15, -1, 15),
		Block.createCuboidShape(1, -2, -15, 15, -1, -14),
		Block.createCuboidShape(1, -2, 15, 15, -1, 16),
		Block.createCuboidShape(0, 10, -14, 1, 12, 15),
		Block.createCuboidShape(15, 10, -14, 16, 12, 15),
		Block.createCuboidShape(1, 10, -14, 15, 11, 15),
		Block.createCuboidShape(1, 10, -15, 15, 12, -14),
		Block.createCuboidShape(1, 10, 15, 15, 12, 16),
		Block.createCuboidShape(0, 21, -14, 1, 23, 15),
		Block.createCuboidShape(15, 21, -14, 16, 23, 15),
		Block.createCuboidShape(1, 21, -14, 15, 22, 15),
		Block.createCuboidShape(1, 21, -15, 15, 23, -14),
		Block.createCuboidShape(1, 21, 15, 15, 23, 16),
		Block.createCuboidShape(2, -12, -14, 14, -9, -13),
		Block.createCuboidShape(2, -12, 2, 14, -9, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -11, 3, 12, -10, 13),
		Block.createCuboidShape(13, -7, 2, 30, -6, 14),
		Block.createCuboidShape(19, 11, 2, 23, 17, 13),
		Block.createCuboidShape(2, -12, 3, 29, -11, 13),
		Block.createCuboidShape(14, -12, 2, 29, -6, 3),
		Block.createCuboidShape(14, -12, 13, 29, -6, 14),
		Block.createCuboidShape(20, -12, 2, 23, -9, 14),
		Block.createCuboidShape(25, 11, 2, 28, 16, 13),
		Block.createCuboidShape(22, -2, 7, 27, 4, 12),
		Block.createCuboidShape(12, -1, 1, 20, 6, 13),
		Block.createCuboidShape(3, -1, 1, 11, 6, 13),
		Block.createCuboidShape(0, -16, 15, 1, 24, 16),
		Block.createCuboidShape(0, -16, 0, 1, 24, 1),
		Block.createCuboidShape(30, -16, 15, 31, 24, 16),
		Block.createCuboidShape(30, -16, 0, 31, 24, 1),
		Block.createCuboidShape(1, -13, 1, 30, -12, 15),
		Block.createCuboidShape(1, -13, 15, 30, -12, 16),
		Block.createCuboidShape(1, -13, 0, 30, -12, 1),
		Block.createCuboidShape(30, -13, 1, 31, -12, 15),
		Block.createCuboidShape(0, -13, 1, 1, -12, 15),
		Block.createCuboidShape(1, -2, 0, 30, -1, 1),
		Block.createCuboidShape(1, -2, 15, 30, -1, 16),
		Block.createCuboidShape(1, -2, 1, 30, -1, 15),
		Block.createCuboidShape(30, -2, 1, 31, -1, 15),
		Block.createCuboidShape(0, -2, 1, 1, -1, 15),
		Block.createCuboidShape(1, 10, 0, 30, 12, 1),
		Block.createCuboidShape(1, 10, 15, 30, 12, 16),
		Block.createCuboidShape(1, 10, 1, 30, 11, 15),
		Block.createCuboidShape(30, 10, 1, 31, 12, 15),
		Block.createCuboidShape(0, 10, 1, 1, 12, 15),
		Block.createCuboidShape(1, 21, 0, 30, 23, 1),
		Block.createCuboidShape(1, 21, 15, 30, 23, 16),
		Block.createCuboidShape(1, 21, 1, 30, 22, 15),
		Block.createCuboidShape(30, 21, 1, 31, 23, 15),
		Block.createCuboidShape(0, 21, 1, 1, 23, 15),
		Block.createCuboidShape(29, -12, 2, 30, -9, 14),
		Block.createCuboidShape(13, -12, 2, 14, -9, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, -11, 1, 13, -10, 12),
		Block.createCuboidShape(2, -7, 13, 14, -6, 30),
		Block.createCuboidShape(3, 11, 19, 14, 17, 23),
		Block.createCuboidShape(3, -12, 2, 13, -11, 29),
		Block.createCuboidShape(13, -12, 14, 14, -6, 29),
		Block.createCuboidShape(2, -12, 14, 3, -6, 29),
		Block.createCuboidShape(2, -12, 20, 14, -9, 23),
		Block.createCuboidShape(3, 11, 25, 14, 16, 28),
		Block.createCuboidShape(4, -2, 22, 9, 4, 27),
		Block.createCuboidShape(3, -1, 12, 15, 6, 20),
		Block.createCuboidShape(3, -1, 3, 15, 6, 11),
		Block.createCuboidShape(0, -16, 0, 1, 24, 1),
		Block.createCuboidShape(15, -16, 0, 16, 24, 1),
		Block.createCuboidShape(0, -16, 30, 1, 24, 31),
		Block.createCuboidShape(15, -16, 30, 16, 24, 31),
		Block.createCuboidShape(1, -13, 1, 15, -12, 30),
		Block.createCuboidShape(0, -13, 1, 1, -12, 30),
		Block.createCuboidShape(15, -13, 1, 16, -12, 30),
		Block.createCuboidShape(1, -13, 30, 15, -12, 31),
		Block.createCuboidShape(1, -13, 0, 15, -12, 1),
		Block.createCuboidShape(15, -2, 1, 16, -1, 30),
		Block.createCuboidShape(0, -2, 1, 1, -1, 30),
		Block.createCuboidShape(1, -2, 1, 15, -1, 30),
		Block.createCuboidShape(1, -2, 30, 15, -1, 31),
		Block.createCuboidShape(1, -2, 0, 15, -1, 1),
		Block.createCuboidShape(15, 10, 1, 16, 12, 30),
		Block.createCuboidShape(0, 10, 1, 1, 12, 30),
		Block.createCuboidShape(1, 10, 1, 15, 11, 30),
		Block.createCuboidShape(1, 10, 30, 15, 12, 31),
		Block.createCuboidShape(1, 10, 0, 15, 12, 1),
		Block.createCuboidShape(15, 21, 1, 16, 23, 30),
		Block.createCuboidShape(0, 21, 1, 1, 23, 30),
		Block.createCuboidShape(1, 21, 1, 15, 22, 30),
		Block.createCuboidShape(1, 21, 30, 15, 23, 31),
		Block.createCuboidShape(1, 21, 0, 15, 23, 1),
		Block.createCuboidShape(2, -12, 29, 14, -9, 30),
		Block.createCuboidShape(2, -12, 13, 14, -9, 14)
    );

    public Fshelf1_Data() {
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

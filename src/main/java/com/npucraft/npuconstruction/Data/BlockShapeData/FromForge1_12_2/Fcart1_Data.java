package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcart1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(24, 1, 10, 28, 9, 22),
		Block.createCuboidShape(-13, -13, 1, 7, -1, 2),
		Block.createCuboidShape(-12, 1, 10, 5, 3, 22),
		Block.createCuboidShape(12, 13, 10, 29, 16, 22),
		Block.createCuboidShape(19, 1, 10, 21, 10, 22),
		Block.createCuboidShape(-6, 14, 10, -3, 22, 22),
		Block.createCuboidShape(-12, 3, 10, 5, 5, 22),
		Block.createCuboidShape(12, 16, 10, 29, 17, 22),
		Block.createCuboidShape(-12, 5, 10, -4, 7, 22),
		Block.createCuboidShape(-12, 7, 10, -4, 9, 22),
		Block.createCuboidShape(22, 1, 10, 24, 9, 22),
		Block.createCuboidShape(28, 1, 10, 30, 9, 22),
		Block.createCuboidShape(17, 1, 10, 19, 10, 22),
		Block.createCuboidShape(15, 1, 10, 17, 10, 22),
		Block.createCuboidShape(13, 1, 10, 15, 10, 22),
		Block.createCuboidShape(12, 17, 10, 20, 19, 22),
		Block.createCuboidShape(12, 19, 10, 20, 21, 22),
		Block.createCuboidShape(4, 13, 10, 6, 21, 22),
		Block.createCuboidShape(2, 13, 10, 4, 21, 22),
		Block.createCuboidShape(0, 13, 10, 2, 21, 22),
		Block.createCuboidShape(-2, 13, 10, 0, 21, 22),
		Block.createCuboidShape(-8, 14, 10, -6, 22, 22),
		Block.createCuboidShape(-10, 14, 10, -8, 22, 22),
		Block.createCuboidShape(-11, 14, 10, -10, 22, 22),
		Block.createCuboidShape(-15, -14, 30, 31, -11, 31),
		Block.createCuboidShape(9, -11, 30, 29, -1, 31),
		Block.createCuboidShape(5, 24, 23, 29, 26, 25),
		Block.createCuboidShape(5, 1, 23, 29, 3, 25),
		Block.createCuboidShape(-13, 1, 7, 11, 3, 9),
		Block.createCuboidShape(-13, 24, 7, 11, 26, 9),
		Block.createCuboidShape(29, -14, 30, 32, 0, 31),
		Block.createCuboidShape(-16, -14, 1, -13, -1, 2),
		Block.createCuboidShape(-15, 26, 7, 31, 27, 25),
		Block.createCuboidShape(31, 0, 7, 32, 27, 25),
		Block.createCuboidShape(-16, 0, 7, -15, 27, 25),
		Block.createCuboidShape(-15, 0, 7, 31, 1, 25),
		Block.createCuboidShape(-16, -14, 2, 32, 0, 30),
		Block.createCuboidShape(-15, 12, 9, 31, 13, 23),
		Block.createCuboidShape(29, 1, 24, 31, 26, 25),
		Block.createCuboidShape(7, 1, 24, 9, 26, 25),
		Block.createCuboidShape(7, 1, 7, 9, 26, 8),
		Block.createCuboidShape(-15, 1, 7, -13, 26, 8),
		Block.createCuboidShape(-16, -1, 30, 31, 0, 31),
		Block.createCuboidShape(-16, -14, 30, -15, -1, 31),
		Block.createCuboidShape(7, -14, 30, 9, -1, 31),
		Block.createCuboidShape(-16, -1, 1, 31, 0, 2),
		Block.createCuboidShape(-15, -14, 1, 31, -13, 2),
		Block.createCuboidShape(7, -13, 1, 9, -1, 2),
		Block.createCuboidShape(31, -14, 1, 32, 0, 2),
		Block.createCuboidShape(3, 1, 23, 5, 26, 24),
		Block.createCuboidShape(25, 1, 23, 27, 26, 24),
		Block.createCuboidShape(11, 1, 9, 13, 26, 9),
		Block.createCuboidShape(-11, 1, 9, -9, 26, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-6, 1, 24, 6, 9, 28),
		Block.createCuboidShape(14, -13, -13, 15, -1, 7),
		Block.createCuboidShape(-6, 1, -12, 6, 3, 5),
		Block.createCuboidShape(-6, 13, 12, 6, 16, 29),
		Block.createCuboidShape(-6, 1, 19, 6, 10, 21),
		Block.createCuboidShape(-6, 14, -6, 6, 22, -3),
		Block.createCuboidShape(-6, 3, -12, 6, 5, 5),
		Block.createCuboidShape(-6, 16, 12, 6, 17, 29),
		Block.createCuboidShape(-6, 5, -12, 6, 7, -4),
		Block.createCuboidShape(-6, 7, -12, 6, 9, -4),
		Block.createCuboidShape(-6, 1, 22, 6, 9, 24),
		Block.createCuboidShape(-6, 1, 28, 6, 9, 30),
		Block.createCuboidShape(-6, 1, 17, 6, 10, 19),
		Block.createCuboidShape(-6, 1, 15, 6, 10, 17),
		Block.createCuboidShape(-6, 1, 13, 6, 10, 15),
		Block.createCuboidShape(-6, 17, 12, 6, 19, 20),
		Block.createCuboidShape(-6, 19, 12, 6, 21, 20),
		Block.createCuboidShape(-6, 13, 4, 6, 21, 6),
		Block.createCuboidShape(-6, 13, 2, 6, 21, 4),
		Block.createCuboidShape(-6, 13, 0, 6, 21, 2),
		Block.createCuboidShape(-6, 13, -2, 6, 21, 0),
		Block.createCuboidShape(-6, 14, -8, 6, 22, -6),
		Block.createCuboidShape(-6, 14, -10, 6, 22, -8),
		Block.createCuboidShape(-6, 14, -11, 6, 22, -10),
		Block.createCuboidShape(-15, -14, -15, -14, -11, 31),
		Block.createCuboidShape(-15, -11, 9, -14, -1, 29),
		Block.createCuboidShape(-9, 24, 5, -7, 26, 29),
		Block.createCuboidShape(-9, 1, 5, -7, 3, 29),
		Block.createCuboidShape(7, 1, -13, 9, 3, 11),
		Block.createCuboidShape(7, 24, -13, 9, 26, 11),
		Block.createCuboidShape(-15, -14, 29, -14, 0, 32),
		Block.createCuboidShape(14, -14, -16, 15, -1, -13),
		Block.createCuboidShape(-9, 26, -15, 9, 27, 31),
		Block.createCuboidShape(-9, 0, 31, 9, 27, 32),
		Block.createCuboidShape(-9, 0, -16, 9, 27, -15),
		Block.createCuboidShape(-9, 0, -15, 9, 1, 31),
		Block.createCuboidShape(-14, -14, -16, 14, 0, 32),
		Block.createCuboidShape(-7, 12, -15, 7, 13, 31),
		Block.createCuboidShape(-9, 1, 29, -8, 26, 31),
		Block.createCuboidShape(-9, 1, 7, -8, 26, 9),
		Block.createCuboidShape(8, 1, 7, 9, 26, 9),
		Block.createCuboidShape(8, 1, -15, 9, 26, -13),
		Block.createCuboidShape(-15, -1, -16, -14, 0, 31),
		Block.createCuboidShape(-15, -14, -16, -14, -1, -15),
		Block.createCuboidShape(-15, -14, 7, -14, -1, 9),
		Block.createCuboidShape(14, -1, -16, 15, 0, 31),
		Block.createCuboidShape(14, -14, -15, 15, -13, 31),
		Block.createCuboidShape(14, -13, 7, 15, -1, 9),
		Block.createCuboidShape(14, -14, 31, 15, 0, 32),
		Block.createCuboidShape(-8, 1, 3, -7, 26, 5),
		Block.createCuboidShape(-8, 1, 25, -7, 26, 27),
		Block.createCuboidShape(7, 1, 11, 7, 26, 13),
		Block.createCuboidShape(7, 1, -11, 7, 26, -9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 1, -6, -8, 9, 6),
		Block.createCuboidShape(9, -13, 14, 29, -1, 15),
		Block.createCuboidShape(11, 1, -6, 28, 3, 6),
		Block.createCuboidShape(-13, 13, -6, 4, 16, 6),
		Block.createCuboidShape(-5, 1, -6, -3, 10, 6),
		Block.createCuboidShape(19, 14, -6, 22, 22, 6),
		Block.createCuboidShape(11, 3, -6, 28, 5, 6),
		Block.createCuboidShape(-13, 16, -6, 4, 17, 6),
		Block.createCuboidShape(20, 5, -6, 28, 7, 6),
		Block.createCuboidShape(20, 7, -6, 28, 9, 6),
		Block.createCuboidShape(-8, 1, -6, -6, 9, 6),
		Block.createCuboidShape(-14, 1, -6, -12, 9, 6),
		Block.createCuboidShape(-3, 1, -6, -1, 10, 6),
		Block.createCuboidShape(-1, 1, -6, 1, 10, 6),
		Block.createCuboidShape(1, 1, -6, 3, 10, 6),
		Block.createCuboidShape(-4, 17, -6, 4, 19, 6),
		Block.createCuboidShape(-4, 19, -6, 4, 21, 6),
		Block.createCuboidShape(10, 13, -6, 12, 21, 6),
		Block.createCuboidShape(12, 13, -6, 14, 21, 6),
		Block.createCuboidShape(14, 13, -6, 16, 21, 6),
		Block.createCuboidShape(16, 13, -6, 18, 21, 6),
		Block.createCuboidShape(22, 14, -6, 24, 22, 6),
		Block.createCuboidShape(24, 14, -6, 26, 22, 6),
		Block.createCuboidShape(26, 14, -6, 27, 22, 6),
		Block.createCuboidShape(-15, -14, -15, 31, -11, -14),
		Block.createCuboidShape(-13, -11, -15, 7, -1, -14),
		Block.createCuboidShape(-13, 24, -9, 11, 26, -7),
		Block.createCuboidShape(-13, 1, -9, 11, 3, -7),
		Block.createCuboidShape(5, 1, 7, 29, 3, 9),
		Block.createCuboidShape(5, 24, 7, 29, 26, 9),
		Block.createCuboidShape(-16, -14, -15, -13, 0, -14),
		Block.createCuboidShape(29, -14, 14, 32, -1, 15),
		Block.createCuboidShape(-15, 26, -9, 31, 27, 9),
		Block.createCuboidShape(-16, 0, -9, -15, 27, 9),
		Block.createCuboidShape(31, 0, -9, 32, 27, 9),
		Block.createCuboidShape(-15, 0, -9, 31, 1, 9),
		Block.createCuboidShape(-16, -14, -14, 32, 0, 14),
		Block.createCuboidShape(-15, 12, -7, 31, 13, 7),
		Block.createCuboidShape(-15, 1, -9, -13, 26, -8),
		Block.createCuboidShape(7, 1, -9, 9, 26, -8),
		Block.createCuboidShape(7, 1, 8, 9, 26, 9),
		Block.createCuboidShape(29, 1, 8, 31, 26, 9),
		Block.createCuboidShape(-15, -1, -15, 32, 0, -14),
		Block.createCuboidShape(31, -14, -15, 32, -1, -14),
		Block.createCuboidShape(7, -14, -15, 9, -1, -14),
		Block.createCuboidShape(-15, -1, 14, 32, 0, 15),
		Block.createCuboidShape(-15, -14, 14, 31, -13, 15),
		Block.createCuboidShape(7, -13, 14, 9, -1, 15),
		Block.createCuboidShape(-16, -14, 14, -15, 0, 15),
		Block.createCuboidShape(11, 1, -8, 13, 26, -7),
		Block.createCuboidShape(-11, 1, -8, -9, 26, -7),
		Block.createCuboidShape(3, 1, 7, 5, 26, 7),
		Block.createCuboidShape(25, 1, 7, 27, 26, 7)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(10, 1, -12, 22, 9, -8),
		Block.createCuboidShape(1, -13, 9, 2, -1, 29),
		Block.createCuboidShape(10, 1, 11, 22, 3, 28),
		Block.createCuboidShape(10, 13, -13, 22, 16, 4),
		Block.createCuboidShape(10, 1, -5, 22, 10, -3),
		Block.createCuboidShape(10, 14, 19, 22, 22, 22),
		Block.createCuboidShape(10, 3, 11, 22, 5, 28),
		Block.createCuboidShape(10, 16, -13, 22, 17, 4),
		Block.createCuboidShape(10, 5, 20, 22, 7, 28),
		Block.createCuboidShape(10, 7, 20, 22, 9, 28),
		Block.createCuboidShape(10, 1, -8, 22, 9, -6),
		Block.createCuboidShape(10, 1, -14, 22, 9, -12),
		Block.createCuboidShape(10, 1, -3, 22, 10, -1),
		Block.createCuboidShape(10, 1, -1, 22, 10, 1),
		Block.createCuboidShape(10, 1, 1, 22, 10, 3),
		Block.createCuboidShape(10, 17, -4, 22, 19, 4),
		Block.createCuboidShape(10, 19, -4, 22, 21, 4),
		Block.createCuboidShape(10, 13, 10, 22, 21, 12),
		Block.createCuboidShape(10, 13, 12, 22, 21, 14),
		Block.createCuboidShape(10, 13, 14, 22, 21, 16),
		Block.createCuboidShape(10, 13, 16, 22, 21, 18),
		Block.createCuboidShape(10, 14, 22, 22, 22, 24),
		Block.createCuboidShape(10, 14, 24, 22, 22, 26),
		Block.createCuboidShape(10, 14, 26, 22, 22, 27),
		Block.createCuboidShape(30, -14, -15, 31, -11, 31),
		Block.createCuboidShape(30, -11, -13, 31, -1, 7),
		Block.createCuboidShape(23, 24, -13, 25, 26, 11),
		Block.createCuboidShape(23, 1, -13, 25, 3, 11),
		Block.createCuboidShape(7, 1, 5, 9, 3, 29),
		Block.createCuboidShape(7, 24, 5, 9, 26, 29),
		Block.createCuboidShape(30, -14, -16, 31, 0, -13),
		Block.createCuboidShape(1, -14, 29, 2, -1, 32),
		Block.createCuboidShape(7, 26, -15, 25, 27, 31),
		Block.createCuboidShape(7, 0, -16, 25, 27, -15),
		Block.createCuboidShape(7, 0, 31, 25, 27, 32),
		Block.createCuboidShape(7, 0, -15, 25, 1, 31),
		Block.createCuboidShape(2, -14, -16, 30, 0, 32),
		Block.createCuboidShape(9, 12, -15, 23, 13, 31),
		Block.createCuboidShape(24, 1, -15, 25, 26, -13),
		Block.createCuboidShape(24, 1, 7, 25, 26, 9),
		Block.createCuboidShape(7, 1, 7, 8, 26, 9),
		Block.createCuboidShape(7, 1, 29, 8, 26, 31),
		Block.createCuboidShape(30, -1, -15, 31, 0, 32),
		Block.createCuboidShape(30, -14, 31, 31, -1, 32),
		Block.createCuboidShape(30, -14, 7, 31, -1, 9),
		Block.createCuboidShape(1, -1, -15, 2, 0, 32),
		Block.createCuboidShape(1, -14, -15, 2, -13, 31),
		Block.createCuboidShape(1, -13, 7, 2, -1, 9),
		Block.createCuboidShape(1, -14, -16, 2, 0, -15),
		Block.createCuboidShape(23, 1, 11, 24, 26, 13),
		Block.createCuboidShape(23, 1, -11, 24, 26, -9),
		Block.createCuboidShape(9, 1, 3, 9, 26, 5),
		Block.createCuboidShape(9, 1, 25, 9, 26, 27)
    );

    public Fcart1_Data() {
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

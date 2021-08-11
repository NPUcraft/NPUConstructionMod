package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcontainer2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -13, 7, 12, -9, 14),
		Block.createCuboidShape(8, 5, 6, 18, 9, 13),
		Block.createCuboidShape(-3, -4, 9, 5, 1, 13),
		Block.createCuboidShape(-7, -13, 8, 1, -9, 14),
		Block.createCuboidShape(19, 14, 6, 28, 19, 14),
		Block.createCuboidShape(15, 23, 7, 25, 27, 14),
		Block.createCuboidShape(-1, 5, 7, 4, 11, 14),
		Block.createCuboidShape(4, 14, 7, 11, 20, 12),
		Block.createCuboidShape(-9, 5, 7, -4, 11, 14),
		Block.createCuboidShape(-9, 14, 6, 1, 16, 12),
		Block.createCuboidShape(-16, 3, 4, 32, 5, 5),
		Block.createCuboidShape(-16, -6, 4, 32, -4, 5),
		Block.createCuboidShape(-16, 13, 4, 32, 15, 5),
		Block.createCuboidShape(-16, 22, 4, 32, 24, 5),
		Block.createCuboidShape(20, 5, 8, 27, 9, 13),
		Block.createCuboidShape(-4, 23, 8, 14, 29, 12),
		Block.createCuboidShape(8, -4, 8, 14, 0, 12),
		Block.createCuboidShape(-16, -16, 15, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 5, 32, -13, 15),
		Block.createCuboidShape(-16, -5, 5, 32, -4, 15),
		Block.createCuboidShape(-16, 4, 5, 32, 5, 15),
		Block.createCuboidShape(-16, 13, 5, 32, 14, 15),
		Block.createCuboidShape(-16, 22, 5, 32, 23, 15),
		Block.createCuboidShape(-16, 31, 5, 32, 32, 15),
		Block.createCuboidShape(-16, 21, 12, 32, 22, 15),
		Block.createCuboidShape(-16, 30, 12, 32, 31, 15),
		Block.createCuboidShape(-16, 12, 12, 32, 13, 15),
		Block.createCuboidShape(-16, 3, 12, 32, 4, 15),
		Block.createCuboidShape(-16, -6, 12, 32, -5, 15),
		Block.createCuboidShape(15, -13, 8, 24, -7, 12),
		Block.createCuboidShape(18, -4, 8, 27, 2, 12),
		Block.createCuboidShape(-6, 16, 6, -2, 18, 12),
		Block.createCuboidShape(28, 23, 9, 30, 28, 13),
		Block.createCuboidShape(14, 14, 6, 18, 19, 14),
		Block.createCuboidShape(-15, 23, 10, -7, 28, 14),
		Block.createCuboidShape(-13, 23, 6, -5, 28, 10),
		Block.createCuboidShape(-15, -4, 11, -5, 1, 14),
		Block.createCuboidShape(-14, -4, 7, -4, 1, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, -13, 3, 9, -9, 12),
		Block.createCuboidShape(3, 5, 8, 10, 9, 18),
		Block.createCuboidShape(3, -4, -3, 7, 1, 5),
		Block.createCuboidShape(2, -13, -7, 8, -9, 1),
		Block.createCuboidShape(2, 14, 19, 10, 19, 28),
		Block.createCuboidShape(2, 23, 15, 9, 27, 25),
		Block.createCuboidShape(2, 5, -1, 9, 11, 4),
		Block.createCuboidShape(4, 14, 4, 9, 20, 11),
		Block.createCuboidShape(2, 5, -9, 9, 11, -4),
		Block.createCuboidShape(4, 14, -9, 10, 16, 1),
		Block.createCuboidShape(11, 3, -16, 12, 5, 32),
		Block.createCuboidShape(11, -6, -16, 12, -4, 32),
		Block.createCuboidShape(11, 13, -16, 12, 15, 32),
		Block.createCuboidShape(11, 22, -16, 12, 24, 32),
		Block.createCuboidShape(3, 5, 20, 8, 9, 27),
		Block.createCuboidShape(4, 23, -4, 8, 29, 14),
		Block.createCuboidShape(4, -4, 8, 8, 0, 14),
		Block.createCuboidShape(0, -16, -16, 1, 32, 32),
		Block.createCuboidShape(1, -16, -16, 11, -13, 32),
		Block.createCuboidShape(1, -5, -16, 11, -4, 32),
		Block.createCuboidShape(1, 4, -16, 11, 5, 32),
		Block.createCuboidShape(1, 13, -16, 11, 14, 32),
		Block.createCuboidShape(1, 22, -16, 11, 23, 32),
		Block.createCuboidShape(1, 31, -16, 11, 32, 32),
		Block.createCuboidShape(1, 21, -16, 4, 22, 32),
		Block.createCuboidShape(1, 30, -16, 4, 31, 32),
		Block.createCuboidShape(1, 12, -16, 4, 13, 32),
		Block.createCuboidShape(1, 3, -16, 4, 4, 32),
		Block.createCuboidShape(1, -6, -16, 4, -5, 32),
		Block.createCuboidShape(4, -13, 15, 8, -7, 24),
		Block.createCuboidShape(4, -4, 18, 8, 2, 27),
		Block.createCuboidShape(4, 16, -6, 10, 18, -2),
		Block.createCuboidShape(3, 23, 28, 7, 28, 30),
		Block.createCuboidShape(2, 14, 14, 10, 19, 18),
		Block.createCuboidShape(2, 23, -15, 6, 28, -7),
		Block.createCuboidShape(6, 23, -13, 10, 28, -5),
		Block.createCuboidShape(2, -4, -15, 5, 1, -5),
		Block.createCuboidShape(6, -4, -14, 9, 1, -4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, -13, 2, 13, -9, 9),
		Block.createCuboidShape(-2, 5, 3, 8, 9, 10),
		Block.createCuboidShape(11, -4, 3, 19, 1, 7),
		Block.createCuboidShape(15, -13, 2, 23, -9, 8),
		Block.createCuboidShape(-12, 14, 2, -3, 19, 10),
		Block.createCuboidShape(-9, 23, 2, 1, 27, 9),
		Block.createCuboidShape(12, 5, 2, 17, 11, 9),
		Block.createCuboidShape(5, 14, 4, 12, 20, 9),
		Block.createCuboidShape(20, 5, 2, 25, 11, 9),
		Block.createCuboidShape(15, 14, 4, 25, 16, 10),
		Block.createCuboidShape(-16, 3, 11, 32, 5, 12),
		Block.createCuboidShape(-16, -6, 11, 32, -4, 12),
		Block.createCuboidShape(-16, 13, 11, 32, 15, 12),
		Block.createCuboidShape(-16, 22, 11, 32, 24, 12),
		Block.createCuboidShape(-11, 5, 3, -4, 9, 8),
		Block.createCuboidShape(2, 23, 4, 20, 29, 8),
		Block.createCuboidShape(2, -4, 4, 8, 0, 8),
		Block.createCuboidShape(-16, -16, 0, 32, 32, 1),
		Block.createCuboidShape(-16, -16, 1, 32, -13, 11),
		Block.createCuboidShape(-16, -5, 1, 32, -4, 11),
		Block.createCuboidShape(-16, 4, 1, 32, 5, 11),
		Block.createCuboidShape(-16, 13, 1, 32, 14, 11),
		Block.createCuboidShape(-16, 22, 1, 32, 23, 11),
		Block.createCuboidShape(-16, 31, 1, 32, 32, 11),
		Block.createCuboidShape(-16, 21, 1, 32, 22, 4),
		Block.createCuboidShape(-16, 30, 1, 32, 31, 4),
		Block.createCuboidShape(-16, 12, 1, 32, 13, 4),
		Block.createCuboidShape(-16, 3, 1, 32, 4, 4),
		Block.createCuboidShape(-16, -6, 1, 32, -5, 4),
		Block.createCuboidShape(-8, -13, 4, 1, -7, 8),
		Block.createCuboidShape(-11, -4, 4, -2, 2, 8),
		Block.createCuboidShape(18, 16, 4, 22, 18, 10),
		Block.createCuboidShape(-14, 23, 3, -12, 28, 7),
		Block.createCuboidShape(-2, 14, 2, 2, 19, 10),
		Block.createCuboidShape(23, 23, 2, 31, 28, 6),
		Block.createCuboidShape(21, 23, 6, 29, 28, 10),
		Block.createCuboidShape(21, -4, 2, 31, 1, 5),
		Block.createCuboidShape(20, -4, 6, 30, 1, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -13, 4, 14, -9, 13),
		Block.createCuboidShape(6, 5, -2, 13, 9, 8),
		Block.createCuboidShape(9, -4, 11, 13, 1, 19),
		Block.createCuboidShape(8, -13, 15, 14, -9, 23),
		Block.createCuboidShape(6, 14, -12, 14, 19, -3),
		Block.createCuboidShape(7, 23, -9, 14, 27, 1),
		Block.createCuboidShape(7, 5, 12, 14, 11, 17),
		Block.createCuboidShape(7, 14, 5, 12, 20, 12),
		Block.createCuboidShape(7, 5, 20, 14, 11, 25),
		Block.createCuboidShape(6, 14, 15, 12, 16, 25),
		Block.createCuboidShape(4, 3, -16, 5, 5, 32),
		Block.createCuboidShape(4, -6, -16, 5, -4, 32),
		Block.createCuboidShape(4, 13, -16, 5, 15, 32),
		Block.createCuboidShape(4, 22, -16, 5, 24, 32),
		Block.createCuboidShape(8, 5, -11, 13, 9, -4),
		Block.createCuboidShape(8, 23, 2, 12, 29, 20),
		Block.createCuboidShape(8, -4, 2, 12, 0, 8),
		Block.createCuboidShape(15, -16, -16, 16, 32, 32),
		Block.createCuboidShape(5, -16, -16, 15, -13, 32),
		Block.createCuboidShape(5, -5, -16, 15, -4, 32),
		Block.createCuboidShape(5, 4, -16, 15, 5, 32),
		Block.createCuboidShape(5, 13, -16, 15, 14, 32),
		Block.createCuboidShape(5, 22, -16, 15, 23, 32),
		Block.createCuboidShape(5, 31, -16, 15, 32, 32),
		Block.createCuboidShape(12, 21, -16, 15, 22, 32),
		Block.createCuboidShape(12, 30, -16, 15, 31, 32),
		Block.createCuboidShape(12, 12, -16, 15, 13, 32),
		Block.createCuboidShape(12, 3, -16, 15, 4, 32),
		Block.createCuboidShape(12, -6, -16, 15, -5, 32),
		Block.createCuboidShape(8, -13, -8, 12, -7, 1),
		Block.createCuboidShape(8, -4, -11, 12, 2, -2),
		Block.createCuboidShape(6, 16, 18, 12, 18, 22),
		Block.createCuboidShape(9, 23, -14, 13, 28, -12),
		Block.createCuboidShape(6, 14, -2, 14, 19, 2),
		Block.createCuboidShape(10, 23, 23, 14, 28, 31),
		Block.createCuboidShape(6, 23, 21, 10, 28, 29),
		Block.createCuboidShape(11, -4, 21, 14, 1, 31),
		Block.createCuboidShape(7, -4, 20, 10, 1, 30)
    );

    public Fcontainer2_Data() {
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

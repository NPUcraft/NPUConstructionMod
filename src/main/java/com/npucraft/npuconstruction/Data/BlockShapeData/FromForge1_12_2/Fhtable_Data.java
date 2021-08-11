package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fhtable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 19, 0, 7, 20, 7),
		Block.createCuboidShape(-11, 19, 9, -9, 31, 15),
		Block.createCuboidShape(-5, 19, 9, -3, 31, 15),
		Block.createCuboidShape(-1, 2, -16, 15, 4, 0),
		Block.createCuboidShape(7, 20, 1, 11, 21, 16),
		Block.createCuboidShape(3, 3, -15, 11, 17, -14),
		Block.createCuboidShape(3, 3, -2, 11, 17, -1),
		Block.createCuboidShape(13, 3, -12, 14, 17, -4),
		Block.createCuboidShape(0, 3, -12, 1, 17, -4),
		Block.createCuboidShape(-2, 2, 4, 7, 2, 12),
		Block.createCuboidShape(-10, 20, 7, 11, 21, 8),
		Block.createCuboidShape(-16, 17, -1, 16, 19, 1),
		Block.createCuboidShape(1, 20, 8, 5, 21, 16),
		Block.createCuboidShape(1, 3, -14, 3, 17, -12),
		Block.createCuboidShape(11, 3, -14, 13, 17, -12),
		Block.createCuboidShape(11, 3, -4, 13, 17, -2),
		Block.createCuboidShape(1, 3, -4, 3, 17, -2),
		Block.createCuboidShape(-2, 20, 1, -1, 21, 16),
		Block.createCuboidShape(-10, 30, 9, -4, 31, 16),
		Block.createCuboidShape(-16, 1, 0, 16, 2, 16),
		Block.createCuboidShape(-16, 18, 0, 16, 19, 16),
		Block.createCuboidShape(-9, 19, 8, -5, 31, 9),
		Block.createCuboidShape(5, 3, -16, 9, 18, -15),
		Block.createCuboidShape(5, 3, -1, 9, 18, 0),
		Block.createCuboidShape(-1, 3, -10, 0, 18, -6),
		Block.createCuboidShape(14, 3, -10, 15, 18, -6),
		Block.createCuboidShape(-16, 0, 15, -15, 18, 16),
		Block.createCuboidShape(15, 0, 15, 16, 18, 16),
		Block.createCuboidShape(15, 0, 0, 16, 18, 1),
		Block.createCuboidShape(-16, 0, 0, -15, 18, 1),
		Block.createCuboidShape(-15, 17, 15, 15, 18, 16),
		Block.createCuboidShape(15, 17, 1, 16, 18, 15),
		Block.createCuboidShape(-16, 17, 1, -15, 18, 15),
		Block.createCuboidShape(-9, 19, 15, -5, 30, 16),
		Block.createCuboidShape(-1, 20, 16, 11, 27, 16),
		Block.createCuboidShape(12, 3, -8, 12, 22, -7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 19, -11, 16, 20, 7),
		Block.createCuboidShape(1, 19, -11, 7, 31, -9),
		Block.createCuboidShape(1, 19, -5, 7, 31, -3),
		Block.createCuboidShape(16, 2, -1, 32, 4, 15),
		Block.createCuboidShape(0, 20, 7, 15, 21, 11),
		Block.createCuboidShape(30, 3, 3, 31, 17, 11),
		Block.createCuboidShape(17, 3, 3, 18, 17, 11),
		Block.createCuboidShape(20, 3, 13, 28, 17, 14),
		Block.createCuboidShape(20, 3, 0, 28, 17, 1),
		Block.createCuboidShape(4, 2, -2, 12, 2, 7),
		Block.createCuboidShape(8, 20, -10, 9, 21, 11),
		Block.createCuboidShape(15, 17, -16, 17, 19, 16),
		Block.createCuboidShape(0, 20, 1, 8, 21, 5),
		Block.createCuboidShape(28, 3, 1, 30, 17, 3),
		Block.createCuboidShape(28, 3, 11, 30, 17, 13),
		Block.createCuboidShape(18, 3, 11, 20, 17, 13),
		Block.createCuboidShape(18, 3, 1, 20, 17, 3),
		Block.createCuboidShape(0, 20, -2, 15, 21, -1),
		Block.createCuboidShape(0, 30, -10, 7, 31, -4),
		Block.createCuboidShape(0, 1, -16, 16, 2, 16),
		Block.createCuboidShape(0, 18, -16, 16, 19, 16),
		Block.createCuboidShape(7, 19, -9, 8, 31, -5),
		Block.createCuboidShape(31, 3, 5, 32, 18, 9),
		Block.createCuboidShape(16, 3, 5, 17, 18, 9),
		Block.createCuboidShape(22, 3, -1, 26, 18, 0),
		Block.createCuboidShape(22, 3, 14, 26, 18, 15),
		Block.createCuboidShape(0, 0, -16, 1, 18, -15),
		Block.createCuboidShape(0, 0, 15, 1, 18, 16),
		Block.createCuboidShape(15, 0, 15, 16, 18, 16),
		Block.createCuboidShape(15, 0, -16, 16, 18, -15),
		Block.createCuboidShape(0, 17, -15, 1, 18, 15),
		Block.createCuboidShape(1, 17, 15, 15, 18, 16),
		Block.createCuboidShape(1, 17, -16, 15, 18, -15),
		Block.createCuboidShape(0, 19, -9, 1, 30, -5),
		Block.createCuboidShape(0, 20, -1, 0, 27, 11),
		Block.createCuboidShape(23, 3, 12, 24, 22, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(9, 19, 9, 27, 20, 16),
		Block.createCuboidShape(25, 19, 1, 27, 31, 7),
		Block.createCuboidShape(19, 19, 1, 21, 31, 7),
		Block.createCuboidShape(1, 2, 16, 17, 4, 32),
		Block.createCuboidShape(5, 20, 0, 9, 21, 15),
		Block.createCuboidShape(5, 3, 30, 13, 17, 31),
		Block.createCuboidShape(5, 3, 17, 13, 17, 18),
		Block.createCuboidShape(2, 3, 20, 3, 17, 28),
		Block.createCuboidShape(15, 3, 20, 16, 17, 28),
		Block.createCuboidShape(9, 2, 4, 18, 2, 12),
		Block.createCuboidShape(5, 20, 8, 26, 21, 9),
		Block.createCuboidShape(0, 17, 15, 32, 19, 17),
		Block.createCuboidShape(11, 20, 0, 15, 21, 8),
		Block.createCuboidShape(13, 3, 28, 15, 17, 30),
		Block.createCuboidShape(3, 3, 28, 5, 17, 30),
		Block.createCuboidShape(3, 3, 18, 5, 17, 20),
		Block.createCuboidShape(13, 3, 18, 15, 17, 20),
		Block.createCuboidShape(17, 20, 0, 18, 21, 15),
		Block.createCuboidShape(20, 30, 0, 26, 31, 7),
		Block.createCuboidShape(0, 1, 0, 32, 2, 16),
		Block.createCuboidShape(0, 18, 0, 32, 19, 16),
		Block.createCuboidShape(21, 19, 7, 25, 31, 8),
		Block.createCuboidShape(7, 3, 31, 11, 18, 32),
		Block.createCuboidShape(7, 3, 16, 11, 18, 17),
		Block.createCuboidShape(16, 3, 22, 17, 18, 26),
		Block.createCuboidShape(1, 3, 22, 2, 18, 26),
		Block.createCuboidShape(31, 0, 0, 32, 18, 1),
		Block.createCuboidShape(0, 0, 0, 1, 18, 1),
		Block.createCuboidShape(0, 0, 15, 1, 18, 16),
		Block.createCuboidShape(31, 0, 15, 32, 18, 16),
		Block.createCuboidShape(1, 17, 0, 31, 18, 1),
		Block.createCuboidShape(0, 17, 1, 1, 18, 15),
		Block.createCuboidShape(31, 17, 1, 32, 18, 15),
		Block.createCuboidShape(21, 19, 0, 25, 30, 1),
		Block.createCuboidShape(5, 20, 0, 17, 27, 0),
		Block.createCuboidShape(4, 3, 23, 4, 22, 24)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 19, 9, 7, 20, 27),
		Block.createCuboidShape(9, 19, 25, 15, 31, 27),
		Block.createCuboidShape(9, 19, 19, 15, 31, 21),
		Block.createCuboidShape(-16, 2, 1, 0, 4, 17),
		Block.createCuboidShape(1, 20, 5, 16, 21, 9),
		Block.createCuboidShape(-15, 3, 5, -14, 17, 13),
		Block.createCuboidShape(-2, 3, 5, -1, 17, 13),
		Block.createCuboidShape(-12, 3, 2, -4, 17, 3),
		Block.createCuboidShape(-12, 3, 15, -4, 17, 16),
		Block.createCuboidShape(4, 2, 9, 12, 2, 18),
		Block.createCuboidShape(7, 20, 5, 8, 21, 26),
		Block.createCuboidShape(-1, 17, 0, 1, 19, 32),
		Block.createCuboidShape(8, 20, 11, 16, 21, 15),
		Block.createCuboidShape(-14, 3, 13, -12, 17, 15),
		Block.createCuboidShape(-14, 3, 3, -12, 17, 5),
		Block.createCuboidShape(-4, 3, 3, -2, 17, 5),
		Block.createCuboidShape(-4, 3, 13, -2, 17, 15),
		Block.createCuboidShape(1, 20, 17, 16, 21, 18),
		Block.createCuboidShape(9, 30, 20, 16, 31, 26),
		Block.createCuboidShape(0, 1, 0, 16, 2, 32),
		Block.createCuboidShape(0, 18, 0, 16, 19, 32),
		Block.createCuboidShape(8, 19, 21, 9, 31, 25),
		Block.createCuboidShape(-16, 3, 7, -15, 18, 11),
		Block.createCuboidShape(-1, 3, 7, 0, 18, 11),
		Block.createCuboidShape(-10, 3, 16, -6, 18, 17),
		Block.createCuboidShape(-10, 3, 1, -6, 18, 2),
		Block.createCuboidShape(15, 0, 31, 16, 18, 32),
		Block.createCuboidShape(15, 0, 0, 16, 18, 1),
		Block.createCuboidShape(0, 0, 0, 1, 18, 1),
		Block.createCuboidShape(0, 0, 31, 1, 18, 32),
		Block.createCuboidShape(15, 17, 1, 16, 18, 31),
		Block.createCuboidShape(1, 17, 0, 15, 18, 1),
		Block.createCuboidShape(1, 17, 31, 15, 18, 32),
		Block.createCuboidShape(15, 19, 21, 16, 30, 25),
		Block.createCuboidShape(16, 20, 5, 16, 27, 17),
		Block.createCuboidShape(-8, 3, 4, -7, 22, 4)
    );

    public Fhtable_Data() {
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

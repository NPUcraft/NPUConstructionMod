package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyftr_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -1, -15, 8, 3, -5),
		Block.createCuboidShape(-8, -15, 14, 8, -14, 31),
		Block.createCuboidShape(-16, 9, 8, -13, 19, 15),
		Block.createCuboidShape(3, 18, 9, 5, 28, 31),
		Block.createCuboidShape(-8, -16, -15, 15, -14, 0),
		Block.createCuboidShape(-15, 6, -15, -14, 9, 26),
		Block.createCuboidShape(-8, -15, 0, 8, -14, 14),
		Block.createCuboidShape(-16, -16, -16, -15, 32, 32),
		Block.createCuboidShape(-5, -16, 0, 5, -15, 31),
		Block.createCuboidShape(-15, -16, -16, 15, 32, -15),
		Block.createCuboidShape(-15, -16, 31, 15, 32, 32),
		Block.createCuboidShape(15, -16, -16, 16, 32, -8),
		Block.createCuboidShape(5, -16, -15, 15, -15, 31),
		Block.createCuboidShape(-15, -16, -15, -5, -15, 31),
		Block.createCuboidShape(-15, -15, -15, -8, -14, 31),
		Block.createCuboidShape(15, 0, 8, 16, 32, 16),
		Block.createCuboidShape(15, 16, 8, 16, 32, 32),
		Block.createCuboidShape(15, -16, 8, 16, 0, 32),
		Block.createCuboidShape(8, -15, 0, 15, -14, 31),
		Block.createCuboidShape(15, 0, 16, 16, 16, 32),
		Block.createCuboidShape(4, 17, 9, 15, 18, 31),
		Block.createCuboidShape(4, 28, 9, 15, 29, 31),
		Block.createCuboidShape(5, 18, 9, 15, 28, 10),
		Block.createCuboidShape(-1, -14, 28, 1, 7, 30),
		Block.createCuboidShape(-15, 6, 26, 1, 7, 27),
		Block.createCuboidShape(-15, -9, -15, -14, 6, -14),
		Block.createCuboidShape(-14, -9, -15, 0, -8, -14),
		Block.createCuboidShape(-1, -8, -15, 0, 0, -14),
		Block.createCuboidShape(-15, -14, 28, -12, 32, 31),
		Block.createCuboidShape(-10, -14, 29, -8, 32, 31),
		Block.createCuboidShape(-6, -14, 28, -3, 32, 31),
		Block.createCuboidShape(-14, 8, 25, -9, 9, 26),
		Block.createCuboidShape(-8, 25, -5, -4, 26, -1),
		Block.createCuboidShape(-15, 26, -3, -5, 27, -2),
		Block.createCuboidShape(-15, 8, -3, -14, 26, -2),
		Block.createCuboidShape(-16, 9, 7, -13, 19, 8),
		Block.createCuboidShape(-15, 10, 16, -14, 11, 26),
		Block.createCuboidShape(-15, 18, 17, -14, 32, 18),
		Block.createCuboidShape(-16, 9, 15, -13, 19, 16),
		Block.createCuboidShape(-15, 10, 0, -14, 14, 5),
		Block.createCuboidShape(-2, -14, -12, 2, -1, -8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(21, -1, -8, 31, 3, 8),
		Block.createCuboidShape(-15, -15, -8, 2, -14, 8),
		Block.createCuboidShape(1, 9, -16, 8, 19, -13),
		Block.createCuboidShape(-15, 18, 3, 7, 28, 5),
		Block.createCuboidShape(16, -16, -8, 31, -14, 15),
		Block.createCuboidShape(-10, 6, -15, 31, 9, -14),
		Block.createCuboidShape(2, -15, -8, 16, -14, 8),
		Block.createCuboidShape(-16, -16, -16, 32, 32, -15),
		Block.createCuboidShape(-15, -16, -5, 16, -15, 5),
		Block.createCuboidShape(31, -16, -15, 32, 32, 15),
		Block.createCuboidShape(-16, -16, -15, -15, 32, 15),
		Block.createCuboidShape(24, -16, 15, 32, 32, 16),
		Block.createCuboidShape(-15, -16, 5, 31, -15, 15),
		Block.createCuboidShape(-15, -16, -15, 31, -15, -5),
		Block.createCuboidShape(-15, -15, -15, 31, -14, -8),
		Block.createCuboidShape(0, 0, 15, 8, 32, 16),
		Block.createCuboidShape(-16, 16, 15, 8, 32, 16),
		Block.createCuboidShape(-16, -16, 15, 8, 0, 16),
		Block.createCuboidShape(-15, -15, 8, 16, -14, 15),
		Block.createCuboidShape(-16, 0, 15, 0, 16, 16),
		Block.createCuboidShape(-15, 17, 4, 7, 18, 15),
		Block.createCuboidShape(-15, 28, 4, 7, 29, 15),
		Block.createCuboidShape(6, 18, 5, 7, 28, 15),
		Block.createCuboidShape(-14, -14, -1, -12, 7, 1),
		Block.createCuboidShape(-11, 6, -15, -10, 7, 1),
		Block.createCuboidShape(30, -9, -15, 31, 6, -14),
		Block.createCuboidShape(30, -9, -14, 31, -8, 0),
		Block.createCuboidShape(30, -8, -1, 31, 0, 0),
		Block.createCuboidShape(-15, -14, -15, -12, 32, -12),
		Block.createCuboidShape(-15, -14, -10, -13, 32, -8),
		Block.createCuboidShape(-15, -14, -6, -12, 32, -3),
		Block.createCuboidShape(-10, 8, -14, -9, 9, -9),
		Block.createCuboidShape(17, 25, -8, 21, 26, -4),
		Block.createCuboidShape(18, 26, -15, 19, 27, -5),
		Block.createCuboidShape(18, 8, -15, 19, 26, -14),
		Block.createCuboidShape(8, 9, -16, 9, 19, -13),
		Block.createCuboidShape(-10, 10, -15, 0, 11, -14),
		Block.createCuboidShape(-2, 18, -15, -1, 32, -14),
		Block.createCuboidShape(0, 9, -16, 1, 19, -13),
		Block.createCuboidShape(11, 10, -15, 16, 14, -14),
		Block.createCuboidShape(24, -14, -2, 28, -1, 2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, -1, 21, 24, 3, 31),
		Block.createCuboidShape(8, -15, -15, 24, -14, 2),
		Block.createCuboidShape(29, 9, 1, 32, 19, 8),
		Block.createCuboidShape(11, 18, -15, 13, 28, 7),
		Block.createCuboidShape(1, -16, 16, 24, -14, 31),
		Block.createCuboidShape(30, 6, -10, 31, 9, 31),
		Block.createCuboidShape(8, -15, 2, 24, -14, 16),
		Block.createCuboidShape(31, -16, -16, 32, 32, 32),
		Block.createCuboidShape(11, -16, -15, 21, -15, 16),
		Block.createCuboidShape(1, -16, 31, 31, 32, 32),
		Block.createCuboidShape(1, -16, -16, 31, 32, -15),
		Block.createCuboidShape(0, -16, 24, 1, 32, 32),
		Block.createCuboidShape(1, -16, -15, 11, -15, 31),
		Block.createCuboidShape(21, -16, -15, 31, -15, 31),
		Block.createCuboidShape(24, -15, -15, 31, -14, 31),
		Block.createCuboidShape(0, 0, 0, 1, 32, 8),
		Block.createCuboidShape(0, 16, -16, 1, 32, 8),
		Block.createCuboidShape(0, -16, -16, 1, 0, 8),
		Block.createCuboidShape(1, -15, -15, 8, -14, 16),
		Block.createCuboidShape(0, 0, -16, 1, 16, 0),
		Block.createCuboidShape(1, 17, -15, 12, 18, 7),
		Block.createCuboidShape(1, 28, -15, 12, 29, 7),
		Block.createCuboidShape(1, 18, 6, 11, 28, 7),
		Block.createCuboidShape(15, -14, -14, 17, 7, -12),
		Block.createCuboidShape(15, 6, -11, 31, 7, -10),
		Block.createCuboidShape(30, -9, 30, 31, 6, 31),
		Block.createCuboidShape(16, -9, 30, 30, -8, 31),
		Block.createCuboidShape(16, -8, 30, 17, 0, 31),
		Block.createCuboidShape(28, -14, -15, 31, 32, -12),
		Block.createCuboidShape(24, -14, -15, 26, 32, -13),
		Block.createCuboidShape(19, -14, -15, 22, 32, -12),
		Block.createCuboidShape(25, 8, -10, 30, 9, -9),
		Block.createCuboidShape(20, 25, 17, 24, 26, 21),
		Block.createCuboidShape(21, 26, 18, 31, 27, 19),
		Block.createCuboidShape(30, 8, 18, 31, 26, 19),
		Block.createCuboidShape(29, 9, 8, 32, 19, 9),
		Block.createCuboidShape(30, 10, -10, 31, 11, 0),
		Block.createCuboidShape(30, 18, -2, 31, 32, -1),
		Block.createCuboidShape(29, 9, 0, 32, 19, 1),
		Block.createCuboidShape(30, 10, 11, 31, 14, 16),
		Block.createCuboidShape(14, -14, 24, 18, -1, 28)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-15, -1, 8, -5, 3, 24),
		Block.createCuboidShape(14, -15, 8, 31, -14, 24),
		Block.createCuboidShape(8, 9, 29, 15, 19, 32),
		Block.createCuboidShape(9, 18, 11, 31, 28, 13),
		Block.createCuboidShape(-15, -16, 1, 0, -14, 24),
		Block.createCuboidShape(-15, 6, 30, 26, 9, 31),
		Block.createCuboidShape(0, -15, 8, 14, -14, 24),
		Block.createCuboidShape(-16, -16, 31, 32, 32, 32),
		Block.createCuboidShape(0, -16, 11, 31, -15, 21),
		Block.createCuboidShape(-16, -16, 1, -15, 32, 31),
		Block.createCuboidShape(31, -16, 1, 32, 32, 31),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 1),
		Block.createCuboidShape(-15, -16, 1, 31, -15, 11),
		Block.createCuboidShape(-15, -16, 21, 31, -15, 31),
		Block.createCuboidShape(-15, -15, 24, 31, -14, 31),
		Block.createCuboidShape(8, 0, 0, 16, 32, 1),
		Block.createCuboidShape(8, 16, 0, 32, 32, 1),
		Block.createCuboidShape(8, -16, 0, 32, 0, 1),
		Block.createCuboidShape(0, -15, 1, 31, -14, 8),
		Block.createCuboidShape(16, 0, 0, 32, 16, 1),
		Block.createCuboidShape(9, 17, 1, 31, 18, 12),
		Block.createCuboidShape(9, 28, 1, 31, 29, 12),
		Block.createCuboidShape(9, 18, 1, 10, 28, 11),
		Block.createCuboidShape(28, -14, 15, 30, 7, 17),
		Block.createCuboidShape(26, 6, 15, 27, 7, 31),
		Block.createCuboidShape(-15, -9, 30, -14, 6, 31),
		Block.createCuboidShape(-15, -9, 16, -14, -8, 30),
		Block.createCuboidShape(-15, -8, 16, -14, 0, 17),
		Block.createCuboidShape(28, -14, 28, 31, 32, 31),
		Block.createCuboidShape(29, -14, 24, 31, 32, 26),
		Block.createCuboidShape(28, -14, 19, 31, 32, 22),
		Block.createCuboidShape(25, 8, 25, 26, 9, 30),
		Block.createCuboidShape(-5, 25, 20, -1, 26, 24),
		Block.createCuboidShape(-3, 26, 21, -2, 27, 31),
		Block.createCuboidShape(-3, 8, 30, -2, 26, 31),
		Block.createCuboidShape(7, 9, 29, 8, 19, 32),
		Block.createCuboidShape(16, 10, 30, 26, 11, 31),
		Block.createCuboidShape(17, 18, 30, 18, 32, 31),
		Block.createCuboidShape(15, 9, 29, 16, 19, 32),
		Block.createCuboidShape(0, 10, 30, 5, 14, 31),
		Block.createCuboidShape(-12, -14, 14, -8, -1, 18)
    );

    public Fyftr_Data() {
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

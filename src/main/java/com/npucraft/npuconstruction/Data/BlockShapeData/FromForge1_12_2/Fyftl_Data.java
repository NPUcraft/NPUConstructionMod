package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyftl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(8, -1, -15, 24, 3, -5),
		Block.createCuboidShape(8, -15, 14, 24, -14, 31),
		Block.createCuboidShape(29, 9, 8, 32, 19, 15),
		Block.createCuboidShape(11, 18, 9, 13, 28, 31),
		Block.createCuboidShape(1, -16, -15, 24, -14, 0),
		Block.createCuboidShape(30, 6, -15, 31, 9, 26),
		Block.createCuboidShape(8, -15, 0, 24, -14, 14),
		Block.createCuboidShape(31, -16, -16, 32, 32, 32),
		Block.createCuboidShape(11, -16, 0, 21, -15, 31),
		Block.createCuboidShape(1, -16, -16, 31, 32, -15),
		Block.createCuboidShape(1, -16, 31, 31, 32, 32),
		Block.createCuboidShape(0, -16, -16, 1, 32, -8),
		Block.createCuboidShape(1, -16, -15, 11, -15, 31),
		Block.createCuboidShape(21, -16, -15, 31, -15, 31),
		Block.createCuboidShape(24, -15, -15, 31, -14, 31),
		Block.createCuboidShape(0, 0, 8, 1, 32, 16),
		Block.createCuboidShape(0, 16, 8, 1, 32, 32),
		Block.createCuboidShape(0, -16, 8, 1, 0, 32),
		Block.createCuboidShape(1, -15, 0, 8, -14, 31),
		Block.createCuboidShape(0, 0, 16, 1, 16, 32),
		Block.createCuboidShape(1, 17, 9, 12, 18, 31),
		Block.createCuboidShape(1, 28, 9, 12, 29, 31),
		Block.createCuboidShape(1, 18, 9, 11, 28, 10),
		Block.createCuboidShape(15, -14, 28, 17, 7, 30),
		Block.createCuboidShape(15, 6, 26, 31, 7, 27),
		Block.createCuboidShape(30, -9, -15, 31, 6, -14),
		Block.createCuboidShape(16, -9, -15, 30, -8, -14),
		Block.createCuboidShape(16, -8, -15, 17, 0, -14),
		Block.createCuboidShape(28, -14, 28, 31, 32, 31),
		Block.createCuboidShape(24, -14, 29, 26, 32, 31),
		Block.createCuboidShape(19, -14, 28, 22, 32, 31),
		Block.createCuboidShape(25, 8, 25, 30, 9, 26),
		Block.createCuboidShape(20, 25, -5, 24, 26, -1),
		Block.createCuboidShape(21, 26, -3, 31, 27, -2),
		Block.createCuboidShape(30, 8, -3, 31, 26, -2),
		Block.createCuboidShape(29, 9, 7, 32, 19, 8),
		Block.createCuboidShape(30, 10, 16, 31, 11, 26),
		Block.createCuboidShape(30, 18, 17, 31, 32, 18),
		Block.createCuboidShape(29, 9, 15, 32, 19, 16),
		Block.createCuboidShape(30, 10, 0, 31, 14, 5),
		Block.createCuboidShape(14, -14, -12, 18, -1, -8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(21, -1, 8, 31, 3, 24),
		Block.createCuboidShape(-15, -15, 8, 2, -14, 24),
		Block.createCuboidShape(1, 9, 29, 8, 19, 32),
		Block.createCuboidShape(-15, 18, 11, 7, 28, 13),
		Block.createCuboidShape(16, -16, 1, 31, -14, 24),
		Block.createCuboidShape(-10, 6, 30, 31, 9, 31),
		Block.createCuboidShape(2, -15, 8, 16, -14, 24),
		Block.createCuboidShape(-16, -16, 31, 32, 32, 32),
		Block.createCuboidShape(-15, -16, 11, 16, -15, 21),
		Block.createCuboidShape(31, -16, 1, 32, 32, 31),
		Block.createCuboidShape(-16, -16, 1, -15, 32, 31),
		Block.createCuboidShape(24, -16, 0, 32, 32, 1),
		Block.createCuboidShape(-15, -16, 1, 31, -15, 11),
		Block.createCuboidShape(-15, -16, 21, 31, -15, 31),
		Block.createCuboidShape(-15, -15, 24, 31, -14, 31),
		Block.createCuboidShape(0, 0, 0, 8, 32, 1),
		Block.createCuboidShape(-16, 16, 0, 8, 32, 1),
		Block.createCuboidShape(-16, -16, 0, 8, 0, 1),
		Block.createCuboidShape(-15, -15, 1, 16, -14, 8),
		Block.createCuboidShape(-16, 0, 0, 0, 16, 1),
		Block.createCuboidShape(-15, 17, 1, 7, 18, 12),
		Block.createCuboidShape(-15, 28, 1, 7, 29, 12),
		Block.createCuboidShape(6, 18, 1, 7, 28, 11),
		Block.createCuboidShape(-14, -14, 15, -12, 7, 17),
		Block.createCuboidShape(-11, 6, 15, -10, 7, 31),
		Block.createCuboidShape(30, -9, 30, 31, 6, 31),
		Block.createCuboidShape(30, -9, 16, 31, -8, 30),
		Block.createCuboidShape(30, -8, 16, 31, 0, 17),
		Block.createCuboidShape(-15, -14, 28, -12, 32, 31),
		Block.createCuboidShape(-15, -14, 24, -13, 32, 26),
		Block.createCuboidShape(-15, -14, 19, -12, 32, 22),
		Block.createCuboidShape(-10, 8, 25, -9, 9, 30),
		Block.createCuboidShape(17, 25, 20, 21, 26, 24),
		Block.createCuboidShape(18, 26, 21, 19, 27, 31),
		Block.createCuboidShape(18, 8, 30, 19, 26, 31),
		Block.createCuboidShape(8, 9, 29, 9, 19, 32),
		Block.createCuboidShape(-10, 10, 30, 0, 11, 31),
		Block.createCuboidShape(-2, 18, 30, -1, 32, 31),
		Block.createCuboidShape(0, 9, 29, 1, 19, 32),
		Block.createCuboidShape(11, 10, 30, 16, 14, 31),
		Block.createCuboidShape(24, -14, 14, 28, -1, 18)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -1, 21, 8, 3, 31),
		Block.createCuboidShape(-8, -15, -15, 8, -14, 2),
		Block.createCuboidShape(-16, 9, 1, -13, 19, 8),
		Block.createCuboidShape(3, 18, -15, 5, 28, 7),
		Block.createCuboidShape(-8, -16, 16, 15, -14, 31),
		Block.createCuboidShape(-15, 6, -10, -14, 9, 31),
		Block.createCuboidShape(-8, -15, 2, 8, -14, 16),
		Block.createCuboidShape(-16, -16, -16, -15, 32, 32),
		Block.createCuboidShape(-5, -16, -15, 5, -15, 16),
		Block.createCuboidShape(-15, -16, 31, 15, 32, 32),
		Block.createCuboidShape(-15, -16, -16, 15, 32, -15),
		Block.createCuboidShape(15, -16, 24, 16, 32, 32),
		Block.createCuboidShape(5, -16, -15, 15, -15, 31),
		Block.createCuboidShape(-15, -16, -15, -5, -15, 31),
		Block.createCuboidShape(-15, -15, -15, -8, -14, 31),
		Block.createCuboidShape(15, 0, 0, 16, 32, 8),
		Block.createCuboidShape(15, 16, -16, 16, 32, 8),
		Block.createCuboidShape(15, -16, -16, 16, 0, 8),
		Block.createCuboidShape(8, -15, -15, 15, -14, 16),
		Block.createCuboidShape(15, 0, -16, 16, 16, 0),
		Block.createCuboidShape(4, 17, -15, 15, 18, 7),
		Block.createCuboidShape(4, 28, -15, 15, 29, 7),
		Block.createCuboidShape(5, 18, 6, 15, 28, 7),
		Block.createCuboidShape(-1, -14, -14, 1, 7, -12),
		Block.createCuboidShape(-15, 6, -11, 1, 7, -10),
		Block.createCuboidShape(-15, -9, 30, -14, 6, 31),
		Block.createCuboidShape(-14, -9, 30, 0, -8, 31),
		Block.createCuboidShape(-1, -8, 30, 0, 0, 31),
		Block.createCuboidShape(-15, -14, -15, -12, 32, -12),
		Block.createCuboidShape(-10, -14, -15, -8, 32, -13),
		Block.createCuboidShape(-6, -14, -15, -3, 32, -12),
		Block.createCuboidShape(-14, 8, -10, -9, 9, -9),
		Block.createCuboidShape(-8, 25, 17, -4, 26, 21),
		Block.createCuboidShape(-15, 26, 18, -5, 27, 19),
		Block.createCuboidShape(-15, 8, 18, -14, 26, 19),
		Block.createCuboidShape(-16, 9, 8, -13, 19, 9),
		Block.createCuboidShape(-15, 10, -10, -14, 11, 0),
		Block.createCuboidShape(-15, 18, -2, -14, 32, -1),
		Block.createCuboidShape(-16, 9, 0, -13, 19, 1),
		Block.createCuboidShape(-15, 10, 11, -14, 14, 16),
		Block.createCuboidShape(-2, -14, 24, 2, -1, 28)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-15, -1, -8, -5, 3, 8),
		Block.createCuboidShape(14, -15, -8, 31, -14, 8),
		Block.createCuboidShape(8, 9, -16, 15, 19, -13),
		Block.createCuboidShape(9, 18, 3, 31, 28, 5),
		Block.createCuboidShape(-15, -16, -8, 0, -14, 15),
		Block.createCuboidShape(-15, 6, -15, 26, 9, -14),
		Block.createCuboidShape(0, -15, -8, 14, -14, 8),
		Block.createCuboidShape(-16, -16, -16, 32, 32, -15),
		Block.createCuboidShape(0, -16, -5, 31, -15, 5),
		Block.createCuboidShape(-16, -16, -15, -15, 32, 15),
		Block.createCuboidShape(31, -16, -15, 32, 32, 15),
		Block.createCuboidShape(-16, -16, 15, -8, 32, 16),
		Block.createCuboidShape(-15, -16, 5, 31, -15, 15),
		Block.createCuboidShape(-15, -16, -15, 31, -15, -5),
		Block.createCuboidShape(-15, -15, -15, 31, -14, -8),
		Block.createCuboidShape(8, 0, 15, 16, 32, 16),
		Block.createCuboidShape(8, 16, 15, 32, 32, 16),
		Block.createCuboidShape(8, -16, 15, 32, 0, 16),
		Block.createCuboidShape(0, -15, 8, 31, -14, 15),
		Block.createCuboidShape(16, 0, 15, 32, 16, 16),
		Block.createCuboidShape(9, 17, 4, 31, 18, 15),
		Block.createCuboidShape(9, 28, 4, 31, 29, 15),
		Block.createCuboidShape(9, 18, 5, 10, 28, 15),
		Block.createCuboidShape(28, -14, -1, 30, 7, 1),
		Block.createCuboidShape(26, 6, -15, 27, 7, 1),
		Block.createCuboidShape(-15, -9, -15, -14, 6, -14),
		Block.createCuboidShape(-15, -9, -14, -14, -8, 0),
		Block.createCuboidShape(-15, -8, -1, -14, 0, 0),
		Block.createCuboidShape(28, -14, -15, 31, 32, -12),
		Block.createCuboidShape(29, -14, -10, 31, 32, -8),
		Block.createCuboidShape(28, -14, -6, 31, 32, -3),
		Block.createCuboidShape(25, 8, -14, 26, 9, -9),
		Block.createCuboidShape(-5, 25, -8, -1, 26, -4),
		Block.createCuboidShape(-3, 26, -15, -2, 27, -5),
		Block.createCuboidShape(-3, 8, -15, -2, 26, -14),
		Block.createCuboidShape(7, 9, -16, 8, 19, -13),
		Block.createCuboidShape(16, 10, -15, 26, 11, -14),
		Block.createCuboidShape(17, 18, -15, 18, 32, -14),
		Block.createCuboidShape(15, 9, -16, 16, 19, -13),
		Block.createCuboidShape(0, 10, -15, 5, 14, -14),
		Block.createCuboidShape(-12, -14, -2, -8, -1, 2)
    );

    public Fyftl_Data() {
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

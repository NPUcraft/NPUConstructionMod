package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fbtable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(30, 13, 2, 31, 21, 21),
		Block.createCuboidShape(0, 14, 5, 12, 14, 27),
		Block.createCuboidShape(-10, 10, 1, -2, 11, 31),
		Block.createCuboidShape(18, 10, 1, 26, 11, 31),
		Block.createCuboidShape(-15, 18, 4, -13, 20, 28),
		Block.createCuboidShape(29, 18, 4, 31, 20, 28),
		Block.createCuboidShape(-10, 10, 30, 26, 10, 30),
		Block.createCuboidShape(-10, 10, 20, 26, 10, 21),
		Block.createCuboidShape(-10, 10, 12, 26, 10, 12),
		Block.createCuboidShape(-10, 10, 2, 26, 10, 2),
		Block.createCuboidShape(-1, 18, 0, 17, 19, 32),
		Block.createCuboidShape(-7, 8, 1, -5, 10, 31),
		Block.createCuboidShape(-4, 8, 16, 20, 10, 17),
		Block.createCuboidShape(21, 8, 1, 23, 10, 31),
		Block.createCuboidShape(15, 14, 5, 16, 14, 27),
		Block.createCuboidShape(0, 14, 27, 16, 14, 27),
		Block.createCuboidShape(0, 14, 5, 16, 14, 5),
		Block.createCuboidShape(-1, 10, 16, 0, 17, 17),
		Block.createCuboidShape(16, 10, 16, 17, 17, 17),
		Block.createCuboidShape(-1, 17, 4, 0, 18, 30),
		Block.createCuboidShape(16, 17, 3, 17, 18, 29),
		Block.createCuboidShape(-12, 13, 12, -11, 21, 12),
		Block.createCuboidShape(-13, 10, 2, -12, 18, 2),
		Block.createCuboidShape(-7, 0, 27, -5, 8, 28),
		Block.createCuboidShape(21, 0, 27, 23, 8, 28),
		Block.createCuboidShape(21, 0, 4, 23, 8, 5),
		Block.createCuboidShape(-7, 0, 4, -5, 8, 5),
		Block.createCuboidShape(30, 13, 30, 31, 21, 30),
		Block.createCuboidShape(-12, 13, 30, -11, 21, 30),
		Block.createCuboidShape(-13, 10, 20, -12, 18, 21)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-5, 13, 30, 14, 21, 31),
		Block.createCuboidShape(-11, 14, 0, 11, 14, 12),
		Block.createCuboidShape(-15, 10, -10, 15, 11, -2),
		Block.createCuboidShape(-15, 10, 18, 15, 11, 26),
		Block.createCuboidShape(-12, 18, -15, 12, 20, -13),
		Block.createCuboidShape(-12, 18, 29, 12, 20, 31),
		Block.createCuboidShape(-14, 10, -10, -14, 10, 26),
		Block.createCuboidShape(-5, 10, -10, -4, 10, 26),
		Block.createCuboidShape(4, 10, -10, 4, 10, 26),
		Block.createCuboidShape(14, 10, -10, 14, 10, 26),
		Block.createCuboidShape(-16, 18, -1, 16, 19, 17),
		Block.createCuboidShape(-15, 8, -7, 15, 10, -5),
		Block.createCuboidShape(-1, 8, -4, 0, 10, 20),
		Block.createCuboidShape(-15, 8, 21, 15, 10, 23),
		Block.createCuboidShape(-11, 14, 15, 11, 14, 16),
		Block.createCuboidShape(-11, 14, 0, -11, 14, 16),
		Block.createCuboidShape(11, 14, 0, 11, 14, 16),
		Block.createCuboidShape(-1, 10, -1, 0, 17, 0),
		Block.createCuboidShape(-1, 10, 16, 0, 17, 17),
		Block.createCuboidShape(-14, 17, -1, 12, 18, 0),
		Block.createCuboidShape(-13, 17, 16, 13, 18, 17),
		Block.createCuboidShape(4, 13, -12, 4, 21, -11),
		Block.createCuboidShape(14, 10, -13, 14, 18, -12),
		Block.createCuboidShape(-12, 0, -7, -11, 8, -5),
		Block.createCuboidShape(-12, 0, 21, -11, 8, 23),
		Block.createCuboidShape(11, 0, 21, 12, 8, 23),
		Block.createCuboidShape(11, 0, -7, 12, 8, -5),
		Block.createCuboidShape(-14, 13, 30, -14, 21, 31),
		Block.createCuboidShape(-14, 13, -12, -14, 21, -11),
		Block.createCuboidShape(-5, 10, -13, -4, 18, -12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 13, -5, -14, 21, 14),
		Block.createCuboidShape(4, 14, -11, 16, 14, 11),
		Block.createCuboidShape(18, 10, -15, 26, 11, 15),
		Block.createCuboidShape(-10, 10, -15, -2, 11, 15),
		Block.createCuboidShape(29, 18, -12, 31, 20, 12),
		Block.createCuboidShape(-15, 18, -12, -13, 20, 12),
		Block.createCuboidShape(-10, 10, -14, 26, 10, -14),
		Block.createCuboidShape(-10, 10, -5, 26, 10, -4),
		Block.createCuboidShape(-10, 10, 4, 26, 10, 4),
		Block.createCuboidShape(-10, 10, 14, 26, 10, 14),
		Block.createCuboidShape(-1, 18, -16, 17, 19, 16),
		Block.createCuboidShape(21, 8, -15, 23, 10, 15),
		Block.createCuboidShape(-4, 8, -1, 20, 10, 0),
		Block.createCuboidShape(-7, 8, -15, -5, 10, 15),
		Block.createCuboidShape(0, 14, -11, 1, 14, 11),
		Block.createCuboidShape(0, 14, -11, 16, 14, -11),
		Block.createCuboidShape(0, 14, 11, 16, 14, 11),
		Block.createCuboidShape(16, 10, -1, 17, 17, 0),
		Block.createCuboidShape(-1, 10, -1, 0, 17, 0),
		Block.createCuboidShape(16, 17, -14, 17, 18, 12),
		Block.createCuboidShape(-1, 17, -13, 0, 18, 13),
		Block.createCuboidShape(27, 13, 4, 28, 21, 4),
		Block.createCuboidShape(28, 10, 14, 29, 18, 14),
		Block.createCuboidShape(21, 0, -12, 23, 8, -11),
		Block.createCuboidShape(-7, 0, -12, -5, 8, -11),
		Block.createCuboidShape(-7, 0, 11, -5, 8, 12),
		Block.createCuboidShape(21, 0, 11, 23, 8, 12),
		Block.createCuboidShape(-15, 13, -14, -14, 21, -14),
		Block.createCuboidShape(27, 13, -14, 28, 21, -14),
		Block.createCuboidShape(28, 10, -5, 29, 18, -4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 13, -15, 21, 21, -14),
		Block.createCuboidShape(5, 14, 4, 27, 14, 16),
		Block.createCuboidShape(1, 10, 18, 31, 11, 26),
		Block.createCuboidShape(1, 10, -10, 31, 11, -2),
		Block.createCuboidShape(4, 18, 29, 28, 20, 31),
		Block.createCuboidShape(4, 18, -15, 28, 20, -13),
		Block.createCuboidShape(30, 10, -10, 30, 10, 26),
		Block.createCuboidShape(20, 10, -10, 21, 10, 26),
		Block.createCuboidShape(12, 10, -10, 12, 10, 26),
		Block.createCuboidShape(2, 10, -10, 2, 10, 26),
		Block.createCuboidShape(0, 18, -1, 32, 19, 17),
		Block.createCuboidShape(1, 8, 21, 31, 10, 23),
		Block.createCuboidShape(16, 8, -4, 17, 10, 20),
		Block.createCuboidShape(1, 8, -7, 31, 10, -5),
		Block.createCuboidShape(5, 14, 0, 27, 14, 1),
		Block.createCuboidShape(27, 14, 0, 27, 14, 16),
		Block.createCuboidShape(5, 14, 0, 5, 14, 16),
		Block.createCuboidShape(16, 10, 16, 17, 17, 17),
		Block.createCuboidShape(16, 10, -1, 17, 17, 0),
		Block.createCuboidShape(4, 17, 16, 30, 18, 17),
		Block.createCuboidShape(3, 17, -1, 29, 18, 0),
		Block.createCuboidShape(12, 13, 27, 12, 21, 28),
		Block.createCuboidShape(2, 10, 28, 2, 18, 29),
		Block.createCuboidShape(27, 0, 21, 28, 8, 23),
		Block.createCuboidShape(27, 0, -7, 28, 8, -5),
		Block.createCuboidShape(4, 0, -7, 5, 8, -5),
		Block.createCuboidShape(4, 0, 21, 5, 8, 23),
		Block.createCuboidShape(30, 13, -15, 30, 21, -14),
		Block.createCuboidShape(30, 13, 27, 30, 21, 28),
		Block.createCuboidShape(20, 10, 28, 21, 18, 29)
    );

    public Fbtable_Data() {
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

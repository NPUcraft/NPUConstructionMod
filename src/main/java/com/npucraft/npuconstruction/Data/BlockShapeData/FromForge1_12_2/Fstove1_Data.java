package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstove1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 14, -1, 3, 17, 10),
		Block.createCuboidShape(-13, 23, 0, -2, 24, 11),
		Block.createCuboidShape(13, 14, -1, 19, 17, 10),
		Block.createCuboidShape(21, 14, 9, 26, 18, 13),
		Block.createCuboidShape(-10, 14, -1, -5, 23, 0),
		Block.createCuboidShape(-13, 14, 2, -12, 23, 6),
		Block.createCuboidShape(19, 16, 1, 27, 17, 9),
		Block.createCuboidShape(21, 14, -1, 26, 18, 1),
		Block.createCuboidShape(27, 14, 2, 28, 18, 7),
		Block.createCuboidShape(18, 14, 2, 19, 18, 7),
		Block.createCuboidShape(5, 14, 10, 11, 17, 13),
		Block.createCuboidShape(-10, 14, 10, -5, 17, 13),
		Block.createCuboidShape(-12, 14, -5, 28, 16, 0),
		Block.createCuboidShape(-12, 17, 0, -3, 17, 10),
		Block.createCuboidShape(-9, 17, 10, -6, 23, 11),
		Block.createCuboidShape(-16, 0, -4, 32, 14, 16),
		Block.createCuboidShape(-2, 17, 3, -2, 23, 6),
		Block.createCuboidShape(28, 14, -5, 32, 16, 14),
		Block.createCuboidShape(-16, 14, -5, -12, 16, 14),
		Block.createCuboidShape(5, 14, -1, 11, 17, 0),
		Block.createCuboidShape(32, 16, -5, 32, 20, 14),
		Block.createCuboidShape(-16, 16, -5, -16, 20, 14),
		Block.createCuboidShape(-16, 14, 14, 32, 28, 16),
		Block.createCuboidShape(-12, 14, 10, 28, 16, 14),
		Block.createCuboidShape(23, 18, -5, 24, 19, 0)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 14, -3, 17, 17, 3),
		Block.createCuboidShape(5, 23, -13, 16, 24, -2),
		Block.createCuboidShape(6, 14, 13, 17, 17, 19),
		Block.createCuboidShape(3, 14, 21, 7, 18, 26),
		Block.createCuboidShape(16, 14, -10, 17, 23, -5),
		Block.createCuboidShape(10, 14, -13, 14, 23, -12),
		Block.createCuboidShape(7, 16, 19, 15, 17, 27),
		Block.createCuboidShape(15, 14, 21, 17, 18, 26),
		Block.createCuboidShape(9, 14, 27, 14, 18, 28),
		Block.createCuboidShape(9, 14, 18, 14, 18, 19),
		Block.createCuboidShape(3, 14, 5, 6, 17, 11),
		Block.createCuboidShape(3, 14, -10, 6, 17, -5),
		Block.createCuboidShape(16, 14, -12, 21, 16, 28),
		Block.createCuboidShape(6, 17, -12, 16, 17, -3),
		Block.createCuboidShape(5, 17, -9, 6, 23, -6),
		Block.createCuboidShape(0, 0, -16, 20, 14, 32),
		Block.createCuboidShape(10, 17, -2, 13, 23, -2),
		Block.createCuboidShape(2, 14, 28, 21, 16, 32),
		Block.createCuboidShape(2, 14, -16, 21, 16, -12),
		Block.createCuboidShape(16, 14, 5, 17, 17, 11),
		Block.createCuboidShape(2, 16, 32, 21, 20, 32),
		Block.createCuboidShape(2, 16, -16, 21, 20, -16),
		Block.createCuboidShape(0, 14, -16, 2, 28, 32),
		Block.createCuboidShape(2, 14, -12, 6, 16, 28),
		Block.createCuboidShape(16, 18, 23, 21, 19, 24)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(13, 14, 6, 19, 17, 17),
		Block.createCuboidShape(18, 23, 5, 29, 24, 16),
		Block.createCuboidShape(-3, 14, 6, 3, 17, 17),
		Block.createCuboidShape(-10, 14, 3, -5, 18, 7),
		Block.createCuboidShape(21, 14, 16, 26, 23, 17),
		Block.createCuboidShape(28, 14, 10, 29, 23, 14),
		Block.createCuboidShape(-11, 16, 7, -3, 17, 15),
		Block.createCuboidShape(-10, 14, 15, -5, 18, 17),
		Block.createCuboidShape(-12, 14, 9, -11, 18, 14),
		Block.createCuboidShape(-3, 14, 9, -2, 18, 14),
		Block.createCuboidShape(5, 14, 3, 11, 17, 6),
		Block.createCuboidShape(21, 14, 3, 26, 17, 6),
		Block.createCuboidShape(-12, 14, 16, 28, 16, 21),
		Block.createCuboidShape(19, 17, 6, 28, 17, 16),
		Block.createCuboidShape(22, 17, 5, 25, 23, 6),
		Block.createCuboidShape(-16, 0, 0, 32, 14, 20),
		Block.createCuboidShape(18, 17, 10, 18, 23, 13),
		Block.createCuboidShape(-16, 14, 2, -12, 16, 21),
		Block.createCuboidShape(28, 14, 2, 32, 16, 21),
		Block.createCuboidShape(5, 14, 16, 11, 17, 17),
		Block.createCuboidShape(-16, 16, 2, -16, 20, 21),
		Block.createCuboidShape(32, 16, 2, 32, 20, 21),
		Block.createCuboidShape(-16, 14, 0, 32, 28, 2),
		Block.createCuboidShape(-12, 14, 2, 28, 16, 6),
		Block.createCuboidShape(-8, 18, 16, -7, 19, 21)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 14, 13, 10, 17, 19),
		Block.createCuboidShape(0, 23, 18, 11, 24, 29),
		Block.createCuboidShape(-1, 14, -3, 10, 17, 3),
		Block.createCuboidShape(9, 14, -10, 13, 18, -5),
		Block.createCuboidShape(-1, 14, 21, 0, 23, 26),
		Block.createCuboidShape(2, 14, 28, 6, 23, 29),
		Block.createCuboidShape(1, 16, -11, 9, 17, -3),
		Block.createCuboidShape(-1, 14, -10, 1, 18, -5),
		Block.createCuboidShape(2, 14, -12, 7, 18, -11),
		Block.createCuboidShape(2, 14, -3, 7, 18, -2),
		Block.createCuboidShape(10, 14, 5, 13, 17, 11),
		Block.createCuboidShape(10, 14, 21, 13, 17, 26),
		Block.createCuboidShape(-5, 14, -12, 0, 16, 28),
		Block.createCuboidShape(0, 17, 19, 10, 17, 28),
		Block.createCuboidShape(10, 17, 22, 11, 23, 25),
		Block.createCuboidShape(-4, 0, -16, 16, 14, 32),
		Block.createCuboidShape(3, 17, 18, 6, 23, 18),
		Block.createCuboidShape(-5, 14, -16, 14, 16, -12),
		Block.createCuboidShape(-5, 14, 28, 14, 16, 32),
		Block.createCuboidShape(-1, 14, 5, 0, 17, 11),
		Block.createCuboidShape(-5, 16, -16, 14, 20, -16),
		Block.createCuboidShape(-5, 16, 32, 14, 20, 32),
		Block.createCuboidShape(14, 14, -16, 16, 28, 32),
		Block.createCuboidShape(10, 14, -12, 14, 16, 28),
		Block.createCuboidShape(-5, 18, -8, 0, 19, -7)
    );

    public Fstove1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bbed2r1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(26, 20, 2, 27, 27, 15),
		Block.createCuboidShape(-12, 20, 2, -11, 27, 15),
		Block.createCuboidShape(-6, 20, 0, 15, 24, 1),
		Block.createCuboidShape(21, -8, -2, 26, 14, -1),
		Block.createCuboidShape(-10, 12, 13, 12, 14, 16),
		Block.createCuboidShape(26, -16, -2, 27, 25, 1),
		Block.createCuboidShape(-11, -1, 4, 12, 0, 16),
		Block.createCuboidShape(-12, -14, 1, -5, -13, 16),
		Block.createCuboidShape(4, -14, 4, 26, -13, 16),
		Block.createCuboidShape(-10, -4, 4, 4, -3, 13),
		Block.createCuboidShape(-12, 19, 0, 27, 20, 17),
		Block.createCuboidShape(13, -9, 4, 25, 18, 5),
		Block.createCuboidShape(26, -16, 16, 27, 25, 17),
		Block.createCuboidShape(20, -16, -2, 21, 18, -1),
		Block.createCuboidShape(-12, -16, 0, -11, 25, 1),
		Block.createCuboidShape(-12, -16, 16, -11, 25, 17),
		Block.createCuboidShape(26, 8, 1, 27, 9, 16),
		Block.createCuboidShape(26, -14, 1, 27, -13, 16),
		Block.createCuboidShape(-12, 8, 1, -11, 9, 16),
		Block.createCuboidShape(-11, 24, 0, 14, 25, 1),
		Block.createCuboidShape(13, -9, 5, 25, -8, 15),
		Block.createCuboidShape(13, 17, 5, 25, 18, 15),
		Block.createCuboidShape(25, -13, 4, 26, 18, 16),
		Block.createCuboidShape(12, -13, 4, 13, 18, 16),
		Block.createCuboidShape(-11, -13, 4, -10, -1, 15),
		Block.createCuboidShape(-6, -13, 4, -5, -1, 14),
		Block.createCuboidShape(-11, 0, 13, -10, 18, 16),
		Block.createCuboidShape(-4, 0, 13, -3, 18, 16),
		Block.createCuboidShape(4, -13, 4, 5, -1, 14),
		Block.createCuboidShape(-10, 6, 13, -4, 7, 15),
		Block.createCuboidShape(-10, 17, 13, -4, 18, 15),
		Block.createCuboidShape(-10, -4, 4, -6, -1, 5),
		Block.createCuboidShape(-10, 0, 15, -4, 18, 16),
		Block.createCuboidShape(5, -13, 4, 12, -1, 5),
		Block.createCuboidShape(5, -13, 13, 12, -1, 14),
		Block.createCuboidShape(-10, -4, 13, -6, -1, 14),
		Block.createCuboidShape(13, -13, 15, 25, 18, 16),
		Block.createCuboidShape(-1, -1, 13, 7, 4, 13)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 20, 26, 14, 27, 27),
		Block.createCuboidShape(1, 20, -12, 14, 27, -11),
		Block.createCuboidShape(15, 20, -6, 16, 24, 15),
		Block.createCuboidShape(17, -8, 21, 18, 14, 26),
		Block.createCuboidShape(0, 12, -10, 3, 14, 12),
		Block.createCuboidShape(15, -16, 26, 18, 25, 27),
		Block.createCuboidShape(0, -1, -11, 12, 0, 12),
		Block.createCuboidShape(0, -14, -12, 15, -13, -5),
		Block.createCuboidShape(0, -14, 4, 12, -13, 26),
		Block.createCuboidShape(3, -4, -10, 12, -3, 4),
		Block.createCuboidShape(-1, 19, -12, 16, 20, 27),
		Block.createCuboidShape(11, -9, 13, 12, 18, 25),
		Block.createCuboidShape(-1, -16, 26, 0, 25, 27),
		Block.createCuboidShape(17, -16, 20, 18, 18, 21),
		Block.createCuboidShape(15, -16, -12, 16, 25, -11),
		Block.createCuboidShape(-1, -16, -12, 0, 25, -11),
		Block.createCuboidShape(0, 8, 26, 15, 9, 27),
		Block.createCuboidShape(0, -14, 26, 15, -13, 27),
		Block.createCuboidShape(0, 8, -12, 15, 9, -11),
		Block.createCuboidShape(15, 24, -11, 16, 25, 14),
		Block.createCuboidShape(1, -9, 13, 11, -8, 25),
		Block.createCuboidShape(1, 17, 13, 11, 18, 25),
		Block.createCuboidShape(0, -13, 25, 12, 18, 26),
		Block.createCuboidShape(0, -13, 12, 12, 18, 13),
		Block.createCuboidShape(1, -13, -11, 12, -1, -10),
		Block.createCuboidShape(2, -13, -6, 12, -1, -5),
		Block.createCuboidShape(0, 0, -11, 3, 18, -10),
		Block.createCuboidShape(0, 0, -4, 3, 18, -3),
		Block.createCuboidShape(2, -13, 4, 12, -1, 5),
		Block.createCuboidShape(1, 6, -10, 3, 7, -4),
		Block.createCuboidShape(1, 17, -10, 3, 18, -4),
		Block.createCuboidShape(11, -4, -10, 12, -1, -6),
		Block.createCuboidShape(0, 0, -10, 1, 18, -4),
		Block.createCuboidShape(11, -13, 5, 12, -1, 12),
		Block.createCuboidShape(2, -13, 5, 3, -1, 12),
		Block.createCuboidShape(2, -4, -10, 3, -1, -6),
		Block.createCuboidShape(0, -13, 13, 1, 18, 25),
		Block.createCuboidShape(3, -1, -1, 3, 4, 7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 20, 1, -10, 27, 14),
		Block.createCuboidShape(27, 20, 1, 28, 27, 14),
		Block.createCuboidShape(1, 20, 15, 22, 24, 16),
		Block.createCuboidShape(-10, -8, 17, -5, 14, 18),
		Block.createCuboidShape(4, 12, 0, 26, 14, 3),
		Block.createCuboidShape(-11, -16, 15, -10, 25, 18),
		Block.createCuboidShape(4, -1, 0, 27, 0, 12),
		Block.createCuboidShape(21, -14, 0, 28, -13, 15),
		Block.createCuboidShape(-10, -14, 0, 12, -13, 12),
		Block.createCuboidShape(12, -4, 3, 26, -3, 12),
		Block.createCuboidShape(-11, 19, -1, 28, 20, 16),
		Block.createCuboidShape(-9, -9, 11, 3, 18, 12),
		Block.createCuboidShape(-11, -16, -1, -10, 25, 0),
		Block.createCuboidShape(-5, -16, 17, -4, 18, 18),
		Block.createCuboidShape(27, -16, 15, 28, 25, 16),
		Block.createCuboidShape(27, -16, -1, 28, 25, 0),
		Block.createCuboidShape(-11, 8, 0, -10, 9, 15),
		Block.createCuboidShape(-11, -14, 0, -10, -13, 15),
		Block.createCuboidShape(27, 8, 0, 28, 9, 15),
		Block.createCuboidShape(2, 24, 15, 27, 25, 16),
		Block.createCuboidShape(-9, -9, 1, 3, -8, 11),
		Block.createCuboidShape(-9, 17, 1, 3, 18, 11),
		Block.createCuboidShape(-10, -13, 0, -9, 18, 12),
		Block.createCuboidShape(3, -13, 0, 4, 18, 12),
		Block.createCuboidShape(26, -13, 1, 27, -1, 12),
		Block.createCuboidShape(21, -13, 2, 22, -1, 12),
		Block.createCuboidShape(26, 0, 0, 27, 18, 3),
		Block.createCuboidShape(19, 0, 0, 20, 18, 3),
		Block.createCuboidShape(11, -13, 2, 12, -1, 12),
		Block.createCuboidShape(20, 6, 1, 26, 7, 3),
		Block.createCuboidShape(20, 17, 1, 26, 18, 3),
		Block.createCuboidShape(22, -4, 11, 26, -1, 12),
		Block.createCuboidShape(20, 0, 0, 26, 18, 1),
		Block.createCuboidShape(4, -13, 11, 11, -1, 12),
		Block.createCuboidShape(4, -13, 2, 11, -1, 3),
		Block.createCuboidShape(22, -4, 2, 26, -1, 3),
		Block.createCuboidShape(-9, -13, 0, 3, 18, 1),
		Block.createCuboidShape(9, -1, 3, 17, 4, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 20, -11, 15, 27, -10),
		Block.createCuboidShape(2, 20, 27, 15, 27, 28),
		Block.createCuboidShape(0, 20, 1, 1, 24, 22),
		Block.createCuboidShape(-2, -8, -10, -1, 14, -5),
		Block.createCuboidShape(13, 12, 4, 16, 14, 26),
		Block.createCuboidShape(-2, -16, -11, 1, 25, -10),
		Block.createCuboidShape(4, -1, 4, 16, 0, 27),
		Block.createCuboidShape(1, -14, 21, 16, -13, 28),
		Block.createCuboidShape(4, -14, -10, 16, -13, 12),
		Block.createCuboidShape(4, -4, 12, 13, -3, 26),
		Block.createCuboidShape(0, 19, -11, 17, 20, 28),
		Block.createCuboidShape(4, -9, -9, 5, 18, 3),
		Block.createCuboidShape(16, -16, -11, 17, 25, -10),
		Block.createCuboidShape(-2, -16, -5, -1, 18, -4),
		Block.createCuboidShape(0, -16, 27, 1, 25, 28),
		Block.createCuboidShape(16, -16, 27, 17, 25, 28),
		Block.createCuboidShape(1, 8, -11, 16, 9, -10),
		Block.createCuboidShape(1, -14, -11, 16, -13, -10),
		Block.createCuboidShape(1, 8, 27, 16, 9, 28),
		Block.createCuboidShape(0, 24, 2, 1, 25, 27),
		Block.createCuboidShape(5, -9, -9, 15, -8, 3),
		Block.createCuboidShape(5, 17, -9, 15, 18, 3),
		Block.createCuboidShape(4, -13, -10, 16, 18, -9),
		Block.createCuboidShape(4, -13, 3, 16, 18, 4),
		Block.createCuboidShape(4, -13, 26, 15, -1, 27),
		Block.createCuboidShape(4, -13, 21, 14, -1, 22),
		Block.createCuboidShape(13, 0, 26, 16, 18, 27),
		Block.createCuboidShape(13, 0, 19, 16, 18, 20),
		Block.createCuboidShape(4, -13, 11, 14, -1, 12),
		Block.createCuboidShape(13, 6, 20, 15, 7, 26),
		Block.createCuboidShape(13, 17, 20, 15, 18, 26),
		Block.createCuboidShape(4, -4, 22, 5, -1, 26),
		Block.createCuboidShape(15, 0, 20, 16, 18, 26),
		Block.createCuboidShape(4, -13, 4, 5, -1, 11),
		Block.createCuboidShape(13, -13, 4, 14, -1, 11),
		Block.createCuboidShape(13, -4, 22, 14, -1, 26),
		Block.createCuboidShape(15, -13, -9, 16, 18, 3),
		Block.createCuboidShape(13, -1, 9, 13, 4, 17)
    );

    public Bbed2r1_Data() {
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

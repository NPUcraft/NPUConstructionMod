package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bbed2l_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(26, 20, 1, 27, 27, 14),
		Block.createCuboidShape(-12, 20, 1, -11, 27, 14),
		Block.createCuboidShape(-6, 20, -1, 15, 24, 0),
		Block.createCuboidShape(21, -8, -3, 26, 14, -2),
		Block.createCuboidShape(-10, 12, 12, 12, 14, 15),
		Block.createCuboidShape(26, -16, -3, 27, 25, 0),
		Block.createCuboidShape(-12, -14, 0, -5, -13, 15),
		Block.createCuboidShape(4, -14, 3, 26, -13, 15),
		Block.createCuboidShape(-10, -4, 3, 4, -3, 12),
		Block.createCuboidShape(-12, 19, -1, 27, 20, 16),
		Block.createCuboidShape(26, -16, 15, 27, 25, 16),
		Block.createCuboidShape(-12, -16, 15, -11, 25, 16),
		Block.createCuboidShape(20, -16, -3, 21, 18, -2),
		Block.createCuboidShape(-12, -16, -1, -11, 25, 0),
		Block.createCuboidShape(26, 8, 0, 27, 9, 15),
		Block.createCuboidShape(-12, 8, 0, -11, 9, 15),
		Block.createCuboidShape(26, -14, 0, 27, -13, 15),
		Block.createCuboidShape(-11, 24, -1, 14, 25, 0),
		Block.createCuboidShape(13, -9, 4, 25, -8, 14),
		Block.createCuboidShape(-11, -1, 3, 12, 0, 15),
		Block.createCuboidShape(13, 17, 4, 25, 18, 14),
		Block.createCuboidShape(25, -13, 3, 26, 18, 15),
		Block.createCuboidShape(12, -13, 3, 13, 18, 15),
		Block.createCuboidShape(-11, -13, 3, -10, -1, 14),
		Block.createCuboidShape(-6, -13, 3, -5, -1, 13),
		Block.createCuboidShape(-11, 0, 12, -10, 18, 15),
		Block.createCuboidShape(-4, 0, 12, -3, 18, 15),
		Block.createCuboidShape(4, -13, 3, 5, -1, 13),
		Block.createCuboidShape(-10, 6, 12, -4, 7, 14),
		Block.createCuboidShape(-10, 17, 12, -4, 18, 14),
		Block.createCuboidShape(-10, -4, 3, -6, -1, 4),
		Block.createCuboidShape(-10, 0, 14, -4, 18, 15),
		Block.createCuboidShape(5, -13, 3, 12, -1, 4),
		Block.createCuboidShape(5, -13, 12, 12, -1, 13),
		Block.createCuboidShape(-10, -4, 12, -6, -1, 13),
		Block.createCuboidShape(13, -9, 3, 25, 18, 4),
		Block.createCuboidShape(13, -13, 14, 25, 18, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, 20, 26, 15, 27, 27),
		Block.createCuboidShape(2, 20, -12, 15, 27, -11),
		Block.createCuboidShape(16, 20, -6, 17, 24, 15),
		Block.createCuboidShape(18, -8, 21, 19, 14, 26),
		Block.createCuboidShape(1, 12, -10, 4, 14, 12),
		Block.createCuboidShape(16, -16, 26, 19, 25, 27),
		Block.createCuboidShape(1, -14, -12, 16, -13, -5),
		Block.createCuboidShape(1, -14, 4, 13, -13, 26),
		Block.createCuboidShape(4, -4, -10, 13, -3, 4),
		Block.createCuboidShape(0, 19, -12, 17, 20, 27),
		Block.createCuboidShape(0, -16, 26, 1, 25, 27),
		Block.createCuboidShape(0, -16, -12, 1, 25, -11),
		Block.createCuboidShape(18, -16, 20, 19, 18, 21),
		Block.createCuboidShape(16, -16, -12, 17, 25, -11),
		Block.createCuboidShape(1, 8, 26, 16, 9, 27),
		Block.createCuboidShape(1, 8, -12, 16, 9, -11),
		Block.createCuboidShape(1, -14, 26, 16, -13, 27),
		Block.createCuboidShape(16, 24, -11, 17, 25, 14),
		Block.createCuboidShape(2, -9, 13, 12, -8, 25),
		Block.createCuboidShape(1, -1, -11, 13, 0, 12),
		Block.createCuboidShape(2, 17, 13, 12, 18, 25),
		Block.createCuboidShape(1, -13, 25, 13, 18, 26),
		Block.createCuboidShape(1, -13, 12, 13, 18, 13),
		Block.createCuboidShape(2, -13, -11, 13, -1, -10),
		Block.createCuboidShape(3, -13, -6, 13, -1, -5),
		Block.createCuboidShape(1, 0, -11, 4, 18, -10),
		Block.createCuboidShape(1, 0, -4, 4, 18, -3),
		Block.createCuboidShape(3, -13, 4, 13, -1, 5),
		Block.createCuboidShape(2, 6, -10, 4, 7, -4),
		Block.createCuboidShape(2, 17, -10, 4, 18, -4),
		Block.createCuboidShape(12, -4, -10, 13, -1, -6),
		Block.createCuboidShape(1, 0, -10, 2, 18, -4),
		Block.createCuboidShape(12, -13, 5, 13, -1, 12),
		Block.createCuboidShape(3, -13, 5, 4, -1, 12),
		Block.createCuboidShape(3, -4, -10, 4, -1, -6),
		Block.createCuboidShape(12, -9, 13, 13, 18, 25),
		Block.createCuboidShape(1, -13, 13, 2, 18, 25)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 20, 2, -10, 27, 15),
		Block.createCuboidShape(27, 20, 2, 28, 27, 15),
		Block.createCuboidShape(1, 20, 16, 22, 24, 17),
		Block.createCuboidShape(-10, -8, 18, -5, 14, 19),
		Block.createCuboidShape(4, 12, 1, 26, 14, 4),
		Block.createCuboidShape(-11, -16, 16, -10, 25, 19),
		Block.createCuboidShape(21, -14, 1, 28, -13, 16),
		Block.createCuboidShape(-10, -14, 1, 12, -13, 13),
		Block.createCuboidShape(12, -4, 4, 26, -3, 13),
		Block.createCuboidShape(-11, 19, 0, 28, 20, 17),
		Block.createCuboidShape(-11, -16, 0, -10, 25, 1),
		Block.createCuboidShape(27, -16, 0, 28, 25, 1),
		Block.createCuboidShape(-5, -16, 18, -4, 18, 19),
		Block.createCuboidShape(27, -16, 16, 28, 25, 17),
		Block.createCuboidShape(-11, 8, 1, -10, 9, 16),
		Block.createCuboidShape(27, 8, 1, 28, 9, 16),
		Block.createCuboidShape(-11, -14, 1, -10, -13, 16),
		Block.createCuboidShape(2, 24, 16, 27, 25, 17),
		Block.createCuboidShape(-9, -9, 2, 3, -8, 12),
		Block.createCuboidShape(4, -1, 1, 27, 0, 13),
		Block.createCuboidShape(-9, 17, 2, 3, 18, 12),
		Block.createCuboidShape(-10, -13, 1, -9, 18, 13),
		Block.createCuboidShape(3, -13, 1, 4, 18, 13),
		Block.createCuboidShape(26, -13, 2, 27, -1, 13),
		Block.createCuboidShape(21, -13, 3, 22, -1, 13),
		Block.createCuboidShape(26, 0, 1, 27, 18, 4),
		Block.createCuboidShape(19, 0, 1, 20, 18, 4),
		Block.createCuboidShape(11, -13, 3, 12, -1, 13),
		Block.createCuboidShape(20, 6, 2, 26, 7, 4),
		Block.createCuboidShape(20, 17, 2, 26, 18, 4),
		Block.createCuboidShape(22, -4, 12, 26, -1, 13),
		Block.createCuboidShape(20, 0, 1, 26, 18, 2),
		Block.createCuboidShape(4, -13, 12, 11, -1, 13),
		Block.createCuboidShape(4, -13, 3, 11, -1, 4),
		Block.createCuboidShape(22, -4, 3, 26, -1, 4),
		Block.createCuboidShape(-9, -9, 12, 3, 18, 13),
		Block.createCuboidShape(-9, -13, 1, 3, 18, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 20, -11, 14, 27, -10),
		Block.createCuboidShape(1, 20, 27, 14, 27, 28),
		Block.createCuboidShape(-1, 20, 1, 0, 24, 22),
		Block.createCuboidShape(-3, -8, -10, -2, 14, -5),
		Block.createCuboidShape(12, 12, 4, 15, 14, 26),
		Block.createCuboidShape(-3, -16, -11, 0, 25, -10),
		Block.createCuboidShape(0, -14, 21, 15, -13, 28),
		Block.createCuboidShape(3, -14, -10, 15, -13, 12),
		Block.createCuboidShape(3, -4, 12, 12, -3, 26),
		Block.createCuboidShape(-1, 19, -11, 16, 20, 28),
		Block.createCuboidShape(15, -16, -11, 16, 25, -10),
		Block.createCuboidShape(15, -16, 27, 16, 25, 28),
		Block.createCuboidShape(-3, -16, -5, -2, 18, -4),
		Block.createCuboidShape(-1, -16, 27, 0, 25, 28),
		Block.createCuboidShape(0, 8, -11, 15, 9, -10),
		Block.createCuboidShape(0, 8, 27, 15, 9, 28),
		Block.createCuboidShape(0, -14, -11, 15, -13, -10),
		Block.createCuboidShape(-1, 24, 2, 0, 25, 27),
		Block.createCuboidShape(4, -9, -9, 14, -8, 3),
		Block.createCuboidShape(3, -1, 4, 15, 0, 27),
		Block.createCuboidShape(4, 17, -9, 14, 18, 3),
		Block.createCuboidShape(3, -13, -10, 15, 18, -9),
		Block.createCuboidShape(3, -13, 3, 15, 18, 4),
		Block.createCuboidShape(3, -13, 26, 14, -1, 27),
		Block.createCuboidShape(3, -13, 21, 13, -1, 22),
		Block.createCuboidShape(12, 0, 26, 15, 18, 27),
		Block.createCuboidShape(12, 0, 19, 15, 18, 20),
		Block.createCuboidShape(3, -13, 11, 13, -1, 12),
		Block.createCuboidShape(12, 6, 20, 14, 7, 26),
		Block.createCuboidShape(12, 17, 20, 14, 18, 26),
		Block.createCuboidShape(3, -4, 22, 4, -1, 26),
		Block.createCuboidShape(14, 0, 20, 15, 18, 26),
		Block.createCuboidShape(3, -13, 4, 4, -1, 11),
		Block.createCuboidShape(12, -13, 4, 13, -1, 11),
		Block.createCuboidShape(12, -4, 22, 13, -1, 26),
		Block.createCuboidShape(3, -9, -9, 4, 18, 3),
		Block.createCuboidShape(14, -13, -9, 15, 18, 3)
    );

    public Bbed2l_Data() {
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

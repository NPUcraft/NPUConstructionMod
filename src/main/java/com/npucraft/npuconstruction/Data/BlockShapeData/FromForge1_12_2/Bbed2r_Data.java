package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bbed2r_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 20, 1, -10, 27, 14),
		Block.createCuboidShape(27, 20, 1, 28, 27, 14),
		Block.createCuboidShape(1, 20, -1, 22, 24, 0),
		Block.createCuboidShape(-10, -8, -3, -5, 14, -2),
		Block.createCuboidShape(4, 12, 12, 26, 14, 15),
		Block.createCuboidShape(-11, -16, -3, -10, 25, 0),
		Block.createCuboidShape(21, -14, 0, 28, -13, 15),
		Block.createCuboidShape(-10, -14, 3, 12, -13, 15),
		Block.createCuboidShape(12, -4, 3, 26, -3, 12),
		Block.createCuboidShape(-11, 19, -1, 28, 20, 16),
		Block.createCuboidShape(-11, -16, 15, -10, 25, 16),
		Block.createCuboidShape(27, -16, 15, 28, 25, 16),
		Block.createCuboidShape(-5, -16, -3, -4, 18, -2),
		Block.createCuboidShape(27, -16, -1, 28, 25, 0),
		Block.createCuboidShape(-11, 8, 0, -10, 9, 15),
		Block.createCuboidShape(27, 8, 0, 28, 9, 15),
		Block.createCuboidShape(-11, -14, 0, -10, -13, 15),
		Block.createCuboidShape(2, 24, -1, 27, 25, 0),
		Block.createCuboidShape(-9, -9, 4, 3, -8, 14),
		Block.createCuboidShape(4, -1, 3, 27, 0, 15),
		Block.createCuboidShape(-9, 17, 4, 3, 18, 14),
		Block.createCuboidShape(-10, -13, 3, -9, 18, 15),
		Block.createCuboidShape(3, -13, 3, 4, 18, 15),
		Block.createCuboidShape(26, -13, 3, 27, -1, 14),
		Block.createCuboidShape(21, -13, 3, 22, -1, 13),
		Block.createCuboidShape(26, 0, 12, 27, 18, 15),
		Block.createCuboidShape(19, 0, 12, 20, 18, 15),
		Block.createCuboidShape(11, -13, 3, 12, -1, 13),
		Block.createCuboidShape(20, 6, 12, 26, 7, 14),
		Block.createCuboidShape(20, 17, 12, 26, 18, 14),
		Block.createCuboidShape(22, -4, 3, 26, -1, 4),
		Block.createCuboidShape(20, 0, 14, 26, 18, 15),
		Block.createCuboidShape(4, -13, 3, 11, -1, 4),
		Block.createCuboidShape(4, -13, 12, 11, -1, 13),
		Block.createCuboidShape(22, -4, 12, 26, -1, 13),
		Block.createCuboidShape(-9, -9, 3, 3, 18, 4),
		Block.createCuboidShape(-9, -13, 14, 3, 18, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, 20, -11, 15, 27, -10),
		Block.createCuboidShape(2, 20, 27, 15, 27, 28),
		Block.createCuboidShape(16, 20, 1, 17, 24, 22),
		Block.createCuboidShape(18, -8, -10, 19, 14, -5),
		Block.createCuboidShape(1, 12, 4, 4, 14, 26),
		Block.createCuboidShape(16, -16, -11, 19, 25, -10),
		Block.createCuboidShape(1, -14, 21, 16, -13, 28),
		Block.createCuboidShape(1, -14, -10, 13, -13, 12),
		Block.createCuboidShape(4, -4, 12, 13, -3, 26),
		Block.createCuboidShape(0, 19, -11, 17, 20, 28),
		Block.createCuboidShape(0, -16, -11, 1, 25, -10),
		Block.createCuboidShape(0, -16, 27, 1, 25, 28),
		Block.createCuboidShape(18, -16, -5, 19, 18, -4),
		Block.createCuboidShape(16, -16, 27, 17, 25, 28),
		Block.createCuboidShape(1, 8, -11, 16, 9, -10),
		Block.createCuboidShape(1, 8, 27, 16, 9, 28),
		Block.createCuboidShape(1, -14, -11, 16, -13, -10),
		Block.createCuboidShape(16, 24, 2, 17, 25, 27),
		Block.createCuboidShape(2, -9, -9, 12, -8, 3),
		Block.createCuboidShape(1, -1, 4, 13, 0, 27),
		Block.createCuboidShape(2, 17, -9, 12, 18, 3),
		Block.createCuboidShape(1, -13, -10, 13, 18, -9),
		Block.createCuboidShape(1, -13, 3, 13, 18, 4),
		Block.createCuboidShape(2, -13, 26, 13, -1, 27),
		Block.createCuboidShape(3, -13, 21, 13, -1, 22),
		Block.createCuboidShape(1, 0, 26, 4, 18, 27),
		Block.createCuboidShape(1, 0, 19, 4, 18, 20),
		Block.createCuboidShape(3, -13, 11, 13, -1, 12),
		Block.createCuboidShape(2, 6, 20, 4, 7, 26),
		Block.createCuboidShape(2, 17, 20, 4, 18, 26),
		Block.createCuboidShape(12, -4, 22, 13, -1, 26),
		Block.createCuboidShape(1, 0, 20, 2, 18, 26),
		Block.createCuboidShape(12, -13, 4, 13, -1, 11),
		Block.createCuboidShape(3, -13, 4, 4, -1, 11),
		Block.createCuboidShape(3, -4, 22, 4, -1, 26),
		Block.createCuboidShape(12, -9, -9, 13, 18, 3),
		Block.createCuboidShape(1, -13, -9, 2, 18, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(26, 20, 2, 27, 27, 15),
		Block.createCuboidShape(-12, 20, 2, -11, 27, 15),
		Block.createCuboidShape(-6, 20, 16, 15, 24, 17),
		Block.createCuboidShape(21, -8, 18, 26, 14, 19),
		Block.createCuboidShape(-10, 12, 1, 12, 14, 4),
		Block.createCuboidShape(26, -16, 16, 27, 25, 19),
		Block.createCuboidShape(-12, -14, 1, -5, -13, 16),
		Block.createCuboidShape(4, -14, 1, 26, -13, 13),
		Block.createCuboidShape(-10, -4, 4, 4, -3, 13),
		Block.createCuboidShape(-12, 19, 0, 27, 20, 17),
		Block.createCuboidShape(26, -16, 0, 27, 25, 1),
		Block.createCuboidShape(-12, -16, 0, -11, 25, 1),
		Block.createCuboidShape(20, -16, 18, 21, 18, 19),
		Block.createCuboidShape(-12, -16, 16, -11, 25, 17),
		Block.createCuboidShape(26, 8, 1, 27, 9, 16),
		Block.createCuboidShape(-12, 8, 1, -11, 9, 16),
		Block.createCuboidShape(26, -14, 1, 27, -13, 16),
		Block.createCuboidShape(-11, 24, 16, 14, 25, 17),
		Block.createCuboidShape(13, -9, 2, 25, -8, 12),
		Block.createCuboidShape(-11, -1, 1, 12, 0, 13),
		Block.createCuboidShape(13, 17, 2, 25, 18, 12),
		Block.createCuboidShape(25, -13, 1, 26, 18, 13),
		Block.createCuboidShape(12, -13, 1, 13, 18, 13),
		Block.createCuboidShape(-11, -13, 2, -10, -1, 13),
		Block.createCuboidShape(-6, -13, 3, -5, -1, 13),
		Block.createCuboidShape(-11, 0, 1, -10, 18, 4),
		Block.createCuboidShape(-4, 0, 1, -3, 18, 4),
		Block.createCuboidShape(4, -13, 3, 5, -1, 13),
		Block.createCuboidShape(-10, 6, 2, -4, 7, 4),
		Block.createCuboidShape(-10, 17, 2, -4, 18, 4),
		Block.createCuboidShape(-10, -4, 12, -6, -1, 13),
		Block.createCuboidShape(-10, 0, 1, -4, 18, 2),
		Block.createCuboidShape(5, -13, 12, 12, -1, 13),
		Block.createCuboidShape(5, -13, 3, 12, -1, 4),
		Block.createCuboidShape(-10, -4, 3, -6, -1, 4),
		Block.createCuboidShape(13, -9, 12, 25, 18, 13),
		Block.createCuboidShape(13, -13, 1, 25, 18, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 20, 26, 14, 27, 27),
		Block.createCuboidShape(1, 20, -12, 14, 27, -11),
		Block.createCuboidShape(-1, 20, -6, 0, 24, 15),
		Block.createCuboidShape(-3, -8, 21, -2, 14, 26),
		Block.createCuboidShape(12, 12, -10, 15, 14, 12),
		Block.createCuboidShape(-3, -16, 26, 0, 25, 27),
		Block.createCuboidShape(0, -14, -12, 15, -13, -5),
		Block.createCuboidShape(3, -14, 4, 15, -13, 26),
		Block.createCuboidShape(3, -4, -10, 12, -3, 4),
		Block.createCuboidShape(-1, 19, -12, 16, 20, 27),
		Block.createCuboidShape(15, -16, 26, 16, 25, 27),
		Block.createCuboidShape(15, -16, -12, 16, 25, -11),
		Block.createCuboidShape(-3, -16, 20, -2, 18, 21),
		Block.createCuboidShape(-1, -16, -12, 0, 25, -11),
		Block.createCuboidShape(0, 8, 26, 15, 9, 27),
		Block.createCuboidShape(0, 8, -12, 15, 9, -11),
		Block.createCuboidShape(0, -14, 26, 15, -13, 27),
		Block.createCuboidShape(-1, 24, -11, 0, 25, 14),
		Block.createCuboidShape(4, -9, 13, 14, -8, 25),
		Block.createCuboidShape(3, -1, -11, 15, 0, 12),
		Block.createCuboidShape(4, 17, 13, 14, 18, 25),
		Block.createCuboidShape(3, -13, 25, 15, 18, 26),
		Block.createCuboidShape(3, -13, 12, 15, 18, 13),
		Block.createCuboidShape(3, -13, -11, 14, -1, -10),
		Block.createCuboidShape(3, -13, -6, 13, -1, -5),
		Block.createCuboidShape(12, 0, -11, 15, 18, -10),
		Block.createCuboidShape(12, 0, -4, 15, 18, -3),
		Block.createCuboidShape(3, -13, 4, 13, -1, 5),
		Block.createCuboidShape(12, 6, -10, 14, 7, -4),
		Block.createCuboidShape(12, 17, -10, 14, 18, -4),
		Block.createCuboidShape(3, -4, -10, 4, -1, -6),
		Block.createCuboidShape(14, 0, -10, 15, 18, -4),
		Block.createCuboidShape(3, -13, 5, 4, -1, 12),
		Block.createCuboidShape(12, -13, 5, 13, -1, 12),
		Block.createCuboidShape(12, -4, -10, 13, -1, -6),
		Block.createCuboidShape(3, -9, 13, 4, 18, 25),
		Block.createCuboidShape(14, -13, 13, 15, 18, 25)
    );

    public Bbed2r_Data() {
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

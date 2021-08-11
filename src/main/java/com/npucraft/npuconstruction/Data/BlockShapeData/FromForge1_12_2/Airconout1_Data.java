package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Airconout1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 27, 4, 16, 28, 28),
		Block.createCuboidShape(3, 3, 4, 16, 19, 5),
		Block.createCuboidShape(3, 21, 13, 13, 26, 19),
		Block.createCuboidShape(2, 21, 9, 14, 26, 10),
		Block.createCuboidShape(3, 3, 27, 16, 11, 28),
		Block.createCuboidShape(-3, 3, 8, -2, 11, 21),
		Block.createCuboidShape(18, 3, 8, 19, 11, 21),
		Block.createCuboidShape(3, 12, 27, 16, 19, 28),
		Block.createCuboidShape(-3, 12, 8, -2, 19, 21),
		Block.createCuboidShape(18, 12, 8, 19, 19, 21),
		Block.createCuboidShape(4, 21, 18, 12, 25, 22),
		Block.createCuboidShape(10, 21, 10, 12, 25, 22),
		Block.createCuboidShape(2, 21, 22, 14, 26, 24),
		Block.createCuboidShape(-1, 21, 27, 17, 27, 28),
		Block.createCuboidShape(18, 21, 4, 19, 28, 28),
		Block.createCuboidShape(-3, 21, 4, -2, 28, 28),
		Block.createCuboidShape(-1, 21, 4, 17, 27, 5),
		Block.createCuboidShape(-3, -14, 4, 19, 3, 28),
		Block.createCuboidShape(-3, 19, 4, 19, 21, 28),
		Block.createCuboidShape(-2, -16, 4, 0, -14, 28),
		Block.createCuboidShape(16, -16, 4, 18, -14, 28),
		Block.createCuboidShape(16, 3, 4, 19, 19, 5),
		Block.createCuboidShape(-2, 4, 5, 18, 19, 27),
		Block.createCuboidShape(-3, 3, 4, 3, 19, 5),
		Block.createCuboidShape(-3, 3, 27, 3, 19, 28),
		Block.createCuboidShape(16, 3, 27, 19, 19, 28),
		Block.createCuboidShape(-3, 3, 21, -2, 19, 27),
		Block.createCuboidShape(-3, 3, 5, -2, 19, 8),
		Block.createCuboidShape(18, 3, 21, 19, 19, 27),
		Block.createCuboidShape(18, 3, 5, 19, 19, 8),
		Block.createCuboidShape(1, 21, 14, 2, 26, 18),
		Block.createCuboidShape(4, 21, 10, 6, 25, 14),
		Block.createCuboidShape(14, 21, 14, 15, 26, 18),
		Block.createCuboidShape(17, 24, 4, 17, 25, 28),
		Block.createCuboidShape(-1, 24, 4, -1, 25, 28)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-12, 27, 0, 12, 28, 16),
		Block.createCuboidShape(11, 3, 3, 12, 19, 16),
		Block.createCuboidShape(-3, 21, 3, 3, 26, 13),
		Block.createCuboidShape(6, 21, 2, 7, 26, 14),
		Block.createCuboidShape(-12, 3, 3, -11, 11, 16),
		Block.createCuboidShape(-5, 3, -3, 8, 11, -2),
		Block.createCuboidShape(-5, 3, 18, 8, 11, 19),
		Block.createCuboidShape(-12, 12, 3, -11, 19, 16),
		Block.createCuboidShape(-5, 12, -3, 8, 19, -2),
		Block.createCuboidShape(-5, 12, 18, 8, 19, 19),
		Block.createCuboidShape(-6, 21, 4, -2, 25, 12),
		Block.createCuboidShape(-6, 21, 10, 6, 25, 12),
		Block.createCuboidShape(-8, 21, 2, -6, 26, 14),
		Block.createCuboidShape(-12, 21, -1, -11, 27, 17),
		Block.createCuboidShape(-12, 21, 18, 12, 28, 19),
		Block.createCuboidShape(-12, 21, -3, 12, 28, -2),
		Block.createCuboidShape(11, 21, -1, 12, 27, 17),
		Block.createCuboidShape(-12, -14, -3, 12, 3, 19),
		Block.createCuboidShape(-12, 19, -3, 12, 21, 19),
		Block.createCuboidShape(-12, -16, -2, 12, -14, 0),
		Block.createCuboidShape(-12, -16, 16, 12, -14, 18),
		Block.createCuboidShape(11, 3, 16, 12, 19, 19),
		Block.createCuboidShape(-11, 4, -2, 11, 19, 18),
		Block.createCuboidShape(11, 3, -3, 12, 19, 3),
		Block.createCuboidShape(-12, 3, -3, -11, 19, 3),
		Block.createCuboidShape(-12, 3, 16, -11, 19, 19),
		Block.createCuboidShape(-11, 3, -3, -5, 19, -2),
		Block.createCuboidShape(8, 3, -3, 11, 19, -2),
		Block.createCuboidShape(-11, 3, 18, -5, 19, 19),
		Block.createCuboidShape(8, 3, 18, 11, 19, 19),
		Block.createCuboidShape(-2, 21, 1, 2, 26, 2),
		Block.createCuboidShape(2, 21, 4, 6, 25, 6),
		Block.createCuboidShape(-2, 21, 14, 2, 26, 15),
		Block.createCuboidShape(-12, 24, 17, 12, 25, 17),
		Block.createCuboidShape(-12, 24, -1, 12, 25, -1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 27, -12, 16, 28, 12),
		Block.createCuboidShape(0, 3, 11, 13, 19, 12),
		Block.createCuboidShape(3, 21, -3, 13, 26, 3),
		Block.createCuboidShape(2, 21, 6, 14, 26, 7),
		Block.createCuboidShape(0, 3, -12, 13, 11, -11),
		Block.createCuboidShape(18, 3, -5, 19, 11, 8),
		Block.createCuboidShape(-3, 3, -5, -2, 11, 8),
		Block.createCuboidShape(0, 12, -12, 13, 19, -11),
		Block.createCuboidShape(18, 12, -5, 19, 19, 8),
		Block.createCuboidShape(-3, 12, -5, -2, 19, 8),
		Block.createCuboidShape(4, 21, -6, 12, 25, -2),
		Block.createCuboidShape(4, 21, -6, 6, 25, 6),
		Block.createCuboidShape(2, 21, -8, 14, 26, -6),
		Block.createCuboidShape(-1, 21, -12, 17, 27, -11),
		Block.createCuboidShape(-3, 21, -12, -2, 28, 12),
		Block.createCuboidShape(18, 21, -12, 19, 28, 12),
		Block.createCuboidShape(-1, 21, 11, 17, 27, 12),
		Block.createCuboidShape(-3, -14, -12, 19, 3, 12),
		Block.createCuboidShape(-3, 19, -12, 19, 21, 12),
		Block.createCuboidShape(16, -16, -12, 18, -14, 12),
		Block.createCuboidShape(-2, -16, -12, 0, -14, 12),
		Block.createCuboidShape(-3, 3, 11, 0, 19, 12),
		Block.createCuboidShape(-2, 4, -11, 18, 19, 11),
		Block.createCuboidShape(13, 3, 11, 19, 19, 12),
		Block.createCuboidShape(13, 3, -12, 19, 19, -11),
		Block.createCuboidShape(-3, 3, -12, 0, 19, -11),
		Block.createCuboidShape(18, 3, -11, 19, 19, -5),
		Block.createCuboidShape(18, 3, 8, 19, 19, 11),
		Block.createCuboidShape(-3, 3, -11, -2, 19, -5),
		Block.createCuboidShape(-3, 3, 8, -2, 19, 11),
		Block.createCuboidShape(14, 21, -2, 15, 26, 2),
		Block.createCuboidShape(10, 21, 2, 12, 25, 6),
		Block.createCuboidShape(1, 21, -2, 2, 26, 2),
		Block.createCuboidShape(-1, 24, -12, -1, 25, 12),
		Block.createCuboidShape(17, 24, -12, 17, 25, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 27, 0, 28, 28, 16),
		Block.createCuboidShape(4, 3, 0, 5, 19, 13),
		Block.createCuboidShape(13, 21, 3, 19, 26, 13),
		Block.createCuboidShape(9, 21, 2, 10, 26, 14),
		Block.createCuboidShape(27, 3, 0, 28, 11, 13),
		Block.createCuboidShape(8, 3, 18, 21, 11, 19),
		Block.createCuboidShape(8, 3, -3, 21, 11, -2),
		Block.createCuboidShape(27, 12, 0, 28, 19, 13),
		Block.createCuboidShape(8, 12, 18, 21, 19, 19),
		Block.createCuboidShape(8, 12, -3, 21, 19, -2),
		Block.createCuboidShape(18, 21, 4, 22, 25, 12),
		Block.createCuboidShape(10, 21, 4, 22, 25, 6),
		Block.createCuboidShape(22, 21, 2, 24, 26, 14),
		Block.createCuboidShape(27, 21, -1, 28, 27, 17),
		Block.createCuboidShape(4, 21, -3, 28, 28, -2),
		Block.createCuboidShape(4, 21, 18, 28, 28, 19),
		Block.createCuboidShape(4, 21, -1, 5, 27, 17),
		Block.createCuboidShape(4, -14, -3, 28, 3, 19),
		Block.createCuboidShape(4, 19, -3, 28, 21, 19),
		Block.createCuboidShape(4, -16, 16, 28, -14, 18),
		Block.createCuboidShape(4, -16, -2, 28, -14, 0),
		Block.createCuboidShape(4, 3, -3, 5, 19, 0),
		Block.createCuboidShape(5, 4, -2, 27, 19, 18),
		Block.createCuboidShape(4, 3, 13, 5, 19, 19),
		Block.createCuboidShape(27, 3, 13, 28, 19, 19),
		Block.createCuboidShape(27, 3, -3, 28, 19, 0),
		Block.createCuboidShape(21, 3, 18, 27, 19, 19),
		Block.createCuboidShape(5, 3, 18, 8, 19, 19),
		Block.createCuboidShape(21, 3, -3, 27, 19, -2),
		Block.createCuboidShape(5, 3, -3, 8, 19, -2),
		Block.createCuboidShape(14, 21, 14, 18, 26, 15),
		Block.createCuboidShape(10, 21, 10, 14, 25, 12),
		Block.createCuboidShape(14, 21, 1, 18, 26, 2),
		Block.createCuboidShape(4, 24, -1, 28, 25, -1),
		Block.createCuboidShape(4, 24, 17, 28, 25, 17)
    );

    public Airconout1_Data() {
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

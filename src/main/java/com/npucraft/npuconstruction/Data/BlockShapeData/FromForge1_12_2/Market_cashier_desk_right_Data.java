package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Market_cashier_desk_right_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, 22, 7, 16, 26, 13),
		Block.createCuboidShape(-10, 17, 19, 0, 20, 28),
		Block.createCuboidShape(-10, 8, 19, 0, 14, 28),
		Block.createCuboidShape(1, 15, 0, 2, 18, 29),
		Block.createCuboidShape(14, 24, 8, 16, 27, 13),
		Block.createCuboidShape(-10, 22, 18, -6, 29, 25),
		Block.createCuboidShape(-13, 22, 22, -9, 26, 27),
		Block.createCuboidShape(-4, 20, 22, -1, 22, 26),
		Block.createCuboidShape(11, 16, 10, 16, 23, 13),
		Block.createCuboidShape(10, 24, 13, 16, 26, 14),
		Block.createCuboidShape(5, 25, 8, 10, 26, 13),
		Block.createCuboidShape(15, 16, 13, 16, 23, 20),
		Block.createCuboidShape(13, 22, 13, 15, 23, 20),
		Block.createCuboidShape(18, 16, 13, 19, 20, 19),
		Block.createCuboidShape(11, 16, 19, 15, 22, 20),
		Block.createCuboidShape(-11, 0, 28, 1, 18, 29),
		Block.createCuboidShape(0, 0, 19, 1, 18, 28),
		Block.createCuboidShape(-10, 0, 19, 0, 1, 28),
		Block.createCuboidShape(-11, 0, 19, -10, 18, 28),
		Block.createCuboidShape(2, 0, 8, 16, 16, 29),
		Block.createCuboidShape(2, 0, 0, 16, 13, 8),
		Block.createCuboidShape(15, 13, 0, 16, 16, 8),
		Block.createCuboidShape(2, 13, 0, 3, 16, 8),
		Block.createCuboidShape(3, 13, 0, 15, 16, 1),
		Block.createCuboidShape(3, 17, 5, 15, 18, 10),
		Block.createCuboidShape(1, 15, 29, 17, 18, 30),
		Block.createCuboidShape(1, 15, -1, 17, 18, 0),
		Block.createCuboidShape(16, 15, 0, 17, 18, 29)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 22, 10, 9, 26, 16),
		Block.createCuboidShape(-12, 17, -10, -3, 20, 0),
		Block.createCuboidShape(-12, 8, -10, -3, 14, 0),
		Block.createCuboidShape(-13, 15, 1, 16, 18, 2),
		Block.createCuboidShape(3, 24, 14, 8, 27, 16),
		Block.createCuboidShape(-9, 22, -10, -2, 29, -6),
		Block.createCuboidShape(-11, 22, -13, -6, 26, -9),
		Block.createCuboidShape(-10, 20, -4, -6, 22, -1),
		Block.createCuboidShape(3, 16, 11, 6, 23, 16),
		Block.createCuboidShape(2, 24, 10, 3, 26, 16),
		Block.createCuboidShape(3, 25, 5, 8, 26, 10),
		Block.createCuboidShape(-4, 16, 15, 3, 23, 16),
		Block.createCuboidShape(-4, 22, 13, 3, 23, 15),
		Block.createCuboidShape(-3, 16, 18, 3, 20, 19),
		Block.createCuboidShape(-4, 16, 11, -3, 22, 15),
		Block.createCuboidShape(-13, 0, -11, -12, 18, 1),
		Block.createCuboidShape(-12, 0, 0, -3, 18, 1),
		Block.createCuboidShape(-12, 0, -10, -3, 1, 0),
		Block.createCuboidShape(-12, 0, -11, -3, 18, -10),
		Block.createCuboidShape(-13, 0, 2, 8, 16, 16),
		Block.createCuboidShape(8, 0, 2, 16, 13, 16),
		Block.createCuboidShape(8, 13, 15, 16, 16, 16),
		Block.createCuboidShape(8, 13, 2, 16, 16, 3),
		Block.createCuboidShape(15, 13, 3, 16, 16, 15),
		Block.createCuboidShape(6, 17, 3, 11, 18, 15),
		Block.createCuboidShape(-14, 15, 1, -13, 18, 17),
		Block.createCuboidShape(16, 15, 1, 17, 18, 17),
		Block.createCuboidShape(-13, 15, 16, 16, 18, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 22, 3, 6, 26, 9),
		Block.createCuboidShape(16, 17, -12, 26, 20, -3),
		Block.createCuboidShape(16, 8, -12, 26, 14, -3),
		Block.createCuboidShape(14, 15, -13, 15, 18, 16),
		Block.createCuboidShape(0, 24, 3, 2, 27, 8),
		Block.createCuboidShape(22, 22, -9, 26, 29, -2),
		Block.createCuboidShape(25, 22, -11, 29, 26, -6),
		Block.createCuboidShape(17, 20, -10, 20, 22, -6),
		Block.createCuboidShape(0, 16, 3, 5, 23, 6),
		Block.createCuboidShape(0, 24, 2, 6, 26, 3),
		Block.createCuboidShape(6, 25, 3, 11, 26, 8),
		Block.createCuboidShape(0, 16, -4, 1, 23, 3),
		Block.createCuboidShape(1, 22, -4, 3, 23, 3),
		Block.createCuboidShape(-3, 16, -3, -2, 20, 3),
		Block.createCuboidShape(1, 16, -4, 5, 22, -3),
		Block.createCuboidShape(15, 0, -13, 27, 18, -12),
		Block.createCuboidShape(15, 0, -12, 16, 18, -3),
		Block.createCuboidShape(16, 0, -12, 26, 1, -3),
		Block.createCuboidShape(26, 0, -12, 27, 18, -3),
		Block.createCuboidShape(0, 0, -13, 14, 16, 8),
		Block.createCuboidShape(0, 0, 8, 14, 13, 16),
		Block.createCuboidShape(0, 13, 8, 1, 16, 16),
		Block.createCuboidShape(13, 13, 8, 14, 16, 16),
		Block.createCuboidShape(1, 13, 15, 13, 16, 16),
		Block.createCuboidShape(1, 17, 6, 13, 18, 11),
		Block.createCuboidShape(-1, 15, -14, 15, 18, -13),
		Block.createCuboidShape(-1, 15, 16, 15, 18, 17),
		Block.createCuboidShape(-1, 15, -13, 0, 18, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 22, 0, 13, 26, 6),
		Block.createCuboidShape(19, 17, 16, 28, 20, 26),
		Block.createCuboidShape(19, 8, 16, 28, 14, 26),
		Block.createCuboidShape(0, 15, 14, 29, 18, 15),
		Block.createCuboidShape(8, 24, 0, 13, 27, 2),
		Block.createCuboidShape(18, 22, 22, 25, 29, 26),
		Block.createCuboidShape(22, 22, 25, 27, 26, 29),
		Block.createCuboidShape(22, 20, 17, 26, 22, 20),
		Block.createCuboidShape(10, 16, 0, 13, 23, 5),
		Block.createCuboidShape(13, 24, 0, 14, 26, 6),
		Block.createCuboidShape(8, 25, 6, 13, 26, 11),
		Block.createCuboidShape(13, 16, 0, 20, 23, 1),
		Block.createCuboidShape(13, 22, 1, 20, 23, 3),
		Block.createCuboidShape(13, 16, -3, 19, 20, -2),
		Block.createCuboidShape(19, 16, 1, 20, 22, 5),
		Block.createCuboidShape(28, 0, 15, 29, 18, 27),
		Block.createCuboidShape(19, 0, 15, 28, 18, 16),
		Block.createCuboidShape(19, 0, 16, 28, 1, 26),
		Block.createCuboidShape(19, 0, 26, 28, 18, 27),
		Block.createCuboidShape(8, 0, 0, 29, 16, 14),
		Block.createCuboidShape(0, 0, 0, 8, 13, 14),
		Block.createCuboidShape(0, 13, 0, 8, 16, 1),
		Block.createCuboidShape(0, 13, 13, 8, 16, 14),
		Block.createCuboidShape(0, 13, 1, 1, 16, 13),
		Block.createCuboidShape(5, 17, 1, 10, 18, 13),
		Block.createCuboidShape(29, 15, -1, 30, 18, 15),
		Block.createCuboidShape(-1, 15, -1, 0, 18, 15),
		Block.createCuboidShape(0, 15, -1, 29, 18, 0)
    );

    public Market_cashier_desk_right_Data() {
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

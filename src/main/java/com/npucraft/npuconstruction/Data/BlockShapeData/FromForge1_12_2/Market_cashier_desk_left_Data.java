package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Market_cashier_desk_left_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 22, 7, 6, 26, 13),
		Block.createCuboidShape(16, 17, 19, 26, 20, 28),
		Block.createCuboidShape(16, 8, 19, 26, 14, 28),
		Block.createCuboidShape(14, 15, 0, 15, 18, 29),
		Block.createCuboidShape(0, 24, 8, 2, 27, 13),
		Block.createCuboidShape(22, 22, 18, 26, 29, 25),
		Block.createCuboidShape(25, 22, 22, 29, 26, 27),
		Block.createCuboidShape(17, 20, 22, 20, 22, 26),
		Block.createCuboidShape(0, 16, 10, 5, 23, 13),
		Block.createCuboidShape(0, 24, 13, 6, 26, 14),
		Block.createCuboidShape(6, 25, 8, 11, 26, 13),
		Block.createCuboidShape(0, 16, 13, 1, 23, 20),
		Block.createCuboidShape(1, 22, 13, 3, 23, 20),
		Block.createCuboidShape(-3, 16, 13, -2, 20, 19),
		Block.createCuboidShape(1, 16, 19, 5, 22, 20),
		Block.createCuboidShape(15, 0, 28, 27, 18, 29),
		Block.createCuboidShape(15, 0, 19, 16, 18, 28),
		Block.createCuboidShape(16, 0, 19, 26, 1, 28),
		Block.createCuboidShape(26, 0, 19, 27, 18, 28),
		Block.createCuboidShape(0, 0, 8, 14, 16, 29),
		Block.createCuboidShape(0, 0, 0, 14, 13, 8),
		Block.createCuboidShape(0, 13, 0, 1, 16, 8),
		Block.createCuboidShape(13, 13, 0, 14, 16, 8),
		Block.createCuboidShape(1, 13, 0, 13, 16, 1),
		Block.createCuboidShape(1, 17, 5, 13, 18, 10),
		Block.createCuboidShape(-1, 15, 29, 15, 18, 30),
		Block.createCuboidShape(-1, 15, -1, 15, 18, 0),
		Block.createCuboidShape(-1, 15, 0, 0, 18, 29)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 22, 0, 9, 26, 6),
		Block.createCuboidShape(-12, 17, 16, -3, 20, 26),
		Block.createCuboidShape(-12, 8, 16, -3, 14, 26),
		Block.createCuboidShape(-13, 15, 14, 16, 18, 15),
		Block.createCuboidShape(3, 24, 0, 8, 27, 2),
		Block.createCuboidShape(-9, 22, 22, -2, 29, 26),
		Block.createCuboidShape(-11, 22, 25, -6, 26, 29),
		Block.createCuboidShape(-10, 20, 17, -6, 22, 20),
		Block.createCuboidShape(3, 16, 0, 6, 23, 5),
		Block.createCuboidShape(2, 24, 0, 3, 26, 6),
		Block.createCuboidShape(3, 25, 6, 8, 26, 11),
		Block.createCuboidShape(-4, 16, 0, 3, 23, 1),
		Block.createCuboidShape(-4, 22, 1, 3, 23, 3),
		Block.createCuboidShape(-3, 16, -3, 3, 20, -2),
		Block.createCuboidShape(-4, 16, 1, -3, 22, 5),
		Block.createCuboidShape(-13, 0, 15, -12, 18, 27),
		Block.createCuboidShape(-12, 0, 15, -3, 18, 16),
		Block.createCuboidShape(-12, 0, 16, -3, 1, 26),
		Block.createCuboidShape(-12, 0, 26, -3, 18, 27),
		Block.createCuboidShape(-13, 0, 0, 8, 16, 14),
		Block.createCuboidShape(8, 0, 0, 16, 13, 14),
		Block.createCuboidShape(8, 13, 0, 16, 16, 1),
		Block.createCuboidShape(8, 13, 13, 16, 16, 14),
		Block.createCuboidShape(15, 13, 1, 16, 16, 13),
		Block.createCuboidShape(6, 17, 1, 11, 18, 13),
		Block.createCuboidShape(-14, 15, -1, -13, 18, 15),
		Block.createCuboidShape(16, 15, -1, 17, 18, 15),
		Block.createCuboidShape(-13, 15, -1, 16, 18, 0)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(10, 22, 3, 16, 26, 9),
		Block.createCuboidShape(-10, 17, -12, 0, 20, -3),
		Block.createCuboidShape(-10, 8, -12, 0, 14, -3),
		Block.createCuboidShape(1, 15, -13, 2, 18, 16),
		Block.createCuboidShape(14, 24, 3, 16, 27, 8),
		Block.createCuboidShape(-10, 22, -9, -6, 29, -2),
		Block.createCuboidShape(-13, 22, -11, -9, 26, -6),
		Block.createCuboidShape(-4, 20, -10, -1, 22, -6),
		Block.createCuboidShape(11, 16, 3, 16, 23, 6),
		Block.createCuboidShape(10, 24, 2, 16, 26, 3),
		Block.createCuboidShape(5, 25, 3, 10, 26, 8),
		Block.createCuboidShape(15, 16, -4, 16, 23, 3),
		Block.createCuboidShape(13, 22, -4, 15, 23, 3),
		Block.createCuboidShape(18, 16, -3, 19, 20, 3),
		Block.createCuboidShape(11, 16, -4, 15, 22, -3),
		Block.createCuboidShape(-11, 0, -13, 1, 18, -12),
		Block.createCuboidShape(0, 0, -12, 1, 18, -3),
		Block.createCuboidShape(-10, 0, -12, 0, 1, -3),
		Block.createCuboidShape(-11, 0, -12, -10, 18, -3),
		Block.createCuboidShape(2, 0, -13, 16, 16, 8),
		Block.createCuboidShape(2, 0, 8, 16, 13, 16),
		Block.createCuboidShape(15, 13, 8, 16, 16, 16),
		Block.createCuboidShape(2, 13, 8, 3, 16, 16),
		Block.createCuboidShape(3, 13, 15, 15, 16, 16),
		Block.createCuboidShape(3, 17, 6, 15, 18, 11),
		Block.createCuboidShape(1, 15, -14, 17, 18, -13),
		Block.createCuboidShape(1, 15, 16, 17, 18, 17),
		Block.createCuboidShape(16, 15, -13, 17, 18, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 22, 10, 13, 26, 16),
		Block.createCuboidShape(19, 17, -10, 28, 20, 0),
		Block.createCuboidShape(19, 8, -10, 28, 14, 0),
		Block.createCuboidShape(0, 15, 1, 29, 18, 2),
		Block.createCuboidShape(8, 24, 14, 13, 27, 16),
		Block.createCuboidShape(18, 22, -10, 25, 29, -6),
		Block.createCuboidShape(22, 22, -13, 27, 26, -9),
		Block.createCuboidShape(22, 20, -4, 26, 22, -1),
		Block.createCuboidShape(10, 16, 11, 13, 23, 16),
		Block.createCuboidShape(13, 24, 10, 14, 26, 16),
		Block.createCuboidShape(8, 25, 5, 13, 26, 10),
		Block.createCuboidShape(13, 16, 15, 20, 23, 16),
		Block.createCuboidShape(13, 22, 13, 20, 23, 15),
		Block.createCuboidShape(13, 16, 18, 19, 20, 19),
		Block.createCuboidShape(19, 16, 11, 20, 22, 15),
		Block.createCuboidShape(28, 0, -11, 29, 18, 1),
		Block.createCuboidShape(19, 0, 0, 28, 18, 1),
		Block.createCuboidShape(19, 0, -10, 28, 1, 0),
		Block.createCuboidShape(19, 0, -11, 28, 18, -10),
		Block.createCuboidShape(8, 0, 2, 29, 16, 16),
		Block.createCuboidShape(0, 0, 2, 8, 13, 16),
		Block.createCuboidShape(0, 13, 15, 8, 16, 16),
		Block.createCuboidShape(0, 13, 2, 8, 16, 3),
		Block.createCuboidShape(0, 13, 3, 1, 16, 15),
		Block.createCuboidShape(5, 17, 3, 10, 18, 15),
		Block.createCuboidShape(29, 15, 1, 30, 18, 17),
		Block.createCuboidShape(-1, 15, 1, 0, 18, 17),
		Block.createCuboidShape(0, 15, 16, 29, 18, 17)
    );

    public Market_cashier_desk_left_Data() {
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

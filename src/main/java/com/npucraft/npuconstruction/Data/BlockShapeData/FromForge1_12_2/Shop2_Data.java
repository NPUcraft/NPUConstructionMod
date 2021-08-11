package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Shop2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(12, -4, -2, 15, 28, 12),
		Block.createCuboidShape(-7, -4, -2, -4, 28, 12),
		Block.createCuboidShape(6, -3, 0, 11, 6, 5),
		Block.createCuboidShape(9, -3, 0, 11, 6, 11),
		Block.createCuboidShape(3, -3, 6, 11, 6, 8),
		Block.createCuboidShape(-3, -3, 0, -1, 6, 11),
		Block.createCuboidShape(-7, -3, -6, 13, 28, -5),
		Block.createCuboidShape(2, -3, 0, 2, 25, 12),
		Block.createCuboidShape(5, -3, 0, 5, 25, 12),
		Block.createCuboidShape(9, -3, 0, 9, 25, 12),
		Block.createCuboidShape(-1, -3, 0, -1, 25, 12),
		Block.createCuboidShape(-7, -14, -6, -5, 28, -2),
		Block.createCuboidShape(0, 2, 0, 2, 6, 11),
		Block.createCuboidShape(3, -3, 3, 8, 6, 5),
		Block.createCuboidShape(3, -3, 9, 8, 6, 11),
		Block.createCuboidShape(-8, 30, -6, 16, 32, 2),
		Block.createCuboidShape(-7, 28, -6, 15, 29, 12),
		Block.createCuboidShape(3, -3, 0, 5, 6, 2),
		Block.createCuboidShape(-5, -5, -6, 13, -3, -2),
		Block.createCuboidShape(15, -15, -6, 16, 30, 16),
		Block.createCuboidShape(-8, -15, -6, -7, 30, 16),
		Block.createCuboidShape(13, -14, -6, 15, 29, -2),
		Block.createCuboidShape(-5, -10, -6, -3, -5, -2),
		Block.createCuboidShape(11, -10, -6, 13, -5, -2),
		Block.createCuboidShape(-5, -14, -6, 13, -10, -2),
		Block.createCuboidShape(-7, -14, 12, 15, 29, 16),
		Block.createCuboidShape(-7, 29, -6, 15, 30, 16),
		Block.createCuboidShape(-7, -15, -6, 15, -14, 16),
		Block.createCuboidShape(-4, -4, -1, 12, -3, 12),
		Block.createCuboidShape(-4, 1, -1, 12, 2, 12),
		Block.createCuboidShape(-4, 6, -1, 12, 7, 12),
		Block.createCuboidShape(-4, 12, -1, 12, 12, 12),
		Block.createCuboidShape(-4, 17, -1, 12, 17, 12),
		Block.createCuboidShape(-5, -14, -2, 13, -4, -2),
		Block.createCuboidShape(-4, 22, -1, 12, 22, 12),
		Block.createCuboidShape(-4, -14, -1, 12, -4, 0),
		Block.createCuboidShape(-3, -10, -6, 11, -5, -5)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, -4, 12, 18, 28, 15),
		Block.createCuboidShape(4, -4, -7, 18, 28, -4),
		Block.createCuboidShape(11, -3, 6, 16, 6, 11),
		Block.createCuboidShape(5, -3, 9, 16, 6, 11),
		Block.createCuboidShape(8, -3, 3, 10, 6, 11),
		Block.createCuboidShape(5, -3, -3, 16, 6, -1),
		Block.createCuboidShape(21, -3, -7, 22, 28, 13),
		Block.createCuboidShape(4, -3, 2, 16, 25, 2),
		Block.createCuboidShape(4, -3, 5, 16, 25, 5),
		Block.createCuboidShape(4, -3, 9, 16, 25, 9),
		Block.createCuboidShape(4, -3, -1, 16, 25, -1),
		Block.createCuboidShape(18, -14, -7, 22, 28, -5),
		Block.createCuboidShape(5, 2, 0, 16, 6, 2),
		Block.createCuboidShape(11, -3, 3, 13, 6, 8),
		Block.createCuboidShape(5, -3, 3, 7, 6, 8),
		Block.createCuboidShape(14, 30, -8, 22, 32, 16),
		Block.createCuboidShape(4, 28, -7, 22, 29, 15),
		Block.createCuboidShape(14, -3, 3, 16, 6, 5),
		Block.createCuboidShape(18, -5, -5, 22, -3, 13),
		Block.createCuboidShape(0, -15, 15, 22, 30, 16),
		Block.createCuboidShape(0, -15, -8, 22, 30, -7),
		Block.createCuboidShape(18, -14, 13, 22, 29, 15),
		Block.createCuboidShape(18, -10, -5, 22, -5, -3),
		Block.createCuboidShape(18, -10, 11, 22, -5, 13),
		Block.createCuboidShape(18, -14, -5, 22, -10, 13),
		Block.createCuboidShape(0, -14, -7, 4, 29, 15),
		Block.createCuboidShape(0, 29, -7, 22, 30, 15),
		Block.createCuboidShape(0, -15, -7, 22, -14, 15),
		Block.createCuboidShape(4, -4, -4, 17, -3, 12),
		Block.createCuboidShape(4, 1, -4, 17, 2, 12),
		Block.createCuboidShape(4, 6, -4, 17, 7, 12),
		Block.createCuboidShape(4, 12, -4, 17, 12, 12),
		Block.createCuboidShape(4, 17, -4, 17, 17, 12),
		Block.createCuboidShape(18, -14, -5, 18, -4, 13),
		Block.createCuboidShape(4, 22, -4, 17, 22, 12),
		Block.createCuboidShape(16, -14, -4, 17, -4, 12),
		Block.createCuboidShape(21, -10, -3, 22, -5, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -4, 4, 4, 28, 18),
		Block.createCuboidShape(20, -4, 4, 23, 28, 18),
		Block.createCuboidShape(5, -3, 11, 10, 6, 16),
		Block.createCuboidShape(5, -3, 5, 7, 6, 16),
		Block.createCuboidShape(5, -3, 8, 13, 6, 10),
		Block.createCuboidShape(17, -3, 5, 19, 6, 16),
		Block.createCuboidShape(3, -3, 21, 23, 28, 22),
		Block.createCuboidShape(14, -3, 4, 14, 25, 16),
		Block.createCuboidShape(11, -3, 4, 11, 25, 16),
		Block.createCuboidShape(7, -3, 4, 7, 25, 16),
		Block.createCuboidShape(17, -3, 4, 17, 25, 16),
		Block.createCuboidShape(21, -14, 18, 23, 28, 22),
		Block.createCuboidShape(14, 2, 5, 16, 6, 16),
		Block.createCuboidShape(8, -3, 11, 13, 6, 13),
		Block.createCuboidShape(8, -3, 5, 13, 6, 7),
		Block.createCuboidShape(0, 30, 14, 24, 32, 22),
		Block.createCuboidShape(1, 28, 4, 23, 29, 22),
		Block.createCuboidShape(11, -3, 14, 13, 6, 16),
		Block.createCuboidShape(3, -5, 18, 21, -3, 22),
		Block.createCuboidShape(0, -15, 0, 1, 30, 22),
		Block.createCuboidShape(23, -15, 0, 24, 30, 22),
		Block.createCuboidShape(1, -14, 18, 3, 29, 22),
		Block.createCuboidShape(19, -10, 18, 21, -5, 22),
		Block.createCuboidShape(3, -10, 18, 5, -5, 22),
		Block.createCuboidShape(3, -14, 18, 21, -10, 22),
		Block.createCuboidShape(1, -14, 0, 23, 29, 4),
		Block.createCuboidShape(1, 29, 0, 23, 30, 22),
		Block.createCuboidShape(1, -15, 0, 23, -14, 22),
		Block.createCuboidShape(4, -4, 4, 20, -3, 17),
		Block.createCuboidShape(4, 1, 4, 20, 2, 17),
		Block.createCuboidShape(4, 6, 4, 20, 7, 17),
		Block.createCuboidShape(4, 12, 4, 20, 12, 17),
		Block.createCuboidShape(4, 17, 4, 20, 17, 17),
		Block.createCuboidShape(3, -14, 18, 21, -4, 18),
		Block.createCuboidShape(4, 22, 4, 20, 22, 17),
		Block.createCuboidShape(4, -14, 16, 20, -4, 17),
		Block.createCuboidShape(5, -10, 21, 19, -5, 22)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-2, -4, 1, 12, 28, 4),
		Block.createCuboidShape(-2, -4, 20, 12, 28, 23),
		Block.createCuboidShape(0, -3, 5, 5, 6, 10),
		Block.createCuboidShape(0, -3, 5, 11, 6, 7),
		Block.createCuboidShape(6, -3, 5, 8, 6, 13),
		Block.createCuboidShape(0, -3, 17, 11, 6, 19),
		Block.createCuboidShape(-6, -3, 3, -5, 28, 23),
		Block.createCuboidShape(0, -3, 14, 12, 25, 14),
		Block.createCuboidShape(0, -3, 11, 12, 25, 11),
		Block.createCuboidShape(0, -3, 7, 12, 25, 7),
		Block.createCuboidShape(0, -3, 17, 12, 25, 17),
		Block.createCuboidShape(-6, -14, 21, -2, 28, 23),
		Block.createCuboidShape(0, 2, 14, 11, 6, 16),
		Block.createCuboidShape(3, -3, 8, 5, 6, 13),
		Block.createCuboidShape(9, -3, 8, 11, 6, 13),
		Block.createCuboidShape(-6, 30, 0, 2, 32, 24),
		Block.createCuboidShape(-6, 28, 1, 12, 29, 23),
		Block.createCuboidShape(0, -3, 11, 2, 6, 13),
		Block.createCuboidShape(-6, -5, 3, -2, -3, 21),
		Block.createCuboidShape(-6, -15, 0, 16, 30, 1),
		Block.createCuboidShape(-6, -15, 23, 16, 30, 24),
		Block.createCuboidShape(-6, -14, 1, -2, 29, 3),
		Block.createCuboidShape(-6, -10, 19, -2, -5, 21),
		Block.createCuboidShape(-6, -10, 3, -2, -5, 5),
		Block.createCuboidShape(-6, -14, 3, -2, -10, 21),
		Block.createCuboidShape(12, -14, 1, 16, 29, 23),
		Block.createCuboidShape(-6, 29, 1, 16, 30, 23),
		Block.createCuboidShape(-6, -15, 1, 16, -14, 23),
		Block.createCuboidShape(-1, -4, 4, 12, -3, 20),
		Block.createCuboidShape(-1, 1, 4, 12, 2, 20),
		Block.createCuboidShape(-1, 6, 4, 12, 7, 20),
		Block.createCuboidShape(-1, 12, 4, 12, 12, 20),
		Block.createCuboidShape(-1, 17, 4, 12, 17, 20),
		Block.createCuboidShape(-2, -14, 3, -2, -4, 21),
		Block.createCuboidShape(-1, 22, 4, 12, 22, 20),
		Block.createCuboidShape(-1, -14, 4, 0, -4, 20),
		Block.createCuboidShape(-6, -10, 5, -5, -5, 19)
    );

    public Shop2_Data() {
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

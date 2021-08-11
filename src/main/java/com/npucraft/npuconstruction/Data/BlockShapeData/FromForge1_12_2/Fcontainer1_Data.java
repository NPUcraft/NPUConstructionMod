package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcontainer1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-3, -6, 2, 19, 15, 3),
		Block.createCuboidShape(-1, -4, 4, 6, 0, 13),
		Block.createCuboidShape(12, -13, 5, 18, -9, 11),
		Block.createCuboidShape(10, 14, 6, 18, 19, 11),
		Block.createCuboidShape(11, -4, 4, 16, -2, 15),
		Block.createCuboidShape(-3, -16, 3, 19, -13, 15),
		Block.createCuboidShape(-1, 23, 10, 17, 29, 13),
		Block.createCuboidShape(-1, 23, 5, 17, 29, 8),
		Block.createCuboidShape(7, -4, 4, 10, 0, 12),
		Block.createCuboidShape(-1, 5, 12, 17, 9, 14),
		Block.createCuboidShape(-1, 5, 9, 17, 9, 11),
		Block.createCuboidShape(-1, 5, 5, 17, 9, 7),
		Block.createCuboidShape(-5, 2, 5, -4, 30, 14),
		Block.createCuboidShape(20, 4, 5, 20, 31, 14),
		Block.createCuboidShape(19, -13, 3, 19, 31, 15),
		Block.createCuboidShape(-1, 14, 7, 7, 18, 12),
		Block.createCuboidShape(-3, -13, 3, -3, 31, 15),
		Block.createCuboidShape(1, -13, 6, 5, -9, 11),
		Block.createCuboidShape(-3, 22, 3, 19, 23, 15),
		Block.createCuboidShape(-3, 31, 3, 19, 32, 15),
		Block.createCuboidShape(-3, 13, 3, 19, 14, 15),
		Block.createCuboidShape(-3, 4, 3, 19, 5, 15),
		Block.createCuboidShape(-3, -5, 3, 19, -4, 15),
		Block.createCuboidShape(-3, -16, 15, 19, 32, 16),
		Block.createCuboidShape(-3, 3, 12, 19, 4, 15),
		Block.createCuboidShape(-3, 12, 12, 19, 13, 15),
		Block.createCuboidShape(-3, 21, 12, 19, 22, 15),
		Block.createCuboidShape(-3, 30, 12, 19, 31, 15),
		Block.createCuboidShape(-3, -6, 12, 19, -5, 15),
		Block.createCuboidShape(-3, 22, 2, 19, 24, 3)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(13, -6, -3, 14, 15, 19),
		Block.createCuboidShape(3, -4, -1, 12, 0, 6),
		Block.createCuboidShape(5, -13, 12, 11, -9, 18),
		Block.createCuboidShape(5, 14, 10, 10, 19, 18),
		Block.createCuboidShape(1, -4, 11, 12, -2, 16),
		Block.createCuboidShape(1, -16, -3, 13, -13, 19),
		Block.createCuboidShape(3, 23, -1, 6, 29, 17),
		Block.createCuboidShape(8, 23, -1, 11, 29, 17),
		Block.createCuboidShape(4, -4, 7, 12, 0, 10),
		Block.createCuboidShape(2, 5, -1, 4, 9, 17),
		Block.createCuboidShape(5, 5, -1, 7, 9, 17),
		Block.createCuboidShape(9, 5, -1, 11, 9, 17),
		Block.createCuboidShape(2, 2, -5, 11, 30, -4),
		Block.createCuboidShape(2, 4, 20, 11, 31, 20),
		Block.createCuboidShape(1, -13, 19, 13, 31, 19),
		Block.createCuboidShape(4, 14, -1, 9, 18, 7),
		Block.createCuboidShape(1, -13, -3, 13, 31, -3),
		Block.createCuboidShape(5, -13, 1, 10, -9, 5),
		Block.createCuboidShape(1, 22, -3, 13, 23, 19),
		Block.createCuboidShape(1, 31, -3, 13, 32, 19),
		Block.createCuboidShape(1, 13, -3, 13, 14, 19),
		Block.createCuboidShape(1, 4, -3, 13, 5, 19),
		Block.createCuboidShape(1, -5, -3, 13, -4, 19),
		Block.createCuboidShape(0, -16, -3, 1, 32, 19),
		Block.createCuboidShape(1, 3, -3, 4, 4, 19),
		Block.createCuboidShape(1, 12, -3, 4, 13, 19),
		Block.createCuboidShape(1, 21, -3, 4, 22, 19),
		Block.createCuboidShape(1, 30, -3, 4, 31, 19),
		Block.createCuboidShape(1, -6, -3, 4, -5, 19),
		Block.createCuboidShape(13, 22, -3, 14, 24, 19)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-3, -6, 13, 19, 15, 14),
		Block.createCuboidShape(10, -4, 3, 17, 0, 12),
		Block.createCuboidShape(-2, -13, 5, 4, -9, 11),
		Block.createCuboidShape(-2, 14, 5, 6, 19, 10),
		Block.createCuboidShape(0, -4, 1, 5, -2, 12),
		Block.createCuboidShape(-3, -16, 1, 19, -13, 13),
		Block.createCuboidShape(-1, 23, 3, 17, 29, 6),
		Block.createCuboidShape(-1, 23, 8, 17, 29, 11),
		Block.createCuboidShape(6, -4, 4, 9, 0, 12),
		Block.createCuboidShape(-1, 5, 2, 17, 9, 4),
		Block.createCuboidShape(-1, 5, 5, 17, 9, 7),
		Block.createCuboidShape(-1, 5, 9, 17, 9, 11),
		Block.createCuboidShape(20, 2, 2, 21, 30, 11),
		Block.createCuboidShape(-4, 4, 2, -4, 31, 11),
		Block.createCuboidShape(-3, -13, 1, -3, 31, 13),
		Block.createCuboidShape(9, 14, 4, 17, 18, 9),
		Block.createCuboidShape(19, -13, 1, 19, 31, 13),
		Block.createCuboidShape(11, -13, 5, 15, -9, 10),
		Block.createCuboidShape(-3, 22, 1, 19, 23, 13),
		Block.createCuboidShape(-3, 31, 1, 19, 32, 13),
		Block.createCuboidShape(-3, 13, 1, 19, 14, 13),
		Block.createCuboidShape(-3, 4, 1, 19, 5, 13),
		Block.createCuboidShape(-3, -5, 1, 19, -4, 13),
		Block.createCuboidShape(-3, -16, 0, 19, 32, 1),
		Block.createCuboidShape(-3, 3, 1, 19, 4, 4),
		Block.createCuboidShape(-3, 12, 1, 19, 13, 4),
		Block.createCuboidShape(-3, 21, 1, 19, 22, 4),
		Block.createCuboidShape(-3, 30, 1, 19, 31, 4),
		Block.createCuboidShape(-3, -6, 1, 19, -5, 4),
		Block.createCuboidShape(-3, 22, 13, 19, 24, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, -6, -3, 3, 15, 19),
		Block.createCuboidShape(4, -4, 10, 13, 0, 17),
		Block.createCuboidShape(5, -13, -2, 11, -9, 4),
		Block.createCuboidShape(6, 14, -2, 11, 19, 6),
		Block.createCuboidShape(4, -4, 0, 15, -2, 5),
		Block.createCuboidShape(3, -16, -3, 15, -13, 19),
		Block.createCuboidShape(10, 23, -1, 13, 29, 17),
		Block.createCuboidShape(5, 23, -1, 8, 29, 17),
		Block.createCuboidShape(4, -4, 6, 12, 0, 9),
		Block.createCuboidShape(12, 5, -1, 14, 9, 17),
		Block.createCuboidShape(9, 5, -1, 11, 9, 17),
		Block.createCuboidShape(5, 5, -1, 7, 9, 17),
		Block.createCuboidShape(5, 2, 20, 14, 30, 21),
		Block.createCuboidShape(5, 4, -4, 14, 31, -4),
		Block.createCuboidShape(3, -13, -3, 15, 31, -3),
		Block.createCuboidShape(7, 14, 9, 12, 18, 17),
		Block.createCuboidShape(3, -13, 19, 15, 31, 19),
		Block.createCuboidShape(6, -13, 11, 11, -9, 15),
		Block.createCuboidShape(3, 22, -3, 15, 23, 19),
		Block.createCuboidShape(3, 31, -3, 15, 32, 19),
		Block.createCuboidShape(3, 13, -3, 15, 14, 19),
		Block.createCuboidShape(3, 4, -3, 15, 5, 19),
		Block.createCuboidShape(3, -5, -3, 15, -4, 19),
		Block.createCuboidShape(15, -16, -3, 16, 32, 19),
		Block.createCuboidShape(12, 3, -3, 15, 4, 19),
		Block.createCuboidShape(12, 12, -3, 15, 13, 19),
		Block.createCuboidShape(12, 21, -3, 15, 22, 19),
		Block.createCuboidShape(12, 30, -3, 15, 31, 19),
		Block.createCuboidShape(12, -6, -3, 15, -5, 19),
		Block.createCuboidShape(2, 22, -3, 3, 24, 19)
    );

    public Fcontainer1_Data() {
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

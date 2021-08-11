package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Woodclassroomdesk5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 7, 16, 20, 8),
		Block.createCuboidShape(0, 9, 28, 16, 23, 29),
		Block.createCuboidShape(0, 5, -3, 16, 10, -2),
		Block.createCuboidShape(0, 7, 19, 16, 13, 20),
		Block.createCuboidShape(-1, -3, 5, 17, -2, 11),
		Block.createCuboidShape(-1, -1, 26, 17, 0, 32),
		Block.createCuboidShape(0, 9, -16, 16, 9, -10),
		Block.createCuboidShape(0, 11, 8, 16, 11, 14),
		Block.createCuboidShape(0, -16, -16, 16, -10, 32),
		Block.createCuboidShape(0, -5, -13, 16, -3, 32),
		Block.createCuboidShape(0, -14, 0, 16, -5, 16),
		Block.createCuboidShape(0, -12, 16, 16, -5, 32),
		Block.createCuboidShape(0, 3, -1, 16, 12, 0),
		Block.createCuboidShape(0, 5, 21, 16, 15, 21),
		Block.createCuboidShape(0, -3, 11, 16, -1, 32),
		Block.createCuboidShape(0, -10, -16, 16, -7, 16),
		Block.createCuboidShape(-1, 14, -16, 17, 15, -8),
		Block.createCuboidShape(0, 13, -16, 16, 14, -15),
		Block.createCuboidShape(16, -2, 7, 17, 16, 9),
		Block.createCuboidShape(-1, -2, 7, 0, 16, 9),
		Block.createCuboidShape(16, 4, 0, 17, 6, 7),
		Block.createCuboidShape(-1, 4, 0, 0, 6, 7),
		Block.createCuboidShape(2, 12, -10, 14, 14, -10),
		Block.createCuboidShape(0, 15, 8, 16, 16, 9),
		Block.createCuboidShape(-1, 16, 8, 17, 17, 16),
		Block.createCuboidShape(16, -5, -16, 17, 14, -15),
		Block.createCuboidShape(-1, -5, -16, 0, 14, -15),
		Block.createCuboidShape(0, -7, -16, 16, -5, 0),
		Block.createCuboidShape(2, 15, 12, 14, 17, 12),
		Block.createCuboidShape(-1, 0, 28, 0, 19, 30),
		Block.createCuboidShape(-1, 6, 21, 0, 9, 28),
		Block.createCuboidShape(16, 6, 21, 17, 9, 28),
		Block.createCuboidShape(16, 0, 28, 17, 19, 30)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 6, 0, 9, 20, 16),
		Block.createCuboidShape(-13, 9, 0, -12, 23, 16),
		Block.createCuboidShape(18, 5, 0, 19, 10, 16),
		Block.createCuboidShape(-4, 7, 0, -3, 13, 16),
		Block.createCuboidShape(5, -3, -1, 11, -2, 17),
		Block.createCuboidShape(-16, -1, -1, -10, 0, 17),
		Block.createCuboidShape(26, 9, 0, 32, 9, 16),
		Block.createCuboidShape(2, 11, 0, 8, 11, 16),
		Block.createCuboidShape(-16, -16, 0, 32, -10, 16),
		Block.createCuboidShape(-16, -5, 0, 29, -3, 16),
		Block.createCuboidShape(0, -14, 0, 16, -5, 16),
		Block.createCuboidShape(-16, -12, 0, 0, -5, 16),
		Block.createCuboidShape(16, 3, 0, 17, 12, 16),
		Block.createCuboidShape(-5, 5, 0, -5, 15, 16),
		Block.createCuboidShape(-16, -3, 0, 5, -1, 16),
		Block.createCuboidShape(0, -10, 0, 32, -7, 16),
		Block.createCuboidShape(24, 14, -1, 32, 15, 17),
		Block.createCuboidShape(31, 13, 0, 32, 14, 16),
		Block.createCuboidShape(7, -2, 16, 9, 16, 17),
		Block.createCuboidShape(7, -2, -1, 9, 16, 0),
		Block.createCuboidShape(9, 4, 16, 16, 6, 17),
		Block.createCuboidShape(9, 4, -1, 16, 6, 0),
		Block.createCuboidShape(26, 12, 2, 26, 14, 14),
		Block.createCuboidShape(7, 15, 0, 8, 16, 16),
		Block.createCuboidShape(0, 16, -1, 8, 17, 17),
		Block.createCuboidShape(31, -5, 16, 32, 14, 17),
		Block.createCuboidShape(31, -5, -1, 32, 14, 0),
		Block.createCuboidShape(16, -7, 0, 32, -5, 16),
		Block.createCuboidShape(4, 15, 2, 4, 17, 14),
		Block.createCuboidShape(-14, 0, -1, -12, 19, 0),
		Block.createCuboidShape(-12, 6, -1, -5, 9, 0),
		Block.createCuboidShape(-12, 6, 16, -5, 9, 17),
		Block.createCuboidShape(-14, 0, 16, -12, 19, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 8, 16, 20, 9),
		Block.createCuboidShape(0, 9, -13, 16, 23, -12),
		Block.createCuboidShape(0, 5, 18, 16, 10, 19),
		Block.createCuboidShape(0, 7, -4, 16, 13, -3),
		Block.createCuboidShape(-1, -3, 5, 17, -2, 11),
		Block.createCuboidShape(-1, -1, -16, 17, 0, -10),
		Block.createCuboidShape(0, 9, 26, 16, 9, 32),
		Block.createCuboidShape(0, 11, 2, 16, 11, 8),
		Block.createCuboidShape(0, -16, -16, 16, -10, 32),
		Block.createCuboidShape(0, -5, -16, 16, -3, 29),
		Block.createCuboidShape(0, -14, 0, 16, -5, 16),
		Block.createCuboidShape(0, -12, -16, 16, -5, 0),
		Block.createCuboidShape(0, 3, 16, 16, 12, 17),
		Block.createCuboidShape(0, 5, -5, 16, 15, -5),
		Block.createCuboidShape(0, -3, -16, 16, -1, 5),
		Block.createCuboidShape(0, -10, 0, 16, -7, 32),
		Block.createCuboidShape(-1, 14, 24, 17, 15, 32),
		Block.createCuboidShape(0, 13, 31, 16, 14, 32),
		Block.createCuboidShape(-1, -2, 7, 0, 16, 9),
		Block.createCuboidShape(16, -2, 7, 17, 16, 9),
		Block.createCuboidShape(-1, 4, 9, 0, 6, 16),
		Block.createCuboidShape(16, 4, 9, 17, 6, 16),
		Block.createCuboidShape(2, 12, 26, 14, 14, 26),
		Block.createCuboidShape(0, 15, 7, 16, 16, 8),
		Block.createCuboidShape(-1, 16, 0, 17, 17, 8),
		Block.createCuboidShape(-1, -5, 31, 0, 14, 32),
		Block.createCuboidShape(16, -5, 31, 17, 14, 32),
		Block.createCuboidShape(0, -7, 16, 16, -5, 32),
		Block.createCuboidShape(2, 15, 4, 14, 17, 4),
		Block.createCuboidShape(16, 0, -14, 17, 19, -12),
		Block.createCuboidShape(16, 6, -12, 17, 9, -5),
		Block.createCuboidShape(-1, 6, -12, 0, 9, -5),
		Block.createCuboidShape(-1, 0, -14, 0, 19, -12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 6, 0, 8, 20, 16),
		Block.createCuboidShape(28, 9, 0, 29, 23, 16),
		Block.createCuboidShape(-3, 5, 0, -2, 10, 16),
		Block.createCuboidShape(19, 7, 0, 20, 13, 16),
		Block.createCuboidShape(5, -3, -1, 11, -2, 17),
		Block.createCuboidShape(26, -1, -1, 32, 0, 17),
		Block.createCuboidShape(-16, 9, 0, -10, 9, 16),
		Block.createCuboidShape(8, 11, 0, 14, 11, 16),
		Block.createCuboidShape(-16, -16, 0, 32, -10, 16),
		Block.createCuboidShape(-13, -5, 0, 32, -3, 16),
		Block.createCuboidShape(0, -14, 0, 16, -5, 16),
		Block.createCuboidShape(16, -12, 0, 32, -5, 16),
		Block.createCuboidShape(-1, 3, 0, 0, 12, 16),
		Block.createCuboidShape(21, 5, 0, 21, 15, 16),
		Block.createCuboidShape(11, -3, 0, 32, -1, 16),
		Block.createCuboidShape(-16, -10, 0, 16, -7, 16),
		Block.createCuboidShape(-16, 14, -1, -8, 15, 17),
		Block.createCuboidShape(-16, 13, 0, -15, 14, 16),
		Block.createCuboidShape(7, -2, -1, 9, 16, 0),
		Block.createCuboidShape(7, -2, 16, 9, 16, 17),
		Block.createCuboidShape(0, 4, -1, 7, 6, 0),
		Block.createCuboidShape(0, 4, 16, 7, 6, 17),
		Block.createCuboidShape(-10, 12, 2, -10, 14, 14),
		Block.createCuboidShape(8, 15, 0, 9, 16, 16),
		Block.createCuboidShape(8, 16, -1, 16, 17, 17),
		Block.createCuboidShape(-16, -5, -1, -15, 14, 0),
		Block.createCuboidShape(-16, -5, 16, -15, 14, 17),
		Block.createCuboidShape(-16, -7, 0, 0, -5, 16),
		Block.createCuboidShape(12, 15, 2, 12, 17, 14),
		Block.createCuboidShape(28, 0, 16, 30, 19, 17),
		Block.createCuboidShape(21, 6, 16, 28, 9, 17),
		Block.createCuboidShape(21, 6, -1, 28, 9, 0),
		Block.createCuboidShape(28, 0, -1, 30, 19, 0)
    );

    public Woodclassroomdesk5_Data() {
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

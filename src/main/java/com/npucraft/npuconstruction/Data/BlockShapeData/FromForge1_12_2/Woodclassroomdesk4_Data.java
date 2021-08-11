package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Woodclassroomdesk4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 7, 16, 16, 8),
		Block.createCuboidShape(3, 4, 31, 16, 18, 32),
		Block.createCuboidShape(12, -5, 31, 17, 18, 32),
		Block.createCuboidShape(-1, -5, 31, 4, 18, 32),
		Block.createCuboidShape(0, 1, -3, 16, 5, -2),
		Block.createCuboidShape(0, 3, 22, 16, 7, 23),
		Block.createCuboidShape(-1, -7, 5, 17, -7, 11),
		Block.createCuboidShape(0, 3, -16, 16, 4, -10),
		Block.createCuboidShape(0, 6, 8, 16, 6, 14),
		Block.createCuboidShape(0, -16, -16, 16, -10, 32),
		Block.createCuboidShape(0, -10, -13, 16, -7, 16),
		Block.createCuboidShape(0, -2, -1, 16, 7, 0),
		Block.createCuboidShape(0, 0, 24, 16, 10, 24),
		Block.createCuboidShape(0, -7, 11, 16, -5, 32),
		Block.createCuboidShape(0, -12, 16, 16, -7, 32),
		Block.createCuboidShape(-1, 10, -16, 17, 11, -8),
		Block.createCuboidShape(0, 9, -16, 16, 10, -15),
		Block.createCuboidShape(16, -7, 7, 17, 12, 9),
		Block.createCuboidShape(-1, -7, 7, 0, 12, 9),
		Block.createCuboidShape(16, 0, 0, 17, 1, 7),
		Block.createCuboidShape(-1, 0, 0, 0, 1, 7),
		Block.createCuboidShape(2, 7, -10, 14, 10, -10),
		Block.createCuboidShape(0, 11, 8, 16, 12, 9),
		Block.createCuboidShape(-1, 12, 8, 17, 13, 16),
		Block.createCuboidShape(16, -9, -16, 17, 10, -15),
		Block.createCuboidShape(-1, -9, -16, 0, 10, -15),
		Block.createCuboidShape(2, 10, 15, 14, 12, 15),
		Block.createCuboidShape(-1, 2, 24, 0, 3, 31),
		Block.createCuboidShape(16, 2, 24, 17, 3, 31)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 2, 0, 9, 16, 16),
		Block.createCuboidShape(-16, 4, 3, -15, 18, 16),
		Block.createCuboidShape(-16, -5, 12, -15, 18, 17),
		Block.createCuboidShape(-16, -5, -1, -15, 18, 4),
		Block.createCuboidShape(18, 1, 0, 19, 5, 16),
		Block.createCuboidShape(-7, 3, 0, -6, 7, 16),
		Block.createCuboidShape(5, -7, -1, 11, -7, 17),
		Block.createCuboidShape(26, 3, 0, 32, 4, 16),
		Block.createCuboidShape(2, 6, 0, 8, 6, 16),
		Block.createCuboidShape(-16, -16, 0, 32, -10, 16),
		Block.createCuboidShape(0, -10, 0, 29, -7, 16),
		Block.createCuboidShape(16, -2, 0, 17, 7, 16),
		Block.createCuboidShape(-8, 0, 0, -8, 10, 16),
		Block.createCuboidShape(-16, -7, 0, 5, -5, 16),
		Block.createCuboidShape(-16, -12, 0, 0, -7, 16),
		Block.createCuboidShape(24, 10, -1, 32, 11, 17),
		Block.createCuboidShape(31, 9, 0, 32, 10, 16),
		Block.createCuboidShape(7, -7, 16, 9, 12, 17),
		Block.createCuboidShape(7, -7, -1, 9, 12, 0),
		Block.createCuboidShape(9, 0, 16, 16, 1, 17),
		Block.createCuboidShape(9, 0, -1, 16, 1, 0),
		Block.createCuboidShape(26, 7, 2, 26, 10, 14),
		Block.createCuboidShape(7, 11, 0, 8, 12, 16),
		Block.createCuboidShape(0, 12, -1, 8, 13, 17),
		Block.createCuboidShape(31, -9, 16, 32, 10, 17),
		Block.createCuboidShape(31, -9, -1, 32, 10, 0),
		Block.createCuboidShape(1, 10, 2, 1, 12, 14),
		Block.createCuboidShape(-15, 2, -1, -8, 3, 0),
		Block.createCuboidShape(-15, 2, 16, -8, 3, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 8, 16, 16, 9),
		Block.createCuboidShape(0, 4, -16, 13, 18, -15),
		Block.createCuboidShape(-1, -5, -16, 4, 18, -15),
		Block.createCuboidShape(12, -5, -16, 17, 18, -15),
		Block.createCuboidShape(0, 1, 18, 16, 5, 19),
		Block.createCuboidShape(0, 3, -7, 16, 7, -6),
		Block.createCuboidShape(-1, -7, 5, 17, -7, 11),
		Block.createCuboidShape(0, 3, 26, 16, 4, 32),
		Block.createCuboidShape(0, 6, 2, 16, 6, 8),
		Block.createCuboidShape(0, -16, -16, 16, -10, 32),
		Block.createCuboidShape(0, -10, 0, 16, -7, 29),
		Block.createCuboidShape(0, -2, 16, 16, 7, 17),
		Block.createCuboidShape(0, 0, -8, 16, 10, -8),
		Block.createCuboidShape(0, -7, -16, 16, -5, 5),
		Block.createCuboidShape(0, -12, -16, 16, -7, 0),
		Block.createCuboidShape(-1, 10, 24, 17, 11, 32),
		Block.createCuboidShape(0, 9, 31, 16, 10, 32),
		Block.createCuboidShape(-1, -7, 7, 0, 12, 9),
		Block.createCuboidShape(16, -7, 7, 17, 12, 9),
		Block.createCuboidShape(-1, 0, 9, 0, 1, 16),
		Block.createCuboidShape(16, 0, 9, 17, 1, 16),
		Block.createCuboidShape(2, 7, 26, 14, 10, 26),
		Block.createCuboidShape(0, 11, 7, 16, 12, 8),
		Block.createCuboidShape(-1, 12, 0, 17, 13, 8),
		Block.createCuboidShape(-1, -9, 31, 0, 10, 32),
		Block.createCuboidShape(16, -9, 31, 17, 10, 32),
		Block.createCuboidShape(2, 10, 1, 14, 12, 1),
		Block.createCuboidShape(16, 2, -15, 17, 3, -8),
		Block.createCuboidShape(-1, 2, -15, 0, 3, -8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 2, 0, 8, 16, 16),
		Block.createCuboidShape(31, 4, 0, 32, 18, 13),
		Block.createCuboidShape(31, -5, -1, 32, 18, 4),
		Block.createCuboidShape(31, -5, 12, 32, 18, 17),
		Block.createCuboidShape(-3, 1, 0, -2, 5, 16),
		Block.createCuboidShape(22, 3, 0, 23, 7, 16),
		Block.createCuboidShape(5, -7, -1, 11, -7, 17),
		Block.createCuboidShape(-16, 3, 0, -10, 4, 16),
		Block.createCuboidShape(8, 6, 0, 14, 6, 16),
		Block.createCuboidShape(-16, -16, 0, 32, -10, 16),
		Block.createCuboidShape(-13, -10, 0, 16, -7, 16),
		Block.createCuboidShape(-1, -2, 0, 0, 7, 16),
		Block.createCuboidShape(24, 0, 0, 24, 10, 16),
		Block.createCuboidShape(11, -7, 0, 32, -5, 16),
		Block.createCuboidShape(16, -12, 0, 32, -7, 16),
		Block.createCuboidShape(-16, 10, -1, -8, 11, 17),
		Block.createCuboidShape(-16, 9, 0, -15, 10, 16),
		Block.createCuboidShape(7, -7, -1, 9, 12, 0),
		Block.createCuboidShape(7, -7, 16, 9, 12, 17),
		Block.createCuboidShape(0, 0, -1, 7, 1, 0),
		Block.createCuboidShape(0, 0, 16, 7, 1, 17),
		Block.createCuboidShape(-10, 7, 2, -10, 10, 14),
		Block.createCuboidShape(8, 11, 0, 9, 12, 16),
		Block.createCuboidShape(8, 12, -1, 16, 13, 17),
		Block.createCuboidShape(-16, -9, -1, -15, 10, 0),
		Block.createCuboidShape(-16, -9, 16, -15, 10, 17),
		Block.createCuboidShape(15, 10, 2, 15, 12, 14),
		Block.createCuboidShape(24, 2, 16, 31, 3, 17),
		Block.createCuboidShape(24, 2, -1, 31, 3, 0)
    );

    public Woodclassroomdesk4_Data() {
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

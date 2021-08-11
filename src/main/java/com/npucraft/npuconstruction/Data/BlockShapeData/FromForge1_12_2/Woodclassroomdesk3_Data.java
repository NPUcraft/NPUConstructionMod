package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Woodclassroomdesk3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 7, 16, 27, 8),
		Block.createCuboidShape(-1, 7, 31, 4, 29, 32),
		Block.createCuboidShape(0, 16, 31, 13, 30, 32),
		Block.createCuboidShape(12, 7, 31, 17, 29, 32),
		Block.createCuboidShape(0, 13, -3, 16, 17, -2),
		Block.createCuboidShape(0, 15, 22, 16, 20, 23),
		Block.createCuboidShape(-1, 4, 5, 17, 5, 11),
		Block.createCuboidShape(0, 16, -16, 16, 16, -10),
		Block.createCuboidShape(0, 18, 8, 16, 18, 14),
		Block.createCuboidShape(0, 0, -16, 16, 4, 32),
		Block.createCuboidShape(0, 10, -1, 16, 19, 0),
		Block.createCuboidShape(0, 13, 24, 16, 22, 24),
		Block.createCuboidShape(0, 4, 11, 16, 6, 32),
		Block.createCuboidShape(-1, 21, -16, 17, 22, -8),
		Block.createCuboidShape(0, 20, -16, 16, 21, -15),
		Block.createCuboidShape(16, 5, 7, 17, 23, 9),
		Block.createCuboidShape(-1, 5, 7, 0, 23, 9),
		Block.createCuboidShape(16, 12, 0, 17, 13, 7),
		Block.createCuboidShape(-1, 12, 0, 0, 13, 7),
		Block.createCuboidShape(2, 19, -10, 14, 21, -10),
		Block.createCuboidShape(0, 22, 8, 16, 23, 9),
		Block.createCuboidShape(-1, 23, 8, 17, 24, 16),
		Block.createCuboidShape(16, 2, -16, 17, 21, -15),
		Block.createCuboidShape(-1, 2, -16, 0, 21, -15),
		Block.createCuboidShape(16, 14, 24, 17, 16, 31),
		Block.createCuboidShape(-1, 14, 24, 0, 16, 31),
		Block.createCuboidShape(2, 22, 15, 14, 24, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 14, 0, 9, 27, 16),
		Block.createCuboidShape(-16, 7, -1, -15, 29, 4),
		Block.createCuboidShape(-16, 16, 0, -15, 30, 13),
		Block.createCuboidShape(-16, 7, 12, -15, 29, 17),
		Block.createCuboidShape(18, 13, 0, 19, 17, 16),
		Block.createCuboidShape(-7, 15, 0, -6, 20, 16),
		Block.createCuboidShape(5, 4, -1, 11, 5, 17),
		Block.createCuboidShape(26, 16, 0, 32, 16, 16),
		Block.createCuboidShape(2, 18, 0, 8, 18, 16),
		Block.createCuboidShape(-16, 0, 0, 32, 4, 16),
		Block.createCuboidShape(16, 10, 0, 17, 19, 16),
		Block.createCuboidShape(-8, 13, 0, -8, 22, 16),
		Block.createCuboidShape(-16, 4, 0, 5, 6, 16),
		Block.createCuboidShape(24, 21, -1, 32, 22, 17),
		Block.createCuboidShape(31, 20, 0, 32, 21, 16),
		Block.createCuboidShape(7, 5, 16, 9, 23, 17),
		Block.createCuboidShape(7, 5, -1, 9, 23, 0),
		Block.createCuboidShape(9, 12, 16, 16, 13, 17),
		Block.createCuboidShape(9, 12, -1, 16, 13, 0),
		Block.createCuboidShape(26, 19, 2, 26, 21, 14),
		Block.createCuboidShape(7, 22, 0, 8, 23, 16),
		Block.createCuboidShape(0, 23, -1, 8, 24, 17),
		Block.createCuboidShape(31, 2, 16, 32, 21, 17),
		Block.createCuboidShape(31, 2, -1, 32, 21, 0),
		Block.createCuboidShape(-15, 14, 16, -8, 16, 17),
		Block.createCuboidShape(-15, 14, -1, -8, 16, 0),
		Block.createCuboidShape(1, 22, 2, 1, 24, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 8, 16, 27, 9),
		Block.createCuboidShape(12, 7, -16, 17, 29, -15),
		Block.createCuboidShape(3, 16, -16, 16, 30, -15),
		Block.createCuboidShape(-1, 7, -16, 4, 29, -15),
		Block.createCuboidShape(0, 13, 18, 16, 17, 19),
		Block.createCuboidShape(0, 15, -7, 16, 20, -6),
		Block.createCuboidShape(-1, 4, 5, 17, 5, 11),
		Block.createCuboidShape(0, 16, 26, 16, 16, 32),
		Block.createCuboidShape(0, 18, 2, 16, 18, 8),
		Block.createCuboidShape(0, 0, -16, 16, 4, 32),
		Block.createCuboidShape(0, 10, 16, 16, 19, 17),
		Block.createCuboidShape(0, 13, -8, 16, 22, -8),
		Block.createCuboidShape(0, 4, -16, 16, 6, 5),
		Block.createCuboidShape(-1, 21, 24, 17, 22, 32),
		Block.createCuboidShape(0, 20, 31, 16, 21, 32),
		Block.createCuboidShape(-1, 5, 7, 0, 23, 9),
		Block.createCuboidShape(16, 5, 7, 17, 23, 9),
		Block.createCuboidShape(-1, 12, 9, 0, 13, 16),
		Block.createCuboidShape(16, 12, 9, 17, 13, 16),
		Block.createCuboidShape(2, 19, 26, 14, 21, 26),
		Block.createCuboidShape(0, 22, 7, 16, 23, 8),
		Block.createCuboidShape(-1, 23, 0, 17, 24, 8),
		Block.createCuboidShape(-1, 2, 31, 0, 21, 32),
		Block.createCuboidShape(16, 2, 31, 17, 21, 32),
		Block.createCuboidShape(-1, 14, -15, 0, 16, -8),
		Block.createCuboidShape(16, 14, -15, 17, 16, -8),
		Block.createCuboidShape(2, 22, 1, 14, 24, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 14, 0, 8, 27, 16),
		Block.createCuboidShape(31, 7, 12, 32, 29, 17),
		Block.createCuboidShape(31, 16, 3, 32, 30, 16),
		Block.createCuboidShape(31, 7, -1, 32, 29, 4),
		Block.createCuboidShape(-3, 13, 0, -2, 17, 16),
		Block.createCuboidShape(22, 15, 0, 23, 20, 16),
		Block.createCuboidShape(5, 4, -1, 11, 5, 17),
		Block.createCuboidShape(-16, 16, 0, -10, 16, 16),
		Block.createCuboidShape(8, 18, 0, 14, 18, 16),
		Block.createCuboidShape(-16, 0, 0, 32, 4, 16),
		Block.createCuboidShape(-1, 10, 0, 0, 19, 16),
		Block.createCuboidShape(24, 13, 0, 24, 22, 16),
		Block.createCuboidShape(11, 4, 0, 32, 6, 16),
		Block.createCuboidShape(-16, 21, -1, -8, 22, 17),
		Block.createCuboidShape(-16, 20, 0, -15, 21, 16),
		Block.createCuboidShape(7, 5, -1, 9, 23, 0),
		Block.createCuboidShape(7, 5, 16, 9, 23, 17),
		Block.createCuboidShape(0, 12, -1, 7, 13, 0),
		Block.createCuboidShape(0, 12, 16, 7, 13, 17),
		Block.createCuboidShape(-10, 19, 2, -10, 21, 14),
		Block.createCuboidShape(8, 22, 0, 9, 23, 16),
		Block.createCuboidShape(8, 23, -1, 16, 24, 17),
		Block.createCuboidShape(-16, 2, -1, -15, 21, 0),
		Block.createCuboidShape(-16, 2, 16, -15, 21, 17),
		Block.createCuboidShape(24, 14, -1, 31, 16, 0),
		Block.createCuboidShape(24, 14, 16, 31, 16, 17),
		Block.createCuboidShape(15, 22, 2, 15, 24, 14)
    );

    public Woodclassroomdesk3_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Woodclassroomdesk2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 9, 7, 16, 23, 8),
		Block.createCuboidShape(-1, 2, 31, 4, 25, 32),
		Block.createCuboidShape(0, 12, 31, 13, 25, 32),
		Block.createCuboidShape(12, 2, 31, 17, 25, 32),
		Block.createCuboidShape(0, 8, -3, 16, 13, -2),
		Block.createCuboidShape(0, 11, 22, 16, 15, 23),
		Block.createCuboidShape(-1, 0, 5, 17, 0, 11),
		Block.createCuboidShape(0, 13, -16, 16, 14, -10),
		Block.createCuboidShape(0, 13, 8, 16, 14, 14),
		Block.createCuboidShape(0, 13, -16, 0, 14, 14),
		Block.createCuboidShape(16, 13, -16, 16, 14, 14),
		Block.createCuboidShape(0, 5, -1, 16, 15, 0),
		Block.createCuboidShape(0, 7, 24, 16, 17, 24),
		Block.createCuboidShape(0, 0, 11, 16, 2, 32),
		Block.createCuboidShape(-1, 19, -16, 17, 20, -8),
		Block.createCuboidShape(0, 18, -16, 16, 19, -15),
		Block.createCuboidShape(16, 0, 7, 17, 19, 9),
		Block.createCuboidShape(-1, 0, 7, 0, 19, 9),
		Block.createCuboidShape(16, 7, 0, 17, 9, 7),
		Block.createCuboidShape(16, 10, 24, 17, 11, 31),
		Block.createCuboidShape(-1, 7, 0, 0, 9, 7),
		Block.createCuboidShape(-1, 10, 24, 0, 11, 31),
		Block.createCuboidShape(2, 15, -10, 14, 17, -10),
		Block.createCuboidShape(2, 17, 15, 14, 19, 15),
		Block.createCuboidShape(0, 18, 8, 16, 19, 9),
		Block.createCuboidShape(-1, 19, 8, 17, 20, 16),
		Block.createCuboidShape(16, 0, -16, 17, 19, -15),
		Block.createCuboidShape(-1, 0, -16, 0, 19, -15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 9, 0, 9, 23, 16),
		Block.createCuboidShape(-16, 2, -1, -15, 25, 4),
		Block.createCuboidShape(-16, 12, 0, -15, 25, 13),
		Block.createCuboidShape(-16, 2, 12, -15, 25, 17),
		Block.createCuboidShape(18, 8, 0, 19, 13, 16),
		Block.createCuboidShape(-7, 11, 0, -6, 15, 16),
		Block.createCuboidShape(5, 0, -1, 11, 0, 17),
		Block.createCuboidShape(26, 13, 0, 32, 14, 16),
		Block.createCuboidShape(2, 13, 0, 8, 14, 16),
		Block.createCuboidShape(2, 13, 0, 32, 14, 0),
		Block.createCuboidShape(2, 13, 16, 32, 14, 16),
		Block.createCuboidShape(16, 5, 0, 17, 15, 16),
		Block.createCuboidShape(-8, 7, 0, -8, 17, 16),
		Block.createCuboidShape(-16, 0, 0, 5, 2, 16),
		Block.createCuboidShape(24, 19, -1, 32, 20, 17),
		Block.createCuboidShape(31, 18, 0, 32, 19, 16),
		Block.createCuboidShape(7, 0, 16, 9, 19, 17),
		Block.createCuboidShape(7, 0, -1, 9, 19, 0),
		Block.createCuboidShape(9, 7, 16, 16, 9, 17),
		Block.createCuboidShape(-15, 10, 16, -8, 11, 17),
		Block.createCuboidShape(9, 7, -1, 16, 9, 0),
		Block.createCuboidShape(-15, 10, -1, -8, 11, 0),
		Block.createCuboidShape(26, 15, 2, 26, 17, 14),
		Block.createCuboidShape(1, 17, 2, 1, 19, 14),
		Block.createCuboidShape(7, 18, 0, 8, 19, 16),
		Block.createCuboidShape(0, 19, -1, 8, 20, 17),
		Block.createCuboidShape(31, 0, 16, 32, 19, 17),
		Block.createCuboidShape(31, 0, -1, 32, 19, 0)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 9, 8, 16, 23, 9),
		Block.createCuboidShape(12, 2, -16, 17, 25, -15),
		Block.createCuboidShape(3, 12, -16, 16, 25, -15),
		Block.createCuboidShape(-1, 2, -16, 4, 25, -15),
		Block.createCuboidShape(0, 8, 18, 16, 13, 19),
		Block.createCuboidShape(0, 11, -7, 16, 15, -6),
		Block.createCuboidShape(-1, 0, 5, 17, 0, 11),
		Block.createCuboidShape(0, 13, 26, 16, 14, 32),
		Block.createCuboidShape(0, 13, 2, 16, 14, 8),
		Block.createCuboidShape(16, 13, 2, 16, 14, 32),
		Block.createCuboidShape(0, 13, 2, 0, 14, 32),
		Block.createCuboidShape(0, 5, 16, 16, 15, 17),
		Block.createCuboidShape(0, 7, -8, 16, 17, -8),
		Block.createCuboidShape(0, 0, -16, 16, 2, 5),
		Block.createCuboidShape(-1, 19, 24, 17, 20, 32),
		Block.createCuboidShape(0, 18, 31, 16, 19, 32),
		Block.createCuboidShape(-1, 0, 7, 0, 19, 9),
		Block.createCuboidShape(16, 0, 7, 17, 19, 9),
		Block.createCuboidShape(-1, 7, 9, 0, 9, 16),
		Block.createCuboidShape(-1, 10, -15, 0, 11, -8),
		Block.createCuboidShape(16, 7, 9, 17, 9, 16),
		Block.createCuboidShape(16, 10, -15, 17, 11, -8),
		Block.createCuboidShape(2, 15, 26, 14, 17, 26),
		Block.createCuboidShape(2, 17, 1, 14, 19, 1),
		Block.createCuboidShape(0, 18, 7, 16, 19, 8),
		Block.createCuboidShape(-1, 19, 0, 17, 20, 8),
		Block.createCuboidShape(-1, 0, 31, 0, 19, 32),
		Block.createCuboidShape(16, 0, 31, 17, 19, 32)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, 0, 8, 23, 16),
		Block.createCuboidShape(31, 2, 12, 32, 25, 17),
		Block.createCuboidShape(31, 12, 3, 32, 25, 16),
		Block.createCuboidShape(31, 2, -1, 32, 25, 4),
		Block.createCuboidShape(-3, 8, 0, -2, 13, 16),
		Block.createCuboidShape(22, 11, 0, 23, 15, 16),
		Block.createCuboidShape(5, 0, -1, 11, 0, 17),
		Block.createCuboidShape(-16, 13, 0, -10, 14, 16),
		Block.createCuboidShape(8, 13, 0, 14, 14, 16),
		Block.createCuboidShape(-16, 13, 16, 14, 14, 16),
		Block.createCuboidShape(-16, 13, 0, 14, 14, 0),
		Block.createCuboidShape(-1, 5, 0, 0, 15, 16),
		Block.createCuboidShape(24, 7, 0, 24, 17, 16),
		Block.createCuboidShape(11, 0, 0, 32, 2, 16),
		Block.createCuboidShape(-16, 19, -1, -8, 20, 17),
		Block.createCuboidShape(-16, 18, 0, -15, 19, 16),
		Block.createCuboidShape(7, 0, -1, 9, 19, 0),
		Block.createCuboidShape(7, 0, 16, 9, 19, 17),
		Block.createCuboidShape(0, 7, -1, 7, 9, 0),
		Block.createCuboidShape(24, 10, -1, 31, 11, 0),
		Block.createCuboidShape(0, 7, 16, 7, 9, 17),
		Block.createCuboidShape(24, 10, 16, 31, 11, 17),
		Block.createCuboidShape(-10, 15, 2, -10, 17, 14),
		Block.createCuboidShape(15, 17, 2, 15, 19, 14),
		Block.createCuboidShape(8, 18, 0, 9, 19, 16),
		Block.createCuboidShape(8, 19, -1, 16, 20, 17),
		Block.createCuboidShape(-16, 0, -1, -15, 19, 0),
		Block.createCuboidShape(-16, 0, 16, -15, 19, 17)
    );

    public Woodclassroomdesk2_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Woodclassroomdesk1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 1, 15, 4, 23, 16),
		Block.createCuboidShape(0, 9, 15, 13, 23, 16),
		Block.createCuboidShape(12, 1, 15, 17, 23, 16),
		Block.createCuboidShape(0, 8, 5, 16, 13, 6),
		Block.createCuboidShape(-1, 0, -8, 17, 0, -2),
		Block.createCuboidShape(0, 13, -6, 16, 14, 0),
		Block.createCuboidShape(0, 5, 7, 16, 15, 8),
		Block.createCuboidShape(-1, 19, -6, 17, 20, 2),
		Block.createCuboidShape(0, 18, -6, 16, 19, -5),
		Block.createCuboidShape(16, 1, -6, 17, 19, -4),
		Block.createCuboidShape(-1, 1, -6, 0, 19, -4),
		Block.createCuboidShape(-1, 8, -7, 17, 21, -6),
		Block.createCuboidShape(16, 7, 8, 17, 9, 15),
		Block.createCuboidShape(-1, 7, 8, 0, 9, 15),
		Block.createCuboidShape(2, 15, -2, 14, 17, -2)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 1, -1, 1, 23, 4),
		Block.createCuboidShape(0, 9, 0, 1, 23, 13),
		Block.createCuboidShape(0, 1, 12, 1, 23, 17),
		Block.createCuboidShape(10, 8, 0, 11, 13, 16),
		Block.createCuboidShape(18, 0, -1, 24, 0, 17),
		Block.createCuboidShape(16, 13, 0, 22, 14, 16),
		Block.createCuboidShape(8, 5, 0, 9, 15, 16),
		Block.createCuboidShape(14, 19, -1, 22, 20, 17),
		Block.createCuboidShape(21, 18, 0, 22, 19, 16),
		Block.createCuboidShape(20, 1, 16, 22, 19, 17),
		Block.createCuboidShape(20, 1, -1, 22, 19, 0),
		Block.createCuboidShape(22, 8, -1, 23, 21, 17),
		Block.createCuboidShape(1, 7, 16, 8, 9, 17),
		Block.createCuboidShape(1, 7, -1, 8, 9, 0),
		Block.createCuboidShape(18, 15, 2, 18, 17, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(12, 1, 0, 17, 23, 1),
		Block.createCuboidShape(3, 9, 0, 16, 23, 1),
		Block.createCuboidShape(-1, 1, 0, 4, 23, 1),
		Block.createCuboidShape(0, 8, 10, 16, 13, 11),
		Block.createCuboidShape(-1, 0, 18, 17, 0, 24),
		Block.createCuboidShape(0, 13, 16, 16, 14, 22),
		Block.createCuboidShape(0, 5, 8, 16, 15, 9),
		Block.createCuboidShape(-1, 19, 14, 17, 20, 22),
		Block.createCuboidShape(0, 18, 21, 16, 19, 22),
		Block.createCuboidShape(-1, 1, 20, 0, 19, 22),
		Block.createCuboidShape(16, 1, 20, 17, 19, 22),
		Block.createCuboidShape(-1, 8, 22, 17, 21, 23),
		Block.createCuboidShape(-1, 7, 1, 0, 9, 8),
		Block.createCuboidShape(16, 7, 1, 17, 9, 8),
		Block.createCuboidShape(2, 15, 18, 14, 17, 18)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 1, 12, 16, 23, 17),
		Block.createCuboidShape(15, 9, 3, 16, 23, 16),
		Block.createCuboidShape(15, 1, -1, 16, 23, 4),
		Block.createCuboidShape(5, 8, 0, 6, 13, 16),
		Block.createCuboidShape(-8, 0, -1, -2, 0, 17),
		Block.createCuboidShape(-6, 13, 0, 0, 14, 16),
		Block.createCuboidShape(7, 5, 0, 8, 15, 16),
		Block.createCuboidShape(-6, 19, -1, 2, 20, 17),
		Block.createCuboidShape(-6, 18, 0, -5, 19, 16),
		Block.createCuboidShape(-6, 1, -1, -4, 19, 0),
		Block.createCuboidShape(-6, 1, 16, -4, 19, 17),
		Block.createCuboidShape(-7, 8, -1, -6, 21, 17),
		Block.createCuboidShape(8, 7, -1, 15, 9, 0),
		Block.createCuboidShape(8, 7, 16, 15, 9, 17),
		Block.createCuboidShape(-2, 15, 2, -2, 17, 14)
    );

    public Woodclassroomdesk1_Data() {
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

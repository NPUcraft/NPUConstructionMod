package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwashr_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 16, 13, 9, 18, 19),
		Block.createCuboidShape(0, 16, 12, 8, 20, 15),
		Block.createCuboidShape(0, 16, 19, 8, 20, 21),
		Block.createCuboidShape(3, 1, 17, 8, 15, 18),
		Block.createCuboidShape(10, 19, 12, 16, 20, 21),
		Block.createCuboidShape(-8, 19, 12, -2, 20, 21),
		Block.createCuboidShape(-8, 19, 21, 16, 20, 23),
		Block.createCuboidShape(-8, 19, 10, 16, 20, 12),
		Block.createCuboidShape(-8, 14, 9, 16, 20, 10),
		Block.createCuboidShape(-8, 0, 23, 16, 20, 24),
		Block.createCuboidShape(1, 15, 15, 7, 16, 19),
		Block.createCuboidShape(3, 20, 21, 5, 25, 22)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-3, 16, -1, 3, 18, 9),
		Block.createCuboidShape(1, 16, 0, 4, 20, 8),
		Block.createCuboidShape(-5, 16, 0, -3, 20, 8),
		Block.createCuboidShape(-2, 1, 3, -1, 15, 8),
		Block.createCuboidShape(-5, 19, 10, 4, 20, 16),
		Block.createCuboidShape(-5, 19, -8, 4, 20, -2),
		Block.createCuboidShape(-7, 19, -8, -5, 20, 16),
		Block.createCuboidShape(4, 19, -8, 6, 20, 16),
		Block.createCuboidShape(6, 14, -8, 7, 20, 16),
		Block.createCuboidShape(-8, 0, -8, -7, 20, 16),
		Block.createCuboidShape(-3, 15, 1, 1, 16, 7),
		Block.createCuboidShape(-6, 20, 3, -5, 25, 5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 16, -3, 17, 18, 3),
		Block.createCuboidShape(8, 16, 1, 16, 20, 4),
		Block.createCuboidShape(8, 16, -5, 16, 20, -3),
		Block.createCuboidShape(8, 1, -2, 13, 15, -1),
		Block.createCuboidShape(0, 19, -5, 6, 20, 4),
		Block.createCuboidShape(18, 19, -5, 24, 20, 4),
		Block.createCuboidShape(0, 19, -7, 24, 20, -5),
		Block.createCuboidShape(0, 19, 4, 24, 20, 6),
		Block.createCuboidShape(0, 14, 6, 24, 20, 7),
		Block.createCuboidShape(0, 0, -8, 24, 20, -7),
		Block.createCuboidShape(9, 15, -3, 15, 16, 1),
		Block.createCuboidShape(11, 20, -6, 13, 25, -5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(13, 16, 7, 19, 18, 17),
		Block.createCuboidShape(12, 16, 8, 15, 20, 16),
		Block.createCuboidShape(19, 16, 8, 21, 20, 16),
		Block.createCuboidShape(17, 1, 8, 18, 15, 13),
		Block.createCuboidShape(12, 19, 0, 21, 20, 6),
		Block.createCuboidShape(12, 19, 18, 21, 20, 24),
		Block.createCuboidShape(21, 19, 0, 23, 20, 24),
		Block.createCuboidShape(10, 19, 0, 12, 20, 24),
		Block.createCuboidShape(9, 14, 0, 10, 20, 24),
		Block.createCuboidShape(23, 0, 0, 24, 20, 24),
		Block.createCuboidShape(15, 15, 9, 19, 16, 15),
		Block.createCuboidShape(21, 20, 11, 22, 25, 13)
    );

    public Fwashr_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwashl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 16, 13, 17, 18, 19),
		Block.createCuboidShape(8, 16, 12, 16, 20, 15),
		Block.createCuboidShape(8, 16, 19, 16, 20, 21),
		Block.createCuboidShape(11, 1, 17, 16, 15, 18),
		Block.createCuboidShape(18, 19, 12, 24, 20, 21),
		Block.createCuboidShape(0, 19, 12, 6, 20, 21),
		Block.createCuboidShape(0, 19, 21, 24, 20, 23),
		Block.createCuboidShape(0, 19, 10, 24, 20, 12),
		Block.createCuboidShape(0, 14, 9, 24, 20, 10),
		Block.createCuboidShape(0, 0, 23, 24, 20, 24),
		Block.createCuboidShape(9, 15, 15, 15, 16, 19),
		Block.createCuboidShape(11, 20, 21, 13, 25, 22)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-3, 16, 7, 3, 18, 17),
		Block.createCuboidShape(1, 16, 8, 4, 20, 16),
		Block.createCuboidShape(-5, 16, 8, -3, 20, 16),
		Block.createCuboidShape(-2, 1, 11, -1, 15, 16),
		Block.createCuboidShape(-5, 19, 18, 4, 20, 24),
		Block.createCuboidShape(-5, 19, 0, 4, 20, 6),
		Block.createCuboidShape(-7, 19, 0, -5, 20, 24),
		Block.createCuboidShape(4, 19, 0, 6, 20, 24),
		Block.createCuboidShape(6, 14, 0, 7, 20, 24),
		Block.createCuboidShape(-8, 0, 0, -7, 20, 24),
		Block.createCuboidShape(-3, 15, 9, 1, 16, 15),
		Block.createCuboidShape(-6, 20, 11, -5, 25, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 16, -3, 9, 18, 3),
		Block.createCuboidShape(0, 16, 1, 8, 20, 4),
		Block.createCuboidShape(0, 16, -5, 8, 20, -3),
		Block.createCuboidShape(0, 1, -2, 5, 15, -1),
		Block.createCuboidShape(-8, 19, -5, -2, 20, 4),
		Block.createCuboidShape(10, 19, -5, 16, 20, 4),
		Block.createCuboidShape(-8, 19, -7, 16, 20, -5),
		Block.createCuboidShape(-8, 19, 4, 16, 20, 6),
		Block.createCuboidShape(-8, 14, 6, 16, 20, 7),
		Block.createCuboidShape(-8, 0, -8, 16, 20, -7),
		Block.createCuboidShape(1, 15, -3, 7, 16, 1),
		Block.createCuboidShape(3, 20, -6, 5, 25, -5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(13, 16, -1, 19, 18, 9),
		Block.createCuboidShape(12, 16, 0, 15, 20, 8),
		Block.createCuboidShape(19, 16, 0, 21, 20, 8),
		Block.createCuboidShape(17, 1, 0, 18, 15, 5),
		Block.createCuboidShape(12, 19, -8, 21, 20, -2),
		Block.createCuboidShape(12, 19, 10, 21, 20, 16),
		Block.createCuboidShape(21, 19, -8, 23, 20, 16),
		Block.createCuboidShape(10, 19, -8, 12, 20, 16),
		Block.createCuboidShape(9, 14, -8, 10, 20, 16),
		Block.createCuboidShape(23, 0, -8, 24, 20, 16),
		Block.createCuboidShape(15, 15, 1, 19, 16, 7),
		Block.createCuboidShape(21, 20, 3, 22, 25, 5)
    );

    public Fwashl_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Yf10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(15, 16, 13, 25, 18, 19),
		Block.createCuboidShape(16, 16, 12, 24, 20, 15),
		Block.createCuboidShape(16, 16, 19, 24, 20, 21),
		Block.createCuboidShape(19, 1, 17, 24, 15, 18),
		Block.createCuboidShape(26, 19, 12, 32, 20, 21),
		Block.createCuboidShape(8, 19, 12, 14, 20, 21),
		Block.createCuboidShape(8, 19, 21, 32, 20, 23),
		Block.createCuboidShape(8, 19, 10, 32, 20, 12),
		Block.createCuboidShape(8, 14, 9, 32, 20, 10),
		Block.createCuboidShape(8, 0, 23, 32, 20, 24),
		Block.createCuboidShape(17, 15, 15, 23, 16, 19),
		Block.createCuboidShape(19, 20, 21, 21, 25, 22)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-3, 16, 15, 3, 18, 25),
		Block.createCuboidShape(1, 16, 16, 4, 20, 24),
		Block.createCuboidShape(-5, 16, 16, -3, 20, 24),
		Block.createCuboidShape(-2, 1, 19, -1, 15, 24),
		Block.createCuboidShape(-5, 19, 26, 4, 20, 32),
		Block.createCuboidShape(-5, 19, 8, 4, 20, 14),
		Block.createCuboidShape(-7, 19, 8, -5, 20, 32),
		Block.createCuboidShape(4, 19, 8, 6, 20, 32),
		Block.createCuboidShape(6, 14, 8, 7, 20, 32),
		Block.createCuboidShape(-8, 0, 8, -7, 20, 32),
		Block.createCuboidShape(-3, 15, 17, 1, 16, 23),
		Block.createCuboidShape(-6, 20, 19, -5, 25, 21)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-9, 16, -3, 1, 18, 3),
		Block.createCuboidShape(-8, 16, 1, 0, 20, 4),
		Block.createCuboidShape(-8, 16, -5, 0, 20, -3),
		Block.createCuboidShape(-8, 1, -2, -3, 15, -1),
		Block.createCuboidShape(-16, 19, -5, -10, 20, 4),
		Block.createCuboidShape(2, 19, -5, 8, 20, 4),
		Block.createCuboidShape(-16, 19, -7, 8, 20, -5),
		Block.createCuboidShape(-16, 19, 4, 8, 20, 6),
		Block.createCuboidShape(-16, 14, 6, 8, 20, 7),
		Block.createCuboidShape(-16, 0, -8, 8, 20, -7),
		Block.createCuboidShape(-7, 15, -3, -1, 16, 1),
		Block.createCuboidShape(-5, 20, -6, -3, 25, -5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(13, 16, -9, 19, 18, 1),
		Block.createCuboidShape(12, 16, -8, 15, 20, 0),
		Block.createCuboidShape(19, 16, -8, 21, 20, 0),
		Block.createCuboidShape(17, 1, -8, 18, 15, -3),
		Block.createCuboidShape(12, 19, -16, 21, 20, -10),
		Block.createCuboidShape(12, 19, 2, 21, 20, 8),
		Block.createCuboidShape(21, 19, -16, 23, 20, 8),
		Block.createCuboidShape(10, 19, -16, 12, 20, 8),
		Block.createCuboidShape(9, 14, -16, 10, 20, 8),
		Block.createCuboidShape(23, 0, -16, 24, 20, 8),
		Block.createCuboidShape(15, 15, -7, 19, 16, -1),
		Block.createCuboidShape(21, 20, -5, 22, 25, -3)
    );

    public Yf10_Data() {
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

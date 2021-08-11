package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Yf9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-9, 16, 13, 1, 18, 19),
		Block.createCuboidShape(-8, 16, 12, 0, 20, 15),
		Block.createCuboidShape(-8, 16, 19, 0, 20, 21),
		Block.createCuboidShape(-5, 1, 17, 0, 15, 18),
		Block.createCuboidShape(2, 19, 12, 8, 20, 21),
		Block.createCuboidShape(-16, 19, 12, -10, 20, 21),
		Block.createCuboidShape(-16, 19, 21, 8, 20, 23),
		Block.createCuboidShape(-16, 19, 10, 8, 20, 12),
		Block.createCuboidShape(-16, 14, 9, 8, 20, 10),
		Block.createCuboidShape(-16, 0, 23, 8, 20, 24),
		Block.createCuboidShape(-7, 15, 15, -1, 16, 19),
		Block.createCuboidShape(-5, 20, 21, -3, 25, 22)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-3, 16, -9, 3, 18, 1),
		Block.createCuboidShape(1, 16, -8, 4, 20, 0),
		Block.createCuboidShape(-5, 16, -8, -3, 20, 0),
		Block.createCuboidShape(-2, 1, -5, -1, 15, 0),
		Block.createCuboidShape(-5, 19, 2, 4, 20, 8),
		Block.createCuboidShape(-5, 19, -16, 4, 20, -10),
		Block.createCuboidShape(-7, 19, -16, -5, 20, 8),
		Block.createCuboidShape(4, 19, -16, 6, 20, 8),
		Block.createCuboidShape(6, 14, -16, 7, 20, 8),
		Block.createCuboidShape(-8, 0, -16, -7, 20, 8),
		Block.createCuboidShape(-3, 15, -7, 1, 16, -1),
		Block.createCuboidShape(-6, 20, -5, -5, 25, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, 16, -3, 25, 18, 3),
		Block.createCuboidShape(16, 16, 1, 24, 20, 4),
		Block.createCuboidShape(16, 16, -5, 24, 20, -3),
		Block.createCuboidShape(16, 1, -2, 21, 15, -1),
		Block.createCuboidShape(8, 19, -5, 14, 20, 4),
		Block.createCuboidShape(26, 19, -5, 32, 20, 4),
		Block.createCuboidShape(8, 19, -7, 32, 20, -5),
		Block.createCuboidShape(8, 19, 4, 32, 20, 6),
		Block.createCuboidShape(8, 14, 6, 32, 20, 7),
		Block.createCuboidShape(8, 0, -8, 32, 20, -7),
		Block.createCuboidShape(17, 15, -3, 23, 16, 1),
		Block.createCuboidShape(19, 20, -6, 21, 25, -5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(13, 16, 15, 19, 18, 25),
		Block.createCuboidShape(12, 16, 16, 15, 20, 24),
		Block.createCuboidShape(19, 16, 16, 21, 20, 24),
		Block.createCuboidShape(17, 1, 16, 18, 15, 21),
		Block.createCuboidShape(12, 19, 8, 21, 20, 14),
		Block.createCuboidShape(12, 19, 26, 21, 20, 32),
		Block.createCuboidShape(21, 19, 8, 23, 20, 32),
		Block.createCuboidShape(10, 19, 8, 12, 20, 32),
		Block.createCuboidShape(9, 14, 8, 10, 20, 32),
		Block.createCuboidShape(23, 0, 8, 24, 20, 32),
		Block.createCuboidShape(15, 15, 17, 19, 16, 23),
		Block.createCuboidShape(21, 20, 19, 22, 25, 21)
    );

    public Yf9_Data() {
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

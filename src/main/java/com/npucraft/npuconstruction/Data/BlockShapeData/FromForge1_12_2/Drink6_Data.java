package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Drink6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, -1, 15, 4, 7),
		Block.createCuboidShape(3, 6, -3, 8, 10, 8),
		Block.createCuboidShape(15, -8, -5, 16, 24, 8),
		Block.createCuboidShape(0, -8, -4, 16, 32, -3),
		Block.createCuboidShape(0, -16, -4, 16, -8, 16),
		Block.createCuboidShape(7, 12, 0, 9, 16, 6),
		Block.createCuboidShape(0, 24, -3, 16, 32, 16),
		Block.createCuboidShape(0, -8, 8, 16, 24, 16),
		Block.createCuboidShape(0, -8, -3, 1, 24, 8),
		Block.createCuboidShape(1, 17, -3, 15, 18, 8),
		Block.createCuboidShape(1, 21, 4, 15, 23, 8),
		Block.createCuboidShape(1, 23, -3, 15, 24, 8),
		Block.createCuboidShape(1, 11, -3, 15, 12, 8),
		Block.createCuboidShape(1, 5, -3, 15, 6, 8),
		Block.createCuboidShape(1, -1, -3, 15, 0, 8),
		Block.createCuboidShape(1, -8, -3, 15, -7, 8),
		Block.createCuboidShape(1, -7, -3, 15, -6, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 0, 1, 17, 4, 15),
		Block.createCuboidShape(8, 6, 3, 19, 10, 8),
		Block.createCuboidShape(8, -8, 15, 21, 24, 16),
		Block.createCuboidShape(19, -8, 0, 20, 32, 16),
		Block.createCuboidShape(0, -16, 0, 20, -8, 16),
		Block.createCuboidShape(10, 12, 7, 16, 16, 9),
		Block.createCuboidShape(0, 24, 0, 19, 32, 16),
		Block.createCuboidShape(0, -8, 0, 8, 24, 16),
		Block.createCuboidShape(8, -8, 0, 19, 24, 1),
		Block.createCuboidShape(8, 17, 1, 19, 18, 15),
		Block.createCuboidShape(8, 21, 1, 12, 23, 15),
		Block.createCuboidShape(8, 23, 1, 19, 24, 15),
		Block.createCuboidShape(8, 11, 1, 19, 12, 15),
		Block.createCuboidShape(8, 5, 1, 19, 6, 15),
		Block.createCuboidShape(8, -1, 1, 19, 0, 15),
		Block.createCuboidShape(8, -8, 1, 19, -7, 15),
		Block.createCuboidShape(8, -7, 1, 19, -6, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 9, 15, 4, 17),
		Block.createCuboidShape(8, 6, 8, 13, 10, 19),
		Block.createCuboidShape(0, -8, 8, 1, 24, 21),
		Block.createCuboidShape(0, -8, 19, 16, 32, 20),
		Block.createCuboidShape(0, -16, 0, 16, -8, 20),
		Block.createCuboidShape(7, 12, 10, 9, 16, 16),
		Block.createCuboidShape(0, 24, 0, 16, 32, 19),
		Block.createCuboidShape(0, -8, 0, 16, 24, 8),
		Block.createCuboidShape(15, -8, 8, 16, 24, 19),
		Block.createCuboidShape(1, 17, 8, 15, 18, 19),
		Block.createCuboidShape(1, 21, 8, 15, 23, 12),
		Block.createCuboidShape(1, 23, 8, 15, 24, 19),
		Block.createCuboidShape(1, 11, 8, 15, 12, 19),
		Block.createCuboidShape(1, 5, 8, 15, 6, 19),
		Block.createCuboidShape(1, -1, 8, 15, 0, 19),
		Block.createCuboidShape(1, -8, 8, 15, -7, 19),
		Block.createCuboidShape(1, -7, 8, 15, -6, 19)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 1, 7, 4, 15),
		Block.createCuboidShape(-3, 6, 8, 8, 10, 13),
		Block.createCuboidShape(-5, -8, 0, 8, 24, 1),
		Block.createCuboidShape(-4, -8, 0, -3, 32, 16),
		Block.createCuboidShape(-4, -16, 0, 16, -8, 16),
		Block.createCuboidShape(0, 12, 7, 6, 16, 9),
		Block.createCuboidShape(-3, 24, 0, 16, 32, 16),
		Block.createCuboidShape(8, -8, 0, 16, 24, 16),
		Block.createCuboidShape(-3, -8, 15, 8, 24, 16),
		Block.createCuboidShape(-3, 17, 1, 8, 18, 15),
		Block.createCuboidShape(4, 21, 1, 8, 23, 15),
		Block.createCuboidShape(-3, 23, 1, 8, 24, 15),
		Block.createCuboidShape(-3, 11, 1, 8, 12, 15),
		Block.createCuboidShape(-3, 5, 1, 8, 6, 15),
		Block.createCuboidShape(-3, -1, 1, 8, 0, 15),
		Block.createCuboidShape(-3, -8, 1, 8, -7, 15),
		Block.createCuboidShape(-3, -7, 1, 8, -6, 15)
    );

    public Drink6_Data() {
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

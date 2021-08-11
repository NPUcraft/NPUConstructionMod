package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fext_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, -16, 3, 15, -6, 6),
		Block.createCuboidShape(2, -16, 3, 7, -6, 6),
		Block.createCuboidShape(0, -14, -1, 16, 20, 0),
		Block.createCuboidShape(1, 9, 2, 12, 19, 7),
		Block.createCuboidShape(0, -16, -1, 16, -13, 0),
		Block.createCuboidShape(1, -2, 2, 9, 6, 6),
		Block.createCuboidShape(15, -14, -1, 16, 20, 0),
		Block.createCuboidShape(0, -14, -1, 1, 20, 0),
		Block.createCuboidShape(2, -6, 4, 14, -5, 5),
		Block.createCuboidShape(0, 19, -1, 16, 20, 0),
		Block.createCuboidShape(0, -16, 9, 16, 32, 16),
		Block.createCuboidShape(16, -16, 0, 16, 20, 9),
		Block.createCuboidShape(0, -16, 0, 0, 20, 9),
		Block.createCuboidShape(0, -16, 0, 16, -16, 9),
		Block.createCuboidShape(0, 20, 0, 16, 32, 9),
		Block.createCuboidShape(0, -3, 0, 16, -2, 9),
		Block.createCuboidShape(0, 13, 2, 1, 15, 9),
		Block.createCuboidShape(0, 13, 1, 9, 15, 2),
		Block.createCuboidShape(13, 1, 4, 15, 5, 6),
		Block.createCuboidShape(10, -2, 6, 12, 2, 8),
		Block.createCuboidShape(1, -3, -1, 15, -2, 0)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, -16, 10, 13, -6, 15),
		Block.createCuboidShape(10, -16, 2, 13, -6, 7),
		Block.createCuboidShape(16, -14, 0, 17, 20, 16),
		Block.createCuboidShape(9, 9, 1, 14, 19, 12),
		Block.createCuboidShape(16, -16, 0, 17, -13, 16),
		Block.createCuboidShape(10, -2, 1, 14, 6, 9),
		Block.createCuboidShape(16, -14, 15, 17, 20, 16),
		Block.createCuboidShape(16, -14, 0, 17, 20, 1),
		Block.createCuboidShape(11, -6, 2, 12, -5, 14),
		Block.createCuboidShape(16, 19, 0, 17, 20, 16),
		Block.createCuboidShape(0, -16, 0, 7, 32, 16),
		Block.createCuboidShape(7, -16, 16, 16, 20, 16),
		Block.createCuboidShape(7, -16, 0, 16, 20, 0),
		Block.createCuboidShape(7, -16, 0, 16, -16, 16),
		Block.createCuboidShape(7, 20, 0, 16, 32, 16),
		Block.createCuboidShape(7, -3, 0, 16, -2, 16),
		Block.createCuboidShape(7, 13, 0, 14, 15, 1),
		Block.createCuboidShape(14, 13, 0, 15, 15, 9),
		Block.createCuboidShape(10, 1, 13, 12, 5, 15),
		Block.createCuboidShape(8, -2, 10, 10, 2, 12),
		Block.createCuboidShape(16, -3, 1, 17, -2, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -16, 10, 6, -6, 13),
		Block.createCuboidShape(9, -16, 10, 14, -6, 13),
		Block.createCuboidShape(0, -14, 16, 16, 20, 17),
		Block.createCuboidShape(4, 9, 9, 15, 19, 14),
		Block.createCuboidShape(0, -16, 16, 16, -13, 17),
		Block.createCuboidShape(7, -2, 10, 15, 6, 14),
		Block.createCuboidShape(0, -14, 16, 1, 20, 17),
		Block.createCuboidShape(15, -14, 16, 16, 20, 17),
		Block.createCuboidShape(2, -6, 11, 14, -5, 12),
		Block.createCuboidShape(0, 19, 16, 16, 20, 17),
		Block.createCuboidShape(0, -16, 0, 16, 32, 7),
		Block.createCuboidShape(0, -16, 7, 0, 20, 16),
		Block.createCuboidShape(16, -16, 7, 16, 20, 16),
		Block.createCuboidShape(0, -16, 7, 16, -16, 16),
		Block.createCuboidShape(0, 20, 7, 16, 32, 16),
		Block.createCuboidShape(0, -3, 7, 16, -2, 16),
		Block.createCuboidShape(15, 13, 7, 16, 15, 14),
		Block.createCuboidShape(7, 13, 14, 16, 15, 15),
		Block.createCuboidShape(1, 1, 10, 3, 5, 12),
		Block.createCuboidShape(4, -2, 8, 6, 2, 10),
		Block.createCuboidShape(1, -3, 16, 15, -2, 17)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, -16, 1, 6, -6, 6),
		Block.createCuboidShape(3, -16, 9, 6, -6, 14),
		Block.createCuboidShape(-1, -14, 0, 0, 20, 16),
		Block.createCuboidShape(2, 9, 4, 7, 19, 15),
		Block.createCuboidShape(-1, -16, 0, 0, -13, 16),
		Block.createCuboidShape(2, -2, 7, 6, 6, 15),
		Block.createCuboidShape(-1, -14, 0, 0, 20, 1),
		Block.createCuboidShape(-1, -14, 15, 0, 20, 16),
		Block.createCuboidShape(4, -6, 2, 5, -5, 14),
		Block.createCuboidShape(-1, 19, 0, 0, 20, 16),
		Block.createCuboidShape(9, -16, 0, 16, 32, 16),
		Block.createCuboidShape(0, -16, 0, 9, 20, 0),
		Block.createCuboidShape(0, -16, 16, 9, 20, 16),
		Block.createCuboidShape(0, -16, 0, 9, -16, 16),
		Block.createCuboidShape(0, 20, 0, 9, 32, 16),
		Block.createCuboidShape(0, -3, 0, 9, -2, 16),
		Block.createCuboidShape(2, 13, 15, 9, 15, 16),
		Block.createCuboidShape(1, 13, 7, 2, 15, 16),
		Block.createCuboidShape(4, 1, 1, 6, 5, 3),
		Block.createCuboidShape(6, -2, 4, 8, 2, 6),
		Block.createCuboidShape(-1, -3, 1, 0, -2, 15)
    );

    public Fext_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstation1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, -1, -6, 19, 17, -2),
		Block.createCuboidShape(-6, -1, -3, -2, 17, 3),
		Block.createCuboidShape(-3, -1, 18, 3, 17, 22),
		Block.createCuboidShape(18, -1, 13, 22, 17, 19),
		Block.createCuboidShape(11, 0, 6, 13, 16, 10),
		Block.createCuboidShape(13, 0, -3, 14, 1, 19),
		Block.createCuboidShape(8, 5, 5, 14, 6, 11),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(-6, -5, 0, 22, -4, 1),
		Block.createCuboidShape(-6, 19, 0, 22, 20, 1),
		Block.createCuboidShape(11, 2, 9, 12, 2, 26),
		Block.createCuboidShape(-5, 13, 6, 12, 14, 7),
		Block.createCuboidShape(0, -14, 0, 1, 30, 1),
		Block.createCuboidShape(15, -14, 0, 16, 30, 1),
		Block.createCuboidShape(0, -14, 15, 1, 30, 16),
		Block.createCuboidShape(15, -14, 15, 16, 30, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(18, -1, 13, 22, 17, 19),
		Block.createCuboidShape(13, -1, -6, 19, 17, -2),
		Block.createCuboidShape(-6, -1, -3, -2, 17, 3),
		Block.createCuboidShape(-3, -1, 18, 3, 17, 22),
		Block.createCuboidShape(6, 0, 11, 10, 16, 13),
		Block.createCuboidShape(-3, 0, 13, 19, 1, 14),
		Block.createCuboidShape(5, 5, 8, 11, 6, 14),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(15, -5, -6, 16, -4, 22),
		Block.createCuboidShape(15, 19, -6, 16, 20, 22),
		Block.createCuboidShape(-10, 2, 11, 7, 2, 12),
		Block.createCuboidShape(9, 13, -5, 10, 14, 12),
		Block.createCuboidShape(15, -14, 0, 16, 30, 1),
		Block.createCuboidShape(15, -14, 15, 16, 30, 16),
		Block.createCuboidShape(0, -14, 0, 1, 30, 1),
		Block.createCuboidShape(0, -14, 15, 1, 30, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-3, -1, 18, 3, 17, 22),
		Block.createCuboidShape(18, -1, 13, 22, 17, 19),
		Block.createCuboidShape(13, -1, -6, 19, 17, -2),
		Block.createCuboidShape(-6, -1, -3, -2, 17, 3),
		Block.createCuboidShape(3, 0, 6, 5, 16, 10),
		Block.createCuboidShape(2, 0, -3, 3, 1, 19),
		Block.createCuboidShape(2, 5, 5, 8, 6, 11),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(-6, -5, 15, 22, -4, 16),
		Block.createCuboidShape(-6, 19, 15, 22, 20, 16),
		Block.createCuboidShape(4, 2, -10, 5, 2, 7),
		Block.createCuboidShape(4, 13, 9, 21, 14, 10),
		Block.createCuboidShape(15, -14, 15, 16, 30, 16),
		Block.createCuboidShape(0, -14, 15, 1, 30, 16),
		Block.createCuboidShape(15, -14, 0, 16, 30, 1),
		Block.createCuboidShape(0, -14, 0, 1, 30, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-6, -1, -3, -2, 17, 3),
		Block.createCuboidShape(-3, -1, 18, 3, 17, 22),
		Block.createCuboidShape(18, -1, 13, 22, 17, 19),
		Block.createCuboidShape(13, -1, -6, 19, 17, -2),
		Block.createCuboidShape(6, 0, 3, 10, 16, 5),
		Block.createCuboidShape(-3, 0, 2, 19, 1, 3),
		Block.createCuboidShape(5, 5, 2, 11, 6, 8),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(0, -5, -6, 1, -4, 22),
		Block.createCuboidShape(0, 19, -6, 1, 20, 22),
		Block.createCuboidShape(9, 2, 4, 26, 2, 5),
		Block.createCuboidShape(6, 13, 4, 7, 14, 21),
		Block.createCuboidShape(0, -14, 15, 1, 30, 16),
		Block.createCuboidShape(0, -14, 0, 1, 30, 1),
		Block.createCuboidShape(15, -14, 15, 16, 30, 16),
		Block.createCuboidShape(15, -14, 0, 16, 30, 1)
    );

    public Fstation1_Data() {
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

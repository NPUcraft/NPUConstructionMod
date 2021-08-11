package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstation_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, 1, -3, 14, 4, 19),
		Block.createCuboidShape(18, -7, -3, 22, 27, 4),
		Block.createCuboidShape(-6, -7, -3, -2, 27, 4),
		Block.createCuboidShape(-6, -7, 12, -2, 27, 19),
		Block.createCuboidShape(18, -7, 12, 22, 27, 19),
		Block.createCuboidShape(11, 0, 6, 13, 16, 10),
		Block.createCuboidShape(18, 27, -3, 22, 27, 19),
		Block.createCuboidShape(18, -7, -3, 22, -7, 19),
		Block.createCuboidShape(-6, 27, -3, -2, 27, 19),
		Block.createCuboidShape(-6, -7, -3, -2, -7, 19),
		Block.createCuboidShape(8, 5, 5, 14, 6, 11),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(-6, -7, 0, 22, -6, 1),
		Block.createCuboidShape(-6, 21, 0, 22, 22, 1),
		Block.createCuboidShape(11, 2, 9, 12, 2, 26),
		Block.createCuboidShape(11, 7, -10, 12, 7, 7),
		Block.createCuboidShape(0, -16, 0, 1, 32, 1),
		Block.createCuboidShape(15, -16, 0, 16, 32, 1),
		Block.createCuboidShape(0, -16, 15, 1, 32, 16),
		Block.createCuboidShape(15, -16, 15, 16, 32, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-3, 1, 13, 19, 4, 14),
		Block.createCuboidShape(12, -7, 18, 19, 27, 22),
		Block.createCuboidShape(12, -7, -6, 19, 27, -2),
		Block.createCuboidShape(-3, -7, -6, 4, 27, -2),
		Block.createCuboidShape(-3, -7, 18, 4, 27, 22),
		Block.createCuboidShape(6, 0, 11, 10, 16, 13),
		Block.createCuboidShape(-3, 27, 18, 19, 27, 22),
		Block.createCuboidShape(-3, -7, 18, 19, -7, 22),
		Block.createCuboidShape(-3, 27, -6, 19, 27, -2),
		Block.createCuboidShape(-3, -7, -6, 19, -7, -2),
		Block.createCuboidShape(5, 5, 8, 11, 6, 14),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(15, -7, -6, 16, -6, 22),
		Block.createCuboidShape(15, 21, -6, 16, 22, 22),
		Block.createCuboidShape(-10, 2, 11, 7, 2, 12),
		Block.createCuboidShape(9, 7, 11, 26, 7, 12),
		Block.createCuboidShape(15, -16, 0, 16, 32, 1),
		Block.createCuboidShape(15, -16, 15, 16, 32, 16),
		Block.createCuboidShape(0, -16, 0, 1, 32, 1),
		Block.createCuboidShape(0, -16, 15, 1, 32, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 1, -3, 3, 4, 19),
		Block.createCuboidShape(-6, -7, 12, -2, 27, 19),
		Block.createCuboidShape(18, -7, 12, 22, 27, 19),
		Block.createCuboidShape(18, -7, -3, 22, 27, 4),
		Block.createCuboidShape(-6, -7, -3, -2, 27, 4),
		Block.createCuboidShape(3, 0, 6, 5, 16, 10),
		Block.createCuboidShape(-6, 27, -3, -2, 27, 19),
		Block.createCuboidShape(-6, -7, -3, -2, -7, 19),
		Block.createCuboidShape(18, 27, -3, 22, 27, 19),
		Block.createCuboidShape(18, -7, -3, 22, -7, 19),
		Block.createCuboidShape(2, 5, 5, 8, 6, 11),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(-6, -7, 15, 22, -6, 16),
		Block.createCuboidShape(-6, 21, 15, 22, 22, 16),
		Block.createCuboidShape(4, 2, -10, 5, 2, 7),
		Block.createCuboidShape(4, 7, 9, 5, 7, 26),
		Block.createCuboidShape(15, -16, 15, 16, 32, 16),
		Block.createCuboidShape(0, -16, 15, 1, 32, 16),
		Block.createCuboidShape(15, -16, 0, 16, 32, 1),
		Block.createCuboidShape(0, -16, 0, 1, 32, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-3, 1, 2, 19, 4, 3),
		Block.createCuboidShape(-3, -7, -6, 4, 27, -2),
		Block.createCuboidShape(-3, -7, 18, 4, 27, 22),
		Block.createCuboidShape(12, -7, 18, 19, 27, 22),
		Block.createCuboidShape(12, -7, -6, 19, 27, -2),
		Block.createCuboidShape(6, 0, 3, 10, 16, 5),
		Block.createCuboidShape(-3, 27, -6, 19, 27, -2),
		Block.createCuboidShape(-3, -7, -6, 19, -7, -2),
		Block.createCuboidShape(-3, 27, 18, 19, 27, 22),
		Block.createCuboidShape(-3, -7, 18, 19, -7, 22),
		Block.createCuboidShape(5, 5, 2, 11, 6, 8),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(0, -7, -6, 1, -6, 22),
		Block.createCuboidShape(0, 21, -6, 1, 22, 22),
		Block.createCuboidShape(9, 2, 4, 26, 2, 5),
		Block.createCuboidShape(-10, 7, 4, 7, 7, 5),
		Block.createCuboidShape(0, -16, 15, 1, 32, 16),
		Block.createCuboidShape(0, -16, 0, 1, 32, 1),
		Block.createCuboidShape(15, -16, 15, 16, 32, 16),
		Block.createCuboidShape(15, -16, 0, 16, 32, 1)
    );

    public Fstation_Data() {
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

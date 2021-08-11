package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bike3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 3, 5, 19, 7, 7),
		Block.createCuboidShape(-5, 9, 7, 20, 11, 9),
		Block.createCuboidShape(-5, 10, 7, 11, 16, 9),
		Block.createCuboidShape(19, 0, 9, 20, 14, 10),
		Block.createCuboidShape(2, 5, 5, 12, 9, 5),
		Block.createCuboidShape(6, 6, 10, 19, 7, 12),
		Block.createCuboidShape(-10, 0, 9, -2, 13, 9),
		Block.createCuboidShape(-3, 6, 6, -2, 16, 10),
		Block.createCuboidShape(16, 5, 6, 17, 15, 10),
		Block.createCuboidShape(21, 7, 6, 21, 15, 10),
		Block.createCuboidShape(17, 15, 6, 24, 15, 10),
		Block.createCuboidShape(-11, 6, 9, 26, 7, 9),
		Block.createCuboidShape(10, 7, 7, 11, 21, 9),
		Block.createCuboidShape(-1, 19, 2, 0, 20, 14),
		Block.createCuboidShape(11, 20, 7, 17, 21, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 3, 6, 11, 7, 19),
		Block.createCuboidShape(7, 9, -5, 9, 11, 20),
		Block.createCuboidShape(7, 10, -5, 9, 16, 11),
		Block.createCuboidShape(6, 0, 19, 7, 14, 20),
		Block.createCuboidShape(11, 5, 2, 11, 9, 12),
		Block.createCuboidShape(4, 6, 6, 6, 7, 19),
		Block.createCuboidShape(7, 0, -10, 7, 13, -2),
		Block.createCuboidShape(6, 6, -3, 10, 16, -2),
		Block.createCuboidShape(6, 5, 16, 10, 15, 17),
		Block.createCuboidShape(6, 7, 21, 10, 15, 21),
		Block.createCuboidShape(6, 15, 17, 10, 15, 24),
		Block.createCuboidShape(7, 6, -11, 7, 7, 26),
		Block.createCuboidShape(7, 7, 10, 9, 21, 11),
		Block.createCuboidShape(2, 19, -1, 14, 20, 0),
		Block.createCuboidShape(7, 20, 11, 9, 21, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 3, 9, 10, 7, 11),
		Block.createCuboidShape(-4, 9, 7, 21, 11, 9),
		Block.createCuboidShape(5, 10, 7, 21, 16, 9),
		Block.createCuboidShape(-4, 0, 6, -3, 14, 7),
		Block.createCuboidShape(4, 5, 11, 14, 9, 11),
		Block.createCuboidShape(-3, 6, 4, 10, 7, 6),
		Block.createCuboidShape(18, 0, 7, 26, 13, 7),
		Block.createCuboidShape(18, 6, 6, 19, 16, 10),
		Block.createCuboidShape(-1, 5, 6, 0, 15, 10),
		Block.createCuboidShape(-5, 7, 6, -5, 15, 10),
		Block.createCuboidShape(-8, 15, 6, -1, 15, 10),
		Block.createCuboidShape(-10, 6, 7, 27, 7, 7),
		Block.createCuboidShape(5, 7, 7, 6, 21, 9),
		Block.createCuboidShape(16, 19, 2, 17, 20, 14),
		Block.createCuboidShape(-1, 20, 7, 5, 21, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 3, -3, 7, 7, 10),
		Block.createCuboidShape(7, 9, -4, 9, 11, 21),
		Block.createCuboidShape(7, 10, 5, 9, 16, 21),
		Block.createCuboidShape(9, 0, -4, 10, 14, -3),
		Block.createCuboidShape(5, 5, 4, 5, 9, 14),
		Block.createCuboidShape(10, 6, -3, 12, 7, 10),
		Block.createCuboidShape(9, 0, 18, 9, 13, 26),
		Block.createCuboidShape(6, 6, 18, 10, 16, 19),
		Block.createCuboidShape(6, 5, -1, 10, 15, 0),
		Block.createCuboidShape(6, 7, -5, 10, 15, -5),
		Block.createCuboidShape(6, 15, -8, 10, 15, -1),
		Block.createCuboidShape(9, 6, -10, 9, 7, 27),
		Block.createCuboidShape(7, 7, 5, 9, 21, 6),
		Block.createCuboidShape(2, 19, 16, 14, 20, 17),
		Block.createCuboidShape(7, 20, -1, 9, 21, 5)
    );

    public Bike3_Data() {
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

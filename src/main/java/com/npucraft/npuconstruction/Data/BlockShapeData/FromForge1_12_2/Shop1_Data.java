package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Shop1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(15, -14, 2, 16, 26, 16),
		Block.createCuboidShape(-1, 8, 0, 15, 26, 15),
		Block.createCuboidShape(3, 1, 0, 11, 8, 0),
		Block.createCuboidShape(-2, -14, 0, -1, 26, 16),
		Block.createCuboidShape(3, 0, 0, 11, 1, 8),
		Block.createCuboidShape(-1, -14, 15, 15, 26, 16),
		Block.createCuboidShape(-1, -14, 0, 15, 0, 15),
		Block.createCuboidShape(-1, 0, 0, 3, 8, 15),
		Block.createCuboidShape(11, 0, 0, 15, 8, 15),
		Block.createCuboidShape(15, -14, 0, 16, 24, 1),
		Block.createCuboidShape(3, 0, 9, 11, 8, 15),
		Block.createCuboidShape(17, 12, 3, 19, 23, 6)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -14, 15, 14, 26, 16),
		Block.createCuboidShape(1, 8, -1, 16, 26, 15),
		Block.createCuboidShape(16, 1, 3, 16, 8, 11),
		Block.createCuboidShape(0, -14, -2, 16, 26, -1),
		Block.createCuboidShape(8, 0, 3, 16, 1, 11),
		Block.createCuboidShape(0, -14, -1, 1, 26, 15),
		Block.createCuboidShape(1, -14, -1, 16, 0, 15),
		Block.createCuboidShape(1, 0, -1, 16, 8, 3),
		Block.createCuboidShape(1, 0, 11, 16, 8, 15),
		Block.createCuboidShape(15, -14, 15, 16, 24, 16),
		Block.createCuboidShape(1, 0, 3, 7, 8, 11),
		Block.createCuboidShape(10, 12, 17, 13, 23, 19)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -14, 0, 1, 26, 14),
		Block.createCuboidShape(1, 8, 1, 17, 26, 16),
		Block.createCuboidShape(5, 1, 16, 13, 8, 16),
		Block.createCuboidShape(17, -14, 0, 18, 26, 16),
		Block.createCuboidShape(5, 0, 8, 13, 1, 16),
		Block.createCuboidShape(1, -14, 0, 17, 26, 1),
		Block.createCuboidShape(1, -14, 1, 17, 0, 16),
		Block.createCuboidShape(13, 0, 1, 17, 8, 16),
		Block.createCuboidShape(1, 0, 1, 5, 8, 16),
		Block.createCuboidShape(0, -14, 15, 1, 24, 16),
		Block.createCuboidShape(5, 0, 1, 13, 8, 7),
		Block.createCuboidShape(-3, 12, 10, -1, 23, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, -14, 0, 16, 26, 1),
		Block.createCuboidShape(0, 8, 1, 15, 26, 17),
		Block.createCuboidShape(0, 1, 5, 0, 8, 13),
		Block.createCuboidShape(0, -14, 17, 16, 26, 18),
		Block.createCuboidShape(0, 0, 5, 8, 1, 13),
		Block.createCuboidShape(15, -14, 1, 16, 26, 17),
		Block.createCuboidShape(0, -14, 1, 15, 0, 17),
		Block.createCuboidShape(0, 0, 13, 15, 8, 17),
		Block.createCuboidShape(0, 0, 1, 15, 8, 5),
		Block.createCuboidShape(0, -14, 0, 1, 24, 1),
		Block.createCuboidShape(9, 0, 5, 15, 8, 13),
		Block.createCuboidShape(3, 12, -3, 6, 23, -1)
    );

    public Shop1_Data() {
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

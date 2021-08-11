package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class A_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 3, 15, 17, 25, 16),
		Block.createCuboidShape(-7, -8, 15, 5, 4, 16),
		Block.createCuboidShape(14, -8, 15, 21, 8, 16),
		Block.createCuboidShape(13, -8, 15, 26, -6, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 3, -2, 1, 25, 17),
		Block.createCuboidShape(0, -8, -7, 1, 4, 5),
		Block.createCuboidShape(0, -8, 14, 1, 8, 21),
		Block.createCuboidShape(0, -8, 13, 1, -6, 26)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 3, 0, 18, 25, 1),
		Block.createCuboidShape(11, -8, 0, 23, 4, 1),
		Block.createCuboidShape(-5, -8, 0, 2, 8, 1),
		Block.createCuboidShape(-10, -8, 0, 3, -6, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 3, -1, 16, 25, 18),
		Block.createCuboidShape(15, -8, 11, 16, 4, 23),
		Block.createCuboidShape(15, -8, -5, 16, 8, 2),
		Block.createCuboidShape(15, -8, -10, 16, -6, 3)
    );

    public A_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class D_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 18, 15, 26, 23, 16),
		Block.createCuboidShape(-9, 2, 15, 1, 18, 16),
		Block.createCuboidShape(-3, -8, 15, 26, -5, 16),
		Block.createCuboidShape(-8, -5, 15, 7, 2, 16),
		Block.createCuboidShape(15, -7, 15, 22, 22, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 18, -5, 1, 23, 26),
		Block.createCuboidShape(0, 2, -9, 1, 18, 1),
		Block.createCuboidShape(0, -8, -3, 1, -5, 26),
		Block.createCuboidShape(0, -5, -8, 1, 2, 7),
		Block.createCuboidShape(0, -7, 15, 1, 22, 22)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-10, 18, 0, 21, 23, 1),
		Block.createCuboidShape(15, 2, 0, 25, 18, 1),
		Block.createCuboidShape(-10, -8, 0, 19, -5, 1),
		Block.createCuboidShape(9, -5, 0, 24, 2, 1),
		Block.createCuboidShape(-6, -7, 0, 1, 22, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 18, -10, 16, 23, 21),
		Block.createCuboidShape(15, 2, 15, 16, 18, 25),
		Block.createCuboidShape(15, -8, -10, 16, -5, 19),
		Block.createCuboidShape(15, -5, 9, 16, 2, 24),
		Block.createCuboidShape(15, -7, -6, 16, 22, 1)
    );

    public D_Data() {
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

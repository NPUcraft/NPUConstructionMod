package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence11_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 7, 1, 7, 9),
		Block.createCuboidShape(15, -16, 7, 16, -8, 9),
		Block.createCuboidShape(-8, -10, 7, 16, -9, 9),
		Block.createCuboidShape(-8, -13, 7, 15, -12, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 0, 9, 7, 1),
		Block.createCuboidShape(7, -16, 15, 9, -8, 16),
		Block.createCuboidShape(7, -10, -8, 9, -9, 16),
		Block.createCuboidShape(7, -13, -8, 9, -12, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, -16, 7, 16, 7, 9),
		Block.createCuboidShape(0, -16, 7, 1, -8, 9),
		Block.createCuboidShape(0, -10, 7, 24, -9, 9),
		Block.createCuboidShape(1, -13, 7, 24, -12, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 15, 9, 7, 16),
		Block.createCuboidShape(7, -16, 0, 9, -8, 1),
		Block.createCuboidShape(7, -10, 0, 9, -9, 24),
		Block.createCuboidShape(7, -13, 1, 9, -12, 24)
    );

    public Fence11_Data() {
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

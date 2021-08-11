package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, -16, 7, 1, 6, 9),
		Block.createCuboidShape(15, -16, 7, 16, -1, 9),
		Block.createCuboidShape(-2, -1, 7, 16, 0, 9),
		Block.createCuboidShape(-2, -5, 7, 15, -4, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, -16, -1, 9, 6, 1),
		Block.createCuboidShape(7, -16, 15, 9, -1, 16),
		Block.createCuboidShape(7, -1, -2, 9, 0, 16),
		Block.createCuboidShape(7, -5, -2, 9, -4, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, -16, 7, 17, 6, 9),
		Block.createCuboidShape(0, -16, 7, 1, -1, 9),
		Block.createCuboidShape(0, -1, 7, 18, 0, 9),
		Block.createCuboidShape(1, -5, 7, 18, -4, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 15, 9, 6, 17),
		Block.createCuboidShape(7, -16, 0, 9, -1, 1),
		Block.createCuboidShape(7, -1, 0, 9, 0, 18),
		Block.createCuboidShape(7, -5, 1, 9, -4, 18)
    );

    public Fence9_Data() {
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

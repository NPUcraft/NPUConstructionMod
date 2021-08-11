package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(15, 0, 7, 16, 8, 9),
		Block.createCuboidShape(-2, 7, 7, 16, 8, 9),
		Block.createCuboidShape(-2, 3, 7, 15, 4, 9),
		Block.createCuboidShape(0, 0, 7, 1, 14, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 15, 9, 8, 16),
		Block.createCuboidShape(7, 7, -2, 9, 8, 16),
		Block.createCuboidShape(7, 3, -2, 9, 4, 15),
		Block.createCuboidShape(7, 0, 0, 9, 14, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 7, 1, 8, 9),
		Block.createCuboidShape(0, 7, 7, 18, 8, 9),
		Block.createCuboidShape(1, 3, 7, 18, 4, 9),
		Block.createCuboidShape(15, 0, 7, 16, 14, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 0, 9, 8, 1),
		Block.createCuboidShape(7, 7, 0, 9, 8, 18),
		Block.createCuboidShape(7, 3, 1, 9, 4, 18),
		Block.createCuboidShape(7, 0, 15, 9, 14, 16)
    );

    public Fence10_Data() {
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

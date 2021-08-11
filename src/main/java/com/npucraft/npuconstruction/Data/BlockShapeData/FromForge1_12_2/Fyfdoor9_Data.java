package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyfdoor9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 0, 6, 8, 2, 10),
		Block.createCuboidShape(-8, 2, 0, 8, 16, 16),
		Block.createCuboidShape(8, 0, 0, 16, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, -8, 10, 2, 8),
		Block.createCuboidShape(0, 2, -8, 16, 16, 8),
		Block.createCuboidShape(0, 0, 8, 16, 16, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, 0, 6, 24, 2, 10),
		Block.createCuboidShape(8, 2, 0, 24, 16, 16),
		Block.createCuboidShape(0, 0, 0, 8, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 8, 10, 2, 24),
		Block.createCuboidShape(0, 2, 8, 16, 16, 24),
		Block.createCuboidShape(0, 0, 0, 16, 16, 8)
    );

    public Fyfdoor9_Data() {
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

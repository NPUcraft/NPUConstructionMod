package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg90_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 4, 4, 21, 7, 12),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(-5, 4, 4, 21, 7, 4)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 4, -5, 12, 7, 21),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(12, 4, -5, 12, 7, 21)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 4, 4, 21, 7, 12),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(-5, 4, 12, 21, 7, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 4, -5, 12, 7, 21),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(4, 4, -5, 4, 7, 21)
    );

    public Fg90_Data() {
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

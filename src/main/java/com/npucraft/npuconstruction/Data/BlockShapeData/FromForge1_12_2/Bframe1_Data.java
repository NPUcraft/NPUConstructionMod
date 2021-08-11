package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bframe1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(22, 0, 5, 24, 8, 11),
		Block.createCuboidShape(-8, 0, 5, -6, 8, 11),
		Block.createCuboidShape(24, 0, 0, 32, 16, 16),
		Block.createCuboidShape(0, 9, 8, 24, 16, 16),
		Block.createCuboidShape(16, 9, 0, 24, 16, 16),
		Block.createCuboidShape(-8, 9, 0, 0, 16, 16),
		Block.createCuboidShape(-16, 0, 0, -8, 16, 16),
		Block.createCuboidShape(0, 9, 0, 16, 16, 8),
		Block.createCuboidShape(-8, 8, 5, 24, 9, 11),
		Block.createCuboidShape(-7, 7, 6, 23, 8, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 22, 11, 8, 24),
		Block.createCuboidShape(5, 0, -8, 11, 8, -6),
		Block.createCuboidShape(0, 0, 24, 16, 16, 32),
		Block.createCuboidShape(0, 9, 0, 8, 16, 24),
		Block.createCuboidShape(0, 9, 16, 16, 16, 24),
		Block.createCuboidShape(0, 9, -8, 16, 16, 0),
		Block.createCuboidShape(0, 0, -16, 16, 16, -8),
		Block.createCuboidShape(8, 9, 0, 16, 16, 16),
		Block.createCuboidShape(5, 8, -8, 11, 9, 24),
		Block.createCuboidShape(6, 7, -7, 10, 8, 23)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 0, 5, -6, 8, 11),
		Block.createCuboidShape(22, 0, 5, 24, 8, 11),
		Block.createCuboidShape(-16, 0, 0, -8, 16, 16),
		Block.createCuboidShape(-8, 9, 0, 16, 16, 8),
		Block.createCuboidShape(-8, 9, 0, 0, 16, 16),
		Block.createCuboidShape(16, 9, 0, 24, 16, 16),
		Block.createCuboidShape(24, 0, 0, 32, 16, 16),
		Block.createCuboidShape(0, 9, 8, 16, 16, 16),
		Block.createCuboidShape(-8, 8, 5, 24, 9, 11),
		Block.createCuboidShape(-7, 7, 6, 23, 8, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, -8, 11, 8, -6),
		Block.createCuboidShape(5, 0, 22, 11, 8, 24),
		Block.createCuboidShape(0, 0, -16, 16, 16, -8),
		Block.createCuboidShape(8, 9, -8, 16, 16, 16),
		Block.createCuboidShape(0, 9, -8, 16, 16, 0),
		Block.createCuboidShape(0, 9, 16, 16, 16, 24),
		Block.createCuboidShape(0, 0, 24, 16, 16, 32),
		Block.createCuboidShape(0, 9, 0, 8, 16, 16),
		Block.createCuboidShape(5, 8, -8, 11, 9, 24),
		Block.createCuboidShape(6, 7, -7, 10, 8, 23)
    );

    public Bframe1_Data() {
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

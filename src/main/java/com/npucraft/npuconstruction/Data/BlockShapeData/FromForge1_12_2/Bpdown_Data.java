package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bpdown_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(25, 9, 8, 32, 31, 9),
		Block.createCuboidShape(-16, 9, 8, -9, 31, 9),
		Block.createCuboidShape(-8, 0, 0, 24, 32, 16),
		Block.createCuboidShape(7, 0, 16, 9, 32, 32),
		Block.createCuboidShape(-16, 0, 0, -8, 8, 16),
		Block.createCuboidShape(24, 0, 0, 32, 8, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, 25, 8, 31, 32),
		Block.createCuboidShape(7, 9, -16, 8, 31, -9),
		Block.createCuboidShape(0, 0, -8, 16, 32, 24),
		Block.createCuboidShape(-16, 0, 7, 0, 32, 9),
		Block.createCuboidShape(0, 0, -16, 16, 8, -8),
		Block.createCuboidShape(0, 0, 24, 16, 8, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 9, 7, -9, 31, 8),
		Block.createCuboidShape(25, 9, 7, 32, 31, 8),
		Block.createCuboidShape(-8, 0, 0, 24, 32, 16),
		Block.createCuboidShape(7, 0, -16, 9, 32, 0),
		Block.createCuboidShape(24, 0, 0, 32, 8, 16),
		Block.createCuboidShape(-16, 0, 0, -8, 8, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 9, -16, 9, 31, -9),
		Block.createCuboidShape(8, 9, 25, 9, 31, 32),
		Block.createCuboidShape(0, 0, -8, 16, 32, 24),
		Block.createCuboidShape(16, 0, 7, 32, 32, 9),
		Block.createCuboidShape(0, 0, 24, 16, 8, 32),
		Block.createCuboidShape(0, 0, -16, 16, 8, -8)
    );

    public Bpdown_Data() {
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

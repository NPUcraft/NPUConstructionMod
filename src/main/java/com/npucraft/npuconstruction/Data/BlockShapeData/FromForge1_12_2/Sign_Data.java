package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sign_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 1, 0, 0, 32, 2),
		Block.createCuboidShape(16, 1, 0, 18, 32, 2),
		Block.createCuboidShape(-2, 0, 2, -1, 1, 14),
		Block.createCuboidShape(17, 0, 2, 18, 1, 14),
		Block.createCuboidShape(0, 31, 0, 16, 32, 2),
		Block.createCuboidShape(0, 9, 1, 16, 31, 2),
		Block.createCuboidShape(0, 8, 0, 16, 9, 2),
		Block.createCuboidShape(-1, 0, 14, 17, 1, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(14, 1, -2, 16, 32, 0),
		Block.createCuboidShape(14, 1, 16, 16, 32, 18),
		Block.createCuboidShape(2, 0, -2, 14, 1, -1),
		Block.createCuboidShape(2, 0, 17, 14, 1, 18),
		Block.createCuboidShape(14, 31, 0, 16, 32, 16),
		Block.createCuboidShape(14, 9, 0, 15, 31, 16),
		Block.createCuboidShape(14, 8, 0, 16, 9, 16),
		Block.createCuboidShape(1, 0, -1, 2, 1, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(16, 1, 14, 18, 32, 16),
		Block.createCuboidShape(-2, 1, 14, 0, 32, 16),
		Block.createCuboidShape(17, 0, 2, 18, 1, 14),
		Block.createCuboidShape(-2, 0, 2, -1, 1, 14),
		Block.createCuboidShape(0, 31, 14, 16, 32, 16),
		Block.createCuboidShape(0, 9, 14, 16, 31, 15),
		Block.createCuboidShape(0, 8, 14, 16, 9, 16),
		Block.createCuboidShape(-1, 0, 1, 17, 1, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 1, 16, 2, 32, 18),
		Block.createCuboidShape(0, 1, -2, 2, 32, 0),
		Block.createCuboidShape(2, 0, 17, 14, 1, 18),
		Block.createCuboidShape(2, 0, -2, 14, 1, -1),
		Block.createCuboidShape(0, 31, 0, 2, 32, 16),
		Block.createCuboidShape(1, 9, 0, 2, 31, 16),
		Block.createCuboidShape(0, 8, 0, 2, 9, 16),
		Block.createCuboidShape(14, 0, -1, 15, 1, 17)
    );

    public Sign_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Wall13_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, 14, 0, 16, 16, 16),
		Block.createCuboidShape(15, 2, 0, 16, 16, 16),
		Block.createCuboidShape(7, 14, 0, 12, 16, 16),
		Block.createCuboidShape(0, 14, 0, 3, 16, 16),
		Block.createCuboidShape(0, 2, 0, 1, 16, 16),
		Block.createCuboidShape(1, 2, 0, 15, 14, 2),
		Block.createCuboidShape(1, 2, 14, 15, 14, 16),
		Block.createCuboidShape(0, 0, 0, 3, 2, 16),
		Block.createCuboidShape(4, 0, 0, 9, 2, 16),
		Block.createCuboidShape(10, 0, 0, 14, 2, 16),
		Block.createCuboidShape(4, 14, 0, 6, 16, 16),
		Block.createCuboidShape(1, 7, 0, 15, 9, 16),
		Block.createCuboidShape(15, 0, 0, 16, 2, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 13, 16, 16, 16),
		Block.createCuboidShape(0, 2, 15, 16, 16, 16),
		Block.createCuboidShape(0, 14, 7, 16, 16, 12),
		Block.createCuboidShape(0, 14, 0, 16, 16, 3),
		Block.createCuboidShape(0, 2, 0, 16, 16, 1),
		Block.createCuboidShape(14, 2, 1, 16, 14, 15),
		Block.createCuboidShape(0, 2, 1, 2, 14, 15),
		Block.createCuboidShape(0, 0, 0, 16, 2, 3),
		Block.createCuboidShape(0, 0, 4, 16, 2, 9),
		Block.createCuboidShape(0, 0, 10, 16, 2, 14),
		Block.createCuboidShape(0, 14, 4, 16, 16, 6),
		Block.createCuboidShape(0, 7, 1, 16, 9, 15),
		Block.createCuboidShape(0, 0, 15, 16, 2, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 3, 16, 16),
		Block.createCuboidShape(0, 2, 0, 1, 16, 16),
		Block.createCuboidShape(4, 14, 0, 9, 16, 16),
		Block.createCuboidShape(13, 14, 0, 16, 16, 16),
		Block.createCuboidShape(15, 2, 0, 16, 16, 16),
		Block.createCuboidShape(1, 2, 14, 15, 14, 16),
		Block.createCuboidShape(1, 2, 0, 15, 14, 2),
		Block.createCuboidShape(13, 0, 0, 16, 2, 16),
		Block.createCuboidShape(7, 0, 0, 12, 2, 16),
		Block.createCuboidShape(2, 0, 0, 6, 2, 16),
		Block.createCuboidShape(10, 14, 0, 12, 16, 16),
		Block.createCuboidShape(1, 7, 0, 15, 9, 16),
		Block.createCuboidShape(0, 0, 0, 1, 2, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 16, 16, 3),
		Block.createCuboidShape(0, 2, 0, 16, 16, 1),
		Block.createCuboidShape(0, 14, 4, 16, 16, 9),
		Block.createCuboidShape(0, 14, 13, 16, 16, 16),
		Block.createCuboidShape(0, 2, 15, 16, 16, 16),
		Block.createCuboidShape(0, 2, 1, 2, 14, 15),
		Block.createCuboidShape(14, 2, 1, 16, 14, 15),
		Block.createCuboidShape(0, 0, 13, 16, 2, 16),
		Block.createCuboidShape(0, 0, 7, 16, 2, 12),
		Block.createCuboidShape(0, 0, 2, 16, 2, 6),
		Block.createCuboidShape(0, 14, 10, 16, 16, 12),
		Block.createCuboidShape(0, 7, 1, 16, 9, 15),
		Block.createCuboidShape(0, 0, 0, 16, 2, 1)
    );

    public Wall13_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Stair2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 4, 16),
		Block.createCuboidShape(0, 4, 4, 16, 8, 16),
		Block.createCuboidShape(0, 4, 0, 12, 8, 4),
		Block.createCuboidShape(0, 8, 8, 16, 12, 16),
		Block.createCuboidShape(0, 8, 0, 8, 12, 8),
		Block.createCuboidShape(0, 12, 12, 16, 16, 16),
		Block.createCuboidShape(0, 12, 0, 4, 16, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 4, 16),
		Block.createCuboidShape(0, 4, 0, 12, 8, 16),
		Block.createCuboidShape(12, 4, 0, 16, 8, 12),
		Block.createCuboidShape(0, 8, 0, 8, 12, 16),
		Block.createCuboidShape(8, 8, 0, 16, 12, 8),
		Block.createCuboidShape(0, 12, 0, 4, 16, 16),
		Block.createCuboidShape(4, 12, 0, 16, 16, 4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 4, 16),
		Block.createCuboidShape(0, 4, 0, 16, 8, 12),
		Block.createCuboidShape(4, 4, 12, 16, 8, 16),
		Block.createCuboidShape(0, 8, 0, 16, 12, 8),
		Block.createCuboidShape(8, 8, 8, 16, 12, 16),
		Block.createCuboidShape(0, 12, 0, 16, 16, 4),
		Block.createCuboidShape(12, 12, 4, 16, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 4, 16),
		Block.createCuboidShape(4, 4, 0, 16, 8, 16),
		Block.createCuboidShape(0, 4, 4, 4, 8, 16),
		Block.createCuboidShape(8, 8, 0, 16, 12, 16),
		Block.createCuboidShape(0, 8, 8, 8, 12, 16),
		Block.createCuboidShape(12, 12, 0, 16, 16, 16),
		Block.createCuboidShape(0, 12, 12, 12, 16, 16)
    );

    public Stair2_Data() {
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

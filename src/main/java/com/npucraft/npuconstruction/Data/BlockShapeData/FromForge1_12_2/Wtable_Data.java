package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Wtable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-10, 17, -1, 26, 18, 16),
		Block.createCuboidShape(-8, 6, 12, 24, 17, 13),
		Block.createCuboidShape(-8, 13, 0, 13, 17, 12),
		Block.createCuboidShape(-8, 6, 0, 2, 13, 12),
		Block.createCuboidShape(-9, 0, 0, -8, 17, 15),
		Block.createCuboidShape(24, 0, 0, 25, 17, 15),
		Block.createCuboidShape(13, 6, 0, 24, 17, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 17, -10, 17, 18, 26),
		Block.createCuboidShape(3, 6, -8, 4, 17, 24),
		Block.createCuboidShape(4, 13, -8, 16, 17, 13),
		Block.createCuboidShape(4, 6, -8, 16, 13, 2),
		Block.createCuboidShape(1, 0, -9, 16, 17, -8),
		Block.createCuboidShape(1, 0, 24, 16, 17, 25),
		Block.createCuboidShape(4, 6, 13, 16, 17, 24)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-10, 17, 0, 26, 18, 17),
		Block.createCuboidShape(-8, 6, 3, 24, 17, 4),
		Block.createCuboidShape(3, 13, 4, 24, 17, 16),
		Block.createCuboidShape(14, 6, 4, 24, 13, 16),
		Block.createCuboidShape(24, 0, 1, 25, 17, 16),
		Block.createCuboidShape(-9, 0, 1, -8, 17, 16),
		Block.createCuboidShape(-8, 6, 4, 3, 17, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 17, -10, 16, 18, 26),
		Block.createCuboidShape(12, 6, -8, 13, 17, 24),
		Block.createCuboidShape(0, 13, 3, 12, 17, 24),
		Block.createCuboidShape(0, 6, 14, 12, 13, 24),
		Block.createCuboidShape(0, 0, 24, 15, 17, 25),
		Block.createCuboidShape(0, 0, -9, 15, 17, -8),
		Block.createCuboidShape(0, 6, -8, 12, 17, 3)
    );

    public Wtable_Data() {
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

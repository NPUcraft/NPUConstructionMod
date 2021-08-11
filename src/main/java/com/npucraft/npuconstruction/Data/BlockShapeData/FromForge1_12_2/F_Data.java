package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class F_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 4, 15, -3, 24, 16),
		Block.createCuboidShape(-5, 21, 15, 21, 24, 16),
		Block.createCuboidShape(6, -8, 15, 21, -6, 16),
		Block.createCuboidShape(10, -7, 15, 17, 23, 16),
		Block.createCuboidShape(-3, 7, 15, 10, 10, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 4, -8, 1, 24, -3),
		Block.createCuboidShape(0, 21, -5, 1, 24, 21),
		Block.createCuboidShape(0, -8, 6, 1, -6, 21),
		Block.createCuboidShape(0, -7, 10, 1, 23, 17),
		Block.createCuboidShape(0, 7, -3, 1, 10, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(19, 4, 0, 24, 24, 1),
		Block.createCuboidShape(-5, 21, 0, 21, 24, 1),
		Block.createCuboidShape(-5, -8, 0, 10, -6, 1),
		Block.createCuboidShape(-1, -7, 0, 6, 23, 1),
		Block.createCuboidShape(6, 7, 0, 19, 10, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 4, 19, 16, 24, 24),
		Block.createCuboidShape(15, 21, -5, 16, 24, 21),
		Block.createCuboidShape(15, -8, -5, 16, -6, 10),
		Block.createCuboidShape(15, -7, -1, 16, 23, 6),
		Block.createCuboidShape(15, 7, 6, 16, 10, 19)
    );

    public F_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class B_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-9, -6, 15, 4, 7, 16),
		Block.createCuboidShape(-7, 11, 15, 4, 22, 16),
		Block.createCuboidShape(-6, 7, 15, 11, 11, 16),
		Block.createCuboidShape(-4, -8, 15, 24, -6, 16),
		Block.createCuboidShape(-3, 22, 15, 22, 24, 16),
		Block.createCuboidShape(11, -7, 15, 18, 22, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -6, -9, 1, 7, 4),
		Block.createCuboidShape(0, 11, -7, 1, 22, 4),
		Block.createCuboidShape(0, 7, -6, 1, 11, 11),
		Block.createCuboidShape(0, -8, -4, 1, -6, 24),
		Block.createCuboidShape(0, 22, -3, 1, 24, 22),
		Block.createCuboidShape(0, -7, 11, 1, 22, 18)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(12, -6, 0, 25, 7, 1),
		Block.createCuboidShape(12, 11, 0, 23, 22, 1),
		Block.createCuboidShape(5, 7, 0, 22, 11, 1),
		Block.createCuboidShape(-8, -8, 0, 20, -6, 1),
		Block.createCuboidShape(-6, 22, 0, 19, 24, 1),
		Block.createCuboidShape(-2, -7, 0, 5, 22, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, -6, 12, 16, 7, 25),
		Block.createCuboidShape(15, 11, 12, 16, 22, 23),
		Block.createCuboidShape(15, 7, 5, 16, 11, 22),
		Block.createCuboidShape(15, -8, -8, 16, -6, 20),
		Block.createCuboidShape(15, 22, -6, 16, 24, 19),
		Block.createCuboidShape(15, -7, -2, 16, 22, 5)
    );

    public B_Data() {
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

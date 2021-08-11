package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class E_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 4, 15, -2, 24, 16),
		Block.createCuboidShape(-6, -8, 15, 22, -4, 16),
		Block.createCuboidShape(-4, 21, 15, 22, 24, 16),
		Block.createCuboidShape(-8, -8, 15, -6, 0, 16),
		Block.createCuboidShape(11, -7, 15, 18, 23, 16),
		Block.createCuboidShape(-2, 7, 15, 11, 10, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 4, -7, 1, 24, -2),
		Block.createCuboidShape(0, -8, -6, 1, -4, 22),
		Block.createCuboidShape(0, 21, -4, 1, 24, 22),
		Block.createCuboidShape(0, -8, -8, 1, 0, -6),
		Block.createCuboidShape(0, -7, 11, 1, 23, 18),
		Block.createCuboidShape(0, 7, -2, 1, 10, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(18, 4, 0, 23, 24, 1),
		Block.createCuboidShape(-6, -8, 0, 22, -4, 1),
		Block.createCuboidShape(-6, 21, 0, 20, 24, 1),
		Block.createCuboidShape(22, -8, 0, 24, 0, 1),
		Block.createCuboidShape(-2, -7, 0, 5, 23, 1),
		Block.createCuboidShape(5, 7, 0, 18, 10, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 4, 18, 16, 24, 23),
		Block.createCuboidShape(15, -8, -6, 16, -4, 22),
		Block.createCuboidShape(15, 21, -6, 16, 24, 20),
		Block.createCuboidShape(15, -8, 22, 16, 0, 24),
		Block.createCuboidShape(15, -7, -2, 16, 23, 5),
		Block.createCuboidShape(15, 7, 5, 16, 10, 18)
    );

    public E_Data() {
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

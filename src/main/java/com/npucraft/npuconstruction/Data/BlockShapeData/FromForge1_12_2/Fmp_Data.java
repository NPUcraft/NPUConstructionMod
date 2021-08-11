package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fmp_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 14, 11, 5, 20),
		Block.createCuboidShape(1, 5, 9, 15, 6, 24),
		Block.createCuboidShape(1, 11, 8, 15, 13, 9),
		Block.createCuboidShape(1, 6, 9, 15, 13, 10),
		Block.createCuboidShape(1, 6, 22, 15, 16, 24),
		Block.createCuboidShape(1, 6, 10, 2, 13, 22),
		Block.createCuboidShape(14, 6, 10, 15, 13, 22),
		Block.createCuboidShape(15, 11, 9, 16, 13, 24),
		Block.createCuboidShape(0, 11, 9, 1, 13, 24)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-4, 0, 5, 2, 5, 11),
		Block.createCuboidShape(-8, 5, 1, 7, 6, 15),
		Block.createCuboidShape(7, 11, 1, 8, 13, 15),
		Block.createCuboidShape(6, 6, 1, 7, 13, 15),
		Block.createCuboidShape(-8, 6, 1, -6, 16, 15),
		Block.createCuboidShape(-6, 6, 1, 6, 13, 2),
		Block.createCuboidShape(-6, 6, 14, 6, 13, 15),
		Block.createCuboidShape(-8, 11, 15, 7, 13, 16),
		Block.createCuboidShape(-8, 11, 0, 7, 13, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, -4, 11, 5, 2),
		Block.createCuboidShape(1, 5, -8, 15, 6, 7),
		Block.createCuboidShape(1, 11, 7, 15, 13, 8),
		Block.createCuboidShape(1, 6, 6, 15, 13, 7),
		Block.createCuboidShape(1, 6, -8, 15, 16, -6),
		Block.createCuboidShape(14, 6, -6, 15, 13, 6),
		Block.createCuboidShape(1, 6, -6, 2, 13, 6),
		Block.createCuboidShape(0, 11, -8, 1, 13, 7),
		Block.createCuboidShape(15, 11, -8, 16, 13, 7)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 0, 5, 20, 5, 11),
		Block.createCuboidShape(9, 5, 1, 24, 6, 15),
		Block.createCuboidShape(8, 11, 1, 9, 13, 15),
		Block.createCuboidShape(9, 6, 1, 10, 13, 15),
		Block.createCuboidShape(22, 6, 1, 24, 16, 15),
		Block.createCuboidShape(10, 6, 14, 22, 13, 15),
		Block.createCuboidShape(10, 6, 1, 22, 13, 2),
		Block.createCuboidShape(9, 11, 0, 24, 13, 1),
		Block.createCuboidShape(9, 11, 15, 24, 13, 16)
    );

    public Fmp_Data() {
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

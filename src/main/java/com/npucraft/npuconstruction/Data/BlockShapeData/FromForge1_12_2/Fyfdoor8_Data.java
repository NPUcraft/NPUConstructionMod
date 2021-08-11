package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyfdoor8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 4, -5, 8, 5, 7),
		Block.createCuboidShape(5, -14, -5, 6, 24, 7),
		Block.createCuboidShape(8, -16, 0, 16, 32, 16),
		Block.createCuboidShape(-7, -16, 6, 7, -15, 10),
		Block.createCuboidShape(-7, 25, 6, 7, 26, 10),
		Block.createCuboidShape(5, 24, -5, 7, 25, 7),
		Block.createCuboidShape(5, -15, -5, 7, -14, 7),
		Block.createCuboidShape(7, -16, 6, 8, 32, 10),
		Block.createCuboidShape(5, -15, 7, 7, 25, 8),
		Block.createCuboidShape(5, -15, -6, 7, 25, -5),
		Block.createCuboidShape(-8, -16, 6, -7, 32, 10),
		Block.createCuboidShape(-7, 26, 7, 7, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 4, 4, 21, 5, 8),
		Block.createCuboidShape(9, -14, 5, 21, 24, 6),
		Block.createCuboidShape(0, -16, 8, 16, 32, 16),
		Block.createCuboidShape(6, -16, -7, 10, -15, 7),
		Block.createCuboidShape(6, 25, -7, 10, 26, 7),
		Block.createCuboidShape(9, 24, 5, 21, 25, 7),
		Block.createCuboidShape(9, -15, 5, 21, -14, 7),
		Block.createCuboidShape(6, -16, 7, 10, 32, 8),
		Block.createCuboidShape(8, -15, 5, 9, 25, 7),
		Block.createCuboidShape(21, -15, 5, 22, 25, 7),
		Block.createCuboidShape(6, -16, -8, 10, 32, -7),
		Block.createCuboidShape(7, 26, -7, 9, 32, 7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, 4, 9, 12, 5, 21),
		Block.createCuboidShape(10, -14, 9, 11, 24, 21),
		Block.createCuboidShape(0, -16, 0, 8, 32, 16),
		Block.createCuboidShape(9, -16, 6, 23, -15, 10),
		Block.createCuboidShape(9, 25, 6, 23, 26, 10),
		Block.createCuboidShape(9, 24, 9, 11, 25, 21),
		Block.createCuboidShape(9, -15, 9, 11, -14, 21),
		Block.createCuboidShape(8, -16, 6, 9, 32, 10),
		Block.createCuboidShape(9, -15, 8, 11, 25, 9),
		Block.createCuboidShape(9, -15, 21, 11, 25, 22),
		Block.createCuboidShape(23, -16, 6, 24, 32, 10),
		Block.createCuboidShape(9, 26, 7, 23, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-5, 4, 8, 7, 5, 12),
		Block.createCuboidShape(-5, -14, 10, 7, 24, 11),
		Block.createCuboidShape(0, -16, 0, 16, 32, 8),
		Block.createCuboidShape(6, -16, 9, 10, -15, 23),
		Block.createCuboidShape(6, 25, 9, 10, 26, 23),
		Block.createCuboidShape(-5, 24, 9, 7, 25, 11),
		Block.createCuboidShape(-5, -15, 9, 7, -14, 11),
		Block.createCuboidShape(6, -16, 8, 10, 32, 9),
		Block.createCuboidShape(7, -15, 9, 8, 25, 11),
		Block.createCuboidShape(-6, -15, 9, -5, 25, 11),
		Block.createCuboidShape(6, -16, 23, 10, 32, 24),
		Block.createCuboidShape(7, 26, 9, 9, 32, 23)
    );

    public Fyfdoor8_Data() {
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

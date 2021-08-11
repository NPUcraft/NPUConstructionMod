package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dw3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-13, 1, -4, -12, 7, 1),
		Block.createCuboidShape(8, -16, -1, 9, 32, 17),
		Block.createCuboidShape(9, 31, -1, 32, 32, 17),
		Block.createCuboidShape(3, -16, -2, 9, 31, 0),
		Block.createCuboidShape(-14, -16, -2, -9, 31, 0),
		Block.createCuboidShape(-9, -16, -2, 3, 15, 0),
		Block.createCuboidShape(-9, 26, -2, 3, 31, 0),
		Block.createCuboidShape(-9, 15, -2, 3, 26, -1)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 1, -13, 20, 7, -12),
		Block.createCuboidShape(-1, -16, 8, 17, 32, 9),
		Block.createCuboidShape(-1, 31, 9, 17, 32, 32),
		Block.createCuboidShape(16, -16, 3, 18, 31, 9),
		Block.createCuboidShape(16, -16, -14, 18, 31, -9),
		Block.createCuboidShape(16, -16, -9, 18, 15, 3),
		Block.createCuboidShape(16, 26, -9, 18, 31, 3),
		Block.createCuboidShape(17, 15, -9, 18, 26, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(28, 1, 15, 29, 7, 20),
		Block.createCuboidShape(7, -16, -1, 8, 32, 17),
		Block.createCuboidShape(-16, 31, -1, 7, 32, 17),
		Block.createCuboidShape(7, -16, 16, 13, 31, 18),
		Block.createCuboidShape(25, -16, 16, 30, 31, 18),
		Block.createCuboidShape(13, -16, 16, 25, 15, 18),
		Block.createCuboidShape(13, 26, 16, 25, 31, 18),
		Block.createCuboidShape(13, 15, 17, 25, 26, 18)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-4, 1, 28, 1, 7, 29),
		Block.createCuboidShape(-1, -16, 7, 17, 32, 8),
		Block.createCuboidShape(-1, 31, -16, 17, 32, 7),
		Block.createCuboidShape(-2, -16, 7, 0, 31, 13),
		Block.createCuboidShape(-2, -16, 25, 0, 31, 30),
		Block.createCuboidShape(-2, -16, 13, 0, 15, 25),
		Block.createCuboidShape(-2, 26, 13, 0, 31, 25),
		Block.createCuboidShape(-2, 15, 13, -1, 26, 25)
    );

    public Dw3_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(21, 27, -1, 29, 28, 5),
		Block.createCuboidShape(-16, 23, 0, 32, 30, 16),
		Block.createCuboidShape(-12, 26, -1, -8, 28, 5),
		Block.createCuboidShape(0, 5, 0, 16, 23, 16),
		Block.createCuboidShape(0, -13, 0, 16, 4, 16),
		Block.createCuboidShape(17, 5, 0, 31, 23, 16),
		Block.createCuboidShape(17, -13, 0, 31, 4, 16),
		Block.createCuboidShape(31, -13, 1, 32, 23, 16),
		Block.createCuboidShape(-16, -13, 1, -15, 23, 16),
		Block.createCuboidShape(-15, 5, 0, -1, 23, 16),
		Block.createCuboidShape(-15, -13, 0, -1, 4, 16),
		Block.createCuboidShape(-15, 4, 1, 31, 5, 16),
		Block.createCuboidShape(-16, -15, 1, 32, -13, 16),
		Block.createCuboidShape(-1, -13, 1, 0, 23, 16),
		Block.createCuboidShape(16, -13, 1, 17, 23, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(11, 27, 21, 17, 28, 29),
		Block.createCuboidShape(0, 23, -16, 16, 30, 32),
		Block.createCuboidShape(11, 26, -12, 17, 28, -8),
		Block.createCuboidShape(0, 5, 0, 16, 23, 16),
		Block.createCuboidShape(0, -13, 0, 16, 4, 16),
		Block.createCuboidShape(0, 5, 17, 16, 23, 31),
		Block.createCuboidShape(0, -13, 17, 16, 4, 31),
		Block.createCuboidShape(0, -13, 31, 15, 23, 32),
		Block.createCuboidShape(0, -13, -16, 15, 23, -15),
		Block.createCuboidShape(0, 5, -15, 16, 23, -1),
		Block.createCuboidShape(0, -13, -15, 16, 4, -1),
		Block.createCuboidShape(0, 4, -15, 15, 5, 31),
		Block.createCuboidShape(0, -15, -16, 15, -13, 32),
		Block.createCuboidShape(0, -13, -1, 15, 23, 0),
		Block.createCuboidShape(0, -13, 16, 15, 23, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-13, 27, 11, -5, 28, 17),
		Block.createCuboidShape(-16, 23, 0, 32, 30, 16),
		Block.createCuboidShape(24, 26, 11, 28, 28, 17),
		Block.createCuboidShape(0, 5, 0, 16, 23, 16),
		Block.createCuboidShape(0, -13, 0, 16, 4, 16),
		Block.createCuboidShape(-15, 5, 0, -1, 23, 16),
		Block.createCuboidShape(-15, -13, 0, -1, 4, 16),
		Block.createCuboidShape(-16, -13, 0, -15, 23, 15),
		Block.createCuboidShape(31, -13, 0, 32, 23, 15),
		Block.createCuboidShape(17, 5, 0, 31, 23, 16),
		Block.createCuboidShape(17, -13, 0, 31, 4, 16),
		Block.createCuboidShape(-15, 4, 0, 31, 5, 15),
		Block.createCuboidShape(-16, -15, 0, 32, -13, 15),
		Block.createCuboidShape(16, -13, 0, 17, 23, 15),
		Block.createCuboidShape(-1, -13, 0, 0, 23, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 27, -13, 5, 28, -5),
		Block.createCuboidShape(0, 23, -16, 16, 30, 32),
		Block.createCuboidShape(-1, 26, 24, 5, 28, 28),
		Block.createCuboidShape(0, 5, 0, 16, 23, 16),
		Block.createCuboidShape(0, -13, 0, 16, 4, 16),
		Block.createCuboidShape(0, 5, -15, 16, 23, -1),
		Block.createCuboidShape(0, -13, -15, 16, 4, -1),
		Block.createCuboidShape(1, -13, -16, 16, 23, -15),
		Block.createCuboidShape(1, -13, 31, 16, 23, 32),
		Block.createCuboidShape(0, 5, 17, 16, 23, 31),
		Block.createCuboidShape(0, -13, 17, 16, 4, 31),
		Block.createCuboidShape(1, 4, -15, 16, 5, 31),
		Block.createCuboidShape(1, -15, -16, 16, -13, 32),
		Block.createCuboidShape(1, -13, 16, 16, 23, 17),
		Block.createCuboidShape(1, -13, -1, 16, 23, 0)
    );

    public Dhall2_Data() {
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

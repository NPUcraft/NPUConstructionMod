package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyftr1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(15, 0, -8, 16, 16, 32),
		Block.createCuboidShape(-3, 13, -5, 3, 15, 1),
		Block.createCuboidShape(-16, 0, -16, -15, 16, 32),
		Block.createCuboidShape(-15, 0, 31, 15, 16, 32),
		Block.createCuboidShape(-15, 0, -16, 15, 16, -15),
		Block.createCuboidShape(15, 0, -16, 16, 16, -8),
		Block.createCuboidShape(-15, 15, -15, 15, 16, 31),
		Block.createCuboidShape(-15, 0, 28, -12, 15, 31),
		Block.createCuboidShape(-10, 0, 29, -8, 15, 31),
		Block.createCuboidShape(-6, 0, 28, -3, 15, 31)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 15, 24, 16, 16),
		Block.createCuboidShape(15, 13, -3, 21, 15, 3),
		Block.createCuboidShape(-16, 0, -16, 32, 16, -15),
		Block.createCuboidShape(-16, 0, -15, -15, 16, 15),
		Block.createCuboidShape(31, 0, -15, 32, 16, 15),
		Block.createCuboidShape(24, 0, 15, 32, 16, 16),
		Block.createCuboidShape(-15, 15, -15, 31, 16, 15),
		Block.createCuboidShape(-15, 0, -15, -12, 15, -12),
		Block.createCuboidShape(-15, 0, -10, -13, 15, -8),
		Block.createCuboidShape(-15, 0, -6, -12, 15, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -16, 1, 16, 24),
		Block.createCuboidShape(13, 13, 15, 19, 15, 21),
		Block.createCuboidShape(31, 0, -16, 32, 16, 32),
		Block.createCuboidShape(1, 0, -16, 31, 16, -15),
		Block.createCuboidShape(1, 0, 31, 31, 16, 32),
		Block.createCuboidShape(0, 0, 24, 1, 16, 32),
		Block.createCuboidShape(1, 15, -15, 31, 16, 31),
		Block.createCuboidShape(28, 0, -15, 31, 15, -12),
		Block.createCuboidShape(24, 0, -15, 26, 15, -13),
		Block.createCuboidShape(19, 0, -15, 22, 15, -12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-8, 0, 0, 32, 16, 1),
		Block.createCuboidShape(-5, 13, 13, 1, 15, 19),
		Block.createCuboidShape(-16, 0, 31, 32, 16, 32),
		Block.createCuboidShape(31, 0, 1, 32, 16, 31),
		Block.createCuboidShape(-16, 0, 1, -15, 16, 31),
		Block.createCuboidShape(-16, 0, 0, -8, 16, 1),
		Block.createCuboidShape(-15, 15, 1, 31, 16, 31),
		Block.createCuboidShape(28, 0, 28, 31, 15, 31),
		Block.createCuboidShape(29, 0, 24, 31, 15, 26),
		Block.createCuboidShape(28, 0, 19, 31, 15, 22)
    );

    public Fyftr1_Data() {
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

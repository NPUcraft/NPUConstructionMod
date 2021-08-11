package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyftl1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -8, 1, 16, 32),
		Block.createCuboidShape(13, 13, -5, 19, 15, 1),
		Block.createCuboidShape(31, 0, -16, 32, 16, 32),
		Block.createCuboidShape(1, 0, 31, 31, 16, 32),
		Block.createCuboidShape(1, 0, -16, 31, 16, -15),
		Block.createCuboidShape(0, 0, -16, 1, 16, -8),
		Block.createCuboidShape(1, 15, -15, 31, 16, 31),
		Block.createCuboidShape(28, 0, 28, 31, 15, 31),
		Block.createCuboidShape(24, 0, 29, 26, 15, 31),
		Block.createCuboidShape(19, 0, 28, 22, 15, 31)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 0, 24, 16, 1),
		Block.createCuboidShape(15, 13, 13, 21, 15, 19),
		Block.createCuboidShape(-16, 0, 31, 32, 16, 32),
		Block.createCuboidShape(-16, 0, 1, -15, 16, 31),
		Block.createCuboidShape(31, 0, 1, 32, 16, 31),
		Block.createCuboidShape(24, 0, 0, 32, 16, 1),
		Block.createCuboidShape(-15, 15, 1, 31, 16, 31),
		Block.createCuboidShape(-15, 0, 28, -12, 15, 31),
		Block.createCuboidShape(-15, 0, 24, -13, 15, 26),
		Block.createCuboidShape(-15, 0, 19, -12, 15, 22)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, 0, -16, 16, 16, 24),
		Block.createCuboidShape(-3, 13, 15, 3, 15, 21),
		Block.createCuboidShape(-16, 0, -16, -15, 16, 32),
		Block.createCuboidShape(-15, 0, -16, 15, 16, -15),
		Block.createCuboidShape(-15, 0, 31, 15, 16, 32),
		Block.createCuboidShape(15, 0, 24, 16, 16, 32),
		Block.createCuboidShape(-15, 15, -15, 15, 16, 31),
		Block.createCuboidShape(-15, 0, -15, -12, 15, -12),
		Block.createCuboidShape(-10, 0, -15, -8, 15, -13),
		Block.createCuboidShape(-6, 0, -15, -3, 15, -12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-8, 0, 15, 32, 16, 16),
		Block.createCuboidShape(-5, 13, -3, 1, 15, 3),
		Block.createCuboidShape(-16, 0, -16, 32, 16, -15),
		Block.createCuboidShape(31, 0, -15, 32, 16, 15),
		Block.createCuboidShape(-16, 0, -15, -15, 16, 15),
		Block.createCuboidShape(-16, 0, 15, -8, 16, 16),
		Block.createCuboidShape(-15, 15, -15, 31, 16, 15),
		Block.createCuboidShape(28, 0, -15, 31, 15, -12),
		Block.createCuboidShape(29, 0, -10, 31, 15, -8),
		Block.createCuboidShape(28, 0, -6, 31, 15, -3)
    );

    public Fyftl1_Data() {
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

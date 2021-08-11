package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn12_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(12, 4, -8, 16, 10, -5),
		Block.createCuboidShape(-16, 4, -8, -12, 10, -5),
		Block.createCuboidShape(14, 5, -7, 15, 8, 7),
		Block.createCuboidShape(-15, 5, -7, -14, 8, 7),
		Block.createCuboidShape(14, -15, -6, 15, 30, 6),
		Block.createCuboidShape(-15, -15, -6, -14, 30, 6),
		Block.createCuboidShape(-16, 31, 6, 16, 32, 10),
		Block.createCuboidShape(13, -16, -8, 15, 31, -6),
		Block.createCuboidShape(-15, -16, -8, -13, 31, -6),
		Block.createCuboidShape(13, -16, 6, 15, 31, 7),
		Block.createCuboidShape(-15, -16, 6, -13, 31, 7),
		Block.createCuboidShape(13, 30, -6, 15, 31, 6),
		Block.createCuboidShape(-15, 30, -6, -13, 31, 6),
		Block.createCuboidShape(13, -16, -6, 15, -15, 6),
		Block.createCuboidShape(-15, -16, -6, -13, -15, 6),
		Block.createCuboidShape(15, -16, 6, 16, 31, 10),
		Block.createCuboidShape(-16, -16, 6, -15, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(21, 4, 12, 24, 10, 16),
		Block.createCuboidShape(21, 4, -16, 24, 10, -12),
		Block.createCuboidShape(9, 5, 14, 23, 8, 15),
		Block.createCuboidShape(9, 5, -15, 23, 8, -14),
		Block.createCuboidShape(10, -15, 14, 22, 30, 15),
		Block.createCuboidShape(10, -15, -15, 22, 30, -14),
		Block.createCuboidShape(6, 31, -16, 10, 32, 16),
		Block.createCuboidShape(22, -16, 13, 24, 31, 15),
		Block.createCuboidShape(22, -16, -15, 24, 31, -13),
		Block.createCuboidShape(9, -16, 13, 10, 31, 15),
		Block.createCuboidShape(9, -16, -15, 10, 31, -13),
		Block.createCuboidShape(10, 30, 13, 22, 31, 15),
		Block.createCuboidShape(10, 30, -15, 22, 31, -13),
		Block.createCuboidShape(10, -16, 13, 22, -15, 15),
		Block.createCuboidShape(10, -16, -15, 22, -15, -13),
		Block.createCuboidShape(6, -16, 15, 10, 31, 16),
		Block.createCuboidShape(6, -16, -16, 10, 31, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 4, 21, 4, 10, 24),
		Block.createCuboidShape(28, 4, 21, 32, 10, 24),
		Block.createCuboidShape(1, 5, 9, 2, 8, 23),
		Block.createCuboidShape(30, 5, 9, 31, 8, 23),
		Block.createCuboidShape(1, -15, 10, 2, 30, 22),
		Block.createCuboidShape(30, -15, 10, 31, 30, 22),
		Block.createCuboidShape(0, 31, 6, 32, 32, 10),
		Block.createCuboidShape(1, -16, 22, 3, 31, 24),
		Block.createCuboidShape(29, -16, 22, 31, 31, 24),
		Block.createCuboidShape(1, -16, 9, 3, 31, 10),
		Block.createCuboidShape(29, -16, 9, 31, 31, 10),
		Block.createCuboidShape(1, 30, 10, 3, 31, 22),
		Block.createCuboidShape(29, 30, 10, 31, 31, 22),
		Block.createCuboidShape(1, -16, 10, 3, -15, 22),
		Block.createCuboidShape(29, -16, 10, 31, -15, 22),
		Block.createCuboidShape(0, -16, 6, 1, 31, 10),
		Block.createCuboidShape(31, -16, 6, 32, 31, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-8, 4, 0, -5, 10, 4),
		Block.createCuboidShape(-8, 4, 28, -5, 10, 32),
		Block.createCuboidShape(-7, 5, 1, 7, 8, 2),
		Block.createCuboidShape(-7, 5, 30, 7, 8, 31),
		Block.createCuboidShape(-6, -15, 1, 6, 30, 2),
		Block.createCuboidShape(-6, -15, 30, 6, 30, 31),
		Block.createCuboidShape(6, 31, 0, 10, 32, 32),
		Block.createCuboidShape(-8, -16, 1, -6, 31, 3),
		Block.createCuboidShape(-8, -16, 29, -6, 31, 31),
		Block.createCuboidShape(6, -16, 1, 7, 31, 3),
		Block.createCuboidShape(6, -16, 29, 7, 31, 31),
		Block.createCuboidShape(-6, 30, 1, 6, 31, 3),
		Block.createCuboidShape(-6, 30, 29, 6, 31, 31),
		Block.createCuboidShape(-6, -16, 1, 6, -15, 3),
		Block.createCuboidShape(-6, -16, 29, 6, -15, 31),
		Block.createCuboidShape(6, -16, 0, 10, 31, 1),
		Block.createCuboidShape(6, -16, 31, 10, 31, 32)
    );

    public Winn12_Data() {
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

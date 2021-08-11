package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Girlbedl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 16, -7, 27, 21, -6),
		Block.createCuboidShape(-8, -11, -5, -7, -6, 14),
		Block.createCuboidShape(-4, -10, -10, 2, 11, -9),
		Block.createCuboidShape(-8, 16, -4, -7, 22, 13),
		Block.createCuboidShape(-7, -16, 13, 31, -15, 16),
		Block.createCuboidShape(30, 16, -1, 31, 21, 10),
		Block.createCuboidShape(-8, 15, -7, 31, 16, 16),
		Block.createCuboidShape(-8, -12, -7, 31, -11, 16),
		Block.createCuboidShape(-7, -16, 4, 31, -15, 5),
		Block.createCuboidShape(-7, -16, 1, 31, -15, 2),
		Block.createCuboidShape(-8, -16, -2, 31, -15, -1),
		Block.createCuboidShape(-7, -16, -5, 31, -15, -4),
		Block.createCuboidShape(-7, -16, 10, 31, -15, 11),
		Block.createCuboidShape(-7, -16, 7, 31, -15, 8),
		Block.createCuboidShape(2, -12, -10, 3, 15, -9),
		Block.createCuboidShape(-5, -12, -10, -4, 15, -9),
		Block.createCuboidShape(30, -8, -6, 31, -7, 14),
		Block.createCuboidShape(30, 21, -4, 32, 22, 13),
		Block.createCuboidShape(-8, 8, -5, -7, 9, 14),
		Block.createCuboidShape(-8, -16, -5, -7, -15, 14),
		Block.createCuboidShape(30, -16, -6, 31, -15, 14),
		Block.createCuboidShape(30, -16, -7, 32, 22, -5),
		Block.createCuboidShape(30, -16, 14, 32, 22, 16),
		Block.createCuboidShape(-8, -16, 14, -7, 22, 16),
		Block.createCuboidShape(-8, -16, -7, -7, 22, -5)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(22, 16, 5, 23, 21, 27),
		Block.createCuboidShape(2, -11, -8, 21, -6, -7),
		Block.createCuboidShape(25, -10, -4, 26, 11, 2),
		Block.createCuboidShape(3, 16, -8, 20, 22, -7),
		Block.createCuboidShape(0, -16, -7, 3, -15, 31),
		Block.createCuboidShape(6, 16, 30, 17, 21, 31),
		Block.createCuboidShape(0, 15, -8, 23, 16, 31),
		Block.createCuboidShape(0, -12, -8, 23, -11, 31),
		Block.createCuboidShape(11, -16, -7, 12, -15, 31),
		Block.createCuboidShape(14, -16, -7, 15, -15, 31),
		Block.createCuboidShape(17, -16, -8, 18, -15, 31),
		Block.createCuboidShape(20, -16, -7, 21, -15, 31),
		Block.createCuboidShape(5, -16, -7, 6, -15, 31),
		Block.createCuboidShape(8, -16, -7, 9, -15, 31),
		Block.createCuboidShape(25, -12, 2, 26, 15, 3),
		Block.createCuboidShape(25, -12, -5, 26, 15, -4),
		Block.createCuboidShape(2, -8, 30, 22, -7, 31),
		Block.createCuboidShape(3, 21, 30, 20, 22, 32),
		Block.createCuboidShape(2, 8, -8, 21, 9, -7),
		Block.createCuboidShape(2, -16, -8, 21, -15, -7),
		Block.createCuboidShape(2, -16, 30, 22, -15, 31),
		Block.createCuboidShape(21, -16, 30, 23, 22, 32),
		Block.createCuboidShape(0, -16, 30, 2, 22, 32),
		Block.createCuboidShape(0, -16, -8, 2, 22, -7),
		Block.createCuboidShape(21, -16, -8, 23, 22, -7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 16, 22, 11, 21, 23),
		Block.createCuboidShape(23, -11, 2, 24, -6, 21),
		Block.createCuboidShape(14, -10, 25, 20, 11, 26),
		Block.createCuboidShape(23, 16, 3, 24, 22, 20),
		Block.createCuboidShape(-15, -16, 0, 23, -15, 3),
		Block.createCuboidShape(-15, 16, 6, -14, 21, 17),
		Block.createCuboidShape(-15, 15, 0, 24, 16, 23),
		Block.createCuboidShape(-15, -12, 0, 24, -11, 23),
		Block.createCuboidShape(-15, -16, 11, 23, -15, 12),
		Block.createCuboidShape(-15, -16, 14, 23, -15, 15),
		Block.createCuboidShape(-15, -16, 17, 24, -15, 18),
		Block.createCuboidShape(-15, -16, 20, 23, -15, 21),
		Block.createCuboidShape(-15, -16, 5, 23, -15, 6),
		Block.createCuboidShape(-15, -16, 8, 23, -15, 9),
		Block.createCuboidShape(13, -12, 25, 14, 15, 26),
		Block.createCuboidShape(20, -12, 25, 21, 15, 26),
		Block.createCuboidShape(-15, -8, 2, -14, -7, 22),
		Block.createCuboidShape(-16, 21, 3, -14, 22, 20),
		Block.createCuboidShape(23, 8, 2, 24, 9, 21),
		Block.createCuboidShape(23, -16, 2, 24, -15, 21),
		Block.createCuboidShape(-15, -16, 2, -14, -15, 22),
		Block.createCuboidShape(-16, -16, 21, -14, 22, 23),
		Block.createCuboidShape(-16, -16, 0, -14, 22, 2),
		Block.createCuboidShape(23, -16, 0, 24, 22, 2),
		Block.createCuboidShape(23, -16, 21, 24, 22, 23)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-7, 16, -11, -6, 21, 11),
		Block.createCuboidShape(-5, -11, 23, 14, -6, 24),
		Block.createCuboidShape(-10, -10, 14, -9, 11, 20),
		Block.createCuboidShape(-4, 16, 23, 13, 22, 24),
		Block.createCuboidShape(13, -16, -15, 16, -15, 23),
		Block.createCuboidShape(-1, 16, -15, 10, 21, -14),
		Block.createCuboidShape(-7, 15, -15, 16, 16, 24),
		Block.createCuboidShape(-7, -12, -15, 16, -11, 24),
		Block.createCuboidShape(4, -16, -15, 5, -15, 23),
		Block.createCuboidShape(1, -16, -15, 2, -15, 23),
		Block.createCuboidShape(-2, -16, -15, -1, -15, 24),
		Block.createCuboidShape(-5, -16, -15, -4, -15, 23),
		Block.createCuboidShape(10, -16, -15, 11, -15, 23),
		Block.createCuboidShape(7, -16, -15, 8, -15, 23),
		Block.createCuboidShape(-10, -12, 13, -9, 15, 14),
		Block.createCuboidShape(-10, -12, 20, -9, 15, 21),
		Block.createCuboidShape(-6, -8, -15, 14, -7, -14),
		Block.createCuboidShape(-4, 21, -16, 13, 22, -14),
		Block.createCuboidShape(-5, 8, 23, 14, 9, 24),
		Block.createCuboidShape(-5, -16, 23, 14, -15, 24),
		Block.createCuboidShape(-6, -16, -15, 14, -15, -14),
		Block.createCuboidShape(-7, -16, -16, -5, 22, -14),
		Block.createCuboidShape(14, -16, -16, 16, 22, -14),
		Block.createCuboidShape(14, -16, 23, 16, 22, 24),
		Block.createCuboidShape(-7, -16, 23, -5, 22, 24)
    );

    public Girlbedl_Data() {
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

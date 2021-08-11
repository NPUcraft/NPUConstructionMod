package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Girlbedr_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 16, -7, 11, 21, -6),
		Block.createCuboidShape(23, -11, -5, 24, -6, 14),
		Block.createCuboidShape(14, -10, -10, 20, 11, -9),
		Block.createCuboidShape(23, 16, -4, 24, 22, 13),
		Block.createCuboidShape(-15, -16, 13, 23, -15, 16),
		Block.createCuboidShape(-15, 16, -1, -14, 21, 10),
		Block.createCuboidShape(-15, 15, -7, 24, 16, 16),
		Block.createCuboidShape(-15, -12, -7, 24, -11, 16),
		Block.createCuboidShape(-16, -16, -7, -14, 22, -5),
		Block.createCuboidShape(-16, -16, 14, -14, 22, 16),
		Block.createCuboidShape(23, -16, 14, 24, 22, 16),
		Block.createCuboidShape(23, -16, -7, 24, 22, -5),
		Block.createCuboidShape(-15, -8, -6, -14, -7, 14),
		Block.createCuboidShape(-16, 21, -4, -14, 22, 13),
		Block.createCuboidShape(23, 8, -5, 24, 9, 14),
		Block.createCuboidShape(23, -16, -5, 24, -15, 14),
		Block.createCuboidShape(-15, -16, -6, -14, -15, 14),
		Block.createCuboidShape(13, -12, -10, 14, 15, -9),
		Block.createCuboidShape(20, -12, -10, 21, 15, -9),
		Block.createCuboidShape(-15, -16, 4, 23, -15, 5),
		Block.createCuboidShape(-15, -16, 1, 23, -15, 2),
		Block.createCuboidShape(-15, -16, -2, 24, -15, -1),
		Block.createCuboidShape(-15, -16, -5, 23, -15, -4),
		Block.createCuboidShape(-15, -16, 10, 23, -15, 11),
		Block.createCuboidShape(-15, -16, 7, 23, -15, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(22, 16, -11, 23, 21, 11),
		Block.createCuboidShape(2, -11, 23, 21, -6, 24),
		Block.createCuboidShape(25, -10, 14, 26, 11, 20),
		Block.createCuboidShape(3, 16, 23, 20, 22, 24),
		Block.createCuboidShape(0, -16, -15, 3, -15, 23),
		Block.createCuboidShape(6, 16, -15, 17, 21, -14),
		Block.createCuboidShape(0, 15, -15, 23, 16, 24),
		Block.createCuboidShape(0, -12, -15, 23, -11, 24),
		Block.createCuboidShape(21, -16, -16, 23, 22, -14),
		Block.createCuboidShape(0, -16, -16, 2, 22, -14),
		Block.createCuboidShape(0, -16, 23, 2, 22, 24),
		Block.createCuboidShape(21, -16, 23, 23, 22, 24),
		Block.createCuboidShape(2, -8, -15, 22, -7, -14),
		Block.createCuboidShape(3, 21, -16, 20, 22, -14),
		Block.createCuboidShape(2, 8, 23, 21, 9, 24),
		Block.createCuboidShape(2, -16, 23, 21, -15, 24),
		Block.createCuboidShape(2, -16, -15, 22, -15, -14),
		Block.createCuboidShape(25, -12, 13, 26, 15, 14),
		Block.createCuboidShape(25, -12, 20, 26, 15, 21),
		Block.createCuboidShape(11, -16, -15, 12, -15, 23),
		Block.createCuboidShape(14, -16, -15, 15, -15, 23),
		Block.createCuboidShape(17, -16, -15, 18, -15, 24),
		Block.createCuboidShape(20, -16, -15, 21, -15, 23),
		Block.createCuboidShape(5, -16, -15, 6, -15, 23),
		Block.createCuboidShape(8, -16, -15, 9, -15, 23)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 16, 22, 27, 21, 23),
		Block.createCuboidShape(-8, -11, 2, -7, -6, 21),
		Block.createCuboidShape(-4, -10, 25, 2, 11, 26),
		Block.createCuboidShape(-8, 16, 3, -7, 22, 20),
		Block.createCuboidShape(-7, -16, 0, 31, -15, 3),
		Block.createCuboidShape(30, 16, 6, 31, 21, 17),
		Block.createCuboidShape(-8, 15, 0, 31, 16, 23),
		Block.createCuboidShape(-8, -12, 0, 31, -11, 23),
		Block.createCuboidShape(30, -16, 21, 32, 22, 23),
		Block.createCuboidShape(30, -16, 0, 32, 22, 2),
		Block.createCuboidShape(-8, -16, 0, -7, 22, 2),
		Block.createCuboidShape(-8, -16, 21, -7, 22, 23),
		Block.createCuboidShape(30, -8, 2, 31, -7, 22),
		Block.createCuboidShape(30, 21, 3, 32, 22, 20),
		Block.createCuboidShape(-8, 8, 2, -7, 9, 21),
		Block.createCuboidShape(-8, -16, 2, -7, -15, 21),
		Block.createCuboidShape(30, -16, 2, 31, -15, 22),
		Block.createCuboidShape(2, -12, 25, 3, 15, 26),
		Block.createCuboidShape(-5, -12, 25, -4, 15, 26),
		Block.createCuboidShape(-7, -16, 11, 31, -15, 12),
		Block.createCuboidShape(-7, -16, 14, 31, -15, 15),
		Block.createCuboidShape(-8, -16, 17, 31, -15, 18),
		Block.createCuboidShape(-7, -16, 20, 31, -15, 21),
		Block.createCuboidShape(-7, -16, 5, 31, -15, 6),
		Block.createCuboidShape(-7, -16, 8, 31, -15, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-7, 16, 5, -6, 21, 27),
		Block.createCuboidShape(-5, -11, -8, 14, -6, -7),
		Block.createCuboidShape(-10, -10, -4, -9, 11, 2),
		Block.createCuboidShape(-4, 16, -8, 13, 22, -7),
		Block.createCuboidShape(13, -16, -7, 16, -15, 31),
		Block.createCuboidShape(-1, 16, 30, 10, 21, 31),
		Block.createCuboidShape(-7, 15, -8, 16, 16, 31),
		Block.createCuboidShape(-7, -12, -8, 16, -11, 31),
		Block.createCuboidShape(-7, -16, 30, -5, 22, 32),
		Block.createCuboidShape(14, -16, 30, 16, 22, 32),
		Block.createCuboidShape(14, -16, -8, 16, 22, -7),
		Block.createCuboidShape(-7, -16, -8, -5, 22, -7),
		Block.createCuboidShape(-6, -8, 30, 14, -7, 31),
		Block.createCuboidShape(-4, 21, 30, 13, 22, 32),
		Block.createCuboidShape(-5, 8, -8, 14, 9, -7),
		Block.createCuboidShape(-5, -16, -8, 14, -15, -7),
		Block.createCuboidShape(-6, -16, 30, 14, -15, 31),
		Block.createCuboidShape(-10, -12, 2, -9, 15, 3),
		Block.createCuboidShape(-10, -12, -5, -9, 15, -4),
		Block.createCuboidShape(4, -16, -7, 5, -15, 31),
		Block.createCuboidShape(1, -16, -7, 2, -15, 31),
		Block.createCuboidShape(-2, -16, -8, -1, -15, 31),
		Block.createCuboidShape(-5, -16, -7, -4, -15, 31),
		Block.createCuboidShape(10, -16, -7, 11, -15, 31),
		Block.createCuboidShape(7, -16, -7, 8, -15, 31)
    );

    public Girlbedr_Data() {
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

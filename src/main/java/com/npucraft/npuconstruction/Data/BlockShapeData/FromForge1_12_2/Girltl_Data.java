package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Girltl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(8, -15, -3, 24, -14, 24),
		Block.createCuboidShape(1, 9, 5, 3, 19, 12),
		Block.createCuboidShape(1, 18, 19, 31, 28, 21),
		Block.createCuboidShape(20, 25, -5, 31, 27, -1),
		Block.createCuboidShape(9, 13, 27, 23, 14, 31),
		Block.createCuboidShape(8, -15, 24, 24, -14, 31),
		Block.createCuboidShape(29, 7, -16, 31, 13, -8),
		Block.createCuboidShape(13, 30, -5, 19, 32, 1),
		Block.createCuboidShape(1, -16, -16, 31, -15, 31),
		Block.createCuboidShape(31, -16, -16, 32, 32, 32),
		Block.createCuboidShape(0, -16, -16, 1, 32, 32),
		Block.createCuboidShape(1, -16, 31, 31, 32, 32),
		Block.createCuboidShape(24, -15, -16, 31, -14, 31),
		Block.createCuboidShape(1, -15, -16, 8, -14, 31),
		Block.createCuboidShape(1, 10, 13, 2, 11, 31),
		Block.createCuboidShape(8, -15, -16, 31, -14, -3),
		Block.createCuboidShape(1, 17, 20, 31, 18, 31),
		Block.createCuboidShape(1, 28, 20, 31, 29, 31),
		Block.createCuboidShape(15, -14, 28, 17, 7, 30),
		Block.createCuboidShape(1, -14, -16, 4, 32, -13),
		Block.createCuboidShape(2, 5, -13, 4, 7, 31),
		Block.createCuboidShape(3, 9, -7, 4, 10, -2),
		Block.createCuboidShape(30, 8, 0, 31, 9, 31),
		Block.createCuboidShape(29, 6, -6, 31, 9, 0),
		Block.createCuboidShape(29, 9, -4, 31, 26, -2),
		Block.createCuboidShape(1, 9, 4, 3, 19, 5),
		Block.createCuboidShape(1, 18, 14, 2, 32, 15),
		Block.createCuboidShape(1, 9, 12, 3, 19, 13),
		Block.createCuboidShape(9, 11, 27, 23, 12, 31)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-8, -15, 8, 19, -14, 24),
		Block.createCuboidShape(4, 9, 1, 11, 19, 3),
		Block.createCuboidShape(-5, 18, 1, -3, 28, 31),
		Block.createCuboidShape(17, 25, 20, 21, 27, 31),
		Block.createCuboidShape(-15, 13, 9, -11, 14, 23),
		Block.createCuboidShape(-15, -15, 8, -8, -14, 24),
		Block.createCuboidShape(24, 7, 29, 32, 13, 31),
		Block.createCuboidShape(15, 30, 13, 21, 32, 19),
		Block.createCuboidShape(-15, -16, 1, 32, -15, 31),
		Block.createCuboidShape(-16, -16, 31, 32, 32, 32),
		Block.createCuboidShape(-16, -16, 0, 32, 32, 1),
		Block.createCuboidShape(-16, -16, 1, -15, 32, 31),
		Block.createCuboidShape(-15, -15, 24, 32, -14, 31),
		Block.createCuboidShape(-15, -15, 1, 32, -14, 8),
		Block.createCuboidShape(-15, 10, 1, 3, 11, 2),
		Block.createCuboidShape(19, -15, 8, 32, -14, 31),
		Block.createCuboidShape(-15, 17, 1, -4, 18, 31),
		Block.createCuboidShape(-15, 28, 1, -4, 29, 31),
		Block.createCuboidShape(-14, -14, 15, -12, 7, 17),
		Block.createCuboidShape(29, -14, 1, 32, 32, 4),
		Block.createCuboidShape(-15, 5, 2, 29, 7, 4),
		Block.createCuboidShape(18, 9, 3, 23, 10, 4),
		Block.createCuboidShape(-15, 8, 30, 16, 9, 31),
		Block.createCuboidShape(16, 6, 29, 22, 9, 31),
		Block.createCuboidShape(18, 9, 29, 20, 26, 31),
		Block.createCuboidShape(11, 9, 1, 12, 19, 3),
		Block.createCuboidShape(1, 18, 1, 2, 32, 2),
		Block.createCuboidShape(3, 9, 1, 4, 19, 3),
		Block.createCuboidShape(-15, 11, 9, -11, 12, 23)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -15, -8, 8, -14, 19),
		Block.createCuboidShape(13, 9, 4, 15, 19, 11),
		Block.createCuboidShape(-15, 18, -5, 15, 28, -3),
		Block.createCuboidShape(-15, 25, 17, -4, 27, 21),
		Block.createCuboidShape(-7, 13, -15, 7, 14, -11),
		Block.createCuboidShape(-8, -15, -15, 8, -14, -8),
		Block.createCuboidShape(-15, 7, 24, -13, 13, 32),
		Block.createCuboidShape(-3, 30, 15, 3, 32, 21),
		Block.createCuboidShape(-15, -16, -15, 15, -15, 32),
		Block.createCuboidShape(-16, -16, -16, -15, 32, 32),
		Block.createCuboidShape(15, -16, -16, 16, 32, 32),
		Block.createCuboidShape(-15, -16, -16, 15, 32, -15),
		Block.createCuboidShape(-15, -15, -15, -8, -14, 32),
		Block.createCuboidShape(8, -15, -15, 15, -14, 32),
		Block.createCuboidShape(14, 10, -15, 15, 11, 3),
		Block.createCuboidShape(-15, -15, 19, 8, -14, 32),
		Block.createCuboidShape(-15, 17, -15, 15, 18, -4),
		Block.createCuboidShape(-15, 28, -15, 15, 29, -4),
		Block.createCuboidShape(-1, -14, -14, 1, 7, -12),
		Block.createCuboidShape(12, -14, 29, 15, 32, 32),
		Block.createCuboidShape(12, 5, -15, 14, 7, 29),
		Block.createCuboidShape(12, 9, 18, 13, 10, 23),
		Block.createCuboidShape(-15, 8, -15, -14, 9, 16),
		Block.createCuboidShape(-15, 6, 16, -13, 9, 22),
		Block.createCuboidShape(-15, 9, 18, -13, 26, 20),
		Block.createCuboidShape(13, 9, 11, 15, 19, 12),
		Block.createCuboidShape(14, 18, 1, 15, 32, 2),
		Block.createCuboidShape(13, 9, 3, 15, 19, 4),
		Block.createCuboidShape(-7, 11, -15, 7, 12, -11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-3, -15, -8, 24, -14, 8),
		Block.createCuboidShape(5, 9, 13, 12, 19, 15),
		Block.createCuboidShape(19, 18, -15, 21, 28, 15),
		Block.createCuboidShape(-5, 25, -15, -1, 27, -4),
		Block.createCuboidShape(27, 13, -7, 31, 14, 7),
		Block.createCuboidShape(24, -15, -8, 31, -14, 8),
		Block.createCuboidShape(-16, 7, -15, -8, 13, -13),
		Block.createCuboidShape(-5, 30, -3, 1, 32, 3),
		Block.createCuboidShape(-16, -16, -15, 31, -15, 15),
		Block.createCuboidShape(-16, -16, -16, 32, 32, -15),
		Block.createCuboidShape(-16, -16, 15, 32, 32, 16),
		Block.createCuboidShape(31, -16, -15, 32, 32, 15),
		Block.createCuboidShape(-16, -15, -15, 31, -14, -8),
		Block.createCuboidShape(-16, -15, 8, 31, -14, 15),
		Block.createCuboidShape(13, 10, 14, 31, 11, 15),
		Block.createCuboidShape(-16, -15, -15, -3, -14, 8),
		Block.createCuboidShape(20, 17, -15, 31, 18, 15),
		Block.createCuboidShape(20, 28, -15, 31, 29, 15),
		Block.createCuboidShape(28, -14, -1, 30, 7, 1),
		Block.createCuboidShape(-16, -14, 12, -13, 32, 15),
		Block.createCuboidShape(-13, 5, 12, 31, 7, 14),
		Block.createCuboidShape(-7, 9, 12, -2, 10, 13),
		Block.createCuboidShape(0, 8, -15, 31, 9, -14),
		Block.createCuboidShape(-6, 6, -15, 0, 9, -13),
		Block.createCuboidShape(-4, 9, -15, -2, 26, -13),
		Block.createCuboidShape(4, 9, 13, 5, 19, 15),
		Block.createCuboidShape(14, 18, 14, 15, 32, 15),
		Block.createCuboidShape(12, 9, 13, 13, 19, 15),
		Block.createCuboidShape(27, 11, -7, 31, 12, 7)
    );

    public Girltl_Data() {
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

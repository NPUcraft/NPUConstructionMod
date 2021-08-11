package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Girltr_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -15, -3, 8, -14, 24),
		Block.createCuboidShape(13, 9, 5, 15, 19, 12),
		Block.createCuboidShape(-15, 18, 19, 15, 28, 21),
		Block.createCuboidShape(-15, 25, -5, -4, 27, -1),
		Block.createCuboidShape(-7, 13, 27, 7, 14, 31),
		Block.createCuboidShape(-8, -15, 24, 8, -14, 31),
		Block.createCuboidShape(-15, 7, -16, -13, 13, -8),
		Block.createCuboidShape(-3, 30, -5, 3, 32, 1),
		Block.createCuboidShape(-15, -16, -16, 15, -15, 31),
		Block.createCuboidShape(-16, -16, -16, -15, 32, 32),
		Block.createCuboidShape(15, -16, -16, 16, 32, 32),
		Block.createCuboidShape(-15, -16, 31, 15, 32, 32),
		Block.createCuboidShape(-15, -15, -16, -8, -14, 31),
		Block.createCuboidShape(8, -15, -16, 15, -14, 31),
		Block.createCuboidShape(14, 10, 13, 15, 11, 31),
		Block.createCuboidShape(-15, -15, -16, 8, -14, -3),
		Block.createCuboidShape(-15, 17, 20, 15, 18, 31),
		Block.createCuboidShape(-15, 28, 20, 15, 29, 31),
		Block.createCuboidShape(-1, -14, 28, 1, 7, 30),
		Block.createCuboidShape(12, -14, -16, 15, 32, -13),
		Block.createCuboidShape(12, 5, -13, 14, 7, 31),
		Block.createCuboidShape(12, 9, -7, 13, 10, -2),
		Block.createCuboidShape(-15, 8, 0, -14, 9, 31),
		Block.createCuboidShape(-15, 6, -6, -13, 9, 0),
		Block.createCuboidShape(-15, 9, -4, -13, 26, -2),
		Block.createCuboidShape(13, 9, 4, 15, 19, 5),
		Block.createCuboidShape(14, 18, 14, 15, 32, 15),
		Block.createCuboidShape(13, 9, 12, 15, 19, 13),
		Block.createCuboidShape(-7, 11, 27, 7, 12, 31)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-8, -15, -8, 19, -14, 8),
		Block.createCuboidShape(4, 9, 13, 11, 19, 15),
		Block.createCuboidShape(-5, 18, -15, -3, 28, 15),
		Block.createCuboidShape(17, 25, -15, 21, 27, -4),
		Block.createCuboidShape(-15, 13, -7, -11, 14, 7),
		Block.createCuboidShape(-15, -15, -8, -8, -14, 8),
		Block.createCuboidShape(24, 7, -15, 32, 13, -13),
		Block.createCuboidShape(15, 30, -3, 21, 32, 3),
		Block.createCuboidShape(-15, -16, -15, 32, -15, 15),
		Block.createCuboidShape(-16, -16, -16, 32, 32, -15),
		Block.createCuboidShape(-16, -16, 15, 32, 32, 16),
		Block.createCuboidShape(-16, -16, -15, -15, 32, 15),
		Block.createCuboidShape(-15, -15, -15, 32, -14, -8),
		Block.createCuboidShape(-15, -15, 8, 32, -14, 15),
		Block.createCuboidShape(-15, 10, 14, 3, 11, 15),
		Block.createCuboidShape(19, -15, -15, 32, -14, 8),
		Block.createCuboidShape(-15, 17, -15, -4, 18, 15),
		Block.createCuboidShape(-15, 28, -15, -4, 29, 15),
		Block.createCuboidShape(-14, -14, -1, -12, 7, 1),
		Block.createCuboidShape(29, -14, 12, 32, 32, 15),
		Block.createCuboidShape(-15, 5, 12, 29, 7, 14),
		Block.createCuboidShape(18, 9, 12, 23, 10, 13),
		Block.createCuboidShape(-15, 8, -15, 16, 9, -14),
		Block.createCuboidShape(16, 6, -15, 22, 9, -13),
		Block.createCuboidShape(18, 9, -15, 20, 26, -13),
		Block.createCuboidShape(11, 9, 13, 12, 19, 15),
		Block.createCuboidShape(1, 18, 14, 2, 32, 15),
		Block.createCuboidShape(3, 9, 13, 4, 19, 15),
		Block.createCuboidShape(-15, 11, -7, -11, 12, 7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, -15, -8, 24, -14, 19),
		Block.createCuboidShape(1, 9, 4, 3, 19, 11),
		Block.createCuboidShape(1, 18, -5, 31, 28, -3),
		Block.createCuboidShape(20, 25, 17, 31, 27, 21),
		Block.createCuboidShape(9, 13, -15, 23, 14, -11),
		Block.createCuboidShape(8, -15, -15, 24, -14, -8),
		Block.createCuboidShape(29, 7, 24, 31, 13, 32),
		Block.createCuboidShape(13, 30, 15, 19, 32, 21),
		Block.createCuboidShape(1, -16, -15, 31, -15, 32),
		Block.createCuboidShape(31, -16, -16, 32, 32, 32),
		Block.createCuboidShape(0, -16, -16, 1, 32, 32),
		Block.createCuboidShape(1, -16, -16, 31, 32, -15),
		Block.createCuboidShape(24, -15, -15, 31, -14, 32),
		Block.createCuboidShape(1, -15, -15, 8, -14, 32),
		Block.createCuboidShape(1, 10, -15, 2, 11, 3),
		Block.createCuboidShape(8, -15, 19, 31, -14, 32),
		Block.createCuboidShape(1, 17, -15, 31, 18, -4),
		Block.createCuboidShape(1, 28, -15, 31, 29, -4),
		Block.createCuboidShape(15, -14, -14, 17, 7, -12),
		Block.createCuboidShape(1, -14, 29, 4, 32, 32),
		Block.createCuboidShape(2, 5, -15, 4, 7, 29),
		Block.createCuboidShape(3, 9, 18, 4, 10, 23),
		Block.createCuboidShape(30, 8, -15, 31, 9, 16),
		Block.createCuboidShape(29, 6, 16, 31, 9, 22),
		Block.createCuboidShape(29, 9, 18, 31, 26, 20),
		Block.createCuboidShape(1, 9, 11, 3, 19, 12),
		Block.createCuboidShape(1, 18, 1, 2, 32, 2),
		Block.createCuboidShape(1, 9, 3, 3, 19, 4),
		Block.createCuboidShape(9, 11, -15, 23, 12, -11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-3, -15, 8, 24, -14, 24),
		Block.createCuboidShape(5, 9, 1, 12, 19, 3),
		Block.createCuboidShape(19, 18, 1, 21, 28, 31),
		Block.createCuboidShape(-5, 25, 20, -1, 27, 31),
		Block.createCuboidShape(27, 13, 9, 31, 14, 23),
		Block.createCuboidShape(24, -15, 8, 31, -14, 24),
		Block.createCuboidShape(-16, 7, 29, -8, 13, 31),
		Block.createCuboidShape(-5, 30, 13, 1, 32, 19),
		Block.createCuboidShape(-16, -16, 1, 31, -15, 31),
		Block.createCuboidShape(-16, -16, 31, 32, 32, 32),
		Block.createCuboidShape(-16, -16, 0, 32, 32, 1),
		Block.createCuboidShape(31, -16, 1, 32, 32, 31),
		Block.createCuboidShape(-16, -15, 24, 31, -14, 31),
		Block.createCuboidShape(-16, -15, 1, 31, -14, 8),
		Block.createCuboidShape(13, 10, 1, 31, 11, 2),
		Block.createCuboidShape(-16, -15, 8, -3, -14, 31),
		Block.createCuboidShape(20, 17, 1, 31, 18, 31),
		Block.createCuboidShape(20, 28, 1, 31, 29, 31),
		Block.createCuboidShape(28, -14, 15, 30, 7, 17),
		Block.createCuboidShape(-16, -14, 1, -13, 32, 4),
		Block.createCuboidShape(-13, 5, 2, 31, 7, 4),
		Block.createCuboidShape(-7, 9, 3, -2, 10, 4),
		Block.createCuboidShape(0, 8, 30, 31, 9, 31),
		Block.createCuboidShape(-6, 6, 29, 0, 9, 31),
		Block.createCuboidShape(-4, 9, 29, -2, 26, 31),
		Block.createCuboidShape(4, 9, 1, 5, 19, 3),
		Block.createCuboidShape(14, 18, 1, 15, 32, 2),
		Block.createCuboidShape(12, 9, 1, 13, 19, 3),
		Block.createCuboidShape(27, 11, 9, 31, 12, 23)
    );

    public Girltr_Data() {
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

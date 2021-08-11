package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bath_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(29, 7, -6, 31, 17, 1),
		Block.createCuboidShape(1, -16, -16, 5, 29, -12),
		Block.createCuboidShape(27, -16, -16, 31, 29, -12),
		Block.createCuboidShape(1, 28, -16, 31, 32, -12),
		Block.createCuboidShape(15, 3, 13, 20, 28, 14),
		Block.createCuboidShape(4, -16, -16, 28, -14, -13),
		Block.createCuboidShape(1, 17, -7, 2, 22, 8),
		Block.createCuboidShape(3, 7, 14, 11, 13, 16),
		Block.createCuboidShape(13, 30, -5, 19, 32, 1),
		Block.createCuboidShape(0, -16, -16, 1, 32, 16),
		Block.createCuboidShape(31, -16, -16, 32, 32, 16),
		Block.createCuboidShape(1, -16, 15, 31, 32, 16),
		Block.createCuboidShape(29, -16, 10, 31, 32, 14),
		Block.createCuboidShape(28, -16, 11, 29, 32, 13),
		Block.createCuboidShape(1, 27, 12, 28, 30, 14),
		Block.createCuboidShape(12, 4, 13, 13, 25, 14),
		Block.createCuboidShape(0, 25, 13, 12, 26, 14),
		Block.createCuboidShape(29, 7, -7, 31, 17, -6),
		Block.createCuboidShape(30, 15, 2, 31, 16, 9),
		Block.createCuboidShape(30, 16, 8, 31, 30, 9),
		Block.createCuboidShape(0, 29, 8, 30, 30, 9),
		Block.createCuboidShape(29, 7, 1, 31, 17, 2),
		Block.createCuboidShape(5, -15, -15, 6, 28, -13),
		Block.createCuboidShape(26, -15, -15, 27, 28, -13),
		Block.createCuboidShape(6, 27, -15, 26, 28, -13),
		Block.createCuboidShape(9, -16, -9, 23, -16, 10),
		Block.createCuboidShape(5, 21, -6, 6, 22, 7),
		Block.createCuboidShape(4, 17, -6, 5, 18, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 7, 29, 22, 17, 31),
		Block.createCuboidShape(28, -16, 1, 32, 29, 5),
		Block.createCuboidShape(28, -16, 27, 32, 29, 31),
		Block.createCuboidShape(28, 28, 1, 32, 32, 31),
		Block.createCuboidShape(2, 3, 15, 3, 28, 20),
		Block.createCuboidShape(29, -16, 4, 32, -14, 28),
		Block.createCuboidShape(8, 17, 1, 23, 22, 2),
		Block.createCuboidShape(0, 7, 3, 2, 13, 11),
		Block.createCuboidShape(15, 30, 13, 21, 32, 19),
		Block.createCuboidShape(0, -16, 0, 32, 32, 1),
		Block.createCuboidShape(0, -16, 31, 32, 32, 32),
		Block.createCuboidShape(0, -16, 1, 1, 32, 31),
		Block.createCuboidShape(2, -16, 29, 6, 32, 31),
		Block.createCuboidShape(3, -16, 28, 5, 32, 29),
		Block.createCuboidShape(2, 27, 1, 4, 30, 28),
		Block.createCuboidShape(2, 4, 12, 3, 25, 13),
		Block.createCuboidShape(2, 25, 0, 3, 26, 12),
		Block.createCuboidShape(22, 7, 29, 23, 17, 31),
		Block.createCuboidShape(7, 15, 30, 14, 16, 31),
		Block.createCuboidShape(7, 16, 30, 8, 30, 31),
		Block.createCuboidShape(7, 29, 0, 8, 30, 30),
		Block.createCuboidShape(14, 7, 29, 15, 17, 31),
		Block.createCuboidShape(29, -15, 5, 31, 28, 6),
		Block.createCuboidShape(29, -15, 26, 31, 28, 27),
		Block.createCuboidShape(29, 27, 6, 31, 28, 26),
		Block.createCuboidShape(6, -16, 9, 25, -16, 23),
		Block.createCuboidShape(9, 21, 5, 22, 22, 6),
		Block.createCuboidShape(9, 17, 4, 22, 18, 5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 7, 15, -13, 17, 22),
		Block.createCuboidShape(11, -16, 28, 15, 29, 32),
		Block.createCuboidShape(-15, -16, 28, -11, 29, 32),
		Block.createCuboidShape(-15, 28, 28, 15, 32, 32),
		Block.createCuboidShape(-4, 3, 2, 1, 28, 3),
		Block.createCuboidShape(-12, -16, 29, 12, -14, 32),
		Block.createCuboidShape(14, 17, 8, 15, 22, 23),
		Block.createCuboidShape(5, 7, 0, 13, 13, 2),
		Block.createCuboidShape(-3, 30, 15, 3, 32, 21),
		Block.createCuboidShape(15, -16, 0, 16, 32, 32),
		Block.createCuboidShape(-16, -16, 0, -15, 32, 32),
		Block.createCuboidShape(-15, -16, 0, 15, 32, 1),
		Block.createCuboidShape(-15, -16, 2, -13, 32, 6),
		Block.createCuboidShape(-13, -16, 3, -12, 32, 5),
		Block.createCuboidShape(-12, 27, 2, 15, 30, 4),
		Block.createCuboidShape(3, 4, 2, 4, 25, 3),
		Block.createCuboidShape(4, 25, 2, 16, 26, 3),
		Block.createCuboidShape(-15, 7, 22, -13, 17, 23),
		Block.createCuboidShape(-15, 15, 7, -14, 16, 14),
		Block.createCuboidShape(-15, 16, 7, -14, 30, 8),
		Block.createCuboidShape(-14, 29, 7, 16, 30, 8),
		Block.createCuboidShape(-15, 7, 14, -13, 17, 15),
		Block.createCuboidShape(10, -15, 29, 11, 28, 31),
		Block.createCuboidShape(-11, -15, 29, -10, 28, 31),
		Block.createCuboidShape(-10, 27, 29, 10, 28, 31),
		Block.createCuboidShape(-7, -16, 6, 7, -16, 25),
		Block.createCuboidShape(10, 21, 9, 11, 22, 22),
		Block.createCuboidShape(11, 17, 9, 12, 18, 22)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-6, 7, -15, 1, 17, -13),
		Block.createCuboidShape(-16, -16, 11, -12, 29, 15),
		Block.createCuboidShape(-16, -16, -15, -12, 29, -11),
		Block.createCuboidShape(-16, 28, -15, -12, 32, 15),
		Block.createCuboidShape(13, 3, -4, 14, 28, 1),
		Block.createCuboidShape(-16, -16, -12, -13, -14, 12),
		Block.createCuboidShape(-7, 17, 14, 8, 22, 15),
		Block.createCuboidShape(14, 7, 5, 16, 13, 13),
		Block.createCuboidShape(-5, 30, -3, 1, 32, 3),
		Block.createCuboidShape(-16, -16, 15, 16, 32, 16),
		Block.createCuboidShape(-16, -16, -16, 16, 32, -15),
		Block.createCuboidShape(15, -16, -15, 16, 32, 15),
		Block.createCuboidShape(10, -16, -15, 14, 32, -13),
		Block.createCuboidShape(11, -16, -13, 13, 32, -12),
		Block.createCuboidShape(12, 27, -12, 14, 30, 15),
		Block.createCuboidShape(13, 4, 3, 14, 25, 4),
		Block.createCuboidShape(13, 25, 4, 14, 26, 16),
		Block.createCuboidShape(-7, 7, -15, -6, 17, -13),
		Block.createCuboidShape(2, 15, -15, 9, 16, -14),
		Block.createCuboidShape(8, 16, -15, 9, 30, -14),
		Block.createCuboidShape(8, 29, -14, 9, 30, 16),
		Block.createCuboidShape(1, 7, -15, 2, 17, -13),
		Block.createCuboidShape(-15, -15, 10, -13, 28, 11),
		Block.createCuboidShape(-15, -15, -11, -13, 28, -10),
		Block.createCuboidShape(-15, 27, -10, -13, 28, 10),
		Block.createCuboidShape(-9, -16, -7, 10, -16, 7),
		Block.createCuboidShape(-6, 21, 10, 7, 22, 11),
		Block.createCuboidShape(-6, 17, 11, 7, 18, 12)
    );

    public Bath_Data() {
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

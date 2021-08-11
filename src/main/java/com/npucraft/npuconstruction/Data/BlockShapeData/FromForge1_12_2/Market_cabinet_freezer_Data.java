package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Market_cabinet_freezer_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -3, 7, 12, 1, 14),
		Block.createCuboidShape(8, 11, 6, 18, 15, 13),
		Block.createCuboidShape(18, 4, 8, 29, 10, 12),
		Block.createCuboidShape(-3, 4, 9, 5, 9, 13),
		Block.createCuboidShape(13, -3, 6, 24, 2, 10),
		Block.createCuboidShape(-16, 2, 7, 32, 12, 8),
		Block.createCuboidShape(-16, 17, 7, 32, 26, 8),
		Block.createCuboidShape(-7, -3, 8, 1, 1, 14),
		Block.createCuboidShape(2, 25, 8, 10, 31, 12),
		Block.createCuboidShape(19, 18, 6, 28, 23, 14),
		Block.createCuboidShape(-12, 25, 6, -1, 30, 10),
		Block.createCuboidShape(14, 25, 7, 25, 30, 11),
		Block.createCuboidShape(-1, 11, 7, 4, 16, 14),
		Block.createCuboidShape(4, 18, 7, 11, 24, 12),
		Block.createCuboidShape(-9, 11, 7, -4, 16, 14),
		Block.createCuboidShape(-9, 18, 6, 1, 20, 12),
		Block.createCuboidShape(-14, 4, 7, -6, 9, 11),
		Block.createCuboidShape(-16, -16, 5, 32, -3, 15),
		Block.createCuboidShape(-16, -5, 4, 32, -3, 5),
		Block.createCuboidShape(20, 11, 8, 27, 15, 13),
		Block.createCuboidShape(8, 4, 8, 14, 8, 12),
		Block.createCuboidShape(-16, -3, 8, -15, 31, 15),
		Block.createCuboidShape(31, -3, 8, 32, 31, 15),
		Block.createCuboidShape(-16, -16, 15, 32, 32, 16),
		Block.createCuboidShape(-6, 20, 6, -2, 22, 12),
		Block.createCuboidShape(28, 25, 9, 30, 30, 13),
		Block.createCuboidShape(14, 18, 6, 18, 23, 14),
		Block.createCuboidShape(20, -10, 4, 25, -8, 5),
		Block.createCuboidShape(-15, 3, 8, 31, 4, 14),
		Block.createCuboidShape(-15, 10, 8, 31, 11, 14),
		Block.createCuboidShape(-15, 17, 8, 31, 18, 14),
		Block.createCuboidShape(-15, 24, 8, 31, 25, 14),
		Block.createCuboidShape(-16, 31, 5, 32, 32, 15),
		Block.createCuboidShape(-16, 30, 3, 32, 32, 5),
		Block.createCuboidShape(-15, 23, 12, 31, 24, 14),
		Block.createCuboidShape(-15, 30, 12, 31, 31, 15),
		Block.createCuboidShape(-15, 16, 12, 31, 17, 14),
		Block.createCuboidShape(-15, 9, 12, 31, 10, 14),
		Block.createCuboidShape(-15, 2, 12, 31, 3, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, -3, 3, 9, 1, 12),
		Block.createCuboidShape(3, 11, 8, 10, 15, 18),
		Block.createCuboidShape(4, 4, 18, 8, 10, 29),
		Block.createCuboidShape(3, 4, -3, 7, 9, 5),
		Block.createCuboidShape(6, -3, 13, 10, 2, 24),
		Block.createCuboidShape(8, 2, -16, 9, 12, 32),
		Block.createCuboidShape(8, 17, -16, 9, 26, 32),
		Block.createCuboidShape(2, -3, -7, 8, 1, 1),
		Block.createCuboidShape(4, 25, 2, 8, 31, 10),
		Block.createCuboidShape(2, 18, 19, 10, 23, 28),
		Block.createCuboidShape(6, 25, -12, 10, 30, -1),
		Block.createCuboidShape(5, 25, 14, 9, 30, 25),
		Block.createCuboidShape(2, 11, -1, 9, 16, 4),
		Block.createCuboidShape(4, 18, 4, 9, 24, 11),
		Block.createCuboidShape(2, 11, -9, 9, 16, -4),
		Block.createCuboidShape(4, 18, -9, 10, 20, 1),
		Block.createCuboidShape(5, 4, -14, 9, 9, -6),
		Block.createCuboidShape(1, -16, -16, 11, -3, 32),
		Block.createCuboidShape(11, -5, -16, 12, -3, 32),
		Block.createCuboidShape(3, 11, 20, 8, 15, 27),
		Block.createCuboidShape(4, 4, 8, 8, 8, 14),
		Block.createCuboidShape(1, -3, -16, 8, 31, -15),
		Block.createCuboidShape(1, -3, 31, 8, 31, 32),
		Block.createCuboidShape(0, -16, -16, 1, 32, 32),
		Block.createCuboidShape(4, 20, -6, 10, 22, -2),
		Block.createCuboidShape(3, 25, 28, 7, 30, 30),
		Block.createCuboidShape(2, 18, 14, 10, 23, 18),
		Block.createCuboidShape(11, -10, 20, 12, -8, 25),
		Block.createCuboidShape(2, 3, -15, 8, 4, 31),
		Block.createCuboidShape(2, 10, -15, 8, 11, 31),
		Block.createCuboidShape(2, 17, -15, 8, 18, 31),
		Block.createCuboidShape(2, 24, -15, 8, 25, 31),
		Block.createCuboidShape(1, 31, -16, 11, 32, 32),
		Block.createCuboidShape(11, 30, -16, 13, 32, 32),
		Block.createCuboidShape(2, 23, -15, 4, 24, 31),
		Block.createCuboidShape(1, 30, -15, 4, 31, 31),
		Block.createCuboidShape(2, 16, -15, 4, 17, 31),
		Block.createCuboidShape(2, 9, -15, 4, 10, 31),
		Block.createCuboidShape(2, 2, -15, 4, 3, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, -3, 2, 13, 1, 9),
		Block.createCuboidShape(-2, 11, 3, 8, 15, 10),
		Block.createCuboidShape(-13, 4, 4, -2, 10, 8),
		Block.createCuboidShape(11, 4, 3, 19, 9, 7),
		Block.createCuboidShape(-8, -3, 6, 3, 2, 10),
		Block.createCuboidShape(-16, 2, 8, 32, 12, 9),
		Block.createCuboidShape(-16, 17, 8, 32, 26, 9),
		Block.createCuboidShape(15, -3, 2, 23, 1, 8),
		Block.createCuboidShape(6, 25, 4, 14, 31, 8),
		Block.createCuboidShape(-12, 18, 2, -3, 23, 10),
		Block.createCuboidShape(17, 25, 6, 28, 30, 10),
		Block.createCuboidShape(-9, 25, 5, 2, 30, 9),
		Block.createCuboidShape(12, 11, 2, 17, 16, 9),
		Block.createCuboidShape(5, 18, 4, 12, 24, 9),
		Block.createCuboidShape(20, 11, 2, 25, 16, 9),
		Block.createCuboidShape(15, 18, 4, 25, 20, 10),
		Block.createCuboidShape(22, 4, 5, 30, 9, 9),
		Block.createCuboidShape(-16, -16, 1, 32, -3, 11),
		Block.createCuboidShape(-16, -5, 11, 32, -3, 12),
		Block.createCuboidShape(-11, 11, 3, -4, 15, 8),
		Block.createCuboidShape(2, 4, 4, 8, 8, 8),
		Block.createCuboidShape(31, -3, 1, 32, 31, 8),
		Block.createCuboidShape(-16, -3, 1, -15, 31, 8),
		Block.createCuboidShape(-16, -16, 0, 32, 32, 1),
		Block.createCuboidShape(18, 20, 4, 22, 22, 10),
		Block.createCuboidShape(-14, 25, 3, -12, 30, 7),
		Block.createCuboidShape(-2, 18, 2, 2, 23, 10),
		Block.createCuboidShape(-9, -10, 11, -4, -8, 12),
		Block.createCuboidShape(-15, 3, 2, 31, 4, 8),
		Block.createCuboidShape(-15, 10, 2, 31, 11, 8),
		Block.createCuboidShape(-15, 17, 2, 31, 18, 8),
		Block.createCuboidShape(-15, 24, 2, 31, 25, 8),
		Block.createCuboidShape(-16, 31, 1, 32, 32, 11),
		Block.createCuboidShape(-16, 30, 11, 32, 32, 13),
		Block.createCuboidShape(-15, 23, 2, 31, 24, 4),
		Block.createCuboidShape(-15, 30, 1, 31, 31, 4),
		Block.createCuboidShape(-15, 16, 2, 31, 17, 4),
		Block.createCuboidShape(-15, 9, 2, 31, 10, 4),
		Block.createCuboidShape(-15, 2, 2, 31, 3, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -3, 4, 14, 1, 13),
		Block.createCuboidShape(6, 11, -2, 13, 15, 8),
		Block.createCuboidShape(8, 4, -13, 12, 10, -2),
		Block.createCuboidShape(9, 4, 11, 13, 9, 19),
		Block.createCuboidShape(6, -3, -8, 10, 2, 3),
		Block.createCuboidShape(7, 2, -16, 8, 12, 32),
		Block.createCuboidShape(7, 17, -16, 8, 26, 32),
		Block.createCuboidShape(8, -3, 15, 14, 1, 23),
		Block.createCuboidShape(8, 25, 6, 12, 31, 14),
		Block.createCuboidShape(6, 18, -12, 14, 23, -3),
		Block.createCuboidShape(6, 25, 17, 10, 30, 28),
		Block.createCuboidShape(7, 25, -9, 11, 30, 2),
		Block.createCuboidShape(7, 11, 12, 14, 16, 17),
		Block.createCuboidShape(7, 18, 5, 12, 24, 12),
		Block.createCuboidShape(7, 11, 20, 14, 16, 25),
		Block.createCuboidShape(6, 18, 15, 12, 20, 25),
		Block.createCuboidShape(7, 4, 22, 11, 9, 30),
		Block.createCuboidShape(5, -16, -16, 15, -3, 32),
		Block.createCuboidShape(4, -5, -16, 5, -3, 32),
		Block.createCuboidShape(8, 11, -11, 13, 15, -4),
		Block.createCuboidShape(8, 4, 2, 12, 8, 8),
		Block.createCuboidShape(8, -3, 31, 15, 31, 32),
		Block.createCuboidShape(8, -3, -16, 15, 31, -15),
		Block.createCuboidShape(15, -16, -16, 16, 32, 32),
		Block.createCuboidShape(6, 20, 18, 12, 22, 22),
		Block.createCuboidShape(9, 25, -14, 13, 30, -12),
		Block.createCuboidShape(6, 18, -2, 14, 23, 2),
		Block.createCuboidShape(4, -10, -9, 5, -8, -4),
		Block.createCuboidShape(8, 3, -15, 14, 4, 31),
		Block.createCuboidShape(8, 10, -15, 14, 11, 31),
		Block.createCuboidShape(8, 17, -15, 14, 18, 31),
		Block.createCuboidShape(8, 24, -15, 14, 25, 31),
		Block.createCuboidShape(5, 31, -16, 15, 32, 32),
		Block.createCuboidShape(3, 30, -16, 5, 32, 32),
		Block.createCuboidShape(12, 23, -15, 14, 24, 31),
		Block.createCuboidShape(12, 30, -15, 15, 31, 31),
		Block.createCuboidShape(12, 16, -15, 14, 17, 31),
		Block.createCuboidShape(12, 9, -15, 14, 10, 31),
		Block.createCuboidShape(12, 2, -15, 14, 3, 31)
    );

    public Market_cabinet_freezer_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Atable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 25, -15, 5, 26, -3),
		Block.createCuboidShape(-15, 12, 10, 25, 16, 11),
		Block.createCuboidShape(-1, 12, 26, 11, 21, 27),
		Block.createCuboidShape(-16, 0, -16, 26, 24, -15),
		Block.createCuboidShape(-16, 0, -15, -15, 24, -3),
		Block.createCuboidShape(25, 0, -15, 26, 24, -3),
		Block.createCuboidShape(-16, 24, -16, 26, 25, -2),
		Block.createCuboidShape(-15, 16, -15, 25, 17, 12),
		Block.createCuboidShape(-15, 11, -15, 25, 12, 12),
		Block.createCuboidShape(-16, 0, -3, -15, 17, 12),
		Block.createCuboidShape(25, 0, -3, 26, 17, 12),
		Block.createCuboidShape(-2, 12, -15, -1, 16, 12),
		Block.createCuboidShape(11, 12, -15, 12, 16, 12),
		Block.createCuboidShape(-12, 17, -7, -1, 19, 1),
		Block.createCuboidShape(13, 17, -3, 21, 18, 8),
		Block.createCuboidShape(10, 25, -10, 14, 26, -5),
		Block.createCuboidShape(2, 17, -3, 6, 18, 2),
		Block.createCuboidShape(9, 0, 24, 10, 8, 25),
		Block.createCuboidShape(0, 0, 24, 1, 8, 25),
		Block.createCuboidShape(0, 0, 15, 1, 8, 16),
		Block.createCuboidShape(9, 0, 15, 10, 8, 16),
		Block.createCuboidShape(-1, 8, 14, 11, 10, 25),
		Block.createCuboidShape(15, 25, -16, 25, 27, -3)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(19, 25, -14, 31, 26, 5),
		Block.createCuboidShape(5, 12, -15, 6, 16, 25),
		Block.createCuboidShape(-11, 12, -1, -10, 21, 11),
		Block.createCuboidShape(31, 0, -16, 32, 24, 26),
		Block.createCuboidShape(19, 0, -16, 31, 24, -15),
		Block.createCuboidShape(19, 0, 25, 31, 24, 26),
		Block.createCuboidShape(18, 24, -16, 32, 25, 26),
		Block.createCuboidShape(4, 16, -15, 31, 17, 25),
		Block.createCuboidShape(4, 11, -15, 31, 12, 25),
		Block.createCuboidShape(4, 0, -16, 19, 17, -15),
		Block.createCuboidShape(4, 0, 25, 19, 17, 26),
		Block.createCuboidShape(4, 12, -2, 31, 16, -1),
		Block.createCuboidShape(4, 12, 11, 31, 16, 12),
		Block.createCuboidShape(15, 17, -12, 23, 19, -1),
		Block.createCuboidShape(8, 17, 13, 19, 18, 21),
		Block.createCuboidShape(21, 25, 10, 26, 26, 14),
		Block.createCuboidShape(14, 17, 2, 19, 18, 6),
		Block.createCuboidShape(-9, 0, 9, -8, 8, 10),
		Block.createCuboidShape(-9, 0, 0, -8, 8, 1),
		Block.createCuboidShape(0, 0, 0, 1, 8, 1),
		Block.createCuboidShape(0, 0, 9, 1, 8, 10),
		Block.createCuboidShape(-9, 8, -1, 2, 10, 11),
		Block.createCuboidShape(19, 25, 15, 32, 27, 25)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(11, 25, 19, 30, 26, 31),
		Block.createCuboidShape(-9, 12, 5, 31, 16, 6),
		Block.createCuboidShape(5, 12, -11, 17, 21, -10),
		Block.createCuboidShape(-10, 0, 31, 32, 24, 32),
		Block.createCuboidShape(31, 0, 19, 32, 24, 31),
		Block.createCuboidShape(-10, 0, 19, -9, 24, 31),
		Block.createCuboidShape(-10, 24, 18, 32, 25, 32),
		Block.createCuboidShape(-9, 16, 4, 31, 17, 31),
		Block.createCuboidShape(-9, 11, 4, 31, 12, 31),
		Block.createCuboidShape(31, 0, 4, 32, 17, 19),
		Block.createCuboidShape(-10, 0, 4, -9, 17, 19),
		Block.createCuboidShape(17, 12, 4, 18, 16, 31),
		Block.createCuboidShape(4, 12, 4, 5, 16, 31),
		Block.createCuboidShape(17, 17, 15, 28, 19, 23),
		Block.createCuboidShape(-5, 17, 8, 3, 18, 19),
		Block.createCuboidShape(2, 25, 21, 6, 26, 26),
		Block.createCuboidShape(10, 17, 14, 14, 18, 19),
		Block.createCuboidShape(6, 0, -9, 7, 8, -8),
		Block.createCuboidShape(15, 0, -9, 16, 8, -8),
		Block.createCuboidShape(15, 0, 0, 16, 8, 1),
		Block.createCuboidShape(6, 0, 0, 7, 8, 1),
		Block.createCuboidShape(5, 8, -9, 17, 10, 2),
		Block.createCuboidShape(-9, 25, 19, 1, 27, 32)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-15, 25, 11, -3, 26, 30),
		Block.createCuboidShape(10, 12, -9, 11, 16, 31),
		Block.createCuboidShape(26, 12, 5, 27, 21, 17),
		Block.createCuboidShape(-16, 0, -10, -15, 24, 32),
		Block.createCuboidShape(-15, 0, 31, -3, 24, 32),
		Block.createCuboidShape(-15, 0, -10, -3, 24, -9),
		Block.createCuboidShape(-16, 24, -10, -2, 25, 32),
		Block.createCuboidShape(-15, 16, -9, 12, 17, 31),
		Block.createCuboidShape(-15, 11, -9, 12, 12, 31),
		Block.createCuboidShape(-3, 0, 31, 12, 17, 32),
		Block.createCuboidShape(-3, 0, -10, 12, 17, -9),
		Block.createCuboidShape(-15, 12, 17, 12, 16, 18),
		Block.createCuboidShape(-15, 12, 4, 12, 16, 5),
		Block.createCuboidShape(-7, 17, 17, 1, 19, 28),
		Block.createCuboidShape(-3, 17, -5, 8, 18, 3),
		Block.createCuboidShape(-10, 25, 2, -5, 26, 6),
		Block.createCuboidShape(-3, 17, 10, 2, 18, 14),
		Block.createCuboidShape(24, 0, 6, 25, 8, 7),
		Block.createCuboidShape(24, 0, 15, 25, 8, 16),
		Block.createCuboidShape(15, 0, 15, 16, 8, 16),
		Block.createCuboidShape(15, 0, 6, 16, 8, 7),
		Block.createCuboidShape(14, 8, 5, 25, 10, 17),
		Block.createCuboidShape(-16, 25, -9, -3, 27, 1)
    );

    public Atable_Data() {
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

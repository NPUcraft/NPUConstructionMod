package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Toilet_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(27, -13, -6, 28, -10, 22),
		Block.createCuboidShape(4, -13, -6, 5, -10, 22),
		Block.createCuboidShape(22, -13, -11, 28, -10, -9),
		Block.createCuboidShape(4, -13, -11, 10, -10, -9),
		Block.createCuboidShape(22, -13, 1, 28, -10, 3),
		Block.createCuboidShape(4, -13, 1, 10, -10, 3),
		Block.createCuboidShape(22, -13, 13, 28, -10, 15),
		Block.createCuboidShape(4, -13, 13, 10, -10, 15),
		Block.createCuboidShape(22, -13, 25, 28, -10, 27),
		Block.createCuboidShape(4, -13, 25, 10, -10, 27),
		Block.createCuboidShape(0, -13, -16, 4, -10, 32),
		Block.createCuboidShape(4, -13, 3, 28, -10, 13),
		Block.createCuboidShape(28, -13, -16, 32, -10, 32),
		Block.createCuboidShape(4, -13, -16, 28, -10, -11),
		Block.createCuboidShape(0, -16, -16, 32, -13, 32),
		Block.createCuboidShape(4, -13, 27, 28, -10, 32),
		Block.createCuboidShape(29, -7, -14, 30, 30, 8),
		Block.createCuboidShape(0, -10, -16, 1, 30, 32),
		Block.createCuboidShape(29, -7, 10, 30, 30, 32),
		Block.createCuboidShape(29, -7, 8, 32, 32, 10),
		Block.createCuboidShape(1, -7, 9, 29, 30, 10),
		Block.createCuboidShape(1, -7, -15, 29, 30, -14),
		Block.createCuboidShape(29, -7, -16, 32, 32, -14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-6, -13, 27, 22, -10, 28),
		Block.createCuboidShape(-6, -13, 4, 22, -10, 5),
		Block.createCuboidShape(25, -13, 22, 27, -10, 28),
		Block.createCuboidShape(25, -13, 4, 27, -10, 10),
		Block.createCuboidShape(13, -13, 22, 15, -10, 28),
		Block.createCuboidShape(13, -13, 4, 15, -10, 10),
		Block.createCuboidShape(1, -13, 22, 3, -10, 28),
		Block.createCuboidShape(1, -13, 4, 3, -10, 10),
		Block.createCuboidShape(-11, -13, 22, -9, -10, 28),
		Block.createCuboidShape(-11, -13, 4, -9, -10, 10),
		Block.createCuboidShape(-16, -13, 0, 32, -10, 4),
		Block.createCuboidShape(3, -13, 4, 13, -10, 28),
		Block.createCuboidShape(-16, -13, 28, 32, -10, 32),
		Block.createCuboidShape(27, -13, 4, 32, -10, 28),
		Block.createCuboidShape(-16, -16, 0, 32, -13, 32),
		Block.createCuboidShape(-16, -13, 4, -11, -10, 28),
		Block.createCuboidShape(8, -7, 29, 30, 30, 30),
		Block.createCuboidShape(-16, -10, 0, 32, 30, 1),
		Block.createCuboidShape(-16, -7, 29, 6, 30, 30),
		Block.createCuboidShape(6, -7, 29, 8, 32, 32),
		Block.createCuboidShape(6, -7, 1, 7, 30, 29),
		Block.createCuboidShape(30, -7, 1, 31, 30, 29),
		Block.createCuboidShape(30, -7, 29, 32, 32, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-12, -13, -6, -11, -10, 22),
		Block.createCuboidShape(11, -13, -6, 12, -10, 22),
		Block.createCuboidShape(-12, -13, 25, -6, -10, 27),
		Block.createCuboidShape(6, -13, 25, 12, -10, 27),
		Block.createCuboidShape(-12, -13, 13, -6, -10, 15),
		Block.createCuboidShape(6, -13, 13, 12, -10, 15),
		Block.createCuboidShape(-12, -13, 1, -6, -10, 3),
		Block.createCuboidShape(6, -13, 1, 12, -10, 3),
		Block.createCuboidShape(-12, -13, -11, -6, -10, -9),
		Block.createCuboidShape(6, -13, -11, 12, -10, -9),
		Block.createCuboidShape(12, -13, -16, 16, -10, 32),
		Block.createCuboidShape(-12, -13, 3, 12, -10, 13),
		Block.createCuboidShape(-16, -13, -16, -12, -10, 32),
		Block.createCuboidShape(-12, -13, 27, 12, -10, 32),
		Block.createCuboidShape(-16, -16, -16, 16, -13, 32),
		Block.createCuboidShape(-12, -13, -16, 12, -10, -11),
		Block.createCuboidShape(-14, -7, 8, -13, 30, 30),
		Block.createCuboidShape(15, -10, -16, 16, 30, 32),
		Block.createCuboidShape(-14, -7, -16, -13, 30, 6),
		Block.createCuboidShape(-16, -7, 6, -13, 32, 8),
		Block.createCuboidShape(-13, -7, 6, 15, 30, 7),
		Block.createCuboidShape(-13, -7, 30, 15, 30, 31),
		Block.createCuboidShape(-16, -7, 30, -13, 32, 32)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-6, -13, -12, 22, -10, -11),
		Block.createCuboidShape(-6, -13, 11, 22, -10, 12),
		Block.createCuboidShape(-11, -13, -12, -9, -10, -6),
		Block.createCuboidShape(-11, -13, 6, -9, -10, 12),
		Block.createCuboidShape(1, -13, -12, 3, -10, -6),
		Block.createCuboidShape(1, -13, 6, 3, -10, 12),
		Block.createCuboidShape(13, -13, -12, 15, -10, -6),
		Block.createCuboidShape(13, -13, 6, 15, -10, 12),
		Block.createCuboidShape(25, -13, -12, 27, -10, -6),
		Block.createCuboidShape(25, -13, 6, 27, -10, 12),
		Block.createCuboidShape(-16, -13, 12, 32, -10, 16),
		Block.createCuboidShape(3, -13, -12, 13, -10, 12),
		Block.createCuboidShape(-16, -13, -16, 32, -10, -12),
		Block.createCuboidShape(-16, -13, -12, -11, -10, 12),
		Block.createCuboidShape(-16, -16, -16, 32, -13, 16),
		Block.createCuboidShape(27, -13, -12, 32, -10, 12),
		Block.createCuboidShape(-14, -7, -14, 8, 30, -13),
		Block.createCuboidShape(-16, -10, 15, 32, 30, 16),
		Block.createCuboidShape(10, -7, -14, 32, 30, -13),
		Block.createCuboidShape(8, -7, -16, 10, 32, -13),
		Block.createCuboidShape(9, -7, -13, 10, 30, 15),
		Block.createCuboidShape(-15, -7, -13, -14, 30, 15),
		Block.createCuboidShape(-16, -7, -16, -14, 32, -13)
    );

    public Toilet_Data() {
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

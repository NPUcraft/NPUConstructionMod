package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Windowout_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(27, -16, 8, 32, -13, 16),
		Block.createCuboidShape(27, 29, 8, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 8, -11, -13, 16),
		Block.createCuboidShape(-16, 29, 8, -11, 32, 16),
		Block.createCuboidShape(-16, -16, 16, -11, 32, 17),
		Block.createCuboidShape(-14, -14, 15, -11, 30, 16),
		Block.createCuboidShape(-14, -14, 7, -11, 30, 8),
		Block.createCuboidShape(27, -14, 15, 30, 30, 16),
		Block.createCuboidShape(27, 15, 8, 30, 16, 15),
		Block.createCuboidShape(-14, 15, 8, -11, 16, 15),
		Block.createCuboidShape(27, -14, 7, 30, 30, 8),
		Block.createCuboidShape(28, -14, 3, 29, 30, 7),
		Block.createCuboidShape(7, 16, 3, 9, 29, 7),
		Block.createCuboidShape(7, -13, 3, 8, 15, 5),
		Block.createCuboidShape(27, -13, 5, 28, 15, 7),
		Block.createCuboidShape(-12, -13, 3, -11, 15, 5),
		Block.createCuboidShape(8, -13, 5, 9, 15, 7),
		Block.createCuboidShape(-11, -13, 3, 7, -12, 5),
		Block.createCuboidShape(9, -13, 5, 27, -12, 7),
		Block.createCuboidShape(-11, 14, 3, 7, 15, 5),
		Block.createCuboidShape(9, 14, 5, 27, 15, 7),
		Block.createCuboidShape(-12, -14, 3, 28, -13, 7),
		Block.createCuboidShape(-12, 29, 3, 28, 30, 7),
		Block.createCuboidShape(-12, 15, 3, 28, 16, 7),
		Block.createCuboidShape(-13, -14, 3, -12, 30, 7),
		Block.createCuboidShape(27, -16, 16, 32, 32, 17),
		Block.createCuboidShape(-14, -15, 2, 30, -14, 8),
		Block.createCuboidShape(-14, 30, 2, 30, 31, 8),
		Block.createCuboidShape(-16, -16, 0, 32, -15, 8),
		Block.createCuboidShape(-16, 31, 0, 32, 32, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 27, 8, -13, 32),
		Block.createCuboidShape(0, 29, 27, 8, 32, 32),
		Block.createCuboidShape(0, -16, -16, 8, -13, -11),
		Block.createCuboidShape(0, 29, -16, 8, 32, -11),
		Block.createCuboidShape(-1, -16, -16, 0, 32, -11),
		Block.createCuboidShape(0, -14, -14, 1, 30, -11),
		Block.createCuboidShape(8, -14, -14, 9, 30, -11),
		Block.createCuboidShape(0, -14, 27, 1, 30, 30),
		Block.createCuboidShape(1, 15, 27, 8, 16, 30),
		Block.createCuboidShape(1, 15, -14, 8, 16, -11),
		Block.createCuboidShape(8, -14, 27, 9, 30, 30),
		Block.createCuboidShape(9, -14, 28, 13, 30, 29),
		Block.createCuboidShape(9, 16, 7, 13, 29, 9),
		Block.createCuboidShape(11, -13, 7, 13, 15, 8),
		Block.createCuboidShape(9, -13, 27, 11, 15, 28),
		Block.createCuboidShape(11, -13, -12, 13, 15, -11),
		Block.createCuboidShape(9, -13, 8, 11, 15, 9),
		Block.createCuboidShape(11, -13, -11, 13, -12, 7),
		Block.createCuboidShape(9, -13, 9, 11, -12, 27),
		Block.createCuboidShape(11, 14, -11, 13, 15, 7),
		Block.createCuboidShape(9, 14, 9, 11, 15, 27),
		Block.createCuboidShape(9, -14, -12, 13, -13, 28),
		Block.createCuboidShape(9, 29, -12, 13, 30, 28),
		Block.createCuboidShape(9, 15, -12, 13, 16, 28),
		Block.createCuboidShape(9, -14, -13, 13, 30, -12),
		Block.createCuboidShape(-1, -16, 27, 0, 32, 32),
		Block.createCuboidShape(8, -15, -14, 14, -14, 30),
		Block.createCuboidShape(8, 30, -14, 14, 31, 30),
		Block.createCuboidShape(8, -16, -16, 16, -15, 32),
		Block.createCuboidShape(8, 31, -16, 16, 32, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -16, 0, -11, -13, 8),
		Block.createCuboidShape(-16, 29, 0, -11, 32, 8),
		Block.createCuboidShape(27, -16, 0, 32, -13, 8),
		Block.createCuboidShape(27, 29, 0, 32, 32, 8),
		Block.createCuboidShape(27, -16, -1, 32, 32, 0),
		Block.createCuboidShape(27, -14, 0, 30, 30, 1),
		Block.createCuboidShape(27, -14, 8, 30, 30, 9),
		Block.createCuboidShape(-14, -14, 0, -11, 30, 1),
		Block.createCuboidShape(-14, 15, 1, -11, 16, 8),
		Block.createCuboidShape(27, 15, 1, 30, 16, 8),
		Block.createCuboidShape(-14, -14, 8, -11, 30, 9),
		Block.createCuboidShape(-13, -14, 9, -12, 30, 13),
		Block.createCuboidShape(7, 16, 9, 9, 29, 13),
		Block.createCuboidShape(8, -13, 11, 9, 15, 13),
		Block.createCuboidShape(-12, -13, 9, -11, 15, 11),
		Block.createCuboidShape(27, -13, 11, 28, 15, 13),
		Block.createCuboidShape(7, -13, 9, 8, 15, 11),
		Block.createCuboidShape(9, -13, 11, 27, -12, 13),
		Block.createCuboidShape(-11, -13, 9, 7, -12, 11),
		Block.createCuboidShape(9, 14, 11, 27, 15, 13),
		Block.createCuboidShape(-11, 14, 9, 7, 15, 11),
		Block.createCuboidShape(-12, -14, 9, 28, -13, 13),
		Block.createCuboidShape(-12, 29, 9, 28, 30, 13),
		Block.createCuboidShape(-12, 15, 9, 28, 16, 13),
		Block.createCuboidShape(28, -14, 9, 29, 30, 13),
		Block.createCuboidShape(-16, -16, -1, -11, 32, 0),
		Block.createCuboidShape(-14, -15, 8, 30, -14, 14),
		Block.createCuboidShape(-14, 30, 8, 30, 31, 14),
		Block.createCuboidShape(-16, -16, 8, 32, -15, 16),
		Block.createCuboidShape(-16, 31, 8, 32, 32, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, -16, -16, 16, -13, -11),
		Block.createCuboidShape(8, 29, -16, 16, 32, -11),
		Block.createCuboidShape(8, -16, 27, 16, -13, 32),
		Block.createCuboidShape(8, 29, 27, 16, 32, 32),
		Block.createCuboidShape(16, -16, 27, 17, 32, 32),
		Block.createCuboidShape(15, -14, 27, 16, 30, 30),
		Block.createCuboidShape(7, -14, 27, 8, 30, 30),
		Block.createCuboidShape(15, -14, -14, 16, 30, -11),
		Block.createCuboidShape(8, 15, -14, 15, 16, -11),
		Block.createCuboidShape(8, 15, 27, 15, 16, 30),
		Block.createCuboidShape(7, -14, -14, 8, 30, -11),
		Block.createCuboidShape(3, -14, -13, 7, 30, -12),
		Block.createCuboidShape(3, 16, 7, 7, 29, 9),
		Block.createCuboidShape(3, -13, 8, 5, 15, 9),
		Block.createCuboidShape(5, -13, -12, 7, 15, -11),
		Block.createCuboidShape(3, -13, 27, 5, 15, 28),
		Block.createCuboidShape(5, -13, 7, 7, 15, 8),
		Block.createCuboidShape(3, -13, 9, 5, -12, 27),
		Block.createCuboidShape(5, -13, -11, 7, -12, 7),
		Block.createCuboidShape(3, 14, 9, 5, 15, 27),
		Block.createCuboidShape(5, 14, -11, 7, 15, 7),
		Block.createCuboidShape(3, -14, -12, 7, -13, 28),
		Block.createCuboidShape(3, 29, -12, 7, 30, 28),
		Block.createCuboidShape(3, 15, -12, 7, 16, 28),
		Block.createCuboidShape(3, -14, 28, 7, 30, 29),
		Block.createCuboidShape(16, -16, -16, 17, 32, -11),
		Block.createCuboidShape(2, -15, -14, 8, -14, 30),
		Block.createCuboidShape(2, 30, -14, 8, 31, 30),
		Block.createCuboidShape(0, -16, -16, 8, -15, 32),
		Block.createCuboidShape(0, 31, -16, 8, 32, 32)
    );

    public Windowout_Data() {
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

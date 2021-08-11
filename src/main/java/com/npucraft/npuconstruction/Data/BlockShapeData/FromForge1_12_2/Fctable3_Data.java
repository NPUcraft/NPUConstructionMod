package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fctable3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 12, -2, -11, 25, 4),
		Block.createCuboidShape(27, 12, -2, 28, 25, 4),
		Block.createCuboidShape(-12, 7, -16, 0, 9, -4),
		Block.createCuboidShape(16, 7, -16, 28, 9, -4),
		Block.createCuboidShape(-12, 7, 4, 0, 9, 17),
		Block.createCuboidShape(16, 7, 4, 28, 9, 17),
		Block.createCuboidShape(-12, 21, -12, -11, 22, 13),
		Block.createCuboidShape(27, 21, -12, 28, 22, 13),
		Block.createCuboidShape(-1, 18, -16, 17, 19, 17),
		Block.createCuboidShape(2, 17, 14, 14, 18, 15),
		Block.createCuboidShape(2, 17, -14, 14, 18, -13),
		Block.createCuboidShape(20, 4, -10, 22, 5, 11),
		Block.createCuboidShape(-6, 4, -10, -4, 5, 11),
		Block.createCuboidShape(26, 9, -1, 27, 26, 1),
		Block.createCuboidShape(-11, 9, -1, -10, 26, 1),
		Block.createCuboidShape(2, 17, -13, 3, 18, 14),
		Block.createCuboidShape(7, 16, -13, 9, 18, 14),
		Block.createCuboidShape(13, 17, -13, 14, 18, 14),
		Block.createCuboidShape(-6, 0, -11, -4, 7, -10),
		Block.createCuboidShape(20, 0, -11, 22, 7, -10),
		Block.createCuboidShape(-11, 7, -5, -10, 17, -4),
		Block.createCuboidShape(26, 7, -5, 27, 17, -4),
		Block.createCuboidShape(-12, 9, -11, -11, 21, -9),
		Block.createCuboidShape(27, 9, -11, 28, 21, -9),
		Block.createCuboidShape(-11, 7, -16, -10, 17, -15),
		Block.createCuboidShape(26, 7, -16, 27, 17, -15),
		Block.createCuboidShape(-12, 15, -15, -11, 16, -10),
		Block.createCuboidShape(27, 15, -15, 28, 16, -10),
		Block.createCuboidShape(-6, 0, 10, -4, 7, 11),
		Block.createCuboidShape(20, 0, 10, 22, 7, 11),
		Block.createCuboidShape(-11, 7, 16, -10, 17, 17),
		Block.createCuboidShape(26, 7, 16, 27, 17, 17),
		Block.createCuboidShape(-12, 9, 10, -11, 21, 12),
		Block.createCuboidShape(27, 9, 10, 28, 21, 12),
		Block.createCuboidShape(-11, 7, 4, -10, 17, 5),
		Block.createCuboidShape(26, 7, 4, 27, 17, 5),
		Block.createCuboidShape(-12, 17, 18, -11, 18, 23),
		Block.createCuboidShape(27, 17, 18, 28, 18, 23)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(12, 12, -12, 18, 25, -11),
		Block.createCuboidShape(12, 12, 27, 18, 25, 28),
		Block.createCuboidShape(20, 7, -12, 32, 9, 0),
		Block.createCuboidShape(20, 7, 16, 32, 9, 28),
		Block.createCuboidShape(-1, 7, -12, 12, 9, 0),
		Block.createCuboidShape(-1, 7, 16, 12, 9, 28),
		Block.createCuboidShape(3, 21, -12, 28, 22, -11),
		Block.createCuboidShape(3, 21, 27, 28, 22, 28),
		Block.createCuboidShape(-1, 18, -1, 32, 19, 17),
		Block.createCuboidShape(1, 17, 2, 2, 18, 14),
		Block.createCuboidShape(29, 17, 2, 30, 18, 14),
		Block.createCuboidShape(5, 4, 20, 26, 5, 22),
		Block.createCuboidShape(5, 4, -6, 26, 5, -4),
		Block.createCuboidShape(15, 9, 26, 17, 26, 27),
		Block.createCuboidShape(15, 9, -11, 17, 26, -10),
		Block.createCuboidShape(2, 17, 2, 29, 18, 3),
		Block.createCuboidShape(2, 16, 7, 29, 18, 9),
		Block.createCuboidShape(2, 17, 13, 29, 18, 14),
		Block.createCuboidShape(26, 0, -6, 27, 7, -4),
		Block.createCuboidShape(26, 0, 20, 27, 7, 22),
		Block.createCuboidShape(20, 7, -11, 21, 17, -10),
		Block.createCuboidShape(20, 7, 26, 21, 17, 27),
		Block.createCuboidShape(25, 9, -12, 27, 21, -11),
		Block.createCuboidShape(25, 9, 27, 27, 21, 28),
		Block.createCuboidShape(31, 7, -11, 32, 17, -10),
		Block.createCuboidShape(31, 7, 26, 32, 17, 27),
		Block.createCuboidShape(26, 15, -12, 31, 16, -11),
		Block.createCuboidShape(26, 15, 27, 31, 16, 28),
		Block.createCuboidShape(5, 0, -6, 6, 7, -4),
		Block.createCuboidShape(5, 0, 20, 6, 7, 22),
		Block.createCuboidShape(-1, 7, -11, 0, 17, -10),
		Block.createCuboidShape(-1, 7, 26, 0, 17, 27),
		Block.createCuboidShape(4, 9, -12, 6, 21, -11),
		Block.createCuboidShape(4, 9, 27, 6, 21, 28),
		Block.createCuboidShape(11, 7, -11, 12, 17, -10),
		Block.createCuboidShape(11, 7, 26, 12, 17, 27),
		Block.createCuboidShape(-7, 17, -12, -2, 18, -11),
		Block.createCuboidShape(-7, 17, 27, -2, 18, 28)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(27, 12, 12, 28, 25, 18),
		Block.createCuboidShape(-12, 12, 12, -11, 25, 18),
		Block.createCuboidShape(16, 7, 20, 28, 9, 32),
		Block.createCuboidShape(-12, 7, 20, 0, 9, 32),
		Block.createCuboidShape(16, 7, -1, 28, 9, 12),
		Block.createCuboidShape(-12, 7, -1, 0, 9, 12),
		Block.createCuboidShape(27, 21, 3, 28, 22, 28),
		Block.createCuboidShape(-12, 21, 3, -11, 22, 28),
		Block.createCuboidShape(-1, 18, -1, 17, 19, 32),
		Block.createCuboidShape(2, 17, 1, 14, 18, 2),
		Block.createCuboidShape(2, 17, 29, 14, 18, 30),
		Block.createCuboidShape(-6, 4, 5, -4, 5, 26),
		Block.createCuboidShape(20, 4, 5, 22, 5, 26),
		Block.createCuboidShape(-11, 9, 15, -10, 26, 17),
		Block.createCuboidShape(26, 9, 15, 27, 26, 17),
		Block.createCuboidShape(13, 17, 2, 14, 18, 29),
		Block.createCuboidShape(7, 16, 2, 9, 18, 29),
		Block.createCuboidShape(2, 17, 2, 3, 18, 29),
		Block.createCuboidShape(20, 0, 26, 22, 7, 27),
		Block.createCuboidShape(-6, 0, 26, -4, 7, 27),
		Block.createCuboidShape(26, 7, 20, 27, 17, 21),
		Block.createCuboidShape(-11, 7, 20, -10, 17, 21),
		Block.createCuboidShape(27, 9, 25, 28, 21, 27),
		Block.createCuboidShape(-12, 9, 25, -11, 21, 27),
		Block.createCuboidShape(26, 7, 31, 27, 17, 32),
		Block.createCuboidShape(-11, 7, 31, -10, 17, 32),
		Block.createCuboidShape(27, 15, 26, 28, 16, 31),
		Block.createCuboidShape(-12, 15, 26, -11, 16, 31),
		Block.createCuboidShape(20, 0, 5, 22, 7, 6),
		Block.createCuboidShape(-6, 0, 5, -4, 7, 6),
		Block.createCuboidShape(26, 7, -1, 27, 17, 0),
		Block.createCuboidShape(-11, 7, -1, -10, 17, 0),
		Block.createCuboidShape(27, 9, 4, 28, 21, 6),
		Block.createCuboidShape(-12, 9, 4, -11, 21, 6),
		Block.createCuboidShape(26, 7, 11, 27, 17, 12),
		Block.createCuboidShape(-11, 7, 11, -10, 17, 12),
		Block.createCuboidShape(27, 17, -7, 28, 18, -2),
		Block.createCuboidShape(-12, 17, -7, -11, 18, -2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-2, 12, 27, 4, 25, 28),
		Block.createCuboidShape(-2, 12, -12, 4, 25, -11),
		Block.createCuboidShape(-16, 7, 16, -4, 9, 28),
		Block.createCuboidShape(-16, 7, -12, -4, 9, 0),
		Block.createCuboidShape(4, 7, 16, 17, 9, 28),
		Block.createCuboidShape(4, 7, -12, 17, 9, 0),
		Block.createCuboidShape(-12, 21, 27, 13, 22, 28),
		Block.createCuboidShape(-12, 21, -12, 13, 22, -11),
		Block.createCuboidShape(-16, 18, -1, 17, 19, 17),
		Block.createCuboidShape(14, 17, 2, 15, 18, 14),
		Block.createCuboidShape(-14, 17, 2, -13, 18, 14),
		Block.createCuboidShape(-10, 4, -6, 11, 5, -4),
		Block.createCuboidShape(-10, 4, 20, 11, 5, 22),
		Block.createCuboidShape(-1, 9, -11, 1, 26, -10),
		Block.createCuboidShape(-1, 9, 26, 1, 26, 27),
		Block.createCuboidShape(-13, 17, 13, 14, 18, 14),
		Block.createCuboidShape(-13, 16, 7, 14, 18, 9),
		Block.createCuboidShape(-13, 17, 2, 14, 18, 3),
		Block.createCuboidShape(-11, 0, 20, -10, 7, 22),
		Block.createCuboidShape(-11, 0, -6, -10, 7, -4),
		Block.createCuboidShape(-5, 7, 26, -4, 17, 27),
		Block.createCuboidShape(-5, 7, -11, -4, 17, -10),
		Block.createCuboidShape(-11, 9, 27, -9, 21, 28),
		Block.createCuboidShape(-11, 9, -12, -9, 21, -11),
		Block.createCuboidShape(-16, 7, 26, -15, 17, 27),
		Block.createCuboidShape(-16, 7, -11, -15, 17, -10),
		Block.createCuboidShape(-15, 15, 27, -10, 16, 28),
		Block.createCuboidShape(-15, 15, -12, -10, 16, -11),
		Block.createCuboidShape(10, 0, 20, 11, 7, 22),
		Block.createCuboidShape(10, 0, -6, 11, 7, -4),
		Block.createCuboidShape(16, 7, 26, 17, 17, 27),
		Block.createCuboidShape(16, 7, -11, 17, 17, -10),
		Block.createCuboidShape(10, 9, 27, 12, 21, 28),
		Block.createCuboidShape(10, 9, -12, 12, 21, -11),
		Block.createCuboidShape(4, 7, 26, 5, 17, 27),
		Block.createCuboidShape(4, 7, -11, 5, 17, -10),
		Block.createCuboidShape(18, 17, 27, 23, 18, 28),
		Block.createCuboidShape(18, 17, -12, 23, 18, -11)
    );

    public Fctable3_Data() {
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

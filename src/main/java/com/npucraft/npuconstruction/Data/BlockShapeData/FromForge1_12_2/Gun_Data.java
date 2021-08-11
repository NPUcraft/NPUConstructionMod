package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Gun_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-6, 6, 8, -5, 13, 27),
		Block.createCuboidShape(21, 6, 8, 22, 13, 27),
		Block.createCuboidShape(-6, -3, 16, -5, 20, 21),
		Block.createCuboidShape(-6, -6, 16, -5, 4, 24),
		Block.createCuboidShape(21, -3, 16, 22, 20, 21),
		Block.createCuboidShape(21, -6, 16, 22, 4, 24),
		Block.createCuboidShape(-6, 17, 15, -5, 24, 30),
		Block.createCuboidShape(21, 17, 15, 22, 24, 30),
		Block.createCuboidShape(2, 3, 6, 11, 4, 13),
		Block.createCuboidShape(6, 11, 17, 10, 15, 32),
		Block.createCuboidShape(5, 8, 8, 11, 13, 9),
		Block.createCuboidShape(-6, 4, 1, -5, 9, 2),
		Block.createCuboidShape(21, 4, 1, 22, 9, 2),
		Block.createCuboidShape(5, 11, 3, 11, 14, 14),
		Block.createCuboidShape(-6, 10, 31, -5, 14, 32),
		Block.createCuboidShape(-6, 14, 3, -5, 15, 13),
		Block.createCuboidShape(21, 10, 31, 22, 14, 32),
		Block.createCuboidShape(21, 14, 3, 22, 15, 13),
		Block.createCuboidShape(-5, 10, 17, 21, 11, 18),
		Block.createCuboidShape(-4, 6, 17, 20, 7, 18),
		Block.createCuboidShape(11, 3, 6, 12, 4, 18),
		Block.createCuboidShape(5, 6, -6, 11, 10, 3),
		Block.createCuboidShape(6, 1, -15, 10, 4, 0),
		Block.createCuboidShape(-1, -1, -15, 17, 1, -13),
		Block.createCuboidShape(6, 12, 8, 10, 16, 24),
		Block.createCuboidShape(10, 14, 16, 11, 15, 26),
		Block.createCuboidShape(-1, 7, 22, 17, 15, 23),
		Block.createCuboidShape(-1, 14, 18, 6, 25, 19),
		Block.createCuboidShape(6, 20, 18, 17, 25, 19),
		Block.createCuboidShape(13, 15, 20, 17, 21, 21),
		Block.createCuboidShape(10, 13, 18, 13, 17, 19)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-11, 6, -6, 8, 13, -5),
		Block.createCuboidShape(-11, 6, 21, 8, 13, 22),
		Block.createCuboidShape(-5, -3, -6, 0, 20, -5),
		Block.createCuboidShape(-8, -6, -6, 0, 4, -5),
		Block.createCuboidShape(-5, -3, 21, 0, 20, 22),
		Block.createCuboidShape(-8, -6, 21, 0, 4, 22),
		Block.createCuboidShape(-14, 17, -6, 1, 24, -5),
		Block.createCuboidShape(-14, 17, 21, 1, 24, 22),
		Block.createCuboidShape(3, 3, 2, 10, 4, 11),
		Block.createCuboidShape(-16, 11, 6, -1, 15, 10),
		Block.createCuboidShape(7, 8, 5, 8, 13, 11),
		Block.createCuboidShape(14, 4, -6, 15, 9, -5),
		Block.createCuboidShape(14, 4, 21, 15, 9, 22),
		Block.createCuboidShape(2, 11, 5, 13, 14, 11),
		Block.createCuboidShape(-16, 10, -6, -15, 14, -5),
		Block.createCuboidShape(3, 14, -6, 13, 15, -5),
		Block.createCuboidShape(-16, 10, 21, -15, 14, 22),
		Block.createCuboidShape(3, 14, 21, 13, 15, 22),
		Block.createCuboidShape(-2, 10, -5, -1, 11, 21),
		Block.createCuboidShape(-2, 6, -4, -1, 7, 20),
		Block.createCuboidShape(-2, 3, 11, 10, 4, 12),
		Block.createCuboidShape(13, 6, 5, 22, 10, 11),
		Block.createCuboidShape(16, 1, 6, 31, 4, 10),
		Block.createCuboidShape(29, -1, -1, 31, 1, 17),
		Block.createCuboidShape(-8, 12, 6, 8, 16, 10),
		Block.createCuboidShape(-10, 14, 10, 0, 15, 11),
		Block.createCuboidShape(-7, 7, -1, -6, 15, 17),
		Block.createCuboidShape(-3, 14, -1, -2, 25, 6),
		Block.createCuboidShape(-3, 20, 6, -2, 25, 17),
		Block.createCuboidShape(-5, 15, 13, -4, 21, 17),
		Block.createCuboidShape(-3, 13, 10, -2, 17, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(21, 6, -11, 22, 13, 8),
		Block.createCuboidShape(-6, 6, -11, -5, 13, 8),
		Block.createCuboidShape(21, -3, -5, 22, 20, 0),
		Block.createCuboidShape(21, -6, -8, 22, 4, 0),
		Block.createCuboidShape(-6, -3, -5, -5, 20, 0),
		Block.createCuboidShape(-6, -6, -8, -5, 4, 0),
		Block.createCuboidShape(21, 17, -14, 22, 24, 1),
		Block.createCuboidShape(-6, 17, -14, -5, 24, 1),
		Block.createCuboidShape(5, 3, 3, 14, 4, 10),
		Block.createCuboidShape(6, 11, -16, 10, 15, -1),
		Block.createCuboidShape(5, 8, 7, 11, 13, 8),
		Block.createCuboidShape(21, 4, 14, 22, 9, 15),
		Block.createCuboidShape(-6, 4, 14, -5, 9, 15),
		Block.createCuboidShape(5, 11, 2, 11, 14, 13),
		Block.createCuboidShape(21, 10, -16, 22, 14, -15),
		Block.createCuboidShape(21, 14, 3, 22, 15, 13),
		Block.createCuboidShape(-6, 10, -16, -5, 14, -15),
		Block.createCuboidShape(-6, 14, 3, -5, 15, 13),
		Block.createCuboidShape(-5, 10, -2, 21, 11, -1),
		Block.createCuboidShape(-4, 6, -2, 20, 7, -1),
		Block.createCuboidShape(4, 3, -2, 5, 4, 10),
		Block.createCuboidShape(5, 6, 13, 11, 10, 22),
		Block.createCuboidShape(6, 1, 16, 10, 4, 31),
		Block.createCuboidShape(-1, -1, 29, 17, 1, 31),
		Block.createCuboidShape(6, 12, -8, 10, 16, 8),
		Block.createCuboidShape(5, 14, -10, 6, 15, 0),
		Block.createCuboidShape(-1, 7, -7, 17, 15, -6),
		Block.createCuboidShape(10, 14, -3, 17, 25, -2),
		Block.createCuboidShape(-1, 20, -3, 10, 25, -2),
		Block.createCuboidShape(-1, 15, -5, 3, 21, -4),
		Block.createCuboidShape(3, 13, -3, 6, 17, -2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 6, 21, 27, 13, 22),
		Block.createCuboidShape(8, 6, -6, 27, 13, -5),
		Block.createCuboidShape(16, -3, 21, 21, 20, 22),
		Block.createCuboidShape(16, -6, 21, 24, 4, 22),
		Block.createCuboidShape(16, -3, -6, 21, 20, -5),
		Block.createCuboidShape(16, -6, -6, 24, 4, -5),
		Block.createCuboidShape(15, 17, 21, 30, 24, 22),
		Block.createCuboidShape(15, 17, -6, 30, 24, -5),
		Block.createCuboidShape(6, 3, 5, 13, 4, 14),
		Block.createCuboidShape(17, 11, 6, 32, 15, 10),
		Block.createCuboidShape(8, 8, 5, 9, 13, 11),
		Block.createCuboidShape(1, 4, 21, 2, 9, 22),
		Block.createCuboidShape(1, 4, -6, 2, 9, -5),
		Block.createCuboidShape(3, 11, 5, 14, 14, 11),
		Block.createCuboidShape(31, 10, 21, 32, 14, 22),
		Block.createCuboidShape(3, 14, 21, 13, 15, 22),
		Block.createCuboidShape(31, 10, -6, 32, 14, -5),
		Block.createCuboidShape(3, 14, -6, 13, 15, -5),
		Block.createCuboidShape(17, 10, -5, 18, 11, 21),
		Block.createCuboidShape(17, 6, -4, 18, 7, 20),
		Block.createCuboidShape(6, 3, 4, 18, 4, 5),
		Block.createCuboidShape(-6, 6, 5, 3, 10, 11),
		Block.createCuboidShape(-15, 1, 6, 0, 4, 10),
		Block.createCuboidShape(-15, -1, -1, -13, 1, 17),
		Block.createCuboidShape(8, 12, 6, 24, 16, 10),
		Block.createCuboidShape(16, 14, 5, 26, 15, 6),
		Block.createCuboidShape(22, 7, -1, 23, 15, 17),
		Block.createCuboidShape(18, 14, 10, 19, 25, 17),
		Block.createCuboidShape(18, 20, -1, 19, 25, 10),
		Block.createCuboidShape(20, 15, -1, 21, 21, 3),
		Block.createCuboidShape(18, 13, 3, 19, 17, 6)
    );

    public Gun_Data() {
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

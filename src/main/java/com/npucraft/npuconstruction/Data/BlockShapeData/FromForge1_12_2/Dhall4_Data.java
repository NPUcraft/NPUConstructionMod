package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 4, 1, 13, 10, 7),
		Block.createCuboidShape(-10, 15, 2, 5, 17, 16),
		Block.createCuboidShape(-10, 4, 6, 0, 9, 13),
		Block.createCuboidShape(-10, 9, 1, 13, 9, 13),
		Block.createCuboidShape(-10, 7, 1, 13, 7, 13),
		Block.createCuboidShape(-10, 6, 1, 13, 6, 13),
		Block.createCuboidShape(-10, 5, 1, 13, 5, 13),
		Block.createCuboidShape(-10, 4, 1, 13, 4, 13),
		Block.createCuboidShape(-12, 14, 15, 16, 18, 16),
		Block.createCuboidShape(-12, 14, 0, 16, 18, 1),
		Block.createCuboidShape(2, 17, 7, 8, 20, 13),
		Block.createCuboidShape(-9, 15, 15, 13, 25, 15),
		Block.createCuboidShape(-8, 15, 1, 14, 25, 1),
		Block.createCuboidShape(-12, 14, 1, -11, 18, 15),
		Block.createCuboidShape(15, 14, 1, 16, 18, 15),
		Block.createCuboidShape(-11, 15, 1, -11, 25, 15),
		Block.createCuboidShape(15, 15, 1, 15, 25, 15),
		Block.createCuboidShape(-12, 3, 0, 16, 4, 16),
		Block.createCuboidShape(-12, 4, 0, -11, 17, 1),
		Block.createCuboidShape(15, 4, 0, 16, 17, 1),
		Block.createCuboidShape(-12, 4, 15, -11, 17, 16),
		Block.createCuboidShape(15, 4, 15, 16, 17, 16),
		Block.createCuboidShape(-11, 4, 15, 15, 7, 16),
		Block.createCuboidShape(-11, 4, 0, 15, 7, 1),
		Block.createCuboidShape(-11, 14, 1, 15, 15, 15),
		Block.createCuboidShape(-12, 4, 1, -11, 7, 15),
		Block.createCuboidShape(15, 4, 1, 16, 7, 15),
		Block.createCuboidShape(10, 15, 2, 14, 17, 6),
		Block.createCuboidShape(-6, 18, 3, -2, 20, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 4, 2, 15, 10, 13),
		Block.createCuboidShape(0, 15, -10, 14, 17, 5),
		Block.createCuboidShape(3, 4, -10, 10, 9, 0),
		Block.createCuboidShape(3, 9, -10, 15, 9, 13),
		Block.createCuboidShape(3, 7, -10, 15, 7, 13),
		Block.createCuboidShape(3, 6, -10, 15, 6, 13),
		Block.createCuboidShape(3, 5, -10, 15, 5, 13),
		Block.createCuboidShape(3, 4, -10, 15, 4, 13),
		Block.createCuboidShape(0, 14, -12, 1, 18, 16),
		Block.createCuboidShape(15, 14, -12, 16, 18, 16),
		Block.createCuboidShape(3, 17, 2, 9, 20, 8),
		Block.createCuboidShape(1, 15, -9, 1, 25, 13),
		Block.createCuboidShape(15, 15, -8, 15, 25, 14),
		Block.createCuboidShape(1, 14, -12, 15, 18, -11),
		Block.createCuboidShape(1, 14, 15, 15, 18, 16),
		Block.createCuboidShape(1, 15, -11, 15, 25, -11),
		Block.createCuboidShape(1, 15, 15, 15, 25, 15),
		Block.createCuboidShape(0, 3, -12, 16, 4, 16),
		Block.createCuboidShape(15, 4, -12, 16, 17, -11),
		Block.createCuboidShape(15, 4, 15, 16, 17, 16),
		Block.createCuboidShape(0, 4, -12, 1, 17, -11),
		Block.createCuboidShape(0, 4, 15, 1, 17, 16),
		Block.createCuboidShape(0, 4, -11, 1, 7, 15),
		Block.createCuboidShape(15, 4, -11, 16, 7, 15),
		Block.createCuboidShape(1, 14, -11, 15, 15, 15),
		Block.createCuboidShape(1, 4, -12, 15, 7, -11),
		Block.createCuboidShape(1, 4, 15, 15, 7, 16),
		Block.createCuboidShape(10, 15, 10, 14, 17, 14),
		Block.createCuboidShape(9, 18, -6, 13, 20, -2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 4, 9, 14, 10, 15),
		Block.createCuboidShape(11, 15, 0, 26, 17, 14),
		Block.createCuboidShape(16, 4, 3, 26, 9, 10),
		Block.createCuboidShape(3, 9, 3, 26, 9, 15),
		Block.createCuboidShape(3, 7, 3, 26, 7, 15),
		Block.createCuboidShape(3, 6, 3, 26, 6, 15),
		Block.createCuboidShape(3, 5, 3, 26, 5, 15),
		Block.createCuboidShape(3, 4, 3, 26, 4, 15),
		Block.createCuboidShape(0, 14, 0, 28, 18, 1),
		Block.createCuboidShape(0, 14, 15, 28, 18, 16),
		Block.createCuboidShape(8, 17, 3, 14, 20, 9),
		Block.createCuboidShape(3, 15, 1, 25, 25, 1),
		Block.createCuboidShape(2, 15, 15, 24, 25, 15),
		Block.createCuboidShape(27, 14, 1, 28, 18, 15),
		Block.createCuboidShape(0, 14, 1, 1, 18, 15),
		Block.createCuboidShape(27, 15, 1, 27, 25, 15),
		Block.createCuboidShape(1, 15, 1, 1, 25, 15),
		Block.createCuboidShape(0, 3, 0, 28, 4, 16),
		Block.createCuboidShape(27, 4, 15, 28, 17, 16),
		Block.createCuboidShape(0, 4, 15, 1, 17, 16),
		Block.createCuboidShape(27, 4, 0, 28, 17, 1),
		Block.createCuboidShape(0, 4, 0, 1, 17, 1),
		Block.createCuboidShape(1, 4, 0, 27, 7, 1),
		Block.createCuboidShape(1, 4, 15, 27, 7, 16),
		Block.createCuboidShape(1, 14, 1, 27, 15, 15),
		Block.createCuboidShape(27, 4, 1, 28, 7, 15),
		Block.createCuboidShape(0, 4, 1, 1, 7, 15),
		Block.createCuboidShape(2, 15, 10, 6, 17, 14),
		Block.createCuboidShape(18, 18, 9, 22, 20, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 4, 3, 7, 10, 14),
		Block.createCuboidShape(2, 15, 11, 16, 17, 26),
		Block.createCuboidShape(6, 4, 16, 13, 9, 26),
		Block.createCuboidShape(1, 9, 3, 13, 9, 26),
		Block.createCuboidShape(1, 7, 3, 13, 7, 26),
		Block.createCuboidShape(1, 6, 3, 13, 6, 26),
		Block.createCuboidShape(1, 5, 3, 13, 5, 26),
		Block.createCuboidShape(1, 4, 3, 13, 4, 26),
		Block.createCuboidShape(15, 14, 0, 16, 18, 28),
		Block.createCuboidShape(0, 14, 0, 1, 18, 28),
		Block.createCuboidShape(7, 17, 8, 13, 20, 14),
		Block.createCuboidShape(15, 15, 3, 15, 25, 25),
		Block.createCuboidShape(1, 15, 2, 1, 25, 24),
		Block.createCuboidShape(1, 14, 27, 15, 18, 28),
		Block.createCuboidShape(1, 14, 0, 15, 18, 1),
		Block.createCuboidShape(1, 15, 27, 15, 25, 27),
		Block.createCuboidShape(1, 15, 1, 15, 25, 1),
		Block.createCuboidShape(0, 3, 0, 16, 4, 28),
		Block.createCuboidShape(0, 4, 27, 1, 17, 28),
		Block.createCuboidShape(0, 4, 0, 1, 17, 1),
		Block.createCuboidShape(15, 4, 27, 16, 17, 28),
		Block.createCuboidShape(15, 4, 0, 16, 17, 1),
		Block.createCuboidShape(15, 4, 1, 16, 7, 27),
		Block.createCuboidShape(0, 4, 1, 1, 7, 27),
		Block.createCuboidShape(1, 14, 1, 15, 15, 27),
		Block.createCuboidShape(1, 4, 27, 15, 7, 28),
		Block.createCuboidShape(1, 4, 0, 15, 7, 1),
		Block.createCuboidShape(2, 15, 2, 6, 17, 6),
		Block.createCuboidShape(3, 18, 18, 7, 20, 22)
    );

    public Dhall4_Data() {
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

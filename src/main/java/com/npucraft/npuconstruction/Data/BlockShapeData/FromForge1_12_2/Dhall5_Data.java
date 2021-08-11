package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 4, 1, -11, 11, 15),
		Block.createCuboidShape(15, 4, 1, 16, 11, 15),
		Block.createCuboidShape(-10, 11, 6, 0, 15, 13),
		Block.createCuboidShape(2, 11, 2, 13, 14, 9),
		Block.createCuboidShape(2, 3, 2, 13, 5, 9),
		Block.createCuboidShape(-12, 3, 0, 16, 4, 16),
		Block.createCuboidShape(-12, 4, 0, -11, 16, 1),
		Block.createCuboidShape(15, 4, 0, 16, 16, 1),
		Block.createCuboidShape(-12, 4, 15, -11, 16, 16),
		Block.createCuboidShape(-12, 16, 15, 16, 18, 16),
		Block.createCuboidShape(-12, 16, 0, 16, 18, 1),
		Block.createCuboidShape(-12, 16, 1, -11, 18, 15),
		Block.createCuboidShape(15, 16, 1, 16, 18, 15),
		Block.createCuboidShape(17, 19, 0, 18, 20, 16),
		Block.createCuboidShape(-14, 19, 0, -13, 20, 16),
		Block.createCuboidShape(15, 4, 15, 16, 16, 16),
		Block.createCuboidShape(-11, 4, 15, 15, 5, 16),
		Block.createCuboidShape(-11, 10, 15, 15, 11, 16),
		Block.createCuboidShape(-11, 4, 0, 15, 5, 1),
		Block.createCuboidShape(-11, 10, 0, 15, 11, 1),
		Block.createCuboidShape(-11, 10, 1, 15, 11, 15),
		Block.createCuboidShape(-11, 16, 1, 15, 17, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 4, -12, 15, 11, -11),
		Block.createCuboidShape(1, 4, 15, 15, 11, 16),
		Block.createCuboidShape(3, 11, -10, 10, 15, 0),
		Block.createCuboidShape(7, 11, 2, 14, 14, 13),
		Block.createCuboidShape(7, 3, 2, 14, 5, 13),
		Block.createCuboidShape(0, 3, -12, 16, 4, 16),
		Block.createCuboidShape(15, 4, -12, 16, 16, -11),
		Block.createCuboidShape(15, 4, 15, 16, 16, 16),
		Block.createCuboidShape(0, 4, -12, 1, 16, -11),
		Block.createCuboidShape(0, 16, -12, 1, 18, 16),
		Block.createCuboidShape(15, 16, -12, 16, 18, 16),
		Block.createCuboidShape(1, 16, -12, 15, 18, -11),
		Block.createCuboidShape(1, 16, 15, 15, 18, 16),
		Block.createCuboidShape(0, 19, 17, 16, 20, 18),
		Block.createCuboidShape(0, 19, -14, 16, 20, -13),
		Block.createCuboidShape(0, 4, 15, 1, 16, 16),
		Block.createCuboidShape(0, 4, -11, 1, 5, 15),
		Block.createCuboidShape(0, 10, -11, 1, 11, 15),
		Block.createCuboidShape(15, 4, -11, 16, 5, 15),
		Block.createCuboidShape(15, 10, -11, 16, 11, 15),
		Block.createCuboidShape(1, 10, -11, 15, 11, 15),
		Block.createCuboidShape(1, 16, -11, 15, 17, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(27, 4, 1, 28, 11, 15),
		Block.createCuboidShape(0, 4, 1, 1, 11, 15),
		Block.createCuboidShape(16, 11, 3, 26, 15, 10),
		Block.createCuboidShape(3, 11, 7, 14, 14, 14),
		Block.createCuboidShape(3, 3, 7, 14, 5, 14),
		Block.createCuboidShape(0, 3, 0, 28, 4, 16),
		Block.createCuboidShape(27, 4, 15, 28, 16, 16),
		Block.createCuboidShape(0, 4, 15, 1, 16, 16),
		Block.createCuboidShape(27, 4, 0, 28, 16, 1),
		Block.createCuboidShape(0, 16, 0, 28, 18, 1),
		Block.createCuboidShape(0, 16, 15, 28, 18, 16),
		Block.createCuboidShape(27, 16, 1, 28, 18, 15),
		Block.createCuboidShape(0, 16, 1, 1, 18, 15),
		Block.createCuboidShape(-2, 19, 0, -1, 20, 16),
		Block.createCuboidShape(29, 19, 0, 30, 20, 16),
		Block.createCuboidShape(0, 4, 0, 1, 16, 1),
		Block.createCuboidShape(1, 4, 0, 27, 5, 1),
		Block.createCuboidShape(1, 10, 0, 27, 11, 1),
		Block.createCuboidShape(1, 4, 15, 27, 5, 16),
		Block.createCuboidShape(1, 10, 15, 27, 11, 16),
		Block.createCuboidShape(1, 10, 1, 27, 11, 15),
		Block.createCuboidShape(1, 16, 1, 27, 17, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 4, 27, 15, 11, 28),
		Block.createCuboidShape(1, 4, 0, 15, 11, 1),
		Block.createCuboidShape(6, 11, 16, 13, 15, 26),
		Block.createCuboidShape(2, 11, 3, 9, 14, 14),
		Block.createCuboidShape(2, 3, 3, 9, 5, 14),
		Block.createCuboidShape(0, 3, 0, 16, 4, 28),
		Block.createCuboidShape(0, 4, 27, 1, 16, 28),
		Block.createCuboidShape(0, 4, 0, 1, 16, 1),
		Block.createCuboidShape(15, 4, 27, 16, 16, 28),
		Block.createCuboidShape(15, 16, 0, 16, 18, 28),
		Block.createCuboidShape(0, 16, 0, 1, 18, 28),
		Block.createCuboidShape(1, 16, 27, 15, 18, 28),
		Block.createCuboidShape(1, 16, 0, 15, 18, 1),
		Block.createCuboidShape(0, 19, -2, 16, 20, -1),
		Block.createCuboidShape(0, 19, 29, 16, 20, 30),
		Block.createCuboidShape(15, 4, 0, 16, 16, 1),
		Block.createCuboidShape(15, 4, 1, 16, 5, 27),
		Block.createCuboidShape(15, 10, 1, 16, 11, 27),
		Block.createCuboidShape(0, 4, 1, 1, 5, 27),
		Block.createCuboidShape(0, 10, 1, 1, 11, 27),
		Block.createCuboidShape(1, 10, 1, 15, 11, 27),
		Block.createCuboidShape(1, 16, 1, 15, 17, 27)
    );

    public Dhall5_Data() {
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

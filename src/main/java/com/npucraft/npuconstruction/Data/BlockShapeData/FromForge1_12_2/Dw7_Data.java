package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dw7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, -1, 5, -10, 5, 11),
		Block.createCuboidShape(-16, -16, -1, -13, 32, 17),
		Block.createCuboidShape(13, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-13, 30, -1, 13, 32, 17),
		Block.createCuboidShape(-14, -16, 7, -9, 32, 9),
		Block.createCuboidShape(-10, 26, 7, -2, 31, 9),
		Block.createCuboidShape(-3, -16, 7, 14, 31, 9),
		Block.createCuboidShape(-9, -16, 7, -3, 8, 9),
		Block.createCuboidShape(-9, 8, 7, -3, 26, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -1, -12, 11, 5, -10),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -13),
		Block.createCuboidShape(-1, -16, 13, 17, 32, 16),
		Block.createCuboidShape(-1, 30, -13, 17, 32, 13),
		Block.createCuboidShape(7, -16, -14, 9, 32, -9),
		Block.createCuboidShape(7, 26, -10, 9, 31, -2),
		Block.createCuboidShape(7, -16, -3, 9, 31, 14),
		Block.createCuboidShape(7, -16, -9, 9, 8, -3),
		Block.createCuboidShape(7, 8, -9, 9, 26, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(26, -1, 5, 28, 5, 11),
		Block.createCuboidShape(29, -16, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 3, 32, 17),
		Block.createCuboidShape(3, 30, -1, 29, 32, 17),
		Block.createCuboidShape(25, -16, 7, 30, 32, 9),
		Block.createCuboidShape(18, 26, 7, 26, 31, 9),
		Block.createCuboidShape(2, -16, 7, 19, 31, 9),
		Block.createCuboidShape(19, -16, 7, 25, 8, 9),
		Block.createCuboidShape(19, 8, 7, 25, 26, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -1, 26, 11, 5, 28),
		Block.createCuboidShape(-1, -16, 29, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 3),
		Block.createCuboidShape(-1, 30, 3, 17, 32, 29),
		Block.createCuboidShape(7, -16, 25, 9, 32, 30),
		Block.createCuboidShape(7, 26, 18, 9, 31, 26),
		Block.createCuboidShape(7, -16, 2, 9, 31, 19),
		Block.createCuboidShape(7, -16, 19, 9, 8, 25),
		Block.createCuboidShape(7, 8, 19, 9, 26, 25)
    );

    public Dw7_Data() {
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

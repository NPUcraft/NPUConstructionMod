package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 8, 7, 13, 30, 9),
		Block.createCuboidShape(-13, 8, 7, -3, 30, 9),
		Block.createCuboidShape(-14, -14, 7, 14, 7, 9),
		Block.createCuboidShape(-1, -15, 7, 1, 30, 9),
		Block.createCuboidShape(-14, 29, 7, 14, 30, 9),
		Block.createCuboidShape(-14, -15, 7, 14, -14, 9),
		Block.createCuboidShape(-14, 7, 7, 14, 8, 9),
		Block.createCuboidShape(15, -16, 5, 16, 32, 11),
		Block.createCuboidShape(-15, -16, 5, 15, -15, 11),
		Block.createCuboidShape(-15, 30, 5, 15, 32, 11),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(14, -15, 7, 15, 30, 9),
		Block.createCuboidShape(-15, -15, 7, -14, 30, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 8, 2, 9, 30, 13),
		Block.createCuboidShape(7, 8, -13, 9, 30, -3),
		Block.createCuboidShape(7, -14, -14, 9, 7, 14),
		Block.createCuboidShape(7, -15, -1, 9, 30, 1),
		Block.createCuboidShape(7, 29, -14, 9, 30, 14),
		Block.createCuboidShape(7, -15, -14, 9, -14, 14),
		Block.createCuboidShape(7, 7, -14, 9, 8, 14),
		Block.createCuboidShape(5, -16, 15, 11, 32, 16),
		Block.createCuboidShape(5, -16, -15, 11, -15, 15),
		Block.createCuboidShape(5, 30, -15, 11, 32, 15),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(7, -15, 14, 9, 30, 15),
		Block.createCuboidShape(7, -15, -15, 9, 30, -14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 8, 7, 14, 30, 9),
		Block.createCuboidShape(19, 8, 7, 29, 30, 9),
		Block.createCuboidShape(2, -14, 7, 30, 7, 9),
		Block.createCuboidShape(15, -15, 7, 17, 30, 9),
		Block.createCuboidShape(2, 29, 7, 30, 30, 9),
		Block.createCuboidShape(2, -15, 7, 30, -14, 9),
		Block.createCuboidShape(2, 7, 7, 30, 8, 9),
		Block.createCuboidShape(0, -16, 5, 1, 32, 11),
		Block.createCuboidShape(1, -16, 5, 31, -15, 11),
		Block.createCuboidShape(1, 30, 5, 31, 32, 11),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(1, -15, 7, 2, 30, 9),
		Block.createCuboidShape(30, -15, 7, 31, 30, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 8, 3, 9, 30, 14),
		Block.createCuboidShape(7, 8, 19, 9, 30, 29),
		Block.createCuboidShape(7, -14, 2, 9, 7, 30),
		Block.createCuboidShape(7, -15, 15, 9, 30, 17),
		Block.createCuboidShape(7, 29, 2, 9, 30, 30),
		Block.createCuboidShape(7, -15, 2, 9, -14, 30),
		Block.createCuboidShape(7, 7, 2, 9, 8, 30),
		Block.createCuboidShape(5, -16, 0, 11, 32, 1),
		Block.createCuboidShape(5, -16, 1, 11, -15, 31),
		Block.createCuboidShape(5, 30, 1, 11, 32, 31),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(7, -15, 1, 9, 30, 2),
		Block.createCuboidShape(7, -15, 30, 9, 30, 31)
    );

    public Door9_Data() {
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

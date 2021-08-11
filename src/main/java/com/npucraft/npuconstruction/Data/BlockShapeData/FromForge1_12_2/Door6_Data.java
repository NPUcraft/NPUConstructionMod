package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -16, 6, -15, 32, 10),
		Block.createCuboidShape(15, -16, 6, 16, 32, 10),
		Block.createCuboidShape(14, -15, 7, 15, 31, 9),
		Block.createCuboidShape(-15, -15, 9, -13, 31, 10),
		Block.createCuboidShape(0, -15, 7, 1, 31, 9),
		Block.createCuboidShape(0, 6, 5, 4, 7, 6),
		Block.createCuboidShape(-15, -15, 23, -13, 31, 24),
		Block.createCuboidShape(-12, 6, 20, -11, 7, 24),
		Block.createCuboidShape(-15, 30, 10, -13, 31, 23),
		Block.createCuboidShape(-15, -15, 10, -13, -14, 23),
		Block.createCuboidShape(1, 30, 7, 14, 31, 9),
		Block.createCuboidShape(1, -15, 7, 14, -14, 9),
		Block.createCuboidShape(-15, -16, 6, 15, -15, 10),
		Block.createCuboidShape(-15, 31, 6, 15, 32, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, -16, 10, 32, -15),
		Block.createCuboidShape(6, -16, 15, 10, 32, 16),
		Block.createCuboidShape(7, -15, 14, 9, 31, 15),
		Block.createCuboidShape(6, -15, -15, 7, 31, -13),
		Block.createCuboidShape(7, -15, 0, 9, 31, 1),
		Block.createCuboidShape(10, 6, 0, 11, 7, 4),
		Block.createCuboidShape(-8, -15, -15, -7, 31, -13),
		Block.createCuboidShape(-8, 6, -12, -4, 7, -11),
		Block.createCuboidShape(-7, 30, -15, 6, 31, -13),
		Block.createCuboidShape(-7, -15, -15, 6, -14, -13),
		Block.createCuboidShape(7, 30, 1, 9, 31, 14),
		Block.createCuboidShape(7, -15, 1, 9, -14, 14),
		Block.createCuboidShape(6, -16, -15, 10, -15, 15),
		Block.createCuboidShape(6, 31, -15, 10, 32, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(31, -16, 6, 32, 32, 10),
		Block.createCuboidShape(0, -16, 6, 1, 32, 10),
		Block.createCuboidShape(1, -15, 7, 2, 31, 9),
		Block.createCuboidShape(29, -15, 6, 31, 31, 7),
		Block.createCuboidShape(15, -15, 7, 16, 31, 9),
		Block.createCuboidShape(12, 6, 10, 16, 7, 11),
		Block.createCuboidShape(29, -15, -8, 31, 31, -7),
		Block.createCuboidShape(27, 6, -8, 28, 7, -4),
		Block.createCuboidShape(29, 30, -7, 31, 31, 6),
		Block.createCuboidShape(29, -15, -7, 31, -14, 6),
		Block.createCuboidShape(2, 30, 7, 15, 31, 9),
		Block.createCuboidShape(2, -15, 7, 15, -14, 9),
		Block.createCuboidShape(1, -16, 6, 31, -15, 10),
		Block.createCuboidShape(1, 31, 6, 31, 32, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 31, 10, 32, 32),
		Block.createCuboidShape(6, -16, 0, 10, 32, 1),
		Block.createCuboidShape(7, -15, 1, 9, 31, 2),
		Block.createCuboidShape(9, -15, 29, 10, 31, 31),
		Block.createCuboidShape(7, -15, 15, 9, 31, 16),
		Block.createCuboidShape(5, 6, 12, 6, 7, 16),
		Block.createCuboidShape(23, -15, 29, 24, 31, 31),
		Block.createCuboidShape(20, 6, 27, 24, 7, 28),
		Block.createCuboidShape(10, 30, 29, 23, 31, 31),
		Block.createCuboidShape(10, -15, 29, 23, -14, 31),
		Block.createCuboidShape(7, 30, 2, 9, 31, 15),
		Block.createCuboidShape(7, -15, 2, 9, -14, 15),
		Block.createCuboidShape(6, -16, 1, 10, -15, 31),
		Block.createCuboidShape(6, 31, 1, 10, 32, 31)
    );

    public Door6_Data() {
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

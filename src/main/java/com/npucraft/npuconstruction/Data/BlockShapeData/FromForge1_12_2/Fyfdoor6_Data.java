package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyfdoor6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, -15, 9, 15, -14, 13),
		Block.createCuboidShape(-4, 23, 9, 15, 24, 13),
		Block.createCuboidShape(-3, -14, 10, 10, 23, 11),
		Block.createCuboidShape(1, -14, 12, 14, 23, 13),
		Block.createCuboidShape(-15, 25, 11, 15, 32, 12),
		Block.createCuboidShape(15, -16, 8, 16, 32, 14),
		Block.createCuboidShape(-16, -16, 8, -15, 32, 14),
		Block.createCuboidShape(-15, 24, 8, 15, 25, 14),
		Block.createCuboidShape(-15, -16, 8, 15, -15, 14),
		Block.createCuboidShape(10, -14, 9, 11, 23, 11),
		Block.createCuboidShape(14, -14, 11, 15, 23, 13),
		Block.createCuboidShape(-4, -14, 9, -3, 23, 11),
		Block.createCuboidShape(0, -14, 11, 1, 23, 13)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, -15, -4, 7, -14, 15),
		Block.createCuboidShape(3, 23, -4, 7, 24, 15),
		Block.createCuboidShape(5, -14, -3, 6, 23, 10),
		Block.createCuboidShape(3, -14, 1, 4, 23, 14),
		Block.createCuboidShape(4, 25, -15, 5, 32, 15),
		Block.createCuboidShape(2, -16, 15, 8, 32, 16),
		Block.createCuboidShape(2, -16, -16, 8, 32, -15),
		Block.createCuboidShape(2, 24, -15, 8, 25, 15),
		Block.createCuboidShape(2, -16, -15, 8, -15, 15),
		Block.createCuboidShape(5, -14, 10, 7, 23, 11),
		Block.createCuboidShape(3, -14, 14, 5, 23, 15),
		Block.createCuboidShape(5, -14, -4, 7, 23, -3),
		Block.createCuboidShape(3, -14, 0, 5, 23, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -15, 3, 20, -14, 7),
		Block.createCuboidShape(1, 23, 3, 20, 24, 7),
		Block.createCuboidShape(6, -14, 5, 19, 23, 6),
		Block.createCuboidShape(2, -14, 3, 15, 23, 4),
		Block.createCuboidShape(1, 25, 4, 31, 32, 5),
		Block.createCuboidShape(0, -16, 2, 1, 32, 8),
		Block.createCuboidShape(31, -16, 2, 32, 32, 8),
		Block.createCuboidShape(1, 24, 2, 31, 25, 8),
		Block.createCuboidShape(1, -16, 2, 31, -15, 8),
		Block.createCuboidShape(5, -14, 5, 6, 23, 7),
		Block.createCuboidShape(1, -14, 3, 2, 23, 5),
		Block.createCuboidShape(19, -14, 5, 20, 23, 7),
		Block.createCuboidShape(15, -14, 3, 16, 23, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, -15, 1, 13, -14, 20),
		Block.createCuboidShape(9, 23, 1, 13, 24, 20),
		Block.createCuboidShape(10, -14, 6, 11, 23, 19),
		Block.createCuboidShape(12, -14, 2, 13, 23, 15),
		Block.createCuboidShape(11, 25, 1, 12, 32, 31),
		Block.createCuboidShape(8, -16, 0, 14, 32, 1),
		Block.createCuboidShape(8, -16, 31, 14, 32, 32),
		Block.createCuboidShape(8, 24, 1, 14, 25, 31),
		Block.createCuboidShape(8, -16, 1, 14, -15, 31),
		Block.createCuboidShape(9, -14, 5, 11, 23, 6),
		Block.createCuboidShape(11, -14, 1, 13, 23, 2),
		Block.createCuboidShape(9, -14, 19, 11, 23, 20),
		Block.createCuboidShape(11, -14, 15, 13, 23, 16)
    );

    public Fyfdoor6_Data() {
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

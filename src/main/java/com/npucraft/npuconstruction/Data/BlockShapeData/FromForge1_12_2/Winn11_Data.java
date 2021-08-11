package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn11_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 4, 6, 1, 10, 10),
		Block.createCuboidShape(-14, 30, 7, 14, 31, 9),
		Block.createCuboidShape(-14, -16, 7, 14, -15, 9),
		Block.createCuboidShape(-15, 5, 7, 15, 8, 7),
		Block.createCuboidShape(-15, 5, 9, 15, 8, 9),
		Block.createCuboidShape(-3, 4, 6, 3, 10, 6),
		Block.createCuboidShape(-3, 4, 10, 3, 10, 10),
		Block.createCuboidShape(2, -15, 7, 14, 30, 9),
		Block.createCuboidShape(-14, -15, 7, -2, 30, 9),
		Block.createCuboidShape(-16, 31, 6, 16, 32, 10),
		Block.createCuboidShape(-2, -16, 7, 2, 31, 9),
		Block.createCuboidShape(14, -16, 7, 15, 31, 9),
		Block.createCuboidShape(-15, -16, 7, -14, 31, 9),
		Block.createCuboidShape(15, -16, 6, 16, 31, 10),
		Block.createCuboidShape(-16, -16, 6, -15, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, -1, 10, 10, 1),
		Block.createCuboidShape(7, 30, -14, 9, 31, 14),
		Block.createCuboidShape(7, -16, -14, 9, -15, 14),
		Block.createCuboidShape(9, 5, -15, 9, 8, 15),
		Block.createCuboidShape(7, 5, -15, 7, 8, 15),
		Block.createCuboidShape(10, 4, -3, 10, 10, 3),
		Block.createCuboidShape(6, 4, -3, 6, 10, 3),
		Block.createCuboidShape(7, -15, 2, 9, 30, 14),
		Block.createCuboidShape(7, -15, -14, 9, 30, -2),
		Block.createCuboidShape(6, 31, -16, 10, 32, 16),
		Block.createCuboidShape(7, -16, -2, 9, 31, 2),
		Block.createCuboidShape(7, -16, 14, 9, 31, 15),
		Block.createCuboidShape(7, -16, -15, 9, 31, -14),
		Block.createCuboidShape(6, -16, 15, 10, 31, 16),
		Block.createCuboidShape(6, -16, -16, 10, 31, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, 4, 6, 17, 10, 10),
		Block.createCuboidShape(2, 30, 7, 30, 31, 9),
		Block.createCuboidShape(2, -16, 7, 30, -15, 9),
		Block.createCuboidShape(1, 5, 9, 31, 8, 9),
		Block.createCuboidShape(1, 5, 7, 31, 8, 7),
		Block.createCuboidShape(13, 4, 10, 19, 10, 10),
		Block.createCuboidShape(13, 4, 6, 19, 10, 6),
		Block.createCuboidShape(2, -15, 7, 14, 30, 9),
		Block.createCuboidShape(18, -15, 7, 30, 30, 9),
		Block.createCuboidShape(0, 31, 6, 32, 32, 10),
		Block.createCuboidShape(14, -16, 7, 18, 31, 9),
		Block.createCuboidShape(1, -16, 7, 2, 31, 9),
		Block.createCuboidShape(30, -16, 7, 31, 31, 9),
		Block.createCuboidShape(0, -16, 6, 1, 31, 10),
		Block.createCuboidShape(31, -16, 6, 32, 31, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, 15, 10, 10, 17),
		Block.createCuboidShape(7, 30, 2, 9, 31, 30),
		Block.createCuboidShape(7, -16, 2, 9, -15, 30),
		Block.createCuboidShape(7, 5, 1, 7, 8, 31),
		Block.createCuboidShape(9, 5, 1, 9, 8, 31),
		Block.createCuboidShape(6, 4, 13, 6, 10, 19),
		Block.createCuboidShape(10, 4, 13, 10, 10, 19),
		Block.createCuboidShape(7, -15, 2, 9, 30, 14),
		Block.createCuboidShape(7, -15, 18, 9, 30, 30),
		Block.createCuboidShape(6, 31, 0, 10, 32, 32),
		Block.createCuboidShape(7, -16, 14, 9, 31, 18),
		Block.createCuboidShape(7, -16, 1, 9, 31, 2),
		Block.createCuboidShape(7, -16, 30, 9, 31, 31),
		Block.createCuboidShape(6, -16, 0, 10, 31, 1),
		Block.createCuboidShape(6, -16, 31, 10, 31, 32)
    );

    public Winn11_Data() {
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

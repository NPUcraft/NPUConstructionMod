package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 1, 7, 14, 4, 9),
		Block.createCuboidShape(-14, 27, 7, 14, 31, 9),
		Block.createCuboidShape(-14, 23, 7, 14, 27, 9),
		Block.createCuboidShape(-14, 19, 7, 14, 23, 9),
		Block.createCuboidShape(-14, 15, 7, 14, 19, 9),
		Block.createCuboidShape(-14, 11, 7, 14, 15, 9),
		Block.createCuboidShape(-14, 7, 7, 14, 11, 9),
		Block.createCuboidShape(-16, 1, 6, -14, 31, 10),
		Block.createCuboidShape(14, 1, 6, 16, 31, 10),
		Block.createCuboidShape(-14, 5, 7, 14, 6, 9),
		Block.createCuboidShape(-1, 1, 7, 1, 31, 9),
		Block.createCuboidShape(-16, 0, 6, 16, 1, 10),
		Block.createCuboidShape(-16, 31, 6, 16, 32, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, -14, 9, 4, 14),
		Block.createCuboidShape(7, 27, -14, 9, 31, 14),
		Block.createCuboidShape(7, 23, -14, 9, 27, 14),
		Block.createCuboidShape(7, 19, -14, 9, 23, 14),
		Block.createCuboidShape(7, 15, -14, 9, 19, 14),
		Block.createCuboidShape(7, 11, -14, 9, 15, 14),
		Block.createCuboidShape(7, 7, -14, 9, 11, 14),
		Block.createCuboidShape(6, 1, -16, 10, 31, -14),
		Block.createCuboidShape(6, 1, 14, 10, 31, 16),
		Block.createCuboidShape(7, 5, -14, 9, 6, 14),
		Block.createCuboidShape(7, 1, -1, 9, 31, 1),
		Block.createCuboidShape(6, 0, -16, 10, 1, 16),
		Block.createCuboidShape(6, 31, -16, 10, 32, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 1, 7, 30, 4, 9),
		Block.createCuboidShape(2, 27, 7, 30, 31, 9),
		Block.createCuboidShape(2, 23, 7, 30, 27, 9),
		Block.createCuboidShape(2, 19, 7, 30, 23, 9),
		Block.createCuboidShape(2, 15, 7, 30, 19, 9),
		Block.createCuboidShape(2, 11, 7, 30, 15, 9),
		Block.createCuboidShape(2, 7, 7, 30, 11, 9),
		Block.createCuboidShape(30, 1, 6, 32, 31, 10),
		Block.createCuboidShape(0, 1, 6, 2, 31, 10),
		Block.createCuboidShape(2, 5, 7, 30, 6, 9),
		Block.createCuboidShape(15, 1, 7, 17, 31, 9),
		Block.createCuboidShape(0, 0, 6, 32, 1, 10),
		Block.createCuboidShape(0, 31, 6, 32, 32, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, 2, 9, 4, 30),
		Block.createCuboidShape(7, 27, 2, 9, 31, 30),
		Block.createCuboidShape(7, 23, 2, 9, 27, 30),
		Block.createCuboidShape(7, 19, 2, 9, 23, 30),
		Block.createCuboidShape(7, 15, 2, 9, 19, 30),
		Block.createCuboidShape(7, 11, 2, 9, 15, 30),
		Block.createCuboidShape(7, 7, 2, 9, 11, 30),
		Block.createCuboidShape(6, 1, 30, 10, 31, 32),
		Block.createCuboidShape(6, 1, 0, 10, 31, 2),
		Block.createCuboidShape(7, 5, 2, 9, 6, 30),
		Block.createCuboidShape(7, 1, 15, 9, 31, 17),
		Block.createCuboidShape(6, 0, 0, 10, 1, 32),
		Block.createCuboidShape(6, 31, 0, 10, 32, 32)
    );

    public Winn10_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 30, 6, 14, 31, 10),
		Block.createCuboidShape(-14, 1, 6, 14, 2, 10),
		Block.createCuboidShape(1, 2, 7, 14, 30, 7),
		Block.createCuboidShape(-14, 2, 9, -1, 30, 9),
		Block.createCuboidShape(-16, 0, 6, 16, 1, 10),
		Block.createCuboidShape(-16, 31, 6, 16, 32, 10),
		Block.createCuboidShape(-16, 1, 6, -15, 31, 10),
		Block.createCuboidShape(15, 1, 6, 16, 31, 10),
		Block.createCuboidShape(14, 1, 6, 15, 31, 8),
		Block.createCuboidShape(-1, 1, 8, 0, 31, 10),
		Block.createCuboidShape(0, 1, 6, 1, 31, 8),
		Block.createCuboidShape(-15, 1, 8, -14, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 30, -14, 10, 31, 14),
		Block.createCuboidShape(6, 1, -14, 10, 2, 14),
		Block.createCuboidShape(9, 2, 1, 9, 30, 14),
		Block.createCuboidShape(7, 2, -14, 7, 30, -1),
		Block.createCuboidShape(6, 0, -16, 10, 1, 16),
		Block.createCuboidShape(6, 31, -16, 10, 32, 16),
		Block.createCuboidShape(6, 1, -16, 10, 31, -15),
		Block.createCuboidShape(6, 1, 15, 10, 31, 16),
		Block.createCuboidShape(8, 1, 14, 10, 31, 15),
		Block.createCuboidShape(6, 1, -1, 8, 31, 0),
		Block.createCuboidShape(8, 1, 0, 10, 31, 1),
		Block.createCuboidShape(6, 1, -15, 8, 31, -14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 30, 6, 30, 31, 10),
		Block.createCuboidShape(2, 1, 6, 30, 2, 10),
		Block.createCuboidShape(2, 2, 9, 15, 30, 9),
		Block.createCuboidShape(17, 2, 7, 30, 30, 7),
		Block.createCuboidShape(0, 0, 6, 32, 1, 10),
		Block.createCuboidShape(0, 31, 6, 32, 32, 10),
		Block.createCuboidShape(31, 1, 6, 32, 31, 10),
		Block.createCuboidShape(0, 1, 6, 1, 31, 10),
		Block.createCuboidShape(1, 1, 8, 2, 31, 10),
		Block.createCuboidShape(16, 1, 6, 17, 31, 8),
		Block.createCuboidShape(15, 1, 8, 16, 31, 10),
		Block.createCuboidShape(30, 1, 6, 31, 31, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 30, 2, 10, 31, 30),
		Block.createCuboidShape(6, 1, 2, 10, 2, 30),
		Block.createCuboidShape(7, 2, 2, 7, 30, 15),
		Block.createCuboidShape(9, 2, 17, 9, 30, 30),
		Block.createCuboidShape(6, 0, 0, 10, 1, 32),
		Block.createCuboidShape(6, 31, 0, 10, 32, 32),
		Block.createCuboidShape(6, 1, 31, 10, 31, 32),
		Block.createCuboidShape(6, 1, 0, 10, 31, 1),
		Block.createCuboidShape(6, 1, 1, 8, 31, 2),
		Block.createCuboidShape(8, 1, 16, 10, 31, 17),
		Block.createCuboidShape(6, 1, 15, 8, 31, 16),
		Block.createCuboidShape(8, 1, 30, 10, 31, 31)
    );

    public Winnn8_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win11_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 1, 6, 14, 2, 10),
		Block.createCuboidShape(-14, 21, 6, 14, 22, 10),
		Block.createCuboidShape(-15, 0, 6, 15, 1, 10),
		Block.createCuboidShape(15, 0, 6, 16, 32, 10),
		Block.createCuboidShape(-16, 0, 6, -15, 32, 10),
		Block.createCuboidShape(0, 1, 6, 1, 22, 8),
		Block.createCuboidShape(14, 1, 6, 15, 22, 8),
		Block.createCuboidShape(-15, 1, 8, -14, 22, 10),
		Block.createCuboidShape(-1, 1, 8, 0, 22, 10),
		Block.createCuboidShape(-15, 31, 6, 15, 32, 10),
		Block.createCuboidShape(-15, 22, 6, 15, 23, 10),
		Block.createCuboidShape(-1, 23, 7, 1, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, -14, 10, 2, 14),
		Block.createCuboidShape(6, 21, -14, 10, 22, 14),
		Block.createCuboidShape(6, 0, -15, 10, 1, 15),
		Block.createCuboidShape(6, 0, 15, 10, 32, 16),
		Block.createCuboidShape(6, 0, -16, 10, 32, -15),
		Block.createCuboidShape(8, 1, 0, 10, 22, 1),
		Block.createCuboidShape(8, 1, 14, 10, 22, 15),
		Block.createCuboidShape(6, 1, -15, 8, 22, -14),
		Block.createCuboidShape(6, 1, -1, 8, 22, 0),
		Block.createCuboidShape(6, 31, -15, 10, 32, 15),
		Block.createCuboidShape(6, 22, -15, 10, 23, 15),
		Block.createCuboidShape(7, 23, -1, 9, 31, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 1, 6, 30, 2, 10),
		Block.createCuboidShape(2, 21, 6, 30, 22, 10),
		Block.createCuboidShape(1, 0, 6, 31, 1, 10),
		Block.createCuboidShape(0, 0, 6, 1, 32, 10),
		Block.createCuboidShape(31, 0, 6, 32, 32, 10),
		Block.createCuboidShape(15, 1, 8, 16, 22, 10),
		Block.createCuboidShape(1, 1, 8, 2, 22, 10),
		Block.createCuboidShape(30, 1, 6, 31, 22, 8),
		Block.createCuboidShape(16, 1, 6, 17, 22, 8),
		Block.createCuboidShape(1, 31, 6, 31, 32, 10),
		Block.createCuboidShape(1, 22, 6, 31, 23, 10),
		Block.createCuboidShape(15, 23, 7, 17, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 2, 10, 2, 30),
		Block.createCuboidShape(6, 21, 2, 10, 22, 30),
		Block.createCuboidShape(6, 0, 1, 10, 1, 31),
		Block.createCuboidShape(6, 0, 0, 10, 32, 1),
		Block.createCuboidShape(6, 0, 31, 10, 32, 32),
		Block.createCuboidShape(6, 1, 15, 8, 22, 16),
		Block.createCuboidShape(6, 1, 1, 8, 22, 2),
		Block.createCuboidShape(8, 1, 30, 10, 22, 31),
		Block.createCuboidShape(8, 1, 16, 10, 22, 17),
		Block.createCuboidShape(6, 31, 1, 10, 32, 31),
		Block.createCuboidShape(6, 22, 1, 10, 23, 31),
		Block.createCuboidShape(7, 23, 15, 9, 31, 17)
    );

    public Win11_Data() {
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

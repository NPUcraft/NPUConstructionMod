package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Window11_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 0, 6, 31, 1, 10),
		Block.createCuboidShape(31, 0, 6, 32, 32, 10),
		Block.createCuboidShape(-16, 0, 6, -15, 32, 10),
		Block.createCuboidShape(8, 1, 6, 9, 22, 8),
		Block.createCuboidShape(30, 1, 6, 31, 22, 8),
		Block.createCuboidShape(9, 1, 6, 30, 2, 8),
		Block.createCuboidShape(9, 21, 6, 30, 22, 8),
		Block.createCuboidShape(-14, 21, 8, 7, 22, 10),
		Block.createCuboidShape(-14, 1, 8, 7, 2, 10),
		Block.createCuboidShape(-15, 1, 8, -14, 22, 10),
		Block.createCuboidShape(7, 1, 8, 8, 22, 10),
		Block.createCuboidShape(-15, 31, 6, 31, 32, 10),
		Block.createCuboidShape(-15, 22, 6, 31, 23, 10),
		Block.createCuboidShape(7, 23, 7, 9, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, -15, 10, 1, 31),
		Block.createCuboidShape(6, 0, 31, 10, 32, 32),
		Block.createCuboidShape(6, 0, -16, 10, 32, -15),
		Block.createCuboidShape(8, 1, 8, 10, 22, 9),
		Block.createCuboidShape(8, 1, 30, 10, 22, 31),
		Block.createCuboidShape(8, 1, 9, 10, 2, 30),
		Block.createCuboidShape(8, 21, 9, 10, 22, 30),
		Block.createCuboidShape(6, 21, -14, 8, 22, 7),
		Block.createCuboidShape(6, 1, -14, 8, 2, 7),
		Block.createCuboidShape(6, 1, -15, 8, 22, -14),
		Block.createCuboidShape(6, 1, 7, 8, 22, 8),
		Block.createCuboidShape(6, 31, -15, 10, 32, 31),
		Block.createCuboidShape(6, 22, -15, 10, 23, 31),
		Block.createCuboidShape(7, 23, 7, 9, 31, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 0, 6, 31, 1, 10),
		Block.createCuboidShape(-16, 0, 6, -15, 32, 10),
		Block.createCuboidShape(31, 0, 6, 32, 32, 10),
		Block.createCuboidShape(7, 1, 8, 8, 22, 10),
		Block.createCuboidShape(-15, 1, 8, -14, 22, 10),
		Block.createCuboidShape(-14, 1, 8, 7, 2, 10),
		Block.createCuboidShape(-14, 21, 8, 7, 22, 10),
		Block.createCuboidShape(9, 21, 6, 30, 22, 8),
		Block.createCuboidShape(9, 1, 6, 30, 2, 8),
		Block.createCuboidShape(30, 1, 6, 31, 22, 8),
		Block.createCuboidShape(8, 1, 6, 9, 22, 8),
		Block.createCuboidShape(-15, 31, 6, 31, 32, 10),
		Block.createCuboidShape(-15, 22, 6, 31, 23, 10),
		Block.createCuboidShape(7, 23, 7, 9, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, -15, 10, 1, 31),
		Block.createCuboidShape(6, 0, -16, 10, 32, -15),
		Block.createCuboidShape(6, 0, 31, 10, 32, 32),
		Block.createCuboidShape(6, 1, 7, 8, 22, 8),
		Block.createCuboidShape(6, 1, -15, 8, 22, -14),
		Block.createCuboidShape(6, 1, -14, 8, 2, 7),
		Block.createCuboidShape(6, 21, -14, 8, 22, 7),
		Block.createCuboidShape(8, 21, 9, 10, 22, 30),
		Block.createCuboidShape(8, 1, 9, 10, 2, 30),
		Block.createCuboidShape(8, 1, 30, 10, 22, 31),
		Block.createCuboidShape(8, 1, 8, 10, 22, 9),
		Block.createCuboidShape(6, 31, -15, 10, 32, 31),
		Block.createCuboidShape(6, 22, -15, 10, 23, 31),
		Block.createCuboidShape(7, 23, 7, 9, 31, 9)
    );

    public Window11_Data() {
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

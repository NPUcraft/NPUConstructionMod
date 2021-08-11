package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, -15, 6, 14, -14, 10),
		Block.createCuboidShape(-14, 15, 6, 14, 16, 10),
		Block.createCuboidShape(-15, -16, 6, 15, -15, 10),
		Block.createCuboidShape(15, -16, 6, 16, 32, 10),
		Block.createCuboidShape(-16, -16, 6, -15, 32, 10),
		Block.createCuboidShape(0, -15, 6, 1, 16, 8),
		Block.createCuboidShape(14, -15, 6, 15, 16, 8),
		Block.createCuboidShape(-15, -15, 8, -14, 16, 10),
		Block.createCuboidShape(-1, -15, 8, 0, 16, 10),
		Block.createCuboidShape(-15, 16, 6, 15, 17, 10),
		Block.createCuboidShape(-1, 17, 7, 1, 31, 9),
		Block.createCuboidShape(-15, 31, 6, 15, 32, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, -15, -14, 10, -14, 14),
		Block.createCuboidShape(6, 15, -14, 10, 16, 14),
		Block.createCuboidShape(6, -16, -15, 10, -15, 15),
		Block.createCuboidShape(6, -16, 15, 10, 32, 16),
		Block.createCuboidShape(6, -16, -16, 10, 32, -15),
		Block.createCuboidShape(8, -15, 0, 10, 16, 1),
		Block.createCuboidShape(8, -15, 14, 10, 16, 15),
		Block.createCuboidShape(6, -15, -15, 8, 16, -14),
		Block.createCuboidShape(6, -15, -1, 8, 16, 0),
		Block.createCuboidShape(6, 16, -15, 10, 17, 15),
		Block.createCuboidShape(7, 17, -1, 9, 31, 1),
		Block.createCuboidShape(6, 31, -15, 10, 32, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, -15, 6, 30, -14, 10),
		Block.createCuboidShape(2, 15, 6, 30, 16, 10),
		Block.createCuboidShape(1, -16, 6, 31, -15, 10),
		Block.createCuboidShape(0, -16, 6, 1, 32, 10),
		Block.createCuboidShape(31, -16, 6, 32, 32, 10),
		Block.createCuboidShape(15, -15, 8, 16, 16, 10),
		Block.createCuboidShape(1, -15, 8, 2, 16, 10),
		Block.createCuboidShape(30, -15, 6, 31, 16, 8),
		Block.createCuboidShape(16, -15, 6, 17, 16, 8),
		Block.createCuboidShape(1, 16, 6, 31, 17, 10),
		Block.createCuboidShape(15, 17, 7, 17, 31, 9),
		Block.createCuboidShape(1, 31, 6, 31, 32, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -15, 2, 10, -14, 30),
		Block.createCuboidShape(6, 15, 2, 10, 16, 30),
		Block.createCuboidShape(6, -16, 1, 10, -15, 31),
		Block.createCuboidShape(6, -16, 0, 10, 32, 1),
		Block.createCuboidShape(6, -16, 31, 10, 32, 32),
		Block.createCuboidShape(6, -15, 15, 8, 16, 16),
		Block.createCuboidShape(6, -15, 1, 8, 16, 2),
		Block.createCuboidShape(8, -15, 30, 10, 16, 31),
		Block.createCuboidShape(8, -15, 16, 10, 16, 17),
		Block.createCuboidShape(6, 16, 1, 10, 17, 31),
		Block.createCuboidShape(7, 17, 15, 9, 31, 17),
		Block.createCuboidShape(6, 31, 1, 10, 32, 31)
    );

    public Win1_Data() {
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

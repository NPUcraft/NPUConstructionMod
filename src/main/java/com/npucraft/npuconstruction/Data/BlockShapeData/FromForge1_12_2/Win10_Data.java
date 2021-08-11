package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 1, 6, 14, 2, 10),
		Block.createCuboidShape(-14, 30, 6, 14, 31, 10),
		Block.createCuboidShape(-15, 0, 6, 15, 1, 10),
		Block.createCuboidShape(15, 0, 6, 16, 32, 10),
		Block.createCuboidShape(-16, 0, 6, -15, 32, 10),
		Block.createCuboidShape(0, 1, 6, 1, 31, 8),
		Block.createCuboidShape(14, 1, 6, 15, 31, 8),
		Block.createCuboidShape(-15, 1, 8, -14, 31, 10),
		Block.createCuboidShape(-1, 1, 8, 0, 31, 10),
		Block.createCuboidShape(-15, 31, 6, 15, 32, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, -14, 10, 2, 14),
		Block.createCuboidShape(6, 30, -14, 10, 31, 14),
		Block.createCuboidShape(6, 0, -15, 10, 1, 15),
		Block.createCuboidShape(6, 0, 15, 10, 32, 16),
		Block.createCuboidShape(6, 0, -16, 10, 32, -15),
		Block.createCuboidShape(8, 1, 0, 10, 31, 1),
		Block.createCuboidShape(8, 1, 14, 10, 31, 15),
		Block.createCuboidShape(6, 1, -15, 8, 31, -14),
		Block.createCuboidShape(6, 1, -1, 8, 31, 0),
		Block.createCuboidShape(6, 31, -15, 10, 32, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 1, 6, 30, 2, 10),
		Block.createCuboidShape(2, 30, 6, 30, 31, 10),
		Block.createCuboidShape(1, 0, 6, 31, 1, 10),
		Block.createCuboidShape(0, 0, 6, 1, 32, 10),
		Block.createCuboidShape(31, 0, 6, 32, 32, 10),
		Block.createCuboidShape(15, 1, 8, 16, 31, 10),
		Block.createCuboidShape(1, 1, 8, 2, 31, 10),
		Block.createCuboidShape(30, 1, 6, 31, 31, 8),
		Block.createCuboidShape(16, 1, 6, 17, 31, 8),
		Block.createCuboidShape(1, 31, 6, 31, 32, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 2, 10, 2, 30),
		Block.createCuboidShape(6, 30, 2, 10, 31, 30),
		Block.createCuboidShape(6, 0, 1, 10, 1, 31),
		Block.createCuboidShape(6, 0, 0, 10, 32, 1),
		Block.createCuboidShape(6, 0, 31, 10, 32, 32),
		Block.createCuboidShape(6, 1, 15, 8, 31, 16),
		Block.createCuboidShape(6, 1, 1, 8, 31, 2),
		Block.createCuboidShape(8, 1, 30, 10, 31, 31),
		Block.createCuboidShape(8, 1, 16, 10, 31, 17),
		Block.createCuboidShape(6, 31, 1, 10, 32, 31)
    );

    public Win10_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Yf12_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 10, 9, 29, 12, 13),
		Block.createCuboidShape(28, 0, 9, 30, 12, 13),
		Block.createCuboidShape(2, 0, 9, 4, 12, 13),
		Block.createCuboidShape(2, 12, 6, 30, 16, 16),
		Block.createCuboidShape(30, 0, 6, 32, 16, 16),
		Block.createCuboidShape(0, 0, 6, 2, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 10, 3, 7, 12, 29),
		Block.createCuboidShape(3, 0, 28, 7, 12, 30),
		Block.createCuboidShape(3, 0, 2, 7, 12, 4),
		Block.createCuboidShape(0, 12, 2, 10, 16, 30),
		Block.createCuboidShape(0, 0, 30, 10, 16, 32),
		Block.createCuboidShape(0, 0, 0, 10, 16, 2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-13, 10, 3, 13, 12, 7),
		Block.createCuboidShape(-14, 0, 3, -12, 12, 7),
		Block.createCuboidShape(12, 0, 3, 14, 12, 7),
		Block.createCuboidShape(-14, 12, 0, 14, 16, 10),
		Block.createCuboidShape(-16, 0, 0, -14, 16, 10),
		Block.createCuboidShape(14, 0, 0, 16, 16, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, 10, -13, 13, 12, 13),
		Block.createCuboidShape(9, 0, -14, 13, 12, -12),
		Block.createCuboidShape(9, 0, 12, 13, 12, 14),
		Block.createCuboidShape(6, 12, -14, 16, 16, 14),
		Block.createCuboidShape(6, 0, -16, 16, 16, -14),
		Block.createCuboidShape(6, 0, 14, 16, 16, 16)
    );

    public Yf12_Data() {
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

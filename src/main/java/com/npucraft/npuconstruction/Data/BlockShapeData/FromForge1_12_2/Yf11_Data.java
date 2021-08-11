package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Yf11_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(30, -16, 6, 32, 32, 16),
		Block.createCuboidShape(0, -16, 6, 2, 32, 16),
		Block.createCuboidShape(2, -16, 9, 3, 32, 13),
		Block.createCuboidShape(29, -16, 9, 30, 32, 13),
		Block.createCuboidShape(28, -16, 10, 29, 32, 12),
		Block.createCuboidShape(4, 31, 10, 28, 32, 12),
		Block.createCuboidShape(3, -16, 10, 4, 32, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 30, 10, 32, 32),
		Block.createCuboidShape(0, -16, 0, 10, 32, 2),
		Block.createCuboidShape(3, -16, 2, 7, 32, 3),
		Block.createCuboidShape(3, -16, 29, 7, 32, 30),
		Block.createCuboidShape(4, -16, 28, 6, 32, 29),
		Block.createCuboidShape(4, 31, 4, 6, 32, 28),
		Block.createCuboidShape(4, -16, 3, 6, 32, 4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -16, 0, -14, 32, 10),
		Block.createCuboidShape(14, -16, 0, 16, 32, 10),
		Block.createCuboidShape(13, -16, 3, 14, 32, 7),
		Block.createCuboidShape(-14, -16, 3, -13, 32, 7),
		Block.createCuboidShape(-13, -16, 4, -12, 32, 6),
		Block.createCuboidShape(-12, 31, 4, 12, 32, 6),
		Block.createCuboidShape(12, -16, 4, 13, 32, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, -16, 16, 32, -14),
		Block.createCuboidShape(6, -16, 14, 16, 32, 16),
		Block.createCuboidShape(9, -16, 13, 13, 32, 14),
		Block.createCuboidShape(9, -16, -14, 13, 32, -13),
		Block.createCuboidShape(10, -16, -13, 12, 32, -12),
		Block.createCuboidShape(10, 31, -12, 12, 32, 12),
		Block.createCuboidShape(10, -16, 12, 12, 32, 13)
    );

    public Yf11_Data() {
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

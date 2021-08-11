package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Railing2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 32, 8, 16),
		Block.createCuboidShape(29, 9, 8, 30, 30, 9),
		Block.createCuboidShape(0, 30, 8, 32, 31, 9),
		Block.createCuboidShape(1, 24, 8, 29, 25, 9),
		Block.createCuboidShape(1, 20, 8, 29, 21, 9),
		Block.createCuboidShape(1, 16, 8, 29, 17, 9),
		Block.createCuboidShape(1, 12, 8, 29, 13, 9),
		Block.createCuboidShape(0, 9, 8, 1, 30, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 8, 32),
		Block.createCuboidShape(7, 9, 29, 8, 30, 30),
		Block.createCuboidShape(7, 30, 0, 8, 31, 32),
		Block.createCuboidShape(7, 24, 1, 8, 25, 29),
		Block.createCuboidShape(7, 20, 1, 8, 21, 29),
		Block.createCuboidShape(7, 16, 1, 8, 17, 29),
		Block.createCuboidShape(7, 12, 1, 8, 13, 29),
		Block.createCuboidShape(7, 9, 0, 8, 30, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 0, 16, 8, 16),
		Block.createCuboidShape(-14, 9, 7, -13, 30, 8),
		Block.createCuboidShape(-16, 30, 7, 16, 31, 8),
		Block.createCuboidShape(-13, 24, 7, 15, 25, 8),
		Block.createCuboidShape(-13, 20, 7, 15, 21, 8),
		Block.createCuboidShape(-13, 16, 7, 15, 17, 8),
		Block.createCuboidShape(-13, 12, 7, 15, 13, 8),
		Block.createCuboidShape(15, 9, 7, 16, 30, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -16, 16, 8, 16),
		Block.createCuboidShape(8, 9, -14, 9, 30, -13),
		Block.createCuboidShape(8, 30, -16, 9, 31, 16),
		Block.createCuboidShape(8, 24, -13, 9, 25, 15),
		Block.createCuboidShape(8, 20, -13, 9, 21, 15),
		Block.createCuboidShape(8, 16, -13, 9, 17, 15),
		Block.createCuboidShape(8, 12, -13, 9, 13, 15),
		Block.createCuboidShape(8, 9, 15, 9, 30, 16)
    );

    public Railing2_Data() {
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

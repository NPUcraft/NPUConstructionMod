package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Pipe9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 5, 5, 9, 11, 11),
		Block.createCuboidShape(0, 6, 6, 16, 10, 10),
		Block.createCuboidShape(7, 0, 0, 9, 1, 21),
		Block.createCuboidShape(7, -5, 0, 9, 15, 1),
		Block.createCuboidShape(7, 1, 15, 9, 15, 16),
		Block.createCuboidShape(7, 15, 0, 9, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 5, 7, 11, 11, 9),
		Block.createCuboidShape(6, 6, 0, 10, 10, 16),
		Block.createCuboidShape(-5, 0, 7, 16, 1, 9),
		Block.createCuboidShape(15, -5, 7, 16, 15, 9),
		Block.createCuboidShape(0, 1, 7, 1, 15, 9),
		Block.createCuboidShape(0, 15, 7, 16, 16, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 5, 5, 9, 11, 11),
		Block.createCuboidShape(0, 6, 6, 16, 10, 10),
		Block.createCuboidShape(7, 0, -5, 9, 1, 16),
		Block.createCuboidShape(7, -5, 15, 9, 15, 16),
		Block.createCuboidShape(7, 1, 0, 9, 15, 1),
		Block.createCuboidShape(7, 15, 0, 9, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 5, 7, 11, 11, 9),
		Block.createCuboidShape(6, 6, 0, 10, 10, 16),
		Block.createCuboidShape(0, 0, 7, 21, 1, 9),
		Block.createCuboidShape(0, -5, 7, 1, 15, 9),
		Block.createCuboidShape(15, 1, 7, 16, 15, 9),
		Block.createCuboidShape(0, 15, 7, 16, 16, 9)
    );

    public Pipe9_Data() {
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

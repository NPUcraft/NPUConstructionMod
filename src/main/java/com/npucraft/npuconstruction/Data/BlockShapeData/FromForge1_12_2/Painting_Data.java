package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Painting_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, -2, 15, 0, 28, 16),
		Block.createCuboidShape(16, -2, 15, 17, 28, 16),
		Block.createCuboidShape(0, -2, 15, 16, -1, 16),
		Block.createCuboidShape(0, 27, 15, 16, 28, 16),
		Block.createCuboidShape(0, -1, 16, 16, 27, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -2, -1, 1, 28, 0),
		Block.createCuboidShape(0, -2, 16, 1, 28, 17),
		Block.createCuboidShape(0, -2, 0, 1, -1, 16),
		Block.createCuboidShape(0, 27, 0, 1, 28, 16),
		Block.createCuboidShape(-1, -1, 0, 0, 27, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(16, -2, 0, 17, 28, 1),
		Block.createCuboidShape(-1, -2, 0, 0, 28, 1),
		Block.createCuboidShape(0, -2, 0, 16, -1, 1),
		Block.createCuboidShape(0, 27, 0, 16, 28, 1),
		Block.createCuboidShape(0, -1, -1, 16, 27, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, -2, 16, 16, 28, 17),
		Block.createCuboidShape(15, -2, -1, 16, 28, 0),
		Block.createCuboidShape(15, -2, 0, 16, -1, 16),
		Block.createCuboidShape(15, 27, 0, 16, 28, 16),
		Block.createCuboidShape(16, -1, 0, 17, 27, 16)
    );

    public Painting_Data() {
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

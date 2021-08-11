package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Ftsigh_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, -3, 5, 11, 0, 11),
		Block.createCuboidShape(0, 0, 5, 16, 31, 11),
		Block.createCuboidShape(-1, 0, 5, 17, 0, 11),
		Block.createCuboidShape(-1, 31, 5, 17, 31, 11),
		Block.createCuboidShape(16, 0, 5, 17, 31, 11),
		Block.createCuboidShape(-1, 0, 5, 0, 31, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -3, 5, 11, 0, 11),
		Block.createCuboidShape(5, 0, 0, 11, 31, 16),
		Block.createCuboidShape(5, 0, -1, 11, 0, 17),
		Block.createCuboidShape(5, 31, -1, 11, 31, 17),
		Block.createCuboidShape(5, 0, 16, 11, 31, 17),
		Block.createCuboidShape(5, 0, -1, 11, 31, 0)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, -3, 5, 11, 0, 11),
		Block.createCuboidShape(0, 0, 5, 16, 31, 11),
		Block.createCuboidShape(-1, 0, 5, 17, 0, 11),
		Block.createCuboidShape(-1, 31, 5, 17, 31, 11),
		Block.createCuboidShape(-1, 0, 5, 0, 31, 11),
		Block.createCuboidShape(16, 0, 5, 17, 31, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -3, 5, 11, 0, 11),
		Block.createCuboidShape(5, 0, 0, 11, 31, 16),
		Block.createCuboidShape(5, 0, -1, 11, 0, 17),
		Block.createCuboidShape(5, 31, -1, 11, 31, 17),
		Block.createCuboidShape(5, 0, -1, 11, 31, 0),
		Block.createCuboidShape(5, 0, 16, 11, 31, 17)
    );

    public Ftsigh_Data() {
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

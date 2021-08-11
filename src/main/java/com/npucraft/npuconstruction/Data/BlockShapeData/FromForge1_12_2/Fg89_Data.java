package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg89_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 8, 2, 14, 10, 14),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, 8, 2, 14, 10, 14),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 8, 2, 14, 10, 14),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 8, 2, 14, 10, 14),
		Block.createCuboidShape(0, 10, 0, 16, 16, 16),
		Block.createCuboidShape(0, 7, 0, 0, 10, 16),
		Block.createCuboidShape(16, 7, 0, 16, 10, 16),
		Block.createCuboidShape(0, 7, 0, 16, 10, 0),
		Block.createCuboidShape(0, 7, 16, 16, 10, 16)
    );

    public Fg89_Data() {
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

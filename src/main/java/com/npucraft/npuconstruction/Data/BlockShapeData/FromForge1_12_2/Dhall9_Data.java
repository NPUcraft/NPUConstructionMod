package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 19, 0, 11, 20, 8),
		Block.createCuboidShape(0, 0, 1, 1, 18, 16),
		Block.createCuboidShape(15, 0, 1, 16, 18, 16),
		Block.createCuboidShape(0, 18, 0, 16, 19, 9),
		Block.createCuboidShape(0, 0, 0, 16, 20, 1),
		Block.createCuboidShape(0, 15, 0, 16, 16, 8),
		Block.createCuboidShape(1, 0, 1, 15, 11, 8),
		Block.createCuboidShape(0, 11, 1, 16, 12, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 19, 2, 16, 20, 11),
		Block.createCuboidShape(0, 0, 0, 15, 18, 1),
		Block.createCuboidShape(0, 0, 15, 15, 18, 16),
		Block.createCuboidShape(7, 18, 0, 16, 19, 16),
		Block.createCuboidShape(15, 0, 0, 16, 20, 16),
		Block.createCuboidShape(8, 15, 0, 16, 16, 16),
		Block.createCuboidShape(8, 0, 1, 15, 11, 15),
		Block.createCuboidShape(0, 11, 0, 15, 12, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 19, 8, 14, 20, 16),
		Block.createCuboidShape(15, 0, 0, 16, 18, 15),
		Block.createCuboidShape(0, 0, 0, 1, 18, 15),
		Block.createCuboidShape(0, 18, 7, 16, 19, 16),
		Block.createCuboidShape(0, 0, 15, 16, 20, 16),
		Block.createCuboidShape(0, 15, 8, 16, 16, 16),
		Block.createCuboidShape(1, 0, 8, 15, 11, 15),
		Block.createCuboidShape(0, 11, 0, 16, 12, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 19, 5, 8, 20, 14),
		Block.createCuboidShape(1, 0, 15, 16, 18, 16),
		Block.createCuboidShape(1, 0, 0, 16, 18, 1),
		Block.createCuboidShape(0, 18, 0, 9, 19, 16),
		Block.createCuboidShape(0, 0, 0, 1, 20, 16),
		Block.createCuboidShape(0, 15, 0, 8, 16, 16),
		Block.createCuboidShape(1, 0, 1, 8, 11, 15),
		Block.createCuboidShape(1, 11, 0, 16, 12, 16)
    );

    public Dhall9_Data() {
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

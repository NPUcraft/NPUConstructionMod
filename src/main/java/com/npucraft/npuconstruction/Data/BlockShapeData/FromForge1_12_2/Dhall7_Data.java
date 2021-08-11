package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 20, 0, 11, 32, 1),
		Block.createCuboidShape(0, 0, 1, 1, 18, 16),
		Block.createCuboidShape(0, 12, 1, 1, 32, 9),
		Block.createCuboidShape(15, 0, 1, 16, 18, 16),
		Block.createCuboidShape(13, 20, 4, 15, 25, 7),
		Block.createCuboidShape(0, 15, 0, 16, 16, 8),
		Block.createCuboidShape(0, 19, 0, 11, 20, 9),
		Block.createCuboidShape(0, 32, 0, 11, 32, 9),
		Block.createCuboidShape(0, 0, 0, 16, 18, 1),
		Block.createCuboidShape(0, 18, 0, 16, 19, 9),
		Block.createCuboidShape(1, 0, 1, 15, 11, 8),
		Block.createCuboidShape(0, 11, 1, 16, 12, 16),
		Block.createCuboidShape(1, 24, 1, 11, 24, 7),
		Block.createCuboidShape(1, 28, 1, 11, 28, 7),
		Block.createCuboidShape(1, 20, 6, 11, 32, 9),
		Block.createCuboidShape(11, 20, 1, 11, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 20, 0, 16, 32, 11),
		Block.createCuboidShape(0, 0, 0, 15, 18, 1),
		Block.createCuboidShape(7, 12, 0, 15, 32, 1),
		Block.createCuboidShape(0, 0, 15, 15, 18, 16),
		Block.createCuboidShape(9, 20, 13, 12, 25, 15),
		Block.createCuboidShape(8, 15, 0, 16, 16, 16),
		Block.createCuboidShape(7, 19, 0, 16, 20, 11),
		Block.createCuboidShape(7, 32, 0, 16, 32, 11),
		Block.createCuboidShape(15, 0, 0, 16, 18, 16),
		Block.createCuboidShape(7, 18, 0, 16, 19, 16),
		Block.createCuboidShape(8, 0, 1, 15, 11, 15),
		Block.createCuboidShape(0, 11, 0, 15, 12, 16),
		Block.createCuboidShape(9, 24, 1, 15, 24, 11),
		Block.createCuboidShape(9, 28, 1, 15, 28, 11),
		Block.createCuboidShape(7, 20, 1, 10, 32, 11),
		Block.createCuboidShape(7, 20, 11, 15, 32, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 20, 15, 16, 32, 16),
		Block.createCuboidShape(15, 0, 0, 16, 18, 15),
		Block.createCuboidShape(15, 12, 7, 16, 32, 15),
		Block.createCuboidShape(0, 0, 0, 1, 18, 15),
		Block.createCuboidShape(1, 20, 9, 3, 25, 12),
		Block.createCuboidShape(0, 15, 8, 16, 16, 16),
		Block.createCuboidShape(5, 19, 7, 16, 20, 16),
		Block.createCuboidShape(5, 32, 7, 16, 32, 16),
		Block.createCuboidShape(0, 0, 15, 16, 18, 16),
		Block.createCuboidShape(0, 18, 7, 16, 19, 16),
		Block.createCuboidShape(1, 0, 8, 15, 11, 15),
		Block.createCuboidShape(0, 11, 0, 16, 12, 15),
		Block.createCuboidShape(5, 24, 9, 15, 24, 15),
		Block.createCuboidShape(5, 28, 9, 15, 28, 15),
		Block.createCuboidShape(5, 20, 7, 15, 32, 10),
		Block.createCuboidShape(5, 20, 7, 5, 32, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 20, 5, 1, 32, 16),
		Block.createCuboidShape(1, 0, 15, 16, 18, 16),
		Block.createCuboidShape(1, 12, 15, 9, 32, 16),
		Block.createCuboidShape(1, 0, 0, 16, 18, 1),
		Block.createCuboidShape(4, 20, 1, 7, 25, 3),
		Block.createCuboidShape(0, 15, 0, 8, 16, 16),
		Block.createCuboidShape(0, 19, 5, 9, 20, 16),
		Block.createCuboidShape(0, 32, 5, 9, 32, 16),
		Block.createCuboidShape(0, 0, 0, 1, 18, 16),
		Block.createCuboidShape(0, 18, 0, 9, 19, 16),
		Block.createCuboidShape(1, 0, 1, 8, 11, 15),
		Block.createCuboidShape(1, 11, 0, 16, 12, 16),
		Block.createCuboidShape(1, 24, 5, 7, 24, 15),
		Block.createCuboidShape(1, 28, 5, 7, 28, 15),
		Block.createCuboidShape(6, 20, 5, 9, 32, 15),
		Block.createCuboidShape(1, 20, 5, 9, 32, 5)
    );

    public Dhall7_Data() {
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

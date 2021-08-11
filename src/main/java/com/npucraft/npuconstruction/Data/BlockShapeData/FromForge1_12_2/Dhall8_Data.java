package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 19, 1, 8, 23, 7),
		Block.createCuboidShape(0, 0, 1, 1, 18, 16),
		Block.createCuboidShape(15, 0, 1, 16, 18, 16),
		Block.createCuboidShape(0, 15, 0, 16, 16, 8),
		Block.createCuboidShape(0, 0, 0, 16, 18, 1),
		Block.createCuboidShape(0, 18, 0, 16, 19, 9),
		Block.createCuboidShape(1, 0, 1, 15, 11, 8),
		Block.createCuboidShape(0, 11, 1, 16, 12, 16),
		Block.createCuboidShape(2, 20, 1, 3, 22, 7),
		Block.createCuboidShape(3, 21, -4, 8, 22, 0),
		Block.createCuboidShape(8, 20, 1, 9, 22, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 19, 3, 15, 23, 8),
		Block.createCuboidShape(0, 0, 0, 15, 18, 1),
		Block.createCuboidShape(0, 0, 15, 15, 18, 16),
		Block.createCuboidShape(8, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 0, 0, 16, 18, 16),
		Block.createCuboidShape(7, 18, 0, 16, 19, 16),
		Block.createCuboidShape(8, 0, 1, 15, 11, 15),
		Block.createCuboidShape(0, 11, 0, 15, 12, 16),
		Block.createCuboidShape(9, 20, 2, 15, 22, 3),
		Block.createCuboidShape(16, 21, 3, 20, 22, 8),
		Block.createCuboidShape(9, 20, 8, 15, 22, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, 19, 9, 13, 23, 15),
		Block.createCuboidShape(15, 0, 0, 16, 18, 15),
		Block.createCuboidShape(0, 0, 0, 1, 18, 15),
		Block.createCuboidShape(0, 15, 8, 16, 16, 16),
		Block.createCuboidShape(0, 0, 15, 16, 18, 16),
		Block.createCuboidShape(0, 18, 7, 16, 19, 16),
		Block.createCuboidShape(1, 0, 8, 15, 11, 15),
		Block.createCuboidShape(0, 11, 0, 16, 12, 15),
		Block.createCuboidShape(13, 20, 9, 14, 22, 15),
		Block.createCuboidShape(8, 21, 16, 13, 22, 20),
		Block.createCuboidShape(7, 20, 9, 8, 22, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 19, 8, 7, 23, 13),
		Block.createCuboidShape(1, 0, 15, 16, 18, 16),
		Block.createCuboidShape(1, 0, 0, 16, 18, 1),
		Block.createCuboidShape(0, 15, 0, 8, 16, 16),
		Block.createCuboidShape(0, 0, 0, 1, 18, 16),
		Block.createCuboidShape(0, 18, 0, 9, 19, 16),
		Block.createCuboidShape(1, 0, 1, 8, 11, 15),
		Block.createCuboidShape(1, 11, 0, 16, 12, 16),
		Block.createCuboidShape(1, 20, 13, 7, 22, 14),
		Block.createCuboidShape(-4, 21, 8, 0, 22, 13),
		Block.createCuboidShape(1, 20, 7, 7, 22, 8)
    );

    public Dhall8_Data() {
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

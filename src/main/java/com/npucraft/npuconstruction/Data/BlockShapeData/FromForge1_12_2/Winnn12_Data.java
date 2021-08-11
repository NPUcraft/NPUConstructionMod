package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn12_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 1, 7, 2, 31, 10),
		Block.createCuboidShape(0, 0, 7, 16, 2, 9),
		Block.createCuboidShape(0, 30, 7, 16, 32, 9),
		Block.createCuboidShape(15, 1, 7, 16, 31, 9),
		Block.createCuboidShape(2, 2, 7, 15, 30, 8),
		Block.createCuboidShape(8, 1, 9, 9, 1, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 0, 9, 31, 2),
		Block.createCuboidShape(7, 0, 0, 9, 2, 16),
		Block.createCuboidShape(7, 30, 0, 9, 32, 16),
		Block.createCuboidShape(7, 1, 15, 9, 31, 16),
		Block.createCuboidShape(8, 2, 2, 9, 30, 15),
		Block.createCuboidShape(1, 1, 8, 7, 1, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(14, 1, 6, 16, 31, 9),
		Block.createCuboidShape(0, 0, 7, 16, 2, 9),
		Block.createCuboidShape(0, 30, 7, 16, 32, 9),
		Block.createCuboidShape(0, 1, 7, 1, 31, 9),
		Block.createCuboidShape(1, 2, 8, 14, 30, 9),
		Block.createCuboidShape(7, 1, 1, 8, 1, 7)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, 14, 10, 31, 16),
		Block.createCuboidShape(7, 0, 0, 9, 2, 16),
		Block.createCuboidShape(7, 30, 0, 9, 32, 16),
		Block.createCuboidShape(7, 1, 0, 9, 31, 1),
		Block.createCuboidShape(7, 2, 1, 8, 30, 14),
		Block.createCuboidShape(9, 1, 7, 15, 1, 8)
    );

    public Winnn12_Data() {
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

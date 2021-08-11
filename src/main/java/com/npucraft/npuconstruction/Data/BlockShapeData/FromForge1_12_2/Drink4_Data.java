package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Drink4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 6, 15, 16, 7),
		Block.createCuboidShape(1, 0, 15, 15, 16, 16),
		Block.createCuboidShape(15, 0, 6, 16, 16, 16),
		Block.createCuboidShape(0, 0, 6, 1, 16, 16),
		Block.createCuboidShape(7, 1, 7, 9, 16, 15),
		Block.createCuboidShape(0, 0, 7, 16, 2, 15),
		Block.createCuboidShape(1, 8, 7, 15, 10, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 0, 1, 10, 16, 15),
		Block.createCuboidShape(0, 0, 1, 1, 16, 15),
		Block.createCuboidShape(0, 0, 15, 10, 16, 16),
		Block.createCuboidShape(0, 0, 0, 10, 16, 1),
		Block.createCuboidShape(1, 1, 7, 9, 16, 9),
		Block.createCuboidShape(1, 0, 0, 9, 2, 16),
		Block.createCuboidShape(1, 8, 1, 9, 10, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 9, 15, 16, 10),
		Block.createCuboidShape(1, 0, 0, 15, 16, 1),
		Block.createCuboidShape(0, 0, 0, 1, 16, 10),
		Block.createCuboidShape(15, 0, 0, 16, 16, 10),
		Block.createCuboidShape(7, 1, 1, 9, 16, 9),
		Block.createCuboidShape(0, 0, 1, 16, 2, 9),
		Block.createCuboidShape(1, 8, 1, 15, 10, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 1, 7, 16, 15),
		Block.createCuboidShape(15, 0, 1, 16, 16, 15),
		Block.createCuboidShape(6, 0, 0, 16, 16, 1),
		Block.createCuboidShape(6, 0, 15, 16, 16, 16),
		Block.createCuboidShape(7, 1, 7, 15, 16, 9),
		Block.createCuboidShape(7, 0, 0, 15, 2, 16),
		Block.createCuboidShape(7, 8, 1, 15, 10, 15)
    );

    public Drink4_Data() {
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

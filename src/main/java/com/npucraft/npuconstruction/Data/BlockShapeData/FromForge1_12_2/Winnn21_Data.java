package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn21_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 7, 16, 1, 9),
		Block.createCuboidShape(0, 15, 7, 16, 16, 9),
		Block.createCuboidShape(1, 7, 7, 15, 9, 9),
		Block.createCuboidShape(0, 1, 7, 1, 15, 9),
		Block.createCuboidShape(15, 1, 7, 16, 15, 9),
		Block.createCuboidShape(1, 1, 7, 15, 15, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 0, 9, 1, 16),
		Block.createCuboidShape(7, 15, 0, 9, 16, 16),
		Block.createCuboidShape(7, 7, 1, 9, 9, 15),
		Block.createCuboidShape(7, 1, 0, 9, 15, 1),
		Block.createCuboidShape(7, 1, 15, 9, 15, 16),
		Block.createCuboidShape(7, 1, 1, 9, 15, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 7, 16, 1, 9),
		Block.createCuboidShape(0, 15, 7, 16, 16, 9),
		Block.createCuboidShape(1, 7, 7, 15, 9, 9),
		Block.createCuboidShape(15, 1, 7, 16, 15, 9),
		Block.createCuboidShape(0, 1, 7, 1, 15, 9),
		Block.createCuboidShape(1, 1, 7, 15, 15, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 0, 9, 1, 16),
		Block.createCuboidShape(7, 15, 0, 9, 16, 16),
		Block.createCuboidShape(7, 7, 1, 9, 9, 15),
		Block.createCuboidShape(7, 1, 15, 9, 15, 16),
		Block.createCuboidShape(7, 1, 0, 9, 15, 1),
		Block.createCuboidShape(7, 1, 1, 9, 15, 15)
    );

    public Winnn21_Data() {
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

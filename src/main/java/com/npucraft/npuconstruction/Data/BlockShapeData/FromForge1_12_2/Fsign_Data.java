package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 5, 16, -16, 11),
		Block.createCuboidShape(2, -13, 7, 14, 32, 9),
		Block.createCuboidShape(1, -16, 6, 2, 32, 10),
		Block.createCuboidShape(14, -16, 6, 15, 32, 10),
		Block.createCuboidShape(2, -14, 6, 14, -13, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -16, 0, 11, -16, 16),
		Block.createCuboidShape(7, -13, 2, 9, 32, 14),
		Block.createCuboidShape(6, -16, 1, 10, 32, 2),
		Block.createCuboidShape(6, -16, 14, 10, 32, 15),
		Block.createCuboidShape(6, -14, 2, 10, -13, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 5, 16, -16, 11),
		Block.createCuboidShape(2, -13, 7, 14, 32, 9),
		Block.createCuboidShape(14, -16, 6, 15, 32, 10),
		Block.createCuboidShape(1, -16, 6, 2, 32, 10),
		Block.createCuboidShape(2, -14, 6, 14, -13, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -16, 0, 11, -16, 16),
		Block.createCuboidShape(7, -13, 2, 9, 32, 14),
		Block.createCuboidShape(6, -16, 14, 10, 32, 15),
		Block.createCuboidShape(6, -16, 1, 10, 32, 2),
		Block.createCuboidShape(6, -14, 2, 10, -13, 14)
    );

    public Fsign_Data() {
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

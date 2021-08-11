package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, -16, 6, 15, -14, 10),
		Block.createCuboidShape(1, 15, 6, 15, 17, 10),
		Block.createCuboidShape(1, 31, 6, 15, 32, 10),
		Block.createCuboidShape(15, -16, 6, 16, 32, 10),
		Block.createCuboidShape(0, -16, 6, 1, 32, 10),
		Block.createCuboidShape(1, -15, 7, 2, 16, 9),
		Block.createCuboidShape(14, -15, 7, 15, 16, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 1, 10, -14, 15),
		Block.createCuboidShape(6, 15, 1, 10, 17, 15),
		Block.createCuboidShape(6, 31, 1, 10, 32, 15),
		Block.createCuboidShape(6, -16, 15, 10, 32, 16),
		Block.createCuboidShape(6, -16, 0, 10, 32, 1),
		Block.createCuboidShape(7, -15, 1, 9, 16, 2),
		Block.createCuboidShape(7, -15, 14, 9, 16, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -16, 6, 15, -14, 10),
		Block.createCuboidShape(1, 15, 6, 15, 17, 10),
		Block.createCuboidShape(1, 31, 6, 15, 32, 10),
		Block.createCuboidShape(0, -16, 6, 1, 32, 10),
		Block.createCuboidShape(15, -16, 6, 16, 32, 10),
		Block.createCuboidShape(14, -15, 7, 15, 16, 9),
		Block.createCuboidShape(1, -15, 7, 2, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 1, 10, -14, 15),
		Block.createCuboidShape(6, 15, 1, 10, 17, 15),
		Block.createCuboidShape(6, 31, 1, 10, 32, 15),
		Block.createCuboidShape(6, -16, 0, 10, 32, 1),
		Block.createCuboidShape(6, -16, 15, 10, 32, 16),
		Block.createCuboidShape(7, -15, 14, 9, 16, 15),
		Block.createCuboidShape(7, -15, 1, 9, 16, 2)
    );

    public Win7_Data() {
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

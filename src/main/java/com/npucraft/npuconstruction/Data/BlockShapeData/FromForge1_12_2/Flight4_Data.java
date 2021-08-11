package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Flight4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(5, 0, 0, 11, 16, 5),
		Block.createCuboidShape(5, 0, 11, 11, 16, 16),
		Block.createCuboidShape(5, 0, 0, 11, 1, 16),
		Block.createCuboidShape(5, 16, 0, 11, 16, 16),
		Block.createCuboidShape(6, 13, 0, 10, 13, 16),
		Block.createCuboidShape(6, 12, 6, 10, 12, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(11, 0, 5, 16, 16, 11),
		Block.createCuboidShape(0, 0, 5, 5, 16, 11),
		Block.createCuboidShape(0, 0, 5, 16, 1, 11),
		Block.createCuboidShape(0, 16, 5, 16, 16, 11),
		Block.createCuboidShape(0, 13, 6, 16, 13, 10),
		Block.createCuboidShape(6, 12, 6, 10, 12, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(5, 0, 11, 11, 16, 16),
		Block.createCuboidShape(5, 0, 0, 11, 16, 5),
		Block.createCuboidShape(5, 0, 0, 11, 1, 16),
		Block.createCuboidShape(5, 16, 0, 11, 16, 16),
		Block.createCuboidShape(6, 13, 0, 10, 13, 16),
		Block.createCuboidShape(6, 12, 6, 10, 12, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(0, 0, 5, 5, 16, 11),
		Block.createCuboidShape(11, 0, 5, 16, 16, 11),
		Block.createCuboidShape(0, 0, 5, 16, 1, 11),
		Block.createCuboidShape(0, 16, 5, 16, 16, 11),
		Block.createCuboidShape(0, 13, 6, 16, 13, 10),
		Block.createCuboidShape(6, 12, 6, 10, 12, 10)
    );

    public Flight4_Data() {
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

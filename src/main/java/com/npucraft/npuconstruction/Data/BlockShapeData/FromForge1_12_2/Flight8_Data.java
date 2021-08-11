package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Flight8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 16, 16, 16),
		Block.createCuboidShape(0, 13, 0, 0, 14, 16),
		Block.createCuboidShape(16, 13, 0, 16, 14, 16),
		Block.createCuboidShape(0, 13, 16, 16, 14, 16),
		Block.createCuboidShape(0, 13, 0, 16, 14, 0)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 16, 16, 16),
		Block.createCuboidShape(0, 13, 0, 16, 14, 0),
		Block.createCuboidShape(0, 13, 16, 16, 14, 16),
		Block.createCuboidShape(0, 13, 0, 0, 14, 16),
		Block.createCuboidShape(16, 13, 0, 16, 14, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 16, 16, 16),
		Block.createCuboidShape(16, 13, 0, 16, 14, 16),
		Block.createCuboidShape(0, 13, 0, 0, 14, 16),
		Block.createCuboidShape(0, 13, 0, 16, 14, 0),
		Block.createCuboidShape(0, 13, 16, 16, 14, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 16, 16, 16),
		Block.createCuboidShape(0, 13, 16, 16, 14, 16),
		Block.createCuboidShape(0, 13, 0, 16, 14, 0),
		Block.createCuboidShape(16, 13, 0, 16, 14, 16),
		Block.createCuboidShape(0, 13, 0, 0, 14, 16)
    );

    public Flight8_Data() {
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

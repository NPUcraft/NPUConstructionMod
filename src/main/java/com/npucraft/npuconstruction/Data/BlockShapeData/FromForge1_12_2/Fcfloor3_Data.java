package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcfloor3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -16, 16, 6, 32),
		Block.createCuboidShape(0, 12, -13, 16, 14, 32),
		Block.createCuboidShape(0, 2, 0, 16, 12, 16),
		Block.createCuboidShape(0, 4, 16, 16, 12, 32),
		Block.createCuboidShape(0, 14, 11, 16, 16, 32),
		Block.createCuboidShape(0, 6, -16, 16, 9, 16),
		Block.createCuboidShape(0, 9, -16, 16, 12, 0)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 0, 32, 6, 16),
		Block.createCuboidShape(-16, 12, 0, 29, 14, 16),
		Block.createCuboidShape(0, 2, 0, 16, 12, 16),
		Block.createCuboidShape(-16, 4, 0, 0, 12, 16),
		Block.createCuboidShape(-16, 14, 0, 5, 16, 16),
		Block.createCuboidShape(0, 6, 0, 32, 9, 16),
		Block.createCuboidShape(16, 9, 0, 32, 12, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -16, 16, 6, 32),
		Block.createCuboidShape(0, 12, -16, 16, 14, 29),
		Block.createCuboidShape(0, 2, 0, 16, 12, 16),
		Block.createCuboidShape(0, 4, -16, 16, 12, 0),
		Block.createCuboidShape(0, 14, -16, 16, 16, 5),
		Block.createCuboidShape(0, 6, 0, 16, 9, 32),
		Block.createCuboidShape(0, 9, 16, 16, 12, 32)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 0, 32, 6, 16),
		Block.createCuboidShape(-13, 12, 0, 32, 14, 16),
		Block.createCuboidShape(0, 2, 0, 16, 12, 16),
		Block.createCuboidShape(16, 4, 0, 32, 12, 16),
		Block.createCuboidShape(11, 14, 0, 32, 16, 16),
		Block.createCuboidShape(-16, 6, 0, 16, 9, 16),
		Block.createCuboidShape(-16, 9, 0, 0, 12, 16)
    );

    public Fcfloor3_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Obsidianframe_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1)
    );

    public Obsidianframe_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 19, 7, 16, 20, 9),
		Block.createCuboidShape(-15, 14, 7, 15, 15, 9),
		Block.createCuboidShape(-15, 9, 7, 15, 10, 9),
		Block.createCuboidShape(-15, 4, 7, 15, 5, 9),
		Block.createCuboidShape(15, 0, 7, 16, 16, 9),
		Block.createCuboidShape(-16, 0, 7, -15, 16, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 19, -16, 9, 20, 16),
		Block.createCuboidShape(7, 14, -15, 9, 15, 15),
		Block.createCuboidShape(7, 9, -15, 9, 10, 15),
		Block.createCuboidShape(7, 4, -15, 9, 5, 15),
		Block.createCuboidShape(7, 0, 15, 9, 16, 16),
		Block.createCuboidShape(7, 0, -16, 9, 16, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 19, 7, 32, 20, 9),
		Block.createCuboidShape(1, 14, 7, 31, 15, 9),
		Block.createCuboidShape(1, 9, 7, 31, 10, 9),
		Block.createCuboidShape(1, 4, 7, 31, 5, 9),
		Block.createCuboidShape(0, 0, 7, 1, 16, 9),
		Block.createCuboidShape(31, 0, 7, 32, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 19, 0, 9, 20, 32),
		Block.createCuboidShape(7, 14, 1, 9, 15, 31),
		Block.createCuboidShape(7, 9, 1, 9, 10, 31),
		Block.createCuboidShape(7, 4, 1, 9, 5, 31),
		Block.createCuboidShape(7, 0, 0, 9, 16, 1),
		Block.createCuboidShape(7, 0, 31, 9, 16, 32)
    );

    public Fence4_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn14_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 1, 7, 31, 31, 9),
		Block.createCuboidShape(-16, 0, 7, 32, 1, 9),
		Block.createCuboidShape(-16, 31, 7, 32, 32, 9),
		Block.createCuboidShape(-15, 1, 7, 7, 16, 9),
		Block.createCuboidShape(-16, 1, 7, -15, 31, 9),
		Block.createCuboidShape(31, 1, 7, 32, 31, 9),
		Block.createCuboidShape(7, 1, 7, 9, 31, 9),
		Block.createCuboidShape(-15, 16, 7, 0, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, 0, 9, 31, 31),
		Block.createCuboidShape(7, 0, -16, 9, 1, 32),
		Block.createCuboidShape(7, 31, -16, 9, 32, 32),
		Block.createCuboidShape(7, 1, -15, 9, 16, 7),
		Block.createCuboidShape(7, 1, -16, 9, 31, -15),
		Block.createCuboidShape(7, 1, 31, 9, 31, 32),
		Block.createCuboidShape(7, 1, 7, 9, 31, 9),
		Block.createCuboidShape(7, 16, -15, 9, 31, 0)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 1, 7, 16, 31, 9),
		Block.createCuboidShape(-16, 0, 7, 32, 1, 9),
		Block.createCuboidShape(-16, 31, 7, 32, 32, 9),
		Block.createCuboidShape(9, 1, 7, 31, 16, 9),
		Block.createCuboidShape(31, 1, 7, 32, 31, 9),
		Block.createCuboidShape(-16, 1, 7, -15, 31, 9),
		Block.createCuboidShape(7, 1, 7, 9, 31, 9),
		Block.createCuboidShape(16, 16, 7, 31, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, -15, 9, 31, 16),
		Block.createCuboidShape(7, 0, -16, 9, 1, 32),
		Block.createCuboidShape(7, 31, -16, 9, 32, 32),
		Block.createCuboidShape(7, 1, 9, 9, 16, 31),
		Block.createCuboidShape(7, 1, 31, 9, 31, 32),
		Block.createCuboidShape(7, 1, -16, 9, 31, -15),
		Block.createCuboidShape(7, 1, 7, 9, 31, 9),
		Block.createCuboidShape(7, 16, 16, 9, 31, 31)
    );

    public Winn14_Data() {
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

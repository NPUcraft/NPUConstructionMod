package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -16, 0, -6, 32, 16),
		Block.createCuboidShape(22, -16, 0, 32, 32, 16),
		Block.createCuboidShape(-6, -16, 6, -5, 32, 10),
		Block.createCuboidShape(21, -16, 6, 22, 32, 10),
		Block.createCuboidShape(20, -16, 7, 21, 32, 9),
		Block.createCuboidShape(-4, 31, 7, 20, 32, 9),
		Block.createCuboidShape(-5, -16, 7, -4, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, -16, 16, 32, -6),
		Block.createCuboidShape(0, -16, 22, 16, 32, 32),
		Block.createCuboidShape(6, -16, -6, 10, 32, -5),
		Block.createCuboidShape(6, -16, 21, 10, 32, 22),
		Block.createCuboidShape(7, -16, 20, 9, 32, 21),
		Block.createCuboidShape(7, 31, -4, 9, 32, 20),
		Block.createCuboidShape(7, -16, -5, 9, 32, -4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(22, -16, 0, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 0, -6, 32, 16),
		Block.createCuboidShape(21, -16, 6, 22, 32, 10),
		Block.createCuboidShape(-6, -16, 6, -5, 32, 10),
		Block.createCuboidShape(-5, -16, 7, -4, 32, 9),
		Block.createCuboidShape(-4, 31, 7, 20, 32, 9),
		Block.createCuboidShape(20, -16, 7, 21, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 22, 16, 32, 32),
		Block.createCuboidShape(0, -16, -16, 16, 32, -6),
		Block.createCuboidShape(6, -16, 21, 10, 32, 22),
		Block.createCuboidShape(6, -16, -6, 10, 32, -5),
		Block.createCuboidShape(7, -16, -5, 9, 32, -4),
		Block.createCuboidShape(7, 31, -4, 9, 32, 20),
		Block.createCuboidShape(7, -16, 20, 9, 32, 21)
    );

    public Door5_Data() {
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

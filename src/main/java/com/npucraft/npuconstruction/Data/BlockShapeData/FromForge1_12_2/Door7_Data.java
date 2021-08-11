package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 2, 5, 2, 17, 6),
		Block.createCuboidShape(-2, 2, 10, 2, 17, 11),
		Block.createCuboidShape(-16, -16, -1, -15, 30, 17),
		Block.createCuboidShape(-16, 30, -1, 16, 32, 17),
		Block.createCuboidShape(15, -16, -1, 16, 30, 17),
		Block.createCuboidShape(-16, -16, 7, 16, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 2, -2, 11, 17, 2),
		Block.createCuboidShape(5, 2, -2, 6, 17, 2),
		Block.createCuboidShape(-1, -16, -16, 17, 30, -15),
		Block.createCuboidShape(-1, 30, -16, 17, 32, 16),
		Block.createCuboidShape(-1, -16, 15, 17, 30, 16),
		Block.createCuboidShape(7, -16, -16, 9, 31, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(14, 2, 10, 18, 17, 11),
		Block.createCuboidShape(14, 2, 5, 18, 17, 6),
		Block.createCuboidShape(31, -16, -1, 32, 30, 17),
		Block.createCuboidShape(0, 30, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 1, 30, 17),
		Block.createCuboidShape(0, -16, 7, 32, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 14, 6, 17, 18),
		Block.createCuboidShape(10, 2, 14, 11, 17, 18),
		Block.createCuboidShape(-1, -16, 31, 17, 30, 32),
		Block.createCuboidShape(-1, 30, 0, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 30, 1),
		Block.createCuboidShape(7, -16, 0, 9, 31, 32)
    );

    public Door7_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(15, -16, 7, 16, 4, 9),
		Block.createCuboidShape(-7, 3, 7, 17, 4, 9),
		Block.createCuboidShape(0, -1, 7, 1, 16, 9),
		Block.createCuboidShape(-6, -2, 7, 15, -1, 9),
		Block.createCuboidShape(-6, -7, 7, 15, -6, 9),
		Block.createCuboidShape(-6, -12, 7, 15, -11, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 15, 9, 4, 16),
		Block.createCuboidShape(7, 3, -7, 9, 4, 17),
		Block.createCuboidShape(7, -1, 0, 9, 16, 1),
		Block.createCuboidShape(7, -2, -6, 9, -1, 15),
		Block.createCuboidShape(7, -7, -6, 9, -6, 15),
		Block.createCuboidShape(7, -12, -6, 9, -11, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 7, 1, 4, 9),
		Block.createCuboidShape(-1, 3, 7, 23, 4, 9),
		Block.createCuboidShape(15, -1, 7, 16, 16, 9),
		Block.createCuboidShape(1, -2, 7, 22, -1, 9),
		Block.createCuboidShape(1, -7, 7, 22, -6, 9),
		Block.createCuboidShape(1, -12, 7, 22, -11, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 0, 9, 4, 1),
		Block.createCuboidShape(7, 3, -1, 9, 4, 23),
		Block.createCuboidShape(7, -1, 15, 9, 16, 16),
		Block.createCuboidShape(7, -2, 1, 9, -1, 22),
		Block.createCuboidShape(7, -7, 1, 9, -6, 22),
		Block.createCuboidShape(7, -12, 1, 9, -11, 22)
    );

    public Fence6_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwindow5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, -15, 16, 9, 31, 17),
		Block.createCuboidShape(0, -16, 16, 10, -15, 17),
		Block.createCuboidShape(0, 31, 16, 10, 32, 17),
		Block.createCuboidShape(0, -15, 16, 1, 31, 17),
		Block.createCuboidShape(9, -15, 16, 10, 31, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, -15, 1, 0, 31, 9),
		Block.createCuboidShape(-1, -16, 0, 0, -15, 10),
		Block.createCuboidShape(-1, 31, 0, 0, 32, 10),
		Block.createCuboidShape(-1, -15, 0, 0, 31, 1),
		Block.createCuboidShape(-1, -15, 9, 0, 31, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, -15, -1, 15, 31, 0),
		Block.createCuboidShape(6, -16, -1, 16, -15, 0),
		Block.createCuboidShape(6, 31, -1, 16, 32, 0),
		Block.createCuboidShape(15, -15, -1, 16, 31, 0),
		Block.createCuboidShape(6, -15, -1, 7, 31, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, -15, 7, 17, 31, 15),
		Block.createCuboidShape(16, -16, 6, 17, -15, 16),
		Block.createCuboidShape(16, 31, 6, 17, 32, 16),
		Block.createCuboidShape(16, -15, 15, 17, 31, 16),
		Block.createCuboidShape(16, -15, 6, 17, 31, 7)
    );

    public Fwindow5_Data() {
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

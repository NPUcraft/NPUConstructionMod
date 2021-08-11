package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fext1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, -12, 16, 15, 5, 17),
		Block.createCuboidShape(0, -6, 16, 16, -2, 17),
		Block.createCuboidShape(2, -14, 16, 7, -6, 18),
		Block.createCuboidShape(0, -14, 16, 16, 20, 17),
		Block.createCuboidShape(0, 19, 16, 16, 20, 17),
		Block.createCuboidShape(0, -14, 16, 16, -13, 17),
		Block.createCuboidShape(15, -14, 16, 16, 20, 17),
		Block.createCuboidShape(0, -14, 16, 1, 20, 17),
		Block.createCuboidShape(0, 13, 16, 9, 15, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, -12, 10, 0, 5, 15),
		Block.createCuboidShape(-1, -6, 0, 0, -2, 16),
		Block.createCuboidShape(-2, -14, 2, 0, -6, 7),
		Block.createCuboidShape(-1, -14, 0, 0, 20, 16),
		Block.createCuboidShape(-1, 19, 0, 0, 20, 16),
		Block.createCuboidShape(-1, -14, 0, 0, -13, 16),
		Block.createCuboidShape(-1, -14, 15, 0, 20, 16),
		Block.createCuboidShape(-1, -14, 0, 0, 20, 1),
		Block.createCuboidShape(-1, 13, 0, 0, 15, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -12, -1, 6, 5, 0),
		Block.createCuboidShape(0, -6, -1, 16, -2, 0),
		Block.createCuboidShape(9, -14, -2, 14, -6, 0),
		Block.createCuboidShape(0, -14, -1, 16, 20, 0),
		Block.createCuboidShape(0, 19, -1, 16, 20, 0),
		Block.createCuboidShape(0, -14, -1, 16, -13, 0),
		Block.createCuboidShape(0, -14, -1, 1, 20, 0),
		Block.createCuboidShape(15, -14, -1, 16, 20, 0),
		Block.createCuboidShape(7, 13, -1, 16, 15, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, -12, 1, 17, 5, 6),
		Block.createCuboidShape(16, -6, 0, 17, -2, 16),
		Block.createCuboidShape(16, -14, 9, 18, -6, 14),
		Block.createCuboidShape(16, -14, 0, 17, 20, 16),
		Block.createCuboidShape(16, 19, 0, 17, 20, 16),
		Block.createCuboidShape(16, -14, 0, 17, -13, 16),
		Block.createCuboidShape(16, -14, 0, 17, 20, 1),
		Block.createCuboidShape(16, -14, 15, 17, 20, 16),
		Block.createCuboidShape(16, 13, 7, 17, 15, 16)
    );

    public Fext1_Data() {
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

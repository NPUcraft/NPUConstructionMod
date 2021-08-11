package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Alu_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, -1, 17, 5, 0),
		Block.createCuboidShape(0, 27, -1, 16, 31, 0),
		Block.createCuboidShape(-1, 0, 14, 17, 1, 15),
		Block.createCuboidShape(16, 10, 4, 17, 11, 10),
		Block.createCuboidShape(-1, 10, 4, 0, 11, 10),
		Block.createCuboidShape(0, 4, -1, 16, 27, -1),
		Block.createCuboidShape(16, 1, -1, 17, 31, 0),
		Block.createCuboidShape(-1, 1, -1, 0, 31, 0),
		Block.createCuboidShape(-1, 1, 14, 0, 19, 15),
		Block.createCuboidShape(16, 1, 14, 17, 19, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(16, 0, -1, 17, 5, 17),
		Block.createCuboidShape(16, 27, 0, 17, 31, 16),
		Block.createCuboidShape(1, 0, -1, 2, 1, 17),
		Block.createCuboidShape(6, 10, 16, 12, 11, 17),
		Block.createCuboidShape(6, 10, -1, 12, 11, 0),
		Block.createCuboidShape(17, 4, 0, 17, 27, 16),
		Block.createCuboidShape(16, 1, 16, 17, 31, 17),
		Block.createCuboidShape(16, 1, -1, 17, 31, 0),
		Block.createCuboidShape(1, 1, -1, 2, 19, 0),
		Block.createCuboidShape(1, 1, 16, 2, 19, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 16, 17, 5, 17),
		Block.createCuboidShape(0, 27, 16, 16, 31, 17),
		Block.createCuboidShape(-1, 0, 1, 17, 1, 2),
		Block.createCuboidShape(-1, 10, 6, 0, 11, 12),
		Block.createCuboidShape(16, 10, 6, 17, 11, 12),
		Block.createCuboidShape(0, 4, 17, 16, 27, 17),
		Block.createCuboidShape(-1, 1, 16, 0, 31, 17),
		Block.createCuboidShape(16, 1, 16, 17, 31, 17),
		Block.createCuboidShape(16, 1, 1, 17, 19, 2),
		Block.createCuboidShape(-1, 1, 1, 0, 19, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, -1, 0, 5, 17),
		Block.createCuboidShape(-1, 27, 0, 0, 31, 16),
		Block.createCuboidShape(14, 0, -1, 15, 1, 17),
		Block.createCuboidShape(4, 10, -1, 10, 11, 0),
		Block.createCuboidShape(4, 10, 16, 10, 11, 17),
		Block.createCuboidShape(-1, 4, 0, -1, 27, 16),
		Block.createCuboidShape(-1, 1, -1, 0, 31, 0),
		Block.createCuboidShape(-1, 1, 16, 0, 31, 17),
		Block.createCuboidShape(14, 1, 16, 15, 19, 17),
		Block.createCuboidShape(14, 1, -1, 15, 19, 0)
    );

    public Alu_Data() {
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

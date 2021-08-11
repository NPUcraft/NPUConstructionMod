package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Mesh_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 10, 1, 1, 15, 15),
		Block.createCuboidShape(1, 2, -1, 15, 9, 1),
		Block.createCuboidShape(1, 10, -1, 15, 15, 1),
		Block.createCuboidShape(1, 2, 15, 15, 9, 17),
		Block.createCuboidShape(1, 10, 15, 15, 15, 17),
		Block.createCuboidShape(-1, 2, 1, 1, 9, 15),
		Block.createCuboidShape(15, 2, 1, 17, 9, 15),
		Block.createCuboidShape(15, 10, 1, 17, 15, 15),
		Block.createCuboidShape(2, 2, 2, 14, 14, 14),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1),
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 10, -1, 15, 15, 1),
		Block.createCuboidShape(15, 2, 1, 17, 9, 15),
		Block.createCuboidShape(15, 10, 1, 17, 15, 15),
		Block.createCuboidShape(-1, 2, 1, 1, 9, 15),
		Block.createCuboidShape(-1, 10, 1, 1, 15, 15),
		Block.createCuboidShape(1, 2, -1, 15, 9, 1),
		Block.createCuboidShape(1, 2, 15, 15, 9, 17),
		Block.createCuboidShape(1, 10, 15, 15, 15, 17),
		Block.createCuboidShape(2, 2, 2, 14, 14, 14),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1),
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, 10, 1, 17, 15, 15),
		Block.createCuboidShape(1, 2, 15, 15, 9, 17),
		Block.createCuboidShape(1, 10, 15, 15, 15, 17),
		Block.createCuboidShape(1, 2, -1, 15, 9, 1),
		Block.createCuboidShape(1, 10, -1, 15, 15, 1),
		Block.createCuboidShape(15, 2, 1, 17, 9, 15),
		Block.createCuboidShape(-1, 2, 1, 1, 9, 15),
		Block.createCuboidShape(-1, 10, 1, 1, 15, 15),
		Block.createCuboidShape(2, 2, 2, 14, 14, 14),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16),
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 10, 15, 15, 15, 17),
		Block.createCuboidShape(-1, 2, 1, 1, 9, 15),
		Block.createCuboidShape(-1, 10, 1, 1, 15, 15),
		Block.createCuboidShape(15, 2, 1, 17, 9, 15),
		Block.createCuboidShape(15, 10, 1, 17, 15, 15),
		Block.createCuboidShape(1, 2, 15, 15, 9, 17),
		Block.createCuboidShape(1, 2, -1, 15, 9, 1),
		Block.createCuboidShape(1, 10, -1, 15, 15, 1),
		Block.createCuboidShape(2, 2, 2, 14, 14, 14),
		Block.createCuboidShape(0, 15, 0, 16, 16, 16),
		Block.createCuboidShape(0, 1, 15, 1, 15, 16),
		Block.createCuboidShape(0, 0, 0, 16, 1, 16),
		Block.createCuboidShape(15, 1, 15, 16, 15, 16),
		Block.createCuboidShape(0, 1, 0, 1, 15, 1),
		Block.createCuboidShape(15, 1, 0, 16, 15, 1)
    );

    public Mesh_Data() {
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

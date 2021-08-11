package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class N2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 16, 15, 21, 17),
		Block.createCuboidShape(0, 0, 15, 1, 21, 16),
		Block.createCuboidShape(15, 0, 15, 16, 21, 16),
		Block.createCuboidShape(0, 21, 15, 16, 22, 16),
		Block.createCuboidShape(0, -1, 15, 16, 0, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 1, 0, 21, 15),
		Block.createCuboidShape(0, 0, 0, 1, 21, 1),
		Block.createCuboidShape(0, 0, 15, 1, 21, 16),
		Block.createCuboidShape(0, 21, 0, 1, 22, 16),
		Block.createCuboidShape(0, -1, 0, 1, 0, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, -1, 15, 21, 0),
		Block.createCuboidShape(15, 0, 0, 16, 21, 1),
		Block.createCuboidShape(0, 0, 0, 1, 21, 1),
		Block.createCuboidShape(0, 21, 0, 16, 22, 1),
		Block.createCuboidShape(0, -1, 0, 16, 0, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 0, 1, 17, 21, 15),
		Block.createCuboidShape(15, 0, 15, 16, 21, 16),
		Block.createCuboidShape(15, 0, 0, 16, 21, 1),
		Block.createCuboidShape(15, 21, 0, 16, 22, 16),
		Block.createCuboidShape(15, -1, 0, 16, 0, 16)
    );

    public N2_Data() {
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

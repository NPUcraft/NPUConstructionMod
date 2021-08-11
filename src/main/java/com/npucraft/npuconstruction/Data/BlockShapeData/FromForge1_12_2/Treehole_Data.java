package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Treehole_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(16, 16, -4, 20, 17, 20),
		Block.createCuboidShape(-4, 16, -4, 0, 17, 20),
		Block.createCuboidShape(-7, 16, -7, 20, 17, -4),
		Block.createCuboidShape(-4, 16, 20, 23, 17, 23),
		Block.createCuboidShape(20, 16, -7, 23, 17, 20),
		Block.createCuboidShape(-7, 16, -4, -4, 17, 23),
		Block.createCuboidShape(0, 0, 0, 16, 16, 16),
		Block.createCuboidShape(0, 16, 16, 16, 17, 20),
		Block.createCuboidShape(0, 16, -4, 16, 17, 0)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-4, 16, 16, 20, 17, 20),
		Block.createCuboidShape(-4, 16, -4, 20, 17, 0),
		Block.createCuboidShape(20, 16, -7, 23, 17, 20),
		Block.createCuboidShape(-7, 16, -4, -4, 17, 23),
		Block.createCuboidShape(-4, 16, 20, 23, 17, 23),
		Block.createCuboidShape(-7, 16, -7, 20, 17, -4),
		Block.createCuboidShape(0, 0, 0, 16, 16, 16),
		Block.createCuboidShape(-4, 16, 0, 0, 17, 16),
		Block.createCuboidShape(16, 16, 0, 20, 17, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 16, -4, 0, 17, 20),
		Block.createCuboidShape(16, 16, -4, 20, 17, 20),
		Block.createCuboidShape(-4, 16, 20, 23, 17, 23),
		Block.createCuboidShape(-7, 16, -7, 20, 17, -4),
		Block.createCuboidShape(-7, 16, -4, -4, 17, 23),
		Block.createCuboidShape(20, 16, -7, 23, 17, 20),
		Block.createCuboidShape(0, 0, 0, 16, 16, 16),
		Block.createCuboidShape(0, 16, -4, 16, 17, 0),
		Block.createCuboidShape(0, 16, 16, 16, 17, 20)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-4, 16, -4, 20, 17, 0),
		Block.createCuboidShape(-4, 16, 16, 20, 17, 20),
		Block.createCuboidShape(-7, 16, -4, -4, 17, 23),
		Block.createCuboidShape(20, 16, -7, 23, 17, 20),
		Block.createCuboidShape(-7, 16, -7, 20, 17, -4),
		Block.createCuboidShape(-4, 16, 20, 23, 17, 23),
		Block.createCuboidShape(0, 0, 0, 16, 16, 16),
		Block.createCuboidShape(16, 16, 0, 20, 17, 16),
		Block.createCuboidShape(-4, 16, 0, 0, 17, 16)
    );

    public Treehole_Data() {
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

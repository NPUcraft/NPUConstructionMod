package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstool_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 8, 3, 24, 10, 13),
		Block.createCuboidShape(-4, 0, 4, 0, 8, 12),
		Block.createCuboidShape(16, 0, 4, 20, 8, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 8, -8, 13, 10, 24),
		Block.createCuboidShape(4, 0, -4, 12, 8, 0),
		Block.createCuboidShape(4, 0, 16, 12, 8, 20)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 8, 3, 24, 10, 13),
		Block.createCuboidShape(16, 0, 4, 20, 8, 12),
		Block.createCuboidShape(-4, 0, 4, 0, 8, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 8, -8, 13, 10, 24),
		Block.createCuboidShape(4, 0, 16, 12, 8, 20),
		Block.createCuboidShape(4, 0, -4, 12, 8, 0)
    );

    public Fstool_Data() {
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

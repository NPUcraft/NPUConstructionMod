package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg54_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 11, 1, 16, 13, 6),
		Block.createCuboidShape(4, 11, 10, 16, 13, 15),
		Block.createCuboidShape(0, 11, 0, 4, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 11, 4, 15, 13, 16),
		Block.createCuboidShape(1, 11, 4, 6, 13, 16),
		Block.createCuboidShape(0, 11, 0, 16, 16, 4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 10, 12, 13, 15),
		Block.createCuboidShape(0, 11, 1, 12, 13, 6),
		Block.createCuboidShape(12, 11, 0, 16, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 11, 0, 6, 13, 12),
		Block.createCuboidShape(10, 11, 0, 15, 13, 12),
		Block.createCuboidShape(0, 11, 12, 16, 16, 16)
    );

    public Fg54_Data() {
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

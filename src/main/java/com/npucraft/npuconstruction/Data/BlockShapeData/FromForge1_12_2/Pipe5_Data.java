package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Pipe5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(11, 0, 12, 15, 14, 16),
		Block.createCuboidShape(11, 7, 11, 15, 10, 13)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 11, 4, 14, 15),
		Block.createCuboidShape(3, 7, 11, 5, 10, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 0, 5, 14, 4),
		Block.createCuboidShape(1, 7, 3, 5, 10, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(12, 0, 1, 16, 14, 5),
		Block.createCuboidShape(11, 7, 1, 13, 10, 5)
    );

    public Pipe5_Data() {
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

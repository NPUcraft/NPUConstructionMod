package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Outsign_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 8, 14, 16, 9),
		Block.createCuboidShape(2, 0, 7, 14, 16, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 2, 8, 16, 14),
		Block.createCuboidShape(9, 0, 2, 9, 16, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 7, 14, 16, 8),
		Block.createCuboidShape(2, 0, 9, 14, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 0, 2, 9, 16, 14),
		Block.createCuboidShape(7, 0, 2, 7, 16, 14)
    );

    public Outsign_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sign1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 5, 16, 15, 12, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 5, 1, 0, 12, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 5, 0, 15, 12, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 5, 1, 16, 12, 15)
    );

    public Sign1_Data() {
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

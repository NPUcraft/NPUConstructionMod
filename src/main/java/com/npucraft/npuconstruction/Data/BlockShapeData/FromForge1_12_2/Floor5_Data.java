package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Floor5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 1, 15, 14, 15, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 1, 2, 1, 15, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 1, 0, 14, 15, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 1, 2, 16, 15, 14)
    );

    public Floor5_Data() {
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

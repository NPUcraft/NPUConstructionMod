package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sign3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 6, 16, 14, 11, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 2, 0, 11, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 6, 0, 14, 11, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 6, 2, 16, 11, 14)
    );

    public Sign3_Data() {
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

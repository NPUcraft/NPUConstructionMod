package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Center_airconditioner_bias_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 17, 16, 20, 23, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, 17, -4, 0, 23, 20)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 17, -1, 20, 23, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 17, -4, 17, 23, 20)
    );

    public Center_airconditioner_bias_Data() {
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

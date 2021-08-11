package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcamera1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 0, 10, 14, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 6, 16, 14, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 0, 10, 14, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 6, 16, 14, 10)
    );

    public Fcamera1_Data() {
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

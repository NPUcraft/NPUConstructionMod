package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 9, 16, -15, 16),
		Block.createCuboidShape(0, -15, 11, 16, 32, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 0, 7, -15, 16),
		Block.createCuboidShape(2, -15, 0, 5, 32, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 0, 16, -15, 7),
		Block.createCuboidShape(0, -15, 2, 16, 32, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, -16, 0, 16, -15, 16),
		Block.createCuboidShape(11, -15, 0, 14, 32, 16)
    );

    public Light9_Data() {
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

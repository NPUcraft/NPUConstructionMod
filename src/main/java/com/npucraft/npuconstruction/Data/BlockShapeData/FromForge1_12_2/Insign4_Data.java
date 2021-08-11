package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Insign4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-6, 0, 16, 5, 21, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -6, 0, 21, 5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(11, 0, 0, 22, 21, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 0, 11, 16, 21, 22)
    );

    public Insign4_Data() {
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

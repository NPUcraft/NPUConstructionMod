package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fvent1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 15, -4, 20, 16, 20)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-4, 15, -4, 20, 16, 20)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 15, -4, 20, 16, 20)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-4, 15, -4, 20, 16, 20)
    );

    public Fvent1_Data() {
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

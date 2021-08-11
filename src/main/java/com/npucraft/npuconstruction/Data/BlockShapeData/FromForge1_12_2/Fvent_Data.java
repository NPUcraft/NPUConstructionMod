package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fvent_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 1, 16, 20, 6, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, 1, -4, 0, 6, 20)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 1, -1, 20, 6, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 1, -4, 17, 6, 20)
    );

    public Fvent_Data() {
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

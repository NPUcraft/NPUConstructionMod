package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwell1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 0, -3, 19, 0, 19)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-3, 0, -3, 19, 0, 19)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 0, -3, 19, 0, 19)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-3, 0, -3, 19, 0, 19)
    );

    public Fwell1_Data() {
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

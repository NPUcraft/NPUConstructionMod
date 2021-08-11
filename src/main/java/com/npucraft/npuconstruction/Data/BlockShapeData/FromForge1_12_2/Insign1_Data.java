package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Insign1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -1, 15, 13, 15, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -1, 3, 1, 15, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, -1, 0, 13, 15, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, -1, 3, 16, 15, 13)
    );

    public Insign1_Data() {
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

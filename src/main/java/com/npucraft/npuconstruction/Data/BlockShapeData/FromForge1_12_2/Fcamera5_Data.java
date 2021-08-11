package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcamera5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 0, 10, 14, 6),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 11, 6, 16, 14, 10),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 10, 10, 14, 16),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 6, 6, 14, 10),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );

    public Fcamera5_Data() {
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

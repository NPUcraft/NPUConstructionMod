package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(9, 0, 7, 16, 7, 9),
		Block.createCuboidShape(7, 7, 7, 16, 8, 16),
		Block.createCuboidShape(7, 0, 9, 9, 7, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 9, 9, 7, 16),
		Block.createCuboidShape(0, 7, 7, 9, 8, 16),
		Block.createCuboidShape(0, 0, 7, 7, 7, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 7, 7, 7, 9),
		Block.createCuboidShape(0, 7, 0, 9, 8, 9),
		Block.createCuboidShape(7, 0, 0, 9, 7, 7)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 0, 9, 7, 7),
		Block.createCuboidShape(7, 7, 0, 16, 8, 9),
		Block.createCuboidShape(9, 0, 7, 16, 7, 9)
    );

    public Fence2_Data() {
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

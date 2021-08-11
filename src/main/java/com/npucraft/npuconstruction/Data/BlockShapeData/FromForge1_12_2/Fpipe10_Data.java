package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 8, 14, 10, 16, 16),
		Block.createCuboidShape(8, 6, 14, 16, 10, 16),
		Block.createCuboidShape(7, 7, 16, 16, 16, 16),
		Block.createCuboidShape(7, 7, 13, 16, 16, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 8, 6, 2, 16, 10),
		Block.createCuboidShape(0, 6, 8, 2, 10, 16),
		Block.createCuboidShape(0, 7, 7, 0, 16, 16),
		Block.createCuboidShape(2, 7, 7, 3, 16, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 8, 0, 10, 16, 2),
		Block.createCuboidShape(0, 6, 0, 8, 10, 2),
		Block.createCuboidShape(0, 7, 0, 9, 16, 0),
		Block.createCuboidShape(0, 7, 2, 9, 16, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 8, 6, 16, 16, 10),
		Block.createCuboidShape(14, 6, 0, 16, 10, 8),
		Block.createCuboidShape(16, 7, 0, 16, 16, 9),
		Block.createCuboidShape(13, 7, 0, 14, 16, 9)
    );

    public Fpipe10_Data() {
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

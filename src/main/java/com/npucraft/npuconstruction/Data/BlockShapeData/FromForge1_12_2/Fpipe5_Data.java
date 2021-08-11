package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 7, 16, 16, 9, 16),
		Block.createCuboidShape(0, 7, 13, 16, 9, 14),
		Block.createCuboidShape(0, 6, 14, 16, 7, 16),
		Block.createCuboidShape(0, 9, 14, 16, 10, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 7, 0, 0, 9, 16),
		Block.createCuboidShape(2, 7, 0, 3, 9, 16),
		Block.createCuboidShape(0, 6, 0, 2, 7, 16),
		Block.createCuboidShape(0, 9, 0, 2, 10, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 7, 0, 16, 9, 0),
		Block.createCuboidShape(0, 7, 2, 16, 9, 3),
		Block.createCuboidShape(0, 6, 0, 16, 7, 2),
		Block.createCuboidShape(0, 9, 0, 16, 10, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 7, 0, 16, 9, 16),
		Block.createCuboidShape(13, 7, 0, 14, 9, 16),
		Block.createCuboidShape(14, 6, 0, 16, 7, 16),
		Block.createCuboidShape(14, 9, 0, 16, 10, 16)
    );

    public Fpipe5_Data() {
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

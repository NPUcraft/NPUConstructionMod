package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg81_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 0, 5, 16, 16),
		Block.createCuboidShape(5, 6, 11, 16, 16, 16),
		Block.createCuboidShape(5, 8, 0, 6, 10, 15),
		Block.createCuboidShape(10, 8, 0, 11, 10, 15),
		Block.createCuboidShape(14, 8, 0, 15, 10, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 0, 16, 16, 5),
		Block.createCuboidShape(0, 6, 5, 5, 16, 16),
		Block.createCuboidShape(1, 8, 5, 16, 10, 6),
		Block.createCuboidShape(1, 8, 10, 16, 10, 11),
		Block.createCuboidShape(1, 8, 14, 16, 10, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(11, 6, 0, 16, 16, 16),
		Block.createCuboidShape(0, 6, 0, 11, 16, 5),
		Block.createCuboidShape(10, 8, 1, 11, 10, 16),
		Block.createCuboidShape(5, 8, 1, 6, 10, 16),
		Block.createCuboidShape(1, 8, 1, 2, 10, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 11, 16, 16, 16),
		Block.createCuboidShape(11, 6, 0, 16, 16, 11),
		Block.createCuboidShape(0, 8, 10, 15, 10, 11),
		Block.createCuboidShape(0, 8, 5, 15, 10, 6),
		Block.createCuboidShape(0, 8, 1, 15, 10, 2)
    );

    public Fg81_Data() {
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

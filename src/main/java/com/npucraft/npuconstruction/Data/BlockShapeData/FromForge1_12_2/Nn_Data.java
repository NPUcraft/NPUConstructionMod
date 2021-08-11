package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Nn_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 16, 3, 13, 18, 13),
		Block.createCuboidShape(4, 0, 4, 12, 3, 12),
		Block.createCuboidShape(1, 16, 1, 15, 16, 15),
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(5, 11, 5, 11, 12, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 16, 3, 13, 18, 13),
		Block.createCuboidShape(4, 0, 4, 12, 3, 12),
		Block.createCuboidShape(1, 16, 1, 15, 16, 15),
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(5, 11, 5, 11, 12, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 16, 3, 13, 18, 13),
		Block.createCuboidShape(4, 0, 4, 12, 3, 12),
		Block.createCuboidShape(1, 16, 1, 15, 16, 15),
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(5, 11, 5, 11, 12, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 16, 3, 13, 18, 13),
		Block.createCuboidShape(4, 0, 4, 12, 3, 12),
		Block.createCuboidShape(1, 16, 1, 15, 16, 15),
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(5, 11, 5, 11, 12, 11)
    );

    public Nn_Data() {
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

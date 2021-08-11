package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Flight5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 9, 11, 11, 12, 16),
		Block.createCuboidShape(4, 9, 1, 6, 12, 11),
		Block.createCuboidShape(10, 9, 1, 12, 12, 11),
		Block.createCuboidShape(5, 9, 0, 11, 12, 2),
		Block.createCuboidShape(5, 9, 2, 11, 10, 10),
		Block.createCuboidShape(5, 12, 2, 11, 13, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 9, 5, 5, 12, 11),
		Block.createCuboidShape(5, 9, 4, 15, 12, 6),
		Block.createCuboidShape(5, 9, 10, 15, 12, 12),
		Block.createCuboidShape(14, 9, 5, 16, 12, 11),
		Block.createCuboidShape(6, 9, 5, 14, 10, 11),
		Block.createCuboidShape(5, 12, 5, 14, 13, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 9, 0, 11, 12, 5),
		Block.createCuboidShape(10, 9, 5, 12, 12, 15),
		Block.createCuboidShape(4, 9, 5, 6, 12, 15),
		Block.createCuboidShape(5, 9, 14, 11, 12, 16),
		Block.createCuboidShape(5, 9, 6, 11, 10, 14),
		Block.createCuboidShape(5, 12, 5, 11, 13, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(11, 9, 5, 16, 12, 11),
		Block.createCuboidShape(1, 9, 10, 11, 12, 12),
		Block.createCuboidShape(1, 9, 4, 11, 12, 6),
		Block.createCuboidShape(0, 9, 5, 2, 12, 11),
		Block.createCuboidShape(2, 9, 5, 10, 10, 11),
		Block.createCuboidShape(2, 12, 5, 11, 13, 11)
    );

    public Flight5_Data() {
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

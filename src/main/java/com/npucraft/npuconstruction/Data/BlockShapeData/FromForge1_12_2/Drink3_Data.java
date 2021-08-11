package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Drink3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 0, 7, 4, 16, 15),
		Block.createCuboidShape(12, 0, 7, 13, 16, 15),
		Block.createCuboidShape(4, 1, 14, 12, 16, 15),
		Block.createCuboidShape(4, 1, 7, 12, 16, 8),
		Block.createCuboidShape(3, 0, 7, 13, 2, 15),
		Block.createCuboidShape(4, 8, 8, 12, 10, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 3, 9, 16, 4),
		Block.createCuboidShape(1, 0, 12, 9, 16, 13),
		Block.createCuboidShape(1, 1, 4, 2, 16, 12),
		Block.createCuboidShape(8, 1, 4, 9, 16, 12),
		Block.createCuboidShape(1, 0, 3, 9, 2, 13),
		Block.createCuboidShape(2, 8, 4, 8, 10, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(12, 0, 1, 13, 16, 9),
		Block.createCuboidShape(3, 0, 1, 4, 16, 9),
		Block.createCuboidShape(4, 1, 1, 12, 16, 2),
		Block.createCuboidShape(4, 1, 8, 12, 16, 9),
		Block.createCuboidShape(3, 0, 1, 13, 2, 9),
		Block.createCuboidShape(4, 8, 2, 12, 10, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 12, 15, 16, 13),
		Block.createCuboidShape(7, 0, 3, 15, 16, 4),
		Block.createCuboidShape(14, 1, 4, 15, 16, 12),
		Block.createCuboidShape(7, 1, 4, 8, 16, 12),
		Block.createCuboidShape(7, 0, 3, 15, 2, 13),
		Block.createCuboidShape(8, 8, 4, 14, 10, 12)
    );

    public Drink3_Data() {
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

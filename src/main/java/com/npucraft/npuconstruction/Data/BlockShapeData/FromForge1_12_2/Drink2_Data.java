package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Drink2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 7, 7, 13, 8, 15),
		Block.createCuboidShape(4, 1, 7, 13, 8, 8),
		Block.createCuboidShape(3, 0, 7, 4, 8, 15),
		Block.createCuboidShape(12, 0, 7, 13, 8, 15),
		Block.createCuboidShape(3, 0, 7, 13, 2, 15),
		Block.createCuboidShape(4, 1, 15, 13, 4, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 7, 4, 9, 8, 13),
		Block.createCuboidShape(8, 1, 4, 9, 8, 13),
		Block.createCuboidShape(1, 0, 3, 9, 8, 4),
		Block.createCuboidShape(1, 0, 12, 9, 8, 13),
		Block.createCuboidShape(1, 0, 3, 9, 2, 13),
		Block.createCuboidShape(1, 1, 4, 1, 4, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 7, 1, 12, 8, 9),
		Block.createCuboidShape(3, 1, 8, 12, 8, 9),
		Block.createCuboidShape(12, 0, 1, 13, 8, 9),
		Block.createCuboidShape(3, 0, 1, 4, 8, 9),
		Block.createCuboidShape(3, 0, 1, 13, 2, 9),
		Block.createCuboidShape(3, 1, 1, 12, 4, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 7, 3, 15, 8, 12),
		Block.createCuboidShape(7, 1, 3, 8, 8, 12),
		Block.createCuboidShape(7, 0, 12, 15, 8, 13),
		Block.createCuboidShape(7, 0, 3, 15, 8, 4),
		Block.createCuboidShape(7, 0, 3, 15, 2, 13),
		Block.createCuboidShape(15, 1, 3, 15, 4, 12)
    );

    public Drink2_Data() {
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

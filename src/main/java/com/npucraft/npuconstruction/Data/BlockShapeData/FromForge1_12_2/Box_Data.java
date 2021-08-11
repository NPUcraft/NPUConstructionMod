package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Box_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 1, 8, 5, 7),
		Block.createCuboidShape(0, -1, 0, 6, 5, 2),
		Block.createCuboidShape(1, 0, 1, 5, 1, 7),
		Block.createCuboidShape(0, 0, 1, 1, 5, 7),
		Block.createCuboidShape(0, 0, 7, 6, 5, 8),
		Block.createCuboidShape(0, 5, 5, 6, 7, 6),
		Block.createCuboidShape(5, 0, 8, 14, 4, 14),
		Block.createCuboidShape(14, 0, 0, 16, 2, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 0, 5, 15, 5, 8),
		Block.createCuboidShape(14, -1, 0, 16, 5, 6),
		Block.createCuboidShape(9, 0, 1, 15, 1, 5),
		Block.createCuboidShape(9, 0, 0, 15, 5, 1),
		Block.createCuboidShape(8, 0, 0, 9, 5, 6),
		Block.createCuboidShape(10, 5, 0, 11, 7, 6),
		Block.createCuboidShape(2, 0, 5, 8, 4, 14),
		Block.createCuboidShape(8, 0, 14, 16, 2, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, 0, 9, 11, 5, 15),
		Block.createCuboidShape(10, -1, 14, 16, 5, 16),
		Block.createCuboidShape(11, 0, 9, 15, 1, 15),
		Block.createCuboidShape(15, 0, 9, 16, 5, 15),
		Block.createCuboidShape(10, 0, 8, 16, 5, 9),
		Block.createCuboidShape(10, 5, 10, 16, 7, 11),
		Block.createCuboidShape(2, 0, 2, 11, 4, 8),
		Block.createCuboidShape(0, 0, 8, 2, 2, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 8, 7, 5, 11),
		Block.createCuboidShape(0, -1, 10, 2, 5, 16),
		Block.createCuboidShape(1, 0, 11, 7, 1, 15),
		Block.createCuboidShape(1, 0, 15, 7, 5, 16),
		Block.createCuboidShape(7, 0, 10, 8, 5, 16),
		Block.createCuboidShape(5, 5, 10, 6, 7, 16),
		Block.createCuboidShape(8, 0, 2, 14, 4, 11),
		Block.createCuboidShape(0, 0, 0, 8, 2, 2)
    );

    public Box_Data() {
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

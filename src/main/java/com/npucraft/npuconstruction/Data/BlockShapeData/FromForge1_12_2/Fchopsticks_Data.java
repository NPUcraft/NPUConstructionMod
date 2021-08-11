package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fchopsticks_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 1, 2, 2, 15, 15),
		Block.createCuboidShape(14, 1, 2, 16, 15, 15),
		Block.createCuboidShape(0, 1, 2, 16, 15, 3),
		Block.createCuboidShape(7, 11, 4, 11, 13, 12),
		Block.createCuboidShape(2, 2, 13, 14, 15, 14),
		Block.createCuboidShape(0, 15, 3, 16, 15, 15),
		Block.createCuboidShape(0, 1, 14, 16, 15, 15),
		Block.createCuboidShape(0, 15, 14, 0, 27, 16),
		Block.createCuboidShape(16, 15, 14, 16, 27, 16),
		Block.createCuboidShape(2, 10, 9, 14, 13, 9),
		Block.createCuboidShape(4, 11, 4, 5, 13, 12),
		Block.createCuboidShape(2, 2, 3, 14, 3, 13),
		Block.createCuboidShape(2, 9, 3, 14, 10, 13),
		Block.createCuboidShape(0, 15, 15, 16, 16, 16),
		Block.createCuboidShape(0, 27, 15, 16, 27, 16),
		Block.createCuboidShape(0, 16, 16, 16, 27, 16),
		Block.createCuboidShape(2, 10, 4, 14, 13, 4)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 1, 0, 14, 15, 2),
		Block.createCuboidShape(1, 1, 14, 14, 15, 16),
		Block.createCuboidShape(13, 1, 0, 14, 15, 16),
		Block.createCuboidShape(4, 11, 7, 12, 13, 11),
		Block.createCuboidShape(2, 2, 2, 3, 15, 14),
		Block.createCuboidShape(1, 15, 0, 13, 15, 16),
		Block.createCuboidShape(1, 1, 0, 2, 15, 16),
		Block.createCuboidShape(0, 15, 0, 2, 27, 0),
		Block.createCuboidShape(0, 15, 16, 2, 27, 16),
		Block.createCuboidShape(7, 10, 2, 7, 13, 14),
		Block.createCuboidShape(4, 11, 4, 12, 13, 5),
		Block.createCuboidShape(3, 2, 2, 13, 3, 14),
		Block.createCuboidShape(3, 9, 2, 13, 10, 14),
		Block.createCuboidShape(0, 15, 0, 1, 16, 16),
		Block.createCuboidShape(0, 27, 0, 1, 27, 16),
		Block.createCuboidShape(0, 16, 0, 0, 27, 16),
		Block.createCuboidShape(12, 10, 2, 12, 13, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(14, 1, 1, 16, 15, 14),
		Block.createCuboidShape(0, 1, 1, 2, 15, 14),
		Block.createCuboidShape(0, 1, 13, 16, 15, 14),
		Block.createCuboidShape(5, 11, 4, 9, 13, 12),
		Block.createCuboidShape(2, 2, 2, 14, 15, 3),
		Block.createCuboidShape(0, 15, 1, 16, 15, 13),
		Block.createCuboidShape(0, 1, 1, 16, 15, 2),
		Block.createCuboidShape(16, 15, 0, 16, 27, 2),
		Block.createCuboidShape(0, 15, 0, 0, 27, 2),
		Block.createCuboidShape(2, 10, 7, 14, 13, 7),
		Block.createCuboidShape(11, 11, 4, 12, 13, 12),
		Block.createCuboidShape(2, 2, 3, 14, 3, 13),
		Block.createCuboidShape(2, 9, 3, 14, 10, 13),
		Block.createCuboidShape(0, 15, 0, 16, 16, 1),
		Block.createCuboidShape(0, 27, 0, 16, 27, 1),
		Block.createCuboidShape(0, 16, 0, 16, 27, 0),
		Block.createCuboidShape(2, 10, 12, 14, 13, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 1, 14, 15, 15, 16),
		Block.createCuboidShape(2, 1, 0, 15, 15, 2),
		Block.createCuboidShape(2, 1, 0, 3, 15, 16),
		Block.createCuboidShape(4, 11, 5, 12, 13, 9),
		Block.createCuboidShape(13, 2, 2, 14, 15, 14),
		Block.createCuboidShape(3, 15, 0, 15, 15, 16),
		Block.createCuboidShape(14, 1, 0, 15, 15, 16),
		Block.createCuboidShape(14, 15, 16, 16, 27, 16),
		Block.createCuboidShape(14, 15, 0, 16, 27, 0),
		Block.createCuboidShape(9, 10, 2, 9, 13, 14),
		Block.createCuboidShape(4, 11, 11, 12, 13, 12),
		Block.createCuboidShape(3, 2, 2, 13, 3, 14),
		Block.createCuboidShape(3, 9, 2, 13, 10, 14),
		Block.createCuboidShape(15, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 27, 0, 16, 27, 16),
		Block.createCuboidShape(16, 16, 0, 16, 27, 16),
		Block.createCuboidShape(4, 10, 2, 4, 13, 14)
    );

    public Fchopsticks_Data() {
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

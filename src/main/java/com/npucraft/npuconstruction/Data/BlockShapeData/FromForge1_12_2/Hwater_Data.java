package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Hwater_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 3, 2, 8, 15),
		Block.createCuboidShape(14, 0, 3, 15, 8, 15),
		Block.createCuboidShape(3, 13, 9, 13, 30, 16),
		Block.createCuboidShape(1, 0, 3, 14, 6, 5),
		Block.createCuboidShape(13, 12, 9, 15, 30, 16),
		Block.createCuboidShape(1, 12, 9, 3, 30, 16),
		Block.createCuboidShape(1, 7, 9, 15, 13, 10),
		Block.createCuboidShape(1, 6, 3, 15, 7, 10),
		Block.createCuboidShape(1, 1, 15, 15, 2, 16),
		Block.createCuboidShape(1, 2, 15, 2, 12, 16),
		Block.createCuboidShape(14, 2, 15, 15, 12, 16),
		Block.createCuboidShape(1, 12, 15, 15, 13, 16),
		Block.createCuboidShape(5, 3, 7, 6, 4, 16),
		Block.createCuboidShape(1, 7, 3, 15, 8, 4),
		Block.createCuboidShape(1, 30, 10, 15, 31, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 1, 13, 8, 2),
		Block.createCuboidShape(1, 0, 14, 13, 8, 15),
		Block.createCuboidShape(0, 13, 3, 7, 30, 13),
		Block.createCuboidShape(11, 0, 1, 13, 6, 14),
		Block.createCuboidShape(0, 12, 13, 7, 30, 15),
		Block.createCuboidShape(0, 12, 1, 7, 30, 3),
		Block.createCuboidShape(6, 7, 1, 7, 13, 15),
		Block.createCuboidShape(6, 6, 1, 13, 7, 15),
		Block.createCuboidShape(0, 1, 1, 1, 2, 15),
		Block.createCuboidShape(0, 2, 1, 1, 12, 2),
		Block.createCuboidShape(0, 2, 14, 1, 12, 15),
		Block.createCuboidShape(0, 12, 1, 1, 13, 15),
		Block.createCuboidShape(0, 3, 5, 9, 4, 6),
		Block.createCuboidShape(12, 7, 1, 13, 8, 15),
		Block.createCuboidShape(0, 30, 1, 6, 31, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(14, 0, 1, 15, 8, 13),
		Block.createCuboidShape(1, 0, 1, 2, 8, 13),
		Block.createCuboidShape(3, 13, 0, 13, 30, 7),
		Block.createCuboidShape(2, 0, 11, 15, 6, 13),
		Block.createCuboidShape(1, 12, 0, 3, 30, 7),
		Block.createCuboidShape(13, 12, 0, 15, 30, 7),
		Block.createCuboidShape(1, 7, 6, 15, 13, 7),
		Block.createCuboidShape(1, 6, 6, 15, 7, 13),
		Block.createCuboidShape(1, 1, 0, 15, 2, 1),
		Block.createCuboidShape(14, 2, 0, 15, 12, 1),
		Block.createCuboidShape(1, 2, 0, 2, 12, 1),
		Block.createCuboidShape(1, 12, 0, 15, 13, 1),
		Block.createCuboidShape(10, 3, 0, 11, 4, 9),
		Block.createCuboidShape(1, 7, 12, 15, 8, 13),
		Block.createCuboidShape(1, 30, 0, 15, 31, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 0, 14, 15, 8, 15),
		Block.createCuboidShape(3, 0, 1, 15, 8, 2),
		Block.createCuboidShape(9, 13, 3, 16, 30, 13),
		Block.createCuboidShape(3, 0, 2, 5, 6, 15),
		Block.createCuboidShape(9, 12, 1, 16, 30, 3),
		Block.createCuboidShape(9, 12, 13, 16, 30, 15),
		Block.createCuboidShape(9, 7, 1, 10, 13, 15),
		Block.createCuboidShape(3, 6, 1, 10, 7, 15),
		Block.createCuboidShape(15, 1, 1, 16, 2, 15),
		Block.createCuboidShape(15, 2, 14, 16, 12, 15),
		Block.createCuboidShape(15, 2, 1, 16, 12, 2),
		Block.createCuboidShape(15, 12, 1, 16, 13, 15),
		Block.createCuboidShape(7, 3, 10, 16, 4, 11),
		Block.createCuboidShape(3, 7, 1, 4, 8, 15),
		Block.createCuboidShape(10, 30, 1, 16, 31, 15)
    );

    public Hwater_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bike2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(21, 14, 4, 27, 17, 12),
		Block.createCuboidShape(0, 0, 5, 1, 14, 10),
		Block.createCuboidShape(0, 4, 9, 13, 10, 11),
		Block.createCuboidShape(10, 1, 5, 12, 20, 9),
		Block.createCuboidShape(-6, 5, 6, 12, 6, 10),
		Block.createCuboidShape(11, 5, 6, 25, 7, 10),
		Block.createCuboidShape(23, 6, 6, 24, 15, 10),
		Block.createCuboidShape(20, 22, 1, 21, 23, 15),
		Block.createCuboidShape(20, 15, 7, 21, 20, 9),
		Block.createCuboidShape(3, 18, 7, 9, 20, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 21, 12, 17, 27),
		Block.createCuboidShape(6, 0, 0, 11, 14, 1),
		Block.createCuboidShape(5, 4, 0, 7, 10, 13),
		Block.createCuboidShape(7, 1, 10, 11, 20, 12),
		Block.createCuboidShape(6, 5, -6, 10, 6, 12),
		Block.createCuboidShape(6, 5, 11, 10, 7, 25),
		Block.createCuboidShape(6, 6, 23, 10, 15, 24),
		Block.createCuboidShape(1, 22, 20, 15, 23, 21),
		Block.createCuboidShape(7, 15, 20, 9, 20, 21),
		Block.createCuboidShape(7, 18, 3, 9, 20, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 14, 4, -5, 17, 12),
		Block.createCuboidShape(15, 0, 6, 16, 14, 11),
		Block.createCuboidShape(3, 4, 5, 16, 10, 7),
		Block.createCuboidShape(4, 1, 7, 6, 20, 11),
		Block.createCuboidShape(4, 5, 6, 22, 6, 10),
		Block.createCuboidShape(-9, 5, 6, 5, 7, 10),
		Block.createCuboidShape(-8, 6, 6, -7, 15, 10),
		Block.createCuboidShape(-5, 22, 1, -4, 23, 15),
		Block.createCuboidShape(-5, 15, 7, -4, 20, 9),
		Block.createCuboidShape(7, 18, 7, 13, 20, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, -11, 12, 17, -5),
		Block.createCuboidShape(5, 0, 15, 10, 14, 16),
		Block.createCuboidShape(9, 4, 3, 11, 10, 16),
		Block.createCuboidShape(5, 1, 4, 9, 20, 6),
		Block.createCuboidShape(6, 5, 4, 10, 6, 22),
		Block.createCuboidShape(6, 5, -9, 10, 7, 5),
		Block.createCuboidShape(6, 6, -8, 10, 15, -7),
		Block.createCuboidShape(1, 22, -5, 15, 23, -4),
		Block.createCuboidShape(7, 15, -5, 9, 20, -4),
		Block.createCuboidShape(7, 18, 7, 9, 20, 13)
    );

    public Bike2_Data() {
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

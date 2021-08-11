package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bike1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(22, 14, 4, 28, 17, 12),
		Block.createCuboidShape(1, 0, 5, 2, 14, 10),
		Block.createCuboidShape(1, 4, 9, 14, 10, 11),
		Block.createCuboidShape(11, 1, 5, 13, 20, 9),
		Block.createCuboidShape(-5, 5, 6, 13, 6, 10),
		Block.createCuboidShape(12, 5, 6, 26, 7, 10),
		Block.createCuboidShape(24, 6, 6, 25, 15, 10),
		Block.createCuboidShape(21, 22, 1, 22, 23, 15),
		Block.createCuboidShape(21, 15, 7, 22, 20, 9),
		Block.createCuboidShape(4, 18, 7, 10, 20, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 22, 12, 17, 28),
		Block.createCuboidShape(6, 0, 1, 11, 14, 2),
		Block.createCuboidShape(5, 4, 1, 7, 10, 14),
		Block.createCuboidShape(7, 1, 11, 11, 20, 13),
		Block.createCuboidShape(6, 5, -5, 10, 6, 13),
		Block.createCuboidShape(6, 5, 12, 10, 7, 26),
		Block.createCuboidShape(6, 6, 24, 10, 15, 25),
		Block.createCuboidShape(1, 22, 21, 15, 23, 22),
		Block.createCuboidShape(7, 15, 21, 9, 20, 22),
		Block.createCuboidShape(7, 18, 4, 9, 20, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 14, 4, -6, 17, 12),
		Block.createCuboidShape(14, 0, 6, 15, 14, 11),
		Block.createCuboidShape(2, 4, 5, 15, 10, 7),
		Block.createCuboidShape(3, 1, 7, 5, 20, 11),
		Block.createCuboidShape(3, 5, 6, 21, 6, 10),
		Block.createCuboidShape(-10, 5, 6, 4, 7, 10),
		Block.createCuboidShape(-9, 6, 6, -8, 15, 10),
		Block.createCuboidShape(-6, 22, 1, -5, 23, 15),
		Block.createCuboidShape(-6, 15, 7, -5, 20, 9),
		Block.createCuboidShape(6, 18, 7, 12, 20, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, -12, 12, 17, -6),
		Block.createCuboidShape(5, 0, 14, 10, 14, 15),
		Block.createCuboidShape(9, 4, 2, 11, 10, 15),
		Block.createCuboidShape(5, 1, 3, 9, 20, 5),
		Block.createCuboidShape(6, 5, 3, 10, 6, 21),
		Block.createCuboidShape(6, 5, -10, 10, 7, 4),
		Block.createCuboidShape(6, 6, -9, 10, 15, -8),
		Block.createCuboidShape(1, 22, -6, 15, 23, -5),
		Block.createCuboidShape(7, 15, -6, 9, 20, -5),
		Block.createCuboidShape(7, 18, 6, 9, 20, 12)
    );

    public Bike1_Data() {
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

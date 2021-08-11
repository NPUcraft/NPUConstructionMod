package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Mirror_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-9, -7, 7, 9, 31, 9),
		Block.createCuboidShape(12, -15, 1, 13, -14, 15),
		Block.createCuboidShape(12, -14, 7, 13, 25, 9),
		Block.createCuboidShape(-12, -14, 7, 12, -10, 9),
		Block.createCuboidShape(12, -14, 2, 13, -7, 3),
		Block.createCuboidShape(12, -14, 13, 13, -7, 14),
		Block.createCuboidShape(9, -7, 7, 10, 32, 9),
		Block.createCuboidShape(-9, 31, 7, 9, 32, 9),
		Block.createCuboidShape(-9, 23, 7, 9, 24, 9),
		Block.createCuboidShape(-10, -8, 7, 10, -7, 9),
		Block.createCuboidShape(-13, -14, 7, -12, 25, 9),
		Block.createCuboidShape(-13, -15, 1, -12, -14, 15),
		Block.createCuboidShape(-13, -14, 2, -12, -7, 3),
		Block.createCuboidShape(-13, -14, 13, -12, -7, 14),
		Block.createCuboidShape(-10, -7, 7, -9, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, -7, -9, 9, 31, 9),
		Block.createCuboidShape(1, -15, 12, 15, -14, 13),
		Block.createCuboidShape(7, -14, 12, 9, 25, 13),
		Block.createCuboidShape(7, -14, -12, 9, -10, 12),
		Block.createCuboidShape(13, -14, 12, 14, -7, 13),
		Block.createCuboidShape(2, -14, 12, 3, -7, 13),
		Block.createCuboidShape(7, -7, 9, 9, 32, 10),
		Block.createCuboidShape(7, 31, -9, 9, 32, 9),
		Block.createCuboidShape(7, 23, -9, 9, 24, 9),
		Block.createCuboidShape(7, -8, -10, 9, -7, 10),
		Block.createCuboidShape(7, -14, -13, 9, 25, -12),
		Block.createCuboidShape(1, -15, -13, 15, -14, -12),
		Block.createCuboidShape(13, -14, -13, 14, -7, -12),
		Block.createCuboidShape(2, -14, -13, 3, -7, -12),
		Block.createCuboidShape(7, -7, -10, 9, 32, -9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, -7, 7, 25, 31, 9),
		Block.createCuboidShape(3, -15, 1, 4, -14, 15),
		Block.createCuboidShape(3, -14, 7, 4, 25, 9),
		Block.createCuboidShape(4, -14, 7, 28, -10, 9),
		Block.createCuboidShape(3, -14, 13, 4, -7, 14),
		Block.createCuboidShape(3, -14, 2, 4, -7, 3),
		Block.createCuboidShape(6, -7, 7, 7, 32, 9),
		Block.createCuboidShape(7, 31, 7, 25, 32, 9),
		Block.createCuboidShape(7, 23, 7, 25, 24, 9),
		Block.createCuboidShape(6, -8, 7, 26, -7, 9),
		Block.createCuboidShape(28, -14, 7, 29, 25, 9),
		Block.createCuboidShape(28, -15, 1, 29, -14, 15),
		Block.createCuboidShape(28, -14, 13, 29, -7, 14),
		Block.createCuboidShape(28, -14, 2, 29, -7, 3),
		Block.createCuboidShape(25, -7, 7, 26, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -7, 7, 9, 31, 25),
		Block.createCuboidShape(1, -15, 3, 15, -14, 4),
		Block.createCuboidShape(7, -14, 3, 9, 25, 4),
		Block.createCuboidShape(7, -14, 4, 9, -10, 28),
		Block.createCuboidShape(2, -14, 3, 3, -7, 4),
		Block.createCuboidShape(13, -14, 3, 14, -7, 4),
		Block.createCuboidShape(7, -7, 6, 9, 32, 7),
		Block.createCuboidShape(7, 31, 7, 9, 32, 25),
		Block.createCuboidShape(7, 23, 7, 9, 24, 25),
		Block.createCuboidShape(7, -8, 6, 9, -7, 26),
		Block.createCuboidShape(7, -14, 28, 9, 25, 29),
		Block.createCuboidShape(1, -15, 28, 15, -14, 29),
		Block.createCuboidShape(2, -14, 28, 3, -7, 29),
		Block.createCuboidShape(13, -14, 28, 14, -7, 29),
		Block.createCuboidShape(7, -7, 25, 9, 32, 26)
    );

    public Mirror_Data() {
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

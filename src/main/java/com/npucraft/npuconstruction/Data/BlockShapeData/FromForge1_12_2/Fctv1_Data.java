package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fctv1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -8, 1, 24, 11, 2),
		Block.createCuboidShape(-8, -8, 14, 24, 11, 15),
		Block.createCuboidShape(4, 0, 2, 12, 1, 14),
		Block.createCuboidShape(1, -4, 2, 15, 10, 3),
		Block.createCuboidShape(1, -4, 13, 15, 10, 14),
		Block.createCuboidShape(-1, 0, 3, 17, 4, 3),
		Block.createCuboidShape(-1, 0, 13, 17, 4, 13),
		Block.createCuboidShape(4, 3, 2, 12, 4, 14),
		Block.createCuboidShape(7, 2, 3, 9, 29, 4),
		Block.createCuboidShape(7, 2, 12, 9, 29, 13),
		Block.createCuboidShape(-8, 12, 1, 24, 12, 15),
		Block.createCuboidShape(-8, -9, 1, 24, -7, 2),
		Block.createCuboidShape(-8, -9, 14, 24, -7, 15),
		Block.createCuboidShape(-8, -7, 1, 24, 11, 1),
		Block.createCuboidShape(-9, -9, 1, -8, 12, 2),
		Block.createCuboidShape(24, -9, 1, 25, 12, 2),
		Block.createCuboidShape(-8, 11, 1, 24, 12, 2),
		Block.createCuboidShape(-6, 4, 2, 22, 4, 3),
		Block.createCuboidShape(-8, -7, 15, 24, 11, 15),
		Block.createCuboidShape(-9, -9, 14, -8, 12, 15),
		Block.createCuboidShape(24, -9, 14, 25, 12, 15),
		Block.createCuboidShape(-8, 11, 14, 24, 12, 15),
		Block.createCuboidShape(-6, 4, 13, 22, 4, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(14, -8, -8, 15, 11, 24),
		Block.createCuboidShape(1, -8, -8, 2, 11, 24),
		Block.createCuboidShape(2, 0, 4, 14, 1, 12),
		Block.createCuboidShape(13, -4, 1, 14, 10, 15),
		Block.createCuboidShape(2, -4, 1, 3, 10, 15),
		Block.createCuboidShape(13, 0, -1, 13, 4, 17),
		Block.createCuboidShape(3, 0, -1, 3, 4, 17),
		Block.createCuboidShape(2, 3, 4, 14, 4, 12),
		Block.createCuboidShape(12, 2, 7, 13, 29, 9),
		Block.createCuboidShape(3, 2, 7, 4, 29, 9),
		Block.createCuboidShape(1, 12, -8, 15, 12, 24),
		Block.createCuboidShape(14, -9, -8, 15, -7, 24),
		Block.createCuboidShape(1, -9, -8, 2, -7, 24),
		Block.createCuboidShape(15, -7, -8, 15, 11, 24),
		Block.createCuboidShape(14, -9, -9, 15, 12, -8),
		Block.createCuboidShape(14, -9, 24, 15, 12, 25),
		Block.createCuboidShape(14, 11, -8, 15, 12, 24),
		Block.createCuboidShape(13, 4, -6, 14, 4, 22),
		Block.createCuboidShape(1, -7, -8, 1, 11, 24),
		Block.createCuboidShape(1, -9, -9, 2, 12, -8),
		Block.createCuboidShape(1, -9, 24, 2, 12, 25),
		Block.createCuboidShape(1, 11, -8, 2, 12, 24),
		Block.createCuboidShape(2, 4, -6, 3, 4, 22)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -8, 14, 24, 11, 15),
		Block.createCuboidShape(-8, -8, 1, 24, 11, 2),
		Block.createCuboidShape(4, 0, 2, 12, 1, 14),
		Block.createCuboidShape(1, -4, 13, 15, 10, 14),
		Block.createCuboidShape(1, -4, 2, 15, 10, 3),
		Block.createCuboidShape(-1, 0, 13, 17, 4, 13),
		Block.createCuboidShape(-1, 0, 3, 17, 4, 3),
		Block.createCuboidShape(4, 3, 2, 12, 4, 14),
		Block.createCuboidShape(7, 2, 12, 9, 29, 13),
		Block.createCuboidShape(7, 2, 3, 9, 29, 4),
		Block.createCuboidShape(-8, 12, 1, 24, 12, 15),
		Block.createCuboidShape(-8, -9, 14, 24, -7, 15),
		Block.createCuboidShape(-8, -9, 1, 24, -7, 2),
		Block.createCuboidShape(-8, -7, 15, 24, 11, 15),
		Block.createCuboidShape(24, -9, 14, 25, 12, 15),
		Block.createCuboidShape(-9, -9, 14, -8, 12, 15),
		Block.createCuboidShape(-8, 11, 14, 24, 12, 15),
		Block.createCuboidShape(-6, 4, 13, 22, 4, 14),
		Block.createCuboidShape(-8, -7, 1, 24, 11, 1),
		Block.createCuboidShape(24, -9, 1, 25, 12, 2),
		Block.createCuboidShape(-9, -9, 1, -8, 12, 2),
		Block.createCuboidShape(-8, 11, 1, 24, 12, 2),
		Block.createCuboidShape(-6, 4, 2, 22, 4, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, -8, -8, 2, 11, 24),
		Block.createCuboidShape(14, -8, -8, 15, 11, 24),
		Block.createCuboidShape(2, 0, 4, 14, 1, 12),
		Block.createCuboidShape(2, -4, 1, 3, 10, 15),
		Block.createCuboidShape(13, -4, 1, 14, 10, 15),
		Block.createCuboidShape(3, 0, -1, 3, 4, 17),
		Block.createCuboidShape(13, 0, -1, 13, 4, 17),
		Block.createCuboidShape(2, 3, 4, 14, 4, 12),
		Block.createCuboidShape(3, 2, 7, 4, 29, 9),
		Block.createCuboidShape(12, 2, 7, 13, 29, 9),
		Block.createCuboidShape(1, 12, -8, 15, 12, 24),
		Block.createCuboidShape(1, -9, -8, 2, -7, 24),
		Block.createCuboidShape(14, -9, -8, 15, -7, 24),
		Block.createCuboidShape(1, -7, -8, 1, 11, 24),
		Block.createCuboidShape(1, -9, 24, 2, 12, 25),
		Block.createCuboidShape(1, -9, -9, 2, 12, -8),
		Block.createCuboidShape(1, 11, -8, 2, 12, 24),
		Block.createCuboidShape(2, 4, -6, 3, 4, 22),
		Block.createCuboidShape(15, -7, -8, 15, 11, 24),
		Block.createCuboidShape(14, -9, 24, 15, 12, 25),
		Block.createCuboidShape(14, -9, -9, 15, 12, -8),
		Block.createCuboidShape(14, 11, -8, 15, 12, 24),
		Block.createCuboidShape(13, 4, -6, 14, 4, 22)
    );

    public Fctv1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwinl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 2, 2, 10, 3, 6),
		Block.createCuboidShape(-14, 21, 2, 10, 22, 6),
		Block.createCuboidShape(10, 1, 15, 14, 31, 16),
		Block.createCuboidShape(10, 1, 6, 14, 31, 7),
		Block.createCuboidShape(10, 30, 7, 14, 31, 15),
		Block.createCuboidShape(10, 22, 7, 14, 23, 15),
		Block.createCuboidShape(10, 1, 7, 14, 2, 15),
		Block.createCuboidShape(-16, 1, 2, -15, 31, 6),
		Block.createCuboidShape(-3, 23, 2, -1, 30, 6),
		Block.createCuboidShape(-2, 2, 2, -1, 22, 4),
		Block.createCuboidShape(-15, 2, 4, -14, 22, 6),
		Block.createCuboidShape(10, 2, 2, 11, 22, 4),
		Block.createCuboidShape(-3, 2, 4, -2, 22, 6),
		Block.createCuboidShape(-15, 1, 2, 11, 2, 6),
		Block.createCuboidShape(-15, 30, 2, 11, 31, 6),
		Block.createCuboidShape(-15, 22, 2, 11, 23, 6),
		Block.createCuboidShape(11, 1, 2, 12, 31, 6),
		Block.createCuboidShape(8, 31, 0, 16, 32, 16),
		Block.createCuboidShape(8, 0, 0, 16, 1, 16),
		Block.createCuboidShape(-16, 31, 0, 8, 32, 8),
		Block.createCuboidShape(-16, 0, 0, 8, 1, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 2, -14, 14, 3, 10),
		Block.createCuboidShape(10, 21, -14, 14, 22, 10),
		Block.createCuboidShape(0, 1, 10, 1, 31, 14),
		Block.createCuboidShape(9, 1, 10, 10, 31, 14),
		Block.createCuboidShape(1, 30, 10, 9, 31, 14),
		Block.createCuboidShape(1, 22, 10, 9, 23, 14),
		Block.createCuboidShape(1, 1, 10, 9, 2, 14),
		Block.createCuboidShape(10, 1, -16, 14, 31, -15),
		Block.createCuboidShape(10, 23, -3, 14, 30, -1),
		Block.createCuboidShape(12, 2, -2, 14, 22, -1),
		Block.createCuboidShape(10, 2, -15, 12, 22, -14),
		Block.createCuboidShape(12, 2, 10, 14, 22, 11),
		Block.createCuboidShape(10, 2, -3, 12, 22, -2),
		Block.createCuboidShape(10, 1, -15, 14, 2, 11),
		Block.createCuboidShape(10, 30, -15, 14, 31, 11),
		Block.createCuboidShape(10, 22, -15, 14, 23, 11),
		Block.createCuboidShape(10, 1, 11, 14, 31, 12),
		Block.createCuboidShape(0, 31, 8, 16, 32, 16),
		Block.createCuboidShape(0, 0, 8, 16, 1, 16),
		Block.createCuboidShape(8, 31, -16, 16, 32, 8),
		Block.createCuboidShape(8, 0, -16, 16, 1, 8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 2, 10, 30, 3, 14),
		Block.createCuboidShape(6, 21, 10, 30, 22, 14),
		Block.createCuboidShape(2, 1, 0, 6, 31, 1),
		Block.createCuboidShape(2, 1, 9, 6, 31, 10),
		Block.createCuboidShape(2, 30, 1, 6, 31, 9),
		Block.createCuboidShape(2, 22, 1, 6, 23, 9),
		Block.createCuboidShape(2, 1, 1, 6, 2, 9),
		Block.createCuboidShape(31, 1, 10, 32, 31, 14),
		Block.createCuboidShape(17, 23, 10, 19, 30, 14),
		Block.createCuboidShape(17, 2, 12, 18, 22, 14),
		Block.createCuboidShape(30, 2, 10, 31, 22, 12),
		Block.createCuboidShape(5, 2, 12, 6, 22, 14),
		Block.createCuboidShape(18, 2, 10, 19, 22, 12),
		Block.createCuboidShape(5, 1, 10, 31, 2, 14),
		Block.createCuboidShape(5, 30, 10, 31, 31, 14),
		Block.createCuboidShape(5, 22, 10, 31, 23, 14),
		Block.createCuboidShape(4, 1, 10, 5, 31, 14),
		Block.createCuboidShape(0, 31, 0, 8, 32, 16),
		Block.createCuboidShape(0, 0, 0, 8, 1, 16),
		Block.createCuboidShape(8, 31, 8, 32, 32, 16),
		Block.createCuboidShape(8, 0, 8, 32, 1, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 2, 6, 6, 3, 30),
		Block.createCuboidShape(2, 21, 6, 6, 22, 30),
		Block.createCuboidShape(15, 1, 2, 16, 31, 6),
		Block.createCuboidShape(6, 1, 2, 7, 31, 6),
		Block.createCuboidShape(7, 30, 2, 15, 31, 6),
		Block.createCuboidShape(7, 22, 2, 15, 23, 6),
		Block.createCuboidShape(7, 1, 2, 15, 2, 6),
		Block.createCuboidShape(2, 1, 31, 6, 31, 32),
		Block.createCuboidShape(2, 23, 17, 6, 30, 19),
		Block.createCuboidShape(2, 2, 17, 4, 22, 18),
		Block.createCuboidShape(4, 2, 30, 6, 22, 31),
		Block.createCuboidShape(2, 2, 5, 4, 22, 6),
		Block.createCuboidShape(4, 2, 18, 6, 22, 19),
		Block.createCuboidShape(2, 1, 5, 6, 2, 31),
		Block.createCuboidShape(2, 30, 5, 6, 31, 31),
		Block.createCuboidShape(2, 22, 5, 6, 23, 31),
		Block.createCuboidShape(2, 1, 4, 6, 31, 5),
		Block.createCuboidShape(0, 31, 0, 16, 32, 8),
		Block.createCuboidShape(0, 0, 0, 16, 1, 8),
		Block.createCuboidShape(0, 31, 8, 8, 32, 32),
		Block.createCuboidShape(0, 0, 8, 8, 1, 32)
    );

    public Fwinl_Data() {
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

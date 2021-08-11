package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwinr_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 2, 2, 30, 3, 6),
		Block.createCuboidShape(6, 21, 2, 30, 22, 6),
		Block.createCuboidShape(2, 1, 15, 6, 31, 16),
		Block.createCuboidShape(2, 1, 6, 6, 31, 7),
		Block.createCuboidShape(2, 30, 7, 6, 31, 15),
		Block.createCuboidShape(2, 22, 7, 6, 23, 15),
		Block.createCuboidShape(2, 1, 7, 6, 2, 15),
		Block.createCuboidShape(31, 1, 2, 32, 31, 6),
		Block.createCuboidShape(17, 23, 2, 19, 30, 6),
		Block.createCuboidShape(17, 2, 2, 18, 22, 4),
		Block.createCuboidShape(30, 2, 4, 31, 22, 6),
		Block.createCuboidShape(5, 2, 2, 6, 22, 4),
		Block.createCuboidShape(18, 2, 4, 19, 22, 6),
		Block.createCuboidShape(5, 1, 2, 31, 2, 6),
		Block.createCuboidShape(5, 30, 2, 31, 31, 6),
		Block.createCuboidShape(5, 22, 2, 31, 23, 6),
		Block.createCuboidShape(4, 1, 2, 5, 31, 6),
		Block.createCuboidShape(0, 31, 0, 8, 32, 16),
		Block.createCuboidShape(0, 0, 0, 8, 1, 16),
		Block.createCuboidShape(8, 31, 0, 32, 32, 8),
		Block.createCuboidShape(8, 0, 0, 32, 1, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 2, 6, 14, 3, 30),
		Block.createCuboidShape(10, 21, 6, 14, 22, 30),
		Block.createCuboidShape(0, 1, 2, 1, 31, 6),
		Block.createCuboidShape(9, 1, 2, 10, 31, 6),
		Block.createCuboidShape(1, 30, 2, 9, 31, 6),
		Block.createCuboidShape(1, 22, 2, 9, 23, 6),
		Block.createCuboidShape(1, 1, 2, 9, 2, 6),
		Block.createCuboidShape(10, 1, 31, 14, 31, 32),
		Block.createCuboidShape(10, 23, 17, 14, 30, 19),
		Block.createCuboidShape(12, 2, 17, 14, 22, 18),
		Block.createCuboidShape(10, 2, 30, 12, 22, 31),
		Block.createCuboidShape(12, 2, 5, 14, 22, 6),
		Block.createCuboidShape(10, 2, 18, 12, 22, 19),
		Block.createCuboidShape(10, 1, 5, 14, 2, 31),
		Block.createCuboidShape(10, 30, 5, 14, 31, 31),
		Block.createCuboidShape(10, 22, 5, 14, 23, 31),
		Block.createCuboidShape(10, 1, 4, 14, 31, 5),
		Block.createCuboidShape(0, 31, 0, 16, 32, 8),
		Block.createCuboidShape(0, 0, 0, 16, 1, 8),
		Block.createCuboidShape(8, 31, 8, 16, 32, 32),
		Block.createCuboidShape(8, 0, 8, 16, 1, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 2, 10, 10, 3, 14),
		Block.createCuboidShape(-14, 21, 10, 10, 22, 14),
		Block.createCuboidShape(10, 1, 0, 14, 31, 1),
		Block.createCuboidShape(10, 1, 9, 14, 31, 10),
		Block.createCuboidShape(10, 30, 1, 14, 31, 9),
		Block.createCuboidShape(10, 22, 1, 14, 23, 9),
		Block.createCuboidShape(10, 1, 1, 14, 2, 9),
		Block.createCuboidShape(-16, 1, 10, -15, 31, 14),
		Block.createCuboidShape(-3, 23, 10, -1, 30, 14),
		Block.createCuboidShape(-2, 2, 12, -1, 22, 14),
		Block.createCuboidShape(-15, 2, 10, -14, 22, 12),
		Block.createCuboidShape(10, 2, 12, 11, 22, 14),
		Block.createCuboidShape(-3, 2, 10, -2, 22, 12),
		Block.createCuboidShape(-15, 1, 10, 11, 2, 14),
		Block.createCuboidShape(-15, 30, 10, 11, 31, 14),
		Block.createCuboidShape(-15, 22, 10, 11, 23, 14),
		Block.createCuboidShape(11, 1, 10, 12, 31, 14),
		Block.createCuboidShape(8, 31, 0, 16, 32, 16),
		Block.createCuboidShape(8, 0, 0, 16, 1, 16),
		Block.createCuboidShape(-16, 31, 8, 8, 32, 16),
		Block.createCuboidShape(-16, 0, 8, 8, 1, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 2, -14, 6, 3, 10),
		Block.createCuboidShape(2, 21, -14, 6, 22, 10),
		Block.createCuboidShape(15, 1, 10, 16, 31, 14),
		Block.createCuboidShape(6, 1, 10, 7, 31, 14),
		Block.createCuboidShape(7, 30, 10, 15, 31, 14),
		Block.createCuboidShape(7, 22, 10, 15, 23, 14),
		Block.createCuboidShape(7, 1, 10, 15, 2, 14),
		Block.createCuboidShape(2, 1, -16, 6, 31, -15),
		Block.createCuboidShape(2, 23, -3, 6, 30, -1),
		Block.createCuboidShape(2, 2, -2, 4, 22, -1),
		Block.createCuboidShape(4, 2, -15, 6, 22, -14),
		Block.createCuboidShape(2, 2, 10, 4, 22, 11),
		Block.createCuboidShape(4, 2, -3, 6, 22, -2),
		Block.createCuboidShape(2, 1, -15, 6, 2, 11),
		Block.createCuboidShape(2, 30, -15, 6, 31, 11),
		Block.createCuboidShape(2, 22, -15, 6, 23, 11),
		Block.createCuboidShape(2, 1, 11, 6, 31, 12),
		Block.createCuboidShape(0, 31, 8, 16, 32, 16),
		Block.createCuboidShape(0, 0, 8, 16, 1, 16),
		Block.createCuboidShape(0, 31, -16, 8, 32, 8),
		Block.createCuboidShape(0, 0, -16, 8, 1, 8)
    );

    public Fwinr_Data() {
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

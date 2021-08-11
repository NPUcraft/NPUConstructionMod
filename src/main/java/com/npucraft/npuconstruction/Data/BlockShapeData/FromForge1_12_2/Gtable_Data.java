package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Gtable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(14, -16, 4, 15, -1, 16),
		Block.createCuboidShape(-15, -16, 4, -14, -1, 16),
		Block.createCuboidShape(-1, 11, 11, 0, 17, 15),
		Block.createCuboidShape(-6, -16, 4, -5, -1, 16),
		Block.createCuboidShape(-15, 0, 15, 15, 2, 16),
		Block.createCuboidShape(-16, -1, 3, 16, 0, 16),
		Block.createCuboidShape(-14, -16, 4, -6, -14, 16),
		Block.createCuboidShape(-14, -4, 4, -6, -1, 16),
		Block.createCuboidShape(-5, -4, 4, 14, -2, 5),
		Block.createCuboidShape(-15, 10, 15, 15, 24, 16),
		Block.createCuboidShape(-5, -4, 5, 14, -3, 15),
		Block.createCuboidShape(-15, 10, 11, 15, 11, 15),
		Block.createCuboidShape(-15, 17, 11, 15, 18, 15),
		Block.createCuboidShape(15, 0, 11, 16, 24, 16),
		Block.createCuboidShape(-16, 0, 11, -15, 24, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 14, 12, -1, 15),
		Block.createCuboidShape(0, -16, -15, 12, -1, -14),
		Block.createCuboidShape(1, 11, -1, 5, 17, 0),
		Block.createCuboidShape(0, -16, -6, 12, -1, -5),
		Block.createCuboidShape(0, 0, -15, 1, 2, 15),
		Block.createCuboidShape(0, -1, -16, 13, 0, 16),
		Block.createCuboidShape(0, -16, -14, 12, -14, -6),
		Block.createCuboidShape(0, -4, -14, 12, -1, -6),
		Block.createCuboidShape(11, -4, -5, 12, -2, 14),
		Block.createCuboidShape(0, 10, -15, 1, 24, 15),
		Block.createCuboidShape(1, -4, -5, 11, -3, 14),
		Block.createCuboidShape(1, 10, -15, 5, 11, 15),
		Block.createCuboidShape(1, 17, -15, 5, 18, 15),
		Block.createCuboidShape(0, 0, 15, 5, 24, 16),
		Block.createCuboidShape(0, 0, -16, 5, 24, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -16, 0, 2, -1, 12),
		Block.createCuboidShape(30, -16, 0, 31, -1, 12),
		Block.createCuboidShape(16, 11, 1, 17, 17, 5),
		Block.createCuboidShape(21, -16, 0, 22, -1, 12),
		Block.createCuboidShape(1, 0, 0, 31, 2, 1),
		Block.createCuboidShape(0, -1, 0, 32, 0, 13),
		Block.createCuboidShape(22, -16, 0, 30, -14, 12),
		Block.createCuboidShape(22, -4, 0, 30, -1, 12),
		Block.createCuboidShape(2, -4, 11, 21, -2, 12),
		Block.createCuboidShape(1, 10, 0, 31, 24, 1),
		Block.createCuboidShape(2, -4, 1, 21, -3, 11),
		Block.createCuboidShape(1, 10, 1, 31, 11, 5),
		Block.createCuboidShape(1, 17, 1, 31, 18, 5),
		Block.createCuboidShape(0, 0, 0, 1, 24, 5),
		Block.createCuboidShape(31, 0, 0, 32, 24, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, -16, 1, 16, -1, 2),
		Block.createCuboidShape(4, -16, 30, 16, -1, 31),
		Block.createCuboidShape(11, 11, 16, 15, 17, 17),
		Block.createCuboidShape(4, -16, 21, 16, -1, 22),
		Block.createCuboidShape(15, 0, 1, 16, 2, 31),
		Block.createCuboidShape(3, -1, 0, 16, 0, 32),
		Block.createCuboidShape(4, -16, 22, 16, -14, 30),
		Block.createCuboidShape(4, -4, 22, 16, -1, 30),
		Block.createCuboidShape(4, -4, 2, 5, -2, 21),
		Block.createCuboidShape(15, 10, 1, 16, 24, 31),
		Block.createCuboidShape(5, -4, 2, 15, -3, 21),
		Block.createCuboidShape(11, 10, 1, 15, 11, 31),
		Block.createCuboidShape(11, 17, 1, 15, 18, 31),
		Block.createCuboidShape(11, 0, 0, 16, 24, 1),
		Block.createCuboidShape(11, 0, 31, 16, 24, 32)
    );

    public Gtable_Data() {
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

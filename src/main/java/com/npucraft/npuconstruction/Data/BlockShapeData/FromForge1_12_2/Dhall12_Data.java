package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall12_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 12, 9, -1, 15, 15),
		Block.createCuboidShape(31, 12, 0, 32, 17, 16),
		Block.createCuboidShape(-2, 13, 1, 0, 16, 15),
		Block.createCuboidShape(-9, 13, 1, -7, 16, 15),
		Block.createCuboidShape(6, 13, 1, 7, 16, 15),
		Block.createCuboidShape(14, 13, 1, 15, 16, 15),
		Block.createCuboidShape(22, 13, 1, 24, 16, 15),
		Block.createCuboidShape(-15, 13, 15, 31, 16, 15),
		Block.createCuboidShape(-15, 13, 1, 31, 16, 1),
		Block.createCuboidShape(-15, 1, 0, 31, 11, 16),
		Block.createCuboidShape(-16, 12, 0, -15, 17, 16),
		Block.createCuboidShape(-7, 13, 2, -2, 14, 7),
		Block.createCuboidShape(-15, 12, 1, 31, 13, 7),
		Block.createCuboidShape(-15, 16, 7, 31, 16, 9),
		Block.createCuboidShape(-15, 13, 7, 31, 16, 7),
		Block.createCuboidShape(-15, 13, 9, 31, 16, 9),
		Block.createCuboidShape(0, 12, 9, 31, 13, 15),
		Block.createCuboidShape(4, 5, 0, 5, 9, 16),
		Block.createCuboidShape(11, 5, 0, 12, 9, 16),
		Block.createCuboidShape(-16, 11, 0, 32, 12, 16),
		Block.createCuboidShape(-16, 12, 16, 32, 16, 16),
		Block.createCuboidShape(-16, 12, 0, 32, 16, 0),
		Block.createCuboidShape(-15, 16, 15, 31, 17, 16),
		Block.createCuboidShape(-15, 16, 0, 31, 17, 1)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 12, -15, 7, 15, -1),
		Block.createCuboidShape(0, 12, 31, 16, 17, 32),
		Block.createCuboidShape(1, 13, -2, 15, 16, 0),
		Block.createCuboidShape(1, 13, -9, 15, 16, -7),
		Block.createCuboidShape(1, 13, 6, 15, 16, 7),
		Block.createCuboidShape(1, 13, 14, 15, 16, 15),
		Block.createCuboidShape(1, 13, 22, 15, 16, 24),
		Block.createCuboidShape(1, 13, -15, 1, 16, 31),
		Block.createCuboidShape(15, 13, -15, 15, 16, 31),
		Block.createCuboidShape(0, 1, -15, 16, 11, 31),
		Block.createCuboidShape(0, 12, -16, 16, 17, -15),
		Block.createCuboidShape(9, 13, -7, 14, 14, -2),
		Block.createCuboidShape(9, 12, -15, 15, 13, 31),
		Block.createCuboidShape(7, 16, -15, 9, 16, 31),
		Block.createCuboidShape(9, 13, -15, 9, 16, 31),
		Block.createCuboidShape(7, 13, -15, 7, 16, 31),
		Block.createCuboidShape(1, 12, 0, 7, 13, 31),
		Block.createCuboidShape(0, 5, 4, 16, 9, 5),
		Block.createCuboidShape(0, 5, 11, 16, 9, 12),
		Block.createCuboidShape(0, 11, -16, 16, 12, 32),
		Block.createCuboidShape(0, 12, -16, 0, 16, 32),
		Block.createCuboidShape(16, 12, -16, 16, 16, 32),
		Block.createCuboidShape(0, 16, -15, 1, 17, 31),
		Block.createCuboidShape(15, 16, -15, 16, 17, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(17, 12, 1, 31, 15, 7),
		Block.createCuboidShape(-16, 12, 0, -15, 17, 16),
		Block.createCuboidShape(16, 13, 1, 18, 16, 15),
		Block.createCuboidShape(23, 13, 1, 25, 16, 15),
		Block.createCuboidShape(9, 13, 1, 10, 16, 15),
		Block.createCuboidShape(1, 13, 1, 2, 16, 15),
		Block.createCuboidShape(-8, 13, 1, -6, 16, 15),
		Block.createCuboidShape(-15, 13, 1, 31, 16, 1),
		Block.createCuboidShape(-15, 13, 15, 31, 16, 15),
		Block.createCuboidShape(-15, 1, 0, 31, 11, 16),
		Block.createCuboidShape(31, 12, 0, 32, 17, 16),
		Block.createCuboidShape(18, 13, 9, 23, 14, 14),
		Block.createCuboidShape(-15, 12, 9, 31, 13, 15),
		Block.createCuboidShape(-15, 16, 7, 31, 16, 9),
		Block.createCuboidShape(-15, 13, 9, 31, 16, 9),
		Block.createCuboidShape(-15, 13, 7, 31, 16, 7),
		Block.createCuboidShape(-15, 12, 1, 16, 13, 7),
		Block.createCuboidShape(11, 5, 0, 12, 9, 16),
		Block.createCuboidShape(4, 5, 0, 5, 9, 16),
		Block.createCuboidShape(-16, 11, 0, 32, 12, 16),
		Block.createCuboidShape(-16, 12, 0, 32, 16, 0),
		Block.createCuboidShape(-16, 12, 16, 32, 16, 16),
		Block.createCuboidShape(-15, 16, 0, 31, 17, 1),
		Block.createCuboidShape(-15, 16, 15, 31, 17, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, 12, 17, 15, 15, 31),
		Block.createCuboidShape(0, 12, -16, 16, 17, -15),
		Block.createCuboidShape(1, 13, 16, 15, 16, 18),
		Block.createCuboidShape(1, 13, 23, 15, 16, 25),
		Block.createCuboidShape(1, 13, 9, 15, 16, 10),
		Block.createCuboidShape(1, 13, 1, 15, 16, 2),
		Block.createCuboidShape(1, 13, -8, 15, 16, -6),
		Block.createCuboidShape(15, 13, -15, 15, 16, 31),
		Block.createCuboidShape(1, 13, -15, 1, 16, 31),
		Block.createCuboidShape(0, 1, -15, 16, 11, 31),
		Block.createCuboidShape(0, 12, 31, 16, 17, 32),
		Block.createCuboidShape(2, 13, 18, 7, 14, 23),
		Block.createCuboidShape(1, 12, -15, 7, 13, 31),
		Block.createCuboidShape(7, 16, -15, 9, 16, 31),
		Block.createCuboidShape(7, 13, -15, 7, 16, 31),
		Block.createCuboidShape(9, 13, -15, 9, 16, 31),
		Block.createCuboidShape(9, 12, -15, 15, 13, 16),
		Block.createCuboidShape(0, 5, 11, 16, 9, 12),
		Block.createCuboidShape(0, 5, 4, 16, 9, 5),
		Block.createCuboidShape(0, 11, -16, 16, 12, 32),
		Block.createCuboidShape(16, 12, -16, 16, 16, 32),
		Block.createCuboidShape(0, 12, -16, 0, 16, 32),
		Block.createCuboidShape(15, 16, -15, 16, 17, 31),
		Block.createCuboidShape(0, 16, -15, 1, 17, 31)
    );

    public Dhall12_Data() {
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

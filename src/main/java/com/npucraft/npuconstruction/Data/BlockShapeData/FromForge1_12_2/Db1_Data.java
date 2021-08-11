package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Db1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 1, 0, 2, 7, 5),
		Block.createCuboidShape(-11, 26, 2, 9, 32, 4),
		Block.createCuboidShape(-16, -16, -1, -15, 32, 17),
		Block.createCuboidShape(15, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-15, 31, -1, 15, 32, 17),
		Block.createCuboidShape(-9, 4, 2, -3, 26, 3),
		Block.createCuboidShape(3, 4, 2, 9, 26, 3),
		Block.createCuboidShape(-3, -16, 2, 3, 32, 4),
		Block.createCuboidShape(-15, -16, 2, -8, 32, 4),
		Block.createCuboidShape(7, -16, 2, 16, 32, 4),
		Block.createCuboidShape(-8, -16, 2, -3, 4, 4),
		Block.createCuboidShape(3, -16, 2, 7, 4, 4)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(11, 1, -3, 16, 7, 2),
		Block.createCuboidShape(12, 26, -11, 14, 32, 9),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -15),
		Block.createCuboidShape(-1, -16, 15, 17, 32, 16),
		Block.createCuboidShape(-1, 31, -15, 17, 32, 15),
		Block.createCuboidShape(13, 4, -9, 14, 26, -3),
		Block.createCuboidShape(13, 4, 3, 14, 26, 9),
		Block.createCuboidShape(12, -16, -3, 14, 32, 3),
		Block.createCuboidShape(12, -16, -15, 14, 32, -8),
		Block.createCuboidShape(12, -16, 7, 14, 32, 16),
		Block.createCuboidShape(12, -16, -8, 14, 4, -3),
		Block.createCuboidShape(12, -16, 3, 14, 4, 7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(14, 1, 11, 19, 7, 16),
		Block.createCuboidShape(7, 26, 12, 27, 32, 14),
		Block.createCuboidShape(31, -16, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 1, 32, 17),
		Block.createCuboidShape(1, 31, -1, 31, 32, 17),
		Block.createCuboidShape(19, 4, 13, 25, 26, 14),
		Block.createCuboidShape(7, 4, 13, 13, 26, 14),
		Block.createCuboidShape(13, -16, 12, 19, 32, 14),
		Block.createCuboidShape(24, -16, 12, 31, 32, 14),
		Block.createCuboidShape(0, -16, 12, 9, 32, 14),
		Block.createCuboidShape(19, -16, 12, 24, 4, 14),
		Block.createCuboidShape(9, -16, 12, 13, 4, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 1, 14, 5, 7, 19),
		Block.createCuboidShape(2, 26, 7, 4, 32, 27),
		Block.createCuboidShape(-1, -16, 31, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 1),
		Block.createCuboidShape(-1, 31, 1, 17, 32, 31),
		Block.createCuboidShape(2, 4, 19, 3, 26, 25),
		Block.createCuboidShape(2, 4, 7, 3, 26, 13),
		Block.createCuboidShape(2, -16, 13, 4, 32, 19),
		Block.createCuboidShape(2, -16, 24, 4, 32, 31),
		Block.createCuboidShape(2, -16, 0, 4, 32, 9),
		Block.createCuboidShape(2, -16, 19, 4, 4, 24),
		Block.createCuboidShape(2, -16, 9, 4, 4, 13)
    );

    public Db1_Data() {
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

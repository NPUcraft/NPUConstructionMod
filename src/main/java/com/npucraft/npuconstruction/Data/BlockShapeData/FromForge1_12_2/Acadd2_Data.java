package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Acadd2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(14, 21, 6, 18, 29, 8),
		Block.createCuboidShape(-6, 21, 6, -2, 29, 8),
		Block.createCuboidShape(14, 21, 23, 18, 29, 25),
		Block.createCuboidShape(-6, 21, 23, -2, 29, 25),
		Block.createCuboidShape(13, 20, -1, 18, 21, 32),
		Block.createCuboidShape(-7, 20, -1, -2, 21, 32),
		Block.createCuboidShape(13, 0, -1, 18, 1, 32),
		Block.createCuboidShape(-7, 0, -1, -2, 1, 32),
		Block.createCuboidShape(13, 1, -1, 17, 20, 32),
		Block.createCuboidShape(-7, 1, -1, -3, 20, 32),
		Block.createCuboidShape(17, 0, -1, 19, 21, 32),
		Block.createCuboidShape(-3, 0, -1, -1, 21, 32),
		Block.createCuboidShape(19, 0, 13, 20, 20, 18),
		Block.createCuboidShape(-1, 0, 13, 0, 20, 18),
		Block.createCuboidShape(12, 0, 13, 13, 20, 18),
		Block.createCuboidShape(-8, 0, 13, -7, 20, 18),
		Block.createCuboidShape(-3, 2, 15, 5, 14, 16),
		Block.createCuboidShape(6, 9, 15, 14, 21, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 21, 14, 10, 29, 18),
		Block.createCuboidShape(8, 21, -6, 10, 29, -2),
		Block.createCuboidShape(-9, 21, 14, -7, 29, 18),
		Block.createCuboidShape(-9, 21, -6, -7, 29, -2),
		Block.createCuboidShape(-16, 20, 13, 17, 21, 18),
		Block.createCuboidShape(-16, 20, -7, 17, 21, -2),
		Block.createCuboidShape(-16, 0, 13, 17, 1, 18),
		Block.createCuboidShape(-16, 0, -7, 17, 1, -2),
		Block.createCuboidShape(-16, 1, 13, 17, 20, 17),
		Block.createCuboidShape(-16, 1, -7, 17, 20, -3),
		Block.createCuboidShape(-16, 0, 17, 17, 21, 19),
		Block.createCuboidShape(-16, 0, -3, 17, 21, -1),
		Block.createCuboidShape(-2, 0, 19, 3, 20, 20),
		Block.createCuboidShape(-2, 0, -1, 3, 20, 0),
		Block.createCuboidShape(-2, 0, 12, 3, 20, 13),
		Block.createCuboidShape(-2, 0, -8, 3, 20, -7),
		Block.createCuboidShape(0, 2, -3, 1, 14, 5),
		Block.createCuboidShape(0, 9, 6, 1, 21, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 21, 8, 2, 29, 10),
		Block.createCuboidShape(18, 21, 8, 22, 29, 10),
		Block.createCuboidShape(-2, 21, -9, 2, 29, -7),
		Block.createCuboidShape(18, 21, -9, 22, 29, -7),
		Block.createCuboidShape(-2, 20, -16, 3, 21, 17),
		Block.createCuboidShape(18, 20, -16, 23, 21, 17),
		Block.createCuboidShape(-2, 0, -16, 3, 1, 17),
		Block.createCuboidShape(18, 0, -16, 23, 1, 17),
		Block.createCuboidShape(-1, 1, -16, 3, 20, 17),
		Block.createCuboidShape(19, 1, -16, 23, 20, 17),
		Block.createCuboidShape(-3, 0, -16, -1, 21, 17),
		Block.createCuboidShape(17, 0, -16, 19, 21, 17),
		Block.createCuboidShape(-4, 0, -2, -3, 20, 3),
		Block.createCuboidShape(16, 0, -2, 17, 20, 3),
		Block.createCuboidShape(3, 0, -2, 4, 20, 3),
		Block.createCuboidShape(23, 0, -2, 24, 20, 3),
		Block.createCuboidShape(11, 2, 0, 19, 14, 1),
		Block.createCuboidShape(2, 9, 0, 10, 21, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 21, -2, 8, 29, 2),
		Block.createCuboidShape(6, 21, 18, 8, 29, 22),
		Block.createCuboidShape(23, 21, -2, 25, 29, 2),
		Block.createCuboidShape(23, 21, 18, 25, 29, 22),
		Block.createCuboidShape(-1, 20, -2, 32, 21, 3),
		Block.createCuboidShape(-1, 20, 18, 32, 21, 23),
		Block.createCuboidShape(-1, 0, -2, 32, 1, 3),
		Block.createCuboidShape(-1, 0, 18, 32, 1, 23),
		Block.createCuboidShape(-1, 1, -1, 32, 20, 3),
		Block.createCuboidShape(-1, 1, 19, 32, 20, 23),
		Block.createCuboidShape(-1, 0, -3, 32, 21, -1),
		Block.createCuboidShape(-1, 0, 17, 32, 21, 19),
		Block.createCuboidShape(13, 0, -4, 18, 20, -3),
		Block.createCuboidShape(13, 0, 16, 18, 20, 17),
		Block.createCuboidShape(13, 0, 3, 18, 20, 4),
		Block.createCuboidShape(13, 0, 23, 18, 20, 24),
		Block.createCuboidShape(15, 2, 11, 16, 14, 19),
		Block.createCuboidShape(15, 9, 2, 16, 21, 10)
    );

    public Acadd2_Data() {
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

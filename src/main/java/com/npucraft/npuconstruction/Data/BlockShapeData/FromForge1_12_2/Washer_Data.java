package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Washer_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 5, 9, 4, 16, 18),
		Block.createCuboidShape(0, 0, 22, 16, 1, 29),
		Block.createCuboidShape(5, 5, 16, 11, 16, 18),
		Block.createCuboidShape(5, 5, 8, 11, 16, 11),
		Block.createCuboidShape(12, 5, 9, 14, 16, 18),
		Block.createCuboidShape(2, 17, 17, 14, 22, 19),
		Block.createCuboidShape(13, 17, 11, 14, 20, 17),
		Block.createCuboidShape(2, 17, 11, 3, 20, 17),
		Block.createCuboidShape(1, 17, 6, 15, 20, 10),
		Block.createCuboidShape(2, 26, 17, 14, 29, 18),
		Block.createCuboidShape(1, 1, 7, 2, 20, 20),
		Block.createCuboidShape(14, 1, 7, 15, 20, 20),
		Block.createCuboidShape(1, 0, 6, 15, 1, 20),
		Block.createCuboidShape(2, 1, 7, 14, 5, 19),
		Block.createCuboidShape(2, 1, 19, 14, 20, 20),
		Block.createCuboidShape(1, 1, 6, 15, 19, 7),
		Block.createCuboidShape(11, 18, 22, 12, 19, 27),
		Block.createCuboidShape(0, 21, 31, 16, 22, 32)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-2, 5, 2, 7, 16, 4),
		Block.createCuboidShape(-13, 0, 0, -6, 1, 16),
		Block.createCuboidShape(-2, 5, 5, 0, 16, 11),
		Block.createCuboidShape(5, 5, 5, 8, 16, 11),
		Block.createCuboidShape(-2, 5, 12, 7, 16, 14),
		Block.createCuboidShape(-3, 17, 2, -1, 22, 14),
		Block.createCuboidShape(-1, 17, 13, 5, 20, 14),
		Block.createCuboidShape(-1, 17, 2, 5, 20, 3),
		Block.createCuboidShape(6, 17, 1, 10, 20, 15),
		Block.createCuboidShape(-2, 26, 2, -1, 29, 14),
		Block.createCuboidShape(-4, 1, 1, 9, 20, 2),
		Block.createCuboidShape(-4, 1, 14, 9, 20, 15),
		Block.createCuboidShape(-4, 0, 1, 10, 1, 15),
		Block.createCuboidShape(-3, 1, 2, 9, 5, 14),
		Block.createCuboidShape(-4, 1, 2, -3, 20, 14),
		Block.createCuboidShape(9, 1, 1, 10, 19, 15),
		Block.createCuboidShape(-11, 18, 11, -6, 19, 12),
		Block.createCuboidShape(-16, 21, 0, -15, 22, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(12, 5, -2, 14, 16, 7),
		Block.createCuboidShape(0, 0, -13, 16, 1, -6),
		Block.createCuboidShape(5, 5, -2, 11, 16, 0),
		Block.createCuboidShape(5, 5, 5, 11, 16, 8),
		Block.createCuboidShape(2, 5, -2, 4, 16, 7),
		Block.createCuboidShape(2, 17, -3, 14, 22, -1),
		Block.createCuboidShape(2, 17, -1, 3, 20, 5),
		Block.createCuboidShape(13, 17, -1, 14, 20, 5),
		Block.createCuboidShape(1, 17, 6, 15, 20, 10),
		Block.createCuboidShape(2, 26, -2, 14, 29, -1),
		Block.createCuboidShape(14, 1, -4, 15, 20, 9),
		Block.createCuboidShape(1, 1, -4, 2, 20, 9),
		Block.createCuboidShape(1, 0, -4, 15, 1, 10),
		Block.createCuboidShape(2, 1, -3, 14, 5, 9),
		Block.createCuboidShape(2, 1, -4, 14, 20, -3),
		Block.createCuboidShape(1, 1, 9, 15, 19, 10),
		Block.createCuboidShape(4, 18, -11, 5, 19, -6),
		Block.createCuboidShape(0, 21, -16, 16, 22, -15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, 5, 12, 18, 16, 14),
		Block.createCuboidShape(22, 0, 0, 29, 1, 16),
		Block.createCuboidShape(16, 5, 5, 18, 16, 11),
		Block.createCuboidShape(8, 5, 5, 11, 16, 11),
		Block.createCuboidShape(9, 5, 2, 18, 16, 4),
		Block.createCuboidShape(17, 17, 2, 19, 22, 14),
		Block.createCuboidShape(11, 17, 2, 17, 20, 3),
		Block.createCuboidShape(11, 17, 13, 17, 20, 14),
		Block.createCuboidShape(6, 17, 1, 10, 20, 15),
		Block.createCuboidShape(17, 26, 2, 18, 29, 14),
		Block.createCuboidShape(7, 1, 14, 20, 20, 15),
		Block.createCuboidShape(7, 1, 1, 20, 20, 2),
		Block.createCuboidShape(6, 0, 1, 20, 1, 15),
		Block.createCuboidShape(7, 1, 2, 19, 5, 14),
		Block.createCuboidShape(19, 1, 2, 20, 20, 14),
		Block.createCuboidShape(6, 1, 1, 7, 19, 15),
		Block.createCuboidShape(22, 18, 4, 27, 19, 5),
		Block.createCuboidShape(31, 21, 0, 32, 22, 16)
    );

    public Washer_Data() {
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

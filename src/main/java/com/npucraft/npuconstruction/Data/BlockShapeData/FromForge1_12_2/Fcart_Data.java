package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcart_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 15, 5, 10, 22, 7),
		Block.createCuboidShape(3, 15, 6, 5, 22, 13),
		Block.createCuboidShape(0, 2, -16, 14, 21, 3),
		Block.createCuboidShape(3, 21, -7, 11, 24, -5),
		Block.createCuboidShape(5, 15, 12, 10, 21, 14),
		Block.createCuboidShape(3, 21, -13, 11, 23, 1),
		Block.createCuboidShape(4, 21, 5, 10, 22, 14),
		Block.createCuboidShape(2, 21, -13, 3, 24, 2),
		Block.createCuboidShape(11, 21, -13, 12, 24, 2),
		Block.createCuboidShape(10, 15, 7, 11, 22, 12),
		Block.createCuboidShape(0, 15, 3, 2, 20, 16),
		Block.createCuboidShape(2, 15, 3, 12, 20, 5),
		Block.createCuboidShape(12, 15, 3, 14, 20, 16),
		Block.createCuboidShape(2, 15, 14, 12, 20, 16),
		Block.createCuboidShape(3, 21, 1, 11, 24, 2),
		Block.createCuboidShape(3, 21, -13, 11, 24, -13),
		Block.createCuboidShape(0, 2, 3, 14, 15, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 15, 4, 11, 22, 10),
		Block.createCuboidShape(3, 15, 3, 10, 22, 5),
		Block.createCuboidShape(13, 2, 0, 32, 21, 14),
		Block.createCuboidShape(21, 21, 3, 23, 24, 11),
		Block.createCuboidShape(2, 15, 5, 4, 21, 10),
		Block.createCuboidShape(15, 21, 3, 29, 23, 11),
		Block.createCuboidShape(2, 21, 4, 11, 22, 10),
		Block.createCuboidShape(14, 21, 2, 29, 24, 3),
		Block.createCuboidShape(14, 21, 11, 29, 24, 12),
		Block.createCuboidShape(4, 15, 10, 9, 22, 11),
		Block.createCuboidShape(0, 15, 0, 13, 20, 2),
		Block.createCuboidShape(11, 15, 2, 13, 20, 12),
		Block.createCuboidShape(0, 15, 12, 13, 20, 14),
		Block.createCuboidShape(0, 15, 2, 2, 20, 12),
		Block.createCuboidShape(14, 21, 3, 15, 24, 11),
		Block.createCuboidShape(29, 21, 3, 29, 24, 11),
		Block.createCuboidShape(0, 2, 0, 13, 15, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 15, 9, 12, 22, 11),
		Block.createCuboidShape(11, 15, 3, 13, 22, 10),
		Block.createCuboidShape(2, 2, 13, 16, 21, 32),
		Block.createCuboidShape(5, 21, 21, 13, 24, 23),
		Block.createCuboidShape(6, 15, 2, 11, 21, 4),
		Block.createCuboidShape(5, 21, 15, 13, 23, 29),
		Block.createCuboidShape(6, 21, 2, 12, 22, 11),
		Block.createCuboidShape(13, 21, 14, 14, 24, 29),
		Block.createCuboidShape(4, 21, 14, 5, 24, 29),
		Block.createCuboidShape(5, 15, 4, 6, 22, 9),
		Block.createCuboidShape(14, 15, 0, 16, 20, 13),
		Block.createCuboidShape(4, 15, 11, 14, 20, 13),
		Block.createCuboidShape(2, 15, 0, 4, 20, 13),
		Block.createCuboidShape(4, 15, 0, 14, 20, 2),
		Block.createCuboidShape(5, 21, 14, 13, 24, 15),
		Block.createCuboidShape(5, 21, 29, 13, 24, 29),
		Block.createCuboidShape(2, 2, 0, 16, 15, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 15, 6, 7, 22, 12),
		Block.createCuboidShape(6, 15, 11, 13, 22, 13),
		Block.createCuboidShape(-16, 2, 2, 3, 21, 16),
		Block.createCuboidShape(-7, 21, 5, -5, 24, 13),
		Block.createCuboidShape(12, 15, 6, 14, 21, 11),
		Block.createCuboidShape(-13, 21, 5, 1, 23, 13),
		Block.createCuboidShape(5, 21, 6, 14, 22, 12),
		Block.createCuboidShape(-13, 21, 13, 2, 24, 14),
		Block.createCuboidShape(-13, 21, 4, 2, 24, 5),
		Block.createCuboidShape(7, 15, 5, 12, 22, 6),
		Block.createCuboidShape(3, 15, 14, 16, 20, 16),
		Block.createCuboidShape(3, 15, 4, 5, 20, 14),
		Block.createCuboidShape(3, 15, 2, 16, 20, 4),
		Block.createCuboidShape(14, 15, 4, 16, 20, 14),
		Block.createCuboidShape(1, 21, 5, 2, 24, 13),
		Block.createCuboidShape(-13, 21, 5, -13, 24, 13),
		Block.createCuboidShape(3, 2, 2, 16, 15, 16)
    );

    public Fcart_Data() {
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

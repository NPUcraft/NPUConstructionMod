package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Yf8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 1, 5, 23, 13, 6),
		Block.createCuboidShape(2, 0, 6, 24, 14, 15),
		Block.createCuboidShape(1, 2, 11, 2, 7, 14),
		Block.createCuboidShape(6, -1, 4, 7, 0, 17),
		Block.createCuboidShape(7, -1, 9, 20, 0, 10),
		Block.createCuboidShape(20, -1, 4, 21, 0, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 1, 3, 11, 13, 23),
		Block.createCuboidShape(1, 0, 2, 10, 14, 24),
		Block.createCuboidShape(2, 2, 1, 5, 7, 2),
		Block.createCuboidShape(-1, -1, 6, 12, 0, 7),
		Block.createCuboidShape(6, -1, 7, 7, 0, 20),
		Block.createCuboidShape(-1, -1, 20, 12, 0, 21)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 1, 10, 13, 13, 11),
		Block.createCuboidShape(-8, 0, 1, 14, 14, 10),
		Block.createCuboidShape(14, 2, 2, 15, 7, 5),
		Block.createCuboidShape(9, -1, -1, 10, 0, 12),
		Block.createCuboidShape(-4, -1, 6, 9, 0, 7),
		Block.createCuboidShape(-5, -1, -1, -4, 0, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 1, -7, 6, 13, 13),
		Block.createCuboidShape(6, 0, -8, 15, 14, 14),
		Block.createCuboidShape(11, 2, 14, 14, 7, 15),
		Block.createCuboidShape(4, -1, 9, 17, 0, 10),
		Block.createCuboidShape(9, -1, -4, 10, 0, 9),
		Block.createCuboidShape(4, -1, -5, 17, 0, -4)
    );

    public Yf8_Data() {
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

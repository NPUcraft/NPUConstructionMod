package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Ttable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 17, 0, 16, 17, 16),
		Block.createCuboidShape(-8, 15, 0, 8, 17, 1),
		Block.createCuboidShape(-9, 15, 4, -8, 17, 19),
		Block.createCuboidShape(13, 15, -3, 14, 17, 12),
		Block.createCuboidShape(-14, 15, 15, 14, 17, 16),
		Block.createCuboidShape(7, 1, 1, 8, 15, 2),
		Block.createCuboidShape(13, 1, 14, 14, 15, 15),
		Block.createCuboidShape(-14, 1, 14, -13, 15, 15),
		Block.createCuboidShape(-8, 1, 1, -7, 15, 2)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 17, -16, 16, 17, 16),
		Block.createCuboidShape(15, 15, -8, 16, 17, 8),
		Block.createCuboidShape(-3, 15, -9, 12, 17, -8),
		Block.createCuboidShape(4, 15, 13, 19, 17, 14),
		Block.createCuboidShape(0, 15, -14, 1, 17, 14),
		Block.createCuboidShape(14, 1, 7, 15, 15, 8),
		Block.createCuboidShape(1, 1, 13, 2, 15, 14),
		Block.createCuboidShape(1, 1, -14, 2, 15, -13),
		Block.createCuboidShape(14, 1, -8, 15, 15, -7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 17, 0, 32, 17, 16),
		Block.createCuboidShape(8, 15, 15, 24, 17, 16),
		Block.createCuboidShape(24, 15, -3, 25, 17, 12),
		Block.createCuboidShape(2, 15, 4, 3, 17, 19),
		Block.createCuboidShape(2, 15, 0, 30, 17, 1),
		Block.createCuboidShape(8, 1, 14, 9, 15, 15),
		Block.createCuboidShape(2, 1, 1, 3, 15, 2),
		Block.createCuboidShape(29, 1, 1, 30, 15, 2),
		Block.createCuboidShape(23, 1, 14, 24, 15, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 17, 0, 16, 17, 32),
		Block.createCuboidShape(0, 15, 8, 1, 17, 24),
		Block.createCuboidShape(4, 15, 24, 19, 17, 25),
		Block.createCuboidShape(-3, 15, 2, 12, 17, 3),
		Block.createCuboidShape(15, 15, 2, 16, 17, 30),
		Block.createCuboidShape(1, 1, 8, 2, 15, 9),
		Block.createCuboidShape(14, 1, 2, 15, 15, 3),
		Block.createCuboidShape(14, 1, 29, 15, 15, 30),
		Block.createCuboidShape(1, 1, 23, 2, 15, 24)
    );

    public Ttable_Data() {
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

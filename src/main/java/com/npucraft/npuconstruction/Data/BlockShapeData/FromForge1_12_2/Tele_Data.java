package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Tele_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 7, 14, 12, 9, 16),
		Block.createCuboidShape(-12, 24, 14, 12, 25, 15),
		Block.createCuboidShape(-13, 7, 14, -12, 25, 15),
		Block.createCuboidShape(12, 7, 14, 13, 25, 15),
		Block.createCuboidShape(-12, 9, 15, 12, 24, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 7, -12, 2, 9, 12),
		Block.createCuboidShape(1, 24, -12, 2, 25, 12),
		Block.createCuboidShape(1, 7, -13, 2, 25, -12),
		Block.createCuboidShape(1, 7, 12, 2, 25, 13),
		Block.createCuboidShape(0, 9, -12, 1, 24, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, 7, 0, 28, 9, 2),
		Block.createCuboidShape(4, 24, 1, 28, 25, 2),
		Block.createCuboidShape(28, 7, 1, 29, 25, 2),
		Block.createCuboidShape(3, 7, 1, 4, 25, 2),
		Block.createCuboidShape(4, 9, 0, 28, 24, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 7, 4, 16, 9, 28),
		Block.createCuboidShape(14, 24, 4, 15, 25, 28),
		Block.createCuboidShape(14, 7, 28, 15, 25, 29),
		Block.createCuboidShape(14, 7, 3, 15, 25, 4),
		Block.createCuboidShape(15, 9, 4, 16, 24, 28)
    );

    public Tele_Data() {
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

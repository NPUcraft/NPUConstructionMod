package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyfdoor3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(20, -16, 6, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 6, -4, 32, 16),
		Block.createCuboidShape(-4, -16, 9, -3, 32, 13),
		Block.createCuboidShape(19, -16, 9, 20, 32, 13),
		Block.createCuboidShape(18, -16, 10, 19, 32, 12),
		Block.createCuboidShape(-2, 31, 10, 18, 32, 12),
		Block.createCuboidShape(-3, -16, 10, -2, 32, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 20, 10, 32, 32),
		Block.createCuboidShape(0, -16, -16, 10, 32, -4),
		Block.createCuboidShape(3, -16, -4, 7, 32, -3),
		Block.createCuboidShape(3, -16, 19, 7, 32, 20),
		Block.createCuboidShape(4, -16, 18, 6, 32, 19),
		Block.createCuboidShape(4, 31, -2, 6, 32, 18),
		Block.createCuboidShape(4, -16, -3, 6, 32, -2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -16, 0, -4, 32, 10),
		Block.createCuboidShape(20, -16, 0, 32, 32, 10),
		Block.createCuboidShape(19, -16, 3, 20, 32, 7),
		Block.createCuboidShape(-4, -16, 3, -3, 32, 7),
		Block.createCuboidShape(-3, -16, 4, -2, 32, 6),
		Block.createCuboidShape(-2, 31, 4, 18, 32, 6),
		Block.createCuboidShape(18, -16, 4, 19, 32, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, -16, 16, 32, -4),
		Block.createCuboidShape(6, -16, 20, 16, 32, 32),
		Block.createCuboidShape(9, -16, 19, 13, 32, 20),
		Block.createCuboidShape(9, -16, -4, 13, 32, -3),
		Block.createCuboidShape(10, -16, -3, 12, 32, -2),
		Block.createCuboidShape(10, 31, -2, 12, 32, 18),
		Block.createCuboidShape(10, -16, 18, 12, 32, 19)
    );

    public Fyfdoor3_Data() {
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

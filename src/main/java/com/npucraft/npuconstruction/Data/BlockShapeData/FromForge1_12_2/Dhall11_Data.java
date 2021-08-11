package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall11_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 15, 15, 18, 16),
		Block.createCuboidShape(0, 0, 1, 1, 18, 16),
		Block.createCuboidShape(0, 12, 13, 15, 12, 20),
		Block.createCuboidShape(-4, 15, 0, 3, 16, 8),
		Block.createCuboidShape(8, 15, 13, 16, 16, 20),
		Block.createCuboidShape(-3, 0, 0, 3, 18, 1),
		Block.createCuboidShape(-3, 18, 0, 3, 19, 9),
		Block.createCuboidShape(-3, 12, 1, 3, 12, 13),
		Block.createCuboidShape(7, 18, 13, 16, 19, 20),
		Block.createCuboidShape(15, 0, 13, 16, 18, 20)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 1, 1, 18, 15),
		Block.createCuboidShape(0, 0, 0, 15, 18, 1),
		Block.createCuboidShape(-4, 12, 0, 3, 12, 15),
		Block.createCuboidShape(8, 15, -4, 16, 16, 3),
		Block.createCuboidShape(-4, 15, 8, 3, 16, 16),
		Block.createCuboidShape(15, 0, -3, 16, 18, 3),
		Block.createCuboidShape(7, 18, -3, 16, 19, 3),
		Block.createCuboidShape(3, 12, -3, 15, 12, 3),
		Block.createCuboidShape(-4, 18, 7, 3, 19, 16),
		Block.createCuboidShape(-4, 0, 15, 3, 18, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 0, 15, 18, 1),
		Block.createCuboidShape(15, 0, 0, 16, 18, 15),
		Block.createCuboidShape(1, 12, -4, 16, 12, 3),
		Block.createCuboidShape(13, 15, 8, 20, 16, 16),
		Block.createCuboidShape(0, 15, -4, 8, 16, 3),
		Block.createCuboidShape(13, 0, 15, 19, 18, 16),
		Block.createCuboidShape(13, 18, 7, 19, 19, 16),
		Block.createCuboidShape(13, 12, 3, 19, 12, 15),
		Block.createCuboidShape(0, 18, -4, 9, 19, 3),
		Block.createCuboidShape(0, 0, -4, 1, 18, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 0, 1, 16, 18, 15),
		Block.createCuboidShape(1, 0, 15, 16, 18, 16),
		Block.createCuboidShape(13, 12, 1, 20, 12, 16),
		Block.createCuboidShape(0, 15, 13, 8, 16, 20),
		Block.createCuboidShape(13, 15, 0, 20, 16, 8),
		Block.createCuboidShape(0, 0, 13, 1, 18, 19),
		Block.createCuboidShape(0, 18, 13, 9, 19, 19),
		Block.createCuboidShape(1, 12, 13, 13, 12, 19),
		Block.createCuboidShape(13, 18, 0, 20, 19, 9),
		Block.createCuboidShape(13, 0, 0, 20, 18, 1)
    );

    public Dhall11_Data() {
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

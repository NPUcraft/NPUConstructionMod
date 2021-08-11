package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Froadblocks_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(22, 0, 3, 24, 6, 13),
		Block.createCuboidShape(-8, 0, 3, -6, 6, 13),
		Block.createCuboidShape(-7, 2, 7, 23, 7, 9),
		Block.createCuboidShape(0, 7, 7, 17, 19, 9),
		Block.createCuboidShape(22, 3, 7, 25, 22, 9),
		Block.createCuboidShape(-8, 3, 7, -6, 22, 9),
		Block.createCuboidShape(-4, 19, 7, 20, 20, 9),
		Block.createCuboidShape(-6, 12, 7, 22, 14, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 0, 22, 13, 6, 24),
		Block.createCuboidShape(3, 0, -8, 13, 6, -6),
		Block.createCuboidShape(7, 2, -7, 9, 7, 23),
		Block.createCuboidShape(7, 7, 0, 9, 19, 17),
		Block.createCuboidShape(7, 3, 22, 9, 22, 25),
		Block.createCuboidShape(7, 3, -8, 9, 22, -6),
		Block.createCuboidShape(7, 19, -4, 9, 20, 20),
		Block.createCuboidShape(7, 12, -6, 9, 14, 22)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 0, 3, -6, 6, 13),
		Block.createCuboidShape(22, 0, 3, 24, 6, 13),
		Block.createCuboidShape(-7, 2, 7, 23, 7, 9),
		Block.createCuboidShape(-1, 7, 7, 16, 19, 9),
		Block.createCuboidShape(-9, 3, 7, -6, 22, 9),
		Block.createCuboidShape(22, 3, 7, 24, 22, 9),
		Block.createCuboidShape(-4, 19, 7, 20, 20, 9),
		Block.createCuboidShape(-6, 12, 7, 22, 14, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 0, -8, 13, 6, -6),
		Block.createCuboidShape(3, 0, 22, 13, 6, 24),
		Block.createCuboidShape(7, 2, -7, 9, 7, 23),
		Block.createCuboidShape(7, 7, -1, 9, 19, 16),
		Block.createCuboidShape(7, 3, -9, 9, 22, -6),
		Block.createCuboidShape(7, 3, 22, 9, 22, 24),
		Block.createCuboidShape(7, 19, -4, 9, 20, 20),
		Block.createCuboidShape(7, 12, -6, 9, 14, 22)
    );

    public Froadblocks_Data() {
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

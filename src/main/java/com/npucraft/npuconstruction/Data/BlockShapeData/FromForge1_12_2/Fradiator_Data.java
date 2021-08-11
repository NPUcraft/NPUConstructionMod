package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fradiator_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-7, 1, 14, 6, 15, 15),
		Block.createCuboidShape(4, 0, 13, 7, 16, 16),
		Block.createCuboidShape(0, 0, 13, 3, 16, 16),
		Block.createCuboidShape(-4, 0, 13, -1, 16, 16),
		Block.createCuboidShape(-8, 0, 13, -5, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 1, -7, 2, 15, 6),
		Block.createCuboidShape(0, 0, 4, 3, 16, 7),
		Block.createCuboidShape(0, 0, 0, 3, 16, 3),
		Block.createCuboidShape(0, 0, -4, 3, 16, -1),
		Block.createCuboidShape(0, 0, -8, 3, 16, -5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(10, 1, 1, 23, 15, 2),
		Block.createCuboidShape(9, 0, 0, 12, 16, 3),
		Block.createCuboidShape(13, 0, 0, 16, 16, 3),
		Block.createCuboidShape(17, 0, 0, 20, 16, 3),
		Block.createCuboidShape(21, 0, 0, 24, 16, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 1, 10, 15, 15, 23),
		Block.createCuboidShape(13, 0, 9, 16, 16, 12),
		Block.createCuboidShape(13, 0, 13, 16, 16, 16),
		Block.createCuboidShape(13, 0, 17, 16, 16, 20),
		Block.createCuboidShape(13, 0, 21, 16, 16, 24)
    );

    public Fradiator_Data() {
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

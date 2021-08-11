package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Radiator_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(9, 1, 14, 22, 15, 15),
		Block.createCuboidShape(20, 0, 13, 23, 16, 16),
		Block.createCuboidShape(16, 0, 13, 19, 16, 16),
		Block.createCuboidShape(12, 0, 13, 15, 16, 16),
		Block.createCuboidShape(8, 0, 13, 11, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 1, 9, 2, 15, 22),
		Block.createCuboidShape(0, 0, 20, 3, 16, 23),
		Block.createCuboidShape(0, 0, 16, 3, 16, 19),
		Block.createCuboidShape(0, 0, 12, 3, 16, 15),
		Block.createCuboidShape(0, 0, 8, 3, 16, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-6, 1, 1, 7, 15, 2),
		Block.createCuboidShape(-7, 0, 0, -4, 16, 3),
		Block.createCuboidShape(-3, 0, 0, 0, 16, 3),
		Block.createCuboidShape(1, 0, 0, 4, 16, 3),
		Block.createCuboidShape(5, 0, 0, 8, 16, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 1, -6, 15, 15, 7),
		Block.createCuboidShape(13, 0, -7, 16, 16, -4),
		Block.createCuboidShape(13, 0, -3, 16, 16, 0),
		Block.createCuboidShape(13, 0, 1, 16, 16, 4),
		Block.createCuboidShape(13, 0, 5, 16, 16, 8)
    );

    public Radiator_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sit_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, -9, 15, 16, -2, 16),
		Block.createCuboidShape(7, -2, 15, 17, 6, 16),
		Block.createCuboidShape(0, 6, 15, 19, 8, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -9, 0, 1, -2, 16),
		Block.createCuboidShape(0, -2, 7, 1, 6, 17),
		Block.createCuboidShape(0, 6, 0, 1, 8, 19)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -9, 0, 16, -2, 1),
		Block.createCuboidShape(-1, -2, 0, 9, 6, 1),
		Block.createCuboidShape(-3, 6, 0, 16, 8, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, -9, 0, 16, -2, 16),
		Block.createCuboidShape(15, -2, -1, 16, 6, 9),
		Block.createCuboidShape(15, 6, -3, 16, 8, 16)
    );

    public Sit_Data() {
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

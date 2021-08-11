package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sky_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-13, 0, 15, 25, 4, 16),
		Block.createCuboidShape(-16, -7, 15, 27, -4, 16),
		Block.createCuboidShape(8, 1, 15, 26, 10, 16),
		Block.createCuboidShape(-15, 6, 15, 3, 8, 16),
		Block.createCuboidShape(-9, -6, 15, -7, 3, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -13, 1, 4, 25),
		Block.createCuboidShape(0, -7, -16, 1, -4, 27),
		Block.createCuboidShape(0, 1, 8, 1, 10, 26),
		Block.createCuboidShape(0, 6, -15, 1, 8, 3),
		Block.createCuboidShape(0, -6, -9, 1, 3, -7)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-9, 0, 0, 29, 4, 1),
		Block.createCuboidShape(-11, -7, 0, 32, -4, 1),
		Block.createCuboidShape(-10, 1, 0, 8, 10, 1),
		Block.createCuboidShape(13, 6, 0, 31, 8, 1),
		Block.createCuboidShape(23, -6, 0, 25, 3, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 0, -9, 16, 4, 29),
		Block.createCuboidShape(15, -7, -11, 16, -4, 32),
		Block.createCuboidShape(15, 1, -10, 16, 10, 8),
		Block.createCuboidShape(15, 6, 13, 16, 8, 31),
		Block.createCuboidShape(15, -6, 23, 16, 3, 25)
    );

    public Sky_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Platform_desk_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 8, 1, 18, 24, 16),
		Block.createCuboidShape(-5, 24, 2, 21, 30, 16),
		Block.createCuboidShape(-3, 27, 4, 9, 32, 11),
		Block.createCuboidShape(-4, 29, -1, 20, 32, 4),
		Block.createCuboidShape(-5, 29, 2, -4, 32, 17),
		Block.createCuboidShape(20, 29, 2, 21, 32, 17),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(1, 24, 0, 15, 30, 3),
		Block.createCuboidShape(-6, 24, 0, 1, 32, 1),
		Block.createCuboidShape(15, 24, 0, 22, 32, 1)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 8, -2, 15, 24, 18),
		Block.createCuboidShape(0, 24, -5, 14, 30, 21),
		Block.createCuboidShape(5, 27, -3, 12, 32, 9),
		Block.createCuboidShape(12, 29, -4, 17, 32, 20),
		Block.createCuboidShape(-1, 29, -5, 14, 32, -4),
		Block.createCuboidShape(-1, 29, 20, 14, 32, 21),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(13, 24, 1, 16, 30, 15),
		Block.createCuboidShape(15, 24, -6, 16, 32, 1),
		Block.createCuboidShape(15, 24, 15, 16, 32, 22)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 8, 0, 18, 24, 15),
		Block.createCuboidShape(-5, 24, 0, 21, 30, 14),
		Block.createCuboidShape(7, 27, 5, 19, 32, 12),
		Block.createCuboidShape(-4, 29, 12, 20, 32, 17),
		Block.createCuboidShape(20, 29, -1, 21, 32, 14),
		Block.createCuboidShape(-5, 29, -1, -4, 32, 14),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(1, 24, 13, 15, 30, 16),
		Block.createCuboidShape(15, 24, 15, 22, 32, 16),
		Block.createCuboidShape(-6, 24, 15, 1, 32, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 8, -2, 16, 24, 18),
		Block.createCuboidShape(2, 24, -5, 16, 30, 21),
		Block.createCuboidShape(4, 27, 7, 11, 32, 19),
		Block.createCuboidShape(-1, 29, -4, 4, 32, 20),
		Block.createCuboidShape(2, 29, 20, 17, 32, 21),
		Block.createCuboidShape(2, 29, -5, 17, 32, -4),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16),
		Block.createCuboidShape(0, 24, 1, 3, 30, 15),
		Block.createCuboidShape(0, 24, 15, 1, 32, 22),
		Block.createCuboidShape(0, 24, -6, 1, 32, 1)
    );

    public Platform_desk_Data() {
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

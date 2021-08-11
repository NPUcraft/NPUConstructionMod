package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Acadd1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 21, 6, 2, 29, 8),
		Block.createCuboidShape(-2, 21, 23, 2, 29, 25),
		Block.createCuboidShape(-3, 20, -1, 2, 21, 32),
		Block.createCuboidShape(-3, 0, -1, 2, 1, 32),
		Block.createCuboidShape(-3, 1, -1, 1, 20, 32),
		Block.createCuboidShape(1, 0, -1, 3, 21, 32),
		Block.createCuboidShape(3, 0, 13, 4, 20, 18),
		Block.createCuboidShape(-4, 0, 13, -3, 20, 18),
		Block.createCuboidShape(1, 2, 15, 9, 14, 16),
		Block.createCuboidShape(10, 9, 15, 18, 21, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 21, -2, 10, 29, 2),
		Block.createCuboidShape(-9, 21, -2, -7, 29, 2),
		Block.createCuboidShape(-16, 20, -3, 17, 21, 2),
		Block.createCuboidShape(-16, 0, -3, 17, 1, 2),
		Block.createCuboidShape(-16, 1, -3, 17, 20, 1),
		Block.createCuboidShape(-16, 0, 1, 17, 21, 3),
		Block.createCuboidShape(-2, 0, 3, 3, 20, 4),
		Block.createCuboidShape(-2, 0, -4, 3, 20, -3),
		Block.createCuboidShape(0, 2, 1, 1, 14, 9),
		Block.createCuboidShape(0, 9, 10, 1, 21, 18)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(14, 21, 8, 18, 29, 10),
		Block.createCuboidShape(14, 21, -9, 18, 29, -7),
		Block.createCuboidShape(14, 20, -16, 19, 21, 17),
		Block.createCuboidShape(14, 0, -16, 19, 1, 17),
		Block.createCuboidShape(15, 1, -16, 19, 20, 17),
		Block.createCuboidShape(13, 0, -16, 15, 21, 17),
		Block.createCuboidShape(12, 0, -2, 13, 20, 3),
		Block.createCuboidShape(19, 0, -2, 20, 20, 3),
		Block.createCuboidShape(7, 2, 0, 15, 14, 1),
		Block.createCuboidShape(-2, 9, 0, 6, 21, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 21, 14, 8, 29, 18),
		Block.createCuboidShape(23, 21, 14, 25, 29, 18),
		Block.createCuboidShape(-1, 20, 14, 32, 21, 19),
		Block.createCuboidShape(-1, 0, 14, 32, 1, 19),
		Block.createCuboidShape(-1, 1, 15, 32, 20, 19),
		Block.createCuboidShape(-1, 0, 13, 32, 21, 15),
		Block.createCuboidShape(13, 0, 12, 18, 20, 13),
		Block.createCuboidShape(13, 0, 19, 18, 20, 20),
		Block.createCuboidShape(15, 2, 7, 16, 14, 15),
		Block.createCuboidShape(15, 9, -2, 16, 21, 6)
    );

    public Acadd1_Data() {
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

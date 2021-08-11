package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dw8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, -1, 5, 12, 5, 11),
		Block.createCuboidShape(13, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-16, -16, -1, -13, 32, 17),
		Block.createCuboidShape(-13, 30, -1, 13, 32, 17),
		Block.createCuboidShape(9, -16, 7, 14, 32, 9),
		Block.createCuboidShape(2, 26, 7, 10, 31, 9),
		Block.createCuboidShape(-14, -16, 7, 3, 31, 9),
		Block.createCuboidShape(3, -16, 7, 9, 8, 9),
		Block.createCuboidShape(3, 8, 7, 9, 26, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -1, 10, 11, 5, 12),
		Block.createCuboidShape(-1, -16, 13, 17, 32, 16),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -13),
		Block.createCuboidShape(-1, 30, -13, 17, 32, 13),
		Block.createCuboidShape(7, -16, 9, 9, 32, 14),
		Block.createCuboidShape(7, 26, 2, 9, 31, 10),
		Block.createCuboidShape(7, -16, -14, 9, 31, 3),
		Block.createCuboidShape(7, -16, 3, 9, 8, 9),
		Block.createCuboidShape(7, 8, 3, 9, 26, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, -1, 5, 6, 5, 11),
		Block.createCuboidShape(0, -16, -1, 3, 32, 17),
		Block.createCuboidShape(29, -16, -1, 32, 32, 17),
		Block.createCuboidShape(3, 30, -1, 29, 32, 17),
		Block.createCuboidShape(2, -16, 7, 7, 32, 9),
		Block.createCuboidShape(6, 26, 7, 14, 31, 9),
		Block.createCuboidShape(13, -16, 7, 30, 31, 9),
		Block.createCuboidShape(7, -16, 7, 13, 8, 9),
		Block.createCuboidShape(7, 8, 7, 13, 26, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -1, 4, 11, 5, 6),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 3),
		Block.createCuboidShape(-1, -16, 29, 17, 32, 32),
		Block.createCuboidShape(-1, 30, 3, 17, 32, 29),
		Block.createCuboidShape(7, -16, 2, 9, 32, 7),
		Block.createCuboidShape(7, 26, 6, 9, 31, 14),
		Block.createCuboidShape(7, -16, 13, 9, 31, 30),
		Block.createCuboidShape(7, -16, 7, 9, 8, 13),
		Block.createCuboidShape(7, 8, 7, 9, 26, 13)
    );

    public Dw8_Data() {
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

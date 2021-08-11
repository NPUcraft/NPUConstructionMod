package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class D3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(25, 4, 3, 26, 14, 9),
		Block.createCuboidShape(10, 26, 5, 26, 31, 9),
		Block.createCuboidShape(10, -15, 5, 26, -10, 9),
		Block.createCuboidShape(10, 5, 5, 26, 9, 9),
		Block.createCuboidShape(23, -15, 5, 28, 31, 7),
		Block.createCuboidShape(5, -12, 6, 6, 27, 7),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(7, -15, 6, 8, 31, 10),
		Block.createCuboidShape(6, -15, 7, 7, 31, 9),
		Block.createCuboidShape(-16, 31, 5, 31, 32, 11),
		Block.createCuboidShape(-16, -16, 6, 31, -15, 10),
		Block.createCuboidShape(26, -15, 7, 31, 31, 9),
		Block.createCuboidShape(8, -15, 7, 13, 31, 9),
		Block.createCuboidShape(18, -15, 7, 21, 31, 9),
		Block.createCuboidShape(6, -15, 5, 10, 31, 7),
		Block.createCuboidShape(15, -15, 5, 18, 31, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 4, 25, 13, 14, 26),
		Block.createCuboidShape(7, 26, 10, 11, 31, 26),
		Block.createCuboidShape(7, -15, 10, 11, -10, 26),
		Block.createCuboidShape(7, 5, 10, 11, 9, 26),
		Block.createCuboidShape(9, -15, 23, 11, 31, 28),
		Block.createCuboidShape(9, -12, 5, 10, 27, 6),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(6, -15, 7, 10, 31, 8),
		Block.createCuboidShape(7, -15, 6, 9, 31, 7),
		Block.createCuboidShape(5, 31, -16, 11, 32, 31),
		Block.createCuboidShape(6, -16, -16, 10, -15, 31),
		Block.createCuboidShape(7, -15, 26, 9, 31, 31),
		Block.createCuboidShape(7, -15, 8, 9, 31, 13),
		Block.createCuboidShape(7, -15, 18, 9, 31, 21),
		Block.createCuboidShape(9, -15, 6, 11, 31, 10),
		Block.createCuboidShape(9, -15, 15, 11, 31, 18)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-10, 4, 7, -9, 14, 13),
		Block.createCuboidShape(-10, 26, 7, 6, 31, 11),
		Block.createCuboidShape(-10, -15, 7, 6, -10, 11),
		Block.createCuboidShape(-10, 5, 7, 6, 9, 11),
		Block.createCuboidShape(-12, -15, 9, -7, 31, 11),
		Block.createCuboidShape(10, -12, 9, 11, 27, 10),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(8, -15, 6, 9, 31, 10),
		Block.createCuboidShape(9, -15, 7, 10, 31, 9),
		Block.createCuboidShape(-15, 31, 5, 32, 32, 11),
		Block.createCuboidShape(-15, -16, 6, 32, -15, 10),
		Block.createCuboidShape(-15, -15, 7, -10, 31, 9),
		Block.createCuboidShape(3, -15, 7, 8, 31, 9),
		Block.createCuboidShape(-5, -15, 7, -2, 31, 9),
		Block.createCuboidShape(6, -15, 9, 10, 31, 11),
		Block.createCuboidShape(-2, -15, 9, 1, 31, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 4, -10, 9, 14, -9),
		Block.createCuboidShape(5, 26, -10, 9, 31, 6),
		Block.createCuboidShape(5, -15, -10, 9, -10, 6),
		Block.createCuboidShape(5, 5, -10, 9, 9, 6),
		Block.createCuboidShape(5, -15, -12, 7, 31, -7),
		Block.createCuboidShape(6, -12, 10, 7, 27, 11),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(6, -15, 8, 10, 31, 9),
		Block.createCuboidShape(7, -15, 9, 9, 31, 10),
		Block.createCuboidShape(5, 31, -15, 11, 32, 32),
		Block.createCuboidShape(6, -16, -15, 10, -15, 32),
		Block.createCuboidShape(7, -15, -15, 9, 31, -10),
		Block.createCuboidShape(7, -15, 3, 9, 31, 8),
		Block.createCuboidShape(7, -15, -5, 9, 31, -2),
		Block.createCuboidShape(5, -15, 6, 7, 31, 10),
		Block.createCuboidShape(5, -15, -2, 7, 31, 1)
    );

    public D3_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 8, 7, 3, 30, 9),
		Block.createCuboidShape(13, 8, 7, 28, 30, 9),
		Block.createCuboidShape(-13, -14, 7, 29, 7, 9),
		Block.createCuboidShape(7, -15, 7, 9, 30, 9),
		Block.createCuboidShape(-13, 29, 7, 29, 30, 9),
		Block.createCuboidShape(-13, -15, 7, 29, -14, 9),
		Block.createCuboidShape(-13, 7, 7, 29, 8, 9),
		Block.createCuboidShape(30, -16, 5, 32, 32, 11),
		Block.createCuboidShape(-14, -16, 5, 30, -15, 11),
		Block.createCuboidShape(-14, 30, 5, 30, 32, 11),
		Block.createCuboidShape(-16, -16, 5, -14, 32, 11),
		Block.createCuboidShape(29, -15, 7, 30, 30, 9),
		Block.createCuboidShape(-14, -15, 7, -13, 30, 9),
		Block.createCuboidShape(11, 8, 7, 12, 30, 9),
		Block.createCuboidShape(4, 8, 7, 5, 30, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 8, -12, 9, 30, 3),
		Block.createCuboidShape(7, 8, 13, 9, 30, 28),
		Block.createCuboidShape(7, -14, -13, 9, 7, 29),
		Block.createCuboidShape(7, -15, 7, 9, 30, 9),
		Block.createCuboidShape(7, 29, -13, 9, 30, 29),
		Block.createCuboidShape(7, -15, -13, 9, -14, 29),
		Block.createCuboidShape(7, 7, -13, 9, 8, 29),
		Block.createCuboidShape(5, -16, 30, 11, 32, 32),
		Block.createCuboidShape(5, -16, -14, 11, -15, 30),
		Block.createCuboidShape(5, 30, -14, 11, 32, 30),
		Block.createCuboidShape(5, -16, -16, 11, 32, -14),
		Block.createCuboidShape(7, -15, 29, 9, 30, 30),
		Block.createCuboidShape(7, -15, -14, 9, 30, -13),
		Block.createCuboidShape(7, 8, 11, 9, 30, 12),
		Block.createCuboidShape(7, 8, 4, 9, 30, 5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(13, 8, 7, 28, 30, 9),
		Block.createCuboidShape(-12, 8, 7, 3, 30, 9),
		Block.createCuboidShape(-13, -14, 7, 29, 7, 9),
		Block.createCuboidShape(7, -15, 7, 9, 30, 9),
		Block.createCuboidShape(-13, 29, 7, 29, 30, 9),
		Block.createCuboidShape(-13, -15, 7, 29, -14, 9),
		Block.createCuboidShape(-13, 7, 7, 29, 8, 9),
		Block.createCuboidShape(-16, -16, 5, -14, 32, 11),
		Block.createCuboidShape(-14, -16, 5, 30, -15, 11),
		Block.createCuboidShape(-14, 30, 5, 30, 32, 11),
		Block.createCuboidShape(30, -16, 5, 32, 32, 11),
		Block.createCuboidShape(-14, -15, 7, -13, 30, 9),
		Block.createCuboidShape(29, -15, 7, 30, 30, 9),
		Block.createCuboidShape(4, 8, 7, 5, 30, 9),
		Block.createCuboidShape(11, 8, 7, 12, 30, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 8, 13, 9, 30, 28),
		Block.createCuboidShape(7, 8, -12, 9, 30, 3),
		Block.createCuboidShape(7, -14, -13, 9, 7, 29),
		Block.createCuboidShape(7, -15, 7, 9, 30, 9),
		Block.createCuboidShape(7, 29, -13, 9, 30, 29),
		Block.createCuboidShape(7, -15, -13, 9, -14, 29),
		Block.createCuboidShape(7, 7, -13, 9, 8, 29),
		Block.createCuboidShape(5, -16, -16, 11, 32, -14),
		Block.createCuboidShape(5, -16, -14, 11, -15, 30),
		Block.createCuboidShape(5, 30, -14, 11, 32, 30),
		Block.createCuboidShape(5, -16, 30, 11, 32, 32),
		Block.createCuboidShape(7, -15, -14, 9, 30, -13),
		Block.createCuboidShape(7, -15, 29, 9, 30, 30),
		Block.createCuboidShape(7, 8, 4, 9, 30, 5),
		Block.createCuboidShape(7, 8, 11, 9, 30, 12)
    );

    public Door10_Data() {
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

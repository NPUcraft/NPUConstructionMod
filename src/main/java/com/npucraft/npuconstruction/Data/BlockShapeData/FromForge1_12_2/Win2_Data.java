package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, -16, 5, 31, -15, 11),
		Block.createCuboidShape(-15, 29, 6, 31, 30, 10),
		Block.createCuboidShape(-15, 4, 6, 31, 5, 10),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(7, -15, 6, 9, 4, 10),
		Block.createCuboidShape(-13, 28, 8, 6, 29, 10),
		Block.createCuboidShape(10, 28, 6, 29, 29, 8),
		Block.createCuboidShape(-13, 5, 8, 6, 6, 10),
		Block.createCuboidShape(10, 5, 6, 29, 6, 8),
		Block.createCuboidShape(-15, 5, 8, -13, 29, 10),
		Block.createCuboidShape(8, 5, 6, 10, 29, 8),
		Block.createCuboidShape(6, 5, 8, 8, 29, 10),
		Block.createCuboidShape(29, 5, 6, 31, 29, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -16, -15, 11, -15, 31),
		Block.createCuboidShape(6, 29, -15, 10, 30, 31),
		Block.createCuboidShape(6, 4, -15, 10, 5, 31),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(6, -15, 7, 10, 4, 9),
		Block.createCuboidShape(6, 28, -13, 8, 29, 6),
		Block.createCuboidShape(8, 28, 10, 10, 29, 29),
		Block.createCuboidShape(6, 5, -13, 8, 6, 6),
		Block.createCuboidShape(8, 5, 10, 10, 6, 29),
		Block.createCuboidShape(6, 5, -15, 8, 29, -13),
		Block.createCuboidShape(8, 5, 8, 10, 29, 10),
		Block.createCuboidShape(6, 5, 6, 8, 29, 8),
		Block.createCuboidShape(8, 5, 29, 10, 29, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, -16, 5, 31, -15, 11),
		Block.createCuboidShape(-15, 29, 6, 31, 30, 10),
		Block.createCuboidShape(-15, 4, 6, 31, 5, 10),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(7, -15, 6, 9, 4, 10),
		Block.createCuboidShape(10, 28, 6, 29, 29, 8),
		Block.createCuboidShape(-13, 28, 8, 6, 29, 10),
		Block.createCuboidShape(10, 5, 6, 29, 6, 8),
		Block.createCuboidShape(-13, 5, 8, 6, 6, 10),
		Block.createCuboidShape(29, 5, 6, 31, 29, 8),
		Block.createCuboidShape(6, 5, 8, 8, 29, 10),
		Block.createCuboidShape(8, 5, 6, 10, 29, 8),
		Block.createCuboidShape(-15, 5, 8, -13, 29, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -16, -15, 11, -15, 31),
		Block.createCuboidShape(6, 29, -15, 10, 30, 31),
		Block.createCuboidShape(6, 4, -15, 10, 5, 31),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(6, -15, 7, 10, 4, 9),
		Block.createCuboidShape(8, 28, 10, 10, 29, 29),
		Block.createCuboidShape(6, 28, -13, 8, 29, 6),
		Block.createCuboidShape(8, 5, 10, 10, 6, 29),
		Block.createCuboidShape(6, 5, -13, 8, 6, 6),
		Block.createCuboidShape(8, 5, 29, 10, 29, 31),
		Block.createCuboidShape(6, 5, 6, 8, 29, 8),
		Block.createCuboidShape(8, 5, 8, 10, 29, 10),
		Block.createCuboidShape(6, 5, -15, 8, 29, -13)
    );

    public Win2_Data() {
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

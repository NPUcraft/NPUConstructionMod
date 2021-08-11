package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn15_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 4, 6, 9, 10, 10),
		Block.createCuboidShape(-14, 30, 7, 30, 31, 9),
		Block.createCuboidShape(-14, -16, 7, 30, -15, 9),
		Block.createCuboidShape(-15, 5, 7, 31, 8, 7),
		Block.createCuboidShape(-15, 5, 9, 31, 8, 9),
		Block.createCuboidShape(5, 4, 6, 11, 10, 6),
		Block.createCuboidShape(5, 4, 10, 11, 10, 10),
		Block.createCuboidShape(10, -15, 7, 30, 30, 9),
		Block.createCuboidShape(-14, -15, 7, 6, 30, 9),
		Block.createCuboidShape(-16, 31, 6, 32, 32, 10),
		Block.createCuboidShape(6, -16, 7, 10, 31, 9),
		Block.createCuboidShape(30, -16, 7, 31, 31, 9),
		Block.createCuboidShape(-15, -16, 7, -14, 31, 9),
		Block.createCuboidShape(31, -16, 6, 32, 31, 10),
		Block.createCuboidShape(-16, -16, 6, -15, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, 7, 10, 10, 9),
		Block.createCuboidShape(7, 30, -14, 9, 31, 30),
		Block.createCuboidShape(7, -16, -14, 9, -15, 30),
		Block.createCuboidShape(9, 5, -15, 9, 8, 31),
		Block.createCuboidShape(7, 5, -15, 7, 8, 31),
		Block.createCuboidShape(10, 4, 5, 10, 10, 11),
		Block.createCuboidShape(6, 4, 5, 6, 10, 11),
		Block.createCuboidShape(7, -15, 10, 9, 30, 30),
		Block.createCuboidShape(7, -15, -14, 9, 30, 6),
		Block.createCuboidShape(6, 31, -16, 10, 32, 32),
		Block.createCuboidShape(7, -16, 6, 9, 31, 10),
		Block.createCuboidShape(7, -16, 30, 9, 31, 31),
		Block.createCuboidShape(7, -16, -15, 9, 31, -14),
		Block.createCuboidShape(6, -16, 31, 10, 31, 32),
		Block.createCuboidShape(6, -16, -16, 10, 31, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 4, 6, 9, 10, 10),
		Block.createCuboidShape(-14, 30, 7, 30, 31, 9),
		Block.createCuboidShape(-14, -16, 7, 30, -15, 9),
		Block.createCuboidShape(-15, 5, 9, 31, 8, 9),
		Block.createCuboidShape(-15, 5, 7, 31, 8, 7),
		Block.createCuboidShape(5, 4, 10, 11, 10, 10),
		Block.createCuboidShape(5, 4, 6, 11, 10, 6),
		Block.createCuboidShape(-14, -15, 7, 6, 30, 9),
		Block.createCuboidShape(10, -15, 7, 30, 30, 9),
		Block.createCuboidShape(-16, 31, 6, 32, 32, 10),
		Block.createCuboidShape(6, -16, 7, 10, 31, 9),
		Block.createCuboidShape(-15, -16, 7, -14, 31, 9),
		Block.createCuboidShape(30, -16, 7, 31, 31, 9),
		Block.createCuboidShape(-16, -16, 6, -15, 31, 10),
		Block.createCuboidShape(31, -16, 6, 32, 31, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, 7, 10, 10, 9),
		Block.createCuboidShape(7, 30, -14, 9, 31, 30),
		Block.createCuboidShape(7, -16, -14, 9, -15, 30),
		Block.createCuboidShape(7, 5, -15, 7, 8, 31),
		Block.createCuboidShape(9, 5, -15, 9, 8, 31),
		Block.createCuboidShape(6, 4, 5, 6, 10, 11),
		Block.createCuboidShape(10, 4, 5, 10, 10, 11),
		Block.createCuboidShape(7, -15, -14, 9, 30, 6),
		Block.createCuboidShape(7, -15, 10, 9, 30, 30),
		Block.createCuboidShape(6, 31, -16, 10, 32, 32),
		Block.createCuboidShape(7, -16, 6, 9, 31, 10),
		Block.createCuboidShape(7, -16, -15, 9, 31, -14),
		Block.createCuboidShape(7, -16, 30, 9, 31, 31),
		Block.createCuboidShape(6, -16, -16, 10, 31, -15),
		Block.createCuboidShape(6, -16, 31, 10, 31, 32)
    );

    public Winn15_Data() {
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

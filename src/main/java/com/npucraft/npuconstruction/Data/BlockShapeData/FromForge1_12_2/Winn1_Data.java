package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 5, 7, 31, 8, 7),
		Block.createCuboidShape(-15, 5, 9, 31, 8, 9),
		Block.createCuboidShape(-15, -15, 7, 7, 31, 9),
		Block.createCuboidShape(9, -15, 7, 31, 31, 9),
		Block.createCuboidShape(-16, -16, 7, 32, -15, 9),
		Block.createCuboidShape(-16, 31, 7, 32, 32, 9),
		Block.createCuboidShape(7, -15, 7, 9, 31, 9),
		Block.createCuboidShape(-16, -15, 7, -15, 31, 9),
		Block.createCuboidShape(31, -15, 7, 32, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 5, -15, 9, 8, 31),
		Block.createCuboidShape(7, 5, -15, 7, 8, 31),
		Block.createCuboidShape(7, -15, -15, 9, 31, 7),
		Block.createCuboidShape(7, -15, 9, 9, 31, 31),
		Block.createCuboidShape(7, -16, -16, 9, -15, 32),
		Block.createCuboidShape(7, 31, -16, 9, 32, 32),
		Block.createCuboidShape(7, -15, 7, 9, 31, 9),
		Block.createCuboidShape(7, -15, -16, 9, 31, -15),
		Block.createCuboidShape(7, -15, 31, 9, 31, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 5, 9, 31, 8, 9),
		Block.createCuboidShape(-15, 5, 7, 31, 8, 7),
		Block.createCuboidShape(9, -15, 7, 31, 31, 9),
		Block.createCuboidShape(-15, -15, 7, 7, 31, 9),
		Block.createCuboidShape(-16, -16, 7, 32, -15, 9),
		Block.createCuboidShape(-16, 31, 7, 32, 32, 9),
		Block.createCuboidShape(7, -15, 7, 9, 31, 9),
		Block.createCuboidShape(31, -15, 7, 32, 31, 9),
		Block.createCuboidShape(-16, -15, 7, -15, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 5, -15, 7, 8, 31),
		Block.createCuboidShape(9, 5, -15, 9, 8, 31),
		Block.createCuboidShape(7, -15, 9, 9, 31, 31),
		Block.createCuboidShape(7, -15, -15, 9, 31, 7),
		Block.createCuboidShape(7, -16, -16, 9, -15, 32),
		Block.createCuboidShape(7, 31, -16, 9, 32, 32),
		Block.createCuboidShape(7, -15, 7, 9, 31, 9),
		Block.createCuboidShape(7, -15, 31, 9, 31, 32),
		Block.createCuboidShape(7, -15, -16, 9, 31, -15)
    );

    public Winn1_Data() {
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

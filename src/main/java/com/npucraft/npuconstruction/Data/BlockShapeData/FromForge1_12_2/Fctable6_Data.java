package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fctable6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 3, 0, 30, 4, 1),
		Block.createCuboidShape(-14, 3, 15, 30, 4, 16),
		Block.createCuboidShape(-16, 0, 0, -14, 15, 1),
		Block.createCuboidShape(7, 0, 0, 9, 15, 1),
		Block.createCuboidShape(30, 0, 0, 32, 15, 1),
		Block.createCuboidShape(-16, 0, 15, -14, 15, 16),
		Block.createCuboidShape(7, 0, 15, 9, 15, 16),
		Block.createCuboidShape(30, 0, 15, 32, 15, 16),
		Block.createCuboidShape(-16, 15, 0, 32, 16, 16),
		Block.createCuboidShape(-15, 3, 1, 31, 4, 15),
		Block.createCuboidShape(31, 3, 1, 32, 4, 15),
		Block.createCuboidShape(-16, 3, 1, -15, 4, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 3, -14, 16, 4, 30),
		Block.createCuboidShape(0, 3, -14, 1, 4, 30),
		Block.createCuboidShape(15, 0, -16, 16, 15, -14),
		Block.createCuboidShape(15, 0, 7, 16, 15, 9),
		Block.createCuboidShape(15, 0, 30, 16, 15, 32),
		Block.createCuboidShape(0, 0, -16, 1, 15, -14),
		Block.createCuboidShape(0, 0, 7, 1, 15, 9),
		Block.createCuboidShape(0, 0, 30, 1, 15, 32),
		Block.createCuboidShape(0, 15, -16, 16, 16, 32),
		Block.createCuboidShape(1, 3, -15, 15, 4, 31),
		Block.createCuboidShape(1, 3, 31, 15, 4, 32),
		Block.createCuboidShape(1, 3, -16, 15, 4, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 3, 15, 30, 4, 16),
		Block.createCuboidShape(-14, 3, 0, 30, 4, 1),
		Block.createCuboidShape(30, 0, 15, 32, 15, 16),
		Block.createCuboidShape(7, 0, 15, 9, 15, 16),
		Block.createCuboidShape(-16, 0, 15, -14, 15, 16),
		Block.createCuboidShape(30, 0, 0, 32, 15, 1),
		Block.createCuboidShape(7, 0, 0, 9, 15, 1),
		Block.createCuboidShape(-16, 0, 0, -14, 15, 1),
		Block.createCuboidShape(-16, 15, 0, 32, 16, 16),
		Block.createCuboidShape(-15, 3, 1, 31, 4, 15),
		Block.createCuboidShape(-16, 3, 1, -15, 4, 15),
		Block.createCuboidShape(31, 3, 1, 32, 4, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 3, -14, 1, 4, 30),
		Block.createCuboidShape(15, 3, -14, 16, 4, 30),
		Block.createCuboidShape(0, 0, 30, 1, 15, 32),
		Block.createCuboidShape(0, 0, 7, 1, 15, 9),
		Block.createCuboidShape(0, 0, -16, 1, 15, -14),
		Block.createCuboidShape(15, 0, 30, 16, 15, 32),
		Block.createCuboidShape(15, 0, 7, 16, 15, 9),
		Block.createCuboidShape(15, 0, -16, 16, 15, -14),
		Block.createCuboidShape(0, 15, -16, 16, 16, 32),
		Block.createCuboidShape(1, 3, -15, 15, 4, 31),
		Block.createCuboidShape(1, 3, -16, 15, 4, -15),
		Block.createCuboidShape(1, 3, 31, 15, 4, 32)
    );

    public Fctable6_Data() {
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

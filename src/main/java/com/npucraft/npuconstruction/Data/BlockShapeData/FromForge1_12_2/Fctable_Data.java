package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fctable_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 17, 1, -3, 18, 15),
		Block.createCuboidShape(18, 18, 1, 21, 22, 15),
		Block.createCuboidShape(7, 18, 1, 9, 22, 15),
		Block.createCuboidShape(30, 18, 1, 31, 22, 15),
		Block.createCuboidShape(9, 18, 1, 30, 22, 1),
		Block.createCuboidShape(8, 17, 1, 30, 18, 15),
		Block.createCuboidShape(9, 18, 15, 30, 22, 15),
		Block.createCuboidShape(7, 0, 0, 9, 15, 1),
		Block.createCuboidShape(7, 0, 15, 9, 15, 16),
		Block.createCuboidShape(31, 0, 15, 32, 15, 16),
		Block.createCuboidShape(31, 0, 0, 32, 15, 1),
		Block.createCuboidShape(-16, 0, 0, -15, 15, 1),
		Block.createCuboidShape(-16, 0, 15, -15, 15, 16),
		Block.createCuboidShape(-16, 15, 0, 32, 17, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 17, -12, 15, 18, -3),
		Block.createCuboidShape(1, 18, 18, 15, 22, 21),
		Block.createCuboidShape(1, 18, 7, 15, 22, 9),
		Block.createCuboidShape(1, 18, 30, 15, 22, 31),
		Block.createCuboidShape(15, 18, 9, 15, 22, 30),
		Block.createCuboidShape(1, 17, 8, 15, 18, 30),
		Block.createCuboidShape(1, 18, 9, 1, 22, 30),
		Block.createCuboidShape(15, 0, 7, 16, 15, 9),
		Block.createCuboidShape(0, 0, 7, 1, 15, 9),
		Block.createCuboidShape(0, 0, 31, 1, 15, 32),
		Block.createCuboidShape(15, 0, 31, 16, 15, 32),
		Block.createCuboidShape(15, 0, -16, 16, 15, -15),
		Block.createCuboidShape(0, 0, -16, 1, 15, -15),
		Block.createCuboidShape(0, 15, -16, 16, 17, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(19, 17, 1, 28, 18, 15),
		Block.createCuboidShape(-5, 18, 1, -2, 22, 15),
		Block.createCuboidShape(7, 18, 1, 9, 22, 15),
		Block.createCuboidShape(-15, 18, 1, -14, 22, 15),
		Block.createCuboidShape(-14, 18, 15, 7, 22, 15),
		Block.createCuboidShape(-14, 17, 1, 8, 18, 15),
		Block.createCuboidShape(-14, 18, 1, 7, 22, 1),
		Block.createCuboidShape(7, 0, 15, 9, 15, 16),
		Block.createCuboidShape(7, 0, 0, 9, 15, 1),
		Block.createCuboidShape(-16, 0, 0, -15, 15, 1),
		Block.createCuboidShape(-16, 0, 15, -15, 15, 16),
		Block.createCuboidShape(31, 0, 15, 32, 15, 16),
		Block.createCuboidShape(31, 0, 0, 32, 15, 1),
		Block.createCuboidShape(-16, 15, 0, 32, 17, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 17, 19, 15, 18, 28),
		Block.createCuboidShape(1, 18, -5, 15, 22, -2),
		Block.createCuboidShape(1, 18, 7, 15, 22, 9),
		Block.createCuboidShape(1, 18, -15, 15, 22, -14),
		Block.createCuboidShape(1, 18, -14, 1, 22, 7),
		Block.createCuboidShape(1, 17, -14, 15, 18, 8),
		Block.createCuboidShape(15, 18, -14, 15, 22, 7),
		Block.createCuboidShape(0, 0, 7, 1, 15, 9),
		Block.createCuboidShape(15, 0, 7, 16, 15, 9),
		Block.createCuboidShape(15, 0, -16, 16, 15, -15),
		Block.createCuboidShape(0, 0, -16, 1, 15, -15),
		Block.createCuboidShape(0, 0, 31, 1, 15, 32),
		Block.createCuboidShape(15, 0, 31, 16, 15, 32),
		Block.createCuboidShape(0, 15, -16, 16, 17, 32)
    );

    public Fctable_Data() {
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

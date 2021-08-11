package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -15, 1, 16, 25, 16),
		Block.createCuboidShape(-14, 17, 0, -9, 19, 5),
		Block.createCuboidShape(6, 20, 0, 10, 21, 5),
		Block.createCuboidShape(-3, 2, 0, -2, 7, 5),
		Block.createCuboidShape(1, 2, 0, 2, 7, 5),
		Block.createCuboidShape(-16, 31, 1, 16, 32, 16),
		Block.createCuboidShape(-16, 25, 7, 16, 31, 16),
		Block.createCuboidShape(15, 25, 1, 16, 31, 10),
		Block.createCuboidShape(-15, 26, 2, 15, 27, 10),
		Block.createCuboidShape(-16, 25, 1, -15, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -15, -16, 15, 25, 16),
		Block.createCuboidShape(11, 17, -14, 16, 19, -9),
		Block.createCuboidShape(11, 20, 6, 16, 21, 10),
		Block.createCuboidShape(11, 2, -3, 16, 7, -2),
		Block.createCuboidShape(11, 2, 1, 16, 7, 2),
		Block.createCuboidShape(0, 31, -16, 15, 32, 16),
		Block.createCuboidShape(0, 25, -16, 9, 31, 16),
		Block.createCuboidShape(6, 25, 15, 15, 31, 16),
		Block.createCuboidShape(6, 26, -15, 14, 27, 15),
		Block.createCuboidShape(6, 25, -16, 15, 31, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -15, 0, 32, 25, 15),
		Block.createCuboidShape(25, 17, 11, 30, 19, 16),
		Block.createCuboidShape(6, 20, 11, 10, 21, 16),
		Block.createCuboidShape(18, 2, 11, 19, 7, 16),
		Block.createCuboidShape(14, 2, 11, 15, 7, 16),
		Block.createCuboidShape(0, 31, 0, 32, 32, 15),
		Block.createCuboidShape(0, 25, 0, 32, 31, 9),
		Block.createCuboidShape(0, 25, 6, 1, 31, 15),
		Block.createCuboidShape(1, 26, 6, 31, 27, 14),
		Block.createCuboidShape(31, 25, 6, 32, 31, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, -15, 0, 16, 25, 32),
		Block.createCuboidShape(0, 17, 25, 5, 19, 30),
		Block.createCuboidShape(0, 20, 6, 5, 21, 10),
		Block.createCuboidShape(0, 2, 18, 5, 7, 19),
		Block.createCuboidShape(0, 2, 14, 5, 7, 15),
		Block.createCuboidShape(1, 31, 0, 16, 32, 32),
		Block.createCuboidShape(7, 25, 0, 16, 31, 32),
		Block.createCuboidShape(1, 25, 0, 10, 31, 1),
		Block.createCuboidShape(2, 26, 1, 10, 27, 31),
		Block.createCuboidShape(1, 25, 31, 10, 31, 32)
    );

    public Dhall1_Data() {
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

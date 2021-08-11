package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Windowframe_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, -13, 5, 1, 17, 11),
		Block.createCuboidShape(-16, 30, 5, 16, 32, 11),
		Block.createCuboidShape(-16, -16, 5, 16, -13, 11),
		Block.createCuboidShape(13, -13, 8, 15, 17, 11),
		Block.createCuboidShape(-15, -13, 5, -13, 17, 8),
		Block.createCuboidShape(-16, 17, 5, -14, 30, 11),
		Block.createCuboidShape(-16, -13, 5, -15, 17, 11),
		Block.createCuboidShape(14, 17, 5, 16, 30, 11),
		Block.createCuboidShape(15, -13, 5, 16, 17, 11),
		Block.createCuboidShape(-14, 17, 5, 14, 19, 11),
		Block.createCuboidShape(-13, -13, 5, -1, -12, 8),
		Block.createCuboidShape(-13, 16, 5, -1, 17, 8),
		Block.createCuboidShape(1, 16, 8, 13, 17, 11),
		Block.createCuboidShape(1, -13, 8, 13, -12, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -13, -1, 11, 17, 1),
		Block.createCuboidShape(5, 30, -16, 11, 32, 16),
		Block.createCuboidShape(5, -16, -16, 11, -13, 16),
		Block.createCuboidShape(5, -13, 13, 8, 17, 15),
		Block.createCuboidShape(8, -13, -15, 11, 17, -13),
		Block.createCuboidShape(5, 17, -16, 11, 30, -14),
		Block.createCuboidShape(5, -13, -16, 11, 17, -15),
		Block.createCuboidShape(5, 17, 14, 11, 30, 16),
		Block.createCuboidShape(5, -13, 15, 11, 17, 16),
		Block.createCuboidShape(5, 17, -14, 11, 19, 14),
		Block.createCuboidShape(8, -13, -13, 11, -12, -1),
		Block.createCuboidShape(8, 16, -13, 11, 17, -1),
		Block.createCuboidShape(5, 16, 1, 8, 17, 13),
		Block.createCuboidShape(5, -13, 1, 8, -12, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, -13, 5, 17, 17, 11),
		Block.createCuboidShape(0, 30, 5, 32, 32, 11),
		Block.createCuboidShape(0, -16, 5, 32, -13, 11),
		Block.createCuboidShape(1, -13, 5, 3, 17, 8),
		Block.createCuboidShape(29, -13, 8, 31, 17, 11),
		Block.createCuboidShape(30, 17, 5, 32, 30, 11),
		Block.createCuboidShape(31, -13, 5, 32, 17, 11),
		Block.createCuboidShape(0, 17, 5, 2, 30, 11),
		Block.createCuboidShape(0, -13, 5, 1, 17, 11),
		Block.createCuboidShape(2, 17, 5, 30, 19, 11),
		Block.createCuboidShape(17, -13, 8, 29, -12, 11),
		Block.createCuboidShape(17, 16, 8, 29, 17, 11),
		Block.createCuboidShape(3, 16, 5, 15, 17, 8),
		Block.createCuboidShape(3, -13, 5, 15, -12, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -13, 15, 11, 17, 17),
		Block.createCuboidShape(5, 30, 0, 11, 32, 32),
		Block.createCuboidShape(5, -16, 0, 11, -13, 32),
		Block.createCuboidShape(8, -13, 1, 11, 17, 3),
		Block.createCuboidShape(5, -13, 29, 8, 17, 31),
		Block.createCuboidShape(5, 17, 30, 11, 30, 32),
		Block.createCuboidShape(5, -13, 31, 11, 17, 32),
		Block.createCuboidShape(5, 17, 0, 11, 30, 2),
		Block.createCuboidShape(5, -13, 0, 11, 17, 1),
		Block.createCuboidShape(5, 17, 2, 11, 19, 30),
		Block.createCuboidShape(5, -13, 17, 8, -12, 29),
		Block.createCuboidShape(5, 16, 17, 8, 17, 29),
		Block.createCuboidShape(8, 16, 3, 11, 17, 15),
		Block.createCuboidShape(8, -13, 3, 11, -12, 15)
    );

    public Windowframe_Data() {
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

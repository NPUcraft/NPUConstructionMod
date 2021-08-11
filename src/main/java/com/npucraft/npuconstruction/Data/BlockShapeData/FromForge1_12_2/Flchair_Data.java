package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Flchair_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 14, 14, 30, 24, 15),
		Block.createCuboidShape(-16, 0, 14, -14, 23, 15),
		Block.createCuboidShape(30, 0, 14, 32, 23, 15),
		Block.createCuboidShape(-14, 9, 7, 30, 10, 13),
		Block.createCuboidShape(-16, 9, -1, -14, 11, 13),
		Block.createCuboidShape(30, 9, -1, 32, 11, 13),
		Block.createCuboidShape(-16, 15, -1, -14, 17, 14),
		Block.createCuboidShape(30, 15, -1, 32, 17, 14),
		Block.createCuboidShape(-16, 0, 0, -15, 16, 1),
		Block.createCuboidShape(31, 0, 0, 32, 16, 1),
		Block.createCuboidShape(-14, 10, -1, 30, 11, 2),
		Block.createCuboidShape(-14, 10, 2, 30, 11, 4),
		Block.createCuboidShape(-14, 10, 5, 30, 11, 7),
		Block.createCuboidShape(-16, 10, 6, -15, 16, 7),
		Block.createCuboidShape(-16, 4, 2, -15, 5, 13),
		Block.createCuboidShape(31, 10, 6, 32, 16, 7),
		Block.createCuboidShape(31, 4, 2, 32, 5, 13),
		Block.createCuboidShape(-15, 8, 14, 31, 10, 15),
		Block.createCuboidShape(-15, 8, 1, 31, 10, 2)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 14, -14, 2, 24, 30),
		Block.createCuboidShape(1, 0, -16, 2, 23, -14),
		Block.createCuboidShape(1, 0, 30, 2, 23, 32),
		Block.createCuboidShape(3, 9, -14, 9, 10, 30),
		Block.createCuboidShape(3, 9, -16, 17, 11, -14),
		Block.createCuboidShape(3, 9, 30, 17, 11, 32),
		Block.createCuboidShape(2, 15, -16, 17, 17, -14),
		Block.createCuboidShape(2, 15, 30, 17, 17, 32),
		Block.createCuboidShape(15, 0, -16, 16, 16, -15),
		Block.createCuboidShape(15, 0, 31, 16, 16, 32),
		Block.createCuboidShape(14, 10, -14, 17, 11, 30),
		Block.createCuboidShape(12, 10, -14, 14, 11, 30),
		Block.createCuboidShape(9, 10, -14, 11, 11, 30),
		Block.createCuboidShape(9, 10, -16, 10, 16, -15),
		Block.createCuboidShape(3, 4, -16, 14, 5, -15),
		Block.createCuboidShape(9, 10, 31, 10, 16, 32),
		Block.createCuboidShape(3, 4, 31, 14, 5, 32),
		Block.createCuboidShape(1, 8, -15, 2, 10, 31),
		Block.createCuboidShape(14, 8, -15, 15, 10, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 14, 1, 30, 24, 2),
		Block.createCuboidShape(30, 0, 1, 32, 23, 2),
		Block.createCuboidShape(-16, 0, 1, -14, 23, 2),
		Block.createCuboidShape(-14, 9, 3, 30, 10, 9),
		Block.createCuboidShape(30, 9, 3, 32, 11, 17),
		Block.createCuboidShape(-16, 9, 3, -14, 11, 17),
		Block.createCuboidShape(30, 15, 2, 32, 17, 17),
		Block.createCuboidShape(-16, 15, 2, -14, 17, 17),
		Block.createCuboidShape(31, 0, 15, 32, 16, 16),
		Block.createCuboidShape(-16, 0, 15, -15, 16, 16),
		Block.createCuboidShape(-14, 10, 14, 30, 11, 17),
		Block.createCuboidShape(-14, 10, 12, 30, 11, 14),
		Block.createCuboidShape(-14, 10, 9, 30, 11, 11),
		Block.createCuboidShape(31, 10, 9, 32, 16, 10),
		Block.createCuboidShape(31, 4, 3, 32, 5, 14),
		Block.createCuboidShape(-16, 10, 9, -15, 16, 10),
		Block.createCuboidShape(-16, 4, 3, -15, 5, 14),
		Block.createCuboidShape(-15, 8, 1, 31, 10, 2),
		Block.createCuboidShape(-15, 8, 14, 31, 10, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 14, -14, 15, 24, 30),
		Block.createCuboidShape(14, 0, 30, 15, 23, 32),
		Block.createCuboidShape(14, 0, -16, 15, 23, -14),
		Block.createCuboidShape(7, 9, -14, 13, 10, 30),
		Block.createCuboidShape(-1, 9, 30, 13, 11, 32),
		Block.createCuboidShape(-1, 9, -16, 13, 11, -14),
		Block.createCuboidShape(-1, 15, 30, 14, 17, 32),
		Block.createCuboidShape(-1, 15, -16, 14, 17, -14),
		Block.createCuboidShape(0, 0, 31, 1, 16, 32),
		Block.createCuboidShape(0, 0, -16, 1, 16, -15),
		Block.createCuboidShape(-1, 10, -14, 2, 11, 30),
		Block.createCuboidShape(2, 10, -14, 4, 11, 30),
		Block.createCuboidShape(5, 10, -14, 7, 11, 30),
		Block.createCuboidShape(6, 10, 31, 7, 16, 32),
		Block.createCuboidShape(2, 4, 31, 13, 5, 32),
		Block.createCuboidShape(6, 10, -16, 7, 16, -15),
		Block.createCuboidShape(2, 4, -16, 13, 5, -15),
		Block.createCuboidShape(14, 8, -15, 15, 10, 31),
		Block.createCuboidShape(1, 8, -15, 2, 10, 31)
    );

    public Flchair_Data() {
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

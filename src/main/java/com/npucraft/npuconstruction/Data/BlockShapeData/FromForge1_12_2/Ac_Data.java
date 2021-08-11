package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Ac_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 21, 6, 10, 29, 8),
		Block.createCuboidShape(-14, 21, 6, -10, 29, 8),
		Block.createCuboidShape(26, 21, 23, 30, 29, 25),
		Block.createCuboidShape(6, 21, 23, 10, 29, 25),
		Block.createCuboidShape(-14, 21, 23, -10, 29, 25),
		Block.createCuboidShape(25, 0, -1, 31, 21, 32),
		Block.createCuboidShape(5, 20, -1, 10, 21, 32),
		Block.createCuboidShape(-15, 20, -1, -10, 21, 32),
		Block.createCuboidShape(5, 0, -1, 10, 1, 32),
		Block.createCuboidShape(-15, 0, -1, -10, 1, 32),
		Block.createCuboidShape(5, 1, -1, 9, 20, 32),
		Block.createCuboidShape(-15, 1, -1, -11, 20, 32),
		Block.createCuboidShape(9, 0, -1, 11, 21, 32),
		Block.createCuboidShape(-11, 0, -1, -9, 21, 32),
		Block.createCuboidShape(11, 0, 13, 12, 20, 18),
		Block.createCuboidShape(-9, 0, 13, -8, 20, 18),
		Block.createCuboidShape(4, 0, 13, 5, 20, 18),
		Block.createCuboidShape(-16, 0, 13, -15, 20, 18),
		Block.createCuboidShape(31, 0, 13, 32, 20, 18),
		Block.createCuboidShape(24, 0, 13, 25, 20, 18),
		Block.createCuboidShape(9, 2, 15, 17, 14, 16),
		Block.createCuboidShape(-11, 2, 15, -3, 14, 16),
		Block.createCuboidShape(18, 9, 15, 26, 21, 16),
		Block.createCuboidShape(-2, 9, 15, 6, 21, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 21, 6, 10, 29, 10),
		Block.createCuboidShape(8, 21, -14, 10, 29, -10),
		Block.createCuboidShape(-9, 21, 26, -7, 29, 30),
		Block.createCuboidShape(-9, 21, 6, -7, 29, 10),
		Block.createCuboidShape(-9, 21, -14, -7, 29, -10),
		Block.createCuboidShape(-16, 0, 25, 17, 21, 31),
		Block.createCuboidShape(-16, 20, 5, 17, 21, 10),
		Block.createCuboidShape(-16, 20, -15, 17, 21, -10),
		Block.createCuboidShape(-16, 0, 5, 17, 1, 10),
		Block.createCuboidShape(-16, 0, -15, 17, 1, -10),
		Block.createCuboidShape(-16, 1, 5, 17, 20, 9),
		Block.createCuboidShape(-16, 1, -15, 17, 20, -11),
		Block.createCuboidShape(-16, 0, 9, 17, 21, 11),
		Block.createCuboidShape(-16, 0, -11, 17, 21, -9),
		Block.createCuboidShape(-2, 0, 11, 3, 20, 12),
		Block.createCuboidShape(-2, 0, -9, 3, 20, -8),
		Block.createCuboidShape(-2, 0, 4, 3, 20, 5),
		Block.createCuboidShape(-2, 0, -16, 3, 20, -15),
		Block.createCuboidShape(-2, 0, 31, 3, 20, 32),
		Block.createCuboidShape(-2, 0, 24, 3, 20, 25),
		Block.createCuboidShape(0, 2, 9, 1, 14, 17),
		Block.createCuboidShape(0, 2, -11, 1, 14, -3),
		Block.createCuboidShape(0, 9, 18, 1, 21, 26),
		Block.createCuboidShape(0, 9, -2, 1, 21, 6)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 21, 8, 10, 29, 10),
		Block.createCuboidShape(26, 21, 8, 30, 29, 10),
		Block.createCuboidShape(-14, 21, -9, -10, 29, -7),
		Block.createCuboidShape(6, 21, -9, 10, 29, -7),
		Block.createCuboidShape(26, 21, -9, 30, 29, -7),
		Block.createCuboidShape(-15, 0, -16, -9, 21, 17),
		Block.createCuboidShape(6, 20, -16, 11, 21, 17),
		Block.createCuboidShape(26, 20, -16, 31, 21, 17),
		Block.createCuboidShape(6, 0, -16, 11, 1, 17),
		Block.createCuboidShape(26, 0, -16, 31, 1, 17),
		Block.createCuboidShape(7, 1, -16, 11, 20, 17),
		Block.createCuboidShape(27, 1, -16, 31, 20, 17),
		Block.createCuboidShape(5, 0, -16, 7, 21, 17),
		Block.createCuboidShape(25, 0, -16, 27, 21, 17),
		Block.createCuboidShape(4, 0, -2, 5, 20, 3),
		Block.createCuboidShape(24, 0, -2, 25, 20, 3),
		Block.createCuboidShape(11, 0, -2, 12, 20, 3),
		Block.createCuboidShape(31, 0, -2, 32, 20, 3),
		Block.createCuboidShape(-16, 0, -2, -15, 20, 3),
		Block.createCuboidShape(-9, 0, -2, -8, 20, 3),
		Block.createCuboidShape(-1, 2, 0, 7, 14, 1),
		Block.createCuboidShape(19, 2, 0, 27, 14, 1),
		Block.createCuboidShape(-10, 9, 0, -2, 21, 1),
		Block.createCuboidShape(10, 9, 0, 18, 21, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 21, 6, 8, 29, 10),
		Block.createCuboidShape(6, 21, 26, 8, 29, 30),
		Block.createCuboidShape(23, 21, -14, 25, 29, -10),
		Block.createCuboidShape(23, 21, 6, 25, 29, 10),
		Block.createCuboidShape(23, 21, 26, 25, 29, 30),
		Block.createCuboidShape(-1, 0, -15, 32, 21, -9),
		Block.createCuboidShape(-1, 20, 6, 32, 21, 11),
		Block.createCuboidShape(-1, 20, 26, 32, 21, 31),
		Block.createCuboidShape(-1, 0, 6, 32, 1, 11),
		Block.createCuboidShape(-1, 0, 26, 32, 1, 31),
		Block.createCuboidShape(-1, 1, 7, 32, 20, 11),
		Block.createCuboidShape(-1, 1, 27, 32, 20, 31),
		Block.createCuboidShape(-1, 0, 5, 32, 21, 7),
		Block.createCuboidShape(-1, 0, 25, 32, 21, 27),
		Block.createCuboidShape(13, 0, 4, 18, 20, 5),
		Block.createCuboidShape(13, 0, 24, 18, 20, 25),
		Block.createCuboidShape(13, 0, 11, 18, 20, 12),
		Block.createCuboidShape(13, 0, 31, 18, 20, 32),
		Block.createCuboidShape(13, 0, -16, 18, 20, -15),
		Block.createCuboidShape(13, 0, -9, 18, 20, -8),
		Block.createCuboidShape(15, 2, -1, 16, 14, 7),
		Block.createCuboidShape(15, 2, 19, 16, 14, 27),
		Block.createCuboidShape(15, 9, -10, 16, 21, -2),
		Block.createCuboidShape(15, 9, 10, 16, 21, 18)
    );

    public Ac_Data() {
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

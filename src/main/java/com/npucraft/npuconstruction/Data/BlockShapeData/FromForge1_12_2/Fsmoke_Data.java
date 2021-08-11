package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsmoke_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(20, 2, 0, 31, 4, 14),
		Block.createCuboidShape(7, 2, 0, 19, 4, 14),
		Block.createCuboidShape(-5, 2, 0, 6, 4, 14),
		Block.createCuboidShape(-14, 2, 0, -6, 4, 14),
		Block.createCuboidShape(-13, 12, 13, 29, 19, 16),
		Block.createCuboidShape(-16, 2, -5, -15, 15, 14),
		Block.createCuboidShape(31, 2, -5, 32, 15, 14),
		Block.createCuboidShape(-16, 14, -3, -14, 32, -2),
		Block.createCuboidShape(30, 14, -3, 32, 32, -2),
		Block.createCuboidShape(-16, 0, 15, 32, 23, 16),
		Block.createCuboidShape(-16, 2, 14, 32, 15, 15),
		Block.createCuboidShape(-15, 10, -4, 31, 15, -3),
		Block.createCuboidShape(-15, 11, -3, 31, 14, 14),
		Block.createCuboidShape(-16, 2, 14, 31, 3, 14),
		Block.createCuboidShape(-16, 11, 5, 31, 12, 6),
		Block.createCuboidShape(-15, 3, 1, 32, 5, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, 2, 20, 16, 4, 31),
		Block.createCuboidShape(2, 2, 7, 16, 4, 19),
		Block.createCuboidShape(2, 2, -5, 16, 4, 6),
		Block.createCuboidShape(2, 2, -14, 16, 4, -6),
		Block.createCuboidShape(0, 12, -13, 3, 19, 29),
		Block.createCuboidShape(2, 2, -16, 21, 15, -15),
		Block.createCuboidShape(2, 2, 31, 21, 15, 32),
		Block.createCuboidShape(18, 14, -16, 19, 32, -14),
		Block.createCuboidShape(18, 14, 30, 19, 32, 32),
		Block.createCuboidShape(0, 0, -16, 1, 23, 32),
		Block.createCuboidShape(1, 2, -16, 2, 15, 32),
		Block.createCuboidShape(19, 10, -15, 20, 15, 31),
		Block.createCuboidShape(2, 11, -15, 19, 14, 31),
		Block.createCuboidShape(2, 2, -16, 2, 3, 31),
		Block.createCuboidShape(10, 11, -16, 11, 12, 31),
		Block.createCuboidShape(2, 3, -15, 15, 5, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 2, 2, -4, 4, 16),
		Block.createCuboidShape(-3, 2, 2, 9, 4, 16),
		Block.createCuboidShape(10, 2, 2, 21, 4, 16),
		Block.createCuboidShape(22, 2, 2, 30, 4, 16),
		Block.createCuboidShape(-13, 12, 0, 29, 19, 3),
		Block.createCuboidShape(31, 2, 2, 32, 15, 21),
		Block.createCuboidShape(-16, 2, 2, -15, 15, 21),
		Block.createCuboidShape(30, 14, 18, 32, 32, 19),
		Block.createCuboidShape(-16, 14, 18, -14, 32, 19),
		Block.createCuboidShape(-16, 0, 0, 32, 23, 1),
		Block.createCuboidShape(-16, 2, 1, 32, 15, 2),
		Block.createCuboidShape(-15, 10, 19, 31, 15, 20),
		Block.createCuboidShape(-15, 11, 2, 31, 14, 19),
		Block.createCuboidShape(-15, 2, 2, 32, 3, 2),
		Block.createCuboidShape(-15, 11, 10, 32, 12, 11),
		Block.createCuboidShape(-16, 3, 2, 31, 5, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 2, -15, 14, 4, -4),
		Block.createCuboidShape(0, 2, -3, 14, 4, 9),
		Block.createCuboidShape(0, 2, 10, 14, 4, 21),
		Block.createCuboidShape(0, 2, 22, 14, 4, 30),
		Block.createCuboidShape(13, 12, -13, 16, 19, 29),
		Block.createCuboidShape(-5, 2, 31, 14, 15, 32),
		Block.createCuboidShape(-5, 2, -16, 14, 15, -15),
		Block.createCuboidShape(-3, 14, 30, -2, 32, 32),
		Block.createCuboidShape(-3, 14, -16, -2, 32, -14),
		Block.createCuboidShape(15, 0, -16, 16, 23, 32),
		Block.createCuboidShape(14, 2, -16, 15, 15, 32),
		Block.createCuboidShape(-4, 10, -15, -3, 15, 31),
		Block.createCuboidShape(-3, 11, -15, 14, 14, 31),
		Block.createCuboidShape(14, 2, -15, 14, 3, 32),
		Block.createCuboidShape(5, 11, -15, 6, 12, 32),
		Block.createCuboidShape(1, 3, -16, 14, 5, 31)
    );

    public Fsmoke_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Lchair_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 13, 14, 30, 23, 15),
		Block.createCuboidShape(-14, 9, 7, 30, 10, 13),
		Block.createCuboidShape(-16, 9, -1, -14, 11, 13),
		Block.createCuboidShape(30, 9, -1, 32, 11, 13),
		Block.createCuboidShape(-16, 15, -1, -14, 17, 14),
		Block.createCuboidShape(30, 15, -1, 32, 17, 14),
		Block.createCuboidShape(-14, 10, -1, 30, 11, 2),
		Block.createCuboidShape(-14, 10, 2, 30, 11, 4),
		Block.createCuboidShape(-14, 10, 5, 30, 11, 7),
		Block.createCuboidShape(-16, 4, 5, -15, 6, 11),
		Block.createCuboidShape(31, 4, 5, 32, 6, 11),
		Block.createCuboidShape(-16, 14, 14, -14, 22, 15),
		Block.createCuboidShape(30, 14, 14, 32, 22, 15),
		Block.createCuboidShape(-15, 8, 1, 31, 10, 2),
		Block.createCuboidShape(-15, 8, 14, 31, 10, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 13, -14, 2, 23, 30),
		Block.createCuboidShape(3, 9, -14, 9, 10, 30),
		Block.createCuboidShape(3, 9, -16, 17, 11, -14),
		Block.createCuboidShape(3, 9, 30, 17, 11, 32),
		Block.createCuboidShape(2, 15, -16, 17, 17, -14),
		Block.createCuboidShape(2, 15, 30, 17, 17, 32),
		Block.createCuboidShape(14, 10, -14, 17, 11, 30),
		Block.createCuboidShape(12, 10, -14, 14, 11, 30),
		Block.createCuboidShape(9, 10, -14, 11, 11, 30),
		Block.createCuboidShape(5, 4, -16, 11, 6, -15),
		Block.createCuboidShape(5, 4, 31, 11, 6, 32),
		Block.createCuboidShape(1, 14, -16, 2, 22, -14),
		Block.createCuboidShape(1, 14, 30, 2, 22, 32),
		Block.createCuboidShape(14, 8, -15, 15, 10, 31),
		Block.createCuboidShape(1, 8, -15, 2, 10, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-14, 13, 1, 30, 23, 2),
		Block.createCuboidShape(-14, 9, 3, 30, 10, 9),
		Block.createCuboidShape(30, 9, 3, 32, 11, 17),
		Block.createCuboidShape(-16, 9, 3, -14, 11, 17),
		Block.createCuboidShape(30, 15, 2, 32, 17, 17),
		Block.createCuboidShape(-16, 15, 2, -14, 17, 17),
		Block.createCuboidShape(-14, 10, 14, 30, 11, 17),
		Block.createCuboidShape(-14, 10, 12, 30, 11, 14),
		Block.createCuboidShape(-14, 10, 9, 30, 11, 11),
		Block.createCuboidShape(31, 4, 5, 32, 6, 11),
		Block.createCuboidShape(-16, 4, 5, -15, 6, 11),
		Block.createCuboidShape(30, 14, 1, 32, 22, 2),
		Block.createCuboidShape(-16, 14, 1, -14, 22, 2),
		Block.createCuboidShape(-15, 8, 14, 31, 10, 15),
		Block.createCuboidShape(-15, 8, 1, 31, 10, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 13, -14, 15, 23, 30),
		Block.createCuboidShape(7, 9, -14, 13, 10, 30),
		Block.createCuboidShape(-1, 9, 30, 13, 11, 32),
		Block.createCuboidShape(-1, 9, -16, 13, 11, -14),
		Block.createCuboidShape(-1, 15, 30, 14, 17, 32),
		Block.createCuboidShape(-1, 15, -16, 14, 17, -14),
		Block.createCuboidShape(-1, 10, -14, 2, 11, 30),
		Block.createCuboidShape(2, 10, -14, 4, 11, 30),
		Block.createCuboidShape(5, 10, -14, 7, 11, 30),
		Block.createCuboidShape(5, 4, 31, 11, 6, 32),
		Block.createCuboidShape(5, 4, -16, 11, 6, -15),
		Block.createCuboidShape(14, 14, 30, 15, 22, 32),
		Block.createCuboidShape(14, 14, -16, 15, 22, -14),
		Block.createCuboidShape(1, 8, -15, 2, 10, 31),
		Block.createCuboidShape(14, 8, -15, 15, 10, 31)
    );

    public Lchair_Data() {
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

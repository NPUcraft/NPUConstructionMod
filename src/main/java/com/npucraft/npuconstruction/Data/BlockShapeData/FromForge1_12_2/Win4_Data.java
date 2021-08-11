package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(29, -15, 5, 31, 31, 8),
		Block.createCuboidShape(-15, -15, 8, -13, 31, 11),
		Block.createCuboidShape(-15, -16, 5, 31, -15, 11),
		Block.createCuboidShape(-15, 31, 5, 31, 32, 11),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(-15, -15, 5, -14, 31, 6),
		Block.createCuboidShape(-14, -15, 5, 30, -14, 6),
		Block.createCuboidShape(-14, 30, 5, 30, 31, 6),
		Block.createCuboidShape(-14, -15, 10, 30, -14, 11),
		Block.createCuboidShape(-14, 30, 10, 30, 31, 11),
		Block.createCuboidShape(30, -15, 10, 31, 31, 11),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(-13, 29, 8, 6, 31, 10),
		Block.createCuboidShape(10, 29, 6, 29, 31, 8),
		Block.createCuboidShape(-13, -15, 8, 6, -13, 10),
		Block.createCuboidShape(10, -15, 6, 29, -13, 8),
		Block.createCuboidShape(8, -15, 6, 10, 31, 8),
		Block.createCuboidShape(6, -15, 8, 8, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, -15, 29, 11, 31, 31),
		Block.createCuboidShape(5, -15, -15, 8, 31, -13),
		Block.createCuboidShape(5, -16, -15, 11, -15, 31),
		Block.createCuboidShape(5, 31, -15, 11, 32, 31),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(10, -15, -15, 11, 31, -14),
		Block.createCuboidShape(10, -15, -14, 11, -14, 30),
		Block.createCuboidShape(10, 30, -14, 11, 31, 30),
		Block.createCuboidShape(5, -15, -14, 6, -14, 30),
		Block.createCuboidShape(5, 30, -14, 6, 31, 30),
		Block.createCuboidShape(5, -15, 30, 6, 31, 31),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(6, 29, -13, 8, 31, 6),
		Block.createCuboidShape(8, 29, 10, 10, 31, 29),
		Block.createCuboidShape(6, -15, -13, 8, -13, 6),
		Block.createCuboidShape(8, -15, 10, 10, -13, 29),
		Block.createCuboidShape(8, -15, 8, 10, 31, 10),
		Block.createCuboidShape(6, -15, 6, 8, 31, 8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, -15, 8, -13, 31, 11),
		Block.createCuboidShape(29, -15, 5, 31, 31, 8),
		Block.createCuboidShape(-15, -16, 5, 31, -15, 11),
		Block.createCuboidShape(-15, 31, 5, 31, 32, 11),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(30, -15, 10, 31, 31, 11),
		Block.createCuboidShape(-14, -15, 10, 30, -14, 11),
		Block.createCuboidShape(-14, 30, 10, 30, 31, 11),
		Block.createCuboidShape(-14, -15, 5, 30, -14, 6),
		Block.createCuboidShape(-14, 30, 5, 30, 31, 6),
		Block.createCuboidShape(-15, -15, 5, -14, 31, 6),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(10, 29, 6, 29, 31, 8),
		Block.createCuboidShape(-13, 29, 8, 6, 31, 10),
		Block.createCuboidShape(10, -15, 6, 29, -13, 8),
		Block.createCuboidShape(-13, -15, 8, 6, -13, 10),
		Block.createCuboidShape(6, -15, 8, 8, 31, 10),
		Block.createCuboidShape(8, -15, 6, 10, 31, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -15, -15, 8, 31, -13),
		Block.createCuboidShape(8, -15, 29, 11, 31, 31),
		Block.createCuboidShape(5, -16, -15, 11, -15, 31),
		Block.createCuboidShape(5, 31, -15, 11, 32, 31),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(5, -15, 30, 6, 31, 31),
		Block.createCuboidShape(5, -15, -14, 6, -14, 30),
		Block.createCuboidShape(5, 30, -14, 6, 31, 30),
		Block.createCuboidShape(10, -15, -14, 11, -14, 30),
		Block.createCuboidShape(10, 30, -14, 11, 31, 30),
		Block.createCuboidShape(10, -15, -15, 11, 31, -14),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(8, 29, 10, 10, 31, 29),
		Block.createCuboidShape(6, 29, -13, 8, 31, 6),
		Block.createCuboidShape(8, -15, 10, 10, -13, 29),
		Block.createCuboidShape(6, -15, -13, 8, -13, 6),
		Block.createCuboidShape(6, -15, 6, 8, 31, 8),
		Block.createCuboidShape(8, -15, 8, 10, 31, 10)
    );

    public Win4_Data() {
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

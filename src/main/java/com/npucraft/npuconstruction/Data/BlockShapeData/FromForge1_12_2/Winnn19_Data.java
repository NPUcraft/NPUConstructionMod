package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn19_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(28, 4, -16, 32, 10, -13),
		Block.createCuboidShape(-16, 4, -16, -12, 10, -13),
		Block.createCuboidShape(30, 5, -14, 31, 8, 7),
		Block.createCuboidShape(-15, 5, -14, -14, 8, 7),
		Block.createCuboidShape(30, -15, -14, 31, 30, 6),
		Block.createCuboidShape(-15, -15, -14, -14, 30, 6),
		Block.createCuboidShape(-16, 31, 6, 32, 32, 10),
		Block.createCuboidShape(29, -16, -16, 31, 31, -14),
		Block.createCuboidShape(-15, -16, -16, -13, 31, -14),
		Block.createCuboidShape(29, -16, 6, 31, 31, 7),
		Block.createCuboidShape(-15, -16, 6, -13, 31, 7),
		Block.createCuboidShape(29, 30, -14, 31, 31, 6),
		Block.createCuboidShape(-15, 30, -14, -13, 31, 6),
		Block.createCuboidShape(29, -16, -14, 31, -15, 6),
		Block.createCuboidShape(-15, -16, -14, -13, -15, 6),
		Block.createCuboidShape(31, -16, 6, 32, 31, 10),
		Block.createCuboidShape(-16, -16, 6, -15, 31, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(29, 4, 28, 32, 10, 32),
		Block.createCuboidShape(29, 4, -16, 32, 10, -12),
		Block.createCuboidShape(9, 5, 30, 30, 8, 31),
		Block.createCuboidShape(9, 5, -15, 30, 8, -14),
		Block.createCuboidShape(10, -15, 30, 30, 30, 31),
		Block.createCuboidShape(10, -15, -15, 30, 30, -14),
		Block.createCuboidShape(6, 31, -16, 10, 32, 32),
		Block.createCuboidShape(30, -16, 29, 32, 31, 31),
		Block.createCuboidShape(30, -16, -15, 32, 31, -13),
		Block.createCuboidShape(9, -16, 29, 10, 31, 31),
		Block.createCuboidShape(9, -16, -15, 10, 31, -13),
		Block.createCuboidShape(10, 30, 29, 30, 31, 31),
		Block.createCuboidShape(10, 30, -15, 30, 31, -13),
		Block.createCuboidShape(10, -16, 29, 30, -15, 31),
		Block.createCuboidShape(10, -16, -15, 30, -15, -13),
		Block.createCuboidShape(6, -16, 31, 10, 31, 32),
		Block.createCuboidShape(6, -16, -16, 10, 31, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 4, 29, -12, 10, 32),
		Block.createCuboidShape(28, 4, 29, 32, 10, 32),
		Block.createCuboidShape(-15, 5, 9, -14, 8, 30),
		Block.createCuboidShape(30, 5, 9, 31, 8, 30),
		Block.createCuboidShape(-15, -15, 10, -14, 30, 30),
		Block.createCuboidShape(30, -15, 10, 31, 30, 30),
		Block.createCuboidShape(-16, 31, 6, 32, 32, 10),
		Block.createCuboidShape(-15, -16, 30, -13, 31, 32),
		Block.createCuboidShape(29, -16, 30, 31, 31, 32),
		Block.createCuboidShape(-15, -16, 9, -13, 31, 10),
		Block.createCuboidShape(29, -16, 9, 31, 31, 10),
		Block.createCuboidShape(-15, 30, 10, -13, 31, 30),
		Block.createCuboidShape(29, 30, 10, 31, 31, 30),
		Block.createCuboidShape(-15, -16, 10, -13, -15, 30),
		Block.createCuboidShape(29, -16, 10, 31, -15, 30),
		Block.createCuboidShape(-16, -16, 6, -15, 31, 10),
		Block.createCuboidShape(31, -16, 6, 32, 31, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-16, 4, -16, -13, 10, -12),
		Block.createCuboidShape(-16, 4, 28, -13, 10, 32),
		Block.createCuboidShape(-14, 5, -15, 7, 8, -14),
		Block.createCuboidShape(-14, 5, 30, 7, 8, 31),
		Block.createCuboidShape(-14, -15, -15, 6, 30, -14),
		Block.createCuboidShape(-14, -15, 30, 6, 30, 31),
		Block.createCuboidShape(6, 31, -16, 10, 32, 32),
		Block.createCuboidShape(-16, -16, -15, -14, 31, -13),
		Block.createCuboidShape(-16, -16, 29, -14, 31, 31),
		Block.createCuboidShape(6, -16, -15, 7, 31, -13),
		Block.createCuboidShape(6, -16, 29, 7, 31, 31),
		Block.createCuboidShape(-14, 30, -15, 6, 31, -13),
		Block.createCuboidShape(-14, 30, 29, 6, 31, 31),
		Block.createCuboidShape(-14, -16, -15, 6, -15, -13),
		Block.createCuboidShape(-14, -16, 29, 6, -15, 31),
		Block.createCuboidShape(6, -16, -16, 10, 31, -15),
		Block.createCuboidShape(6, -16, 31, 10, 31, 32)
    );

    public Winnn19_Data() {
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

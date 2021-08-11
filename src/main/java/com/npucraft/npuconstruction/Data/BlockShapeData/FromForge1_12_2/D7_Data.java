package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class D7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 15, 5, 32, 16, 11),
		Block.createCuboidShape(-15, 14, 6, 31, 15, 10),
		Block.createCuboidShape(-15, 0, 6, 31, 1, 10),
		Block.createCuboidShape(-16, 0, 5, -15, 15, 11),
		Block.createCuboidShape(31, 0, 5, 32, 15, 11),
		Block.createCuboidShape(7, 1, 6, 9, 14, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 15, -16, 11, 16, 32),
		Block.createCuboidShape(6, 14, -15, 10, 15, 31),
		Block.createCuboidShape(6, 0, -15, 10, 1, 31),
		Block.createCuboidShape(5, 0, -16, 11, 15, -15),
		Block.createCuboidShape(5, 0, 31, 11, 15, 32),
		Block.createCuboidShape(6, 1, 7, 10, 14, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 15, 5, 32, 16, 11),
		Block.createCuboidShape(-15, 14, 6, 31, 15, 10),
		Block.createCuboidShape(-15, 0, 6, 31, 1, 10),
		Block.createCuboidShape(31, 0, 5, 32, 15, 11),
		Block.createCuboidShape(-16, 0, 5, -15, 15, 11),
		Block.createCuboidShape(7, 1, 6, 9, 14, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 15, -16, 11, 16, 32),
		Block.createCuboidShape(6, 14, -15, 10, 15, 31),
		Block.createCuboidShape(6, 0, -15, 10, 1, 31),
		Block.createCuboidShape(5, 0, 31, 11, 15, 32),
		Block.createCuboidShape(5, 0, -16, 11, 15, -15),
		Block.createCuboidShape(6, 1, 7, 10, 14, 9)
    );

    public D7_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Board_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 1, 15, 31, 31, 16),
		Block.createCuboidShape(-16, 0, 15, 32, 1, 16),
		Block.createCuboidShape(-16, 31, 15, 32, 32, 16),
		Block.createCuboidShape(31, 1, 15, 32, 31, 16),
		Block.createCuboidShape(-16, 1, 15, -15, 31, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 1, -15, 1, 31, 31),
		Block.createCuboidShape(0, 0, -16, 1, 1, 32),
		Block.createCuboidShape(0, 31, -16, 1, 32, 32),
		Block.createCuboidShape(0, 1, 31, 1, 31, 32),
		Block.createCuboidShape(0, 1, -16, 1, 31, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 1, 0, 31, 31, 1),
		Block.createCuboidShape(-16, 0, 0, 32, 1, 1),
		Block.createCuboidShape(-16, 31, 0, 32, 32, 1),
		Block.createCuboidShape(-16, 1, 0, -15, 31, 1),
		Block.createCuboidShape(31, 1, 0, 32, 31, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 1, -15, 16, 31, 31),
		Block.createCuboidShape(15, 0, -16, 16, 1, 32),
		Block.createCuboidShape(15, 31, -16, 16, 32, 32),
		Block.createCuboidShape(15, 1, -16, 16, 31, -15),
		Block.createCuboidShape(15, 1, 31, 16, 31, 32)
    );

    public Board_Data() {
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

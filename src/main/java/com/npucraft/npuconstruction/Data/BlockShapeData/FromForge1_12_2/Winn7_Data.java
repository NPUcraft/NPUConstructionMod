package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winn7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 1, 7, 15, 15, 9),
		Block.createCuboidShape(-16, 0, 7, 16, 1, 9),
		Block.createCuboidShape(-16, 15, 7, 16, 16, 9),
		Block.createCuboidShape(-16, 1, 7, -15, 15, 9),
		Block.createCuboidShape(15, 1, 7, 16, 15, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, -15, 9, 15, 15),
		Block.createCuboidShape(7, 0, -16, 9, 1, 16),
		Block.createCuboidShape(7, 15, -16, 9, 16, 16),
		Block.createCuboidShape(7, 1, -16, 9, 15, -15),
		Block.createCuboidShape(7, 1, 15, 9, 15, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 1, 7, 31, 15, 9),
		Block.createCuboidShape(0, 0, 7, 32, 1, 9),
		Block.createCuboidShape(0, 15, 7, 32, 16, 9),
		Block.createCuboidShape(31, 1, 7, 32, 15, 9),
		Block.createCuboidShape(0, 1, 7, 1, 15, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, 1, 9, 15, 31),
		Block.createCuboidShape(7, 0, 0, 9, 1, 32),
		Block.createCuboidShape(7, 15, 0, 9, 16, 32),
		Block.createCuboidShape(7, 1, 31, 9, 15, 32),
		Block.createCuboidShape(7, 1, 0, 9, 15, 1)
    );

    public Winn7_Data() {
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

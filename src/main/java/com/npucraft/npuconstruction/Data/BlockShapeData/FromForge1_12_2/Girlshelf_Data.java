package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Girlshelf_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, -13, 0, -1, 31, 1),
		Block.createCuboidShape(1, -13, 0, 15, 31, 1),
		Block.createCuboidShape(-15, 31, 0, 15, 32, 15),
		Block.createCuboidShape(-15, -14, 0, 15, -13, 15),
		Block.createCuboidShape(-16, -14, 15, 16, 32, 16),
		Block.createCuboidShape(-15, -13, 1, 15, 31, 2),
		Block.createCuboidShape(15, -14, 0, 16, 32, 15),
		Block.createCuboidShape(-16, -14, 0, -15, 32, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, -13, -15, 16, 31, -1),
		Block.createCuboidShape(15, -13, 1, 16, 31, 15),
		Block.createCuboidShape(1, 31, -15, 16, 32, 15),
		Block.createCuboidShape(1, -14, -15, 16, -13, 15),
		Block.createCuboidShape(0, -14, -16, 1, 32, 16),
		Block.createCuboidShape(14, -13, -15, 15, 31, 15),
		Block.createCuboidShape(1, -14, 15, 16, 32, 16),
		Block.createCuboidShape(1, -14, -16, 16, 32, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(17, -13, 15, 31, 31, 16),
		Block.createCuboidShape(1, -13, 15, 15, 31, 16),
		Block.createCuboidShape(1, 31, 1, 31, 32, 16),
		Block.createCuboidShape(1, -14, 1, 31, -13, 16),
		Block.createCuboidShape(0, -14, 0, 32, 32, 1),
		Block.createCuboidShape(1, -13, 14, 31, 31, 15),
		Block.createCuboidShape(0, -14, 1, 1, 32, 16),
		Block.createCuboidShape(31, -14, 1, 32, 32, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, -13, 17, 1, 31, 31),
		Block.createCuboidShape(0, -13, 1, 1, 31, 15),
		Block.createCuboidShape(0, 31, 1, 15, 32, 31),
		Block.createCuboidShape(0, -14, 1, 15, -13, 31),
		Block.createCuboidShape(15, -14, 0, 16, 32, 32),
		Block.createCuboidShape(1, -13, 1, 2, 31, 31),
		Block.createCuboidShape(0, -14, 0, 15, 32, 1),
		Block.createCuboidShape(0, -14, 31, 15, 32, 32)
    );

    public Girlshelf_Data() {
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

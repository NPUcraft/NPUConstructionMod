package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fctable1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 15, 0, 16, 16, 16),
		Block.createCuboidShape(15, 0, 0, 16, 15, 1),
		Block.createCuboidShape(-16, 0, 0, -15, 15, 1),
		Block.createCuboidShape(15, 0, 15, 16, 15, 16),
		Block.createCuboidShape(-16, 0, 15, -15, 15, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 15, -16, 16, 16, 16),
		Block.createCuboidShape(15, 0, 15, 16, 15, 16),
		Block.createCuboidShape(15, 0, -16, 16, 15, -15),
		Block.createCuboidShape(0, 0, 15, 1, 15, 16),
		Block.createCuboidShape(0, 0, -16, 1, 15, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 15, 0, 32, 16, 16),
		Block.createCuboidShape(0, 0, 15, 1, 15, 16),
		Block.createCuboidShape(31, 0, 15, 32, 15, 16),
		Block.createCuboidShape(0, 0, 0, 1, 15, 1),
		Block.createCuboidShape(31, 0, 0, 32, 15, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 15, 0, 16, 16, 32),
		Block.createCuboidShape(0, 0, 0, 1, 15, 1),
		Block.createCuboidShape(0, 0, 31, 1, 15, 32),
		Block.createCuboidShape(15, 0, 0, 16, 15, 1),
		Block.createCuboidShape(15, 0, 31, 16, 15, 32)
    );

    public Fctable1_Data() {
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

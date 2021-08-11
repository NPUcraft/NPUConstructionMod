package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Railing4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 12, 8, 8, 31, 9),
		Block.createCuboidShape(7, 20, 9, 8, 25, 29),
		Block.createCuboidShape(7, 12, 9, 8, 17, 29),
		Block.createCuboidShape(0, 0, 0, 16, 8, 32),
		Block.createCuboidShape(7, 30, 9, 8, 31, 31),
		Block.createCuboidShape(7, 9, 8, 8, 30, 9),
		Block.createCuboidShape(7, 9, 29, 8, 30, 30)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 12, 0, 8, 31, 8),
		Block.createCuboidShape(-13, 20, 7, 7, 25, 8),
		Block.createCuboidShape(-13, 12, 7, 7, 17, 8),
		Block.createCuboidShape(-16, 0, 0, 16, 8, 16),
		Block.createCuboidShape(-15, 30, 7, 7, 31, 8),
		Block.createCuboidShape(7, 9, 7, 8, 30, 8),
		Block.createCuboidShape(-14, 9, 7, -13, 30, 8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(8, 12, 7, 16, 31, 8),
		Block.createCuboidShape(8, 20, -13, 9, 25, 7),
		Block.createCuboidShape(8, 12, -13, 9, 17, 7),
		Block.createCuboidShape(0, 0, -16, 16, 8, 16),
		Block.createCuboidShape(8, 30, -15, 9, 31, 7),
		Block.createCuboidShape(8, 9, 7, 9, 30, 8),
		Block.createCuboidShape(8, 9, -14, 9, 30, -13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 12, 8, 9, 31, 16),
		Block.createCuboidShape(9, 20, 8, 29, 25, 9),
		Block.createCuboidShape(9, 12, 8, 29, 17, 9),
		Block.createCuboidShape(0, 0, 0, 32, 8, 16),
		Block.createCuboidShape(9, 30, 8, 31, 31, 9),
		Block.createCuboidShape(8, 9, 8, 9, 30, 9),
		Block.createCuboidShape(29, 9, 8, 30, 30, 9)
    );

    public Railing4_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyfdoor7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 2, 6, 16, 16, 16),
		Block.createCuboidShape(-15, 0, 11, 15, 1, 12),
		Block.createCuboidShape(-16, 0, 8, -15, 1, 14),
		Block.createCuboidShape(-16, 1, 8, 16, 2, 14),
		Block.createCuboidShape(15, 0, 8, 16, 1, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 2, -16, 10, 16, 16),
		Block.createCuboidShape(4, 0, -15, 5, 1, 15),
		Block.createCuboidShape(2, 0, -16, 8, 1, -15),
		Block.createCuboidShape(2, 1, -16, 8, 2, 16),
		Block.createCuboidShape(2, 0, 15, 8, 1, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 0, 32, 16, 10),
		Block.createCuboidShape(1, 0, 4, 31, 1, 5),
		Block.createCuboidShape(31, 0, 2, 32, 1, 8),
		Block.createCuboidShape(0, 1, 2, 32, 2, 8),
		Block.createCuboidShape(0, 0, 2, 1, 1, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 2, 0, 16, 16, 32),
		Block.createCuboidShape(11, 0, 1, 12, 1, 31),
		Block.createCuboidShape(8, 0, 31, 14, 1, 32),
		Block.createCuboidShape(8, 1, 0, 14, 2, 32),
		Block.createCuboidShape(8, 0, 0, 14, 1, 1)
    );

    public Fyfdoor7_Data() {
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

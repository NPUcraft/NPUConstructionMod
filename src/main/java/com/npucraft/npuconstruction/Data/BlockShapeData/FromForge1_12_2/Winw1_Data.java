package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winw1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 6, 16, 1, 10),
		Block.createCuboidShape(0, 15, 6, 16, 16, 10),
		Block.createCuboidShape(0, 1, 6, 1, 15, 10),
		Block.createCuboidShape(15, 1, 6, 16, 15, 10),
		Block.createCuboidShape(1, 1, 7, 15, 15, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 0, 10, 1, 16),
		Block.createCuboidShape(6, 15, 0, 10, 16, 16),
		Block.createCuboidShape(6, 1, 0, 10, 15, 1),
		Block.createCuboidShape(6, 1, 15, 10, 15, 16),
		Block.createCuboidShape(7, 1, 1, 9, 15, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 6, 16, 1, 10),
		Block.createCuboidShape(0, 15, 6, 16, 16, 10),
		Block.createCuboidShape(15, 1, 6, 16, 15, 10),
		Block.createCuboidShape(0, 1, 6, 1, 15, 10),
		Block.createCuboidShape(1, 1, 7, 15, 15, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 0, 10, 1, 16),
		Block.createCuboidShape(6, 15, 0, 10, 16, 16),
		Block.createCuboidShape(6, 1, 15, 10, 15, 16),
		Block.createCuboidShape(6, 1, 0, 10, 15, 1),
		Block.createCuboidShape(7, 1, 1, 9, 15, 15)
    );

    public Winw1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 9, 7, 15, 15, 9),
		Block.createCuboidShape(15, 0, 7, 16, 16, 9),
		Block.createCuboidShape(0, 19, 7, 16, 20, 9),
		Block.createCuboidShape(0, 0, 7, 1, 16, 9),
		Block.createCuboidShape(1, 4, 7, 15, 5, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, 1, 9, 15, 15),
		Block.createCuboidShape(7, 0, 15, 9, 16, 16),
		Block.createCuboidShape(7, 19, 0, 9, 20, 16),
		Block.createCuboidShape(7, 0, 0, 9, 16, 1),
		Block.createCuboidShape(7, 4, 1, 9, 5, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 9, 7, 15, 15, 9),
		Block.createCuboidShape(0, 0, 7, 1, 16, 9),
		Block.createCuboidShape(0, 19, 7, 16, 20, 9),
		Block.createCuboidShape(15, 0, 7, 16, 16, 9),
		Block.createCuboidShape(1, 4, 7, 15, 5, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, 1, 9, 15, 15),
		Block.createCuboidShape(7, 0, 0, 9, 16, 1),
		Block.createCuboidShape(7, 19, 0, 9, 20, 16),
		Block.createCuboidShape(7, 0, 15, 9, 16, 16),
		Block.createCuboidShape(7, 4, 1, 9, 5, 15)
    );

    public Fence3_Data() {
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

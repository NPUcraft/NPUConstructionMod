package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 9, 7, 15, 15, 9),
		Block.createCuboidShape(15, -8, 7, 16, 19, 9),
		Block.createCuboidShape(0, -8, 7, 1, 13, 9),
		Block.createCuboidShape(-2, 19, 7, 16, 20, 9),
		Block.createCuboidShape(-1, 3, 7, 15, 4, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, -1, 9, 15, 15),
		Block.createCuboidShape(7, -8, 15, 9, 19, 16),
		Block.createCuboidShape(7, -8, 0, 9, 13, 1),
		Block.createCuboidShape(7, 19, -2, 9, 20, 16),
		Block.createCuboidShape(7, 3, -1, 9, 4, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 9, 7, 17, 15, 9),
		Block.createCuboidShape(0, -8, 7, 1, 19, 9),
		Block.createCuboidShape(15, -8, 7, 16, 13, 9),
		Block.createCuboidShape(0, 19, 7, 18, 20, 9),
		Block.createCuboidShape(1, 3, 7, 17, 4, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, 1, 9, 15, 17),
		Block.createCuboidShape(7, -8, 0, 9, 19, 1),
		Block.createCuboidShape(7, -8, 15, 9, 13, 16),
		Block.createCuboidShape(7, 19, 0, 9, 20, 18),
		Block.createCuboidShape(7, 3, 1, 9, 4, 17)
    );

    public Fence8_Data() {
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

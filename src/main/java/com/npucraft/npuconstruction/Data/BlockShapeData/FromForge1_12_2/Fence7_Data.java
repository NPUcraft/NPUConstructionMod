package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fence7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, -7, 7, 17, -1, 9),
		Block.createCuboidShape(15, -16, 7, 16, 10, 9),
		Block.createCuboidShape(0, -16, 7, 1, 4, 9),
		Block.createCuboidShape(0, 3, 7, 18, 4, 9),
		Block.createCuboidShape(1, -12, 7, 17, -11, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, -7, 1, 9, -1, 17),
		Block.createCuboidShape(7, -16, 15, 9, 10, 16),
		Block.createCuboidShape(7, -16, 0, 9, 4, 1),
		Block.createCuboidShape(7, 3, 0, 9, 4, 18),
		Block.createCuboidShape(7, -12, 1, 9, -11, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, -7, 7, 15, -1, 9),
		Block.createCuboidShape(0, -16, 7, 1, 10, 9),
		Block.createCuboidShape(15, -16, 7, 16, 4, 9),
		Block.createCuboidShape(-2, 3, 7, 16, 4, 9),
		Block.createCuboidShape(-1, -12, 7, 15, -11, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -7, -1, 9, -1, 15),
		Block.createCuboidShape(7, -16, 0, 9, 10, 1),
		Block.createCuboidShape(7, -16, 15, 9, 4, 16),
		Block.createCuboidShape(7, 3, -2, 9, 4, 16),
		Block.createCuboidShape(7, -12, -1, 9, -11, 15)
    );

    public Fence7_Data() {
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

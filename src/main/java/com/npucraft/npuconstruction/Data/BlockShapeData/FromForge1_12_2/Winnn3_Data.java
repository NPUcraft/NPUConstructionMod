package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 6, 16, 16, 9),
		Block.createCuboidShape(1, 9, 6, 15, 10, 13),
		Block.createCuboidShape(0, 0, 6, 16, 1, 9),
		Block.createCuboidShape(0, 0, 6, 2, 15, 9),
		Block.createCuboidShape(14, 0, 6, 16, 15, 9),
		Block.createCuboidShape(2, 1, 6, 14, 15, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 14, 0, 10, 16, 16),
		Block.createCuboidShape(3, 9, 1, 10, 10, 15),
		Block.createCuboidShape(7, 0, 0, 10, 1, 16),
		Block.createCuboidShape(7, 0, 0, 10, 15, 2),
		Block.createCuboidShape(7, 0, 14, 10, 15, 16),
		Block.createCuboidShape(9, 1, 2, 10, 15, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 7, 16, 16, 10),
		Block.createCuboidShape(1, 9, 3, 15, 10, 10),
		Block.createCuboidShape(0, 0, 7, 16, 1, 10),
		Block.createCuboidShape(14, 0, 7, 16, 15, 10),
		Block.createCuboidShape(0, 0, 7, 2, 15, 10),
		Block.createCuboidShape(2, 1, 9, 14, 15, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 14, 0, 9, 16, 16),
		Block.createCuboidShape(6, 9, 1, 13, 10, 15),
		Block.createCuboidShape(6, 0, 0, 9, 1, 16),
		Block.createCuboidShape(6, 0, 14, 9, 15, 16),
		Block.createCuboidShape(6, 0, 0, 9, 15, 2),
		Block.createCuboidShape(6, 1, 2, 7, 15, 14)
    );

    public Winnn3_Data() {
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

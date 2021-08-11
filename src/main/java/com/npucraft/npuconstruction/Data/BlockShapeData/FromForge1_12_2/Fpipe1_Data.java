package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, 0, 7, 14, 7, 16),
		Block.createCuboidShape(2, 0, 7, 3, 7, 16),
		Block.createCuboidShape(3, 0, 7, 13, 2, 8),
		Block.createCuboidShape(3, 0, 15, 13, 2, 16),
		Block.createCuboidShape(1, 10, 3, 15, 11, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 13, 9, 7, 14),
		Block.createCuboidShape(0, 0, 2, 9, 7, 3),
		Block.createCuboidShape(8, 0, 3, 9, 2, 13),
		Block.createCuboidShape(0, 0, 3, 1, 2, 13),
		Block.createCuboidShape(0, 10, 1, 13, 11, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 0, 3, 7, 9),
		Block.createCuboidShape(13, 0, 0, 14, 7, 9),
		Block.createCuboidShape(3, 0, 8, 13, 2, 9),
		Block.createCuboidShape(3, 0, 0, 13, 2, 1),
		Block.createCuboidShape(1, 10, 0, 15, 11, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 2, 16, 7, 3),
		Block.createCuboidShape(7, 0, 13, 16, 7, 14),
		Block.createCuboidShape(7, 0, 3, 8, 2, 13),
		Block.createCuboidShape(15, 0, 3, 16, 2, 13),
		Block.createCuboidShape(3, 10, 1, 16, 11, 15)
    );

    public Fpipe1_Data() {
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

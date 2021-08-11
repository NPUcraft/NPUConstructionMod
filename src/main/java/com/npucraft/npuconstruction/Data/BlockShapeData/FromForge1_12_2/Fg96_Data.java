package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg96_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, 6, 0, 14, 8, 16),
		Block.createCuboidShape(4, 6, 0, 9, 8, 16),
		Block.createCuboidShape(15, 0, 0, 16, 8, 16),
		Block.createCuboidShape(0, 0, 0, 1, 8, 16),
		Block.createCuboidShape(2, 6, 0, 3, 8, 16),
		Block.createCuboidShape(1, 0, 0, 15, 1, 16),
		Block.createCuboidShape(1, 1, 0, 15, 6, 2),
		Block.createCuboidShape(1, 1, 14, 15, 6, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 10, 16, 8, 14),
		Block.createCuboidShape(0, 6, 4, 16, 8, 9),
		Block.createCuboidShape(0, 0, 15, 16, 8, 16),
		Block.createCuboidShape(0, 0, 0, 16, 8, 1),
		Block.createCuboidShape(0, 6, 2, 16, 8, 3),
		Block.createCuboidShape(0, 0, 1, 16, 1, 15),
		Block.createCuboidShape(14, 1, 1, 16, 6, 15),
		Block.createCuboidShape(0, 1, 1, 2, 6, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 6, 0, 6, 8, 16),
		Block.createCuboidShape(7, 6, 0, 12, 8, 16),
		Block.createCuboidShape(0, 0, 0, 1, 8, 16),
		Block.createCuboidShape(15, 0, 0, 16, 8, 16),
		Block.createCuboidShape(13, 6, 0, 14, 8, 16),
		Block.createCuboidShape(1, 0, 0, 15, 1, 16),
		Block.createCuboidShape(1, 1, 14, 15, 6, 16),
		Block.createCuboidShape(1, 1, 0, 15, 6, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 2, 16, 8, 6),
		Block.createCuboidShape(0, 6, 7, 16, 8, 12),
		Block.createCuboidShape(0, 0, 0, 16, 8, 1),
		Block.createCuboidShape(0, 0, 15, 16, 8, 16),
		Block.createCuboidShape(0, 6, 13, 16, 8, 14),
		Block.createCuboidShape(0, 0, 1, 16, 1, 15),
		Block.createCuboidShape(0, 1, 1, 2, 6, 15),
		Block.createCuboidShape(14, 1, 1, 16, 6, 15)
    );

    public Fg96_Data() {
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

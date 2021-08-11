package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Mp_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 6, 11, 5, 12),
		Block.createCuboidShape(1, 5, 1, 15, 6, 16),
		Block.createCuboidShape(1, 11, 0, 15, 13, 1),
		Block.createCuboidShape(1, 6, 1, 15, 13, 2),
		Block.createCuboidShape(1, 6, 14, 15, 16, 16),
		Block.createCuboidShape(1, 6, 2, 2, 13, 14),
		Block.createCuboidShape(14, 6, 2, 15, 13, 14),
		Block.createCuboidShape(15, 11, 1, 16, 13, 16),
		Block.createCuboidShape(0, 11, 1, 1, 13, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 0, 5, 10, 5, 11),
		Block.createCuboidShape(0, 5, 1, 15, 6, 15),
		Block.createCuboidShape(15, 11, 1, 16, 13, 15),
		Block.createCuboidShape(14, 6, 1, 15, 13, 15),
		Block.createCuboidShape(0, 6, 1, 2, 16, 15),
		Block.createCuboidShape(2, 6, 1, 14, 13, 2),
		Block.createCuboidShape(2, 6, 14, 14, 13, 15),
		Block.createCuboidShape(0, 11, 15, 15, 13, 16),
		Block.createCuboidShape(0, 11, 0, 15, 13, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 4, 11, 5, 10),
		Block.createCuboidShape(1, 5, 0, 15, 6, 15),
		Block.createCuboidShape(1, 11, 15, 15, 13, 16),
		Block.createCuboidShape(1, 6, 14, 15, 13, 15),
		Block.createCuboidShape(1, 6, 0, 15, 16, 2),
		Block.createCuboidShape(14, 6, 2, 15, 13, 14),
		Block.createCuboidShape(1, 6, 2, 2, 13, 14),
		Block.createCuboidShape(0, 11, 0, 1, 13, 15),
		Block.createCuboidShape(15, 11, 0, 16, 13, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 5, 12, 5, 11),
		Block.createCuboidShape(1, 5, 1, 16, 6, 15),
		Block.createCuboidShape(0, 11, 1, 1, 13, 15),
		Block.createCuboidShape(1, 6, 1, 2, 13, 15),
		Block.createCuboidShape(14, 6, 1, 16, 16, 15),
		Block.createCuboidShape(2, 6, 14, 14, 13, 15),
		Block.createCuboidShape(2, 6, 1, 14, 13, 2),
		Block.createCuboidShape(1, 11, 0, 16, 13, 1),
		Block.createCuboidShape(1, 11, 15, 16, 13, 16)
    );

    public Mp_Data() {
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

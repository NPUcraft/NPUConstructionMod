package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class C2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 8, 3, 16, 9, 13),
		Block.createCuboidShape(7, 9, 1, 14, 10, 15),
		Block.createCuboidShape(0, 11, 1, 16, 12, 15),
		Block.createCuboidShape(10, 8, 1, 11, 11, 15),
		Block.createCuboidShape(5, 8, 1, 6, 11, 15),
		Block.createCuboidShape(0, 8, 0, 16, 12, 1),
		Block.createCuboidShape(0, 8, 15, 16, 12, 16),
		Block.createCuboidShape(0, 8, 1, 0, 11, 15),
		Block.createCuboidShape(16, 8, 1, 16, 11, 15),
		Block.createCuboidShape(2, 9, 1, 3, 10, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 8, 0, 13, 9, 16),
		Block.createCuboidShape(1, 9, 7, 15, 10, 14),
		Block.createCuboidShape(1, 11, 0, 15, 12, 16),
		Block.createCuboidShape(1, 8, 10, 15, 11, 11),
		Block.createCuboidShape(1, 8, 5, 15, 11, 6),
		Block.createCuboidShape(15, 8, 0, 16, 12, 16),
		Block.createCuboidShape(0, 8, 0, 1, 12, 16),
		Block.createCuboidShape(1, 8, 0, 15, 11, 0),
		Block.createCuboidShape(1, 8, 16, 15, 11, 16),
		Block.createCuboidShape(1, 9, 2, 15, 10, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 8, 3, 16, 9, 13),
		Block.createCuboidShape(2, 9, 1, 9, 10, 15),
		Block.createCuboidShape(0, 11, 1, 16, 12, 15),
		Block.createCuboidShape(5, 8, 1, 6, 11, 15),
		Block.createCuboidShape(10, 8, 1, 11, 11, 15),
		Block.createCuboidShape(0, 8, 15, 16, 12, 16),
		Block.createCuboidShape(0, 8, 0, 16, 12, 1),
		Block.createCuboidShape(16, 8, 1, 16, 11, 15),
		Block.createCuboidShape(0, 8, 1, 0, 11, 15),
		Block.createCuboidShape(13, 9, 1, 14, 10, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 8, 0, 13, 9, 16),
		Block.createCuboidShape(1, 9, 2, 15, 10, 9),
		Block.createCuboidShape(1, 11, 0, 15, 12, 16),
		Block.createCuboidShape(1, 8, 5, 15, 11, 6),
		Block.createCuboidShape(1, 8, 10, 15, 11, 11),
		Block.createCuboidShape(0, 8, 0, 1, 12, 16),
		Block.createCuboidShape(15, 8, 0, 16, 12, 16),
		Block.createCuboidShape(1, 8, 16, 15, 11, 16),
		Block.createCuboidShape(1, 8, 0, 15, 11, 0),
		Block.createCuboidShape(1, 9, 13, 15, 10, 14)
    );

    public C2_Data() {
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

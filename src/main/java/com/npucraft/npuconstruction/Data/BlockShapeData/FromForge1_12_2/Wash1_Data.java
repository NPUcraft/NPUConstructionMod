package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Wash1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 3, 13, 14, 10),
		Block.createCuboidShape(10, 0, 2, 16, 9, 16),
		Block.createCuboidShape(13, 9, 0, 16, 17, 16),
		Block.createCuboidShape(0, 9, 3, 13, 11, 13),
		Block.createCuboidShape(0, 9, 0, 13, 17, 3),
		Block.createCuboidShape(0, 9, 13, 13, 17, 16),
		Block.createCuboidShape(0, 22, 14, 14, 23, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 0, 13, 14, 13),
		Block.createCuboidShape(0, 0, 10, 14, 9, 16),
		Block.createCuboidShape(0, 9, 13, 16, 17, 16),
		Block.createCuboidShape(3, 9, 0, 13, 11, 13),
		Block.createCuboidShape(13, 9, 0, 16, 17, 13),
		Block.createCuboidShape(0, 9, 0, 3, 17, 13),
		Block.createCuboidShape(1, 22, 0, 2, 23, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 11, 6, 16, 14, 13),
		Block.createCuboidShape(0, 0, 0, 6, 9, 14),
		Block.createCuboidShape(0, 9, 0, 3, 17, 16),
		Block.createCuboidShape(3, 9, 3, 16, 11, 13),
		Block.createCuboidShape(3, 9, 13, 16, 17, 16),
		Block.createCuboidShape(3, 9, 0, 16, 17, 3),
		Block.createCuboidShape(2, 22, 1, 16, 23, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 11, 3, 10, 14, 16),
		Block.createCuboidShape(2, 0, 0, 16, 9, 6),
		Block.createCuboidShape(0, 9, 0, 16, 17, 3),
		Block.createCuboidShape(3, 9, 3, 13, 11, 16),
		Block.createCuboidShape(0, 9, 3, 3, 17, 16),
		Block.createCuboidShape(13, 9, 3, 16, 17, 16),
		Block.createCuboidShape(14, 22, 2, 15, 23, 16)
    );

    public Wash1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Wall8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 0, 15, 16, 1),
		Block.createCuboidShape(9, 0, 15, 15, 16, 16),
		Block.createCuboidShape(1, 0, 15, 7, 16, 16),
		Block.createCuboidShape(0, 0, 9, 1, 16, 15),
		Block.createCuboidShape(0, 0, 1, 1, 16, 7),
		Block.createCuboidShape(15, 0, 1, 16, 16, 7),
		Block.createCuboidShape(15, 0, 9, 16, 16, 15),
		Block.createCuboidShape(1, 0, 1, 15, 16, 15),
		Block.createCuboidShape(1, 0, 0, 3, 16, 1)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 0, 5, 16, 16, 15),
		Block.createCuboidShape(0, 0, 9, 1, 16, 15),
		Block.createCuboidShape(0, 0, 1, 1, 16, 7),
		Block.createCuboidShape(1, 0, 0, 7, 16, 1),
		Block.createCuboidShape(9, 0, 0, 15, 16, 1),
		Block.createCuboidShape(9, 0, 15, 15, 16, 16),
		Block.createCuboidShape(1, 0, 15, 7, 16, 16),
		Block.createCuboidShape(1, 0, 1, 15, 16, 15),
		Block.createCuboidShape(15, 0, 1, 16, 16, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 15, 11, 16, 16),
		Block.createCuboidShape(1, 0, 0, 7, 16, 1),
		Block.createCuboidShape(9, 0, 0, 15, 16, 1),
		Block.createCuboidShape(15, 0, 1, 16, 16, 7),
		Block.createCuboidShape(15, 0, 9, 16, 16, 15),
		Block.createCuboidShape(0, 0, 9, 1, 16, 15),
		Block.createCuboidShape(0, 0, 1, 1, 16, 7),
		Block.createCuboidShape(1, 0, 1, 15, 16, 15),
		Block.createCuboidShape(13, 0, 15, 15, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 1, 1, 16, 11),
		Block.createCuboidShape(15, 0, 1, 16, 16, 7),
		Block.createCuboidShape(15, 0, 9, 16, 16, 15),
		Block.createCuboidShape(9, 0, 15, 15, 16, 16),
		Block.createCuboidShape(1, 0, 15, 7, 16, 16),
		Block.createCuboidShape(1, 0, 0, 7, 16, 1),
		Block.createCuboidShape(9, 0, 0, 15, 16, 1),
		Block.createCuboidShape(1, 0, 1, 15, 16, 15),
		Block.createCuboidShape(0, 0, 13, 1, 16, 15)
    );

    public Wall8_Data() {
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

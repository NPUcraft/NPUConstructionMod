package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall13_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 2, 3, 6, 3),
		Block.createCuboidShape(2, 0, 13, 3, 6, 14),
		Block.createCuboidShape(13, 0, 13, 14, 6, 14),
		Block.createCuboidShape(13, 0, 2, 14, 6, 3),
		Block.createCuboidShape(1, 6, 1, 15, 8, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(13, 0, 2, 14, 6, 3),
		Block.createCuboidShape(2, 0, 2, 3, 6, 3),
		Block.createCuboidShape(2, 0, 13, 3, 6, 14),
		Block.createCuboidShape(13, 0, 13, 14, 6, 14),
		Block.createCuboidShape(1, 6, 1, 15, 8, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(13, 0, 13, 14, 6, 14),
		Block.createCuboidShape(13, 0, 2, 14, 6, 3),
		Block.createCuboidShape(2, 0, 2, 3, 6, 3),
		Block.createCuboidShape(2, 0, 13, 3, 6, 14),
		Block.createCuboidShape(1, 6, 1, 15, 8, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 13, 3, 6, 14),
		Block.createCuboidShape(13, 0, 13, 14, 6, 14),
		Block.createCuboidShape(13, 0, 2, 14, 6, 3),
		Block.createCuboidShape(2, 0, 2, 3, 6, 3),
		Block.createCuboidShape(1, 6, 1, 15, 8, 15)
    );

    public Dhall13_Data() {
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

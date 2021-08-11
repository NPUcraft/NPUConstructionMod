package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Ftrash_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 3, 12),
		Block.createCuboidShape(3, 0, 3, 13, 0, 13),
		Block.createCuboidShape(13, 0, 7, 14, 14, 10),
		Block.createCuboidShape(2, 0, 7, 3, 14, 10),
		Block.createCuboidShape(6, 0, 13, 10, 14, 14),
		Block.createCuboidShape(6, 0, 3, 10, 14, 3)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 0, 5, 11, 3, 11),
		Block.createCuboidShape(3, 0, 3, 13, 0, 13),
		Block.createCuboidShape(6, 0, 13, 9, 14, 14),
		Block.createCuboidShape(6, 0, 2, 9, 14, 3),
		Block.createCuboidShape(2, 0, 6, 3, 14, 10),
		Block.createCuboidShape(13, 0, 6, 13, 14, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 4, 11, 3, 11),
		Block.createCuboidShape(3, 0, 3, 13, 0, 13),
		Block.createCuboidShape(2, 0, 6, 3, 14, 9),
		Block.createCuboidShape(13, 0, 6, 14, 14, 9),
		Block.createCuboidShape(6, 0, 2, 10, 14, 3),
		Block.createCuboidShape(6, 0, 13, 10, 14, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 12, 3, 11),
		Block.createCuboidShape(3, 0, 3, 13, 0, 13),
		Block.createCuboidShape(7, 0, 2, 10, 14, 3),
		Block.createCuboidShape(7, 0, 13, 10, 14, 14),
		Block.createCuboidShape(13, 0, 6, 14, 14, 10),
		Block.createCuboidShape(3, 0, 6, 3, 14, 10)
    );

    public Ftrash_Data() {
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

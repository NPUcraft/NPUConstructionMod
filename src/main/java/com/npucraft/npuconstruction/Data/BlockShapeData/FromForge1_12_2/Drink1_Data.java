package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Drink1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 0, 14, 13, 8, 15),
		Block.createCuboidShape(3, 0, 7, 13, 8, 8),
		Block.createCuboidShape(13, 1, 8, 13, 8, 14),
		Block.createCuboidShape(3, 1, 8, 3, 8, 14),
		Block.createCuboidShape(3, 0, 7, 13, 2, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 0, 3, 2, 8, 13),
		Block.createCuboidShape(8, 0, 3, 9, 8, 13),
		Block.createCuboidShape(2, 1, 13, 8, 8, 13),
		Block.createCuboidShape(2, 1, 3, 8, 8, 3),
		Block.createCuboidShape(1, 0, 3, 9, 2, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 0, 1, 13, 8, 2),
		Block.createCuboidShape(3, 0, 8, 13, 8, 9),
		Block.createCuboidShape(3, 1, 2, 3, 8, 8),
		Block.createCuboidShape(13, 1, 2, 13, 8, 8),
		Block.createCuboidShape(3, 0, 1, 13, 2, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 0, 3, 15, 8, 13),
		Block.createCuboidShape(7, 0, 3, 8, 8, 13),
		Block.createCuboidShape(8, 1, 3, 14, 8, 3),
		Block.createCuboidShape(8, 1, 13, 14, 8, 13),
		Block.createCuboidShape(7, 0, 3, 15, 2, 13)
    );

    public Drink1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 2, 7, 15, 11, 9),
		Block.createCuboidShape(1, 3, 7, 15, 9, 9),
		Block.createCuboidShape(1, 2, 7, 2, 11, 9),
		Block.createCuboidShape(13, 2, 7, 13, 24, 9),
		Block.createCuboidShape(1, 2, 9, 15, 10, 9),
		Block.createCuboidShape(1, 2, 7, 15, 10, 7),
		Block.createCuboidShape(1, 1, 7, 15, 2, 9),
		Block.createCuboidShape(1, 11, 7, 15, 12, 9),
		Block.createCuboidShape(3, 11, 7, 3, 24, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 2, 4, 9, 11, 15),
		Block.createCuboidShape(7, 3, 1, 9, 9, 15),
		Block.createCuboidShape(7, 2, 1, 9, 11, 2),
		Block.createCuboidShape(7, 2, 13, 9, 24, 13),
		Block.createCuboidShape(7, 2, 1, 7, 10, 15),
		Block.createCuboidShape(9, 2, 1, 9, 10, 15),
		Block.createCuboidShape(7, 1, 1, 9, 2, 15),
		Block.createCuboidShape(7, 11, 1, 9, 12, 15),
		Block.createCuboidShape(7, 11, 3, 9, 24, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 2, 7, 12, 11, 9),
		Block.createCuboidShape(1, 3, 7, 15, 9, 9),
		Block.createCuboidShape(14, 2, 7, 15, 11, 9),
		Block.createCuboidShape(3, 2, 7, 3, 24, 9),
		Block.createCuboidShape(1, 2, 7, 15, 10, 7),
		Block.createCuboidShape(1, 2, 9, 15, 10, 9),
		Block.createCuboidShape(1, 1, 7, 15, 2, 9),
		Block.createCuboidShape(1, 11, 7, 15, 12, 9),
		Block.createCuboidShape(13, 11, 7, 13, 24, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 2, 1, 9, 11, 12),
		Block.createCuboidShape(7, 3, 1, 9, 9, 15),
		Block.createCuboidShape(7, 2, 14, 9, 11, 15),
		Block.createCuboidShape(7, 2, 3, 9, 24, 3),
		Block.createCuboidShape(9, 2, 1, 9, 10, 15),
		Block.createCuboidShape(7, 2, 1, 7, 10, 15),
		Block.createCuboidShape(7, 1, 1, 9, 2, 15),
		Block.createCuboidShape(7, 11, 1, 9, 12, 15),
		Block.createCuboidShape(7, 11, 13, 9, 24, 13)
    );

    public Light7_Data() {
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

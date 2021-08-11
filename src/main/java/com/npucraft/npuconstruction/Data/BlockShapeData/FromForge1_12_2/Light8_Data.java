package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 2, 2, 9, 11, 11),
		Block.createCuboidShape(7, 2, 13, 9, 11, 16),
		Block.createCuboidShape(7, 3, 2, 9, 9, 16),
		Block.createCuboidShape(7, 2, 2, 7, 10, 16),
		Block.createCuboidShape(9, 2, 2, 9, 10, 16),
		Block.createCuboidShape(7, 1, 2, 9, 2, 16),
		Block.createCuboidShape(7, 11, 2, 9, 12, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 7, 14, 11, 9),
		Block.createCuboidShape(0, 2, 7, 3, 11, 9),
		Block.createCuboidShape(0, 3, 7, 14, 9, 9),
		Block.createCuboidShape(0, 2, 7, 14, 10, 7),
		Block.createCuboidShape(0, 2, 9, 14, 10, 9),
		Block.createCuboidShape(0, 1, 7, 14, 2, 9),
		Block.createCuboidShape(0, 11, 7, 14, 12, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 2, 5, 9, 11, 14),
		Block.createCuboidShape(7, 2, 0, 9, 11, 3),
		Block.createCuboidShape(7, 3, 0, 9, 9, 14),
		Block.createCuboidShape(9, 2, 0, 9, 10, 14),
		Block.createCuboidShape(7, 2, 0, 7, 10, 14),
		Block.createCuboidShape(7, 1, 0, 9, 2, 14),
		Block.createCuboidShape(7, 11, 0, 9, 12, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 2, 7, 11, 11, 9),
		Block.createCuboidShape(13, 2, 7, 16, 11, 9),
		Block.createCuboidShape(2, 3, 7, 16, 9, 9),
		Block.createCuboidShape(2, 2, 9, 16, 10, 9),
		Block.createCuboidShape(2, 2, 7, 16, 10, 7),
		Block.createCuboidShape(2, 1, 7, 16, 2, 9),
		Block.createCuboidShape(2, 11, 7, 16, 12, 9)
    );

    public Light8_Data() {
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

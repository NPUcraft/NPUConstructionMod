package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, 2, 13, 16, 11, 16),
		Block.createCuboidShape(3, 2, 3, 16, 3, 16),
		Block.createCuboidShape(3, 10, 3, 16, 11, 16),
		Block.createCuboidShape(-1, 1, 2, 16, 12, 3),
		Block.createCuboidShape(2, 2, 8, 3, 11, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 13, 3, 11, 16),
		Block.createCuboidShape(0, 2, 3, 13, 3, 16),
		Block.createCuboidShape(0, 10, 3, 13, 11, 16),
		Block.createCuboidShape(13, 1, -1, 14, 12, 16),
		Block.createCuboidShape(0, 2, 2, 8, 11, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 0, 3, 11, 3),
		Block.createCuboidShape(0, 2, 0, 13, 3, 13),
		Block.createCuboidShape(0, 10, 0, 13, 11, 13),
		Block.createCuboidShape(0, 1, 13, 17, 12, 14),
		Block.createCuboidShape(13, 2, 0, 14, 11, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(13, 2, 0, 16, 11, 3),
		Block.createCuboidShape(3, 2, 0, 16, 3, 13),
		Block.createCuboidShape(3, 10, 0, 16, 11, 13),
		Block.createCuboidShape(2, 1, 0, 3, 12, 17),
		Block.createCuboidShape(8, 2, 13, 16, 11, 14)
    );

    public Fpipe4_Data() {
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

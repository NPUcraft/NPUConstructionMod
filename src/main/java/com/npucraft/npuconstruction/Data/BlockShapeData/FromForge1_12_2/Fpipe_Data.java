package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, 0, 7, 14, 16, 16),
		Block.createCuboidShape(2, 0, 7, 3, 16, 16),
		Block.createCuboidShape(3, 0, 7, 13, 16, 8),
		Block.createCuboidShape(3, 0, 15, 13, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 13, 9, 16, 14),
		Block.createCuboidShape(0, 0, 2, 9, 16, 3),
		Block.createCuboidShape(8, 0, 3, 9, 16, 13),
		Block.createCuboidShape(0, 0, 3, 1, 16, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 0, 3, 16, 9),
		Block.createCuboidShape(13, 0, 0, 14, 16, 9),
		Block.createCuboidShape(3, 0, 8, 13, 16, 9),
		Block.createCuboidShape(3, 0, 0, 13, 16, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 2, 16, 16, 3),
		Block.createCuboidShape(7, 0, 13, 16, 16, 14),
		Block.createCuboidShape(7, 0, 3, 8, 16, 13),
		Block.createCuboidShape(15, 0, 3, 16, 16, 13)
    );

    public Fpipe_Data() {
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

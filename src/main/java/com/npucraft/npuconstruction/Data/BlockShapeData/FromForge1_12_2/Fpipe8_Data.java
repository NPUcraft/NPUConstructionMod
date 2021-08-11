package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 14, 10, 8, 16),
		Block.createCuboidShape(0, 6, 14, 8, 10, 16),
		Block.createCuboidShape(0, 0, 16, 9, 9, 16),
		Block.createCuboidShape(0, 0, 13, 9, 9, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 6, 2, 8, 10),
		Block.createCuboidShape(0, 6, 0, 2, 10, 8),
		Block.createCuboidShape(0, 0, 0, 0, 9, 9),
		Block.createCuboidShape(2, 0, 0, 3, 9, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 0, 10, 8, 2),
		Block.createCuboidShape(8, 6, 0, 16, 10, 2),
		Block.createCuboidShape(7, 0, 0, 16, 9, 0),
		Block.createCuboidShape(7, 0, 2, 16, 9, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 0, 6, 16, 8, 10),
		Block.createCuboidShape(14, 6, 8, 16, 10, 16),
		Block.createCuboidShape(16, 0, 7, 16, 9, 16),
		Block.createCuboidShape(13, 0, 7, 14, 9, 16)
    );

    public Fpipe8_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(8, 6, 14, 16, 10, 16),
		Block.createCuboidShape(6, 0, 14, 10, 8, 16),
		Block.createCuboidShape(7, 0, 16, 16, 9, 16),
		Block.createCuboidShape(7, 0, 13, 16, 9, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 8, 2, 10, 16),
		Block.createCuboidShape(0, 0, 6, 2, 8, 10),
		Block.createCuboidShape(0, 0, 7, 0, 9, 16),
		Block.createCuboidShape(2, 0, 7, 3, 9, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 0, 8, 10, 2),
		Block.createCuboidShape(6, 0, 0, 10, 8, 2),
		Block.createCuboidShape(0, 0, 0, 9, 9, 0),
		Block.createCuboidShape(0, 0, 2, 9, 9, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 6, 0, 16, 10, 8),
		Block.createCuboidShape(14, 0, 6, 16, 8, 10),
		Block.createCuboidShape(16, 0, 0, 16, 9, 9),
		Block.createCuboidShape(13, 0, 0, 14, 9, 9)
    );

    public Fpipe9_Data() {
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

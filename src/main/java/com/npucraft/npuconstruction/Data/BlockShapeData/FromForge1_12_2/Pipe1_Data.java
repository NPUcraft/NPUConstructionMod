package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Pipe1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(11, 4, 3, 15, 7, 7),
		Block.createCuboidShape(12, 3, 12, 14, 16, 16),
		Block.createCuboidShape(11, 5, 13, 15, 16, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, 4, 11, 13, 7, 15),
		Block.createCuboidShape(0, 3, 12, 4, 16, 14),
		Block.createCuboidShape(1, 5, 11, 3, 16, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 4, 9, 5, 7, 13),
		Block.createCuboidShape(2, 3, 0, 4, 16, 4),
		Block.createCuboidShape(1, 5, 1, 5, 16, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 4, 1, 7, 7, 5),
		Block.createCuboidShape(12, 3, 2, 16, 16, 4),
		Block.createCuboidShape(13, 5, 1, 15, 16, 5)
    );

    public Pipe1_Data() {
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

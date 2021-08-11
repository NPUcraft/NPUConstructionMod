package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Pipe4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(12, 0, 15, 14, 16, 16),
		Block.createCuboidShape(12, 0, 12, 14, 16, 13),
		Block.createCuboidShape(14, 0, 13, 15, 16, 15),
		Block.createCuboidShape(11, 0, 13, 12, 16, 15),
		Block.createCuboidShape(11, 7, 12, 16, 8, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 12, 1, 16, 14),
		Block.createCuboidShape(3, 0, 12, 4, 16, 14),
		Block.createCuboidShape(1, 0, 14, 3, 16, 15),
		Block.createCuboidShape(1, 0, 11, 3, 16, 12),
		Block.createCuboidShape(4, 7, 11, 4, 8, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 0, 4, 16, 1),
		Block.createCuboidShape(2, 0, 3, 4, 16, 4),
		Block.createCuboidShape(1, 0, 1, 2, 16, 3),
		Block.createCuboidShape(4, 0, 1, 5, 16, 3),
		Block.createCuboidShape(0, 7, 4, 5, 8, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 0, 2, 16, 16, 4),
		Block.createCuboidShape(12, 0, 2, 13, 16, 4),
		Block.createCuboidShape(13, 0, 1, 15, 16, 2),
		Block.createCuboidShape(13, 0, 4, 15, 16, 5),
		Block.createCuboidShape(12, 7, 0, 12, 8, 5)
    );

    public Pipe4_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Trash1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 1, -1, 3, 17, 2),
		Block.createCuboidShape(13, 1, 12, 16, 17, 15),
		Block.createCuboidShape(13, 1, -1, 16, 17, 2),
		Block.createCuboidShape(0, 1, 12, 3, 17, 15),
		Block.createCuboidShape(0, 1, 2, 2, 17, 12),
		Block.createCuboidShape(14, 1, 2, 16, 17, 12),
		Block.createCuboidShape(3, 1, -1, 13, 17, 1),
		Block.createCuboidShape(3, 1, 13, 13, 17, 15),
		Block.createCuboidShape(1, 0, 0, 15, 1, 14),
		Block.createCuboidShape(0, 6, 15, 16, 20, 16),
		Block.createCuboidShape(1, 17, 14, 15, 19, 15),
		Block.createCuboidShape(1, 17, -1, 15, 19, 0),
		Block.createCuboidShape(0, 17, 0, 1, 19, 14),
		Block.createCuboidShape(15, 17, 0, 16, 19, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 1, 3, 17, 17, 13),
		Block.createCuboidShape(14, 1, 0, 17, 17, 3),
		Block.createCuboidShape(1, 1, 13, 4, 17, 16),
		Block.createCuboidShape(14, 1, 13, 17, 17, 16),
		Block.createCuboidShape(1, 1, 0, 4, 17, 3),
		Block.createCuboidShape(4, 1, 0, 14, 17, 2),
		Block.createCuboidShape(4, 1, 14, 14, 17, 16),
		Block.createCuboidShape(1, 1, 3, 3, 17, 13),
		Block.createCuboidShape(2, 0, 1, 16, 1, 15),
		Block.createCuboidShape(0, 6, 0, 1, 20, 16),
		Block.createCuboidShape(1, 17, 1, 2, 19, 15),
		Block.createCuboidShape(16, 17, 1, 17, 19, 15),
		Block.createCuboidShape(2, 17, 0, 16, 19, 1),
		Block.createCuboidShape(2, 17, 15, 16, 19, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 1, 15, 13, 17, 17),
		Block.createCuboidShape(13, 1, 14, 16, 17, 17),
		Block.createCuboidShape(0, 1, 1, 3, 17, 4),
		Block.createCuboidShape(0, 1, 14, 3, 17, 17),
		Block.createCuboidShape(13, 1, 1, 16, 17, 4),
		Block.createCuboidShape(0, 1, 4, 2, 17, 14),
		Block.createCuboidShape(14, 1, 4, 16, 17, 14),
		Block.createCuboidShape(3, 1, 1, 13, 17, 3),
		Block.createCuboidShape(1, 0, 2, 15, 1, 16),
		Block.createCuboidShape(0, 6, 0, 16, 20, 1),
		Block.createCuboidShape(1, 17, 1, 15, 19, 2),
		Block.createCuboidShape(1, 17, 16, 15, 19, 17),
		Block.createCuboidShape(15, 17, 2, 16, 19, 16),
		Block.createCuboidShape(0, 17, 2, 1, 19, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 1, 13, 2, 17, 16),
		Block.createCuboidShape(12, 1, 0, 15, 17, 3),
		Block.createCuboidShape(-1, 1, 0, 2, 17, 3),
		Block.createCuboidShape(12, 1, 13, 15, 17, 16),
		Block.createCuboidShape(2, 1, 0, 12, 17, 2),
		Block.createCuboidShape(-1, 1, 3, 1, 17, 13),
		Block.createCuboidShape(2, 1, 14, 12, 17, 16),
		Block.createCuboidShape(13, 1, 3, 15, 17, 13),
		Block.createCuboidShape(0, 0, 1, 14, 1, 15),
		Block.createCuboidShape(15, 6, 0, 16, 20, 16),
		Block.createCuboidShape(14, 17, 1, 15, 19, 15),
		Block.createCuboidShape(-1, 17, 1, 0, 19, 15),
		Block.createCuboidShape(0, 17, 15, 14, 19, 16),
		Block.createCuboidShape(0, 17, 0, 14, 19, 1)
    );

    public Trash1_Data() {
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

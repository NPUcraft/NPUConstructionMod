package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Urinal_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 11, 9, 8, 16),
		Block.createCuboidShape(16, 5, 7, 17, 24, 16),
		Block.createCuboidShape(-1, 5, 7, 0, 24, 16),
		Block.createCuboidShape(4, 8, 11, 12, 9, 16),
		Block.createCuboidShape(0, 25, 15, 16, 26, 16),
		Block.createCuboidShape(4, 9, 15, 12, 19, 16),
		Block.createCuboidShape(3, 8, 12, 4, 21, 16),
		Block.createCuboidShape(12, 8, 12, 13, 21, 16),
		Block.createCuboidShape(4, 19, 13, 12, 21, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 7, 5, 8, 9),
		Block.createCuboidShape(0, 5, 16, 9, 24, 17),
		Block.createCuboidShape(0, 5, -1, 9, 24, 0),
		Block.createCuboidShape(0, 8, 4, 5, 9, 12),
		Block.createCuboidShape(0, 25, 0, 1, 26, 16),
		Block.createCuboidShape(0, 9, 4, 1, 19, 12),
		Block.createCuboidShape(0, 8, 3, 4, 21, 4),
		Block.createCuboidShape(0, 8, 12, 4, 21, 13),
		Block.createCuboidShape(0, 19, 4, 3, 21, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 0, 9, 8, 5),
		Block.createCuboidShape(-1, 5, 0, 0, 24, 9),
		Block.createCuboidShape(16, 5, 0, 17, 24, 9),
		Block.createCuboidShape(4, 8, 0, 12, 9, 5),
		Block.createCuboidShape(0, 25, 0, 16, 26, 1),
		Block.createCuboidShape(4, 9, 0, 12, 19, 1),
		Block.createCuboidShape(12, 8, 0, 13, 21, 4),
		Block.createCuboidShape(3, 8, 0, 4, 21, 4),
		Block.createCuboidShape(4, 19, 0, 12, 21, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(11, 0, 7, 16, 8, 9),
		Block.createCuboidShape(7, 5, -1, 16, 24, 0),
		Block.createCuboidShape(7, 5, 16, 16, 24, 17),
		Block.createCuboidShape(11, 8, 4, 16, 9, 12),
		Block.createCuboidShape(15, 25, 0, 16, 26, 16),
		Block.createCuboidShape(15, 9, 4, 16, 19, 12),
		Block.createCuboidShape(12, 8, 12, 16, 21, 13),
		Block.createCuboidShape(12, 8, 3, 16, 21, 4),
		Block.createCuboidShape(13, 19, 4, 16, 21, 12)
    );

    public Urinal_Data() {
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

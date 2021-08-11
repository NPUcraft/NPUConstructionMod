package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Platform_chair_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 15, 3, 10, 16, 13),
		Block.createCuboidShape(0, 9, 4, 10, 16, 4),
		Block.createCuboidShape(9, 8, 4, 10, 15, 15),
		Block.createCuboidShape(0, 8, 4, 1, 15, 15),
		Block.createCuboidShape(1, 17, 12, 9, 24, 13),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 15, 0, 13, 16, 10),
		Block.createCuboidShape(12, 9, 0, 12, 16, 10),
		Block.createCuboidShape(1, 8, 9, 12, 15, 10),
		Block.createCuboidShape(1, 8, 0, 12, 15, 1),
		Block.createCuboidShape(3, 17, 1, 4, 24, 9),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 15, 3, 16, 16, 13),
		Block.createCuboidShape(6, 9, 12, 16, 16, 12),
		Block.createCuboidShape(6, 8, 1, 7, 15, 12),
		Block.createCuboidShape(15, 8, 1, 16, 15, 12),
		Block.createCuboidShape(7, 17, 3, 15, 24, 4),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 15, 6, 13, 16, 16),
		Block.createCuboidShape(4, 9, 6, 4, 16, 16),
		Block.createCuboidShape(4, 8, 6, 15, 15, 7),
		Block.createCuboidShape(4, 8, 15, 15, 15, 16),
		Block.createCuboidShape(12, 17, 7, 13, 24, 15),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );

    public Platform_chair_Data() {
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

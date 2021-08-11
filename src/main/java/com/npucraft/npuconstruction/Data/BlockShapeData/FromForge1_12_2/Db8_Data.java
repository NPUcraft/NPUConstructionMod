package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Db8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, -1, 1, 25, 17),
		Block.createCuboidShape(15, -16, -1, 16, 25, 17),
		Block.createCuboidShape(13, -16, 0, 16, 25, 2),
		Block.createCuboidShape(0, -16, 0, 3, 25, 2),
		Block.createCuboidShape(3, 18, 0, 13, 25, 2),
		Block.createCuboidShape(0, 25, 0, 16, 32, 16),
		Block.createCuboidShape(1, 23, -1, 15, 25, 17),
		Block.createCuboidShape(3, -16, 0, 13, 10, 2),
		Block.createCuboidShape(3, 10, 0, 13, 18, 1),
		Block.createCuboidShape(2, 1, -1, 3, 2, 4)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, -16, 0, 17, 25, 1),
		Block.createCuboidShape(-1, -16, 15, 17, 25, 16),
		Block.createCuboidShape(14, -16, 13, 16, 25, 16),
		Block.createCuboidShape(14, -16, 0, 16, 25, 3),
		Block.createCuboidShape(14, 18, 3, 16, 25, 13),
		Block.createCuboidShape(0, 25, 0, 16, 32, 16),
		Block.createCuboidShape(-1, 23, 1, 17, 25, 15),
		Block.createCuboidShape(14, -16, 3, 16, 10, 13),
		Block.createCuboidShape(15, 10, 3, 16, 18, 13),
		Block.createCuboidShape(12, 1, 2, 17, 2, 3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, -16, -1, 16, 25, 17),
		Block.createCuboidShape(0, -16, -1, 1, 25, 17),
		Block.createCuboidShape(0, -16, 14, 3, 25, 16),
		Block.createCuboidShape(13, -16, 14, 16, 25, 16),
		Block.createCuboidShape(3, 18, 14, 13, 25, 16),
		Block.createCuboidShape(0, 25, 0, 16, 32, 16),
		Block.createCuboidShape(1, 23, -1, 15, 25, 17),
		Block.createCuboidShape(3, -16, 14, 13, 10, 16),
		Block.createCuboidShape(3, 10, 15, 13, 18, 16),
		Block.createCuboidShape(13, 1, 12, 14, 2, 17)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, -16, 15, 17, 25, 16),
		Block.createCuboidShape(-1, -16, 0, 17, 25, 1),
		Block.createCuboidShape(0, -16, 0, 2, 25, 3),
		Block.createCuboidShape(0, -16, 13, 2, 25, 16),
		Block.createCuboidShape(0, 18, 3, 2, 25, 13),
		Block.createCuboidShape(0, 25, 0, 16, 32, 16),
		Block.createCuboidShape(-1, 23, 1, 17, 25, 15),
		Block.createCuboidShape(0, -16, 3, 2, 10, 13),
		Block.createCuboidShape(0, 10, 3, 1, 18, 13),
		Block.createCuboidShape(-1, 1, 13, 4, 2, 14)
    );

    public Db8_Data() {
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

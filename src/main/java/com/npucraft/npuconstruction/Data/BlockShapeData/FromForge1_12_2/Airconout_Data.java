package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Airconout_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 1, 5, 15, 13, 6),
		Block.createCuboidShape(-6, 0, 6, 16, 14, 15),
		Block.createCuboidShape(-7, 2, 11, -6, 7, 14),
		Block.createCuboidShape(-2, -1, 4, -1, 0, 17),
		Block.createCuboidShape(-1, -1, 9, 12, 0, 10),
		Block.createCuboidShape(12, -1, 4, 13, 0, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 1, -5, 11, 13, 15),
		Block.createCuboidShape(1, 0, -6, 10, 14, 16),
		Block.createCuboidShape(2, 2, -7, 5, 7, -6),
		Block.createCuboidShape(-1, -1, -2, 12, 0, -1),
		Block.createCuboidShape(6, -1, -1, 7, 0, 12),
		Block.createCuboidShape(-1, -1, 12, 12, 0, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 1, 10, 21, 13, 11),
		Block.createCuboidShape(0, 0, 1, 22, 14, 10),
		Block.createCuboidShape(22, 2, 2, 23, 7, 5),
		Block.createCuboidShape(17, -1, -1, 18, 0, 12),
		Block.createCuboidShape(4, -1, 6, 17, 0, 7),
		Block.createCuboidShape(3, -1, -1, 4, 0, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 1, 1, 6, 13, 21),
		Block.createCuboidShape(6, 0, 0, 15, 14, 22),
		Block.createCuboidShape(11, 2, 22, 14, 7, 23),
		Block.createCuboidShape(4, -1, 17, 17, 0, 18),
		Block.createCuboidShape(9, -1, 4, 10, 0, 17),
		Block.createCuboidShape(4, -1, 3, 17, 0, 4)
    );

    public Airconout_Data() {
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

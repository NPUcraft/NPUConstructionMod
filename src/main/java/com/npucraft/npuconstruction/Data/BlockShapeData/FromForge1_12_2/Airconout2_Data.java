package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Airconout2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 2, 5, 18, 28, 6),
		Block.createCuboidShape(-3, 1, 6, 19, 29, 17),
		Block.createCuboidShape(-4, 3, 12, -3, 8, 16),
		Block.createCuboidShape(-1, 0, 4, 1, 1, 18),
		Block.createCuboidShape(1, 0, 9, 15, 1, 10),
		Block.createCuboidShape(15, 0, 4, 17, 1, 18)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 2, 6, 11, 28, 18),
		Block.createCuboidShape(-1, 1, -3, 10, 29, 19),
		Block.createCuboidShape(0, 3, -4, 4, 8, -3),
		Block.createCuboidShape(-2, 0, -1, 12, 1, 1),
		Block.createCuboidShape(6, 0, 1, 7, 1, 15),
		Block.createCuboidShape(-2, 0, 15, 12, 1, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 2, 10, 10, 28, 11),
		Block.createCuboidShape(-3, 1, -1, 19, 29, 10),
		Block.createCuboidShape(19, 3, 0, 20, 8, 4),
		Block.createCuboidShape(15, 0, -2, 17, 1, 12),
		Block.createCuboidShape(1, 0, 6, 15, 1, 7),
		Block.createCuboidShape(-1, 0, -2, 1, 1, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, -2, 6, 28, 10),
		Block.createCuboidShape(6, 1, -3, 17, 29, 19),
		Block.createCuboidShape(12, 3, 19, 16, 8, 20),
		Block.createCuboidShape(4, 0, 15, 18, 1, 17),
		Block.createCuboidShape(9, 0, 1, 10, 1, 15),
		Block.createCuboidShape(4, 0, -1, 18, 1, 1)
    );

    public Airconout2_Data() {
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

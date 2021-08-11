package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 7, 17, 12, 9),
		Block.createCuboidShape(-10, 0, 6, 12, 6, 10),
		Block.createCuboidShape(-10, 0, 6, 12, 0, 10),
		Block.createCuboidShape(-10, 6, 6, 12, 7, 10),
		Block.createCuboidShape(-11, 0, 6, -10, 7, 10),
		Block.createCuboidShape(12, 0, 6, 13, 7, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, -1, 9, 12, 17),
		Block.createCuboidShape(6, 0, -10, 10, 6, 12),
		Block.createCuboidShape(6, 0, -10, 10, 0, 12),
		Block.createCuboidShape(6, 6, -10, 10, 7, 12),
		Block.createCuboidShape(6, 0, -11, 10, 7, -10),
		Block.createCuboidShape(6, 0, 12, 10, 7, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 7, 17, 12, 9),
		Block.createCuboidShape(4, 0, 6, 26, 6, 10),
		Block.createCuboidShape(4, 0, 6, 26, 0, 10),
		Block.createCuboidShape(4, 6, 6, 26, 7, 10),
		Block.createCuboidShape(26, 0, 6, 27, 7, 10),
		Block.createCuboidShape(3, 0, 6, 4, 7, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, -1, 9, 12, 17),
		Block.createCuboidShape(6, 0, 4, 10, 6, 26),
		Block.createCuboidShape(6, 0, 4, 10, 0, 26),
		Block.createCuboidShape(6, 6, 4, 10, 7, 26),
		Block.createCuboidShape(6, 0, 26, 10, 7, 27),
		Block.createCuboidShape(6, 0, 3, 10, 7, 4)
    );

    public Fsign3_Data() {
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

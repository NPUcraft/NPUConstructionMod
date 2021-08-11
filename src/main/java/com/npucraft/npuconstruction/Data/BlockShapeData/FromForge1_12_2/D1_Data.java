package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class D1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, 0, 14, 16, 17, 16),
		Block.createCuboidShape(-14, 1, 14, -10, 16, 17),
		Block.createCuboidShape(-13, 13, 14, 13, 16, 16),
		Block.createCuboidShape(-13, 1, 14, 13, 4, 16),
		Block.createCuboidShape(-16, 0, 13, -13, 17, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 10, 2, 17, 16),
		Block.createCuboidShape(-1, 1, -14, 2, 16, -10),
		Block.createCuboidShape(0, 13, -13, 2, 16, 13),
		Block.createCuboidShape(0, 1, -13, 2, 4, 13),
		Block.createCuboidShape(-1, 0, -16, 3, 17, -13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 6, 17, 2),
		Block.createCuboidShape(26, 1, -1, 30, 16, 2),
		Block.createCuboidShape(3, 13, 0, 29, 16, 2),
		Block.createCuboidShape(3, 1, 0, 29, 4, 2),
		Block.createCuboidShape(29, 0, -1, 32, 17, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(14, 0, 0, 16, 17, 6),
		Block.createCuboidShape(14, 1, 26, 17, 16, 30),
		Block.createCuboidShape(14, 13, 3, 16, 16, 29),
		Block.createCuboidShape(14, 1, 3, 16, 4, 29),
		Block.createCuboidShape(13, 0, 29, 17, 17, 32)
    );

    public D1_Data() {
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

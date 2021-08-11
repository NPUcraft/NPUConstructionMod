package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class C_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-6, -8, 15, 18, -2, 16),
		Block.createCuboidShape(11, 3, 15, 24, 20, 16),
		Block.createCuboidShape(-4, 20, 15, 18, 24, 16),
		Block.createCuboidShape(11, -4, 15, 23, 3, 16),
		Block.createCuboidShape(-7, 14, 15, -5, 23, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -8, -6, 1, -2, 18),
		Block.createCuboidShape(0, 3, 11, 1, 20, 24),
		Block.createCuboidShape(0, 20, -4, 1, 24, 18),
		Block.createCuboidShape(0, -4, 11, 1, 3, 23),
		Block.createCuboidShape(0, 14, -7, 1, 23, -5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-2, -8, 0, 22, -2, 1),
		Block.createCuboidShape(-8, 3, 0, 5, 20, 1),
		Block.createCuboidShape(-2, 20, 0, 20, 24, 1),
		Block.createCuboidShape(-7, -4, 0, 5, 3, 1),
		Block.createCuboidShape(21, 14, 0, 23, 23, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, -8, -2, 16, -2, 22),
		Block.createCuboidShape(15, 3, -8, 16, 20, 5),
		Block.createCuboidShape(15, 20, -2, 16, 24, 20),
		Block.createCuboidShape(15, -4, -7, 16, 3, 5),
		Block.createCuboidShape(15, 14, 21, 16, 23, 23)
    );

    public C_Data() {
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

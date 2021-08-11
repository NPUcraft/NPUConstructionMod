package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class G_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(14, -3, 15, 26, 20, 16),
		Block.createCuboidShape(-4, -8, 15, 22, -3, 16),
		Block.createCuboidShape(-1, 20, 15, 21, 24, 16),
		Block.createCuboidShape(-6, -5, 15, 1, 6, 16),
		Block.createCuboidShape(-9, 6, 15, 7, 9, 16),
		Block.createCuboidShape(-5, 14, 15, -3, 23, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -3, 14, 1, 20, 26),
		Block.createCuboidShape(0, -8, -4, 1, -3, 22),
		Block.createCuboidShape(0, 20, -1, 1, 24, 21),
		Block.createCuboidShape(0, -5, -6, 1, 6, 1),
		Block.createCuboidShape(0, 6, -9, 1, 9, 7),
		Block.createCuboidShape(0, 14, -5, 1, 23, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-10, -3, 0, 2, 20, 1),
		Block.createCuboidShape(-6, -8, 0, 20, -3, 1),
		Block.createCuboidShape(-5, 20, 0, 17, 24, 1),
		Block.createCuboidShape(15, -5, 0, 22, 6, 1),
		Block.createCuboidShape(9, 6, 0, 25, 9, 1),
		Block.createCuboidShape(19, 14, 0, 21, 23, 1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, -3, -10, 16, 20, 2),
		Block.createCuboidShape(15, -8, -6, 16, -3, 20),
		Block.createCuboidShape(15, 20, -5, 16, 24, 17),
		Block.createCuboidShape(15, -5, 15, 16, 6, 22),
		Block.createCuboidShape(15, 6, 9, 16, 9, 25),
		Block.createCuboidShape(15, 14, 19, 16, 23, 21)
    );

    public G_Data() {
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

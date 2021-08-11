package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Painting2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(17, -15, 7, 18, 25, 9),
		Block.createCuboidShape(-1, 25, 7, 17, 26, 9),
		Block.createCuboidShape(-1, -14, 8, 17, 24, 9),
		Block.createCuboidShape(-3, -16, 5, 19, -15, 11),
		Block.createCuboidShape(-2, -15, 7, -1, 25, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, -15, 17, 9, 25, 18),
		Block.createCuboidShape(7, 25, -1, 9, 26, 17),
		Block.createCuboidShape(7, -14, -1, 8, 24, 17),
		Block.createCuboidShape(5, -16, -3, 11, -15, 19),
		Block.createCuboidShape(7, -15, -2, 9, 25, -1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-2, -15, 7, -1, 25, 9),
		Block.createCuboidShape(-1, 25, 7, 17, 26, 9),
		Block.createCuboidShape(-1, -14, 7, 17, 24, 8),
		Block.createCuboidShape(-3, -16, 5, 19, -15, 11),
		Block.createCuboidShape(17, -15, 7, 18, 25, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -15, -2, 9, 25, -1),
		Block.createCuboidShape(7, 25, -1, 9, 26, 17),
		Block.createCuboidShape(8, -14, -1, 9, 24, 17),
		Block.createCuboidShape(5, -16, -3, 11, -15, 19),
		Block.createCuboidShape(7, -15, 17, 9, 25, 18)
    );

    public Painting2_Data() {
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

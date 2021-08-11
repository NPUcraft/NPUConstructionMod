package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Wboard_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-10, 4, 7, 26, 28, 9),
		Block.createCuboidShape(-11, 3, 7, -10, 29, 9),
		Block.createCuboidShape(-10, 3, 7, 26, 4, 9),
		Block.createCuboidShape(-11, 0, 7, 27, 1, 9),
		Block.createCuboidShape(-11, -10, 7, 27, -9, 9),
		Block.createCuboidShape(-10, 28, 7, 26, 29, 9),
		Block.createCuboidShape(-12, -13, 7, -11, 22, 9),
		Block.createCuboidShape(27, -13, 7, 28, 22, 9),
		Block.createCuboidShape(27, -14, 2, 29, -13, 14),
		Block.createCuboidShape(-13, -14, 2, -11, -13, 14),
		Block.createCuboidShape(26, 3, 7, 27, 29, 9),
		Block.createCuboidShape(-6, 7, 7, 0, 16, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 4, -10, 9, 28, 26),
		Block.createCuboidShape(7, 3, -11, 9, 29, -10),
		Block.createCuboidShape(7, 3, -10, 9, 4, 26),
		Block.createCuboidShape(7, 0, -11, 9, 1, 27),
		Block.createCuboidShape(7, -10, -11, 9, -9, 27),
		Block.createCuboidShape(7, 28, -10, 9, 29, 26),
		Block.createCuboidShape(7, -13, -12, 9, 22, -11),
		Block.createCuboidShape(7, -13, 27, 9, 22, 28),
		Block.createCuboidShape(2, -14, 27, 14, -13, 29),
		Block.createCuboidShape(2, -14, -13, 14, -13, -11),
		Block.createCuboidShape(7, 3, 26, 9, 29, 27),
		Block.createCuboidShape(8, 7, -6, 9, 16, 0)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-10, 4, 7, 26, 28, 9),
		Block.createCuboidShape(26, 3, 7, 27, 29, 9),
		Block.createCuboidShape(-10, 3, 7, 26, 4, 9),
		Block.createCuboidShape(-11, 0, 7, 27, 1, 9),
		Block.createCuboidShape(-11, -10, 7, 27, -9, 9),
		Block.createCuboidShape(-10, 28, 7, 26, 29, 9),
		Block.createCuboidShape(27, -13, 7, 28, 22, 9),
		Block.createCuboidShape(-12, -13, 7, -11, 22, 9),
		Block.createCuboidShape(-13, -14, 2, -11, -13, 14),
		Block.createCuboidShape(27, -14, 2, 29, -13, 14),
		Block.createCuboidShape(-11, 3, 7, -10, 29, 9),
		Block.createCuboidShape(16, 7, 8, 22, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 4, -10, 9, 28, 26),
		Block.createCuboidShape(7, 3, 26, 9, 29, 27),
		Block.createCuboidShape(7, 3, -10, 9, 4, 26),
		Block.createCuboidShape(7, 0, -11, 9, 1, 27),
		Block.createCuboidShape(7, -10, -11, 9, -9, 27),
		Block.createCuboidShape(7, 28, -10, 9, 29, 26),
		Block.createCuboidShape(7, -13, 27, 9, 22, 28),
		Block.createCuboidShape(7, -13, -12, 9, 22, -11),
		Block.createCuboidShape(2, -14, -13, 14, -13, -11),
		Block.createCuboidShape(2, -14, 27, 14, -13, 29),
		Block.createCuboidShape(7, 3, -11, 9, 29, -10),
		Block.createCuboidShape(7, 7, 16, 8, 16, 22)
    );

    public Wboard_Data() {
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

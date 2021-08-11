package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dw9_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, -1, 28, -10, 5, 30),
		Block.createCuboidShape(13, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-16, -16, -1, -13, 32, 17),
		Block.createCuboidShape(-13, 30, -1, 13, 32, 17),
		Block.createCuboidShape(-13, -16, 10, -11, 30, 21),
		Block.createCuboidShape(-13, -16, 27, -11, 30, 32),
		Block.createCuboidShape(-13, -16, 21, -11, 8, 27),
		Block.createCuboidShape(-13, 26, 21, -11, 30, 27),
		Block.createCuboidShape(-13, 8, 21, -12, 26, 27)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-14, -1, -15, -12, 5, -10),
		Block.createCuboidShape(-1, -16, 13, 17, 32, 16),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -13),
		Block.createCuboidShape(-1, 30, -13, 17, 32, 13),
		Block.createCuboidShape(-5, -16, -13, 6, 30, -11),
		Block.createCuboidShape(-16, -16, -13, -11, 30, -11),
		Block.createCuboidShape(-11, -16, -13, -5, 8, -11),
		Block.createCuboidShape(-11, 26, -13, -5, 30, -11),
		Block.createCuboidShape(-11, 8, -13, -5, 26, -12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(26, -1, -14, 31, 5, -12),
		Block.createCuboidShape(0, -16, -1, 3, 32, 17),
		Block.createCuboidShape(29, -16, -1, 32, 32, 17),
		Block.createCuboidShape(3, 30, -1, 29, 32, 17),
		Block.createCuboidShape(27, -16, -5, 29, 30, 6),
		Block.createCuboidShape(27, -16, -16, 29, 30, -11),
		Block.createCuboidShape(27, -16, -11, 29, 8, -5),
		Block.createCuboidShape(27, 26, -11, 29, 30, -5),
		Block.createCuboidShape(28, 8, -11, 29, 26, -5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(28, -1, 26, 30, 5, 31),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 3),
		Block.createCuboidShape(-1, -16, 29, 17, 32, 32),
		Block.createCuboidShape(-1, 30, 3, 17, 32, 29),
		Block.createCuboidShape(10, -16, 27, 21, 30, 29),
		Block.createCuboidShape(27, -16, 27, 32, 30, 29),
		Block.createCuboidShape(21, -16, 27, 27, 8, 29),
		Block.createCuboidShape(21, 26, 27, 27, 30, 29),
		Block.createCuboidShape(21, 8, 28, 27, 26, 29)
    );

    public Dw9_Data() {
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

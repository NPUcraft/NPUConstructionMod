package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstove_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 14, -1, 3, 17, 10),
		Block.createCuboidShape(13, 14, -1, 19, 17, 10),
		Block.createCuboidShape(-10, 14, -1, 26, 17, 0),
		Block.createCuboidShape(28, 14, -5, 32, 17, 14),
		Block.createCuboidShape(-16, 14, -5, -12, 17, 14),
		Block.createCuboidShape(21, 14, 10, 26, 17, 13),
		Block.createCuboidShape(5, 14, 10, 11, 17, 13),
		Block.createCuboidShape(-10, 14, 10, -5, 17, 13),
		Block.createCuboidShape(-12, 14, -5, 28, 16, 0),
		Block.createCuboidShape(-16, 0, -4, 32, 14, 16),
		Block.createCuboidShape(32, 16, -5, 32, 20, 14),
		Block.createCuboidShape(-16, 16, -5, -16, 20, 14),
		Block.createCuboidShape(-16, 14, 14, 32, 28, 16),
		Block.createCuboidShape(-12, 14, 10, 28, 16, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 14, -3, 17, 17, 3),
		Block.createCuboidShape(6, 14, 13, 17, 17, 19),
		Block.createCuboidShape(16, 14, -10, 17, 17, 26),
		Block.createCuboidShape(2, 14, 28, 21, 17, 32),
		Block.createCuboidShape(2, 14, -16, 21, 17, -12),
		Block.createCuboidShape(3, 14, 21, 6, 17, 26),
		Block.createCuboidShape(3, 14, 5, 6, 17, 11),
		Block.createCuboidShape(3, 14, -10, 6, 17, -5),
		Block.createCuboidShape(16, 14, -12, 21, 16, 28),
		Block.createCuboidShape(0, 0, -16, 20, 14, 32),
		Block.createCuboidShape(2, 16, 32, 21, 20, 32),
		Block.createCuboidShape(2, 16, -16, 21, 20, -16),
		Block.createCuboidShape(0, 14, -16, 2, 28, 32),
		Block.createCuboidShape(2, 14, -12, 6, 16, 28)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(13, 14, 6, 19, 17, 17),
		Block.createCuboidShape(-3, 14, 6, 3, 17, 17),
		Block.createCuboidShape(-10, 14, 16, 26, 17, 17),
		Block.createCuboidShape(-16, 14, 2, -12, 17, 21),
		Block.createCuboidShape(28, 14, 2, 32, 17, 21),
		Block.createCuboidShape(-10, 14, 3, -5, 17, 6),
		Block.createCuboidShape(5, 14, 3, 11, 17, 6),
		Block.createCuboidShape(21, 14, 3, 26, 17, 6),
		Block.createCuboidShape(-12, 14, 16, 28, 16, 21),
		Block.createCuboidShape(-16, 0, 0, 32, 14, 20),
		Block.createCuboidShape(-16, 16, 2, -16, 20, 21),
		Block.createCuboidShape(32, 16, 2, 32, 20, 21),
		Block.createCuboidShape(-16, 14, 0, 32, 28, 2),
		Block.createCuboidShape(-12, 14, 2, 28, 16, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 14, 13, 10, 17, 19),
		Block.createCuboidShape(-1, 14, -3, 10, 17, 3),
		Block.createCuboidShape(-1, 14, -10, 0, 17, 26),
		Block.createCuboidShape(-5, 14, -16, 14, 17, -12),
		Block.createCuboidShape(-5, 14, 28, 14, 17, 32),
		Block.createCuboidShape(10, 14, -10, 13, 17, -5),
		Block.createCuboidShape(10, 14, 5, 13, 17, 11),
		Block.createCuboidShape(10, 14, 21, 13, 17, 26),
		Block.createCuboidShape(-5, 14, -12, 0, 16, 28),
		Block.createCuboidShape(-4, 0, -16, 16, 14, 32),
		Block.createCuboidShape(-5, 16, -16, 14, 20, -16),
		Block.createCuboidShape(-5, 16, 32, 14, 20, 32),
		Block.createCuboidShape(14, 14, -16, 16, 28, 32),
		Block.createCuboidShape(10, 14, -12, 14, 16, 28)
    );

    public Fstove_Data() {
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

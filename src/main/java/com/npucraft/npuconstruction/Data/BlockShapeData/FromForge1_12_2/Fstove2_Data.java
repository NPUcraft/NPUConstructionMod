package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstove2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(28, 14, -5, 32, 17, 14),
		Block.createCuboidShape(-16, 14, -5, -12, 17, 14),
		Block.createCuboidShape(-10, 14, -1, 26, 17, 0),
		Block.createCuboidShape(-3, 14, -1, 2, 17, 10),
		Block.createCuboidShape(13, 14, -1, 19, 17, 10),
		Block.createCuboidShape(21, 14, 10, 26, 17, 13),
		Block.createCuboidShape(-10, 14, 10, -5, 17, 13),
		Block.createCuboidShape(-6, 26, 13, 18, 26, 13),
		Block.createCuboidShape(2, 14, 4, 13, 16, 5),
		Block.createCuboidShape(-12, 14, -5, 28, 16, 0),
		Block.createCuboidShape(-16, 5, -4, 32, 14, 16),
		Block.createCuboidShape(-16, 14, 14, 32, 28, 16),
		Block.createCuboidShape(-12, 14, 10, 28, 16, 14),
		Block.createCuboidShape(7, 14, -1, 9, 16, 10),
		Block.createCuboidShape(-16, 0, -4, -14, 5, -2),
		Block.createCuboidShape(30, 0, -4, 32, 5, -2),
		Block.createCuboidShape(-16, 0, 15, -14, 5, 16),
		Block.createCuboidShape(30, 0, 15, 32, 5, 16),
		Block.createCuboidShape(-12, 3, -3, 29, 4, -2)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, 14, 28, 21, 17, 32),
		Block.createCuboidShape(2, 14, -16, 21, 17, -12),
		Block.createCuboidShape(16, 14, -10, 17, 17, 26),
		Block.createCuboidShape(6, 14, -3, 17, 17, 2),
		Block.createCuboidShape(6, 14, 13, 17, 17, 19),
		Block.createCuboidShape(3, 14, 21, 6, 17, 26),
		Block.createCuboidShape(3, 14, -10, 6, 17, -5),
		Block.createCuboidShape(3, 26, -6, 3, 26, 18),
		Block.createCuboidShape(11, 14, 2, 12, 16, 13),
		Block.createCuboidShape(16, 14, -12, 21, 16, 28),
		Block.createCuboidShape(0, 5, -16, 20, 14, 32),
		Block.createCuboidShape(0, 14, -16, 2, 28, 32),
		Block.createCuboidShape(2, 14, -12, 6, 16, 28),
		Block.createCuboidShape(6, 14, 7, 17, 16, 9),
		Block.createCuboidShape(18, 0, -16, 20, 5, -14),
		Block.createCuboidShape(18, 0, 30, 20, 5, 32),
		Block.createCuboidShape(0, 0, -16, 1, 5, -14),
		Block.createCuboidShape(0, 0, 30, 1, 5, 32),
		Block.createCuboidShape(18, 3, -12, 19, 4, 29)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 14, 2, -12, 17, 21),
		Block.createCuboidShape(28, 14, 2, 32, 17, 21),
		Block.createCuboidShape(-10, 14, 16, 26, 17, 17),
		Block.createCuboidShape(14, 14, 6, 19, 17, 17),
		Block.createCuboidShape(-3, 14, 6, 3, 17, 17),
		Block.createCuboidShape(-10, 14, 3, -5, 17, 6),
		Block.createCuboidShape(21, 14, 3, 26, 17, 6),
		Block.createCuboidShape(-2, 26, 3, 22, 26, 3),
		Block.createCuboidShape(3, 14, 11, 14, 16, 12),
		Block.createCuboidShape(-12, 14, 16, 28, 16, 21),
		Block.createCuboidShape(-16, 5, 0, 32, 14, 20),
		Block.createCuboidShape(-16, 14, 0, 32, 28, 2),
		Block.createCuboidShape(-12, 14, 2, 28, 16, 6),
		Block.createCuboidShape(7, 14, 6, 9, 16, 17),
		Block.createCuboidShape(30, 0, 18, 32, 5, 20),
		Block.createCuboidShape(-16, 0, 18, -14, 5, 20),
		Block.createCuboidShape(30, 0, 0, 32, 5, 1),
		Block.createCuboidShape(-16, 0, 0, -14, 5, 1),
		Block.createCuboidShape(-13, 3, 18, 28, 4, 19)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-5, 14, -16, 14, 17, -12),
		Block.createCuboidShape(-5, 14, 28, 14, 17, 32),
		Block.createCuboidShape(-1, 14, -10, 0, 17, 26),
		Block.createCuboidShape(-1, 14, 14, 10, 17, 19),
		Block.createCuboidShape(-1, 14, -3, 10, 17, 3),
		Block.createCuboidShape(10, 14, -10, 13, 17, -5),
		Block.createCuboidShape(10, 14, 21, 13, 17, 26),
		Block.createCuboidShape(13, 26, -2, 13, 26, 22),
		Block.createCuboidShape(4, 14, 3, 5, 16, 14),
		Block.createCuboidShape(-5, 14, -12, 0, 16, 28),
		Block.createCuboidShape(-4, 5, -16, 16, 14, 32),
		Block.createCuboidShape(14, 14, -16, 16, 28, 32),
		Block.createCuboidShape(10, 14, -12, 14, 16, 28),
		Block.createCuboidShape(-1, 14, 7, 10, 16, 9),
		Block.createCuboidShape(-4, 0, 30, -2, 5, 32),
		Block.createCuboidShape(-4, 0, -16, -2, 5, -14),
		Block.createCuboidShape(15, 0, 30, 16, 5, 32),
		Block.createCuboidShape(15, 0, -16, 16, 5, -14),
		Block.createCuboidShape(-3, 3, -13, -2, 4, 28)
    );

    public Fstove2_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Db7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 2, 27, -9, 3, 31),
		Block.createCuboidShape(13, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-16, -16, -1, -13, 32, 17),
		Block.createCuboidShape(-13, 30, -1, 13, 32, 17),
		Block.createCuboidShape(-13, -16, 10, -11, 30, 22),
		Block.createCuboidShape(-13, -16, 28, -11, 30, 32),
		Block.createCuboidShape(-13, -16, 22, -11, 8, 28),
		Block.createCuboidShape(-13, 26, 22, -11, 30, 28),
		Block.createCuboidShape(-13, 8, 22, -12, 26, 28),
		Block.createCuboidShape(-14, -1, 29, -11, 5, 31)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-15, 2, -16, -11, 3, -9),
		Block.createCuboidShape(-1, -16, 13, 17, 32, 16),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -13),
		Block.createCuboidShape(-1, 30, -13, 17, 32, 13),
		Block.createCuboidShape(-6, -16, -13, 6, 30, -11),
		Block.createCuboidShape(-16, -16, -13, -12, 30, -11),
		Block.createCuboidShape(-12, -16, -13, -6, 8, -11),
		Block.createCuboidShape(-12, 26, -13, -6, 30, -11),
		Block.createCuboidShape(-12, 8, -13, -6, 26, -12),
		Block.createCuboidShape(-15, -1, -14, -13, 5, -11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(25, 2, -15, 32, 3, -11),
		Block.createCuboidShape(0, -16, -1, 3, 32, 17),
		Block.createCuboidShape(29, -16, -1, 32, 32, 17),
		Block.createCuboidShape(3, 30, -1, 29, 32, 17),
		Block.createCuboidShape(27, -16, -6, 29, 30, 6),
		Block.createCuboidShape(27, -16, -16, 29, 30, -12),
		Block.createCuboidShape(27, -16, -12, 29, 8, -6),
		Block.createCuboidShape(27, 26, -12, 29, 30, -6),
		Block.createCuboidShape(28, 8, -12, 29, 26, -6),
		Block.createCuboidShape(27, -1, -15, 30, 5, -13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(27, 2, 25, 31, 3, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 3),
		Block.createCuboidShape(-1, -16, 29, 17, 32, 32),
		Block.createCuboidShape(-1, 30, 3, 17, 32, 29),
		Block.createCuboidShape(10, -16, 27, 22, 30, 29),
		Block.createCuboidShape(28, -16, 27, 32, 30, 29),
		Block.createCuboidShape(22, -16, 27, 28, 8, 29),
		Block.createCuboidShape(22, 26, 27, 28, 30, 29),
		Block.createCuboidShape(22, 8, 28, 28, 26, 29),
		Block.createCuboidShape(29, -1, 27, 31, 5, 30)
    );

    public Db7_Data() {
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

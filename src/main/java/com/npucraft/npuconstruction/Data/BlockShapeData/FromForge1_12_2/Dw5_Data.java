package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dw5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 2, 5, -9, 8, 11),
		Block.createCuboidShape(-16, -16, -1, -12, 32, 17),
		Block.createCuboidShape(12, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-12, 30, -1, 12, 32, 17),
		Block.createCuboidShape(-14, -16, 7, 14, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, -11, 11, 8, -9),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -12),
		Block.createCuboidShape(-1, -16, 12, 17, 32, 16),
		Block.createCuboidShape(-1, 30, -12, 17, 32, 12),
		Block.createCuboidShape(7, -16, -14, 9, 32, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(25, 2, 5, 27, 8, 11),
		Block.createCuboidShape(28, -16, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 4, 32, 17),
		Block.createCuboidShape(4, 30, -1, 28, 32, 17),
		Block.createCuboidShape(2, -16, 7, 30, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 25, 11, 8, 27),
		Block.createCuboidShape(-1, -16, 28, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 4),
		Block.createCuboidShape(-1, 30, 4, 17, 32, 28),
		Block.createCuboidShape(7, -16, 2, 9, 32, 30)
    );

    public Dw5_Data() {
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

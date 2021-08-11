package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Db4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(9, 2, 29, 14, 8, 31),
		Block.createCuboidShape(-16, -16, -1, -12, 32, 17),
		Block.createCuboidShape(12, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-12, 30, -1, 12, 32, 17),
		Block.createCuboidShape(10, -16, 10, 12, 30, 32)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-15, 2, 9, -13, 8, 14),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -12),
		Block.createCuboidShape(-1, -16, 12, 17, 32, 16),
		Block.createCuboidShape(-1, 30, -12, 17, 32, 12),
		Block.createCuboidShape(-16, -16, 10, 6, 30, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 2, -15, 7, 8, -13),
		Block.createCuboidShape(28, -16, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 4, 32, 17),
		Block.createCuboidShape(4, 30, -1, 28, 32, 17),
		Block.createCuboidShape(4, -16, -16, 6, 30, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(29, 2, 2, 31, 8, 7),
		Block.createCuboidShape(-1, -16, 28, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 4),
		Block.createCuboidShape(-1, 30, 4, 17, 32, 28),
		Block.createCuboidShape(10, -16, 4, 32, 30, 6)
    );

    public Db4_Data() {
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

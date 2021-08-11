package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirldoor_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(30, -16, 0, 32, 32, 16),
		Block.createCuboidShape(0, -16, 0, 2, 32, 16),
		Block.createCuboidShape(2, -16, 6, 3, 32, 10),
		Block.createCuboidShape(29, -16, 6, 30, 32, 10),
		Block.createCuboidShape(28, -16, 7, 29, 32, 9),
		Block.createCuboidShape(4, 31, 7, 28, 32, 9),
		Block.createCuboidShape(3, -16, 7, 4, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 30, 16, 32, 32),
		Block.createCuboidShape(0, -16, 0, 16, 32, 2),
		Block.createCuboidShape(6, -16, 2, 10, 32, 3),
		Block.createCuboidShape(6, -16, 29, 10, 32, 30),
		Block.createCuboidShape(7, -16, 28, 9, 32, 29),
		Block.createCuboidShape(7, 31, 4, 9, 32, 28),
		Block.createCuboidShape(7, -16, 3, 9, 32, 4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -16, 0, -14, 32, 16),
		Block.createCuboidShape(14, -16, 0, 16, 32, 16),
		Block.createCuboidShape(13, -16, 6, 14, 32, 10),
		Block.createCuboidShape(-14, -16, 6, -13, 32, 10),
		Block.createCuboidShape(-13, -16, 7, -12, 32, 9),
		Block.createCuboidShape(-12, 31, 7, 12, 32, 9),
		Block.createCuboidShape(12, -16, 7, 13, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, -16, 16, 32, -14),
		Block.createCuboidShape(0, -16, 14, 16, 32, 16),
		Block.createCuboidShape(6, -16, 13, 10, 32, 14),
		Block.createCuboidShape(6, -16, -14, 10, 32, -13),
		Block.createCuboidShape(7, -16, -13, 9, 32, -12),
		Block.createCuboidShape(7, 31, -12, 9, 32, 12),
		Block.createCuboidShape(7, -16, 12, 9, 32, 13)
    );

    public Fgirldoor_Data() {
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

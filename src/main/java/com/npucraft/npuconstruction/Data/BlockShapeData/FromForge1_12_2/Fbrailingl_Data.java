package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fbrailingl_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 12, -7, 9, 13, 32),
		Block.createCuboidShape(7, 20, -7, 9, 21, 32),
		Block.createCuboidShape(7, 30, -7, 9, 31, 32),
		Block.createCuboidShape(7, 16, -7, 9, 17, 32),
		Block.createCuboidShape(7, 24, -7, 9, 25, 32),
		Block.createCuboidShape(0, 0, -16, 16, 8, 32),
		Block.createCuboidShape(7, 9, 17, 9, 31, 18),
		Block.createCuboidShape(7, 9, -8, 9, 31, -7),
		Block.createCuboidShape(9, 30, -8, 16, 31, -7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-16, 12, 7, 23, 13, 9),
		Block.createCuboidShape(-16, 20, 7, 23, 21, 9),
		Block.createCuboidShape(-16, 30, 7, 23, 31, 9),
		Block.createCuboidShape(-16, 16, 7, 23, 17, 9),
		Block.createCuboidShape(-16, 24, 7, 23, 25, 9),
		Block.createCuboidShape(-16, 0, 0, 32, 8, 16),
		Block.createCuboidShape(-2, 9, 7, -1, 31, 9),
		Block.createCuboidShape(23, 9, 7, 24, 31, 9),
		Block.createCuboidShape(23, 30, 9, 24, 31, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 12, -16, 9, 13, 23),
		Block.createCuboidShape(7, 20, -16, 9, 21, 23),
		Block.createCuboidShape(7, 30, -16, 9, 31, 23),
		Block.createCuboidShape(7, 16, -16, 9, 17, 23),
		Block.createCuboidShape(7, 24, -16, 9, 25, 23),
		Block.createCuboidShape(0, 0, -16, 16, 8, 32),
		Block.createCuboidShape(7, 9, -2, 9, 31, -1),
		Block.createCuboidShape(7, 9, 23, 9, 31, 24),
		Block.createCuboidShape(0, 30, 23, 7, 31, 24)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-7, 12, 7, 32, 13, 9),
		Block.createCuboidShape(-7, 20, 7, 32, 21, 9),
		Block.createCuboidShape(-7, 30, 7, 32, 31, 9),
		Block.createCuboidShape(-7, 16, 7, 32, 17, 9),
		Block.createCuboidShape(-7, 24, 7, 32, 25, 9),
		Block.createCuboidShape(-16, 0, 0, 32, 8, 16),
		Block.createCuboidShape(17, 9, 7, 18, 31, 9),
		Block.createCuboidShape(-8, 9, 7, -7, 31, 9),
		Block.createCuboidShape(-8, 30, 0, -7, 31, 7)
    );

    public Fbrailingl_Data() {
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

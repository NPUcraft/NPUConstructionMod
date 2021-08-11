package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 14, 15, 16, 18, 16),
		Block.createCuboidShape(-12, 14, 0, 16, 18, 1),
		Block.createCuboidShape(-12, 14, 1, -11, 18, 15),
		Block.createCuboidShape(15, 14, 1, 16, 18, 15),
		Block.createCuboidShape(-12, 3, 0, 16, 4, 16),
		Block.createCuboidShape(-12, 4, 0, -11, 17, 1),
		Block.createCuboidShape(15, 4, 0, 16, 17, 1),
		Block.createCuboidShape(-12, 4, 15, -11, 17, 16),
		Block.createCuboidShape(15, 4, 15, 16, 17, 16),
		Block.createCuboidShape(-11, 4, 15, 15, 7, 16),
		Block.createCuboidShape(-11, 4, 0, 15, 7, 1),
		Block.createCuboidShape(-11, 14, 1, 15, 15, 15),
		Block.createCuboidShape(-12, 4, 1, -11, 7, 15),
		Block.createCuboidShape(15, 4, 1, 16, 7, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 14, -12, 1, 18, 16),
		Block.createCuboidShape(15, 14, -12, 16, 18, 16),
		Block.createCuboidShape(1, 14, -12, 15, 18, -11),
		Block.createCuboidShape(1, 14, 15, 15, 18, 16),
		Block.createCuboidShape(0, 3, -12, 16, 4, 16),
		Block.createCuboidShape(15, 4, -12, 16, 17, -11),
		Block.createCuboidShape(15, 4, 15, 16, 17, 16),
		Block.createCuboidShape(0, 4, -12, 1, 17, -11),
		Block.createCuboidShape(0, 4, 15, 1, 17, 16),
		Block.createCuboidShape(0, 4, -11, 1, 7, 15),
		Block.createCuboidShape(15, 4, -11, 16, 7, 15),
		Block.createCuboidShape(1, 14, -11, 15, 15, 15),
		Block.createCuboidShape(1, 4, -12, 15, 7, -11),
		Block.createCuboidShape(1, 4, 15, 15, 7, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 14, 0, 28, 18, 1),
		Block.createCuboidShape(0, 14, 15, 28, 18, 16),
		Block.createCuboidShape(27, 14, 1, 28, 18, 15),
		Block.createCuboidShape(0, 14, 1, 1, 18, 15),
		Block.createCuboidShape(0, 3, 0, 28, 4, 16),
		Block.createCuboidShape(27, 4, 15, 28, 17, 16),
		Block.createCuboidShape(0, 4, 15, 1, 17, 16),
		Block.createCuboidShape(27, 4, 0, 28, 17, 1),
		Block.createCuboidShape(0, 4, 0, 1, 17, 1),
		Block.createCuboidShape(1, 4, 0, 27, 7, 1),
		Block.createCuboidShape(1, 4, 15, 27, 7, 16),
		Block.createCuboidShape(1, 14, 1, 27, 15, 15),
		Block.createCuboidShape(27, 4, 1, 28, 7, 15),
		Block.createCuboidShape(0, 4, 1, 1, 7, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 14, 0, 16, 18, 28),
		Block.createCuboidShape(0, 14, 0, 1, 18, 28),
		Block.createCuboidShape(1, 14, 27, 15, 18, 28),
		Block.createCuboidShape(1, 14, 0, 15, 18, 1),
		Block.createCuboidShape(0, 3, 0, 16, 4, 28),
		Block.createCuboidShape(0, 4, 27, 1, 17, 28),
		Block.createCuboidShape(0, 4, 0, 1, 17, 1),
		Block.createCuboidShape(15, 4, 27, 16, 17, 28),
		Block.createCuboidShape(15, 4, 0, 16, 17, 1),
		Block.createCuboidShape(15, 4, 1, 16, 7, 27),
		Block.createCuboidShape(0, 4, 1, 1, 7, 27),
		Block.createCuboidShape(1, 14, 1, 15, 15, 27),
		Block.createCuboidShape(1, 4, 27, 15, 7, 28),
		Block.createCuboidShape(1, 4, 0, 15, 7, 1)
    );

    public Dhall3_Data() {
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

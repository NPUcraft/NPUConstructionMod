package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Printer_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 16, 8, 13, 19, 14),
		Block.createCuboidShape(-9, 16, 5, 0, 20, 14),
		Block.createCuboidShape(5, 18, 13, 11, 22, 14),
		Block.createCuboidShape(11, 16, 5, 15, 17, 6),
		Block.createCuboidShape(-7, 3, 4, 4, 6, 12),
		Block.createCuboidShape(13, 0, 14, 14, 15, 15),
		Block.createCuboidShape(-10, 0, 14, -9, 15, 15),
		Block.createCuboidShape(13, 0, 2, 14, 15, 3),
		Block.createCuboidShape(-10, 0, 2, -9, 15, 3),
		Block.createCuboidShape(-12, 15, 1, 16, 16, 16),
		Block.createCuboidShape(-6, 0, 5, 5, 3, 13)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(2, 16, 3, 8, 19, 13),
		Block.createCuboidShape(2, 16, -9, 11, 20, 0),
		Block.createCuboidShape(2, 18, 5, 3, 22, 11),
		Block.createCuboidShape(10, 16, 11, 11, 17, 15),
		Block.createCuboidShape(4, 3, -7, 12, 6, 4),
		Block.createCuboidShape(1, 0, 13, 2, 15, 14),
		Block.createCuboidShape(1, 0, -10, 2, 15, -9),
		Block.createCuboidShape(13, 0, 13, 14, 15, 14),
		Block.createCuboidShape(13, 0, -10, 14, 15, -9),
		Block.createCuboidShape(0, 15, -12, 15, 16, 16),
		Block.createCuboidShape(3, 0, -6, 11, 3, 5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 16, 2, 13, 19, 8),
		Block.createCuboidShape(16, 16, 2, 25, 20, 11),
		Block.createCuboidShape(5, 18, 2, 11, 22, 3),
		Block.createCuboidShape(1, 16, 10, 5, 17, 11),
		Block.createCuboidShape(12, 3, 4, 23, 6, 12),
		Block.createCuboidShape(2, 0, 1, 3, 15, 2),
		Block.createCuboidShape(25, 0, 1, 26, 15, 2),
		Block.createCuboidShape(2, 0, 13, 3, 15, 14),
		Block.createCuboidShape(25, 0, 13, 26, 15, 14),
		Block.createCuboidShape(0, 15, 0, 28, 16, 15),
		Block.createCuboidShape(11, 0, 3, 22, 3, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 16, 3, 14, 19, 13),
		Block.createCuboidShape(5, 16, 16, 14, 20, 25),
		Block.createCuboidShape(13, 18, 5, 14, 22, 11),
		Block.createCuboidShape(5, 16, 1, 6, 17, 5),
		Block.createCuboidShape(4, 3, 12, 12, 6, 23),
		Block.createCuboidShape(14, 0, 2, 15, 15, 3),
		Block.createCuboidShape(14, 0, 25, 15, 15, 26),
		Block.createCuboidShape(2, 0, 2, 3, 15, 3),
		Block.createCuboidShape(2, 0, 25, 3, 15, 26),
		Block.createCuboidShape(1, 15, 0, 16, 16, 28),
		Block.createCuboidShape(5, 0, 11, 13, 3, 22)
    );

    public Printer_Data() {
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

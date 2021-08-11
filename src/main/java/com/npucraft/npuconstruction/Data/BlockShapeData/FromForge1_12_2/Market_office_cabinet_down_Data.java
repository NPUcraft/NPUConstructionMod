package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Market_office_cabinet_down_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 11, 5, 11, 17, 11),
		Block.createCuboidShape(6, 19, 5, 10, 26, 13),
		Block.createCuboidShape(-16, 0, 15, 16, 32, 16),
		Block.createCuboidShape(-6, 3, 4, 7, 9, 7),
		Block.createCuboidShape(-13, 27, 5, 3, 29, 13),
		Block.createCuboidShape(-16, 0, 0, 16, 3, 15),
		Block.createCuboidShape(-16, 18, 0, 16, 19, 15),
		Block.createCuboidShape(-16, 10, 0, 16, 11, 15),
		Block.createCuboidShape(-16, 26, 0, 16, 27, 15),
		Block.createCuboidShape(9, 3, 4, 14, 7, 12),
		Block.createCuboidShape(0, 3, -3, 5, 9, 0),
		Block.createCuboidShape(7, 27, 5, 14, 29, 14),
		Block.createCuboidShape(-12, 20, 3, -8, 22, 11),
		Block.createCuboidShape(15, 0, 0, 16, 32, 1),
		Block.createCuboidShape(-16, 0, 0, -15, 32, 1),
		Block.createCuboidShape(-16, 31, 1, -15, 32, 15),
		Block.createCuboidShape(15, 31, 1, 16, 32, 15),
		Block.createCuboidShape(15, 17, 1, 16, 18, 15),
		Block.createCuboidShape(15, 9, 1, 16, 10, 15),
		Block.createCuboidShape(15, 25, 1, 16, 26, 15),
		Block.createCuboidShape(-16, 25, 1, -15, 26, 15),
		Block.createCuboidShape(-16, 17, 1, -15, 18, 15),
		Block.createCuboidShape(-16, 9, 1, -15, 10, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 11, -4, 11, 17, 11),
		Block.createCuboidShape(3, 19, 6, 11, 26, 10),
		Block.createCuboidShape(0, 0, -16, 1, 32, 16),
		Block.createCuboidShape(9, 3, -6, 12, 9, 7),
		Block.createCuboidShape(3, 27, -13, 11, 29, 3),
		Block.createCuboidShape(1, 0, -16, 16, 3, 16),
		Block.createCuboidShape(1, 18, -16, 16, 19, 16),
		Block.createCuboidShape(1, 10, -16, 16, 11, 16),
		Block.createCuboidShape(1, 26, -16, 16, 27, 16),
		Block.createCuboidShape(4, 3, 9, 12, 7, 14),
		Block.createCuboidShape(16, 3, 0, 19, 9, 5),
		Block.createCuboidShape(2, 27, 7, 11, 29, 14),
		Block.createCuboidShape(5, 20, -12, 13, 22, -8),
		Block.createCuboidShape(15, 0, 15, 16, 32, 16),
		Block.createCuboidShape(15, 0, -16, 16, 32, -15),
		Block.createCuboidShape(1, 31, -16, 15, 32, -15),
		Block.createCuboidShape(1, 31, 15, 15, 32, 16),
		Block.createCuboidShape(1, 17, 15, 15, 18, 16),
		Block.createCuboidShape(1, 9, 15, 15, 10, 16),
		Block.createCuboidShape(1, 25, 15, 15, 26, 16),
		Block.createCuboidShape(1, 25, -16, 15, 26, -15),
		Block.createCuboidShape(1, 17, -16, 15, 18, -15),
		Block.createCuboidShape(1, 9, -16, 15, 10, -15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 11, 5, 20, 17, 11),
		Block.createCuboidShape(6, 19, 3, 10, 26, 11),
		Block.createCuboidShape(0, 0, 0, 32, 32, 1),
		Block.createCuboidShape(9, 3, 9, 22, 9, 12),
		Block.createCuboidShape(13, 27, 3, 29, 29, 11),
		Block.createCuboidShape(0, 0, 1, 32, 3, 16),
		Block.createCuboidShape(0, 18, 1, 32, 19, 16),
		Block.createCuboidShape(0, 10, 1, 32, 11, 16),
		Block.createCuboidShape(0, 26, 1, 32, 27, 16),
		Block.createCuboidShape(2, 3, 4, 7, 7, 12),
		Block.createCuboidShape(11, 3, 16, 16, 9, 19),
		Block.createCuboidShape(2, 27, 2, 9, 29, 11),
		Block.createCuboidShape(24, 20, 5, 28, 22, 13),
		Block.createCuboidShape(0, 0, 15, 1, 32, 16),
		Block.createCuboidShape(31, 0, 15, 32, 32, 16),
		Block.createCuboidShape(31, 31, 1, 32, 32, 15),
		Block.createCuboidShape(0, 31, 1, 1, 32, 15),
		Block.createCuboidShape(0, 17, 1, 1, 18, 15),
		Block.createCuboidShape(0, 9, 1, 1, 10, 15),
		Block.createCuboidShape(0, 25, 1, 1, 26, 15),
		Block.createCuboidShape(31, 25, 1, 32, 26, 15),
		Block.createCuboidShape(31, 17, 1, 32, 18, 15),
		Block.createCuboidShape(31, 9, 1, 32, 10, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 11, 5, 11, 17, 20),
		Block.createCuboidShape(5, 19, 6, 13, 26, 10),
		Block.createCuboidShape(15, 0, 0, 16, 32, 32),
		Block.createCuboidShape(4, 3, 9, 7, 9, 22),
		Block.createCuboidShape(5, 27, 13, 13, 29, 29),
		Block.createCuboidShape(0, 0, 0, 15, 3, 32),
		Block.createCuboidShape(0, 18, 0, 15, 19, 32),
		Block.createCuboidShape(0, 10, 0, 15, 11, 32),
		Block.createCuboidShape(0, 26, 0, 15, 27, 32),
		Block.createCuboidShape(4, 3, 2, 12, 7, 7),
		Block.createCuboidShape(-3, 3, 11, 0, 9, 16),
		Block.createCuboidShape(5, 27, 2, 14, 29, 9),
		Block.createCuboidShape(3, 20, 24, 11, 22, 28),
		Block.createCuboidShape(0, 0, 0, 1, 32, 1),
		Block.createCuboidShape(0, 0, 31, 1, 32, 32),
		Block.createCuboidShape(1, 31, 31, 15, 32, 32),
		Block.createCuboidShape(1, 31, 0, 15, 32, 1),
		Block.createCuboidShape(1, 17, 0, 15, 18, 1),
		Block.createCuboidShape(1, 9, 0, 15, 10, 1),
		Block.createCuboidShape(1, 25, 0, 15, 26, 1),
		Block.createCuboidShape(1, 25, 31, 15, 26, 32),
		Block.createCuboidShape(1, 17, 31, 15, 18, 32),
		Block.createCuboidShape(1, 9, 31, 15, 10, 32)
    );

    public Market_office_cabinet_down_Data() {
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

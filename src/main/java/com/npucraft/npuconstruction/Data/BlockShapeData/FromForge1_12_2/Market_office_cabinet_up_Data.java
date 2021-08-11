package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Market_office_cabinet_up_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 9, 5, 11, 15, 11),
		Block.createCuboidShape(8, 17, 5, 12, 24, 13),
		Block.createCuboidShape(-6, 1, 4, 7, 7, 7),
		Block.createCuboidShape(-7, 17, 5, -1, 25, 10),
		Block.createCuboidShape(-16, 26, 0, 16, 32, 15),
		Block.createCuboidShape(-16, 8, 0, 16, 9, 15),
		Block.createCuboidShape(-16, 0, 0, 16, 1, 15),
		Block.createCuboidShape(-16, 16, 0, 16, 17, 15),
		Block.createCuboidShape(-16, -3, 15, 16, 32, 16),
		Block.createCuboidShape(9, 1, 4, 14, 5, 12),
		Block.createCuboidShape(-16, -2, 0, -15, 32, 1),
		Block.createCuboidShape(15, -2, 0, 16, 32, 1),
		Block.createCuboidShape(-16, 7, 1, -15, 8, 15),
		Block.createCuboidShape(15, 7, 1, 16, 8, 15),
		Block.createCuboidShape(15, 15, 1, 16, 16, 15),
		Block.createCuboidShape(-16, 15, 1, -15, 16, 15),
		Block.createCuboidShape(0, 1, -3, 5, 7, 0),
		Block.createCuboidShape(-7, 17, 11, -1, 25, 13),
		Block.createCuboidShape(-12, 18, 3, -8, 20, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 9, -4, 11, 15, 11),
		Block.createCuboidShape(3, 17, 8, 11, 24, 12),
		Block.createCuboidShape(9, 1, -6, 12, 7, 7),
		Block.createCuboidShape(6, 17, -7, 11, 25, -1),
		Block.createCuboidShape(1, 26, -16, 16, 32, 16),
		Block.createCuboidShape(1, 8, -16, 16, 9, 16),
		Block.createCuboidShape(1, 0, -16, 16, 1, 16),
		Block.createCuboidShape(1, 16, -16, 16, 17, 16),
		Block.createCuboidShape(0, -3, -16, 1, 32, 16),
		Block.createCuboidShape(4, 1, 9, 12, 5, 14),
		Block.createCuboidShape(15, -2, -16, 16, 32, -15),
		Block.createCuboidShape(15, -2, 15, 16, 32, 16),
		Block.createCuboidShape(1, 7, -16, 15, 8, -15),
		Block.createCuboidShape(1, 7, 15, 15, 8, 16),
		Block.createCuboidShape(1, 15, 15, 15, 16, 16),
		Block.createCuboidShape(1, 15, -16, 15, 16, -15),
		Block.createCuboidShape(16, 1, 0, 19, 7, 5),
		Block.createCuboidShape(3, 17, -7, 5, 25, -1),
		Block.createCuboidShape(5, 18, -12, 13, 20, -8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 9, 5, 20, 15, 11),
		Block.createCuboidShape(4, 17, 3, 8, 24, 11),
		Block.createCuboidShape(9, 1, 9, 22, 7, 12),
		Block.createCuboidShape(17, 17, 6, 23, 25, 11),
		Block.createCuboidShape(0, 26, 1, 32, 32, 16),
		Block.createCuboidShape(0, 8, 1, 32, 9, 16),
		Block.createCuboidShape(0, 0, 1, 32, 1, 16),
		Block.createCuboidShape(0, 16, 1, 32, 17, 16),
		Block.createCuboidShape(0, -3, 0, 32, 32, 1),
		Block.createCuboidShape(2, 1, 4, 7, 5, 12),
		Block.createCuboidShape(31, -2, 15, 32, 32, 16),
		Block.createCuboidShape(0, -2, 15, 1, 32, 16),
		Block.createCuboidShape(31, 7, 1, 32, 8, 15),
		Block.createCuboidShape(0, 7, 1, 1, 8, 15),
		Block.createCuboidShape(0, 15, 1, 1, 16, 15),
		Block.createCuboidShape(31, 15, 1, 32, 16, 15),
		Block.createCuboidShape(11, 1, 16, 16, 7, 19),
		Block.createCuboidShape(17, 17, 3, 23, 25, 5),
		Block.createCuboidShape(24, 18, 5, 28, 20, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 9, 5, 11, 15, 20),
		Block.createCuboidShape(5, 17, 4, 13, 24, 8),
		Block.createCuboidShape(4, 1, 9, 7, 7, 22),
		Block.createCuboidShape(5, 17, 17, 10, 25, 23),
		Block.createCuboidShape(0, 26, 0, 15, 32, 32),
		Block.createCuboidShape(0, 8, 0, 15, 9, 32),
		Block.createCuboidShape(0, 0, 0, 15, 1, 32),
		Block.createCuboidShape(0, 16, 0, 15, 17, 32),
		Block.createCuboidShape(15, -3, 0, 16, 32, 32),
		Block.createCuboidShape(4, 1, 2, 12, 5, 7),
		Block.createCuboidShape(0, -2, 31, 1, 32, 32),
		Block.createCuboidShape(0, -2, 0, 1, 32, 1),
		Block.createCuboidShape(1, 7, 31, 15, 8, 32),
		Block.createCuboidShape(1, 7, 0, 15, 8, 1),
		Block.createCuboidShape(1, 15, 0, 15, 16, 1),
		Block.createCuboidShape(1, 15, 31, 15, 16, 32),
		Block.createCuboidShape(-3, 1, 11, 0, 7, 16),
		Block.createCuboidShape(11, 17, 17, 13, 25, 23),
		Block.createCuboidShape(3, 18, 24, 11, 20, 28)
    );

    public Market_office_cabinet_up_Data() {
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

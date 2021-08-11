package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Girlwash_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(15, 16, 5, 25, 18, 11),
		Block.createCuboidShape(-9, 15, 6, 1, 18, 11),
		Block.createCuboidShape(16, 16, 4, 24, 20, 7),
		Block.createCuboidShape(-8, 16, 11, 24, 18, 12),
		Block.createCuboidShape(16, 16, 11, 24, 20, 13),
		Block.createCuboidShape(-6, 18, 4, -2, 20, 13),
		Block.createCuboidShape(-6, 18, 12, -2, 25, 14),
		Block.createCuboidShape(-5, 1, 9, 0, 15, 10),
		Block.createCuboidShape(19, 1, 9, 24, 15, 10),
		Block.createCuboidShape(-8, 17, 5, 24, 18, 6),
		Block.createCuboidShape(26, 19, 4, 32, 20, 13),
		Block.createCuboidShape(2, 19, 4, 14, 20, 13),
		Block.createCuboidShape(-16, 19, 2, 32, 20, 4),
		Block.createCuboidShape(-16, 19, 4, -10, 20, 13),
		Block.createCuboidShape(-16, 19, 13, 32, 20, 15),
		Block.createCuboidShape(-16, 14, 1, 32, 20, 2),
		Block.createCuboidShape(-16, 0, 15, 32, 20, 16),
		Block.createCuboidShape(17, 15, 7, 23, 16, 11),
		Block.createCuboidShape(19, 20, 13, 21, 25, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 16, 15, 11, 18, 25),
		Block.createCuboidShape(5, 15, -9, 10, 18, 1),
		Block.createCuboidShape(9, 16, 16, 12, 20, 24),
		Block.createCuboidShape(4, 16, -8, 5, 18, 24),
		Block.createCuboidShape(3, 16, 16, 5, 20, 24),
		Block.createCuboidShape(3, 18, -6, 12, 20, -2),
		Block.createCuboidShape(2, 18, -6, 4, 25, -2),
		Block.createCuboidShape(6, 1, -5, 7, 15, 0),
		Block.createCuboidShape(6, 1, 19, 7, 15, 24),
		Block.createCuboidShape(10, 17, -8, 11, 18, 24),
		Block.createCuboidShape(3, 19, 26, 12, 20, 32),
		Block.createCuboidShape(3, 19, 2, 12, 20, 14),
		Block.createCuboidShape(12, 19, -16, 14, 20, 32),
		Block.createCuboidShape(3, 19, -16, 12, 20, -10),
		Block.createCuboidShape(1, 19, -16, 3, 20, 32),
		Block.createCuboidShape(14, 14, -16, 15, 20, 32),
		Block.createCuboidShape(0, 0, -16, 1, 20, 32),
		Block.createCuboidShape(5, 15, 17, 9, 16, 23),
		Block.createCuboidShape(2, 20, 19, 3, 25, 21)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-9, 16, 5, 1, 18, 11),
		Block.createCuboidShape(15, 15, 5, 25, 18, 10),
		Block.createCuboidShape(-8, 16, 9, 0, 20, 12),
		Block.createCuboidShape(-8, 16, 4, 24, 18, 5),
		Block.createCuboidShape(-8, 16, 3, 0, 20, 5),
		Block.createCuboidShape(18, 18, 3, 22, 20, 12),
		Block.createCuboidShape(18, 18, 2, 22, 25, 4),
		Block.createCuboidShape(16, 1, 6, 21, 15, 7),
		Block.createCuboidShape(-8, 1, 6, -3, 15, 7),
		Block.createCuboidShape(-8, 17, 10, 24, 18, 11),
		Block.createCuboidShape(-16, 19, 3, -10, 20, 12),
		Block.createCuboidShape(2, 19, 3, 14, 20, 12),
		Block.createCuboidShape(-16, 19, 12, 32, 20, 14),
		Block.createCuboidShape(26, 19, 3, 32, 20, 12),
		Block.createCuboidShape(-16, 19, 1, 32, 20, 3),
		Block.createCuboidShape(-16, 14, 14, 32, 20, 15),
		Block.createCuboidShape(-16, 0, 0, 32, 20, 1),
		Block.createCuboidShape(-7, 15, 5, -1, 16, 9),
		Block.createCuboidShape(-5, 20, 2, -3, 25, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 16, -9, 11, 18, 1),
		Block.createCuboidShape(6, 15, 15, 11, 18, 25),
		Block.createCuboidShape(4, 16, -8, 7, 20, 0),
		Block.createCuboidShape(11, 16, -8, 12, 18, 24),
		Block.createCuboidShape(11, 16, -8, 13, 20, 0),
		Block.createCuboidShape(4, 18, 18, 13, 20, 22),
		Block.createCuboidShape(12, 18, 18, 14, 25, 22),
		Block.createCuboidShape(9, 1, 16, 10, 15, 21),
		Block.createCuboidShape(9, 1, -8, 10, 15, -3),
		Block.createCuboidShape(5, 17, -8, 6, 18, 24),
		Block.createCuboidShape(4, 19, -16, 13, 20, -10),
		Block.createCuboidShape(4, 19, 2, 13, 20, 14),
		Block.createCuboidShape(2, 19, -16, 4, 20, 32),
		Block.createCuboidShape(4, 19, 26, 13, 20, 32),
		Block.createCuboidShape(13, 19, -16, 15, 20, 32),
		Block.createCuboidShape(1, 14, -16, 2, 20, 32),
		Block.createCuboidShape(15, 0, -16, 16, 20, 32),
		Block.createCuboidShape(7, 15, -7, 11, 16, -1),
		Block.createCuboidShape(13, 20, -5, 14, 25, -3)
    );

    public Girlwash_Data() {
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

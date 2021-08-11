package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sdframe_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, -15, 6, 23, -14, 10),
		Block.createCuboidShape(4, 26, 6, 23, 27, 10),
		Block.createCuboidShape(24, -16, 0, 32, 32, 16),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 8),
		Block.createCuboidShape(-16, 0, 0, -8, 16, 16),
		Block.createCuboidShape(16, 28, 0, 24, 32, 16),
		Block.createCuboidShape(0, 28, 0, 24, 32, 8),
		Block.createCuboidShape(-8, 28, 0, 0, 32, 16),
		Block.createCuboidShape(-16, 16, 8, -8, 32, 16),
		Block.createCuboidShape(0, 28, 8, 16, 32, 16),
		Block.createCuboidShape(-16, -16, 8, -8, 0, 16),
		Block.createCuboidShape(23, -16, 5, 24, 28, 11),
		Block.createCuboidShape(-8, -16, 5, -7, 28, 11),
		Block.createCuboidShape(-7, 27, 5, 23, 28, 11),
		Block.createCuboidShape(-7, -16, 5, 23, -15, 11),
		Block.createCuboidShape(4, 5, 5, 8, 6, 6),
		Block.createCuboidShape(18, -14, 6, 19, 26, 8),
		Block.createCuboidShape(22, -14, 8, 23, 26, 10),
		Block.createCuboidShape(4, -14, 6, 5, 26, 8),
		Block.createCuboidShape(8, -14, 8, 9, 26, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, -15, 4, 10, -14, 23),
		Block.createCuboidShape(6, 26, 4, 10, 27, 23),
		Block.createCuboidShape(0, -16, 24, 16, 32, 32),
		Block.createCuboidShape(8, -16, -16, 16, 32, -8),
		Block.createCuboidShape(0, 0, -16, 16, 16, -8),
		Block.createCuboidShape(0, 28, 16, 16, 32, 24),
		Block.createCuboidShape(8, 28, 0, 16, 32, 24),
		Block.createCuboidShape(0, 28, -8, 16, 32, 0),
		Block.createCuboidShape(0, 16, -16, 8, 32, -8),
		Block.createCuboidShape(0, 28, 0, 8, 32, 16),
		Block.createCuboidShape(0, -16, -16, 8, 0, -8),
		Block.createCuboidShape(5, -16, 23, 11, 28, 24),
		Block.createCuboidShape(5, -16, -8, 11, 28, -7),
		Block.createCuboidShape(5, 27, -7, 11, 28, 23),
		Block.createCuboidShape(5, -16, -7, 11, -15, 23),
		Block.createCuboidShape(10, 5, 4, 11, 6, 8),
		Block.createCuboidShape(8, -14, 18, 10, 26, 19),
		Block.createCuboidShape(6, -14, 22, 8, 26, 23),
		Block.createCuboidShape(8, -14, 4, 10, 26, 5),
		Block.createCuboidShape(6, -14, 8, 8, 26, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-7, -15, 6, 12, -14, 10),
		Block.createCuboidShape(-7, 26, 6, 12, 27, 10),
		Block.createCuboidShape(-16, -16, 0, -8, 32, 16),
		Block.createCuboidShape(24, -16, 8, 32, 32, 16),
		Block.createCuboidShape(24, 0, 0, 32, 16, 16),
		Block.createCuboidShape(-8, 28, 0, 0, 32, 16),
		Block.createCuboidShape(-8, 28, 8, 16, 32, 16),
		Block.createCuboidShape(16, 28, 0, 24, 32, 16),
		Block.createCuboidShape(24, 16, 0, 32, 32, 8),
		Block.createCuboidShape(0, 28, 0, 16, 32, 8),
		Block.createCuboidShape(24, -16, 0, 32, 0, 8),
		Block.createCuboidShape(-8, -16, 5, -7, 28, 11),
		Block.createCuboidShape(23, -16, 5, 24, 28, 11),
		Block.createCuboidShape(-7, 27, 5, 23, 28, 11),
		Block.createCuboidShape(-7, -16, 5, 23, -15, 11),
		Block.createCuboidShape(8, 5, 10, 12, 6, 11),
		Block.createCuboidShape(-3, -14, 8, -2, 26, 10),
		Block.createCuboidShape(-7, -14, 6, -6, 26, 8),
		Block.createCuboidShape(11, -14, 8, 12, 26, 10),
		Block.createCuboidShape(7, -14, 6, 8, 26, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -15, -7, 10, -14, 12),
		Block.createCuboidShape(6, 26, -7, 10, 27, 12),
		Block.createCuboidShape(0, -16, -16, 16, 32, -8),
		Block.createCuboidShape(0, -16, 24, 8, 32, 32),
		Block.createCuboidShape(0, 0, 24, 16, 16, 32),
		Block.createCuboidShape(0, 28, -8, 16, 32, 0),
		Block.createCuboidShape(0, 28, -8, 8, 32, 16),
		Block.createCuboidShape(0, 28, 16, 16, 32, 24),
		Block.createCuboidShape(8, 16, 24, 16, 32, 32),
		Block.createCuboidShape(8, 28, 0, 16, 32, 16),
		Block.createCuboidShape(8, -16, 24, 16, 0, 32),
		Block.createCuboidShape(5, -16, -8, 11, 28, -7),
		Block.createCuboidShape(5, -16, 23, 11, 28, 24),
		Block.createCuboidShape(5, 27, -7, 11, 28, 23),
		Block.createCuboidShape(5, -16, -7, 11, -15, 23),
		Block.createCuboidShape(5, 5, 8, 6, 6, 12),
		Block.createCuboidShape(6, -14, -3, 8, 26, -2),
		Block.createCuboidShape(8, -14, -7, 10, 26, -6),
		Block.createCuboidShape(6, -14, 11, 8, 26, 12),
		Block.createCuboidShape(8, -14, 7, 10, 26, 8)
    );

    public Sdframe_Data() {
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

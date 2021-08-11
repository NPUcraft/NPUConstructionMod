package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirldoor5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 4, -10, 16, 10),
		Block.createCuboidShape(10, 0, 4, 15, 16, 10),
		Block.createCuboidShape(-11, 12, 4, 11, 16, 10),
		Block.createCuboidShape(-16, 0, 4, -15, 16, 16),
		Block.createCuboidShape(8, 0, 7, 10, 12, 9),
		Block.createCuboidShape(-8, 0, 7, 8, 2, 9),
		Block.createCuboidShape(-8, 10, 7, 8, 12, 9),
		Block.createCuboidShape(-10, 0, 7, -8, 12, 9),
		Block.createCuboidShape(15, 0, 4, 16, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, -16, 12, 16, -10),
		Block.createCuboidShape(6, 0, 10, 12, 16, 15),
		Block.createCuboidShape(6, 12, -11, 12, 16, 11),
		Block.createCuboidShape(0, 0, -16, 12, 16, -15),
		Block.createCuboidShape(7, 0, 8, 9, 12, 10),
		Block.createCuboidShape(7, 0, -8, 9, 2, 8),
		Block.createCuboidShape(7, 10, -8, 9, 12, 8),
		Block.createCuboidShape(7, 0, -10, 9, 12, -8),
		Block.createCuboidShape(0, 0, 15, 12, 16, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(26, 0, 6, 32, 16, 12),
		Block.createCuboidShape(1, 0, 6, 6, 16, 12),
		Block.createCuboidShape(5, 12, 6, 27, 16, 12),
		Block.createCuboidShape(31, 0, 0, 32, 16, 12),
		Block.createCuboidShape(6, 0, 7, 8, 12, 9),
		Block.createCuboidShape(8, 0, 7, 24, 2, 9),
		Block.createCuboidShape(8, 10, 7, 24, 12, 9),
		Block.createCuboidShape(24, 0, 7, 26, 12, 9),
		Block.createCuboidShape(0, 0, 0, 1, 16, 12)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 0, 26, 10, 16, 32),
		Block.createCuboidShape(4, 0, 1, 10, 16, 6),
		Block.createCuboidShape(4, 12, 5, 10, 16, 27),
		Block.createCuboidShape(4, 0, 31, 16, 16, 32),
		Block.createCuboidShape(7, 0, 6, 9, 12, 8),
		Block.createCuboidShape(7, 0, 8, 9, 2, 24),
		Block.createCuboidShape(7, 10, 8, 9, 12, 24),
		Block.createCuboidShape(7, 0, 24, 9, 12, 26),
		Block.createCuboidShape(4, 0, 0, 16, 16, 1)
    );

    public Fgirldoor5_Data() {
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

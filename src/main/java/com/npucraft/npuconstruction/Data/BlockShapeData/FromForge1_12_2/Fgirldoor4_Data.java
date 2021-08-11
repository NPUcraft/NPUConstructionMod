package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirldoor4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-15, -16, 9, 15, -14, 16),
		Block.createCuboidShape(-16, -16, 4, -15, 32, 16),
		Block.createCuboidShape(15, -16, 4, 16, 32, 16),
		Block.createCuboidShape(-16, -16, 4, -12, 32, 10),
		Block.createCuboidShape(11, -16, 4, 15, 32, 10),
		Block.createCuboidShape(10, -16, 6, 11, 32, 10),
		Block.createCuboidShape(-12, -16, 6, -10, 32, 10),
		Block.createCuboidShape(8, -16, 7, 10, 32, 9),
		Block.createCuboidShape(-8, -16, 7, 8, -13, 9),
		Block.createCuboidShape(-10, -16, 7, -8, 32, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, -15, 7, -14, 15),
		Block.createCuboidShape(0, -16, -16, 12, 32, -15),
		Block.createCuboidShape(0, -16, 15, 12, 32, 16),
		Block.createCuboidShape(6, -16, -16, 12, 32, -12),
		Block.createCuboidShape(6, -16, 11, 12, 32, 15),
		Block.createCuboidShape(6, -16, 10, 10, 32, 11),
		Block.createCuboidShape(6, -16, -12, 10, 32, -10),
		Block.createCuboidShape(7, -16, 8, 9, 32, 10),
		Block.createCuboidShape(7, -16, -8, 9, -13, 8),
		Block.createCuboidShape(7, -16, -10, 9, 32, -8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, -16, 0, 31, -14, 7),
		Block.createCuboidShape(31, -16, 0, 32, 32, 12),
		Block.createCuboidShape(0, -16, 0, 1, 32, 12),
		Block.createCuboidShape(28, -16, 6, 32, 32, 12),
		Block.createCuboidShape(1, -16, 6, 5, 32, 12),
		Block.createCuboidShape(5, -16, 6, 6, 32, 10),
		Block.createCuboidShape(26, -16, 6, 28, 32, 10),
		Block.createCuboidShape(6, -16, 7, 8, 32, 9),
		Block.createCuboidShape(8, -16, 7, 24, -13, 9),
		Block.createCuboidShape(24, -16, 7, 26, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, -16, 1, 16, -14, 31),
		Block.createCuboidShape(4, -16, 31, 16, 32, 32),
		Block.createCuboidShape(4, -16, 0, 16, 32, 1),
		Block.createCuboidShape(4, -16, 28, 10, 32, 32),
		Block.createCuboidShape(4, -16, 1, 10, 32, 5),
		Block.createCuboidShape(6, -16, 5, 10, 32, 6),
		Block.createCuboidShape(6, -16, 26, 10, 32, 28),
		Block.createCuboidShape(7, -16, 6, 9, 32, 8),
		Block.createCuboidShape(7, -16, 8, 9, -13, 24),
		Block.createCuboidShape(7, -16, 24, 9, 32, 26)
    );

    public Fgirldoor4_Data() {
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

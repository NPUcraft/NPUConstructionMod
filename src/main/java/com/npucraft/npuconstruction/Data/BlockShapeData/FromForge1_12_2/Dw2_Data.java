package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dw2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 4, 18, 17, 5, 18),
		Block.createCuboidShape(-16, -16, -1, -15, 32, 17),
		Block.createCuboidShape(15, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-15, 31, -1, 15, 32, 17),
		Block.createCuboidShape(-15, 4, 10, -14, 26, 16),
		Block.createCuboidShape(14, 4, 10, 15, 26, 16),
		Block.createCuboidShape(-15, -16, 4, -13, 31, 12),
		Block.createCuboidShape(13, -16, 4, 15, 31, 12),
		Block.createCuboidShape(-15, -16, 16, -13, 31, 19),
		Block.createCuboidShape(13, -16, 16, 15, 31, 19),
		Block.createCuboidShape(-15, -16, 12, -13, 4, 16),
		Block.createCuboidShape(13, -16, 12, 15, 4, 16),
		Block.createCuboidShape(-15, 26, 12, -13, 31, 16),
		Block.createCuboidShape(13, 26, 12, 15, 31, 16),
		Block.createCuboidShape(-16, 1, 17, -13, 7, 19),
		Block.createCuboidShape(13, 1, 17, 16, 7, 19)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-2, 4, -16, -2, 5, 17),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -15),
		Block.createCuboidShape(-1, -16, 15, 17, 32, 16),
		Block.createCuboidShape(-1, 31, -15, 17, 32, 15),
		Block.createCuboidShape(0, 4, -15, 6, 26, -14),
		Block.createCuboidShape(0, 4, 14, 6, 26, 15),
		Block.createCuboidShape(4, -16, -15, 12, 31, -13),
		Block.createCuboidShape(4, -16, 13, 12, 31, 15),
		Block.createCuboidShape(-3, -16, -15, 0, 31, -13),
		Block.createCuboidShape(-3, -16, 13, 0, 31, 15),
		Block.createCuboidShape(0, -16, -15, 4, 4, -13),
		Block.createCuboidShape(0, -16, 13, 4, 4, 15),
		Block.createCuboidShape(0, 26, -15, 4, 31, -13),
		Block.createCuboidShape(0, 26, 13, 4, 31, 15),
		Block.createCuboidShape(-3, 1, -16, -1, 7, -13),
		Block.createCuboidShape(-3, 1, 13, -1, 7, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 4, -2, 32, 5, -2),
		Block.createCuboidShape(31, -16, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 1, 32, 17),
		Block.createCuboidShape(1, 31, -1, 31, 32, 17),
		Block.createCuboidShape(30, 4, 0, 31, 26, 6),
		Block.createCuboidShape(1, 4, 0, 2, 26, 6),
		Block.createCuboidShape(29, -16, 4, 31, 31, 12),
		Block.createCuboidShape(1, -16, 4, 3, 31, 12),
		Block.createCuboidShape(29, -16, -3, 31, 31, 0),
		Block.createCuboidShape(1, -16, -3, 3, 31, 0),
		Block.createCuboidShape(29, -16, 0, 31, 4, 4),
		Block.createCuboidShape(1, -16, 0, 3, 4, 4),
		Block.createCuboidShape(29, 26, 0, 31, 31, 4),
		Block.createCuboidShape(1, 26, 0, 3, 31, 4),
		Block.createCuboidShape(29, 1, -3, 32, 7, -1),
		Block.createCuboidShape(0, 1, -3, 3, 7, -1)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(18, 4, -1, 18, 5, 32),
		Block.createCuboidShape(-1, -16, 31, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 1),
		Block.createCuboidShape(-1, 31, 1, 17, 32, 31),
		Block.createCuboidShape(10, 4, 30, 16, 26, 31),
		Block.createCuboidShape(10, 4, 1, 16, 26, 2),
		Block.createCuboidShape(4, -16, 29, 12, 31, 31),
		Block.createCuboidShape(4, -16, 1, 12, 31, 3),
		Block.createCuboidShape(16, -16, 29, 19, 31, 31),
		Block.createCuboidShape(16, -16, 1, 19, 31, 3),
		Block.createCuboidShape(12, -16, 29, 16, 4, 31),
		Block.createCuboidShape(12, -16, 1, 16, 4, 3),
		Block.createCuboidShape(12, 26, 29, 16, 31, 31),
		Block.createCuboidShape(12, 26, 1, 16, 31, 3),
		Block.createCuboidShape(17, 1, 29, 19, 7, 32),
		Block.createCuboidShape(17, 1, 0, 19, 7, 3)
    );

    public Dw2_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fctv_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -8, 3, 24, 11, 4),
		Block.createCuboidShape(-1, 0, 4, 17, 4, 5),
		Block.createCuboidShape(1, -4, 4, 15, 10, 5),
		Block.createCuboidShape(-6, 3, 4, 22, 4, 5),
		Block.createCuboidShape(-8, 11, 3, 24, 12, 4),
		Block.createCuboidShape(7, 2, 5, 9, 29, 6),
		Block.createCuboidShape(-8, -9, 3, 24, -7, 4),
		Block.createCuboidShape(-8, -7, 3, 24, 11, 3),
		Block.createCuboidShape(-9, -9, 3, -8, 12, 4),
		Block.createCuboidShape(24, -9, 3, 25, 12, 4)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(12, -8, -8, 13, 11, 24),
		Block.createCuboidShape(11, 0, -1, 12, 4, 17),
		Block.createCuboidShape(11, -4, 1, 12, 10, 15),
		Block.createCuboidShape(11, 3, -6, 12, 4, 22),
		Block.createCuboidShape(12, 11, -8, 13, 12, 24),
		Block.createCuboidShape(10, 2, 7, 11, 29, 9),
		Block.createCuboidShape(12, -9, -8, 13, -7, 24),
		Block.createCuboidShape(13, -7, -8, 13, 11, 24),
		Block.createCuboidShape(12, -9, -9, 13, 12, -8),
		Block.createCuboidShape(12, -9, 24, 13, 12, 25)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, -8, 12, 24, 11, 13),
		Block.createCuboidShape(-1, 0, 11, 17, 4, 12),
		Block.createCuboidShape(1, -4, 11, 15, 10, 12),
		Block.createCuboidShape(-6, 3, 11, 22, 4, 12),
		Block.createCuboidShape(-8, 11, 12, 24, 12, 13),
		Block.createCuboidShape(7, 2, 10, 9, 29, 11),
		Block.createCuboidShape(-8, -9, 12, 24, -7, 13),
		Block.createCuboidShape(-8, -7, 13, 24, 11, 13),
		Block.createCuboidShape(24, -9, 12, 25, 12, 13),
		Block.createCuboidShape(-9, -9, 12, -8, 12, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, -8, -8, 4, 11, 24),
		Block.createCuboidShape(4, 0, -1, 5, 4, 17),
		Block.createCuboidShape(4, -4, 1, 5, 10, 15),
		Block.createCuboidShape(4, 3, -6, 5, 4, 22),
		Block.createCuboidShape(3, 11, -8, 4, 12, 24),
		Block.createCuboidShape(5, 2, 7, 6, 29, 9),
		Block.createCuboidShape(3, -9, -8, 4, -7, 24),
		Block.createCuboidShape(3, -7, -8, 3, 11, 24),
		Block.createCuboidShape(3, -9, 24, 4, 12, 25),
		Block.createCuboidShape(3, -9, -9, 4, 12, -8)
    );

    public Fctv_Data() {
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

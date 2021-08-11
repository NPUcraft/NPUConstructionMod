package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Box1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(12, 0, 0, 18, 3, 11),
		Block.createCuboidShape(10, 0, 0, 17, 2, 5),
		Block.createCuboidShape(11, 3, 7, 16, 9, 14),
		Block.createCuboidShape(-1, 6, 4, 8, 7, 14),
		Block.createCuboidShape(-1, 0, 4, 7, 7, 4),
		Block.createCuboidShape(-1, 0, 4, 7, 0, 14),
		Block.createCuboidShape(-1, 0, 14, 7, 7, 14),
		Block.createCuboidShape(-2, 0, 4, -1, 7, 14),
		Block.createCuboidShape(7, 0, 4, 8, 7, 14),
		Block.createCuboidShape(-1, 0, 0, 5, 2, 3)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 12, 16, 3, 18),
		Block.createCuboidShape(11, 0, 10, 16, 2, 17),
		Block.createCuboidShape(2, 3, 11, 9, 9, 16),
		Block.createCuboidShape(2, 6, -1, 12, 7, 8),
		Block.createCuboidShape(12, 0, -1, 12, 7, 7),
		Block.createCuboidShape(2, 0, -1, 12, 0, 7),
		Block.createCuboidShape(2, 0, -1, 2, 7, 7),
		Block.createCuboidShape(2, 0, -2, 12, 7, -1),
		Block.createCuboidShape(2, 0, 7, 12, 7, 8),
		Block.createCuboidShape(13, 0, -1, 16, 2, 5)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-2, 0, 5, 4, 3, 16),
		Block.createCuboidShape(-1, 0, 11, 6, 2, 16),
		Block.createCuboidShape(0, 3, 2, 5, 9, 9),
		Block.createCuboidShape(8, 6, 2, 17, 7, 12),
		Block.createCuboidShape(9, 0, 12, 17, 7, 12),
		Block.createCuboidShape(9, 0, 2, 17, 0, 12),
		Block.createCuboidShape(9, 0, 2, 17, 7, 2),
		Block.createCuboidShape(17, 0, 2, 18, 7, 12),
		Block.createCuboidShape(8, 0, 2, 9, 7, 12),
		Block.createCuboidShape(11, 0, 13, 17, 2, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -2, 11, 3, 4),
		Block.createCuboidShape(0, 0, -1, 5, 2, 6),
		Block.createCuboidShape(7, 3, 0, 14, 9, 5),
		Block.createCuboidShape(4, 6, 8, 14, 7, 17),
		Block.createCuboidShape(4, 0, 9, 4, 7, 17),
		Block.createCuboidShape(4, 0, 9, 14, 0, 17),
		Block.createCuboidShape(14, 0, 9, 14, 7, 17),
		Block.createCuboidShape(4, 0, 17, 14, 7, 18),
		Block.createCuboidShape(4, 0, 8, 14, 7, 9),
		Block.createCuboidShape(0, 0, 11, 3, 2, 17)
    );

    public Box1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Shop_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(10, 7, 5, 12, 11, 13),
		Block.createCuboidShape(7, 13, 5, 9, 17, 13),
		Block.createCuboidShape(-3, -8, 1, 13, 19, 2),
		Block.createCuboidShape(7, -5, 8, 9, -1, 13),
		Block.createCuboidShape(1, 1, 8, 3, 5, 13),
		Block.createCuboidShape(-2, 7, 8, 0, 11, 13),
		Block.createCuboidShape(-9, 2, 0, -5, 13, 1),
		Block.createCuboidShape(-3, -14, 4, 13, -5, 13),
		Block.createCuboidShape(-11, -15, 1, 14, -14, 16),
		Block.createCuboidShape(-11, 19, 1, 14, 20, 16),
		Block.createCuboidShape(-3, -14, 2, 13, -13, 13),
		Block.createCuboidShape(-10, -14, 2, -3, -13, 3),
		Block.createCuboidShape(-3, 0, 4, 13, 1, 13),
		Block.createCuboidShape(-3, 6, 4, 13, 7, 13),
		Block.createCuboidShape(-3, 12, 4, 13, 13, 13),
		Block.createCuboidShape(-10, -14, 15, 13, 19, 16),
		Block.createCuboidShape(-10, -13, 1, -4, 19, 15),
		Block.createCuboidShape(9, -13, 1, 13, -7, 6),
		Block.createCuboidShape(-3, -13, 1, 1, -7, 6),
		Block.createCuboidShape(1, -13, 1, 9, -11, 6),
		Block.createCuboidShape(-3, -14, 13, 13, 19, 15),
		Block.createCuboidShape(-11, -14, 1, -10, 19, 16),
		Block.createCuboidShape(13, -14, 1, 14, 19, 16),
		Block.createCuboidShape(1, -11, 2, 9, -8, 3),
		Block.createCuboidShape(-4, -14, 1, -3, 19, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 7, 10, 11, 11, 12),
		Block.createCuboidShape(3, 13, 7, 11, 17, 9),
		Block.createCuboidShape(14, -8, -3, 15, 19, 13),
		Block.createCuboidShape(3, -5, 7, 8, -1, 9),
		Block.createCuboidShape(3, 1, 1, 8, 5, 3),
		Block.createCuboidShape(3, 7, -2, 8, 11, 0),
		Block.createCuboidShape(15, 2, -9, 16, 13, -5),
		Block.createCuboidShape(3, -14, -3, 12, -5, 13),
		Block.createCuboidShape(0, -15, -11, 15, -14, 14),
		Block.createCuboidShape(0, 19, -11, 15, 20, 14),
		Block.createCuboidShape(3, -14, -3, 14, -13, 13),
		Block.createCuboidShape(13, -14, -10, 14, -13, -3),
		Block.createCuboidShape(3, 0, -3, 12, 1, 13),
		Block.createCuboidShape(3, 6, -3, 12, 7, 13),
		Block.createCuboidShape(3, 12, -3, 12, 13, 13),
		Block.createCuboidShape(0, -14, -10, 1, 19, 13),
		Block.createCuboidShape(1, -13, -10, 15, 19, -4),
		Block.createCuboidShape(10, -13, 9, 15, -7, 13),
		Block.createCuboidShape(10, -13, -3, 15, -7, 1),
		Block.createCuboidShape(10, -13, 1, 15, -11, 9),
		Block.createCuboidShape(1, -14, -3, 3, 19, 13),
		Block.createCuboidShape(0, -14, -11, 15, 19, -10),
		Block.createCuboidShape(0, -14, 13, 15, 19, 14),
		Block.createCuboidShape(13, -11, 1, 14, -8, 9),
		Block.createCuboidShape(1, -14, -4, 15, 19, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, 7, 3, 6, 11, 11),
		Block.createCuboidShape(7, 13, 3, 9, 17, 11),
		Block.createCuboidShape(3, -8, 14, 19, 19, 15),
		Block.createCuboidShape(7, -5, 3, 9, -1, 8),
		Block.createCuboidShape(13, 1, 3, 15, 5, 8),
		Block.createCuboidShape(16, 7, 3, 18, 11, 8),
		Block.createCuboidShape(21, 2, 15, 25, 13, 16),
		Block.createCuboidShape(3, -14, 3, 19, -5, 12),
		Block.createCuboidShape(2, -15, 0, 27, -14, 15),
		Block.createCuboidShape(2, 19, 0, 27, 20, 15),
		Block.createCuboidShape(3, -14, 3, 19, -13, 14),
		Block.createCuboidShape(19, -14, 13, 26, -13, 14),
		Block.createCuboidShape(3, 0, 3, 19, 1, 12),
		Block.createCuboidShape(3, 6, 3, 19, 7, 12),
		Block.createCuboidShape(3, 12, 3, 19, 13, 12),
		Block.createCuboidShape(3, -14, 0, 26, 19, 1),
		Block.createCuboidShape(20, -13, 1, 26, 19, 15),
		Block.createCuboidShape(3, -13, 10, 7, -7, 15),
		Block.createCuboidShape(15, -13, 10, 19, -7, 15),
		Block.createCuboidShape(7, -13, 10, 15, -11, 15),
		Block.createCuboidShape(3, -14, 1, 19, 19, 3),
		Block.createCuboidShape(26, -14, 0, 27, 19, 15),
		Block.createCuboidShape(2, -14, 0, 3, 19, 15),
		Block.createCuboidShape(7, -11, 13, 15, -8, 14),
		Block.createCuboidShape(19, -14, 1, 20, 19, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 7, 4, 13, 11, 6),
		Block.createCuboidShape(5, 13, 7, 13, 17, 9),
		Block.createCuboidShape(1, -8, 3, 2, 19, 19),
		Block.createCuboidShape(8, -5, 7, 13, -1, 9),
		Block.createCuboidShape(8, 1, 13, 13, 5, 15),
		Block.createCuboidShape(8, 7, 16, 13, 11, 18),
		Block.createCuboidShape(0, 2, 21, 1, 13, 25),
		Block.createCuboidShape(4, -14, 3, 13, -5, 19),
		Block.createCuboidShape(1, -15, 2, 16, -14, 27),
		Block.createCuboidShape(1, 19, 2, 16, 20, 27),
		Block.createCuboidShape(2, -14, 3, 13, -13, 19),
		Block.createCuboidShape(2, -14, 19, 3, -13, 26),
		Block.createCuboidShape(4, 0, 3, 13, 1, 19),
		Block.createCuboidShape(4, 6, 3, 13, 7, 19),
		Block.createCuboidShape(4, 12, 3, 13, 13, 19),
		Block.createCuboidShape(15, -14, 3, 16, 19, 26),
		Block.createCuboidShape(1, -13, 20, 15, 19, 26),
		Block.createCuboidShape(1, -13, 3, 6, -7, 7),
		Block.createCuboidShape(1, -13, 15, 6, -7, 19),
		Block.createCuboidShape(1, -13, 7, 6, -11, 15),
		Block.createCuboidShape(13, -14, 3, 15, 19, 19),
		Block.createCuboidShape(1, -14, 26, 16, 19, 27),
		Block.createCuboidShape(1, -14, 2, 16, 19, 3),
		Block.createCuboidShape(2, -11, 7, 3, -8, 15),
		Block.createCuboidShape(1, -14, 19, 15, 19, 20)
    );

    public Shop_Data() {
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

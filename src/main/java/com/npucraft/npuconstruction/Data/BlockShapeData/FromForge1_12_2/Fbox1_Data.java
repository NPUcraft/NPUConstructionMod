package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fbox1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 3, 5, 13, 12, 11),
		Block.createCuboidShape(5, 2, 2, 6, 11, 14),
		Block.createCuboidShape(3, 2, 4, 9, 13, 5),
		Block.createCuboidShape(3, 2, 11, 9, 13, 12),
		Block.createCuboidShape(3, 14, 2, 13, 15, 14),
		Block.createCuboidShape(3, 3, -1, 13, 11, 1),
		Block.createCuboidShape(2, 3, 1, 3, 11, 14),
		Block.createCuboidShape(13, 3, 1, 14, 11, 14),
		Block.createCuboidShape(3, 0, 1, 12, 2, 14),
		Block.createCuboidShape(5, 0, 6, 6, 16, 10),
		Block.createCuboidShape(7, 0, 4, 9, 16, 12),
		Block.createCuboidShape(7, 12, 5, 13, 15, 11),
		Block.createCuboidShape(3, 6, 14, 13, 11, 15),
		Block.createCuboidShape(4, 0, 4, 4, 16, 12),
		Block.createCuboidShape(3, 0, 13, 13, 6, 14),
		Block.createCuboidShape(5, 12, 2, 6, 13, 14),
		Block.createCuboidShape(5, 1, 3, 6, 16, 3),
		Block.createCuboidShape(5, 0, 13, 6, 15, 13),
		Block.createCuboidShape(12, 2, 7, 12, 16, 9),
		Block.createCuboidShape(10, 2, 6, 11, 16, 6),
		Block.createCuboidShape(10, 2, 10, 11, 16, 10),
		Block.createCuboidShape(3, 0, 1, 4, 3, 14),
		Block.createCuboidShape(12, 0, 1, 13, 3, 14),
		Block.createCuboidShape(3, 0, 1, 13, 3, 2)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 3, 7, 11, 12, 13),
		Block.createCuboidShape(2, 2, 5, 14, 11, 6),
		Block.createCuboidShape(11, 2, 3, 12, 13, 9),
		Block.createCuboidShape(4, 2, 3, 5, 13, 9),
		Block.createCuboidShape(2, 14, 3, 14, 15, 13),
		Block.createCuboidShape(15, 3, 3, 17, 11, 13),
		Block.createCuboidShape(2, 3, 2, 15, 11, 3),
		Block.createCuboidShape(2, 3, 13, 15, 11, 14),
		Block.createCuboidShape(2, 0, 3, 15, 2, 12),
		Block.createCuboidShape(6, 0, 5, 10, 16, 6),
		Block.createCuboidShape(4, 0, 7, 12, 16, 9),
		Block.createCuboidShape(5, 12, 7, 11, 15, 13),
		Block.createCuboidShape(1, 6, 3, 2, 11, 13),
		Block.createCuboidShape(4, 0, 4, 12, 16, 4),
		Block.createCuboidShape(2, 0, 3, 3, 6, 13),
		Block.createCuboidShape(2, 12, 5, 14, 13, 6),
		Block.createCuboidShape(13, 1, 5, 13, 16, 6),
		Block.createCuboidShape(3, 0, 5, 3, 15, 6),
		Block.createCuboidShape(7, 2, 12, 9, 16, 12),
		Block.createCuboidShape(10, 2, 10, 10, 16, 11),
		Block.createCuboidShape(6, 2, 10, 6, 16, 11),
		Block.createCuboidShape(2, 0, 3, 15, 3, 4),
		Block.createCuboidShape(2, 0, 12, 15, 3, 13),
		Block.createCuboidShape(14, 0, 3, 15, 3, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 3, 5, 9, 12, 11),
		Block.createCuboidShape(10, 2, 2, 11, 11, 14),
		Block.createCuboidShape(7, 2, 11, 13, 13, 12),
		Block.createCuboidShape(7, 2, 4, 13, 13, 5),
		Block.createCuboidShape(3, 14, 2, 13, 15, 14),
		Block.createCuboidShape(3, 3, 15, 13, 11, 17),
		Block.createCuboidShape(13, 3, 2, 14, 11, 15),
		Block.createCuboidShape(2, 3, 2, 3, 11, 15),
		Block.createCuboidShape(4, 0, 2, 13, 2, 15),
		Block.createCuboidShape(10, 0, 6, 11, 16, 10),
		Block.createCuboidShape(7, 0, 4, 9, 16, 12),
		Block.createCuboidShape(3, 12, 5, 9, 15, 11),
		Block.createCuboidShape(3, 6, 1, 13, 11, 2),
		Block.createCuboidShape(12, 0, 4, 12, 16, 12),
		Block.createCuboidShape(3, 0, 2, 13, 6, 3),
		Block.createCuboidShape(10, 12, 2, 11, 13, 14),
		Block.createCuboidShape(10, 1, 13, 11, 16, 13),
		Block.createCuboidShape(10, 0, 3, 11, 15, 3),
		Block.createCuboidShape(4, 2, 7, 4, 16, 9),
		Block.createCuboidShape(5, 2, 10, 6, 16, 10),
		Block.createCuboidShape(5, 2, 6, 6, 16, 6),
		Block.createCuboidShape(12, 0, 2, 13, 3, 15),
		Block.createCuboidShape(3, 0, 2, 4, 3, 15),
		Block.createCuboidShape(3, 0, 14, 13, 3, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 3, 3, 11, 12, 9),
		Block.createCuboidShape(2, 2, 10, 14, 11, 11),
		Block.createCuboidShape(4, 2, 7, 5, 13, 13),
		Block.createCuboidShape(11, 2, 7, 12, 13, 13),
		Block.createCuboidShape(2, 14, 3, 14, 15, 13),
		Block.createCuboidShape(-1, 3, 3, 1, 11, 13),
		Block.createCuboidShape(1, 3, 13, 14, 11, 14),
		Block.createCuboidShape(1, 3, 2, 14, 11, 3),
		Block.createCuboidShape(1, 0, 4, 14, 2, 13),
		Block.createCuboidShape(6, 0, 10, 10, 16, 11),
		Block.createCuboidShape(4, 0, 7, 12, 16, 9),
		Block.createCuboidShape(5, 12, 3, 11, 15, 9),
		Block.createCuboidShape(14, 6, 3, 15, 11, 13),
		Block.createCuboidShape(4, 0, 12, 12, 16, 12),
		Block.createCuboidShape(13, 0, 3, 14, 6, 13),
		Block.createCuboidShape(2, 12, 10, 14, 13, 11),
		Block.createCuboidShape(3, 1, 10, 3, 16, 11),
		Block.createCuboidShape(13, 0, 10, 13, 15, 11),
		Block.createCuboidShape(7, 2, 4, 9, 16, 4),
		Block.createCuboidShape(6, 2, 5, 6, 16, 6),
		Block.createCuboidShape(10, 2, 5, 10, 16, 6),
		Block.createCuboidShape(1, 0, 12, 14, 3, 13),
		Block.createCuboidShape(1, 0, 3, 14, 3, 4),
		Block.createCuboidShape(1, 0, 3, 2, 3, 13)
    );

    public Fbox1_Data() {
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

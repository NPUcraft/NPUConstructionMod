package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fswash_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 13, 5, 13, 15, 11),
		Block.createCuboidShape(4, 13, 4, 12, 17, 7),
		Block.createCuboidShape(4, 13, 11, 12, 17, 13),
		Block.createCuboidShape(7, 0, 9, 12, 12, 10),
		Block.createCuboidShape(14, 16, 4, 16, 17, 13),
		Block.createCuboidShape(0, 16, 2, 16, 17, 4),
		Block.createCuboidShape(0, 16, 4, 2, 17, 13),
		Block.createCuboidShape(0, 16, 13, 16, 17, 15),
		Block.createCuboidShape(0, 11, 1, 16, 17, 2),
		Block.createCuboidShape(0, 0, 15, 16, 17, 16),
		Block.createCuboidShape(5, 12, 7, 11, 13, 11),
		Block.createCuboidShape(7, 17, 13, 9, 22, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 13, 3, 11, 15, 13),
		Block.createCuboidShape(9, 13, 4, 12, 17, 12),
		Block.createCuboidShape(3, 13, 4, 5, 17, 12),
		Block.createCuboidShape(6, 0, 7, 7, 12, 12),
		Block.createCuboidShape(3, 16, 14, 12, 17, 16),
		Block.createCuboidShape(12, 16, 0, 14, 17, 16),
		Block.createCuboidShape(3, 16, 0, 12, 17, 2),
		Block.createCuboidShape(1, 16, 0, 3, 17, 16),
		Block.createCuboidShape(14, 11, 0, 15, 17, 16),
		Block.createCuboidShape(0, 0, 0, 1, 17, 16),
		Block.createCuboidShape(5, 12, 5, 9, 13, 11),
		Block.createCuboidShape(2, 17, 7, 3, 22, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 13, 5, 13, 15, 11),
		Block.createCuboidShape(4, 13, 9, 12, 17, 12),
		Block.createCuboidShape(4, 13, 3, 12, 17, 5),
		Block.createCuboidShape(4, 0, 6, 9, 12, 7),
		Block.createCuboidShape(0, 16, 3, 2, 17, 12),
		Block.createCuboidShape(0, 16, 12, 16, 17, 14),
		Block.createCuboidShape(14, 16, 3, 16, 17, 12),
		Block.createCuboidShape(0, 16, 1, 16, 17, 3),
		Block.createCuboidShape(0, 11, 14, 16, 17, 15),
		Block.createCuboidShape(0, 0, 0, 16, 17, 1),
		Block.createCuboidShape(5, 12, 5, 11, 13, 9),
		Block.createCuboidShape(7, 17, 2, 9, 22, 3)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 13, 3, 11, 15, 13),
		Block.createCuboidShape(4, 13, 4, 7, 17, 12),
		Block.createCuboidShape(11, 13, 4, 13, 17, 12),
		Block.createCuboidShape(9, 0, 4, 10, 12, 9),
		Block.createCuboidShape(4, 16, 0, 13, 17, 2),
		Block.createCuboidShape(2, 16, 0, 4, 17, 16),
		Block.createCuboidShape(4, 16, 14, 13, 17, 16),
		Block.createCuboidShape(13, 16, 0, 15, 17, 16),
		Block.createCuboidShape(1, 11, 0, 2, 17, 16),
		Block.createCuboidShape(15, 0, 0, 16, 17, 16),
		Block.createCuboidShape(7, 12, 5, 11, 13, 11),
		Block.createCuboidShape(13, 17, 7, 14, 22, 9)
    );

    public Fswash_Data() {
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

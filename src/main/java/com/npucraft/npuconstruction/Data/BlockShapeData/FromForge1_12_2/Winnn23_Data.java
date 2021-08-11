package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn23_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 7, 12, 15, 17, 13),
		Block.createCuboidShape(0, 0, 6, 16, 1, 9),
		Block.createCuboidShape(0, 15, 6, 16, 16, 9),
		Block.createCuboidShape(0, 1, 6, 1, 15, 9),
		Block.createCuboidShape(15, 1, 6, 16, 15, 9),
		Block.createCuboidShape(1, 1, 7, 15, 15, 9),
		Block.createCuboidShape(0, 0, 9, 16, 4, 16),
		Block.createCuboidShape(15, 4, 12, 16, 19, 13),
		Block.createCuboidShape(0, 19, 12, 16, 20, 14),
		Block.createCuboidShape(0, 4, 12, 1, 19, 13)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 7, 1, 4, 17, 15),
		Block.createCuboidShape(7, 0, 0, 10, 1, 16),
		Block.createCuboidShape(7, 15, 0, 10, 16, 16),
		Block.createCuboidShape(7, 1, 0, 10, 15, 1),
		Block.createCuboidShape(7, 1, 15, 10, 15, 16),
		Block.createCuboidShape(7, 1, 1, 9, 15, 15),
		Block.createCuboidShape(0, 0, 0, 7, 4, 16),
		Block.createCuboidShape(3, 4, 15, 4, 19, 16),
		Block.createCuboidShape(2, 19, 0, 4, 20, 16),
		Block.createCuboidShape(3, 4, 0, 4, 19, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 7, 3, 15, 17, 4),
		Block.createCuboidShape(0, 0, 7, 16, 1, 10),
		Block.createCuboidShape(0, 15, 7, 16, 16, 10),
		Block.createCuboidShape(15, 1, 7, 16, 15, 10),
		Block.createCuboidShape(0, 1, 7, 1, 15, 10),
		Block.createCuboidShape(1, 1, 7, 15, 15, 9),
		Block.createCuboidShape(0, 0, 0, 16, 4, 7),
		Block.createCuboidShape(0, 4, 3, 1, 19, 4),
		Block.createCuboidShape(0, 19, 2, 16, 20, 4),
		Block.createCuboidShape(15, 4, 3, 16, 19, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(12, 7, 1, 13, 17, 15),
		Block.createCuboidShape(6, 0, 0, 9, 1, 16),
		Block.createCuboidShape(6, 15, 0, 9, 16, 16),
		Block.createCuboidShape(6, 1, 15, 9, 15, 16),
		Block.createCuboidShape(6, 1, 0, 9, 15, 1),
		Block.createCuboidShape(7, 1, 1, 9, 15, 15),
		Block.createCuboidShape(9, 0, 0, 16, 4, 16),
		Block.createCuboidShape(12, 4, 0, 13, 19, 1),
		Block.createCuboidShape(12, 19, 0, 14, 20, 16),
		Block.createCuboidShape(12, 4, 15, 13, 19, 16)
    );

    public Winnn23_Data() {
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

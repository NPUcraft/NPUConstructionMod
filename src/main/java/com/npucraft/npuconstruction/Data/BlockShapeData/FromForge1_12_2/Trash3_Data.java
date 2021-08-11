package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Trash3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 22, 4, 20, 25, 13),
		Block.createCuboidShape(6, 3, 5, 10, 22, 12),
		Block.createCuboidShape(-2, 3, 5, 18, 18, 5),
		Block.createCuboidShape(-2, 3, 12, 18, 18, 12),
		Block.createCuboidShape(-3, 0, 5, 19, 3, 12),
		Block.createCuboidShape(-2, 3, 5, 18, 5, 12),
		Block.createCuboidShape(18, 3, 5, 19, 18, 12),
		Block.createCuboidShape(-3, 3, 5, -2, 18, 12),
		Block.createCuboidShape(19, 3, 7, 20, 22, 10),
		Block.createCuboidShape(-4, 3, 7, -3, 22, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 22, -4, 12, 25, 20),
		Block.createCuboidShape(4, 3, 6, 11, 22, 10),
		Block.createCuboidShape(11, 3, -2, 11, 18, 18),
		Block.createCuboidShape(4, 3, -2, 4, 18, 18),
		Block.createCuboidShape(4, 0, -3, 11, 3, 19),
		Block.createCuboidShape(4, 3, -2, 11, 5, 18),
		Block.createCuboidShape(4, 3, 18, 11, 18, 19),
		Block.createCuboidShape(4, 3, -3, 11, 18, -2),
		Block.createCuboidShape(6, 3, 19, 9, 22, 20),
		Block.createCuboidShape(6, 3, -4, 9, 22, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 22, 3, 20, 25, 12),
		Block.createCuboidShape(6, 3, 4, 10, 22, 11),
		Block.createCuboidShape(-2, 3, 11, 18, 18, 11),
		Block.createCuboidShape(-2, 3, 4, 18, 18, 4),
		Block.createCuboidShape(-3, 0, 4, 19, 3, 11),
		Block.createCuboidShape(-2, 3, 4, 18, 5, 11),
		Block.createCuboidShape(-3, 3, 4, -2, 18, 11),
		Block.createCuboidShape(18, 3, 4, 19, 18, 11),
		Block.createCuboidShape(-4, 3, 6, -3, 22, 9),
		Block.createCuboidShape(19, 3, 6, 20, 22, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 22, -4, 13, 25, 20),
		Block.createCuboidShape(5, 3, 6, 12, 22, 10),
		Block.createCuboidShape(5, 3, -2, 5, 18, 18),
		Block.createCuboidShape(12, 3, -2, 12, 18, 18),
		Block.createCuboidShape(5, 0, -3, 12, 3, 19),
		Block.createCuboidShape(5, 3, -2, 12, 5, 18),
		Block.createCuboidShape(5, 3, -3, 12, 18, -2),
		Block.createCuboidShape(5, 3, 18, 12, 18, 19),
		Block.createCuboidShape(7, 3, -4, 10, 22, -3),
		Block.createCuboidShape(7, 3, 19, 10, 22, 20)
    );

    public Trash3_Data() {
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

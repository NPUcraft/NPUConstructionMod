package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sc_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(9, 0, 15, 10, 13, 16),
		Block.createCuboidShape(22, 0, 15, 23, 13, 16),
		Block.createCuboidShape(9, 1, -3, 23, 7, 12),
		Block.createCuboidShape(9, 13, 5, 23, 19, 16),
		Block.createCuboidShape(9, 7, 1, 23, 13, 12),
		Block.createCuboidShape(9, 19, 9, 23, 25, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 9, 1, 13, 10),
		Block.createCuboidShape(0, 0, 22, 1, 13, 23),
		Block.createCuboidShape(4, 1, 9, 19, 7, 23),
		Block.createCuboidShape(0, 13, 9, 11, 19, 23),
		Block.createCuboidShape(4, 7, 9, 15, 13, 23),
		Block.createCuboidShape(0, 19, 9, 7, 25, 23)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 0, 7, 13, 1),
		Block.createCuboidShape(-7, 0, 0, -6, 13, 1),
		Block.createCuboidShape(-7, 1, 4, 7, 7, 19),
		Block.createCuboidShape(-7, 13, 0, 7, 19, 11),
		Block.createCuboidShape(-7, 7, 4, 7, 13, 15),
		Block.createCuboidShape(-7, 19, 0, 7, 25, 7)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(15, 0, 6, 16, 13, 7),
		Block.createCuboidShape(15, 0, -7, 16, 13, -6),
		Block.createCuboidShape(-3, 1, -7, 12, 7, 7),
		Block.createCuboidShape(5, 13, -7, 16, 19, 7),
		Block.createCuboidShape(1, 7, -7, 12, 13, 7),
		Block.createCuboidShape(9, 19, -7, 16, 25, 7)
    );

    public Sc_Data() {
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

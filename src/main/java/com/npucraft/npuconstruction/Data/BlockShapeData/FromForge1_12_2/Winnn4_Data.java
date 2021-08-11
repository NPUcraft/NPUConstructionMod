package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 1, 7, 15, 31, 9),
		Block.createCuboidShape(0, 0, 7, 16, 1, 9),
		Block.createCuboidShape(0, 31, 7, 16, 32, 9),
		Block.createCuboidShape(0, 1, 7, 1, 31, 9),
		Block.createCuboidShape(15, 1, 7, 16, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, 1, 9, 31, 15),
		Block.createCuboidShape(7, 0, 0, 9, 1, 16),
		Block.createCuboidShape(7, 31, 0, 9, 32, 16),
		Block.createCuboidShape(7, 1, 0, 9, 31, 1),
		Block.createCuboidShape(7, 1, 15, 9, 31, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 1, 7, 15, 31, 9),
		Block.createCuboidShape(0, 0, 7, 16, 1, 9),
		Block.createCuboidShape(0, 31, 7, 16, 32, 9),
		Block.createCuboidShape(15, 1, 7, 16, 31, 9),
		Block.createCuboidShape(0, 1, 7, 1, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 1, 1, 9, 31, 15),
		Block.createCuboidShape(7, 0, 0, 9, 1, 16),
		Block.createCuboidShape(7, 31, 0, 9, 32, 16),
		Block.createCuboidShape(7, 1, 15, 9, 31, 16),
		Block.createCuboidShape(7, 1, 0, 9, 31, 1)
    );

    public Winnn4_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sl3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 6, 10, -6, 10),
		Block.createCuboidShape(6, -16, 7, 9, 32, 9),
		Block.createCuboidShape(5, -16, 5, 11, -15, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 6, 10, -6, 10),
		Block.createCuboidShape(7, -16, 6, 9, 32, 9),
		Block.createCuboidShape(5, -16, 5, 11, -15, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 6, 10, -6, 10),
		Block.createCuboidShape(7, -16, 7, 10, 32, 9),
		Block.createCuboidShape(5, -16, 5, 11, -15, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, -16, 6, 10, -6, 10),
		Block.createCuboidShape(7, -16, 7, 9, 32, 10),
		Block.createCuboidShape(5, -16, 5, 11, -15, 11)
    );

    public Sl3_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 16, 9, 16, 16),
		Block.createCuboidShape(7, 0, 13, 9, 16, 14),
		Block.createCuboidShape(6, 0, 14, 7, 16, 16),
		Block.createCuboidShape(9, 0, 14, 10, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 7, 0, 16, 9),
		Block.createCuboidShape(2, 0, 7, 3, 16, 9),
		Block.createCuboidShape(0, 0, 6, 2, 16, 7),
		Block.createCuboidShape(0, 0, 9, 2, 16, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 0, 9, 16, 0),
		Block.createCuboidShape(7, 0, 2, 9, 16, 3),
		Block.createCuboidShape(9, 0, 0, 10, 16, 2),
		Block.createCuboidShape(6, 0, 0, 7, 16, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 0, 7, 16, 16, 9),
		Block.createCuboidShape(13, 0, 7, 14, 16, 9),
		Block.createCuboidShape(14, 0, 9, 16, 16, 10),
		Block.createCuboidShape(14, 0, 6, 16, 16, 7)
    );

    public Fpipe6_Data() {
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

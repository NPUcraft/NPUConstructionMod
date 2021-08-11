package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 7, 14, 14, 9),
		Block.createCuboidShape(1, 0, 6, 2, 15, 10),
		Block.createCuboidShape(14, 0, 6, 15, 15, 10),
		Block.createCuboidShape(2, 14, 6, 14, 15, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 2, 9, 14, 14),
		Block.createCuboidShape(6, 0, 1, 10, 15, 2),
		Block.createCuboidShape(6, 0, 14, 10, 15, 15),
		Block.createCuboidShape(6, 14, 2, 10, 15, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 0, 7, 14, 14, 9),
		Block.createCuboidShape(14, 0, 6, 15, 15, 10),
		Block.createCuboidShape(1, 0, 6, 2, 15, 10),
		Block.createCuboidShape(2, 14, 6, 14, 15, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 2, 9, 14, 14),
		Block.createCuboidShape(6, 0, 14, 10, 15, 15),
		Block.createCuboidShape(6, 0, 1, 10, 15, 2),
		Block.createCuboidShape(6, 14, 2, 10, 15, 14)
    );

    public Fsign1_Data() {
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

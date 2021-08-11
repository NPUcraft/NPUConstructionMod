package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 4, 6, 15, 6, 10),
		Block.createCuboidShape(1, 25, 6, 15, 27, 10),
		Block.createCuboidShape(1, -16, 6, 15, -15, 10),
		Block.createCuboidShape(15, -16, 6, 16, 32, 10),
		Block.createCuboidShape(0, -16, 6, 1, 32, 10),
		Block.createCuboidShape(1, 5, 7, 2, 26, 9),
		Block.createCuboidShape(14, 5, 7, 15, 26, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, 1, 10, 6, 15),
		Block.createCuboidShape(6, 25, 1, 10, 27, 15),
		Block.createCuboidShape(6, -16, 1, 10, -15, 15),
		Block.createCuboidShape(6, -16, 15, 10, 32, 16),
		Block.createCuboidShape(6, -16, 0, 10, 32, 1),
		Block.createCuboidShape(7, 5, 1, 9, 26, 2),
		Block.createCuboidShape(7, 5, 14, 9, 26, 15)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 4, 6, 15, 6, 10),
		Block.createCuboidShape(1, 25, 6, 15, 27, 10),
		Block.createCuboidShape(1, -16, 6, 15, -15, 10),
		Block.createCuboidShape(0, -16, 6, 1, 32, 10),
		Block.createCuboidShape(15, -16, 6, 16, 32, 10),
		Block.createCuboidShape(14, 5, 7, 15, 26, 9),
		Block.createCuboidShape(1, 5, 7, 2, 26, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 4, 1, 10, 6, 15),
		Block.createCuboidShape(6, 25, 1, 10, 27, 15),
		Block.createCuboidShape(6, -16, 1, 10, -15, 15),
		Block.createCuboidShape(6, -16, 0, 10, 32, 1),
		Block.createCuboidShape(6, -16, 15, 10, 32, 16),
		Block.createCuboidShape(7, 5, 14, 9, 26, 15),
		Block.createCuboidShape(7, 5, 1, 9, 26, 2)
    );

    public Win5_Data() {
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

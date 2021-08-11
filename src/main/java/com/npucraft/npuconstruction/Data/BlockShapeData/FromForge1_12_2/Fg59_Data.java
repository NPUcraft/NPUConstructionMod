package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg59_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 1, 16, 13, 2),
		Block.createCuboidShape(0, 11, 5, 16, 13, 6),
		Block.createCuboidShape(0, 11, 10, 16, 13, 11),
		Block.createCuboidShape(0, 11, 14, 16, 13, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(14, 11, 0, 15, 13, 16),
		Block.createCuboidShape(10, 11, 0, 11, 13, 16),
		Block.createCuboidShape(5, 11, 0, 6, 13, 16),
		Block.createCuboidShape(1, 11, 0, 2, 13, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 14, 16, 13, 15),
		Block.createCuboidShape(0, 11, 10, 16, 13, 11),
		Block.createCuboidShape(0, 11, 5, 16, 13, 6),
		Block.createCuboidShape(0, 11, 1, 16, 13, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 11, 0, 2, 13, 16),
		Block.createCuboidShape(5, 11, 0, 6, 13, 16),
		Block.createCuboidShape(10, 11, 0, 11, 13, 16),
		Block.createCuboidShape(14, 11, 0, 15, 13, 16)
    );

    public Fg59_Data() {
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

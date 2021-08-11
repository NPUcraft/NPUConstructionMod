package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg58_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 3, 0, 16, 16, 8),
		Block.createCuboidShape(0, 16, -1, 16, 16, 8),
		Block.createCuboidShape(0, 0, 0, 16, 3, 8),
		Block.createCuboidShape(0, 0, 8, 16, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(8, 3, 0, 16, 16, 16),
		Block.createCuboidShape(8, 16, 0, 17, 16, 16),
		Block.createCuboidShape(8, 0, 0, 16, 3, 16),
		Block.createCuboidShape(0, 0, 0, 8, 16, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 3, 8, 16, 16, 16),
		Block.createCuboidShape(0, 16, 8, 16, 16, 17),
		Block.createCuboidShape(0, 0, 8, 16, 3, 16),
		Block.createCuboidShape(0, 0, 0, 16, 16, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 3, 0, 8, 16, 16),
		Block.createCuboidShape(-1, 16, 0, 8, 16, 16),
		Block.createCuboidShape(0, 0, 0, 8, 3, 16),
		Block.createCuboidShape(8, 0, 0, 16, 16, 16)
    );

    public Fg58_Data() {
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

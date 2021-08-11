package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Chair_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 3, 4, 12, 15, 5),
		Block.createCuboidShape(4, 0, 4, 4, 16, 11),
		Block.createCuboidShape(12, 0, 4, 12, 16, 11),
		Block.createCuboidShape(4, 0, 11, 12, 7, 12),
		Block.createCuboidShape(4, 7, 5, 12, 7, 13)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(11, 3, 4, 12, 15, 12),
		Block.createCuboidShape(5, 0, 4, 12, 16, 4),
		Block.createCuboidShape(5, 0, 12, 12, 16, 12),
		Block.createCuboidShape(4, 0, 4, 5, 7, 12),
		Block.createCuboidShape(3, 7, 4, 11, 7, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, 3, 11, 12, 15, 12),
		Block.createCuboidShape(12, 0, 5, 12, 16, 12),
		Block.createCuboidShape(4, 0, 5, 4, 16, 12),
		Block.createCuboidShape(4, 0, 4, 12, 7, 5),
		Block.createCuboidShape(4, 7, 3, 12, 7, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 3, 4, 5, 15, 12),
		Block.createCuboidShape(4, 0, 12, 11, 16, 12),
		Block.createCuboidShape(4, 0, 4, 11, 16, 4),
		Block.createCuboidShape(11, 0, 4, 12, 7, 12),
		Block.createCuboidShape(5, 7, 4, 13, 7, 12)
    );

    public Chair_Data() {
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

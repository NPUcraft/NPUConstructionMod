package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Wall10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(9, 3, 0, 15, 4, 16),
		Block.createCuboidShape(1, 3, 0, 7, 4, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 3, 9, 16, 4, 15),
		Block.createCuboidShape(0, 3, 1, 16, 4, 7),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 3, 0, 7, 4, 16),
		Block.createCuboidShape(9, 3, 0, 15, 4, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 3, 1, 16, 4, 7),
		Block.createCuboidShape(0, 3, 9, 16, 4, 15),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );

    public Wall10_Data() {
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

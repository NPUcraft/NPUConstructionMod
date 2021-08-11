package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Tool_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 11, 1, 24, 12, 9),
		Block.createCuboidShape(-8, 11, 10, 24, 12, 15),
		Block.createCuboidShape(-8, 1, 1, 24, 11, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 11, -8, 15, 12, 24),
		Block.createCuboidShape(1, 11, -8, 6, 12, 24),
		Block.createCuboidShape(1, 1, -8, 15, 11, 24)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-8, 11, 7, 24, 12, 15),
		Block.createCuboidShape(-8, 11, 1, 24, 12, 6),
		Block.createCuboidShape(-8, 1, 1, 24, 11, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, 11, -8, 9, 12, 24),
		Block.createCuboidShape(10, 11, -8, 15, 12, 24),
		Block.createCuboidShape(1, 1, -8, 15, 11, 24)
    );

    public Tool_Data() {
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

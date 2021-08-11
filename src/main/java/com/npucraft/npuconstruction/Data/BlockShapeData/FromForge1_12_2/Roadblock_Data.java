package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Roadblock_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 12, 7, 9, 16, 9),
		Block.createCuboidShape(2, 0, 2, 14, 0, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 12, 7, 9, 16, 9),
		Block.createCuboidShape(2, 0, 2, 14, 0, 14)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 12, 7, 9, 16, 9),
		Block.createCuboidShape(2, 0, 2, 14, 0, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 12, 7, 9, 16, 9),
		Block.createCuboidShape(2, 0, 2, 14, 0, 14)
    );

    public Roadblock_Data() {
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

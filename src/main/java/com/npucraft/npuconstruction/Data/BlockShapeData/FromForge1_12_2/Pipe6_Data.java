package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Pipe6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 6, 16, 10, 10),
		Block.createCuboidShape(6, 6, 9, 10, 10, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 6, 0, 10, 10, 16),
		Block.createCuboidShape(0, 6, 6, 7, 10, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 6, 6, 16, 10, 10),
		Block.createCuboidShape(6, 6, 0, 10, 10, 7)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 6, 0, 10, 10, 16),
		Block.createCuboidShape(9, 6, 6, 16, 10, 10)
    );

    public Pipe6_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcamera4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 3, 4, 11, 6, 6),
		Block.createCuboidShape(6, 11, 0, 10, 14, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 3, 5, 12, 6, 11),
		Block.createCuboidShape(0, 11, 6, 16, 14, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 3, 10, 11, 6, 12),
		Block.createCuboidShape(6, 11, 0, 10, 14, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 3, 5, 6, 6, 11),
		Block.createCuboidShape(0, 11, 6, 16, 14, 10)
    );

    public Fcamera4_Data() {
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

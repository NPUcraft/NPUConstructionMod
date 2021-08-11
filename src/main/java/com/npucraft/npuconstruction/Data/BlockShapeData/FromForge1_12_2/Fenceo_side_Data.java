package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fenceo_side_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 1, 9, 27, 3)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(13, -16, 7, 15, 27, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, -16, 13, 9, 27, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, -16, 7, 3, 27, 9)
    );

    public Fenceo_side_Data() {
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

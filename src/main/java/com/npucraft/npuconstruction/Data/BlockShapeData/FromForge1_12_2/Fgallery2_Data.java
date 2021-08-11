package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgallery2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, -2, -4, 10, 4, 20)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-4, -2, 6, 20, 4, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, -2, -4, 10, 4, 20)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-4, -2, 6, 20, 4, 10)
    );

    public Fgallery2_Data() {
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

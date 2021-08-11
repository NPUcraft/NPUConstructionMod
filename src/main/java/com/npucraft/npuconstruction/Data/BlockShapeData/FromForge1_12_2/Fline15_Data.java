package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fline15_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(8, -8, 8, 16, -8, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, -8, 8, 8, -8, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -8, 6, 8, -8, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, -8, 0, 10, -8, 8)
    );

    public Fline15_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Airconin_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-6, 3, 10, 22, 13, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 3, -6, 6, 13, 22)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-6, 3, 0, 22, 13, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(10, 3, -6, 16, 13, 22)
    );

    public Airconin_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fline22_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -8, 0, 32, -8, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -8, -16, 16, -8, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -8, 0, 32, -8, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, -8, -16, 16, -8, 32)
    );

    public Fline22_Data() {
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

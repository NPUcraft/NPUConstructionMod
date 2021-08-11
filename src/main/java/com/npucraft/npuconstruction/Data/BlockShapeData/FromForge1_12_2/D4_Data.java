package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class D4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 31, 5, 32, 32, 11),
		Block.createCuboidShape(-16, -16, 6, 32, -15, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 31, -16, 11, 32, 32),
		Block.createCuboidShape(6, -16, -16, 10, -15, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 31, 5, 32, 32, 11),
		Block.createCuboidShape(-16, -16, 6, 32, -15, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 31, -16, 11, 32, 32),
		Block.createCuboidShape(6, -16, -16, 10, -15, 32)
    );

    public D4_Data() {
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

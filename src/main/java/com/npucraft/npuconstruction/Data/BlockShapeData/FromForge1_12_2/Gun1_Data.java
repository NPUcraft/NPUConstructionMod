package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Gun1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 13, -16, 9, 15, 16),
		Block.createCuboidShape(6, 11, -16, 10, 13, -10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 7, 32, 15, 9),
		Block.createCuboidShape(26, 11, 6, 32, 13, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 13, 0, 9, 15, 32),
		Block.createCuboidShape(6, 11, 26, 10, 13, 32)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-16, 13, 7, 16, 15, 9),
		Block.createCuboidShape(-16, 11, 6, -10, 13, 10)
    );

    public Gun1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Dhall_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, -14, 1, 16, 17, 16),
		Block.createCuboidShape(-16, 17, 1, 16, 24, 16),
		Block.createCuboidShape(-3, 1, 0, 2, 6, 0),
		Block.createCuboidShape(-16, -15, 2, 16, -14, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, -14, -16, 15, 17, 16),
		Block.createCuboidShape(0, 17, -16, 15, 24, 16),
		Block.createCuboidShape(16, 1, -3, 16, 6, 2),
		Block.createCuboidShape(0, -15, -16, 14, -14, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, -14, 0, 32, 17, 15),
		Block.createCuboidShape(0, 17, 0, 32, 24, 15),
		Block.createCuboidShape(14, 1, 16, 19, 6, 16),
		Block.createCuboidShape(0, -15, 0, 32, -14, 14)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(1, -14, 0, 16, 17, 32),
		Block.createCuboidShape(1, 17, 0, 16, 24, 32),
		Block.createCuboidShape(0, 1, 14, 0, 6, 19),
		Block.createCuboidShape(2, -15, 0, 16, -14, 32)
    );

    public Dhall_Data() {
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

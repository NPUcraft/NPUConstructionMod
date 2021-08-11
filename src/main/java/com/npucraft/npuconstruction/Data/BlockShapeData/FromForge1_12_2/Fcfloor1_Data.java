package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcfloor1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -16, 16, 4, 32),
		Block.createCuboidShape(0, 4, 11, 16, 6, 32)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 0, 32, 4, 16),
		Block.createCuboidShape(-16, 4, 0, 5, 6, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -16, 16, 4, 32),
		Block.createCuboidShape(0, 4, -16, 16, 6, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 0, 32, 4, 16),
		Block.createCuboidShape(11, 4, 0, 32, 6, 16)
    );

    public Fcfloor1_Data() {
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

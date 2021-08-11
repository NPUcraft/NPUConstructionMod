package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 6, 10, 11, 10),
		Block.createCuboidShape(6, 11, 6, 10, 16, 10),
		Block.createCuboidShape(6, 0, 6, 10, 0, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 6, 10, 11, 10),
		Block.createCuboidShape(6, 11, 6, 10, 16, 10),
		Block.createCuboidShape(6, 0, 6, 10, 0, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 6, 10, 11, 10),
		Block.createCuboidShape(6, 11, 6, 10, 16, 10),
		Block.createCuboidShape(6, 0, 6, 10, 0, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 1, 6, 10, 11, 10),
		Block.createCuboidShape(6, 11, 6, 10, 16, 10),
		Block.createCuboidShape(6, 0, 6, 10, 0, 10)
    );

    public Light4_Data() {
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

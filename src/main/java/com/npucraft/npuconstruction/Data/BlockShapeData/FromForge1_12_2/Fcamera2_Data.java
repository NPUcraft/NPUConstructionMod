package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcamera2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 0, 10, 14, 16),
		Block.createCuboidShape(7, 17, 5, 10, 18, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 6, 16, 14, 10),
		Block.createCuboidShape(6, 17, 7, 11, 18, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 11, 0, 10, 14, 16),
		Block.createCuboidShape(6, 17, 6, 9, 18, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 11, 6, 16, 14, 10),
		Block.createCuboidShape(5, 17, 6, 10, 18, 9)
    );

    public Fcamera2_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Oak_fence1_side_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 29, 0, 9, 32, 9),
		Block.createCuboidShape(7, 6, 0, 9, 9, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 29, 7, 16, 32, 9),
		Block.createCuboidShape(7, 6, 7, 16, 9, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 29, 7, 9, 32, 16),
		Block.createCuboidShape(7, 6, 7, 9, 9, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 29, 7, 9, 32, 9),
		Block.createCuboidShape(0, 6, 7, 9, 9, 9)
    );

    public Oak_fence1_side_Data() {
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

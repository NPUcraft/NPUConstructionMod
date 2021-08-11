package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Straightaheadsign_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 22, 5, 0, 28, 12),
		Block.createCuboidShape(0, -16, 8, 1, 28, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 22, -1, 11, 28, 0),
		Block.createCuboidShape(7, -16, 0, 8, 28, 1)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(16, 22, 4, 17, 28, 11),
		Block.createCuboidShape(15, -16, 7, 16, 28, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 22, 16, 12, 28, 17),
		Block.createCuboidShape(8, -16, 15, 9, 28, 16)
    );

    public Straightaheadsign_Data() {
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

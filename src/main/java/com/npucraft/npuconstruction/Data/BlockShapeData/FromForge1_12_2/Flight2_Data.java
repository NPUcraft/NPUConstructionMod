package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Flight2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 11, 5, 17, 13, 11),
		Block.createCuboidShape(0, 11, 1, 16, 13, 2),
		Block.createCuboidShape(0, 11, 14, 16, 13, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 11, -1, 11, 13, 17),
		Block.createCuboidShape(14, 11, 0, 15, 13, 16),
		Block.createCuboidShape(1, 11, 0, 2, 13, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, 11, 5, 17, 13, 11),
		Block.createCuboidShape(0, 11, 14, 16, 13, 15),
		Block.createCuboidShape(0, 11, 1, 16, 13, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 11, -1, 11, 13, 17),
		Block.createCuboidShape(1, 11, 0, 2, 13, 16),
		Block.createCuboidShape(14, 11, 0, 15, 13, 16)
    );

    public Flight2_Data() {
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

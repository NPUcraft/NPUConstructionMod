package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Flight7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(7, 10, -16, 9, 12, 6),
		Block.createCuboidShape(7, 6, 1, 9, 9, 6)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(10, 10, 7, 32, 12, 9),
		Block.createCuboidShape(10, 6, 7, 15, 9, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(7, 10, 10, 9, 12, 32),
		Block.createCuboidShape(7, 6, 10, 9, 9, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 6, 10, 16, 10),
		Block.createCuboidShape(-16, 10, 7, 6, 12, 9),
		Block.createCuboidShape(1, 6, 7, 6, 9, 9)
    );

    public Flight7_Data() {
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

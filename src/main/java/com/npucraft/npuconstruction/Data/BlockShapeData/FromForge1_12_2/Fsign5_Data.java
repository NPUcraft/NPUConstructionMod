package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -4, 7, 13, 15, 7),
		Block.createCuboidShape(0, -9, 6, 16, 20, 7),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, -4, 3, 9, 15, 13),
		Block.createCuboidShape(9, -9, 0, 10, 20, 16),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, -4, 9, 13, 15, 9),
		Block.createCuboidShape(0, -9, 9, 16, 20, 10),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -4, 3, 7, 15, 13),
		Block.createCuboidShape(6, -9, 0, 7, 20, 16),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );

    public Fsign5_Data() {
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

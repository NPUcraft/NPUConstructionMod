package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -1, 7, 13, 14, 7),
		Block.createCuboidShape(1, -6, 6, 15, 19, 7),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, -1, 3, 9, 14, 13),
		Block.createCuboidShape(9, -6, 1, 10, 19, 15),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, -1, 9, 13, 14, 9),
		Block.createCuboidShape(1, -6, 9, 15, 19, 10),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -1, 3, 7, 14, 13),
		Block.createCuboidShape(6, -6, 1, 7, 19, 15),
		Block.createCuboidShape(7, 0, 7, 9, 16, 9)
    );

    public Fsign4_Data() {
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

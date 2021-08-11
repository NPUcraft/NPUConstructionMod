package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -4, 7, 13, 26, 7),
		Block.createCuboidShape(0, -10, 6, 16, 32, 7),
		Block.createCuboidShape(7, 0, 7, 9, 26, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(9, -4, 3, 9, 26, 13),
		Block.createCuboidShape(9, -10, 0, 10, 32, 16),
		Block.createCuboidShape(7, 0, 7, 9, 26, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, -4, 9, 13, 26, 9),
		Block.createCuboidShape(0, -10, 9, 16, 32, 10),
		Block.createCuboidShape(7, 0, 7, 9, 26, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, -4, 3, 7, 26, 13),
		Block.createCuboidShape(6, -10, 0, 7, 32, 16),
		Block.createCuboidShape(7, 0, 7, 9, 26, 9)
    );

    public Fsign6_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Stair4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -1, 16, 4, 16),
		Block.createCuboidShape(0, 4, 3, 16, 8, 16),
		Block.createCuboidShape(0, 8, 7, 16, 12, 16),
		Block.createCuboidShape(0, 12, 12, 16, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 17, 4, 16),
		Block.createCuboidShape(0, 4, 0, 13, 8, 16),
		Block.createCuboidShape(0, 8, 0, 9, 12, 16),
		Block.createCuboidShape(0, 12, 0, 4, 16, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 4, 17),
		Block.createCuboidShape(0, 4, 0, 16, 8, 13),
		Block.createCuboidShape(0, 8, 0, 16, 12, 9),
		Block.createCuboidShape(0, 12, 0, 16, 16, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 0, 16, 4, 16),
		Block.createCuboidShape(3, 4, 0, 16, 8, 16),
		Block.createCuboidShape(7, 8, 0, 16, 12, 16),
		Block.createCuboidShape(12, 12, 0, 16, 16, 16)
    );

    public Stair4_Data() {
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

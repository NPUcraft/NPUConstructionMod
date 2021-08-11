package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Testblock_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, -16, 0, 17, 0, 12),
		Block.createCuboidShape(0, 0, 4, 12, 16, 16),
		Block.createCuboidShape(4, 16, 0, 16, 32, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, -16, 5, 16, 0, 17),
		Block.createCuboidShape(0, 0, 0, 12, 16, 12),
		Block.createCuboidShape(4, 16, 4, 16, 32, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-1, -16, 4, 11, 0, 16),
		Block.createCuboidShape(4, 0, 0, 16, 16, 12),
		Block.createCuboidShape(0, 16, 4, 12, 32, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, -16, -1, 12, 0, 11),
		Block.createCuboidShape(4, 0, 4, 16, 16, 16),
		Block.createCuboidShape(0, 16, 0, 12, 32, 12)
    );

    public Testblock_Data() {
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

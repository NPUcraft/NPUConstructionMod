package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fpipe3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(13, 2, 0, 14, 11, 16),
		Block.createCuboidShape(2, 2, 0, 3, 11, 16),
		Block.createCuboidShape(3, 10, 0, 13, 11, 16),
		Block.createCuboidShape(3, 2, 0, 13, 3, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 13, 16, 11, 14),
		Block.createCuboidShape(0, 2, 2, 16, 11, 3),
		Block.createCuboidShape(0, 10, 3, 16, 11, 13),
		Block.createCuboidShape(0, 2, 3, 16, 3, 13)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(2, 2, 0, 3, 11, 16),
		Block.createCuboidShape(13, 2, 0, 14, 11, 16),
		Block.createCuboidShape(3, 10, 0, 13, 11, 16),
		Block.createCuboidShape(3, 2, 0, 13, 3, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 2, 2, 16, 11, 3),
		Block.createCuboidShape(0, 2, 13, 16, 11, 14),
		Block.createCuboidShape(0, 10, 3, 16, 11, 13),
		Block.createCuboidShape(0, 2, 3, 16, 3, 13)
    );

    public Fpipe3_Data() {
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

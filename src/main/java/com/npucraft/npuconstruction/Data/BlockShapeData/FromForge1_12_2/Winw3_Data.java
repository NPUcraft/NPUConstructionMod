package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winw3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(0, 3, 0, 3, 13, 16),
		Block.createCuboidShape(13, 3, 0, 16, 13, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(0, 3, 0, 16, 13, 3),
		Block.createCuboidShape(0, 3, 13, 16, 13, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(13, 3, 0, 16, 13, 16),
		Block.createCuboidShape(0, 3, 0, 3, 13, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(0, 3, 13, 16, 13, 16),
		Block.createCuboidShape(0, 3, 0, 16, 13, 3),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );

    public Winw3_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fg66_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, -1, 16, 12, 16),
		Block.createCuboidShape(0, 12, 7, 9, 16, 16),
		Block.createCuboidShape(16, 12, -1, 17, 12, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 17, 12, 16),
		Block.createCuboidShape(0, 12, 0, 9, 16, 9),
		Block.createCuboidShape(0, 12, 16, 17, 12, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 0, 16, 12, 17),
		Block.createCuboidShape(7, 12, 0, 16, 16, 9),
		Block.createCuboidShape(-1, 12, 0, 0, 12, 17)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 0, 16, 12, 16),
		Block.createCuboidShape(7, 12, 7, 16, 16, 16),
		Block.createCuboidShape(-1, 12, -1, 16, 12, 0)
    );

    public Fg66_Data() {
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

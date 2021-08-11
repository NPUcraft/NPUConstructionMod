package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fwindow3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 16, 10, 1, 17),
		Block.createCuboidShape(0, 15, 16, 10, 16, 17),
		Block.createCuboidShape(0, 1, 16, 1, 15, 17),
		Block.createCuboidShape(9, 1, 16, 10, 15, 17),
		Block.createCuboidShape(1, 1, 16, 9, 15, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-1, 0, 0, 0, 1, 10),
		Block.createCuboidShape(-1, 15, 0, 0, 16, 10),
		Block.createCuboidShape(-1, 1, 0, 0, 15, 1),
		Block.createCuboidShape(-1, 1, 9, 0, 15, 10),
		Block.createCuboidShape(-1, 1, 1, 0, 15, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, -1, 16, 1, 0),
		Block.createCuboidShape(6, 15, -1, 16, 16, 0),
		Block.createCuboidShape(15, 1, -1, 16, 15, 0),
		Block.createCuboidShape(6, 1, -1, 7, 15, 0),
		Block.createCuboidShape(7, 1, -1, 15, 15, 0)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(16, 0, 6, 17, 1, 16),
		Block.createCuboidShape(16, 15, 6, 17, 16, 16),
		Block.createCuboidShape(16, 1, 15, 17, 15, 16),
		Block.createCuboidShape(16, 1, 6, 17, 15, 7),
		Block.createCuboidShape(16, 1, 7, 17, 15, 15)
    );

    public Fwindow3_Data() {
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

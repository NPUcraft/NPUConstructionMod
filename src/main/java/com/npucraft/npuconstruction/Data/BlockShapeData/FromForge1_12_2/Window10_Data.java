package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Window10_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(17, 5, 6, 19, 27, 10),
		Block.createCuboidShape(-3, 5, 6, -1, 27, 10),
		Block.createCuboidShape(-1, 6, 6, 17, 7, 10),
		Block.createCuboidShape(-1, 25, 6, 17, 26, 10),
		Block.createCuboidShape(-16, 27, 0, 32, 32, 16),
		Block.createCuboidShape(-16, 0, 0, 32, 5, 16),
		Block.createCuboidShape(19, 5, 0, 32, 27, 16),
		Block.createCuboidShape(-16, 5, 0, -3, 27, 16),
		Block.createCuboidShape(-2, 5, 6, 18, 6, 10),
		Block.createCuboidShape(8, 6, 6, 9, 26, 8),
		Block.createCuboidShape(7, 6, 8, 8, 26, 10),
		Block.createCuboidShape(-2, 26, 6, 18, 27, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 5, 17, 10, 27, 19),
		Block.createCuboidShape(6, 5, -3, 10, 27, -1),
		Block.createCuboidShape(6, 6, -1, 10, 7, 17),
		Block.createCuboidShape(6, 25, -1, 10, 26, 17),
		Block.createCuboidShape(0, 27, -16, 16, 32, 32),
		Block.createCuboidShape(0, 0, -16, 16, 5, 32),
		Block.createCuboidShape(0, 5, 19, 16, 27, 32),
		Block.createCuboidShape(0, 5, -16, 16, 27, -3),
		Block.createCuboidShape(6, 5, -2, 10, 6, 18),
		Block.createCuboidShape(8, 6, 8, 10, 26, 9),
		Block.createCuboidShape(6, 6, 7, 8, 26, 8),
		Block.createCuboidShape(6, 26, -2, 10, 27, 18)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 5, 6, -1, 27, 10),
		Block.createCuboidShape(17, 5, 6, 19, 27, 10),
		Block.createCuboidShape(-1, 6, 6, 17, 7, 10),
		Block.createCuboidShape(-1, 25, 6, 17, 26, 10),
		Block.createCuboidShape(-16, 27, 0, 32, 32, 16),
		Block.createCuboidShape(-16, 0, 0, 32, 5, 16),
		Block.createCuboidShape(-16, 5, 0, -3, 27, 16),
		Block.createCuboidShape(19, 5, 0, 32, 27, 16),
		Block.createCuboidShape(-2, 5, 6, 18, 6, 10),
		Block.createCuboidShape(7, 6, 8, 8, 26, 10),
		Block.createCuboidShape(8, 6, 6, 9, 26, 8),
		Block.createCuboidShape(-2, 26, 6, 18, 27, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 5, -3, 10, 27, -1),
		Block.createCuboidShape(6, 5, 17, 10, 27, 19),
		Block.createCuboidShape(6, 6, -1, 10, 7, 17),
		Block.createCuboidShape(6, 25, -1, 10, 26, 17),
		Block.createCuboidShape(0, 27, -16, 16, 32, 32),
		Block.createCuboidShape(0, 0, -16, 16, 5, 32),
		Block.createCuboidShape(0, 5, -16, 16, 27, -3),
		Block.createCuboidShape(0, 5, 19, 16, 27, 32),
		Block.createCuboidShape(6, 5, -2, 10, 6, 18),
		Block.createCuboidShape(6, 6, 7, 8, 26, 8),
		Block.createCuboidShape(8, 6, 8, 10, 26, 9),
		Block.createCuboidShape(6, 26, -2, 10, 27, 18)
    );

    public Window10_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(9, 5, 6, 11, 27, 10),
		Block.createCuboidShape(-11, 5, 6, -9, 27, 10),
		Block.createCuboidShape(-9, 6, 6, 9, 7, 10),
		Block.createCuboidShape(-9, 25, 6, 9, 26, 10),
		Block.createCuboidShape(-16, 0, 0, 16, 5, 16),
		Block.createCuboidShape(11, 5, 0, 16, 27, 16),
		Block.createCuboidShape(-16, 5, 0, -11, 27, 16),
		Block.createCuboidShape(-16, 27, 0, 16, 32, 16),
		Block.createCuboidShape(-10, 5, 6, 10, 6, 10),
		Block.createCuboidShape(0, 6, 6, 1, 26, 8),
		Block.createCuboidShape(-1, 6, 8, 0, 26, 10),
		Block.createCuboidShape(-10, 26, 6, 10, 27, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 5, 9, 10, 27, 11),
		Block.createCuboidShape(6, 5, -11, 10, 27, -9),
		Block.createCuboidShape(6, 6, -9, 10, 7, 9),
		Block.createCuboidShape(6, 25, -9, 10, 26, 9),
		Block.createCuboidShape(0, 0, -16, 16, 5, 16),
		Block.createCuboidShape(0, 5, 11, 16, 27, 16),
		Block.createCuboidShape(0, 5, -16, 16, 27, -11),
		Block.createCuboidShape(0, 27, -16, 16, 32, 16),
		Block.createCuboidShape(6, 5, -10, 10, 6, 10),
		Block.createCuboidShape(8, 6, 0, 10, 26, 1),
		Block.createCuboidShape(6, 6, -1, 8, 26, 0),
		Block.createCuboidShape(6, 26, -10, 10, 27, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 5, 6, 7, 27, 10),
		Block.createCuboidShape(25, 5, 6, 27, 27, 10),
		Block.createCuboidShape(7, 6, 6, 25, 7, 10),
		Block.createCuboidShape(7, 25, 6, 25, 26, 10),
		Block.createCuboidShape(0, 0, 0, 32, 5, 16),
		Block.createCuboidShape(0, 5, 0, 5, 27, 16),
		Block.createCuboidShape(27, 5, 0, 32, 27, 16),
		Block.createCuboidShape(0, 27, 0, 32, 32, 16),
		Block.createCuboidShape(6, 5, 6, 26, 6, 10),
		Block.createCuboidShape(15, 6, 8, 16, 26, 10),
		Block.createCuboidShape(16, 6, 6, 17, 26, 8),
		Block.createCuboidShape(6, 26, 6, 26, 27, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 5, 5, 10, 27, 7),
		Block.createCuboidShape(6, 5, 25, 10, 27, 27),
		Block.createCuboidShape(6, 6, 7, 10, 7, 25),
		Block.createCuboidShape(6, 25, 7, 10, 26, 25),
		Block.createCuboidShape(0, 0, 0, 16, 5, 32),
		Block.createCuboidShape(0, 5, 0, 16, 27, 5),
		Block.createCuboidShape(0, 5, 27, 16, 27, 32),
		Block.createCuboidShape(0, 27, 0, 16, 32, 32),
		Block.createCuboidShape(6, 5, 6, 10, 6, 26),
		Block.createCuboidShape(6, 6, 15, 8, 26, 16),
		Block.createCuboidShape(8, 6, 16, 10, 26, 17),
		Block.createCuboidShape(6, 26, 6, 10, 27, 26)
    );

    public Win8_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fnorthhall5_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 9, 6, -7, 16, 9),
		Block.createCuboidShape(23, 9, 6, 32, 16, 9),
		Block.createCuboidShape(-16, 8, 3, 32, 9, 9),
		Block.createCuboidShape(-16, 0, 0, 32, 6, 1),
		Block.createCuboidShape(-16, 0, 1, -16, 8, 7),
		Block.createCuboidShape(32, 0, 1, 32, 8, 7),
		Block.createCuboidShape(-16, 6, 1, 32, 7, 2),
		Block.createCuboidShape(-16, 7, 2, 32, 8, 3),
		Block.createCuboidShape(-16, 0, 7, -15, 16, 10),
		Block.createCuboidShape(31, 0, 7, 32, 16, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 9, -16, 10, 16, -7),
		Block.createCuboidShape(7, 9, 23, 10, 16, 32),
		Block.createCuboidShape(7, 8, -16, 13, 9, 32),
		Block.createCuboidShape(15, 0, -16, 16, 6, 32),
		Block.createCuboidShape(9, 0, -16, 15, 8, -16),
		Block.createCuboidShape(9, 0, 32, 15, 8, 32),
		Block.createCuboidShape(14, 6, -16, 15, 7, 32),
		Block.createCuboidShape(13, 7, -16, 14, 8, 32),
		Block.createCuboidShape(6, 0, -16, 9, 16, -15),
		Block.createCuboidShape(6, 0, 31, 9, 16, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(23, 9, 7, 32, 16, 10),
		Block.createCuboidShape(-16, 9, 7, -7, 16, 10),
		Block.createCuboidShape(-16, 8, 7, 32, 9, 13),
		Block.createCuboidShape(-16, 0, 15, 32, 6, 16),
		Block.createCuboidShape(32, 0, 9, 32, 8, 15),
		Block.createCuboidShape(-16, 0, 9, -16, 8, 15),
		Block.createCuboidShape(-16, 6, 14, 32, 7, 15),
		Block.createCuboidShape(-16, 7, 13, 32, 8, 14),
		Block.createCuboidShape(31, 0, 6, 32, 16, 9),
		Block.createCuboidShape(-16, 0, 6, -15, 16, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 9, 23, 9, 16, 32),
		Block.createCuboidShape(6, 9, -16, 9, 16, -7),
		Block.createCuboidShape(3, 8, -16, 9, 9, 32),
		Block.createCuboidShape(0, 0, -16, 1, 6, 32),
		Block.createCuboidShape(1, 0, 32, 7, 8, 32),
		Block.createCuboidShape(1, 0, -16, 7, 8, -16),
		Block.createCuboidShape(1, 6, -16, 2, 7, 32),
		Block.createCuboidShape(2, 7, -16, 3, 8, 32),
		Block.createCuboidShape(7, 0, 31, 10, 16, 32),
		Block.createCuboidShape(7, 0, -16, 10, 16, -15)
    );

    public Fnorthhall5_Data() {
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

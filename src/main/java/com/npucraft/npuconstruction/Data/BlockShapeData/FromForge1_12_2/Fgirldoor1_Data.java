package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirldoor1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 10, 6, 29, 12, 10),
		Block.createCuboidShape(28, 0, 6, 30, 12, 10),
		Block.createCuboidShape(2, 0, 6, 4, 12, 10),
		Block.createCuboidShape(2, 12, 0, 30, 16, 16),
		Block.createCuboidShape(30, 0, 0, 32, 16, 16),
		Block.createCuboidShape(15, 0, 7, 17, 10, 9),
		Block.createCuboidShape(0, 0, 0, 2, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 10, 3, 10, 12, 29),
		Block.createCuboidShape(6, 0, 28, 10, 12, 30),
		Block.createCuboidShape(6, 0, 2, 10, 12, 4),
		Block.createCuboidShape(0, 12, 2, 16, 16, 30),
		Block.createCuboidShape(0, 0, 30, 16, 16, 32),
		Block.createCuboidShape(7, 0, 15, 9, 10, 17),
		Block.createCuboidShape(0, 0, 0, 16, 16, 2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-13, 10, 6, 13, 12, 10),
		Block.createCuboidShape(-14, 0, 6, -12, 12, 10),
		Block.createCuboidShape(12, 0, 6, 14, 12, 10),
		Block.createCuboidShape(-14, 12, 0, 14, 16, 16),
		Block.createCuboidShape(-16, 0, 0, -14, 16, 16),
		Block.createCuboidShape(-1, 0, 7, 1, 10, 9),
		Block.createCuboidShape(14, 0, 0, 16, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 10, -13, 10, 12, 13),
		Block.createCuboidShape(6, 0, -14, 10, 12, -12),
		Block.createCuboidShape(6, 0, 12, 10, 12, 14),
		Block.createCuboidShape(0, 12, -14, 16, 16, 14),
		Block.createCuboidShape(0, 0, -16, 16, 16, -14),
		Block.createCuboidShape(7, 0, -1, 9, 10, 1),
		Block.createCuboidShape(0, 0, 14, 16, 16, 16)
    );

    public Fgirldoor1_Data() {
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

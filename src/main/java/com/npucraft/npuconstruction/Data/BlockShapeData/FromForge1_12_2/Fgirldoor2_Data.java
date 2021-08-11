package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirldoor2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, -16, 9, 1, 32, 13),
		Block.createCuboidShape(15, -16, 9, 16, 32, 13),
		Block.createCuboidShape(14, -16, 10, 15, 32, 12),
		Block.createCuboidShape(2, 27, 10, 14, 28, 12),
		Block.createCuboidShape(7, 28, 10, 9, 32, 12),
		Block.createCuboidShape(1, -16, 10, 2, 32, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, -16, 0, 7, 32, 1),
		Block.createCuboidShape(3, -16, 15, 7, 32, 16),
		Block.createCuboidShape(4, -16, 14, 6, 32, 15),
		Block.createCuboidShape(4, 27, 2, 6, 28, 14),
		Block.createCuboidShape(4, 28, 7, 6, 32, 9),
		Block.createCuboidShape(4, -16, 1, 6, 32, 2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(15, -16, 3, 16, 32, 7),
		Block.createCuboidShape(0, -16, 3, 1, 32, 7),
		Block.createCuboidShape(1, -16, 4, 2, 32, 6),
		Block.createCuboidShape(2, 27, 4, 14, 28, 6),
		Block.createCuboidShape(7, 28, 4, 9, 32, 6),
		Block.createCuboidShape(14, -16, 4, 15, 32, 6)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, -16, 15, 13, 32, 16),
		Block.createCuboidShape(9, -16, 0, 13, 32, 1),
		Block.createCuboidShape(10, -16, 1, 12, 32, 2),
		Block.createCuboidShape(10, 27, 2, 12, 28, 14),
		Block.createCuboidShape(10, 28, 7, 12, 32, 9),
		Block.createCuboidShape(10, -16, 14, 12, 32, 15)
    );

    public Fgirldoor2_Data() {
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

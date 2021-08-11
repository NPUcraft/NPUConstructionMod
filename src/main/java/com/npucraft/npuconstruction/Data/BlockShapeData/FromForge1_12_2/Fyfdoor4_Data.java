package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fyfdoor4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 10, 9, 19, 12, 13),
		Block.createCuboidShape(18, 0, 9, 20, 12, 13),
		Block.createCuboidShape(-4, 0, 9, -2, 12, 13),
		Block.createCuboidShape(-2, 0, 11, 18, 10, 12),
		Block.createCuboidShape(-4, 12, 6, 20, 16, 16),
		Block.createCuboidShape(20, 0, 6, 32, 16, 16),
		Block.createCuboidShape(-16, 0, 6, -4, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 10, -3, 7, 12, 19),
		Block.createCuboidShape(3, 0, 18, 7, 12, 20),
		Block.createCuboidShape(3, 0, -4, 7, 12, -2),
		Block.createCuboidShape(4, 0, -2, 5, 10, 18),
		Block.createCuboidShape(0, 12, -4, 10, 16, 20),
		Block.createCuboidShape(0, 0, 20, 10, 16, 32),
		Block.createCuboidShape(0, 0, -16, 10, 16, -4)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-3, 10, 3, 19, 12, 7),
		Block.createCuboidShape(-4, 0, 3, -2, 12, 7),
		Block.createCuboidShape(18, 0, 3, 20, 12, 7),
		Block.createCuboidShape(-2, 0, 4, 18, 10, 5),
		Block.createCuboidShape(-4, 12, 0, 20, 16, 10),
		Block.createCuboidShape(-16, 0, 0, -4, 16, 10),
		Block.createCuboidShape(20, 0, 0, 32, 16, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, 10, -3, 13, 12, 19),
		Block.createCuboidShape(9, 0, -4, 13, 12, -2),
		Block.createCuboidShape(9, 0, 18, 13, 12, 20),
		Block.createCuboidShape(11, 0, -2, 12, 10, 18),
		Block.createCuboidShape(6, 12, -4, 16, 16, 20),
		Block.createCuboidShape(6, 0, -16, 16, 16, -4),
		Block.createCuboidShape(6, 0, 20, 16, 16, 32)
    );

    public Fyfdoor4_Data() {
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

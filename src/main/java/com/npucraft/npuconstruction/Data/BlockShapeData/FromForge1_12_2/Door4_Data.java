package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 10, 6, 21, 12, 10),
		Block.createCuboidShape(20, 0, 6, 22, 12, 10),
		Block.createCuboidShape(-6, 0, 6, -4, 12, 10),
		Block.createCuboidShape(-6, 12, 0, 22, 16, 16),
		Block.createCuboidShape(-16, 0, 0, -6, 16, 16),
		Block.createCuboidShape(22, 0, 0, 32, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 10, -5, 10, 12, 21),
		Block.createCuboidShape(6, 0, 20, 10, 12, 22),
		Block.createCuboidShape(6, 0, -6, 10, 12, -4),
		Block.createCuboidShape(0, 12, -6, 16, 16, 22),
		Block.createCuboidShape(0, 0, -16, 16, 16, -6),
		Block.createCuboidShape(0, 0, 22, 16, 16, 32)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-5, 10, 6, 21, 12, 10),
		Block.createCuboidShape(-6, 0, 6, -4, 12, 10),
		Block.createCuboidShape(20, 0, 6, 22, 12, 10),
		Block.createCuboidShape(-6, 12, 0, 22, 16, 16),
		Block.createCuboidShape(22, 0, 0, 32, 16, 16),
		Block.createCuboidShape(-16, 0, 0, -6, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 10, -5, 10, 12, 21),
		Block.createCuboidShape(6, 0, -6, 10, 12, -4),
		Block.createCuboidShape(6, 0, 20, 10, 12, 22),
		Block.createCuboidShape(0, 12, -6, 16, 16, 22),
		Block.createCuboidShape(0, 0, 22, 16, 16, 32),
		Block.createCuboidShape(0, 0, -16, 16, 16, -6)
    );

    public Door4_Data() {
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

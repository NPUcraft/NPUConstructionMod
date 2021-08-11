package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 14, 12, 4, 15, 20),
		Block.createCuboidShape(-2, 14, 10, 2, 16, 12),
		Block.createCuboidShape(-2, 14, 20, 2, 16, 22),
		Block.createCuboidShape(-6, 14, 14, -4, 16, 18),
		Block.createCuboidShape(4, 14, 14, 6, 16, 18)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-4, 14, -4, 4, 15, 4),
		Block.createCuboidShape(4, 14, -2, 6, 16, 2),
		Block.createCuboidShape(-6, 14, -2, -4, 16, 2),
		Block.createCuboidShape(-2, 14, -6, 2, 16, -4),
		Block.createCuboidShape(-2, 14, 4, 2, 16, 6)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(12, 14, -4, 20, 15, 4),
		Block.createCuboidShape(14, 14, 4, 18, 16, 6),
		Block.createCuboidShape(14, 14, -6, 18, 16, -4),
		Block.createCuboidShape(20, 14, -2, 22, 16, 2),
		Block.createCuboidShape(10, 14, -2, 12, 16, 2)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(12, 14, 12, 20, 15, 20),
		Block.createCuboidShape(10, 14, 14, 12, 16, 18),
		Block.createCuboidShape(20, 14, 14, 22, 16, 18),
		Block.createCuboidShape(14, 14, 20, 18, 16, 22),
		Block.createCuboidShape(14, 14, 10, 18, 16, 12)
    );

    public Light6_Data() {
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

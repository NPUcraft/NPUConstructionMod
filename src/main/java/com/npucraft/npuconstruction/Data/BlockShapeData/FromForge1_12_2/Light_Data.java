package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 4, 12, 15, 12),
		Block.createCuboidShape(6, 14, 2, 10, 16, 4),
		Block.createCuboidShape(2, 14, 6, 4, 16, 10),
		Block.createCuboidShape(12, 14, 6, 14, 16, 10),
		Block.createCuboidShape(6, 14, 12, 10, 16, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 4, 12, 15, 12),
		Block.createCuboidShape(12, 14, 6, 14, 16, 10),
		Block.createCuboidShape(6, 14, 2, 10, 16, 4),
		Block.createCuboidShape(6, 14, 12, 10, 16, 14),
		Block.createCuboidShape(2, 14, 6, 4, 16, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 4, 12, 15, 12),
		Block.createCuboidShape(6, 14, 12, 10, 16, 14),
		Block.createCuboidShape(12, 14, 6, 14, 16, 10),
		Block.createCuboidShape(2, 14, 6, 4, 16, 10),
		Block.createCuboidShape(6, 14, 2, 10, 16, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 4, 12, 15, 12),
		Block.createCuboidShape(2, 14, 6, 4, 16, 10),
		Block.createCuboidShape(6, 14, 12, 10, 16, 14),
		Block.createCuboidShape(6, 14, 2, 10, 16, 4),
		Block.createCuboidShape(12, 14, 6, 14, 16, 10)
    );

    public Light_Data() {
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

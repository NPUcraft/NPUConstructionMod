package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fstation2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(11, 0, 6, 13, 16, 10),
		Block.createCuboidShape(8, 5, 5, 14, 6, 11),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 11, 10, 16, 13),
		Block.createCuboidShape(5, 5, 8, 11, 6, 14),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 0, 6, 5, 16, 10),
		Block.createCuboidShape(2, 5, 5, 8, 6, 11),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 3, 10, 16, 5),
		Block.createCuboidShape(5, 5, 2, 11, 6, 8),
		Block.createCuboidShape(6, 0, 6, 10, 16, 10)
    );

    public Fstation2_Data() {
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

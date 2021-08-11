package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Plant1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(-1, 6, 8, 18, 32, 8),
		Block.createCuboidShape(8, 6, -1, 8, 32, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(8, 6, -1, 8, 32, 18),
		Block.createCuboidShape(-1, 6, 8, 17, 32, 8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(-2, 6, 8, 17, 32, 8),
		Block.createCuboidShape(8, 6, -1, 8, 32, 17)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(8, 6, -2, 8, 32, 17),
		Block.createCuboidShape(-1, 6, 8, 17, 32, 8)
    );

    public Plant1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Plant_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(-2, 6, 8, 19, 29, 8),
		Block.createCuboidShape(8, 6, -2, 8, 29, 18)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(8, 6, -2, 8, 29, 19),
		Block.createCuboidShape(-2, 6, 8, 18, 29, 8)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(-3, 6, 8, 18, 29, 8),
		Block.createCuboidShape(8, 6, -2, 8, 29, 18)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 5, 11, 7, 11),
		Block.createCuboidShape(8, 6, -3, 8, 29, 18),
		Block.createCuboidShape(-2, 6, 8, 18, 29, 8)
    );

    public Plant_Data() {
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

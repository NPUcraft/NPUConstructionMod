package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fenceo_inventory_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 0, 10, 32, 4),
		Block.createCuboidShape(6, 0, 12, 10, 32, 16),
		Block.createCuboidShape(7, 30, -2, 9, 32, 18),
		Block.createCuboidShape(7, 5, -2, 9, 7, 18)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(12, 0, 6, 16, 32, 10),
		Block.createCuboidShape(0, 0, 6, 4, 32, 10),
		Block.createCuboidShape(-2, 30, 7, 18, 32, 9),
		Block.createCuboidShape(-2, 5, 7, 18, 7, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 0, 12, 10, 32, 16),
		Block.createCuboidShape(6, 0, 0, 10, 32, 4),
		Block.createCuboidShape(7, 30, -2, 9, 32, 18),
		Block.createCuboidShape(7, 5, -2, 9, 7, 18)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 0, 6, 4, 32, 10),
		Block.createCuboidShape(12, 0, 6, 16, 32, 10),
		Block.createCuboidShape(-2, 30, 7, 18, 32, 9),
		Block.createCuboidShape(-2, 5, 7, 18, 7, 9)
    );

    public Fenceo_inventory_Data() {
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

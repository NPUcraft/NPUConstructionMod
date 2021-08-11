package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Win3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(31, 0, 5, 32, 16, 11),
		Block.createCuboidShape(-16, 0, 5, -15, 16, 11),
		Block.createCuboidShape(7, 0, 7, 9, 15, 9),
		Block.createCuboidShape(-15, 15, 5, 31, 16, 11)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, 31, 11, 16, 32),
		Block.createCuboidShape(5, 0, -16, 11, 16, -15),
		Block.createCuboidShape(7, 0, 7, 9, 15, 9),
		Block.createCuboidShape(5, 15, -15, 11, 16, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 5, -15, 16, 11),
		Block.createCuboidShape(31, 0, 5, 32, 16, 11),
		Block.createCuboidShape(7, 0, 7, 9, 15, 9),
		Block.createCuboidShape(-15, 15, 5, 31, 16, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 0, -16, 11, 16, -15),
		Block.createCuboidShape(5, 0, 31, 11, 16, 32),
		Block.createCuboidShape(7, 0, 7, 9, 15, 9),
		Block.createCuboidShape(5, 15, -15, 11, 16, 31)
    );

    public Win3_Data() {
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

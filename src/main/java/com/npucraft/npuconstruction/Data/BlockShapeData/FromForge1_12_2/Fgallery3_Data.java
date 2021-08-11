package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgallery3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-12, 10, 6, 5, 16, 10),
		Block.createCuboidShape(11, 10, 6, 28, 16, 10),
		Block.createCuboidShape(5, 0, 5, 11, 16, 11),
		Block.createCuboidShape(0, 1, 7, 16, 5, 9),
		Block.createCuboidShape(6, 10, 11, 10, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 10, -12, 10, 16, 5),
		Block.createCuboidShape(6, 10, 11, 10, 16, 28),
		Block.createCuboidShape(5, 0, 5, 11, 16, 11),
		Block.createCuboidShape(7, 1, 0, 9, 5, 16),
		Block.createCuboidShape(0, 10, 6, 5, 16, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(11, 10, 6, 28, 16, 10),
		Block.createCuboidShape(-12, 10, 6, 5, 16, 10),
		Block.createCuboidShape(5, 0, 5, 11, 16, 11),
		Block.createCuboidShape(0, 1, 7, 16, 5, 9),
		Block.createCuboidShape(6, 10, 0, 10, 16, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 10, 11, 10, 16, 28),
		Block.createCuboidShape(6, 10, -12, 10, 16, 5),
		Block.createCuboidShape(5, 0, 5, 11, 16, 11),
		Block.createCuboidShape(7, 1, 0, 9, 5, 16),
		Block.createCuboidShape(11, 10, 6, 16, 16, 10)
    );

    public Fgallery3_Data() {
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

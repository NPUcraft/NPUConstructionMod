package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fsign7_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(29, 0, 7, 31, 28, 9),
		Block.createCuboidShape(-15, 0, 7, -13, 28, 9),
		Block.createCuboidShape(-14, 0, 7, 30, 1, 9),
		Block.createCuboidShape(-14, 27, 7, 30, 28, 9),
		Block.createCuboidShape(-13, 1, 7, 29, 27, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 29, 9, 28, 31),
		Block.createCuboidShape(7, 0, -15, 9, 28, -13),
		Block.createCuboidShape(7, 0, -14, 9, 1, 30),
		Block.createCuboidShape(7, 27, -14, 9, 28, 30),
		Block.createCuboidShape(7, 1, -13, 9, 27, 29)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-15, 0, 7, -13, 28, 9),
		Block.createCuboidShape(29, 0, 7, 31, 28, 9),
		Block.createCuboidShape(-14, 0, 7, 30, 1, 9),
		Block.createCuboidShape(-14, 27, 7, 30, 28, 9),
		Block.createCuboidShape(-13, 1, 7, 29, 27, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, -15, 9, 28, -13),
		Block.createCuboidShape(7, 0, 29, 9, 28, 31),
		Block.createCuboidShape(7, 0, -14, 9, 1, 30),
		Block.createCuboidShape(7, 27, -14, 9, 28, 30),
		Block.createCuboidShape(7, 1, -13, 9, 27, 29)
    );

    public Fsign7_Data() {
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

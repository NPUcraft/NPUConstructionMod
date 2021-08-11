package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Ffan_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 7, 5, 11, 10, 11),
		Block.createCuboidShape(-3, 8, 3, 19, 9, 6),
		Block.createCuboidShape(6, 15, 6, 10, 16, 10),
		Block.createCuboidShape(6, 8, -8, 10, 9, 3)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 7, 5, 11, 10, 11),
		Block.createCuboidShape(10, 8, -3, 13, 9, 19),
		Block.createCuboidShape(6, 15, 6, 10, 16, 10),
		Block.createCuboidShape(13, 8, 6, 24, 9, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 7, 5, 11, 10, 11),
		Block.createCuboidShape(-3, 8, 10, 19, 9, 13),
		Block.createCuboidShape(6, 15, 6, 10, 16, 10),
		Block.createCuboidShape(6, 8, 13, 10, 9, 24)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 7, 5, 11, 10, 11),
		Block.createCuboidShape(3, 8, -3, 6, 9, 19),
		Block.createCuboidShape(6, 15, 6, 10, 16, 10),
		Block.createCuboidShape(-8, 8, 6, 3, 9, 10)
    );

    public Ffan_Data() {
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

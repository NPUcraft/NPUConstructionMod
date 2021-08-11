package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Sl1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(2, 16, 2, 14, 16, 14),
		Block.createCuboidShape(7, 0, 7, 9, 17, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(2, 16, 2, 14, 16, 14),
		Block.createCuboidShape(7, 0, 7, 9, 17, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(2, 16, 2, 14, 16, 14),
		Block.createCuboidShape(7, 0, 7, 9, 17, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 15, 5, 11, 16, 11),
		Block.createCuboidShape(2, 16, 2, 14, 16, 14),
		Block.createCuboidShape(7, 0, 7, 9, 17, 9)
    );

    public Sl1_Data() {
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

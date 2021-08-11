package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Handrail1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 7, 9, 16, 9),
		Block.createCuboidShape(2, 2, 5, 6, 9, 11),
		Block.createCuboidShape(5, 13, 3, 11, 14, 5)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 7, 9, 16, 9),
		Block.createCuboidShape(5, 2, 2, 11, 9, 6),
		Block.createCuboidShape(11, 13, 5, 13, 14, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 7, 9, 16, 9),
		Block.createCuboidShape(10, 2, 5, 14, 9, 11),
		Block.createCuboidShape(5, 13, 11, 11, 14, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(7, 0, 7, 9, 16, 9),
		Block.createCuboidShape(5, 2, 10, 11, 9, 14),
		Block.createCuboidShape(3, 13, 5, 5, 14, 11)
    );

    public Handrail1_Data() {
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

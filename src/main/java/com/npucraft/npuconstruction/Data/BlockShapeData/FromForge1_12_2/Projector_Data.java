package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Projector_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(2, -4, 4, 13, 0, 11),
		Block.createCuboidShape(7, -1, 7, 9, 32, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -4, 2, 12, 0, 13),
		Block.createCuboidShape(8, -1, 7, 9, 32, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, -4, 5, 14, 0, 12),
		Block.createCuboidShape(7, -1, 8, 9, 32, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, -4, 3, 11, 0, 14),
		Block.createCuboidShape(7, -1, 7, 8, 32, 9)
    );

    public Projector_Data() {
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

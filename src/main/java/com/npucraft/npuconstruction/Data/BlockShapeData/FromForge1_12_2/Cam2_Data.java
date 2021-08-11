package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Cam2_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 14, 4, 9, 16, 10),
		Block.createCuboidShape(7, 11, 12, 9, 16, 17)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(6, 14, 7, 12, 16, 9),
		Block.createCuboidShape(-1, 11, 7, 4, 16, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 14, 6, 9, 16, 12),
		Block.createCuboidShape(7, 11, -1, 9, 16, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 14, 7, 10, 16, 9),
		Block.createCuboidShape(12, 11, 7, 17, 16, 9)
    );

    public Cam2_Data() {
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

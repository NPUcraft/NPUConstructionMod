package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcamera3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 15, 6, 13, 17, 9),
		Block.createCuboidShape(6, 11, 0, 10, 14, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 15, 3, 10, 17, 13),
		Block.createCuboidShape(0, 11, 6, 16, 14, 10)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 15, 7, 13, 17, 10),
		Block.createCuboidShape(6, 11, 0, 10, 14, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 15, 3, 9, 17, 13),
		Block.createCuboidShape(0, 11, 6, 16, 14, 10)
    );

    public Fcamera3_Data() {
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

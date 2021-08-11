package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fox_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 2, 5, 11, 15, 11),
		Block.createCuboidShape(6, 2, 3, 12, 4, 12),
		Block.createCuboidShape(10, 8, 3, 12, 13, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 4, 11, 15, 11),
		Block.createCuboidShape(4, 2, 6, 13, 4, 12),
		Block.createCuboidShape(6, 8, 10, 13, 13, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 5, 12, 15, 11),
		Block.createCuboidShape(4, 2, 4, 10, 4, 13),
		Block.createCuboidShape(4, 8, 6, 6, 13, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 5, 11, 15, 12),
		Block.createCuboidShape(3, 2, 4, 12, 4, 10),
		Block.createCuboidShape(3, 8, 4, 10, 13, 6)
    );

    public Fox_Data() {
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

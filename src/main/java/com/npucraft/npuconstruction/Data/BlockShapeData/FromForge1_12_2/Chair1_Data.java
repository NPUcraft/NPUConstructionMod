package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Chair1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 7, 2, 13, 8, 12),
		Block.createCuboidShape(3, 0, 3, 13, 7, 3),
		Block.createCuboidShape(12, 0, 3, 13, 7, 14),
		Block.createCuboidShape(3, 0, 3, 4, 7, 14),
		Block.createCuboidShape(4, 9, 11, 12, 16, 12)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 7, 3, 14, 8, 13),
		Block.createCuboidShape(13, 0, 3, 13, 7, 13),
		Block.createCuboidShape(2, 0, 12, 13, 7, 13),
		Block.createCuboidShape(2, 0, 3, 13, 7, 4),
		Block.createCuboidShape(4, 9, 4, 5, 16, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 7, 4, 13, 8, 14),
		Block.createCuboidShape(3, 0, 13, 13, 7, 13),
		Block.createCuboidShape(3, 0, 2, 4, 7, 13),
		Block.createCuboidShape(12, 0, 2, 13, 7, 13),
		Block.createCuboidShape(4, 9, 4, 12, 16, 5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(2, 7, 3, 12, 8, 13),
		Block.createCuboidShape(3, 0, 3, 3, 7, 13),
		Block.createCuboidShape(3, 0, 3, 14, 7, 4),
		Block.createCuboidShape(3, 0, 12, 14, 7, 13),
		Block.createCuboidShape(11, 9, 4, 12, 16, 12)
    );

    public Chair1_Data() {
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

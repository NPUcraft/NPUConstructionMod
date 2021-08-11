package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Electric_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(1, 25, 3, 15, 27, 13),
		Block.createCuboidShape(1, 3, 3, 15, 25, 12),
		Block.createCuboidShape(-1, 0, 1, 17, 3, 15)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 25, 1, 13, 27, 15),
		Block.createCuboidShape(4, 3, 1, 13, 25, 15),
		Block.createCuboidShape(1, 0, -1, 15, 3, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(1, 25, 3, 15, 27, 13),
		Block.createCuboidShape(1, 3, 4, 15, 25, 13),
		Block.createCuboidShape(-1, 0, 1, 17, 3, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(3, 25, 1, 13, 27, 15),
		Block.createCuboidShape(3, 3, 1, 12, 25, 15),
		Block.createCuboidShape(1, 0, -1, 15, 3, 17)
    );

    public Electric_Data() {
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

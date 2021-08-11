package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Light3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(4, 4, 4, 12, 6, 11),
		Block.createCuboidShape(4, 2, 7, 12, 2, 8)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 4, 4, 12, 6, 12),
		Block.createCuboidShape(8, 2, 4, 9, 2, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, 4, 5, 12, 6, 12),
		Block.createCuboidShape(4, 2, 8, 12, 2, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(4, 4, 4, 11, 6, 12),
		Block.createCuboidShape(7, 2, 4, 8, 2, 12)
    );

    public Light3_Data() {
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

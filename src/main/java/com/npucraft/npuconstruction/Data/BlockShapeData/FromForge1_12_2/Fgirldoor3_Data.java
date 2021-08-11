package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirldoor3_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 4, 9, 16, 6, 13),
		Block.createCuboidShape(0, 0, 9, 2, 5, 13),
		Block.createCuboidShape(14, 0, 9, 16, 5, 13),
		Block.createCuboidShape(7, 0, 10, 9, 4, 12),
		Block.createCuboidShape(0, 6, 0, 16, 16, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(3, 4, 0, 7, 6, 16),
		Block.createCuboidShape(3, 0, 0, 7, 5, 2),
		Block.createCuboidShape(3, 0, 14, 7, 5, 16),
		Block.createCuboidShape(4, 0, 7, 6, 4, 9),
		Block.createCuboidShape(0, 6, 0, 16, 16, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 4, 3, 16, 6, 7),
		Block.createCuboidShape(14, 0, 3, 16, 5, 7),
		Block.createCuboidShape(0, 0, 3, 2, 5, 7),
		Block.createCuboidShape(7, 0, 4, 9, 4, 6),
		Block.createCuboidShape(0, 6, 0, 16, 16, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(9, 4, 0, 13, 6, 16),
		Block.createCuboidShape(9, 0, 14, 13, 5, 16),
		Block.createCuboidShape(9, 0, 0, 13, 5, 2),
		Block.createCuboidShape(10, 0, 7, 12, 4, 9),
		Block.createCuboidShape(0, 6, 0, 16, 16, 16)
    );

    public Fgirldoor3_Data() {
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

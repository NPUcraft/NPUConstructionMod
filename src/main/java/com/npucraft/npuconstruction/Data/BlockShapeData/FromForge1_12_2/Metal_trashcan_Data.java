package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Metal_trashcan_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(5, 16, 10, 11, 17, 15),
		Block.createCuboidShape(5, 0, 10, 11, 1, 15),
		Block.createCuboidShape(7, 0, 15, 9, 17, 16),
		Block.createCuboidShape(5, 0, 12, 5, 17, 14),
		Block.createCuboidShape(7, 0, 10, 9, 12, 10),
		Block.createCuboidShape(11, 0, 12, 11, 17, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(1, 16, 5, 6, 17, 11),
		Block.createCuboidShape(1, 0, 5, 6, 1, 11),
		Block.createCuboidShape(0, 0, 7, 1, 17, 9),
		Block.createCuboidShape(2, 0, 5, 4, 17, 5),
		Block.createCuboidShape(6, 0, 7, 6, 12, 9),
		Block.createCuboidShape(2, 0, 11, 4, 17, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, 16, 1, 11, 17, 6),
		Block.createCuboidShape(5, 0, 1, 11, 1, 6),
		Block.createCuboidShape(7, 0, 0, 9, 17, 1),
		Block.createCuboidShape(11, 0, 2, 11, 17, 4),
		Block.createCuboidShape(7, 0, 6, 9, 12, 6),
		Block.createCuboidShape(5, 0, 2, 5, 17, 4)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(10, 16, 5, 15, 17, 11),
		Block.createCuboidShape(10, 0, 5, 15, 1, 11),
		Block.createCuboidShape(15, 0, 7, 16, 17, 9),
		Block.createCuboidShape(12, 0, 11, 14, 17, 11),
		Block.createCuboidShape(10, 0, 7, 10, 12, 9),
		Block.createCuboidShape(12, 0, 5, 14, 17, 5)
    );

    public Metal_trashcan_Data() {
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

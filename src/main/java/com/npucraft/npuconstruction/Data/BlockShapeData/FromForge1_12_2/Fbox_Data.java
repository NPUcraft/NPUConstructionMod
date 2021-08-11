package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fbox_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, 3, -1, 13, 12, 1),
		Block.createCuboidShape(2, 3, 1, 3, 12, 14),
		Block.createCuboidShape(13, 3, 1, 14, 12, 14),
		Block.createCuboidShape(3, 6, 14, 13, 12, 15),
		Block.createCuboidShape(3, 0, 13, 13, 6, 14),
		Block.createCuboidShape(3, 11, 1, 13, 12, 14),
		Block.createCuboidShape(3, 0, 1, 4, 3, 14),
		Block.createCuboidShape(12, 0, 1, 13, 3, 14),
		Block.createCuboidShape(3, 0, 1, 13, 3, 2),
		Block.createCuboidShape(3, 0, 1, 12, 2, 14)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(15, 3, 3, 17, 12, 13),
		Block.createCuboidShape(2, 3, 2, 15, 12, 3),
		Block.createCuboidShape(2, 3, 13, 15, 12, 14),
		Block.createCuboidShape(1, 6, 3, 2, 12, 13),
		Block.createCuboidShape(2, 0, 3, 3, 6, 13),
		Block.createCuboidShape(2, 11, 3, 15, 12, 13),
		Block.createCuboidShape(2, 0, 3, 15, 3, 4),
		Block.createCuboidShape(2, 0, 12, 15, 3, 13),
		Block.createCuboidShape(14, 0, 3, 15, 3, 13),
		Block.createCuboidShape(2, 0, 3, 15, 2, 12)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(3, 3, 15, 13, 12, 17),
		Block.createCuboidShape(13, 3, 2, 14, 12, 15),
		Block.createCuboidShape(2, 3, 2, 3, 12, 15),
		Block.createCuboidShape(3, 6, 1, 13, 12, 2),
		Block.createCuboidShape(3, 0, 2, 13, 6, 3),
		Block.createCuboidShape(3, 11, 2, 13, 12, 15),
		Block.createCuboidShape(12, 0, 2, 13, 3, 15),
		Block.createCuboidShape(3, 0, 2, 4, 3, 15),
		Block.createCuboidShape(3, 0, 14, 13, 3, 15),
		Block.createCuboidShape(4, 0, 2, 13, 2, 15)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, 3, 3, 1, 12, 13),
		Block.createCuboidShape(1, 3, 13, 14, 12, 14),
		Block.createCuboidShape(1, 3, 2, 14, 12, 3),
		Block.createCuboidShape(14, 6, 3, 15, 12, 13),
		Block.createCuboidShape(13, 0, 3, 14, 6, 13),
		Block.createCuboidShape(1, 11, 3, 14, 12, 13),
		Block.createCuboidShape(1, 0, 12, 14, 3, 13),
		Block.createCuboidShape(1, 0, 3, 14, 3, 4),
		Block.createCuboidShape(1, 0, 3, 2, 3, 13),
		Block.createCuboidShape(1, 0, 4, 14, 2, 13)
    );

    public Fbox_Data() {
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

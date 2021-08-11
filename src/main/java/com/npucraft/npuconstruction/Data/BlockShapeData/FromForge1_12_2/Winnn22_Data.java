package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Winnn22_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(3, 3, 6, 13, 3, 10),
		Block.createCuboidShape(3, 3, 6, 3, 13, 10),
		Block.createCuboidShape(13, 3, 6, 13, 13, 10),
		Block.createCuboidShape(3, 13, 6, 13, 13, 10),
		Block.createCuboidShape(3, 3, 7, 13, 13, 9),
		Block.createCuboidShape(0, 3, 0, 3, 13, 16),
		Block.createCuboidShape(13, 3, 0, 16, 13, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(6, 3, 3, 10, 3, 13),
		Block.createCuboidShape(6, 3, 3, 10, 13, 3),
		Block.createCuboidShape(6, 3, 13, 10, 13, 13),
		Block.createCuboidShape(6, 13, 3, 10, 13, 13),
		Block.createCuboidShape(7, 3, 3, 9, 13, 13),
		Block.createCuboidShape(0, 3, 0, 16, 13, 3),
		Block.createCuboidShape(0, 3, 13, 16, 13, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(3, 3, 6, 13, 3, 10),
		Block.createCuboidShape(13, 3, 6, 13, 13, 10),
		Block.createCuboidShape(3, 3, 6, 3, 13, 10),
		Block.createCuboidShape(3, 13, 6, 13, 13, 10),
		Block.createCuboidShape(3, 3, 7, 13, 13, 9),
		Block.createCuboidShape(13, 3, 0, 16, 13, 16),
		Block.createCuboidShape(0, 3, 0, 3, 13, 16),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(0, 13, 0, 16, 16, 16),
		Block.createCuboidShape(6, 3, 3, 10, 3, 13),
		Block.createCuboidShape(6, 3, 13, 10, 13, 13),
		Block.createCuboidShape(6, 3, 3, 10, 13, 3),
		Block.createCuboidShape(6, 13, 3, 10, 13, 13),
		Block.createCuboidShape(7, 3, 3, 9, 13, 13),
		Block.createCuboidShape(0, 3, 13, 16, 13, 16),
		Block.createCuboidShape(0, 3, 0, 16, 13, 3),
		Block.createCuboidShape(0, 0, 0, 16, 3, 16)
    );

    public Winnn22_Data() {
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

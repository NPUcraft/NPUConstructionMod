package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Bike4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-4, 6, 6, 9, 9, 11),
		Block.createCuboidShape(5, 10, 7, 21, 16, 9),
		Block.createCuboidShape(9, 2, 3, 10, 12, 14),
		Block.createCuboidShape(-4, 0, 9, -3, 14, 10),
		Block.createCuboidShape(1, 3, 5, 10, 5, 7),
		Block.createCuboidShape(18, 0, 9, 26, 13, 9),
		Block.createCuboidShape(18, 6, 6, 19, 16, 10),
		Block.createCuboidShape(-1, 5, 6, 0, 15, 10),
		Block.createCuboidShape(-10, 6, 9, 27, 7, 9),
		Block.createCuboidShape(5, 7, 7, 6, 20, 9),
		Block.createCuboidShape(16, 19, 3, 17, 20, 14),
		Block.createCuboidShape(0, 19, 7, 6, 20, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, 6, -4, 10, 9, 9),
		Block.createCuboidShape(7, 10, 5, 9, 16, 21),
		Block.createCuboidShape(2, 2, 9, 13, 12, 10),
		Block.createCuboidShape(6, 0, -4, 7, 14, -3),
		Block.createCuboidShape(9, 3, 1, 11, 5, 10),
		Block.createCuboidShape(7, 0, 18, 7, 13, 26),
		Block.createCuboidShape(6, 6, 18, 10, 16, 19),
		Block.createCuboidShape(6, 5, -1, 10, 15, 0),
		Block.createCuboidShape(7, 6, -10, 7, 7, 27),
		Block.createCuboidShape(7, 7, 5, 9, 20, 6),
		Block.createCuboidShape(2, 19, 16, 13, 20, 17),
		Block.createCuboidShape(7, 19, 0, 9, 20, 6)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 6, 5, 20, 9, 10),
		Block.createCuboidShape(-5, 10, 7, 11, 16, 9),
		Block.createCuboidShape(6, 2, 2, 7, 12, 13),
		Block.createCuboidShape(19, 0, 6, 20, 14, 7),
		Block.createCuboidShape(6, 3, 9, 15, 5, 11),
		Block.createCuboidShape(-10, 0, 7, -2, 13, 7),
		Block.createCuboidShape(-3, 6, 6, -2, 16, 10),
		Block.createCuboidShape(16, 5, 6, 17, 15, 10),
		Block.createCuboidShape(-11, 6, 7, 26, 7, 7),
		Block.createCuboidShape(10, 7, 7, 11, 20, 9),
		Block.createCuboidShape(-1, 19, 2, 0, 20, 13),
		Block.createCuboidShape(10, 19, 7, 16, 20, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(6, 6, 7, 11, 9, 20),
		Block.createCuboidShape(7, 10, -5, 9, 16, 11),
		Block.createCuboidShape(3, 2, 6, 14, 12, 7),
		Block.createCuboidShape(9, 0, 19, 10, 14, 20),
		Block.createCuboidShape(5, 3, 6, 7, 5, 15),
		Block.createCuboidShape(9, 0, -10, 9, 13, -2),
		Block.createCuboidShape(6, 6, -3, 10, 16, -2),
		Block.createCuboidShape(6, 5, 16, 10, 15, 17),
		Block.createCuboidShape(9, 6, -11, 9, 7, 26),
		Block.createCuboidShape(7, 7, 10, 9, 20, 11),
		Block.createCuboidShape(3, 19, -1, 14, 20, 0),
		Block.createCuboidShape(7, 19, 10, 9, 20, 16)
    );

    public Bike4_Data() {
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

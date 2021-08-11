package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class D6_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-11, 26, 5, 3, 31, 9),
		Block.createCuboidShape(-11, -15, 5, 3, -10, 9),
		Block.createCuboidShape(-11, 5, 5, 3, 9, 9),
		Block.createCuboidShape(5, 4, 3, 6, 14, 8),
		Block.createCuboidShape(3, -15, 5, 8, 31, 7),
		Block.createCuboidShape(-16, -12, 6, -15, 27, 7),
		Block.createCuboidShape(13, 26, 7, 26, 31, 9),
		Block.createCuboidShape(13, -15, 7, 26, -10, 9),
		Block.createCuboidShape(13, 5, 7, 26, 9, 9),
		Block.createCuboidShape(2, -15, 7, 13, 31, 9),
		Block.createCuboidShape(-16, -15, 7, -11, 31, 9),
		Block.createCuboidShape(31, -16, 5, 32, 32, 11),
		Block.createCuboidShape(-16, 31, 5, 31, 32, 11),
		Block.createCuboidShape(-16, -16, 6, 31, -15, 10),
		Block.createCuboidShape(26, -15, 7, 31, 31, 9),
		Block.createCuboidShape(-15, -15, 5, -10, 31, 7),
		Block.createCuboidShape(18, -15, 7, 21, 31, 9),
		Block.createCuboidShape(-6, -15, 7, -3, 31, 9),
		Block.createCuboidShape(-5, -15, 5, -2, 31, 7)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 26, -11, 11, 31, 3),
		Block.createCuboidShape(7, -15, -11, 11, -10, 3),
		Block.createCuboidShape(7, 5, -11, 11, 9, 3),
		Block.createCuboidShape(8, 4, 5, 13, 14, 6),
		Block.createCuboidShape(9, -15, 3, 11, 31, 8),
		Block.createCuboidShape(9, -12, -16, 10, 27, -15),
		Block.createCuboidShape(7, 26, 13, 9, 31, 26),
		Block.createCuboidShape(7, -15, 13, 9, -10, 26),
		Block.createCuboidShape(7, 5, 13, 9, 9, 26),
		Block.createCuboidShape(7, -15, 2, 9, 31, 13),
		Block.createCuboidShape(7, -15, -16, 9, 31, -11),
		Block.createCuboidShape(5, -16, 31, 11, 32, 32),
		Block.createCuboidShape(5, 31, -16, 11, 32, 31),
		Block.createCuboidShape(6, -16, -16, 10, -15, 31),
		Block.createCuboidShape(7, -15, 26, 9, 31, 31),
		Block.createCuboidShape(9, -15, -15, 11, 31, -10),
		Block.createCuboidShape(7, -15, 18, 9, 31, 21),
		Block.createCuboidShape(7, -15, -6, 9, 31, -3),
		Block.createCuboidShape(9, -15, -5, 11, 31, -2)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(13, 26, 7, 27, 31, 11),
		Block.createCuboidShape(13, -15, 7, 27, -10, 11),
		Block.createCuboidShape(13, 5, 7, 27, 9, 11),
		Block.createCuboidShape(10, 4, 8, 11, 14, 13),
		Block.createCuboidShape(8, -15, 9, 13, 31, 11),
		Block.createCuboidShape(31, -12, 9, 32, 27, 10),
		Block.createCuboidShape(-10, 26, 7, 3, 31, 9),
		Block.createCuboidShape(-10, -15, 7, 3, -10, 9),
		Block.createCuboidShape(-10, 5, 7, 3, 9, 9),
		Block.createCuboidShape(3, -15, 7, 14, 31, 9),
		Block.createCuboidShape(27, -15, 7, 32, 31, 9),
		Block.createCuboidShape(-16, -16, 5, -15, 32, 11),
		Block.createCuboidShape(-15, 31, 5, 32, 32, 11),
		Block.createCuboidShape(-15, -16, 6, 32, -15, 10),
		Block.createCuboidShape(-15, -15, 7, -10, 31, 9),
		Block.createCuboidShape(26, -15, 9, 31, 31, 11),
		Block.createCuboidShape(-5, -15, 7, -2, 31, 9),
		Block.createCuboidShape(19, -15, 7, 22, 31, 9),
		Block.createCuboidShape(18, -15, 9, 21, 31, 11)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 26, 13, 9, 31, 27),
		Block.createCuboidShape(5, -15, 13, 9, -10, 27),
		Block.createCuboidShape(5, 5, 13, 9, 9, 27),
		Block.createCuboidShape(3, 4, 10, 8, 14, 11),
		Block.createCuboidShape(5, -15, 8, 7, 31, 13),
		Block.createCuboidShape(6, -12, 31, 7, 27, 32),
		Block.createCuboidShape(7, 26, -10, 9, 31, 3),
		Block.createCuboidShape(7, -15, -10, 9, -10, 3),
		Block.createCuboidShape(7, 5, -10, 9, 9, 3),
		Block.createCuboidShape(7, -15, 3, 9, 31, 14),
		Block.createCuboidShape(7, -15, 27, 9, 31, 32),
		Block.createCuboidShape(5, -16, -16, 11, 32, -15),
		Block.createCuboidShape(5, 31, -15, 11, 32, 32),
		Block.createCuboidShape(6, -16, -15, 10, -15, 32),
		Block.createCuboidShape(7, -15, -15, 9, 31, -10),
		Block.createCuboidShape(5, -15, 26, 7, 31, 31),
		Block.createCuboidShape(7, -15, -5, 9, 31, -2),
		Block.createCuboidShape(7, -15, 19, 9, 31, 22),
		Block.createCuboidShape(5, -15, 18, 7, 31, 21)
    );

    public D6_Data() {
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

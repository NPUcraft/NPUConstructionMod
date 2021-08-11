package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Trash4_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 3, 5, 10, 22, 12),
		Block.createCuboidShape(-4, 22, 4, 20, 25, 13),
		Block.createCuboidShape(-3, 3, 5, -2, 18, 12),
		Block.createCuboidShape(18, 3, 5, 19, 18, 12),
		Block.createCuboidShape(-2, 3, 5, 18, 17, 6),
		Block.createCuboidShape(-2, 3, 11, 18, 17, 12),
		Block.createCuboidShape(-3, 3, 5, 19, 5, 12),
		Block.createCuboidShape(-3, 0, 5, 19, 3, 12),
		Block.createCuboidShape(-2, 17, 11, 18, 18, 12),
		Block.createCuboidShape(-2, 17, 5, 18, 18, 6),
		Block.createCuboidShape(5, 3, 5, 6, 18, 12),
		Block.createCuboidShape(10, 3, 5, 11, 18, 12),
		Block.createCuboidShape(-1, 9, 5, 17, 12, 5),
		Block.createCuboidShape(-1, 9, 12, 17, 12, 12),
		Block.createCuboidShape(-3, 3, 5, 19, 3, 5),
		Block.createCuboidShape(-3, 3, 12, 19, 3, 12),
		Block.createCuboidShape(19, 3, 7, 20, 22, 10),
		Block.createCuboidShape(-4, 3, 7, -3, 22, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(4, 3, 6, 11, 22, 10),
		Block.createCuboidShape(3, 22, -4, 12, 25, 20),
		Block.createCuboidShape(4, 3, -3, 11, 18, -2),
		Block.createCuboidShape(4, 3, 18, 11, 18, 19),
		Block.createCuboidShape(10, 3, -2, 11, 17, 18),
		Block.createCuboidShape(4, 3, -2, 5, 17, 18),
		Block.createCuboidShape(4, 3, -3, 11, 5, 19),
		Block.createCuboidShape(4, 0, -3, 11, 3, 19),
		Block.createCuboidShape(4, 17, -2, 5, 18, 18),
		Block.createCuboidShape(10, 17, -2, 11, 18, 18),
		Block.createCuboidShape(4, 3, 5, 11, 18, 6),
		Block.createCuboidShape(4, 3, 10, 11, 18, 11),
		Block.createCuboidShape(11, 9, -1, 11, 12, 17),
		Block.createCuboidShape(4, 9, -1, 4, 12, 17),
		Block.createCuboidShape(11, 3, -3, 11, 3, 19),
		Block.createCuboidShape(4, 3, -3, 4, 3, 19),
		Block.createCuboidShape(6, 3, 19, 9, 22, 20),
		Block.createCuboidShape(6, 3, -4, 9, 22, -3)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 3, 4, 10, 22, 11),
		Block.createCuboidShape(-4, 22, 3, 20, 25, 12),
		Block.createCuboidShape(18, 3, 4, 19, 18, 11),
		Block.createCuboidShape(-3, 3, 4, -2, 18, 11),
		Block.createCuboidShape(-2, 3, 10, 18, 17, 11),
		Block.createCuboidShape(-2, 3, 4, 18, 17, 5),
		Block.createCuboidShape(-3, 3, 4, 19, 5, 11),
		Block.createCuboidShape(-3, 0, 4, 19, 3, 11),
		Block.createCuboidShape(-2, 17, 4, 18, 18, 5),
		Block.createCuboidShape(-2, 17, 10, 18, 18, 11),
		Block.createCuboidShape(10, 3, 4, 11, 18, 11),
		Block.createCuboidShape(5, 3, 4, 6, 18, 11),
		Block.createCuboidShape(-1, 9, 11, 17, 12, 11),
		Block.createCuboidShape(-1, 9, 4, 17, 12, 4),
		Block.createCuboidShape(-3, 3, 11, 19, 3, 11),
		Block.createCuboidShape(-3, 3, 4, 19, 3, 4),
		Block.createCuboidShape(-4, 3, 6, -3, 22, 9),
		Block.createCuboidShape(19, 3, 6, 20, 22, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 3, 6, 12, 22, 10),
		Block.createCuboidShape(4, 22, -4, 13, 25, 20),
		Block.createCuboidShape(5, 3, 18, 12, 18, 19),
		Block.createCuboidShape(5, 3, -3, 12, 18, -2),
		Block.createCuboidShape(5, 3, -2, 6, 17, 18),
		Block.createCuboidShape(11, 3, -2, 12, 17, 18),
		Block.createCuboidShape(5, 3, -3, 12, 5, 19),
		Block.createCuboidShape(5, 0, -3, 12, 3, 19),
		Block.createCuboidShape(11, 17, -2, 12, 18, 18),
		Block.createCuboidShape(5, 17, -2, 6, 18, 18),
		Block.createCuboidShape(5, 3, 10, 12, 18, 11),
		Block.createCuboidShape(5, 3, 5, 12, 18, 6),
		Block.createCuboidShape(5, 9, -1, 5, 12, 17),
		Block.createCuboidShape(12, 9, -1, 12, 12, 17),
		Block.createCuboidShape(5, 3, -3, 5, 3, 19),
		Block.createCuboidShape(12, 3, -3, 12, 3, 19),
		Block.createCuboidShape(7, 3, -4, 10, 22, -3),
		Block.createCuboidShape(7, 3, 19, 10, 22, 20)
    );

    public Trash4_Data() {
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

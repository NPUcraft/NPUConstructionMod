package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Elev_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(11, -16, 5, 11, 28, 11),
		Block.createCuboidShape(-11, -16, 5, -11, 28, 11),
		Block.createCuboidShape(-16, -16, -1, -11, 32, 17),
		Block.createCuboidShape(11, -16, -1, 16, 32, 17),
		Block.createCuboidShape(-11, 28, 5, 11, 28, 11),
		Block.createCuboidShape(-12, 28, -1, 12, 32, 17),
		Block.createCuboidShape(-3, 13, 5, 3, 18, 6),
		Block.createCuboidShape(-3, 13, 10, 3, 18, 11),
		Block.createCuboidShape(-11, -16, 6, 11, 28, 10)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(5, -16, 11, 11, 28, 11),
		Block.createCuboidShape(5, -16, -11, 11, 28, -11),
		Block.createCuboidShape(-1, -16, -16, 17, 32, -11),
		Block.createCuboidShape(-1, -16, 11, 17, 32, 16),
		Block.createCuboidShape(5, 28, -11, 11, 28, 11),
		Block.createCuboidShape(-1, 28, -12, 17, 32, 12),
		Block.createCuboidShape(10, 13, -3, 11, 18, 3),
		Block.createCuboidShape(5, 13, -3, 6, 18, 3),
		Block.createCuboidShape(6, -16, -11, 10, 28, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(5, -16, 5, 5, 28, 11),
		Block.createCuboidShape(27, -16, 5, 27, 28, 11),
		Block.createCuboidShape(27, -16, -1, 32, 32, 17),
		Block.createCuboidShape(0, -16, -1, 5, 32, 17),
		Block.createCuboidShape(5, 28, 5, 27, 28, 11),
		Block.createCuboidShape(4, 28, -1, 28, 32, 17),
		Block.createCuboidShape(13, 13, 10, 19, 18, 11),
		Block.createCuboidShape(13, 13, 5, 19, 18, 6),
		Block.createCuboidShape(5, -16, 6, 27, 28, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, -16, 5, 11, 28, 5),
		Block.createCuboidShape(5, -16, 27, 11, 28, 27),
		Block.createCuboidShape(-1, -16, 27, 17, 32, 32),
		Block.createCuboidShape(-1, -16, 0, 17, 32, 5),
		Block.createCuboidShape(5, 28, 5, 11, 28, 27),
		Block.createCuboidShape(-1, 28, 4, 17, 32, 28),
		Block.createCuboidShape(5, 13, 13, 6, 18, 19),
		Block.createCuboidShape(10, 13, 13, 11, 18, 19),
		Block.createCuboidShape(6, -16, 5, 10, 28, 27)
    );

    public Elev_Data() {
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

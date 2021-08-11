package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Door8_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 2, 5, 10, 17, 6),
		Block.createCuboidShape(6, 2, 10, 10, 17, 11),
		Block.createCuboidShape(-16, -16, -1, -14, 30, 17),
		Block.createCuboidShape(30, -16, -1, 32, 30, 17),
		Block.createCuboidShape(-16, 30, -1, 32, 32, 17),
		Block.createCuboidShape(-15, -16, 7, 31, 31, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, 2, 6, 11, 17, 10),
		Block.createCuboidShape(5, 2, 6, 6, 17, 10),
		Block.createCuboidShape(-1, -16, -16, 17, 30, -14),
		Block.createCuboidShape(-1, -16, 30, 17, 30, 32),
		Block.createCuboidShape(-1, 30, -16, 17, 32, 32),
		Block.createCuboidShape(7, -16, -15, 9, 31, 31)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 2, 10, 10, 17, 11),
		Block.createCuboidShape(6, 2, 5, 10, 17, 6),
		Block.createCuboidShape(30, -16, -1, 32, 30, 17),
		Block.createCuboidShape(-16, -16, -1, -14, 30, 17),
		Block.createCuboidShape(-16, 30, -1, 32, 32, 17),
		Block.createCuboidShape(-15, -16, 7, 31, 31, 9)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(5, 2, 6, 6, 17, 10),
		Block.createCuboidShape(10, 2, 6, 11, 17, 10),
		Block.createCuboidShape(-1, -16, 30, 17, 30, 32),
		Block.createCuboidShape(-1, -16, -16, 17, 30, -14),
		Block.createCuboidShape(-1, 30, -16, 17, 32, 32),
		Block.createCuboidShape(7, -16, -15, 9, 31, 31)
    );

    public Door8_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fgirltl1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(31, 0, -16, 32, 16, 32),
		Block.createCuboidShape(0, 0, -16, 1, 16, 32),
		Block.createCuboidShape(1, 0, 31, 31, 16, 32),
		Block.createCuboidShape(1, 0, 14, 2, 16, 15),
		Block.createCuboidShape(15, -1, -3, 17, 16, -1)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, 31, 32, 16, 32),
		Block.createCuboidShape(-16, 0, 0, 32, 16, 1),
		Block.createCuboidShape(-16, 0, 1, -15, 16, 31),
		Block.createCuboidShape(1, 0, 1, 2, 16, 2),
		Block.createCuboidShape(17, -1, 15, 19, 16, 17)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, -16, -15, 16, 32),
		Block.createCuboidShape(15, 0, -16, 16, 16, 32),
		Block.createCuboidShape(-15, 0, -16, 15, 16, -15),
		Block.createCuboidShape(14, 0, 1, 15, 16, 2),
		Block.createCuboidShape(-1, -1, 17, 1, 16, 19)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-16, 0, -16, 32, 16, -15),
		Block.createCuboidShape(-16, 0, 15, 32, 16, 16),
		Block.createCuboidShape(31, 0, -15, 32, 16, 15),
		Block.createCuboidShape(14, 0, 14, 15, 16, 15),
		Block.createCuboidShape(-3, -1, -1, -1, 16, 1)
    );

    public Fgirltl1_Data() {
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

package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Brailing_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 12, 8, 32, 13, 9),
		Block.createCuboidShape(-16, 24, 8, 32, 25, 9),
		Block.createCuboidShape(-16, 20, 8, 32, 21, 9),
		Block.createCuboidShape(-16, 16, 8, 32, 17, 9),
		Block.createCuboidShape(-16, 0, 0, 32, 8, 16),
		Block.createCuboidShape(-16, 30, 8, 32, 31, 9),
		Block.createCuboidShape(8, 9, 8, 9, 30, 9)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(7, 12, -16, 8, 13, 32),
		Block.createCuboidShape(7, 24, -16, 8, 25, 32),
		Block.createCuboidShape(7, 20, -16, 8, 21, 32),
		Block.createCuboidShape(7, 16, -16, 8, 17, 32),
		Block.createCuboidShape(0, 0, -16, 16, 8, 32),
		Block.createCuboidShape(7, 30, -16, 8, 31, 32),
		Block.createCuboidShape(7, 9, 8, 8, 30, 9)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(-16, 12, 7, 32, 13, 8),
		Block.createCuboidShape(-16, 24, 7, 32, 25, 8),
		Block.createCuboidShape(-16, 20, 7, 32, 21, 8),
		Block.createCuboidShape(-16, 16, 7, 32, 17, 8),
		Block.createCuboidShape(-16, 0, 0, 32, 8, 16),
		Block.createCuboidShape(-16, 30, 7, 32, 31, 8),
		Block.createCuboidShape(7, 9, 7, 8, 30, 8)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(8, 12, -16, 9, 13, 32),
		Block.createCuboidShape(8, 24, -16, 9, 25, 32),
		Block.createCuboidShape(8, 20, -16, 9, 21, 32),
		Block.createCuboidShape(8, 16, -16, 9, 17, 32),
		Block.createCuboidShape(0, 0, -16, 16, 8, 32),
		Block.createCuboidShape(8, 30, -16, 9, 31, 32),
		Block.createCuboidShape(8, 9, 7, 9, 30, 8)
    );

    public Brailing_Data() {
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

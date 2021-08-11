package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fhallscreen1_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(7, 18, -5, 9, 22, 27),
		Block.createCuboidShape(7, 0, -5, 9, 18, 21),
		Block.createCuboidShape(5, 0, 21, 11, 18, 27)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(-11, 18, 7, 21, 22, 9),
		Block.createCuboidShape(-5, 0, 7, 21, 18, 9),
		Block.createCuboidShape(-11, 0, 5, -5, 18, 11)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(7, 18, -11, 9, 22, 21),
		Block.createCuboidShape(7, 0, -5, 9, 18, 21),
		Block.createCuboidShape(5, 0, -11, 11, 18, -5)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-5, 18, 7, 27, 22, 9),
		Block.createCuboidShape(-5, 0, 7, 21, 18, 9),
		Block.createCuboidShape(21, 0, 5, 27, 18, 11)
    );

    public Fhallscreen1_Data() {
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

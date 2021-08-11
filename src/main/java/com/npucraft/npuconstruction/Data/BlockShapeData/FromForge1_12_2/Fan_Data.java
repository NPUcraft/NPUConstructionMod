package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fan_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(6, 13, -2, 10, 16, 2),
		Block.createCuboidShape(5, 10, -5, 9, 13, 5),
		Block.createCuboidShape(3, 10, -1, 13, 13, 2),
		Block.createCuboidShape(1, 10, 2, 1, 13, 7),
		Block.createCuboidShape(11, 10, 6, 16, 13, 6)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(14, 13, 6, 18, 16, 10),
		Block.createCuboidShape(11, 10, 5, 21, 13, 9),
		Block.createCuboidShape(14, 10, 3, 17, 13, 13),
		Block.createCuboidShape(9, 10, 1, 14, 13, 1),
		Block.createCuboidShape(10, 10, 11, 10, 13, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(6, 13, 14, 10, 16, 18),
		Block.createCuboidShape(7, 10, 11, 11, 13, 21),
		Block.createCuboidShape(3, 10, 14, 13, 13, 17),
		Block.createCuboidShape(15, 10, 9, 15, 13, 14),
		Block.createCuboidShape(0, 10, 10, 5, 13, 10)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-2, 13, 6, 2, 16, 10),
		Block.createCuboidShape(-5, 10, 7, 5, 13, 11),
		Block.createCuboidShape(-1, 10, 3, 2, 13, 13),
		Block.createCuboidShape(2, 10, 15, 7, 13, 15),
		Block.createCuboidShape(6, 10, 0, 6, 13, 5)
    );

    public Fan_Data() {
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

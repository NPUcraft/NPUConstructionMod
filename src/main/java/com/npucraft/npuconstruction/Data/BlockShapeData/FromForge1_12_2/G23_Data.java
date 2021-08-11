package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class G23_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(0, 8, 11, 16, 16, 16),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(0, 8, 0, 5, 16, 16),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(0, 8, 0, 16, 16, 5),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(11, 8, 0, 16, 16, 16),
		Block.createCuboidShape(0, 0, 0, 16, 8, 16)
    );

    public G23_Data() {
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

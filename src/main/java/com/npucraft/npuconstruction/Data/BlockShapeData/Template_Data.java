package com.npucraft.npuconstruction.Data.BlockShapeData;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Template_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
            Block.createCuboidShape(31, -16, 5, 32, 32, 11)
            //...
    );
    private static final VoxelShape EAST = VoxelShapes.union(
            Block.createCuboidShape(31, -16, 5, 32, 32, 11)
            //...
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
            Block.createCuboidShape(31, -16, 5, 32, 32, 11)
            //...
    );
    private static final VoxelShape WEST = VoxelShapes.union(
            Block.createCuboidShape(31, -16, 5, 32, 32, 11)
            //...
    );

    public Template_Data() {
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

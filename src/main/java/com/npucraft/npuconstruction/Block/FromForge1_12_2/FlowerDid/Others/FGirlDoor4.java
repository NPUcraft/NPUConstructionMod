package com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Others;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Fgirldoor4_Data;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class FGirlDoor4 extends HorizontalFacingBlockT {

    public FGirlDoor4() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Fgirldoor4_Data.getNORTH();
            case SOUTH -> Fgirldoor4_Data.getSOUTH();
            case EAST -> Fgirldoor4_Data.getEAST();
            case WEST -> Fgirldoor4_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

}

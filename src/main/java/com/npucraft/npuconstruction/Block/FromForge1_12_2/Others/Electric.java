package com.npucraft.npuconstruction.Block.FromForge1_12_2.Others;


import com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2.Electric_Data;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HorizontalFacingBlock.HorizontalFacingBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class Electric extends HorizontalFacingBlockT {

    public Electric() {
        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH)
                .with(Properties.OPEN, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING, Properties.OPEN);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> Electric_Data.getNORTH();
            case SOUTH -> Electric_Data.getSOUTH();
            case EAST -> Electric_Data.getEAST();
            case WEST -> Electric_Data.getWEST();
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(Properties.OPEN)) {
            player.playSound(SoundEvents.BLOCK_IRON_DOOR_CLOSE, 1, 1);
            world.setBlockState(pos, state.with(Properties.OPEN, false));
//            world.addParticle(ParticleTypes.ELECTRIC_SPARK, 0.5, 2, 0.5, 0, 0, 0);
        } else {
            player.playSound(SoundEvents.BLOCK_IRON_DOOR_OPEN, 1, 1);
            world.setBlockState(pos, state.with(Properties.OPEN, true));
        }

        return ActionResult.SUCCESS;
    }

}

package com.npucraft.npuconstruction.Init.Register;

import com.npucraft.npuconstruction.NPUConstruction;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyRegister {
    // create ItemGroup
//    public static final ItemGroup NPU_GROUP = FabricItemGroupBuilder.create(
//            new Identifier("npu", "construction")).
//            icon(() -> new ItemStack(Blocks.COBBLESTONE)).build();
//
//    public static final ItemGroup NPU_VEHICLE = FabricItemGroupBuilder.create(
//            new Identifier("npu", "vehicle")).
//            icon(() -> new ItemStack(Blocks.RAIL)).build();
//
//    public static final ItemGroup NPU_PAVILION = FabricItemGroupBuilder.create(
//            new Identifier("npu", "pavilion")).
//            icon(() -> new ItemStack(Blocks.RAIL)).build();



    public static void registerBlock(Block newBlock, String namespace, String pathId, ItemGroup itemGroup) {
        // Register Block and Item
        Identifier newIdentifier = new Identifier(namespace, pathId);
        Registry.register(Registry.BLOCK, newIdentifier, newBlock);
        Registry.register(Registry.ITEM, newIdentifier,
                new BlockItem(newBlock, new Item.Settings().group(itemGroup)));
    }

    public static void registerItem(){
        // TODO
    }


}

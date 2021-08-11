package com.npucraft.npuconstruction.Block;

import com.npucraft.npuconstruction.Register.MyItemRegister;
import com.npucraft.npuconstruction.Temperate.BlockTemperate.HalfSlabBlockT;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabTest extends HalfSlabBlockT {
    public SlabTest(){

        super(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

        // Register Block and Item
        Registry.register(Registry.BLOCK, new Identifier("npu", "slab_test"), this);
        Registry.register(Registry.ITEM, new Identifier("npu", "slab_test"),
                new BlockItem(this, new Item.Settings().group(MyItemRegister.NPU_GROUP)));
    }
}

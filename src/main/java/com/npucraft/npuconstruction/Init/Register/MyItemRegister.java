package com.npucraft.npuconstruction.Init.Register;


import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyItemRegister {
    // create ItemGroup
    public static final ItemGroup NPU_GROUP = FabricItemGroupBuilder.create(
            new Identifier("npu", "construction")).
            icon(() -> new ItemStack(Blocks.COBBLESTONE)).build();

    public static final ItemGroup NPU_VEHICLE = FabricItemGroupBuilder.create(
            new Identifier("npu", "vehicle")).
            icon(() -> new ItemStack(Blocks.RAIL)).build();

    public static final ItemGroup NPU_PAVILION = FabricItemGroupBuilder.create(
            new Identifier("npu", "pavilion")).
            icon(() -> new ItemStack(Blocks.RAIL)).build();

    public static final Item.Settings NPU_GROUP_SETTING = new Item.Settings().group(NPU_GROUP);
    public static final Item.Settings NPU_VEHICLE_SETTING = new Item.Settings().group(NPU_VEHICLE);
    public static final Item.Settings NPU_PAVILION_SETTING = new Item.Settings().group(NPU_PAVILION);



    // BBed
    public static final BlockItem BBED2L_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bbed2l"), new BlockItem(MyBlockRegister.BBED2L, NPU_GROUP_SETTING));
    public static final BlockItem BBED2R_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bbed2r"), new BlockItem(MyBlockRegister.BBED2R, NPU_GROUP_SETTING));
    public static final BlockItem BBED2R1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bbed2r1"), new BlockItem(MyBlockRegister.BBED2R1, NPU_GROUP_SETTING));
    public static final BlockItem BBEDL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bbedl"), new BlockItem(MyBlockRegister.BBEDL, NPU_GROUP_SETTING));
    public static final BlockItem BBEDR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bbedr"), new BlockItem(MyBlockRegister.BBEDR, NPU_GROUP_SETTING));

    // Bikes
    public static final BlockItem BIKE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bike1"), new BlockItem(MyBlockRegister.BIKE1, NPU_GROUP_SETTING));
    public static final BlockItem BIKE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bike2"), new BlockItem(MyBlockRegister.BIKE2, NPU_GROUP_SETTING));
    public static final BlockItem BIKE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bike3"), new BlockItem(MyBlockRegister.BIKE3, NPU_GROUP_SETTING));
    public static final BlockItem BIKE4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bike4"), new BlockItem(MyBlockRegister.BIKE4, NPU_GROUP_SETTING));

    // Camera
    public static final BlockItem CAM1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cam1"), new BlockItem(MyBlockRegister.CAM1, NPU_GROUP_SETTING));
    public static final BlockItem CAM2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cam2"), new BlockItem(MyBlockRegister.CAM2, NPU_GROUP_SETTING));

    // Ceiling
    public static final BlockItem C1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "c1"), new BlockItem(MyBlockRegister.C1, NPU_GROUP_SETTING));
    public static final BlockItem C2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "c2"), new BlockItem(MyBlockRegister.C2, NPU_GROUP_SETTING));
    public static final BlockItem C3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "c3"), new BlockItem(MyBlockRegister.C3, NPU_GROUP_SETTING));
    public static final BlockItem C4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "c4"), new BlockItem(MyBlockRegister.C4, NPU_GROUP_SETTING));
    public static final BlockItem C5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "c5"), new BlockItem(MyBlockRegister.C5, NPU_GROUP_SETTING));

    // Constructions
    public static final BlockItem BPDOWN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bpdown"), new BlockItem(MyBlockRegister.BPDOWN, NPU_GROUP_SETTING));
    public static final BlockItem BPUP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bpup"), new BlockItem(MyBlockRegister.BPUP, NPU_GROUP_SETTING));
    public static final BlockItem BRAILING_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "brailing"), new BlockItem(MyBlockRegister.BRAILING, NPU_GROUP_SETTING));
    public static final BlockItem CCH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cch"), new BlockItem(MyBlockRegister.CCH, NPU_GROUP_SETTING));
    public static final BlockItem MESH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "mesh"), new BlockItem(MyBlockRegister.MESH, NPU_GROUP_SETTING));
    public static final BlockItem NN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "nn"), new BlockItem(MyBlockRegister.NN, NPU_GROUP_SETTING));
    public static final BlockItem QH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "qh"), new BlockItem(MyBlockRegister.QH, NPU_GROUP_SETTING));
    public static final BlockItem ROADBLOCK_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "roadblock"), new BlockItem(MyBlockRegister.ROADBLOCK, NPU_GROUP_SETTING));
    public static final BlockItem TESTBLOCK_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "testblock"), new BlockItem(MyBlockRegister.TESTBLOCK, NPU_GROUP_SETTING));
    public static final BlockItem WINDOWFRAME_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "windowframe"), new BlockItem(MyBlockRegister.WINDOWFRAME, NPU_GROUP_SETTING));

    // Decorations
    public static final BlockItem ALU_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "alu"), new BlockItem(MyBlockRegister.ALU, NPU_GROUP_SETTING));
    public static final BlockItem BOARD_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "board"), new BlockItem(MyBlockRegister.BOARD, NPU_GROUP_SETTING));
    public static final BlockItem CAL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cal"), new BlockItem(MyBlockRegister.CAL, NPU_GROUP_SETTING));
    public static final BlockItem CBB_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cbb"), new BlockItem(MyBlockRegister.CBB, NPU_GROUP_SETTING));
    public static final BlockItem EXIT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "exit"), new BlockItem(MyBlockRegister.EXIT, NPU_GROUP_SETTING));
    public static final BlockItem FAN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fan"), new BlockItem(MyBlockRegister.FAN, NPU_GROUP_SETTING));
    public static final BlockItem FC_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fc"), new BlockItem(MyBlockRegister.FC, NPU_GROUP_SETTING));
    public static final BlockItem MIRROR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "mirror"), new BlockItem(MyBlockRegister.MIRROR, NPU_GROUP_SETTING));
    public static final BlockItem N1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "n1"), new BlockItem(MyBlockRegister.N1, NPU_GROUP_SETTING));
    public static final BlockItem N2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "n2"), new BlockItem(MyBlockRegister.N2, NPU_GROUP_SETTING));
    public static final BlockItem PROJECTOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "projector"), new BlockItem(MyBlockRegister.PROJECTOR, NPU_GROUP_SETTING));
    public static final BlockItem SC_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sc"), new BlockItem(MyBlockRegister.SC, NPU_GROUP_SETTING));
    public static final BlockItem SIGN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sign1"), new BlockItem(MyBlockRegister.SIGN1, NPU_GROUP_SETTING));
    public static final BlockItem SIGN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sign2"), new BlockItem(MyBlockRegister.SIGN2, NPU_GROUP_SETTING));
    public static final BlockItem SIGN3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sign3"), new BlockItem(MyBlockRegister.SIGN3, NPU_GROUP_SETTING));
    public static final BlockItem TELE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "tele"), new BlockItem(MyBlockRegister.TELE, NPU_GROUP_SETTING));
    public static final BlockItem VOLTAGE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "voltage"), new BlockItem(MyBlockRegister.VOLTAGE, NPU_GROUP_SETTING));
    public static final BlockItem WBOARD_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wboard"), new BlockItem(MyBlockRegister.WBOARD, NPU_GROUP_SETTING));
    public static final BlockItem WTABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wtable"), new BlockItem(MyBlockRegister.WTABLE, NPU_GROUP_SETTING));

    // Decs
    public static final BlockItem DEC1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dec1"), new BlockItem(MyBlockRegister.DEC1, NPU_GROUP_SETTING));
    public static final BlockItem DEC2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dec2"), new BlockItem(MyBlockRegister.DEC2, NPU_GROUP_SETTING));
    public static final BlockItem DEC3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dec3"), new BlockItem(MyBlockRegister.DEC3, NPU_GROUP_SETTING));
    public static final BlockItem DEC4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dec4"), new BlockItem(MyBlockRegister.DEC4, NPU_GROUP_SETTING));

    // Desks

    // Desks.Blue
    public static final BlockItem BLUECLASSROOMDESK1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "blueclassroomdesk1"), new BlockItem(MyBlockRegister.BLUECLASSROOMDESK1, NPU_GROUP_SETTING));
    public static final BlockItem BLUECLASSROOMDESK2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "blueclassroomdesk2"), new BlockItem(MyBlockRegister.BLUECLASSROOMDESK2, NPU_GROUP_SETTING));
    public static final BlockItem BLUECLASSROOMDESK3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "blueclassroomdesk3"), new BlockItem(MyBlockRegister.BLUECLASSROOMDESK3, NPU_GROUP_SETTING));
    public static final BlockItem BLUECLASSROOMDESK4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "blueclassroomdesk4"), new BlockItem(MyBlockRegister.BLUECLASSROOMDESK4, NPU_GROUP_SETTING));
    public static final BlockItem BLUECLASSROOMDESK5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "blueclassroomdesk5"), new BlockItem(MyBlockRegister.BLUECLASSROOMDESK5, NPU_GROUP_SETTING));

    // Desks.Wood
    public static final BlockItem WOODCLASSROOMDESK1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "woodclassroomdesk1"), new BlockItem(MyBlockRegister.WOODCLASSROOMDESK1, NPU_GROUP_SETTING));
    public static final BlockItem WOODCLASSROOMDESK2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "woodclassroomdesk2"), new BlockItem(MyBlockRegister.WOODCLASSROOMDESK2, NPU_GROUP_SETTING));
    public static final BlockItem WOODCLASSROOMDESK3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "woodclassroomdesk3"), new BlockItem(MyBlockRegister.WOODCLASSROOMDESK3, NPU_GROUP_SETTING));
    public static final BlockItem WOODCLASSROOMDESK4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "woodclassroomdesk4"), new BlockItem(MyBlockRegister.WOODCLASSROOMDESK4, NPU_GROUP_SETTING));
    public static final BlockItem WOODCLASSROOMDESK5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "woodclassroomdesk5"), new BlockItem(MyBlockRegister.WOODCLASSROOMDESK5, NPU_GROUP_SETTING));

    // DHalls
    public static final BlockItem DHALL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall"), new BlockItem(MyBlockRegister.DHALL, NPU_GROUP_SETTING));
    public static final BlockItem DHALL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall1"), new BlockItem(MyBlockRegister.DHALL1, NPU_GROUP_SETTING));
    public static final BlockItem DHALL10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall10"), new BlockItem(MyBlockRegister.DHALL10, NPU_GROUP_SETTING));
    public static final BlockItem DHALL11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall11"), new BlockItem(MyBlockRegister.DHALL11, NPU_GROUP_SETTING));
    public static final BlockItem DHALL12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall12"), new BlockItem(MyBlockRegister.DHALL12, NPU_GROUP_SETTING));
    public static final BlockItem DHALL13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall13"), new BlockItem(MyBlockRegister.DHALL13, NPU_GROUP_SETTING));
    public static final BlockItem DHALL2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall2"), new BlockItem(MyBlockRegister.DHALL2, NPU_GROUP_SETTING));
    public static final BlockItem DHALL3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall3"), new BlockItem(MyBlockRegister.DHALL3, NPU_GROUP_SETTING));
    public static final BlockItem DHALL4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall4"), new BlockItem(MyBlockRegister.DHALL4, NPU_GROUP_SETTING));
    public static final BlockItem DHALL5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall5"), new BlockItem(MyBlockRegister.DHALL5, NPU_GROUP_SETTING));
    public static final BlockItem DHALL6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall6"), new BlockItem(MyBlockRegister.DHALL6, NPU_GROUP_SETTING));
    public static final BlockItem DHALL7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall7"), new BlockItem(MyBlockRegister.DHALL7, NPU_GROUP_SETTING));
    public static final BlockItem DHALL8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall8"), new BlockItem(MyBlockRegister.DHALL8, NPU_GROUP_SETTING));
    public static final BlockItem DHALL9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dhall9"), new BlockItem(MyBlockRegister.DHALL9, NPU_GROUP_SETTING));

    // Doors
    public static final BlockItem BATH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bath"), new BlockItem(MyBlockRegister.BATH, NPU_GROUP_SETTING));
    public static final BlockItem BFRAME_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bframe"), new BlockItem(MyBlockRegister.BFRAME, NPU_GROUP_SETTING));
    public static final BlockItem BFRAME1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bframe1"), new BlockItem(MyBlockRegister.BFRAME1, NPU_GROUP_SETTING));
    public static final BlockItem BFRAME2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "bframe2"), new BlockItem(MyBlockRegister.BFRAME2, NPU_GROUP_SETTING));
    public static final BlockItem D1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d1"), new BlockItem(MyBlockRegister.D1, NPU_GROUP_SETTING));
    public static final BlockItem D2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d2"), new BlockItem(MyBlockRegister.D2, NPU_GROUP_SETTING));
    public static final BlockItem D3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d3"), new BlockItem(MyBlockRegister.D3, NPU_GROUP_SETTING));
    public static final BlockItem D4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d4"), new BlockItem(MyBlockRegister.D4, NPU_GROUP_SETTING));
    public static final BlockItem D5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d5"), new BlockItem(MyBlockRegister.D5, NPU_GROUP_SETTING));
    public static final BlockItem D6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d6"), new BlockItem(MyBlockRegister.D6, NPU_GROUP_SETTING));
    public static final BlockItem D7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d7"), new BlockItem(MyBlockRegister.D7, NPU_GROUP_SETTING));
    public static final BlockItem DOOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door"), new BlockItem(MyBlockRegister.DOOR, NPU_GROUP_SETTING));
    public static final BlockItem DOOR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door1"), new BlockItem(MyBlockRegister.DOOR1, NPU_GROUP_SETTING));
    public static final BlockItem DOOR10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door10"), new BlockItem(MyBlockRegister.DOOR10, NPU_GROUP_SETTING));
    public static final BlockItem DOOR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door2"), new BlockItem(MyBlockRegister.DOOR2, NPU_GROUP_SETTING));
    public static final BlockItem DOOR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door3"), new BlockItem(MyBlockRegister.DOOR3, NPU_GROUP_SETTING));
    public static final BlockItem DOOR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door4"), new BlockItem(MyBlockRegister.DOOR4, NPU_GROUP_SETTING));
    public static final BlockItem DOOR5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door5"), new BlockItem(MyBlockRegister.DOOR5, NPU_GROUP_SETTING));
    public static final BlockItem DOOR6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door6"), new BlockItem(MyBlockRegister.DOOR6, NPU_GROUP_SETTING));
    public static final BlockItem DOOR7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door7"), new BlockItem(MyBlockRegister.DOOR7, NPU_GROUP_SETTING));
    public static final BlockItem DOOR8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door8"), new BlockItem(MyBlockRegister.DOOR8, NPU_GROUP_SETTING));
    public static final BlockItem DOOR9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "door9"), new BlockItem(MyBlockRegister.DOOR9, NPU_GROUP_SETTING));
    public static final BlockItem ELEV_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "elev"), new BlockItem(MyBlockRegister.ELEV, NPU_GROUP_SETTING));
    public static final BlockItem SDFRAME_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sdframe"), new BlockItem(MyBlockRegister.SDFRAME, NPU_GROUP_SETTING));

    // Doors.Black
    public static final BlockItem DB1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db1"), new BlockItem(MyBlockRegister.DB1, NPU_GROUP_SETTING));
    public static final BlockItem DB2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db2"), new BlockItem(MyBlockRegister.DB2, NPU_GROUP_SETTING));
    public static final BlockItem DB3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db3"), new BlockItem(MyBlockRegister.DB3, NPU_GROUP_SETTING));
    public static final BlockItem DB4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db4"), new BlockItem(MyBlockRegister.DB4, NPU_GROUP_SETTING));
    public static final BlockItem DB5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db5"), new BlockItem(MyBlockRegister.DB5, NPU_GROUP_SETTING));
    public static final BlockItem DB6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db6"), new BlockItem(MyBlockRegister.DB6, NPU_GROUP_SETTING));
    public static final BlockItem DB7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db7"), new BlockItem(MyBlockRegister.DB7, NPU_GROUP_SETTING));
    public static final BlockItem DB8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "db8"), new BlockItem(MyBlockRegister.DB8, NPU_GROUP_SETTING));

    // Doors.White
    public static final BlockItem DW1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw1"), new BlockItem(MyBlockRegister.DW1, NPU_GROUP_SETTING));
    public static final BlockItem DW10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw10"), new BlockItem(MyBlockRegister.DW10, NPU_GROUP_SETTING));
    public static final BlockItem DW2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw2"), new BlockItem(MyBlockRegister.DW2, NPU_GROUP_SETTING));
    public static final BlockItem DW3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw3"), new BlockItem(MyBlockRegister.DW3, NPU_GROUP_SETTING));
    public static final BlockItem DW4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw4"), new BlockItem(MyBlockRegister.DW4, NPU_GROUP_SETTING));
    public static final BlockItem DW5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw5"), new BlockItem(MyBlockRegister.DW5, NPU_GROUP_SETTING));
    public static final BlockItem DW6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw6"), new BlockItem(MyBlockRegister.DW6, NPU_GROUP_SETTING));
    public static final BlockItem DW7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw7"), new BlockItem(MyBlockRegister.DW7, NPU_GROUP_SETTING));
    public static final BlockItem DW8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw8"), new BlockItem(MyBlockRegister.DW8, NPU_GROUP_SETTING));
    public static final BlockItem DW9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dw9"), new BlockItem(MyBlockRegister.DW9, NPU_GROUP_SETTING));

    // Drinks
    public static final BlockItem DRINK_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "drink"), new BlockItem(MyBlockRegister.DRINK, NPU_GROUP_SETTING));
    public static final BlockItem DRINK1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "drink1"), new BlockItem(MyBlockRegister.DRINK1, NPU_GROUP_SETTING));
    public static final BlockItem DRINK3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "drink3"), new BlockItem(MyBlockRegister.DRINK3, NPU_GROUP_SETTING));
    public static final BlockItem DRINK4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "drink4"), new BlockItem(MyBlockRegister.DRINK4, NPU_GROUP_SETTING));
    public static final BlockItem DRINK5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "drink5"), new BlockItem(MyBlockRegister.DRINK5, NPU_GROUP_SETTING));
    public static final BlockItem DRINK6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "drink6"), new BlockItem(MyBlockRegister.DRINK6, NPU_GROUP_SETTING));

    // Fence
    public static final BlockItem FENCE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence1"), new BlockItem(MyBlockRegister.FENCE1, NPU_GROUP_SETTING));
    public static final BlockItem FENCE10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence10"), new BlockItem(MyBlockRegister.FENCE10, NPU_GROUP_SETTING));
    public static final BlockItem FENCE11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence11"), new BlockItem(MyBlockRegister.FENCE11, NPU_GROUP_SETTING));
    public static final BlockItem FENCE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence2"), new BlockItem(MyBlockRegister.FENCE2, NPU_GROUP_SETTING));
    public static final BlockItem FENCE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence3"), new BlockItem(MyBlockRegister.FENCE3, NPU_GROUP_SETTING));
    public static final BlockItem FENCE4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence4"), new BlockItem(MyBlockRegister.FENCE4, NPU_GROUP_SETTING));
    public static final BlockItem FENCE5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence5"), new BlockItem(MyBlockRegister.FENCE5, NPU_GROUP_SETTING));
    public static final BlockItem FENCE6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence6"), new BlockItem(MyBlockRegister.FENCE6, NPU_GROUP_SETTING));
    public static final BlockItem FENCE7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence7"), new BlockItem(MyBlockRegister.FENCE7, NPU_GROUP_SETTING));
    public static final BlockItem FENCE8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence8"), new BlockItem(MyBlockRegister.FENCE8, NPU_GROUP_SETTING));
    public static final BlockItem FENCE9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fence9"), new BlockItem(MyBlockRegister.FENCE9, NPU_GROUP_SETTING));
    public static final BlockItem FENCEO_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fenceo"), new BlockItem(MyBlockRegister.FENCEO, NPU_GROUP_SETTING));

    // Floors
    public static final BlockItem FLOOR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "floor2"), new BlockItem(MyBlockRegister.FLOOR2, NPU_GROUP_SETTING));
    public static final BlockItem FLOOR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "floor3"), new BlockItem(MyBlockRegister.FLOOR3, NPU_GROUP_SETTING));
    public static final BlockItem FLOOR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "floor4"), new BlockItem(MyBlockRegister.FLOOR4, NPU_GROUP_SETTING));
    public static final BlockItem FLOOR5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "floor5"), new BlockItem(MyBlockRegister.FLOOR5, NPU_GROUP_SETTING));
    public static final BlockItem FLOOR6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "floor6"), new BlockItem(MyBlockRegister.FLOOR6, NPU_GROUP_SETTING));

    // FlowerDid

    // FlowerDid.Day221
    public static final BlockItem FBRAILINGL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fbrailingl"), new BlockItem(MyBlockRegister.FBRAILINGL, NPU_GROUP_SETTING));
    public static final BlockItem FBRAILINGR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fbrailingr"), new BlockItem(MyBlockRegister.FBRAILINGR, NPU_GROUP_SETTING));
    public static final BlockItem FCART1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcart1"), new BlockItem(MyBlockRegister.FCART1, NPU_GROUP_SETTING));
    public static final BlockItem FG77_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg77"), new BlockItem(MyBlockRegister.FG77, NPU_GROUP_SETTING));
    public static final BlockItem FG78_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg78"), new BlockItem(MyBlockRegister.FG78, NPU_GROUP_SETTING));
    public static final BlockItem FG79_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg79"), new BlockItem(MyBlockRegister.FG79, NPU_GROUP_SETTING));
    public static final BlockItem FG80_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg80"), new BlockItem(MyBlockRegister.FG80, NPU_GROUP_SETTING));
    public static final BlockItem FHUMP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fhump"), new BlockItem(MyBlockRegister.FHUMP, NPU_GROUP_SETTING));
    public static final BlockItem FHUMP1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fhump1"), new BlockItem(MyBlockRegister.FHUMP1, NPU_GROUP_SETTING));
    public static final BlockItem FLCHAIR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flchair"), new BlockItem(MyBlockRegister.FLCHAIR, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight11"), new BlockItem(MyBlockRegister.FLIGHT11, NPU_GROUP_SETTING));
    public static final BlockItem FSTOOL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstool"), new BlockItem(MyBlockRegister.FSTOOL, NPU_GROUP_SETTING));
    public static final BlockItem FSTOOL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstool1"), new BlockItem(MyBlockRegister.FSTOOL1, NPU_GROUP_SETTING));
    public static final BlockItem FWELL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwell"), new BlockItem(MyBlockRegister.FWELL, NPU_GROUP_SETTING));
    public static final BlockItem FWELL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwell1"), new BlockItem(MyBlockRegister.FWELL1, NPU_GROUP_SETTING));
    public static final BlockItem FWELL2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwell2"), new BlockItem(MyBlockRegister.FWELL2, NPU_GROUP_SETTING));
    public static final BlockItem FWELL3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwell3"), new BlockItem(MyBlockRegister.FWELL3, NPU_GROUP_SETTING));

    // FlowerDid.Day222
    public static final BlockItem FCTABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable"), new BlockItem(MyBlockRegister.FCTABLE, NPU_GROUP_SETTING));
    public static final BlockItem FCTABLE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable1"), new BlockItem(MyBlockRegister.FCTABLE1, NPU_GROUP_SETTING));
    public static final BlockItem FCTV_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctv"), new BlockItem(MyBlockRegister.FCTV, NPU_GROUP_SETTING));
    public static final BlockItem FCTV1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctv1"), new BlockItem(MyBlockRegister.FCTV1, NPU_GROUP_SETTING));
    public static final BlockItem FFAN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "ffan"), new BlockItem(MyBlockRegister.FFAN, NPU_GROUP_SETTING));
    public static final BlockItem FLINE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline"), new BlockItem(MyBlockRegister.FLINE, NPU_GROUP_SETTING));
    public static final BlockItem FLINE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline1"), new BlockItem(MyBlockRegister.FLINE1, NPU_GROUP_SETTING));
    public static final BlockItem FLINE10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline10"), new BlockItem(MyBlockRegister.FLINE10, NPU_GROUP_SETTING));
    public static final BlockItem FLINE11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline11"), new BlockItem(MyBlockRegister.FLINE11, NPU_GROUP_SETTING));
    public static final BlockItem FLINE12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline12"), new BlockItem(MyBlockRegister.FLINE12, NPU_GROUP_SETTING));
    public static final BlockItem FLINE13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline13"), new BlockItem(MyBlockRegister.FLINE13, NPU_GROUP_SETTING));
    public static final BlockItem FLINE14_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline14"), new BlockItem(MyBlockRegister.FLINE14, NPU_GROUP_SETTING));
    public static final BlockItem FLINE15_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline15"), new BlockItem(MyBlockRegister.FLINE15, NPU_GROUP_SETTING));
    public static final BlockItem FLINE16_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline16"), new BlockItem(MyBlockRegister.FLINE16, NPU_GROUP_SETTING));
    public static final BlockItem FLINE17_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline17"), new BlockItem(MyBlockRegister.FLINE17, NPU_GROUP_SETTING));
    public static final BlockItem FLINE18_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline18"), new BlockItem(MyBlockRegister.FLINE18, NPU_GROUP_SETTING));
    public static final BlockItem FLINE19_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline19"), new BlockItem(MyBlockRegister.FLINE19, NPU_GROUP_SETTING));
    public static final BlockItem FLINE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline2"), new BlockItem(MyBlockRegister.FLINE2, NPU_GROUP_SETTING));
    public static final BlockItem FLINE20_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline20"), new BlockItem(MyBlockRegister.FLINE20, NPU_GROUP_SETTING));
    public static final BlockItem FLINE21_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline21"), new BlockItem(MyBlockRegister.FLINE21, NPU_GROUP_SETTING));
    public static final BlockItem FLINE22_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline22"), new BlockItem(MyBlockRegister.FLINE22, NPU_GROUP_SETTING));
    public static final BlockItem FLINE23_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline23"), new BlockItem(MyBlockRegister.FLINE23, NPU_GROUP_SETTING));
    public static final BlockItem FLINE24_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline24"), new BlockItem(MyBlockRegister.FLINE24, NPU_GROUP_SETTING));
    public static final BlockItem FLINE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline3"), new BlockItem(MyBlockRegister.FLINE3, NPU_GROUP_SETTING));
    public static final BlockItem FLINE4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline4"), new BlockItem(MyBlockRegister.FLINE4, NPU_GROUP_SETTING));
    public static final BlockItem FLINE5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline5"), new BlockItem(MyBlockRegister.FLINE5, NPU_GROUP_SETTING));
    public static final BlockItem FLINE6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline6"), new BlockItem(MyBlockRegister.FLINE6, NPU_GROUP_SETTING));
    public static final BlockItem FLINE7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline7"), new BlockItem(MyBlockRegister.FLINE7, NPU_GROUP_SETTING));
    public static final BlockItem FLINE8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline8"), new BlockItem(MyBlockRegister.FLINE8, NPU_GROUP_SETTING));
    public static final BlockItem FLINE9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fline9"), new BlockItem(MyBlockRegister.FLINE9, NPU_GROUP_SETTING));
    public static final BlockItem FVENT1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fvent1"), new BlockItem(MyBlockRegister.FVENT1, NPU_GROUP_SETTING));
    public static final BlockItem FVENT2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fvent2"), new BlockItem(MyBlockRegister.FVENT2, NPU_GROUP_SETTING));

    // FlowerDid.Day228
    public static final BlockItem FCFLOOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcfloor"), new BlockItem(MyBlockRegister.FCFLOOR, NPU_GROUP_SETTING));
    public static final BlockItem FCFLOOR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcfloor1"), new BlockItem(MyBlockRegister.FCFLOOR1, NPU_GROUP_SETTING));
    public static final BlockItem FCFLOOR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcfloor2"), new BlockItem(MyBlockRegister.FCFLOOR2, NPU_GROUP_SETTING));
    public static final BlockItem FCFLOOR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcfloor3"), new BlockItem(MyBlockRegister.FCFLOOR3, NPU_GROUP_SETTING));
    public static final BlockItem FCFLOOR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcfloor4"), new BlockItem(MyBlockRegister.FCFLOOR4, NPU_GROUP_SETTING));
    public static final BlockItem FG82_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg82"), new BlockItem(MyBlockRegister.FG82, NPU_GROUP_SETTING));
    public static final BlockItem FG83_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg83"), new BlockItem(MyBlockRegister.FG83, NPU_GROUP_SETTING));
    public static final BlockItem FG84_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg84"), new BlockItem(MyBlockRegister.FG84, NPU_GROUP_SETTING));
    public static final BlockItem FG85_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg85"), new BlockItem(MyBlockRegister.FG85, NPU_GROUP_SETTING));
    public static final BlockItem FG86_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg86"), new BlockItem(MyBlockRegister.FG86, NPU_GROUP_SETTING));
    public static final BlockItem FG87_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg87"), new BlockItem(MyBlockRegister.FG87, NPU_GROUP_SETTING));
    public static final BlockItem FSWASH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fswash"), new BlockItem(MyBlockRegister.FSWASH, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor6"), new BlockItem(MyBlockRegister.FYFDOOR6, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor7"), new BlockItem(MyBlockRegister.FYFDOOR7, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor8"), new BlockItem(MyBlockRegister.FYFDOOR8, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor9"), new BlockItem(MyBlockRegister.FYFDOOR9, NPU_GROUP_SETTING));

    // FlowerDid.Day310
    public static final BlockItem FCONTAINER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcontainer"), new BlockItem(MyBlockRegister.FCONTAINER, NPU_GROUP_SETTING));
    public static final BlockItem FCONTAINER1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcontainer1"), new BlockItem(MyBlockRegister.FCONTAINER1, NPU_GROUP_SETTING));
    public static final BlockItem FCONTAINER2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcontainer2"), new BlockItem(MyBlockRegister.FCONTAINER2, NPU_GROUP_SETTING));
    public static final BlockItem FG93_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg93"), new BlockItem(MyBlockRegister.FG93, NPU_GROUP_SETTING));
    public static final BlockItem FG94_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg94"), new BlockItem(MyBlockRegister.FG94, NPU_GROUP_SETTING));
    public static final BlockItem FG95_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg95"), new BlockItem(MyBlockRegister.FG95, NPU_GROUP_SETTING));
    public static final BlockItem FG96_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg96"), new BlockItem(MyBlockRegister.FG96, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight12"), new BlockItem(MyBlockRegister.FLIGHT12, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight13"), new BlockItem(MyBlockRegister.FLIGHT13, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign"), new BlockItem(MyBlockRegister.FSIGN, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign1"), new BlockItem(MyBlockRegister.FSIGN1, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign2"), new BlockItem(MyBlockRegister.FSIGN2, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign3"), new BlockItem(MyBlockRegister.FSIGN3, NPU_GROUP_SETTING));
    public static final BlockItem FWINDOW_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwindow"), new BlockItem(MyBlockRegister.FWINDOW, NPU_GROUP_SETTING));
    public static final BlockItem FWINDOW1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwindow1"), new BlockItem(MyBlockRegister.FWINDOW1, NPU_GROUP_SETTING));
    public static final BlockItem FWINDOW2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwindow2"), new BlockItem(MyBlockRegister.FWINDOW2, NPU_GROUP_SETTING));
    public static final BlockItem FWINDOW3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwindow3"), new BlockItem(MyBlockRegister.FWINDOW3, NPU_GROUP_SETTING));
    public static final BlockItem FWINDOW4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwindow4"), new BlockItem(MyBlockRegister.FWINDOW4, NPU_GROUP_SETTING));
    public static final BlockItem FWINDOW5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwindow5"), new BlockItem(MyBlockRegister.FWINDOW5, NPU_GROUP_SETTING));

    // FlowerDid.Day312
    public static final BlockItem FBOX_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fbox"), new BlockItem(MyBlockRegister.FBOX, NPU_GROUP_SETTING));
    public static final BlockItem FBOX1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fbox1"), new BlockItem(MyBlockRegister.FBOX1, NPU_GROUP_SETTING));
    public static final BlockItem FCTABLE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable2"), new BlockItem(MyBlockRegister.FCTABLE2, NPU_GROUP_SETTING));
    public static final BlockItem FCTABLE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable3"), new BlockItem(MyBlockRegister.FCTABLE3, NPU_GROUP_SETTING));
    public static final BlockItem FCTABLE4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable4"), new BlockItem(MyBlockRegister.FCTABLE4, NPU_GROUP_SETTING));
    public static final BlockItem FCTABLE5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable5"), new BlockItem(MyBlockRegister.FCTABLE5, NPU_GROUP_SETTING));
    public static final BlockItem FCTABLE6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fctable6"), new BlockItem(MyBlockRegister.FCTABLE6, NPU_GROUP_SETTING));
    public static final BlockItem FROADBLOCKS_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "froadblocks"), new BlockItem(MyBlockRegister.FROADBLOCKS, NPU_GROUP_SETTING));
    public static final BlockItem FROD_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "frod"), new BlockItem(MyBlockRegister.FROD, NPU_GROUP_SETTING));
    public static final BlockItem FROD1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "frod1"), new BlockItem(MyBlockRegister.FROD1, NPU_GROUP_SETTING));
    public static final BlockItem FSHELF_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fshelf"), new BlockItem(MyBlockRegister.FSHELF, NPU_GROUP_SETTING));
    public static final BlockItem FSHELF1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fshelf1"), new BlockItem(MyBlockRegister.FSHELF1, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign4"), new BlockItem(MyBlockRegister.FSIGN4, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign5"), new BlockItem(MyBlockRegister.FSIGN5, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign6"), new BlockItem(MyBlockRegister.FSIGN6, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign7"), new BlockItem(MyBlockRegister.FSIGN7, NPU_GROUP_SETTING));
    public static final BlockItem FSIGN8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsign8"), new BlockItem(MyBlockRegister.FSIGN8, NPU_GROUP_SETTING));
    public static final BlockItem FSMOKE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fsmoke"), new BlockItem(MyBlockRegister.FSMOKE, NPU_GROUP_SETTING));
    public static final BlockItem FSTOVE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstove"), new BlockItem(MyBlockRegister.FSTOVE, NPU_GROUP_SETTING));
    public static final BlockItem FSTOVE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstove1"), new BlockItem(MyBlockRegister.FSTOVE1, NPU_GROUP_SETTING));
    public static final BlockItem FSTOVE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstove2"), new BlockItem(MyBlockRegister.FSTOVE2, NPU_GROUP_SETTING));
    public static final BlockItem FSWITCH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fswitch"), new BlockItem(MyBlockRegister.FSWITCH, NPU_GROUP_SETTING));

    // FlowerDid.Others
    public static final BlockItem FBTABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fbtable"), new BlockItem(MyBlockRegister.FBTABLE, NPU_GROUP_SETTING));
    public static final BlockItem FCAMERA_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcamera"), new BlockItem(MyBlockRegister.FCAMERA, NPU_GROUP_SETTING));
    public static final BlockItem FCAMERA1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcamera1"), new BlockItem(MyBlockRegister.FCAMERA1, NPU_GROUP_SETTING));
    public static final BlockItem FCAMERA2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcamera2"), new BlockItem(MyBlockRegister.FCAMERA2, NPU_GROUP_SETTING));
    public static final BlockItem FCAMERA3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcamera3"), new BlockItem(MyBlockRegister.FCAMERA3, NPU_GROUP_SETTING));
    public static final BlockItem FCAMERA4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcamera4"), new BlockItem(MyBlockRegister.FCAMERA4, NPU_GROUP_SETTING));
    public static final BlockItem FCAMERA5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcamera5"), new BlockItem(MyBlockRegister.FCAMERA5, NPU_GROUP_SETTING));
    public static final BlockItem FCART_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fcart"), new BlockItem(MyBlockRegister.FCART, NPU_GROUP_SETTING));
    public static final BlockItem FCHOPSTICKS_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fchopsticks"), new BlockItem(MyBlockRegister.FCHOPSTICKS, NPU_GROUP_SETTING));
    public static final BlockItem FDOORNUM_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fdoornum"), new BlockItem(MyBlockRegister.FDOORNUM, NPU_GROUP_SETTING));
    public static final BlockItem FDOORSCREEN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fdoorscreen"), new BlockItem(MyBlockRegister.FDOORSCREEN, NPU_GROUP_SETTING));
    public static final BlockItem FDOORSWITCH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fdoorswitch"), new BlockItem(MyBlockRegister.FDOORSWITCH, NPU_GROUP_SETTING));
    public static final BlockItem FG76_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg76"), new BlockItem(MyBlockRegister.FG76, NPU_GROUP_SETTING));
    public static final BlockItem FG81_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg81"), new BlockItem(MyBlockRegister.FG81, NPU_GROUP_SETTING));
    public static final BlockItem FG88_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg88"), new BlockItem(MyBlockRegister.FG88, NPU_GROUP_SETTING));
    public static final BlockItem FG89_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg89"), new BlockItem(MyBlockRegister.FG89, NPU_GROUP_SETTING));
    public static final BlockItem FG90_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg90"), new BlockItem(MyBlockRegister.FG90, NPU_GROUP_SETTING));
    public static final BlockItem FG91_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg91"), new BlockItem(MyBlockRegister.FG91, NPU_GROUP_SETTING));
    public static final BlockItem FG92_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg92"), new BlockItem(MyBlockRegister.FG92, NPU_GROUP_SETTING));
    public static final BlockItem FGALLERY1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgallery1"), new BlockItem(MyBlockRegister.FGALLERY1, NPU_GROUP_SETTING));
    public static final BlockItem FGALLERY2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgallery2"), new BlockItem(MyBlockRegister.FGALLERY2, NPU_GROUP_SETTING));
    public static final BlockItem FGALLERY3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgallery3"), new BlockItem(MyBlockRegister.FGALLERY3, NPU_GROUP_SETTING));
    public static final BlockItem FGALLERY4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgallery4"), new BlockItem(MyBlockRegister.FGALLERY4, NPU_GROUP_SETTING));
    public static final BlockItem FGALLERY5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgallery5"), new BlockItem(MyBlockRegister.FGALLERY5, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLDOOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirldoor"), new BlockItem(MyBlockRegister.FGIRLDOOR, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLDOOR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirldoor1"), new BlockItem(MyBlockRegister.FGIRLDOOR1, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLDOOR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirldoor2"), new BlockItem(MyBlockRegister.FGIRLDOOR2, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLDOOR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirldoor3"), new BlockItem(MyBlockRegister.FGIRLDOOR3, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLDOOR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirldoor4"), new BlockItem(MyBlockRegister.FGIRLDOOR4, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLDOOR5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirldoor5"), new BlockItem(MyBlockRegister.FGIRLDOOR5, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLTL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirltl1"), new BlockItem(MyBlockRegister.FGIRLTL1, NPU_GROUP_SETTING));
    public static final BlockItem FGIRLTR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fgirltr1"), new BlockItem(MyBlockRegister.FGIRLTR1, NPU_GROUP_SETTING));
    public static final BlockItem FHALLSCREEN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fhallscreen1"), new BlockItem(MyBlockRegister.FHALLSCREEN1, NPU_GROUP_SETTING));
    public static final BlockItem FHALLSCREEN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fhallscreen2"), new BlockItem(MyBlockRegister.FHALLSCREEN2, NPU_GROUP_SETTING));
    public static final BlockItem FHTABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fhtable"), new BlockItem(MyBlockRegister.FHTABLE, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight1"), new BlockItem(MyBlockRegister.FLIGHT1, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight10"), new BlockItem(MyBlockRegister.FLIGHT10, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight2"), new BlockItem(MyBlockRegister.FLIGHT2, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight3"), new BlockItem(MyBlockRegister.FLIGHT3, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight4"), new BlockItem(MyBlockRegister.FLIGHT4, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight5"), new BlockItem(MyBlockRegister.FLIGHT5, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight6"), new BlockItem(MyBlockRegister.FLIGHT6, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight7"), new BlockItem(MyBlockRegister.FLIGHT7, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight8"), new BlockItem(MyBlockRegister.FLIGHT8, NPU_GROUP_SETTING));
    public static final BlockItem FLIGHT9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "flight9"), new BlockItem(MyBlockRegister.FLIGHT9, NPU_GROUP_SETTING));
    public static final BlockItem FMP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fmp"), new BlockItem(MyBlockRegister.FMP, NPU_GROUP_SETTING));
    public static final BlockItem FNORTHHALL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fnorthhall1"), new BlockItem(MyBlockRegister.FNORTHHALL1, NPU_GROUP_SETTING));
    public static final BlockItem FNORTHHALL2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fnorthhall2"), new BlockItem(MyBlockRegister.FNORTHHALL2, NPU_GROUP_SETTING));
    public static final BlockItem FNORTHHALL3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fnorthhall3"), new BlockItem(MyBlockRegister.FNORTHHALL3, NPU_GROUP_SETTING));
    public static final BlockItem FNORTHHALL4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fnorthhall4"), new BlockItem(MyBlockRegister.FNORTHHALL4, NPU_GROUP_SETTING));
    public static final BlockItem FNORTHHALL5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fnorthhall5"), new BlockItem(MyBlockRegister.FNORTHHALL5, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe"), new BlockItem(MyBlockRegister.FPIPE, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe1"), new BlockItem(MyBlockRegister.FPIPE1, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe10"), new BlockItem(MyBlockRegister.FPIPE10, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe2"), new BlockItem(MyBlockRegister.FPIPE2, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe3"), new BlockItem(MyBlockRegister.FPIPE3, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe4"), new BlockItem(MyBlockRegister.FPIPE4, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe5"), new BlockItem(MyBlockRegister.FPIPE5, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe6"), new BlockItem(MyBlockRegister.FPIPE6, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe7"), new BlockItem(MyBlockRegister.FPIPE7, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe8"), new BlockItem(MyBlockRegister.FPIPE8, NPU_GROUP_SETTING));
    public static final BlockItem FPIPE9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fpipe9"), new BlockItem(MyBlockRegister.FPIPE9, NPU_GROUP_SETTING));
    public static final BlockItem FRADIATOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fradiator"), new BlockItem(MyBlockRegister.FRADIATOR, NPU_GROUP_SETTING));
    public static final BlockItem FSTATION_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstation"), new BlockItem(MyBlockRegister.FSTATION, NPU_GROUP_SETTING));
    public static final BlockItem FSTATION1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstation1"), new BlockItem(MyBlockRegister.FSTATION1, NPU_GROUP_SETTING));
    public static final BlockItem FSTATION2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fstation2"), new BlockItem(MyBlockRegister.FSTATION2, NPU_GROUP_SETTING));
    public static final BlockItem FTRASH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "ftrash"), new BlockItem(MyBlockRegister.FTRASH, NPU_GROUP_SETTING));
    public static final BlockItem FTSIGH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "ftsigh"), new BlockItem(MyBlockRegister.FTSIGH, NPU_GROUP_SETTING));
    public static final BlockItem FVENT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fvent"), new BlockItem(MyBlockRegister.FVENT, NPU_GROUP_SETTING));
    public static final BlockItem FWASHL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwashl"), new BlockItem(MyBlockRegister.FWASHL, NPU_GROUP_SETTING));
    public static final BlockItem FWASHR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwashr"), new BlockItem(MyBlockRegister.FWASHR, NPU_GROUP_SETTING));
    public static final BlockItem FWINL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwinl"), new BlockItem(MyBlockRegister.FWINL, NPU_GROUP_SETTING));
    public static final BlockItem FWINR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fwinr"), new BlockItem(MyBlockRegister.FWINR, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor"), new BlockItem(MyBlockRegister.FYFDOOR, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor1"), new BlockItem(MyBlockRegister.FYFDOOR1, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor2"), new BlockItem(MyBlockRegister.FYFDOOR2, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor3"), new BlockItem(MyBlockRegister.FYFDOOR3, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor4"), new BlockItem(MyBlockRegister.FYFDOOR4, NPU_GROUP_SETTING));
    public static final BlockItem FYFDOOR5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyfdoor5"), new BlockItem(MyBlockRegister.FYFDOOR5, NPU_GROUP_SETTING));
    public static final BlockItem FYFTL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyftl"), new BlockItem(MyBlockRegister.FYFTL, NPU_GROUP_SETTING));
    public static final BlockItem FYFTL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyftl1"), new BlockItem(MyBlockRegister.FYFTL1, NPU_GROUP_SETTING));
    public static final BlockItem FYFTR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyftr"), new BlockItem(MyBlockRegister.FYFTR, NPU_GROUP_SETTING));
    public static final BlockItem FYFTR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fyftr1"), new BlockItem(MyBlockRegister.FYFTR1, NPU_GROUP_SETTING));

    // G
    public static final BlockItem FG53_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg53"), new BlockItem(MyBlockRegister.FG53, NPU_GROUP_SETTING));
    public static final BlockItem FG54_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg54"), new BlockItem(MyBlockRegister.FG54, NPU_GROUP_SETTING));
    public static final BlockItem FG55_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg55"), new BlockItem(MyBlockRegister.FG55, NPU_GROUP_SETTING));
    public static final BlockItem FG56_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg56"), new BlockItem(MyBlockRegister.FG56, NPU_GROUP_SETTING));
    public static final BlockItem FG57_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg57"), new BlockItem(MyBlockRegister.FG57, NPU_GROUP_SETTING));
    public static final BlockItem FG58_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg58"), new BlockItem(MyBlockRegister.FG58, NPU_GROUP_SETTING));
    public static final BlockItem FG59_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg59"), new BlockItem(MyBlockRegister.FG59, NPU_GROUP_SETTING));
    public static final BlockItem FG60_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg60"), new BlockItem(MyBlockRegister.FG60, NPU_GROUP_SETTING));
    public static final BlockItem FG61_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg61"), new BlockItem(MyBlockRegister.FG61, NPU_GROUP_SETTING));
    public static final BlockItem FG62_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg62"), new BlockItem(MyBlockRegister.FG62, NPU_GROUP_SETTING));
    public static final BlockItem FG63_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg63"), new BlockItem(MyBlockRegister.FG63, NPU_GROUP_SETTING));
    public static final BlockItem FG64_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg64"), new BlockItem(MyBlockRegister.FG64, NPU_GROUP_SETTING));
    public static final BlockItem FG65_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg65"), new BlockItem(MyBlockRegister.FG65, NPU_GROUP_SETTING));
    public static final BlockItem FG66_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg66"), new BlockItem(MyBlockRegister.FG66, NPU_GROUP_SETTING));
    public static final BlockItem FG67_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg67"), new BlockItem(MyBlockRegister.FG67, NPU_GROUP_SETTING));
    public static final BlockItem FG68_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg68"), new BlockItem(MyBlockRegister.FG68, NPU_GROUP_SETTING));
    public static final BlockItem FG69_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg69"), new BlockItem(MyBlockRegister.FG69, NPU_GROUP_SETTING));
    public static final BlockItem FG70_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg70"), new BlockItem(MyBlockRegister.FG70, NPU_GROUP_SETTING));
    public static final BlockItem FG71_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg71"), new BlockItem(MyBlockRegister.FG71, NPU_GROUP_SETTING));
    public static final BlockItem FG72_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg72"), new BlockItem(MyBlockRegister.FG72, NPU_GROUP_SETTING));
    public static final BlockItem FG73_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg73"), new BlockItem(MyBlockRegister.FG73, NPU_GROUP_SETTING));
    public static final BlockItem FG74_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg74"), new BlockItem(MyBlockRegister.FG74, NPU_GROUP_SETTING));
    public static final BlockItem FG75_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fg75"), new BlockItem(MyBlockRegister.FG75, NPU_GROUP_SETTING));
    public static final BlockItem G1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g1"), new BlockItem(MyBlockRegister.G1, NPU_GROUP_SETTING));
    public static final BlockItem G10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g10"), new BlockItem(MyBlockRegister.G10, NPU_GROUP_SETTING));
    public static final BlockItem G11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g11"), new BlockItem(MyBlockRegister.G11, NPU_GROUP_SETTING));
    public static final BlockItem G12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g12"), new BlockItem(MyBlockRegister.G12, NPU_GROUP_SETTING));
    public static final BlockItem G13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g13"), new BlockItem(MyBlockRegister.G13, NPU_GROUP_SETTING));
    public static final BlockItem G14_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g14"), new BlockItem(MyBlockRegister.G14, NPU_GROUP_SETTING));
    public static final BlockItem G15_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g15"), new BlockItem(MyBlockRegister.G15, NPU_GROUP_SETTING));
    public static final BlockItem G16_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g16"), new BlockItem(MyBlockRegister.G16, NPU_GROUP_SETTING));
    public static final BlockItem G17_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g17"), new BlockItem(MyBlockRegister.G17, NPU_GROUP_SETTING));
    public static final BlockItem G18_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g18"), new BlockItem(MyBlockRegister.G18, NPU_GROUP_SETTING));
    public static final BlockItem G19_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g19"), new BlockItem(MyBlockRegister.G19, NPU_GROUP_SETTING));
    public static final BlockItem G2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g2"), new BlockItem(MyBlockRegister.G2, NPU_GROUP_SETTING));
    public static final BlockItem G20_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g20"), new BlockItem(MyBlockRegister.G20, NPU_GROUP_SETTING));
    public static final BlockItem G21A_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g21a"), new BlockItem(MyBlockRegister.G21A, NPU_GROUP_SETTING));
    public static final BlockItem G21B_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g21b"), new BlockItem(MyBlockRegister.G21B, NPU_GROUP_SETTING));
    public static final BlockItem G21C_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g21c"), new BlockItem(MyBlockRegister.G21C, NPU_GROUP_SETTING));
    public static final BlockItem G22_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g22"), new BlockItem(MyBlockRegister.G22, NPU_GROUP_SETTING));
    public static final BlockItem G23_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g23"), new BlockItem(MyBlockRegister.G23, NPU_GROUP_SETTING));
    public static final BlockItem G24_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g24"), new BlockItem(MyBlockRegister.G24, NPU_GROUP_SETTING));
    public static final BlockItem G25_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g25"), new BlockItem(MyBlockRegister.G25, NPU_GROUP_SETTING));
    public static final BlockItem G26_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g26"), new BlockItem(MyBlockRegister.G26, NPU_GROUP_SETTING));
    public static final BlockItem G27_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g27"), new BlockItem(MyBlockRegister.G27, NPU_GROUP_SETTING));
    public static final BlockItem G28_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g28"), new BlockItem(MyBlockRegister.G28, NPU_GROUP_SETTING));
    public static final BlockItem G29_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g29"), new BlockItem(MyBlockRegister.G29, NPU_GROUP_SETTING));
    public static final BlockItem G3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g3"), new BlockItem(MyBlockRegister.G3, NPU_GROUP_SETTING));
    public static final BlockItem G30_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g30"), new BlockItem(MyBlockRegister.G30, NPU_GROUP_SETTING));
    public static final BlockItem G31_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g31"), new BlockItem(MyBlockRegister.G31, NPU_GROUP_SETTING));
    public static final BlockItem G32_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g32"), new BlockItem(MyBlockRegister.G32, NPU_GROUP_SETTING));
    public static final BlockItem G33_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g33"), new BlockItem(MyBlockRegister.G33, NPU_GROUP_SETTING));
    public static final BlockItem G34_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g34"), new BlockItem(MyBlockRegister.G34, NPU_GROUP_SETTING));
    public static final BlockItem G35_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g35"), new BlockItem(MyBlockRegister.G35, NPU_GROUP_SETTING));
    public static final BlockItem G36_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g36"), new BlockItem(MyBlockRegister.G36, NPU_GROUP_SETTING));
    public static final BlockItem G37_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g37"), new BlockItem(MyBlockRegister.G37, NPU_GROUP_SETTING));
    public static final BlockItem G38_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g38"), new BlockItem(MyBlockRegister.G38, NPU_GROUP_SETTING));
    public static final BlockItem G39_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g39"), new BlockItem(MyBlockRegister.G39, NPU_GROUP_SETTING));
    public static final BlockItem G4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g4"), new BlockItem(MyBlockRegister.G4, NPU_GROUP_SETTING));
    public static final BlockItem G40_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g40"), new BlockItem(MyBlockRegister.G40, NPU_GROUP_SETTING));
    public static final BlockItem G41_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g41"), new BlockItem(MyBlockRegister.G41, NPU_GROUP_SETTING));
    public static final BlockItem G42_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g42"), new BlockItem(MyBlockRegister.G42, NPU_GROUP_SETTING));
    public static final BlockItem G43_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g43"), new BlockItem(MyBlockRegister.G43, NPU_GROUP_SETTING));
    public static final BlockItem G44_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g44"), new BlockItem(MyBlockRegister.G44, NPU_GROUP_SETTING));
    public static final BlockItem G45_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g45"), new BlockItem(MyBlockRegister.G45, NPU_GROUP_SETTING));
    public static final BlockItem G46_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g46"), new BlockItem(MyBlockRegister.G46, NPU_GROUP_SETTING));
    public static final BlockItem G47_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g47"), new BlockItem(MyBlockRegister.G47, NPU_GROUP_SETTING));
    public static final BlockItem G48_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g48"), new BlockItem(MyBlockRegister.G48, NPU_GROUP_SETTING));
    public static final BlockItem G49_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g49"), new BlockItem(MyBlockRegister.G49, NPU_GROUP_SETTING));
    public static final BlockItem G5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g5"), new BlockItem(MyBlockRegister.G5, NPU_GROUP_SETTING));
    public static final BlockItem G50_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g50"), new BlockItem(MyBlockRegister.G50, NPU_GROUP_SETTING));
    public static final BlockItem G51_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g51"), new BlockItem(MyBlockRegister.G51, NPU_GROUP_SETTING));
    public static final BlockItem G52_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g52"), new BlockItem(MyBlockRegister.G52, NPU_GROUP_SETTING));
    public static final BlockItem G53_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g53"), new BlockItem(MyBlockRegister.G53, NPU_GROUP_SETTING));
    public static final BlockItem G54_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g54"), new BlockItem(MyBlockRegister.G54, NPU_GROUP_SETTING));
    public static final BlockItem G55_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g55"), new BlockItem(MyBlockRegister.G55, NPU_GROUP_SETTING));
    public static final BlockItem G6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g6"), new BlockItem(MyBlockRegister.G6, NPU_GROUP_SETTING));
    public static final BlockItem G7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g7"), new BlockItem(MyBlockRegister.G7, NPU_GROUP_SETTING));
    public static final BlockItem G8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g8"), new BlockItem(MyBlockRegister.G8, NPU_GROUP_SETTING));
    public static final BlockItem G9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g9"), new BlockItem(MyBlockRegister.G9, NPU_GROUP_SETTING));

    // Girl
    public static final BlockItem GIRLBEDL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "girlbedl"), new BlockItem(MyBlockRegister.GIRLBEDL, NPU_GROUP_SETTING));
    public static final BlockItem GIRLBEDR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "girlbedr"), new BlockItem(MyBlockRegister.GIRLBEDR, NPU_GROUP_SETTING));
    public static final BlockItem GIRLSHELF_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "girlshelf"), new BlockItem(MyBlockRegister.GIRLSHELF, NPU_GROUP_SETTING));
    public static final BlockItem GIRLTL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "girltl"), new BlockItem(MyBlockRegister.GIRLTL, NPU_GROUP_SETTING));
    public static final BlockItem GIRLTR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "girltr"), new BlockItem(MyBlockRegister.GIRLTR, NPU_GROUP_SETTING));
    public static final BlockItem GIRLWASH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "girlwash"), new BlockItem(MyBlockRegister.GIRLWASH, NPU_GROUP_SETTING));

    // Guns
    public static final BlockItem GUN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "gun"), new BlockItem(MyBlockRegister.GUN, NPU_GROUP_SETTING));
    public static final BlockItem GUN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "gun1"), new BlockItem(MyBlockRegister.GUN1, NPU_GROUP_SETTING));

    // HandRail
    public static final BlockItem HR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "hr1"), new BlockItem(MyBlockRegister.HR1, NPU_GROUP_SETTING));
    public static final BlockItem HR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "hr2"), new BlockItem(MyBlockRegister.HR2, NPU_GROUP_SETTING));
    public static final BlockItem HR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "hr3"), new BlockItem(MyBlockRegister.HR3, NPU_GROUP_SETTING));
    public static final BlockItem HR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "hr4"), new BlockItem(MyBlockRegister.HR4, NPU_GROUP_SETTING));
    public static final BlockItem HR5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "hr5"), new BlockItem(MyBlockRegister.HR5, NPU_GROUP_SETTING));

    // Lights
    public static final BlockItem LIGHT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light"), new BlockItem(MyBlockRegister.LIGHT, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light1"), new BlockItem(MyBlockRegister.LIGHT1, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light2"), new BlockItem(MyBlockRegister.LIGHT2, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light3"), new BlockItem(MyBlockRegister.LIGHT3, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light4"), new BlockItem(MyBlockRegister.LIGHT4, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light5"), new BlockItem(MyBlockRegister.LIGHT5, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light6"), new BlockItem(MyBlockRegister.LIGHT6, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light7"), new BlockItem(MyBlockRegister.LIGHT7, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light8"), new BlockItem(MyBlockRegister.LIGHT8, NPU_GROUP_SETTING));
    public static final BlockItem LIGHT9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "light9"), new BlockItem(MyBlockRegister.LIGHT9, NPU_GROUP_SETTING));

    // Market
    public static final BlockItem MARKETCABINETFREEZER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "market_cabinet_freezer"), new BlockItem(MyBlockRegister.MARKETCABINETFREEZER, NPU_GROUP_SETTING));
    public static final BlockItem MARKETCASHIERDESKLEFT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "market_cashier_desk_left"), new BlockItem(MyBlockRegister.MARKETCASHIERDESKLEFT, NPU_GROUP_SETTING));
    public static final BlockItem MARKETCASHIERDESKRIGHT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "market_cashier_desk_right"), new BlockItem(MyBlockRegister.MARKETCASHIERDESKRIGHT, NPU_GROUP_SETTING));
    public static final BlockItem MARKETMILKBOX_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "market_milk_box"), new BlockItem(MyBlockRegister.MARKETMILKBOX, NPU_GROUP_SETTING));
    public static final BlockItem MARKETOFFICECABINETDOWN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "market_office_cabinet_down"), new BlockItem(MyBlockRegister.MARKETOFFICECABINETDOWN, NPU_GROUP_SETTING));
    public static final BlockItem MARKETOFFICECABINETUP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "market_office_cabinet_up"), new BlockItem(MyBlockRegister.MARKETOFFICECABINETUP, NPU_GROUP_SETTING));

    // Others
    public static final BlockItem AC_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "ac"), new BlockItem(MyBlockRegister.AC, NPU_GROUP_SETTING));
    public static final BlockItem ACADD1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "acadd1"), new BlockItem(MyBlockRegister.ACADD1, NPU_GROUP_SETTING));
    public static final BlockItem ACADD2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "acadd2"), new BlockItem(MyBlockRegister.ACADD2, NPU_GROUP_SETTING));
    public static final BlockItem AIRCONIN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "airconin"), new BlockItem(MyBlockRegister.AIRCONIN, NPU_GROUP_SETTING));
    public static final BlockItem AIRCONOUT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "airconout"), new BlockItem(MyBlockRegister.AIRCONOUT, NPU_GROUP_SETTING));
    public static final BlockItem AIRCONOUT1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "airconout1"), new BlockItem(MyBlockRegister.AIRCONOUT1, NPU_GROUP_SETTING));
    public static final BlockItem AIRCONOUT2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "airconout2"), new BlockItem(MyBlockRegister.AIRCONOUT2, NPU_GROUP_SETTING));
    public static final BlockItem ATABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "atable"), new BlockItem(MyBlockRegister.ATABLE, NPU_GROUP_SETTING));
    public static final BlockItem ATLAS_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "atlas"), new BlockItem(MyBlockRegister.ATLAS, NPU_GROUP_SETTING));
    public static final BlockItem BOX_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "box"), new BlockItem(MyBlockRegister.BOX, NPU_GROUP_SETTING));
    public static final BlockItem BOX1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "box1"), new BlockItem(MyBlockRegister.BOX1, NPU_GROUP_SETTING));
    public static final BlockItem CHAIR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "chair"), new BlockItem(MyBlockRegister.CHAIR, NPU_GROUP_SETTING));
    public static final BlockItem CHAIR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "chair1"), new BlockItem(MyBlockRegister.CHAIR1, NPU_GROUP_SETTING));
    public static final BlockItem CHAIR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "chair2"), new BlockItem(MyBlockRegister.CHAIR2, NPU_GROUP_SETTING));
    public static final BlockItem CP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cp"), new BlockItem(MyBlockRegister.CP, NPU_GROUP_SETTING));
    public static final BlockItem DT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "dt"), new BlockItem(MyBlockRegister.DT, NPU_GROUP_SETTING));
    public static final BlockItem ELAMP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "elamp"), new BlockItem(MyBlockRegister.ELAMP, NPU_GROUP_SETTING));
    public static final BlockItem ELECTRIC_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "electric"), new BlockItem(MyBlockRegister.ELECTRIC, NPU_GROUP_SETTING));
    public static final BlockItem FEXT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fext"), new BlockItem(MyBlockRegister.FEXT, NPU_GROUP_SETTING));
    public static final BlockItem FEXT1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fext1"), new BlockItem(MyBlockRegister.FEXT1, NPU_GROUP_SETTING));
    public static final BlockItem FOX_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "fox"), new BlockItem(MyBlockRegister.FOX, NPU_GROUP_SETTING));
    public static final BlockItem FURNACE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "furnace"), new BlockItem(MyBlockRegister.FURNACE, NPU_GROUP_SETTING));
    public static final BlockItem GBED_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "gbed"), new BlockItem(MyBlockRegister.GBED, NPU_GROUP_SETTING));
    public static final BlockItem GROUND_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "ground"), new BlockItem(MyBlockRegister.GROUND, NPU_GROUP_SETTING));
    public static final BlockItem GTABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "gtable"), new BlockItem(MyBlockRegister.GTABLE, NPU_GROUP_SETTING));
    public static final BlockItem HWATER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "hwater"), new BlockItem(MyBlockRegister.HWATER, NPU_GROUP_SETTING));
    public static final BlockItem KNIGHT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "knight"), new BlockItem(MyBlockRegister.KNIGHT, NPU_GROUP_SETTING));
    public static final BlockItem LCHAIR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "lchair"), new BlockItem(MyBlockRegister.LCHAIR, NPU_GROUP_SETTING));
    public static final BlockItem MP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "mp"), new BlockItem(MyBlockRegister.MP, NPU_GROUP_SETTING));
    public static final BlockItem OBSIDIANBLOCK_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "obsidianblock"), new BlockItem(MyBlockRegister.OBSIDIANBLOCK, NPU_GROUP_SETTING));
    public static final BlockItem OBSIDIANFRAME_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "obsidianframe"), new BlockItem(MyBlockRegister.OBSIDIANFRAME, NPU_GROUP_SETTING));
    public static final BlockItem PRINTER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "printer"), new BlockItem(MyBlockRegister.PRINTER, NPU_GROUP_SETTING));
    public static final BlockItem RADIATOR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "radiator"), new BlockItem(MyBlockRegister.RADIATOR, NPU_GROUP_SETTING));
    public static final BlockItem SHOP_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "shop"), new BlockItem(MyBlockRegister.SHOP, NPU_GROUP_SETTING));
    public static final BlockItem SHOP1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "shop1"), new BlockItem(MyBlockRegister.SHOP1, NPU_GROUP_SETTING));
    public static final BlockItem SHOP2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "shop2"), new BlockItem(MyBlockRegister.SHOP2, NPU_GROUP_SETTING));
    public static final BlockItem SIGN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sign"), new BlockItem(MyBlockRegister.SIGN, NPU_GROUP_SETTING));
    public static final BlockItem STONER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stoner"), new BlockItem(MyBlockRegister.STONER, NPU_GROUP_SETTING));
    public static final BlockItem STONER1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stoner1"), new BlockItem(MyBlockRegister.STONER1, NPU_GROUP_SETTING));
    public static final BlockItem STRAIGHTAHEADSIGN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "straightaheadsign"), new BlockItem(MyBlockRegister.STRAIGHTAHEADSIGN, NPU_GROUP_SETTING));
    public static final BlockItem TESTG_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "testg"), new BlockItem(MyBlockRegister.TESTG, NPU_GROUP_SETTING));
    public static final BlockItem TOILET_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "toilet"), new BlockItem(MyBlockRegister.TOILET, NPU_GROUP_SETTING));
    public static final BlockItem TTABLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "ttable"), new BlockItem(MyBlockRegister.TTABLE, NPU_GROUP_SETTING));
    public static final BlockItem URINAL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "urinal"), new BlockItem(MyBlockRegister.URINAL, NPU_GROUP_SETTING));

    // Paintings
    public static final BlockItem PAINTING_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "painting"), new BlockItem(MyBlockRegister.PAINTING, NPU_GROUP_SETTING));
    public static final BlockItem PAINTING1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "painting1"), new BlockItem(MyBlockRegister.PAINTING1, NPU_GROUP_SETTING));
    public static final BlockItem PAINTING2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "painting2"), new BlockItem(MyBlockRegister.PAINTING2, NPU_GROUP_SETTING));
    public static final BlockItem PAINTING3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "painting3"), new BlockItem(MyBlockRegister.PAINTING3, NPU_GROUP_SETTING));

    // Pipe
    public static final BlockItem PIPE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe1"), new BlockItem(MyBlockRegister.PIPE1, NPU_GROUP_SETTING));
    public static final BlockItem PIPE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe2"), new BlockItem(MyBlockRegister.PIPE2, NPU_GROUP_SETTING));
    public static final BlockItem PIPE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe3"), new BlockItem(MyBlockRegister.PIPE3, NPU_GROUP_SETTING));
    public static final BlockItem PIPE4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe4"), new BlockItem(MyBlockRegister.PIPE4, NPU_GROUP_SETTING));
    public static final BlockItem PIPE5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe5"), new BlockItem(MyBlockRegister.PIPE5, NPU_GROUP_SETTING));
    public static final BlockItem PIPE6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe6"), new BlockItem(MyBlockRegister.PIPE6, NPU_GROUP_SETTING));
    public static final BlockItem PIPE7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe7"), new BlockItem(MyBlockRegister.PIPE7, NPU_GROUP_SETTING));
    public static final BlockItem PIPE8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe8"), new BlockItem(MyBlockRegister.PIPE8, NPU_GROUP_SETTING));
    public static final BlockItem PIPE9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pipe9"), new BlockItem(MyBlockRegister.PIPE9, NPU_GROUP_SETTING));

    // Plants
    public static final BlockItem PLANT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "plant"), new BlockItem(MyBlockRegister.PLANT, NPU_GROUP_SETTING));
    public static final BlockItem PLANT1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "plant1"), new BlockItem(MyBlockRegister.PLANT1, NPU_GROUP_SETTING));
    public static final BlockItem PLANT2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "plant2"), new BlockItem(MyBlockRegister.PLANT2, NPU_GROUP_SETTING));

    // Platform
    public static final BlockItem CENTERAIRCONDITIONERBIAS_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "center_airconditioner_bias"), new BlockItem(MyBlockRegister.CENTERAIRCONDITIONERBIAS, NPU_GROUP_SETTING));
    public static final BlockItem CLASSROOMMICROPHONE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "classroom_microphone"), new BlockItem(MyBlockRegister.CLASSROOMMICROPHONE, NPU_GROUP_SETTING));
    public static final BlockItem METALTRASHCAN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "metal_trashcan"), new BlockItem(MyBlockRegister.METALTRASHCAN, NPU_GROUP_SETTING));
    public static final BlockItem PLATFORM_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "platform"), new BlockItem(MyBlockRegister.PLATFORM, NPU_GROUP_SETTING));
    public static final BlockItem PLATFORMCHAIR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "platform_chair"), new BlockItem(MyBlockRegister.PLATFORMCHAIR, NPU_GROUP_SETTING));
    public static final BlockItem PLATFORMCORNER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "platform_corner"), new BlockItem(MyBlockRegister.PLATFORMCORNER, NPU_GROUP_SETTING));
    public static final BlockItem PLATFORMDESK_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "platform_desk"), new BlockItem(MyBlockRegister.PLATFORMDESK, NPU_GROUP_SETTING));
    public static final BlockItem TOPAIRCONDITIONER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "top_airconditioner"), new BlockItem(MyBlockRegister.TOPAIRCONDITIONER, NPU_GROUP_SETTING));

    // Railings
    public static final BlockItem RAILING_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "railing"), new BlockItem(MyBlockRegister.RAILING, NPU_GROUP_SETTING));
    public static final BlockItem RAILING1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "railing1"), new BlockItem(MyBlockRegister.RAILING1, NPU_GROUP_SETTING));
    public static final BlockItem RAILING2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "railing2"), new BlockItem(MyBlockRegister.RAILING2, NPU_GROUP_SETTING));
    public static final BlockItem RAILING3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "railing3"), new BlockItem(MyBlockRegister.RAILING3, NPU_GROUP_SETTING));
    public static final BlockItem RAILING4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "railing4"), new BlockItem(MyBlockRegister.RAILING4, NPU_GROUP_SETTING));
    public static final BlockItem RAILING5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "railing5"), new BlockItem(MyBlockRegister.RAILING5, NPU_GROUP_SETTING));

    // Road
    public static final BlockItem CEMH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cemh"), new BlockItem(MyBlockRegister.CEMH, NPU_GROUP_SETTING));
    public static final BlockItem CEMT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "cemt"), new BlockItem(MyBlockRegister.CEMT, NPU_GROUP_SETTING));

    // Signs
    public static final BlockItem INSIGN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign"), new BlockItem(MyBlockRegister.INSIGN, NPU_GROUP_SETTING));
    public static final BlockItem INSIGN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign1"), new BlockItem(MyBlockRegister.INSIGN1, NPU_GROUP_SETTING));
    public static final BlockItem INSIGN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign2"), new BlockItem(MyBlockRegister.INSIGN2, NPU_GROUP_SETTING));
    public static final BlockItem INSIGN3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign3"), new BlockItem(MyBlockRegister.INSIGN3, NPU_GROUP_SETTING));
    public static final BlockItem INSIGN4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign4"), new BlockItem(MyBlockRegister.INSIGN4, NPU_GROUP_SETTING));
    public static final BlockItem INSIGN5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign5"), new BlockItem(MyBlockRegister.INSIGN5, NPU_GROUP_SETTING));
    public static final BlockItem INSIGN6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "insign6"), new BlockItem(MyBlockRegister.INSIGN6, NPU_GROUP_SETTING));
    public static final BlockItem OUTSIGN_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "outsign"), new BlockItem(MyBlockRegister.OUTSIGN, NPU_GROUP_SETTING));

    // Stair
    public static final BlockItem STAIR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair"), new BlockItem(MyBlockRegister.STAIR, NPU_GROUP_SETTING));
    public static final BlockItem STAIR1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair1"), new BlockItem(MyBlockRegister.STAIR1, NPU_GROUP_SETTING));
    public static final BlockItem STAIR2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair2"), new BlockItem(MyBlockRegister.STAIR2, NPU_GROUP_SETTING));
    public static final BlockItem STAIR3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair3"), new BlockItem(MyBlockRegister.STAIR3, NPU_GROUP_SETTING));
    public static final BlockItem STAIR4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair4"), new BlockItem(MyBlockRegister.STAIR4, NPU_GROUP_SETTING));
    public static final BlockItem STAIR5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair5"), new BlockItem(MyBlockRegister.STAIR5, NPU_GROUP_SETTING));
    public static final BlockItem STAIR6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "stair6"), new BlockItem(MyBlockRegister.STAIR6, NPU_GROUP_SETTING));

    // StarSignPack
    public static final BlockItem A_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "a"), new BlockItem(MyBlockRegister.A, NPU_GROUP_SETTING));
    public static final BlockItem B_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "b"), new BlockItem(MyBlockRegister.B, NPU_GROUP_SETTING));
    public static final BlockItem C_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "c"), new BlockItem(MyBlockRegister.C, NPU_GROUP_SETTING));
    public static final BlockItem D_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "d"), new BlockItem(MyBlockRegister.D, NPU_GROUP_SETTING));
    public static final BlockItem E_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "e"), new BlockItem(MyBlockRegister.E, NPU_GROUP_SETTING));
    public static final BlockItem F_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "f"), new BlockItem(MyBlockRegister.F, NPU_GROUP_SETTING));
    public static final BlockItem G_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "g"), new BlockItem(MyBlockRegister.G, NPU_GROUP_SETTING));
    public static final BlockItem SIT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sit"), new BlockItem(MyBlockRegister.SIT, NPU_GROUP_SETTING));
    public static final BlockItem SKY_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sky"), new BlockItem(MyBlockRegister.SKY, NPU_GROUP_SETTING));
    public static final BlockItem STAR_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "star"), new BlockItem(MyBlockRegister.STAR, NPU_GROUP_SETTING));

    // StreetLamp
    public static final BlockItem SL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sl1"), new BlockItem(MyBlockRegister.SL1, NPU_GROUP_SETTING));
    public static final BlockItem SL2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sl2"), new BlockItem(MyBlockRegister.SL2, NPU_GROUP_SETTING));
    public static final BlockItem SL3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "sl3"), new BlockItem(MyBlockRegister.SL3, NPU_GROUP_SETTING));

    // Trashs
    public static final BlockItem TOOL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "tool"), new BlockItem(MyBlockRegister.TOOL, NPU_GROUP_SETTING));
    public static final BlockItem TRASH_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "trash"), new BlockItem(MyBlockRegister.TRASH, NPU_GROUP_SETTING));
    public static final BlockItem TRASH1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "trash1"), new BlockItem(MyBlockRegister.TRASH1, NPU_GROUP_SETTING));
    public static final BlockItem TRASH2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "trash2"), new BlockItem(MyBlockRegister.TRASH2, NPU_GROUP_SETTING));
    public static final BlockItem TRASH3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "trash3"), new BlockItem(MyBlockRegister.TRASH3, NPU_GROUP_SETTING));
    public static final BlockItem TRASH4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "trash4"), new BlockItem(MyBlockRegister.TRASH4, NPU_GROUP_SETTING));

    // Trees
    public static final BlockItem TREE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "tree"), new BlockItem(MyBlockRegister.TREE, NPU_GROUP_SETTING));
    public static final BlockItem TREE1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "tree1"), new BlockItem(MyBlockRegister.TREE1, NPU_GROUP_SETTING));
    public static final BlockItem TREE2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "tree2"), new BlockItem(MyBlockRegister.TREE2, NPU_GROUP_SETTING));
    public static final BlockItem TREE3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "tree3"), new BlockItem(MyBlockRegister.TREE3, NPU_GROUP_SETTING));
    public static final BlockItem TREEHOLE_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "treehole"), new BlockItem(MyBlockRegister.TREEHOLE, NPU_GROUP_SETTING));

    // Walls
    public static final BlockItem WALL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall1"), new BlockItem(MyBlockRegister.WALL1, NPU_GROUP_SETTING));
    public static final BlockItem WALL10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall10"), new BlockItem(MyBlockRegister.WALL10, NPU_GROUP_SETTING));
    public static final BlockItem WALL11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall11"), new BlockItem(MyBlockRegister.WALL11, NPU_GROUP_SETTING));
    public static final BlockItem WALL12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall12"), new BlockItem(MyBlockRegister.WALL12, NPU_GROUP_SETTING));
    public static final BlockItem WALL13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall13"), new BlockItem(MyBlockRegister.WALL13, NPU_GROUP_SETTING));
    public static final BlockItem WALL14_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall14"), new BlockItem(MyBlockRegister.WALL14, NPU_GROUP_SETTING));
    public static final BlockItem WALL15_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall15"), new BlockItem(MyBlockRegister.WALL15, NPU_GROUP_SETTING));
    public static final BlockItem WALL2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall2"), new BlockItem(MyBlockRegister.WALL2, NPU_GROUP_SETTING));
    public static final BlockItem WALL3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall3"), new BlockItem(MyBlockRegister.WALL3, NPU_GROUP_SETTING));
    public static final BlockItem WALL4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall4"), new BlockItem(MyBlockRegister.WALL4, NPU_GROUP_SETTING));
    public static final BlockItem WALL5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall5"), new BlockItem(MyBlockRegister.WALL5, NPU_GROUP_SETTING));
    public static final BlockItem WALL6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall6"), new BlockItem(MyBlockRegister.WALL6, NPU_GROUP_SETTING));
    public static final BlockItem WALL7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall7"), new BlockItem(MyBlockRegister.WALL7, NPU_GROUP_SETTING));
    public static final BlockItem WALL8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall8"), new BlockItem(MyBlockRegister.WALL8, NPU_GROUP_SETTING));
    public static final BlockItem WALL9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wall9"), new BlockItem(MyBlockRegister.WALL9, NPU_GROUP_SETTING));

    // Washes
    public static final BlockItem WASH1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wash1"), new BlockItem(MyBlockRegister.WASH1, NPU_GROUP_SETTING));
    public static final BlockItem WASH2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wash2"), new BlockItem(MyBlockRegister.WASH2, NPU_GROUP_SETTING));
    public static final BlockItem WASH3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wash3"), new BlockItem(MyBlockRegister.WASH3, NPU_GROUP_SETTING));
    public static final BlockItem WASHER_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "washer"), new BlockItem(MyBlockRegister.WASHER, NPU_GROUP_SETTING));

    // WGWall
    public static final BlockItem WGWALL_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wgwall"), new BlockItem(MyBlockRegister.WGWALL, NPU_GROUP_SETTING));
    public static final BlockItem WGWALL1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wgwall1"), new BlockItem(MyBlockRegister.WGWALL1, NPU_GROUP_SETTING));
    public static final BlockItem WGWALL2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wgwall2"), new BlockItem(MyBlockRegister.WGWALL2, NPU_GROUP_SETTING));
    public static final BlockItem WGWALL3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wgwall3"), new BlockItem(MyBlockRegister.WGWALL3, NPU_GROUP_SETTING));
    public static final BlockItem WGWALL4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "wgwall4"), new BlockItem(MyBlockRegister.WGWALL4, NPU_GROUP_SETTING));

    // Windows

    // Windows.Black
    public static final BlockItem WINN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn1"), new BlockItem(MyBlockRegister.WINN1, NPU_GROUP_SETTING));
    public static final BlockItem WINN10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn10"), new BlockItem(MyBlockRegister.WINN10, NPU_GROUP_SETTING));
    public static final BlockItem WINN11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn11"), new BlockItem(MyBlockRegister.WINN11, NPU_GROUP_SETTING));
    public static final BlockItem WINN12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn12"), new BlockItem(MyBlockRegister.WINN12, NPU_GROUP_SETTING));
    public static final BlockItem WINN13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn13"), new BlockItem(MyBlockRegister.WINN13, NPU_GROUP_SETTING));
    public static final BlockItem WINN14_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn14"), new BlockItem(MyBlockRegister.WINN14, NPU_GROUP_SETTING));
    public static final BlockItem WINN15_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn15"), new BlockItem(MyBlockRegister.WINN15, NPU_GROUP_SETTING));
    public static final BlockItem WINN16_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn16"), new BlockItem(MyBlockRegister.WINN16, NPU_GROUP_SETTING));
    public static final BlockItem WINN17_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn17"), new BlockItem(MyBlockRegister.WINN17, NPU_GROUP_SETTING));
    public static final BlockItem WINN18_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn18"), new BlockItem(MyBlockRegister.WINN18, NPU_GROUP_SETTING));
    public static final BlockItem WINN19_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn19"), new BlockItem(MyBlockRegister.WINN19, NPU_GROUP_SETTING));
    public static final BlockItem WINN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn2"), new BlockItem(MyBlockRegister.WINN2, NPU_GROUP_SETTING));
    public static final BlockItem WINN20_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn20"), new BlockItem(MyBlockRegister.WINN20, NPU_GROUP_SETTING));
    public static final BlockItem WINN3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn3"), new BlockItem(MyBlockRegister.WINN3, NPU_GROUP_SETTING));
    public static final BlockItem WINN4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn4"), new BlockItem(MyBlockRegister.WINN4, NPU_GROUP_SETTING));
    public static final BlockItem WINN5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn5"), new BlockItem(MyBlockRegister.WINN5, NPU_GROUP_SETTING));
    public static final BlockItem WINN6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn6"), new BlockItem(MyBlockRegister.WINN6, NPU_GROUP_SETTING));
    public static final BlockItem WINN7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn7"), new BlockItem(MyBlockRegister.WINN7, NPU_GROUP_SETTING));
    public static final BlockItem WINN8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn8"), new BlockItem(MyBlockRegister.WINN8, NPU_GROUP_SETTING));
    public static final BlockItem WINN9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winn9"), new BlockItem(MyBlockRegister.WINN9, NPU_GROUP_SETTING));

    // Windows.Blue
    public static final BlockItem WINNN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn1"), new BlockItem(MyBlockRegister.WINNN1, NPU_GROUP_SETTING));
    public static final BlockItem WINNN10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn10"), new BlockItem(MyBlockRegister.WINNN10, NPU_GROUP_SETTING));
    public static final BlockItem WINNN11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn11"), new BlockItem(MyBlockRegister.WINNN11, NPU_GROUP_SETTING));
    public static final BlockItem WINNN12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn12"), new BlockItem(MyBlockRegister.WINNN12, NPU_GROUP_SETTING));
    public static final BlockItem WINNN13_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn13"), new BlockItem(MyBlockRegister.WINNN13, NPU_GROUP_SETTING));
    public static final BlockItem WINNN14_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn14"), new BlockItem(MyBlockRegister.WINNN14, NPU_GROUP_SETTING));
    public static final BlockItem WINNN15_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn15"), new BlockItem(MyBlockRegister.WINNN15, NPU_GROUP_SETTING));
    public static final BlockItem WINNN16_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn16"), new BlockItem(MyBlockRegister.WINNN16, NPU_GROUP_SETTING));
    public static final BlockItem WINNN17_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn17"), new BlockItem(MyBlockRegister.WINNN17, NPU_GROUP_SETTING));
    public static final BlockItem WINNN18_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn18"), new BlockItem(MyBlockRegister.WINNN18, NPU_GROUP_SETTING));
    public static final BlockItem WINNN19_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn19"), new BlockItem(MyBlockRegister.WINNN19, NPU_GROUP_SETTING));
    public static final BlockItem WINNN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn2"), new BlockItem(MyBlockRegister.WINNN2, NPU_GROUP_SETTING));
    public static final BlockItem WINNN20_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn20"), new BlockItem(MyBlockRegister.WINNN20, NPU_GROUP_SETTING));
    public static final BlockItem WINNN21_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn21"), new BlockItem(MyBlockRegister.WINNN21, NPU_GROUP_SETTING));
    public static final BlockItem WINNN22_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn22"), new BlockItem(MyBlockRegister.WINNN22, NPU_GROUP_SETTING));
    public static final BlockItem WINNN23_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn23"), new BlockItem(MyBlockRegister.WINNN23, NPU_GROUP_SETTING));
    public static final BlockItem WINNN3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn3"), new BlockItem(MyBlockRegister.WINNN3, NPU_GROUP_SETTING));
    public static final BlockItem WINNN4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn4"), new BlockItem(MyBlockRegister.WINNN4, NPU_GROUP_SETTING));
    public static final BlockItem WINNN5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn5"), new BlockItem(MyBlockRegister.WINNN5, NPU_GROUP_SETTING));
    public static final BlockItem WINNN6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn6"), new BlockItem(MyBlockRegister.WINNN6, NPU_GROUP_SETTING));
    public static final BlockItem WINNN7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn7"), new BlockItem(MyBlockRegister.WINNN7, NPU_GROUP_SETTING));
    public static final BlockItem WINNN8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn8"), new BlockItem(MyBlockRegister.WINNN8, NPU_GROUP_SETTING));
    public static final BlockItem WINNN9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winnn9"), new BlockItem(MyBlockRegister.WINNN9, NPU_GROUP_SETTING));

    // Windows.Normal
    public static final BlockItem WIN1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win1"), new BlockItem(MyBlockRegister.WIN1, NPU_GROUP_SETTING));
    public static final BlockItem WIN10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win10"), new BlockItem(MyBlockRegister.WIN10, NPU_GROUP_SETTING));
    public static final BlockItem WIN11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win11"), new BlockItem(MyBlockRegister.WIN11, NPU_GROUP_SETTING));
    public static final BlockItem WIN2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win2"), new BlockItem(MyBlockRegister.WIN2, NPU_GROUP_SETTING));
    public static final BlockItem WIN3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win3"), new BlockItem(MyBlockRegister.WIN3, NPU_GROUP_SETTING));
    public static final BlockItem WIN4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win4"), new BlockItem(MyBlockRegister.WIN4, NPU_GROUP_SETTING));
    public static final BlockItem WIN5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win5"), new BlockItem(MyBlockRegister.WIN5, NPU_GROUP_SETTING));
    public static final BlockItem WIN6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win6"), new BlockItem(MyBlockRegister.WIN6, NPU_GROUP_SETTING));
    public static final BlockItem WIN7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win7"), new BlockItem(MyBlockRegister.WIN7, NPU_GROUP_SETTING));
    public static final BlockItem WIN8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win8"), new BlockItem(MyBlockRegister.WIN8, NPU_GROUP_SETTING));
    public static final BlockItem WIN9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "win9"), new BlockItem(MyBlockRegister.WIN9, NPU_GROUP_SETTING));
    public static final BlockItem WINDOW10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "window10"), new BlockItem(MyBlockRegister.WINDOW10, NPU_GROUP_SETTING));
    public static final BlockItem WINDOW11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "window11"), new BlockItem(MyBlockRegister.WINDOW11, NPU_GROUP_SETTING));
    public static final BlockItem WINDOWOUT_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "windowout"), new BlockItem(MyBlockRegister.WINDOWOUT, NPU_GROUP_SETTING));

    // Windows.White
    public static final BlockItem WINW1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winw1"), new BlockItem(MyBlockRegister.WINW1, NPU_GROUP_SETTING));
    public static final BlockItem WINW2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winw2"), new BlockItem(MyBlockRegister.WINW2, NPU_GROUP_SETTING));
    public static final BlockItem WINW3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "winw3"), new BlockItem(MyBlockRegister.WINW3, NPU_GROUP_SETTING));

    // YF
    public static final BlockItem YF_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf"), new BlockItem(MyBlockRegister.YF, NPU_GROUP_SETTING));
    public static final BlockItem YF1_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf1"), new BlockItem(MyBlockRegister.YF1, NPU_GROUP_SETTING));
    public static final BlockItem YF10_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf10"), new BlockItem(MyBlockRegister.YF10, NPU_GROUP_SETTING));
    public static final BlockItem YF11_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf11"), new BlockItem(MyBlockRegister.YF11, NPU_GROUP_SETTING));
    public static final BlockItem YF12_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf12"), new BlockItem(MyBlockRegister.YF12, NPU_GROUP_SETTING));
    public static final BlockItem YF2_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf2"), new BlockItem(MyBlockRegister.YF2, NPU_GROUP_SETTING));
    public static final BlockItem YF3_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf3"), new BlockItem(MyBlockRegister.YF3, NPU_GROUP_SETTING));
    public static final BlockItem YF4_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf4"), new BlockItem(MyBlockRegister.YF4, NPU_GROUP_SETTING));
    public static final BlockItem YF5_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf5"), new BlockItem(MyBlockRegister.YF5, NPU_GROUP_SETTING));
    public static final BlockItem YF6_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf6"), new BlockItem(MyBlockRegister.YF6, NPU_GROUP_SETTING));
    public static final BlockItem YF7_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf7"), new BlockItem(MyBlockRegister.YF7, NPU_GROUP_SETTING));
    public static final BlockItem YF8_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf8"), new BlockItem(MyBlockRegister.YF8, NPU_GROUP_SETTING));
    public static final BlockItem YF9_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "yf9"), new BlockItem(MyBlockRegister.YF9, NPU_GROUP_SETTING));


    public static final BlockItem CLOCK_HAND_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "clockhand"), new BlockItem(MyBlockRegister.CLOCK_HAND, NPU_GROUP_SETTING));


    public static final BlockItem PAVILION006_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion006"), new BlockItem(MyBlockRegister.PAVILION006, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION007_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion007"), new BlockItem(MyBlockRegister.PAVILION007, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION136_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion136"), new BlockItem(MyBlockRegister.PAVILION136, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION146_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion146"), new BlockItem(MyBlockRegister.PAVILION146, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION156_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion156"), new BlockItem(MyBlockRegister.PAVILION156, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION157_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion157"), new BlockItem(MyBlockRegister.PAVILION157, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION166_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion166"), new BlockItem(MyBlockRegister.PAVILION166, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION176_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion176"), new BlockItem(MyBlockRegister.PAVILION176, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION216_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion216"), new BlockItem(MyBlockRegister.PAVILION216, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION217_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion217"), new BlockItem(MyBlockRegister.PAVILION217, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION226_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion226"), new BlockItem(MyBlockRegister.PAVILION226, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION227_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion227"), new BlockItem(MyBlockRegister.PAVILION227, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION231_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion231"), new BlockItem(MyBlockRegister.PAVILION231, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION232_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion232"), new BlockItem(MyBlockRegister.PAVILION232, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION235_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion235"), new BlockItem(MyBlockRegister.PAVILION235, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION236_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion236"), new BlockItem(MyBlockRegister.PAVILION236, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION241_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion241"), new BlockItem(MyBlockRegister.PAVILION241, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION242_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion242"), new BlockItem(MyBlockRegister.PAVILION242, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION244_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion244"), new BlockItem(MyBlockRegister.PAVILION244, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION245_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion245"), new BlockItem(MyBlockRegister.PAVILION245, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION246_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion246"), new BlockItem(MyBlockRegister.PAVILION246, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION251_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion251"), new BlockItem(MyBlockRegister.PAVILION251, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION252_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion252"), new BlockItem(MyBlockRegister.PAVILION252, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION253_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion253"), new BlockItem(MyBlockRegister.PAVILION253, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION254_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion254"), new BlockItem(MyBlockRegister.PAVILION254, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION255_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion255"), new BlockItem(MyBlockRegister.PAVILION255, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION256_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion256"), new BlockItem(MyBlockRegister.PAVILION256, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION257_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion257"), new BlockItem(MyBlockRegister.PAVILION257, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION261_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion261"), new BlockItem(MyBlockRegister.PAVILION261, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION262_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion262"), new BlockItem(MyBlockRegister.PAVILION262, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION264_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion264"), new BlockItem(MyBlockRegister.PAVILION264, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION265_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion265"), new BlockItem(MyBlockRegister.PAVILION265, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION266_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion266"), new BlockItem(MyBlockRegister.PAVILION266, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION271_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion271"), new BlockItem(MyBlockRegister.PAVILION271, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION272_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion272"), new BlockItem(MyBlockRegister.PAVILION272, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION275_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion275"), new BlockItem(MyBlockRegister.PAVILION275, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION276_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion276"), new BlockItem(MyBlockRegister.PAVILION276, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION286_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion286"), new BlockItem(MyBlockRegister.PAVILION286, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION287_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion287"), new BlockItem(MyBlockRegister.PAVILION287, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION296_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion296"), new BlockItem(MyBlockRegister.PAVILION296, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION297_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion297"), new BlockItem(MyBlockRegister.PAVILION297, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION325_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion325"), new BlockItem(MyBlockRegister.PAVILION325, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION326_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion326"), new BlockItem(MyBlockRegister.PAVILION326, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION327_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion327"), new BlockItem(MyBlockRegister.PAVILION327, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION331_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion331"), new BlockItem(MyBlockRegister.PAVILION331, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION332_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion332"), new BlockItem(MyBlockRegister.PAVILION332, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION333_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion333"), new BlockItem(MyBlockRegister.PAVILION333, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION334_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion334"), new BlockItem(MyBlockRegister.PAVILION334, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION335_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion335"), new BlockItem(MyBlockRegister.PAVILION335, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION336_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion336"), new BlockItem(MyBlockRegister.PAVILION336, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION337_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion337"), new BlockItem(MyBlockRegister.PAVILION337, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION341_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion341"), new BlockItem(MyBlockRegister.PAVILION341, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION344_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion344"), new BlockItem(MyBlockRegister.PAVILION344, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION345_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion345"), new BlockItem(MyBlockRegister.PAVILION345, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION346_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion346"), new BlockItem(MyBlockRegister.PAVILION346, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION347_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion347"), new BlockItem(MyBlockRegister.PAVILION347, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION355_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion355"), new BlockItem(MyBlockRegister.PAVILION355, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION356_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion356"), new BlockItem(MyBlockRegister.PAVILION356, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION357_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion357"), new BlockItem(MyBlockRegister.PAVILION357, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION358_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion358"), new BlockItem(MyBlockRegister.PAVILION358, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION361_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion361"), new BlockItem(MyBlockRegister.PAVILION361, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION364_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion364"), new BlockItem(MyBlockRegister.PAVILION364, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION365_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion365"), new BlockItem(MyBlockRegister.PAVILION365, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION366_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion366"), new BlockItem(MyBlockRegister.PAVILION366, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION367_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion367"), new BlockItem(MyBlockRegister.PAVILION367, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION371_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion371"), new BlockItem(MyBlockRegister.PAVILION371, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION372_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion372"), new BlockItem(MyBlockRegister.PAVILION372, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION373_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion373"), new BlockItem(MyBlockRegister.PAVILION373, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION374_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion374"), new BlockItem(MyBlockRegister.PAVILION374, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION375_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion375"), new BlockItem(MyBlockRegister.PAVILION375, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION376_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion376"), new BlockItem(MyBlockRegister.PAVILION376, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION377_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion377"), new BlockItem(MyBlockRegister.PAVILION377, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION385_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion385"), new BlockItem(MyBlockRegister.PAVILION385, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION386_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion386"), new BlockItem(MyBlockRegister.PAVILION386, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION387_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion387"), new BlockItem(MyBlockRegister.PAVILION387, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION426_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion426"), new BlockItem(MyBlockRegister.PAVILION426, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION434_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion434"), new BlockItem(MyBlockRegister.PAVILION434, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION435_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion435"), new BlockItem(MyBlockRegister.PAVILION435, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION436_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion436"), new BlockItem(MyBlockRegister.PAVILION436, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION437_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion437"), new BlockItem(MyBlockRegister.PAVILION437, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION445_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion445"), new BlockItem(MyBlockRegister.PAVILION445, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION446_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion446"), new BlockItem(MyBlockRegister.PAVILION446, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION447_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion447"), new BlockItem(MyBlockRegister.PAVILION447, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION448_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion448"), new BlockItem(MyBlockRegister.PAVILION448, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION455_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion455"), new BlockItem(MyBlockRegister.PAVILION455, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION456_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion456"), new BlockItem(MyBlockRegister.PAVILION456, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION457_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion457"), new BlockItem(MyBlockRegister.PAVILION457, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION458_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion458"), new BlockItem(MyBlockRegister.PAVILION458, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION459_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion459"), new BlockItem(MyBlockRegister.PAVILION459, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION459__ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion459_"), new BlockItem(MyBlockRegister.PAVILION459_, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION465_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion465"), new BlockItem(MyBlockRegister.PAVILION465, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION466_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion466"), new BlockItem(MyBlockRegister.PAVILION466, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION467_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion467"), new BlockItem(MyBlockRegister.PAVILION467, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION468_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion468"), new BlockItem(MyBlockRegister.PAVILION468, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION471_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion471"), new BlockItem(MyBlockRegister.PAVILION471, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION472_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion472"), new BlockItem(MyBlockRegister.PAVILION472, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION475_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion475"), new BlockItem(MyBlockRegister.PAVILION475, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION476_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion476"), new BlockItem(MyBlockRegister.PAVILION476, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION477_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion477"), new BlockItem(MyBlockRegister.PAVILION477, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION478_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion478"), new BlockItem(MyBlockRegister.PAVILION478, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION496_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion496"), new BlockItem(MyBlockRegister.PAVILION496, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION535_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion535"), new BlockItem(MyBlockRegister.PAVILION535, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION545_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion545"), new BlockItem(MyBlockRegister.PAVILION545, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION555_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion555"), new BlockItem(MyBlockRegister.PAVILION555, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION565_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion565"), new BlockItem(MyBlockRegister.PAVILION565, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION575_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion575"), new BlockItem(MyBlockRegister.PAVILION575, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION631_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion631"), new BlockItem(MyBlockRegister.PAVILION631, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION632_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion632"), new BlockItem(MyBlockRegister.PAVILION632, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION671_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion671"), new BlockItem(MyBlockRegister.PAVILION671, NPU_PAVILION_SETTING));
    public static final BlockItem PAVILION672_ITEM = Registry.register(Registry.ITEM,
            new Identifier("npu", "pavilion672"), new BlockItem(MyBlockRegister.PAVILION672, NPU_PAVILION_SETTING));

}

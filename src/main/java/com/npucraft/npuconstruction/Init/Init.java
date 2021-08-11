package com.npucraft.npuconstruction.Init;

import com.npucraft.npuconstruction.BlockEntity.ClockHand.ClockHandBlockEntity;
import com.npucraft.npuconstruction.Block.Vehicle.ARJ;
import com.npucraft.npuconstruction.Init.Register.MyBlockEntityRegister;
import com.npucraft.npuconstruction.Init.Register.MyBlockRegister;
import com.npucraft.npuconstruction.Init.Register.MyItemRegister;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.npucraft.npuconstruction.Init.Register.MyRegister;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.BBed.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Bikes.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Camera.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Ceiling.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Constructions.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Decorations.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Decs.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Desks.Blue.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Desks.Wood.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.DHalls.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Doors.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Doors.Black.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Doors.White.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Drinks.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Fence.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Floors.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day221.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day222.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day228.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day310.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Day312.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.FlowerDid.Others.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.G.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Girl.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Guns.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.HandRail.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Lights.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Market.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Others.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Paintings.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Pipe.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Plants.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Platform.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Railings.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Road.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Signs.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Stair.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.StarSignPack.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.StreetLamp.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Trashs.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Trees.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Walls.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Washes.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.WGWall.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Windows.Black.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Windows.Blue.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Windows.Normal.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.Windows.White.*;
import com.npucraft.npuconstruction.Block.FromForge1_12_2.YF.*;
import net.minecraft.item.ItemGroup;

public class Init {
    public static String NAMESPACE_NPU = "npu";
    public static ItemGroup GROUP_NPU = MyItemRegister.NPU_GROUP;

    public static void initAll(){
        initFromForge1_12_2();
        initVehicle();

        new MyBlockRegister();
        new MyBlockEntityRegister();


//        initBlockEntity();
    }




    private static void initVehicle(){
        MyRegister.registerBlock(new ARJ(), NAMESPACE_NPU, "arj", MyItemRegister.NPU_VEHICLE);
    }



    private static void initBlockEntity(){
//        ClockHandBlockEntity.BlockEntity = Registry.register(Registry.BLOCK_ENTITY_TYPE, "npu:clockhand_blockentity",
//                BlockEntityType.Builder.create(ClockHandBlockEntity::new,
//                        Registry.BLOCK.get(new Identifier(NAMESPACE_NPU, "clockhand"))).build(null));
        Registry.register(Registry.BLOCK_ENTITY_TYPE, "npu:clockhand_blockentity",
                BlockEntityType.Builder.create(ClockHandBlockEntity::new,
                        Registry.BLOCK.get(new Identifier(NAMESPACE_NPU, "clockhand"))).build(null));

    }

    private static void initFromForge1_12_2(){
        // BBed
        MyRegister.registerBlock(new BBed2L(), NAMESPACE_NPU, "bbed2l", GROUP_NPU);
        MyRegister.registerBlock(new BBed2R(), NAMESPACE_NPU, "bbed2r", GROUP_NPU);
        MyRegister.registerBlock(new BBed2R1(), NAMESPACE_NPU, "bbed2r1", GROUP_NPU);
        MyRegister.registerBlock(new BBedL(), NAMESPACE_NPU, "bbedl", GROUP_NPU);
        MyRegister.registerBlock(new BBedR(), NAMESPACE_NPU, "bbedr", GROUP_NPU);

        // Bikes
        MyRegister.registerBlock(new Bike1(), NAMESPACE_NPU, "bike1", GROUP_NPU);
        MyRegister.registerBlock(new Bike2(), NAMESPACE_NPU, "bike2", GROUP_NPU);
        MyRegister.registerBlock(new Bike3(), NAMESPACE_NPU, "bike3", GROUP_NPU);
        MyRegister.registerBlock(new Bike4(), NAMESPACE_NPU, "bike4", GROUP_NPU);

        // Camera
        MyRegister.registerBlock(new Cam1(), NAMESPACE_NPU, "cam1", GROUP_NPU);
        MyRegister.registerBlock(new Cam2(), NAMESPACE_NPU, "cam2", GROUP_NPU);

        // Ceiling
        MyRegister.registerBlock(new C1(), NAMESPACE_NPU, "c1", GROUP_NPU);
        MyRegister.registerBlock(new C2(), NAMESPACE_NPU, "c2", GROUP_NPU);
        MyRegister.registerBlock(new C3(), NAMESPACE_NPU, "c3", GROUP_NPU);
        MyRegister.registerBlock(new C4(), NAMESPACE_NPU, "c4", GROUP_NPU);
        MyRegister.registerBlock(new C5(), NAMESPACE_NPU, "c5", GROUP_NPU);

        // Constructions
        MyRegister.registerBlock(new BPDown(), NAMESPACE_NPU, "bpdown", GROUP_NPU);
        MyRegister.registerBlock(new BPUp(), NAMESPACE_NPU, "bpup", GROUP_NPU);
        MyRegister.registerBlock(new BRailing(), NAMESPACE_NPU, "brailing", GROUP_NPU);
        MyRegister.registerBlock(new CCH(), NAMESPACE_NPU, "cch", GROUP_NPU);
        MyRegister.registerBlock(new Mesh(), NAMESPACE_NPU, "mesh", GROUP_NPU);
        MyRegister.registerBlock(new NN(), NAMESPACE_NPU, "nn", GROUP_NPU);
        MyRegister.registerBlock(new QH(), NAMESPACE_NPU, "qh", GROUP_NPU);
        MyRegister.registerBlock(new RoadBlock(), NAMESPACE_NPU, "roadblock", GROUP_NPU);
        MyRegister.registerBlock(new TestBlock(), NAMESPACE_NPU, "testblock", GROUP_NPU);
        MyRegister.registerBlock(new WindowFrame(), NAMESPACE_NPU, "windowframe", GROUP_NPU);

        // Decorations
        MyRegister.registerBlock(new Alu(), NAMESPACE_NPU, "alu", GROUP_NPU);
        MyRegister.registerBlock(new Board(), NAMESPACE_NPU, "board", GROUP_NPU);
        MyRegister.registerBlock(new Cal(), NAMESPACE_NPU, "cal", GROUP_NPU);
        MyRegister.registerBlock(new CBB(), NAMESPACE_NPU, "cbb", GROUP_NPU);
        MyRegister.registerBlock(new Exit(), NAMESPACE_NPU, "exit", GROUP_NPU);
        MyRegister.registerBlock(new Fan(), NAMESPACE_NPU, "fan", GROUP_NPU);
        MyRegister.registerBlock(new FC(), NAMESPACE_NPU, "fc", GROUP_NPU);
        MyRegister.registerBlock(new Mirror(), NAMESPACE_NPU, "mirror", GROUP_NPU);
        MyRegister.registerBlock(new N1(), NAMESPACE_NPU, "n1", GROUP_NPU);
        MyRegister.registerBlock(new N2(), NAMESPACE_NPU, "n2", GROUP_NPU);
        MyRegister.registerBlock(new Projector(), NAMESPACE_NPU, "projector", GROUP_NPU);
        MyRegister.registerBlock(new SC(), NAMESPACE_NPU, "sc", GROUP_NPU);
        MyRegister.registerBlock(new Sign1(), NAMESPACE_NPU, "sign1", GROUP_NPU);
        MyRegister.registerBlock(new Sign2(), NAMESPACE_NPU, "sign2", GROUP_NPU);
        MyRegister.registerBlock(new Sign3(), NAMESPACE_NPU, "sign3", GROUP_NPU);
        MyRegister.registerBlock(new Tele(), NAMESPACE_NPU, "tele", GROUP_NPU);
        MyRegister.registerBlock(new Voltage(), NAMESPACE_NPU, "voltage", GROUP_NPU);
        MyRegister.registerBlock(new WBoard(), NAMESPACE_NPU, "wboard", GROUP_NPU);
        MyRegister.registerBlock(new WTable(), NAMESPACE_NPU, "wtable", GROUP_NPU);

        // Decs
        MyRegister.registerBlock(new Dec1(), NAMESPACE_NPU, "dec1", GROUP_NPU);
        MyRegister.registerBlock(new Dec2(), NAMESPACE_NPU, "dec2", GROUP_NPU);
        MyRegister.registerBlock(new Dec3(), NAMESPACE_NPU, "dec3", GROUP_NPU);
        MyRegister.registerBlock(new Dec4(), NAMESPACE_NPU, "dec4", GROUP_NPU);

        // Desks

        // Desks.Blue
        MyRegister.registerBlock(new BlueClassroomDesk1(), NAMESPACE_NPU, "blueclassroomdesk1", GROUP_NPU);
        MyRegister.registerBlock(new BlueClassroomDesk2(), NAMESPACE_NPU, "blueclassroomdesk2", GROUP_NPU);
        MyRegister.registerBlock(new BlueClassroomDesk3(), NAMESPACE_NPU, "blueclassroomdesk3", GROUP_NPU);
        MyRegister.registerBlock(new BlueClassroomDesk4(), NAMESPACE_NPU, "blueclassroomdesk4", GROUP_NPU);
        MyRegister.registerBlock(new BlueClassroomDesk5(), NAMESPACE_NPU, "blueclassroomdesk5", GROUP_NPU);

        // Desks.Wood
        MyRegister.registerBlock(new WoodClassroomDesk1(), NAMESPACE_NPU, "woodclassroomdesk1", GROUP_NPU);
        MyRegister.registerBlock(new WoodClassroomDesk2(), NAMESPACE_NPU, "woodclassroomdesk2", GROUP_NPU);
        MyRegister.registerBlock(new WoodClassroomDesk3(), NAMESPACE_NPU, "woodclassroomdesk3", GROUP_NPU);
        MyRegister.registerBlock(new WoodClassroomDesk4(), NAMESPACE_NPU, "woodclassroomdesk4", GROUP_NPU);
        MyRegister.registerBlock(new WoodClassroomDesk5(), NAMESPACE_NPU, "woodclassroomdesk5", GROUP_NPU);

        // DHalls
        MyRegister.registerBlock(new DHall(), NAMESPACE_NPU, "dhall", GROUP_NPU);
        MyRegister.registerBlock(new DHall1(), NAMESPACE_NPU, "dhall1", GROUP_NPU);
        MyRegister.registerBlock(new DHall10(), NAMESPACE_NPU, "dhall10", GROUP_NPU);
        MyRegister.registerBlock(new DHall11(), NAMESPACE_NPU, "dhall11", GROUP_NPU);
        MyRegister.registerBlock(new DHall12(), NAMESPACE_NPU, "dhall12", GROUP_NPU);
        MyRegister.registerBlock(new DHall13(), NAMESPACE_NPU, "dhall13", GROUP_NPU);
        MyRegister.registerBlock(new DHall2(), NAMESPACE_NPU, "dhall2", GROUP_NPU);
        MyRegister.registerBlock(new DHall3(), NAMESPACE_NPU, "dhall3", GROUP_NPU);
        MyRegister.registerBlock(new DHall4(), NAMESPACE_NPU, "dhall4", GROUP_NPU);
        MyRegister.registerBlock(new DHall5(), NAMESPACE_NPU, "dhall5", GROUP_NPU);
        MyRegister.registerBlock(new DHall6(), NAMESPACE_NPU, "dhall6", GROUP_NPU);
        MyRegister.registerBlock(new DHall7(), NAMESPACE_NPU, "dhall7", GROUP_NPU);
        MyRegister.registerBlock(new DHall8(), NAMESPACE_NPU, "dhall8", GROUP_NPU);
        MyRegister.registerBlock(new DHall9(), NAMESPACE_NPU, "dhall9", GROUP_NPU);

        // Doors
        MyRegister.registerBlock(new Bath(), NAMESPACE_NPU, "bath", GROUP_NPU);
        MyRegister.registerBlock(new BFrame(), NAMESPACE_NPU, "bframe", GROUP_NPU);
        MyRegister.registerBlock(new BFrame1(), NAMESPACE_NPU, "bframe1", GROUP_NPU);
        MyRegister.registerBlock(new BFrame2(), NAMESPACE_NPU, "bframe2", GROUP_NPU);

        // Doors.Black
        MyRegister.registerBlock(new DB1(), NAMESPACE_NPU, "db1", GROUP_NPU);
        MyRegister.registerBlock(new DB2(), NAMESPACE_NPU, "db2", GROUP_NPU);
        MyRegister.registerBlock(new DB3(), NAMESPACE_NPU, "db3", GROUP_NPU);
        MyRegister.registerBlock(new DB4(), NAMESPACE_NPU, "db4", GROUP_NPU);
        MyRegister.registerBlock(new DB5(), NAMESPACE_NPU, "db5", GROUP_NPU);
        MyRegister.registerBlock(new DB6(), NAMESPACE_NPU, "db6", GROUP_NPU);
        MyRegister.registerBlock(new DB7(), NAMESPACE_NPU, "db7", GROUP_NPU);
        MyRegister.registerBlock(new DB8(), NAMESPACE_NPU, "db8", GROUP_NPU);
        MyRegister.registerBlock(new D1(), NAMESPACE_NPU, "d1", GROUP_NPU);
        MyRegister.registerBlock(new D2(), NAMESPACE_NPU, "d2", GROUP_NPU);
        MyRegister.registerBlock(new D3(), NAMESPACE_NPU, "d3", GROUP_NPU);
        MyRegister.registerBlock(new D4(), NAMESPACE_NPU, "d4", GROUP_NPU);
        MyRegister.registerBlock(new D5(), NAMESPACE_NPU, "d5", GROUP_NPU);
        MyRegister.registerBlock(new D6(), NAMESPACE_NPU, "d6", GROUP_NPU);
        MyRegister.registerBlock(new D7(), NAMESPACE_NPU, "d7", GROUP_NPU);
        MyRegister.registerBlock(new Door(), NAMESPACE_NPU, "door", GROUP_NPU);
        MyRegister.registerBlock(new Door1(), NAMESPACE_NPU, "door1", GROUP_NPU);
        MyRegister.registerBlock(new Door10(), NAMESPACE_NPU, "door10", GROUP_NPU);
        MyRegister.registerBlock(new Door2(), NAMESPACE_NPU, "door2", GROUP_NPU);
        MyRegister.registerBlock(new Door3(), NAMESPACE_NPU, "door3", GROUP_NPU);
        MyRegister.registerBlock(new Door4(), NAMESPACE_NPU, "door4", GROUP_NPU);
        MyRegister.registerBlock(new Door5(), NAMESPACE_NPU, "door5", GROUP_NPU);
        MyRegister.registerBlock(new Door6(), NAMESPACE_NPU, "door6", GROUP_NPU);
        MyRegister.registerBlock(new Door7(), NAMESPACE_NPU, "door7", GROUP_NPU);
        MyRegister.registerBlock(new Door8(), NAMESPACE_NPU, "door8", GROUP_NPU);
        MyRegister.registerBlock(new Door9(), NAMESPACE_NPU, "door9", GROUP_NPU);
        MyRegister.registerBlock(new EleV(), NAMESPACE_NPU, "elev", GROUP_NPU);
        MyRegister.registerBlock(new SDFrame(), NAMESPACE_NPU, "sdframe", GROUP_NPU);

        // Doors.White
        MyRegister.registerBlock(new DW1(), NAMESPACE_NPU, "dw1", GROUP_NPU);
        MyRegister.registerBlock(new DW10(), NAMESPACE_NPU, "dw10", GROUP_NPU);
        MyRegister.registerBlock(new DW2(), NAMESPACE_NPU, "dw2", GROUP_NPU);
        MyRegister.registerBlock(new DW3(), NAMESPACE_NPU, "dw3", GROUP_NPU);
        MyRegister.registerBlock(new DW4(), NAMESPACE_NPU, "dw4", GROUP_NPU);
        MyRegister.registerBlock(new DW5(), NAMESPACE_NPU, "dw5", GROUP_NPU);
        MyRegister.registerBlock(new DW6(), NAMESPACE_NPU, "dw6", GROUP_NPU);
        MyRegister.registerBlock(new DW7(), NAMESPACE_NPU, "dw7", GROUP_NPU);
        MyRegister.registerBlock(new DW8(), NAMESPACE_NPU, "dw8", GROUP_NPU);
        MyRegister.registerBlock(new DW9(), NAMESPACE_NPU, "dw9", GROUP_NPU);

        // Drinks
        MyRegister.registerBlock(new Drink(), NAMESPACE_NPU, "drink", GROUP_NPU);
        MyRegister.registerBlock(new Drink1(), NAMESPACE_NPU, "drink1", GROUP_NPU);
        MyRegister.registerBlock(new Drink3(), NAMESPACE_NPU, "drink3", GROUP_NPU);
        MyRegister.registerBlock(new Drink4(), NAMESPACE_NPU, "drink4", GROUP_NPU);
        MyRegister.registerBlock(new Drink5(), NAMESPACE_NPU, "drink5", GROUP_NPU);
        MyRegister.registerBlock(new Drink6(), NAMESPACE_NPU, "drink6", GROUP_NPU);

        // Fence
        MyRegister.registerBlock(new Fence1(), NAMESPACE_NPU, "fence1", GROUP_NPU);
        MyRegister.registerBlock(new Fence10(), NAMESPACE_NPU, "fence10", GROUP_NPU);
        MyRegister.registerBlock(new Fence11(), NAMESPACE_NPU, "fence11", GROUP_NPU);
        MyRegister.registerBlock(new Fence2(), NAMESPACE_NPU, "fence2", GROUP_NPU);
        MyRegister.registerBlock(new Fence3(), NAMESPACE_NPU, "fence3", GROUP_NPU);
        MyRegister.registerBlock(new Fence4(), NAMESPACE_NPU, "fence4", GROUP_NPU);
        MyRegister.registerBlock(new Fence5(), NAMESPACE_NPU, "fence5", GROUP_NPU);
        MyRegister.registerBlock(new Fence6(), NAMESPACE_NPU, "fence6", GROUP_NPU);
        MyRegister.registerBlock(new Fence7(), NAMESPACE_NPU, "fence7", GROUP_NPU);
        MyRegister.registerBlock(new Fence8(), NAMESPACE_NPU, "fence8", GROUP_NPU);
        MyRegister.registerBlock(new Fence9(), NAMESPACE_NPU, "fence9", GROUP_NPU);

        // Floors
        MyRegister.registerBlock(new Floor2(), NAMESPACE_NPU, "floor2", GROUP_NPU);
        MyRegister.registerBlock(new Floor3(), NAMESPACE_NPU, "floor3", GROUP_NPU);
        MyRegister.registerBlock(new Floor4(), NAMESPACE_NPU, "floor4", GROUP_NPU);
        MyRegister.registerBlock(new Floor5(), NAMESPACE_NPU, "floor5", GROUP_NPU);
        MyRegister.registerBlock(new Floor6(), NAMESPACE_NPU, "floor6", GROUP_NPU);

        // FlowerDid

        // FlowerDid.Day221
        MyRegister.registerBlock(new FBrailingl(), NAMESPACE_NPU, "fbrailingl", GROUP_NPU);
        MyRegister.registerBlock(new FBrailingr(), NAMESPACE_NPU, "fbrailingr", GROUP_NPU);
        MyRegister.registerBlock(new FCart1(), NAMESPACE_NPU, "fcart1", GROUP_NPU);
        MyRegister.registerBlock(new FG77(), NAMESPACE_NPU, "fg77", GROUP_NPU);
        MyRegister.registerBlock(new FG78(), NAMESPACE_NPU, "fg78", GROUP_NPU);
        MyRegister.registerBlock(new FG79(), NAMESPACE_NPU, "fg79", GROUP_NPU);
        MyRegister.registerBlock(new FG80(), NAMESPACE_NPU, "fg80", GROUP_NPU);
        MyRegister.registerBlock(new FHump(), NAMESPACE_NPU, "fhump", GROUP_NPU);
        MyRegister.registerBlock(new FHump1(), NAMESPACE_NPU, "fhump1", GROUP_NPU);
        MyRegister.registerBlock(new FLChair(), NAMESPACE_NPU, "flchair", GROUP_NPU);
        MyRegister.registerBlock(new FLight11(), NAMESPACE_NPU, "flight11", GROUP_NPU);
        MyRegister.registerBlock(new FStool(), NAMESPACE_NPU, "fstool", GROUP_NPU);
        MyRegister.registerBlock(new FStool1(), NAMESPACE_NPU, "fstool1", GROUP_NPU);
        MyRegister.registerBlock(new FWell(), NAMESPACE_NPU, "fwell", GROUP_NPU);
        MyRegister.registerBlock(new FWell1(), NAMESPACE_NPU, "fwell1", GROUP_NPU);
        MyRegister.registerBlock(new FWell2(), NAMESPACE_NPU, "fwell2", GROUP_NPU);
        MyRegister.registerBlock(new FWell3(), NAMESPACE_NPU, "fwell3", GROUP_NPU);

        // FlowerDid.Day222
        MyRegister.registerBlock(new FCTable(), NAMESPACE_NPU, "fctable", GROUP_NPU);
        MyRegister.registerBlock(new FCTable1(), NAMESPACE_NPU, "fctable1", GROUP_NPU);
        MyRegister.registerBlock(new FCTV(), NAMESPACE_NPU, "fctv", GROUP_NPU);
        MyRegister.registerBlock(new FCTV1(), NAMESPACE_NPU, "fctv1", GROUP_NPU);
        MyRegister.registerBlock(new FFan(), NAMESPACE_NPU, "ffan", GROUP_NPU);
        MyRegister.registerBlock(new FLine(), NAMESPACE_NPU, "fline", GROUP_NPU);
        MyRegister.registerBlock(new FLine1(), NAMESPACE_NPU, "fline1", GROUP_NPU);
        MyRegister.registerBlock(new FLine10(), NAMESPACE_NPU, "fline10", GROUP_NPU);
        MyRegister.registerBlock(new FLine11(), NAMESPACE_NPU, "fline11", GROUP_NPU);
        MyRegister.registerBlock(new FLine12(), NAMESPACE_NPU, "fline12", GROUP_NPU);
        MyRegister.registerBlock(new FLine13(), NAMESPACE_NPU, "fline13", GROUP_NPU);
        MyRegister.registerBlock(new FLine14(), NAMESPACE_NPU, "fline14", GROUP_NPU);
        MyRegister.registerBlock(new FLine15(), NAMESPACE_NPU, "fline15", GROUP_NPU);
        MyRegister.registerBlock(new FLine16(), NAMESPACE_NPU, "fline16", GROUP_NPU);
        MyRegister.registerBlock(new FLine17(), NAMESPACE_NPU, "fline17", GROUP_NPU);
        MyRegister.registerBlock(new FLine18(), NAMESPACE_NPU, "fline18", GROUP_NPU);
        MyRegister.registerBlock(new FLine19(), NAMESPACE_NPU, "fline19", GROUP_NPU);
        MyRegister.registerBlock(new FLine2(), NAMESPACE_NPU, "fline2", GROUP_NPU);
        MyRegister.registerBlock(new FLine20(), NAMESPACE_NPU, "fline20", GROUP_NPU);
        MyRegister.registerBlock(new FLine21(), NAMESPACE_NPU, "fline21", GROUP_NPU);
        MyRegister.registerBlock(new FLine22(), NAMESPACE_NPU, "fline22", GROUP_NPU);
        MyRegister.registerBlock(new FLine23(), NAMESPACE_NPU, "fline23", GROUP_NPU);
        MyRegister.registerBlock(new FLine24(), NAMESPACE_NPU, "fline24", GROUP_NPU);
        MyRegister.registerBlock(new FLine3(), NAMESPACE_NPU, "fline3", GROUP_NPU);
        MyRegister.registerBlock(new FLine4(), NAMESPACE_NPU, "fline4", GROUP_NPU);
        MyRegister.registerBlock(new FLine5(), NAMESPACE_NPU, "fline5", GROUP_NPU);
        MyRegister.registerBlock(new FLine6(), NAMESPACE_NPU, "fline6", GROUP_NPU);
        MyRegister.registerBlock(new FLine7(), NAMESPACE_NPU, "fline7", GROUP_NPU);
        MyRegister.registerBlock(new FLine8(), NAMESPACE_NPU, "fline8", GROUP_NPU);
        MyRegister.registerBlock(new FLine9(), NAMESPACE_NPU, "fline9", GROUP_NPU);
        MyRegister.registerBlock(new FVent1(), NAMESPACE_NPU, "fvent1", GROUP_NPU);
        MyRegister.registerBlock(new FVent2(), NAMESPACE_NPU, "fvent2", GROUP_NPU);

        // FlowerDid.Day228
        MyRegister.registerBlock(new FCFloor(), NAMESPACE_NPU, "fcfloor", GROUP_NPU);
        MyRegister.registerBlock(new FCFloor1(), NAMESPACE_NPU, "fcfloor1", GROUP_NPU);
        MyRegister.registerBlock(new FCFloor2(), NAMESPACE_NPU, "fcfloor2", GROUP_NPU);
        MyRegister.registerBlock(new FCFloor3(), NAMESPACE_NPU, "fcfloor3", GROUP_NPU);
        MyRegister.registerBlock(new FCFloor4(), NAMESPACE_NPU, "fcfloor4", GROUP_NPU);
        MyRegister.registerBlock(new FG82(), NAMESPACE_NPU, "fg82", GROUP_NPU);
        MyRegister.registerBlock(new FG83(), NAMESPACE_NPU, "fg83", GROUP_NPU);
        MyRegister.registerBlock(new FG84(), NAMESPACE_NPU, "fg84", GROUP_NPU);
        MyRegister.registerBlock(new FG85(), NAMESPACE_NPU, "fg85", GROUP_NPU);
        MyRegister.registerBlock(new FG86(), NAMESPACE_NPU, "fg86", GROUP_NPU);
        MyRegister.registerBlock(new FG87(), NAMESPACE_NPU, "fg87", GROUP_NPU);
        MyRegister.registerBlock(new FSWash(), NAMESPACE_NPU, "fswash", GROUP_NPU);
        MyRegister.registerBlock(new FYFDoor6(), NAMESPACE_NPU, "fyfdoor6", GROUP_NPU);
        MyRegister.registerBlock(new FYFDoor7(), NAMESPACE_NPU, "fyfdoor7", GROUP_NPU);
        MyRegister.registerBlock(new FYFDoor8(), NAMESPACE_NPU, "fyfdoor8", GROUP_NPU);
        MyRegister.registerBlock(new FYFDoor9(), NAMESPACE_NPU, "fyfdoor9", GROUP_NPU);

        // FlowerDid.Day310
        MyRegister.registerBlock(new FContainer(), NAMESPACE_NPU, "fcontainer", GROUP_NPU);
        MyRegister.registerBlock(new FContainer1(), NAMESPACE_NPU, "fcontainer1", GROUP_NPU);
        MyRegister.registerBlock(new FContainer2(), NAMESPACE_NPU, "fcontainer2", GROUP_NPU);
        MyRegister.registerBlock(new FG93(), NAMESPACE_NPU, "fg93", GROUP_NPU);
        MyRegister.registerBlock(new FG94(), NAMESPACE_NPU, "fg94", GROUP_NPU);
        MyRegister.registerBlock(new FG95(), NAMESPACE_NPU, "fg95", GROUP_NPU);
        MyRegister.registerBlock(new FG96(), NAMESPACE_NPU, "fg96", GROUP_NPU);
        MyRegister.registerBlock(new FLight12(), NAMESPACE_NPU, "flight12", GROUP_NPU);
        MyRegister.registerBlock(new FLight13(), NAMESPACE_NPU, "flight13", GROUP_NPU);
        MyRegister.registerBlock(new FSign(), NAMESPACE_NPU, "fsign", GROUP_NPU);
        MyRegister.registerBlock(new FSign1(), NAMESPACE_NPU, "fsign1", GROUP_NPU);
        MyRegister.registerBlock(new FSign2(), NAMESPACE_NPU, "fsign2", GROUP_NPU);
        MyRegister.registerBlock(new FSign3(), NAMESPACE_NPU, "fsign3", GROUP_NPU);
        MyRegister.registerBlock(new FWindow(), NAMESPACE_NPU, "fwindow", GROUP_NPU);
        MyRegister.registerBlock(new FWindow1(), NAMESPACE_NPU, "fwindow1", GROUP_NPU);
        MyRegister.registerBlock(new FWindow2(), NAMESPACE_NPU, "fwindow2", GROUP_NPU);
        MyRegister.registerBlock(new FWindow3(), NAMESPACE_NPU, "fwindow3", GROUP_NPU);
        MyRegister.registerBlock(new FWindow4(), NAMESPACE_NPU, "fwindow4", GROUP_NPU);
        MyRegister.registerBlock(new FWindow5(), NAMESPACE_NPU, "fwindow5", GROUP_NPU);

        // FlowerDid.Day312
        MyRegister.registerBlock(new FBox(), NAMESPACE_NPU, "fbox", GROUP_NPU);
        MyRegister.registerBlock(new FBox1(), NAMESPACE_NPU, "fbox1", GROUP_NPU);
        MyRegister.registerBlock(new FCTable2(), NAMESPACE_NPU, "fctable2", GROUP_NPU);
        MyRegister.registerBlock(new FCTable3(), NAMESPACE_NPU, "fctable3", GROUP_NPU);
        MyRegister.registerBlock(new FCTable4(), NAMESPACE_NPU, "fctable4", GROUP_NPU);
        MyRegister.registerBlock(new FCTable5(), NAMESPACE_NPU, "fctable5", GROUP_NPU);
        MyRegister.registerBlock(new FCTable6(), NAMESPACE_NPU, "fctable6", GROUP_NPU);
        MyRegister.registerBlock(new FRoadblocks(), NAMESPACE_NPU, "froadblocks", GROUP_NPU);
        MyRegister.registerBlock(new FRod(), NAMESPACE_NPU, "frod", GROUP_NPU);
        MyRegister.registerBlock(new FRod1(), NAMESPACE_NPU, "frod1", GROUP_NPU);
        MyRegister.registerBlock(new FShelf(), NAMESPACE_NPU, "fshelf", GROUP_NPU);
        MyRegister.registerBlock(new FShelf1(), NAMESPACE_NPU, "fshelf1", GROUP_NPU);
        MyRegister.registerBlock(new FSign4(), NAMESPACE_NPU, "fsign4", GROUP_NPU);
        MyRegister.registerBlock(new FSign5(), NAMESPACE_NPU, "fsign5", GROUP_NPU);
        MyRegister.registerBlock(new FSign6(), NAMESPACE_NPU, "fsign6", GROUP_NPU);
        MyRegister.registerBlock(new FSign7(), NAMESPACE_NPU, "fsign7", GROUP_NPU);
        MyRegister.registerBlock(new FSign8(), NAMESPACE_NPU, "fsign8", GROUP_NPU);
        MyRegister.registerBlock(new FSmoke(), NAMESPACE_NPU, "fsmoke", GROUP_NPU);
        MyRegister.registerBlock(new FStove(), NAMESPACE_NPU, "fstove", GROUP_NPU);
        MyRegister.registerBlock(new FStove1(), NAMESPACE_NPU, "fstove1", GROUP_NPU);
        MyRegister.registerBlock(new FStove2(), NAMESPACE_NPU, "fstove2", GROUP_NPU);
        MyRegister.registerBlock(new FSwitch(), NAMESPACE_NPU, "fswitch", GROUP_NPU);

        // FlowerDid.Others
        MyRegister.registerBlock(new FBTable(), NAMESPACE_NPU, "fbtable", GROUP_NPU);
        MyRegister.registerBlock(new FCamera(), NAMESPACE_NPU, "fcamera", GROUP_NPU);
        MyRegister.registerBlock(new FCamera1(), NAMESPACE_NPU, "fcamera1", GROUP_NPU);
        MyRegister.registerBlock(new FCamera2(), NAMESPACE_NPU, "fcamera2", GROUP_NPU);
        MyRegister.registerBlock(new FCamera3(), NAMESPACE_NPU, "fcamera3", GROUP_NPU);
        MyRegister.registerBlock(new FCamera4(), NAMESPACE_NPU, "fcamera4", GROUP_NPU);
        MyRegister.registerBlock(new FCamera5(), NAMESPACE_NPU, "fcamera5", GROUP_NPU);
        MyRegister.registerBlock(new FCart(), NAMESPACE_NPU, "fcart", GROUP_NPU);
        MyRegister.registerBlock(new FChopsticks(), NAMESPACE_NPU, "fchopsticks", GROUP_NPU);
        MyRegister.registerBlock(new FDoorNum(), NAMESPACE_NPU, "fdoornum", GROUP_NPU);
        MyRegister.registerBlock(new FDoorScreen(), NAMESPACE_NPU, "fdoorscreen", GROUP_NPU);
        MyRegister.registerBlock(new FDoorSwitch(), NAMESPACE_NPU, "fdoorswitch", GROUP_NPU);
        MyRegister.registerBlock(new FG76(), NAMESPACE_NPU, "fg76", GROUP_NPU);
        MyRegister.registerBlock(new FG81(), NAMESPACE_NPU, "fg81", GROUP_NPU);
        MyRegister.registerBlock(new FG88(), NAMESPACE_NPU, "fg88", GROUP_NPU);
        MyRegister.registerBlock(new FG89(), NAMESPACE_NPU, "fg89", GROUP_NPU);
        MyRegister.registerBlock(new FG90(), NAMESPACE_NPU, "fg90", GROUP_NPU);
        MyRegister.registerBlock(new FG91(), NAMESPACE_NPU, "fg91", GROUP_NPU);
        MyRegister.registerBlock(new FG92(), NAMESPACE_NPU, "fg92", GROUP_NPU);
        MyRegister.registerBlock(new FGallery1(), NAMESPACE_NPU, "fgallery1", GROUP_NPU);
        MyRegister.registerBlock(new FGallery2(), NAMESPACE_NPU, "fgallery2", GROUP_NPU);
        MyRegister.registerBlock(new FGallery3(), NAMESPACE_NPU, "fgallery3", GROUP_NPU);
        MyRegister.registerBlock(new FGallery4(), NAMESPACE_NPU, "fgallery4", GROUP_NPU);
        MyRegister.registerBlock(new FGallery5(), NAMESPACE_NPU, "fgallery5", GROUP_NPU);
        MyRegister.registerBlock(new FGirlDoor(), NAMESPACE_NPU, "fgirldoor", GROUP_NPU);
        MyRegister.registerBlock(new FGirlDoor1(), NAMESPACE_NPU, "fgirldoor1", GROUP_NPU);
        MyRegister.registerBlock(new FGirlDoor2(), NAMESPACE_NPU, "fgirldoor2", GROUP_NPU);
        MyRegister.registerBlock(new FGirlDoor3(), NAMESPACE_NPU, "fgirldoor3", GROUP_NPU);
        MyRegister.registerBlock(new FGirlDoor4(), NAMESPACE_NPU, "fgirldoor4", GROUP_NPU);
        MyRegister.registerBlock(new FGirlDoor5(), NAMESPACE_NPU, "fgirldoor5", GROUP_NPU);
        MyRegister.registerBlock(new FGirlTL1(), NAMESPACE_NPU, "fgirltl1", GROUP_NPU);
        MyRegister.registerBlock(new FGirlTR1(), NAMESPACE_NPU, "fgirltr1", GROUP_NPU);
        MyRegister.registerBlock(new FHallScreen1(), NAMESPACE_NPU, "fhallscreen1", GROUP_NPU);
        MyRegister.registerBlock(new FHallScreen2(), NAMESPACE_NPU, "fhallscreen2", GROUP_NPU);
        MyRegister.registerBlock(new FHTable(), NAMESPACE_NPU, "fhtable", GROUP_NPU);
        MyRegister.registerBlock(new FLight1(), NAMESPACE_NPU, "flight1", GROUP_NPU);
        MyRegister.registerBlock(new FLight10(), NAMESPACE_NPU, "flight10", GROUP_NPU);
        MyRegister.registerBlock(new FLight2(), NAMESPACE_NPU, "flight2", GROUP_NPU);
        MyRegister.registerBlock(new FLight3(), NAMESPACE_NPU, "flight3", GROUP_NPU);
        MyRegister.registerBlock(new FLight4(), NAMESPACE_NPU, "flight4", GROUP_NPU);
        MyRegister.registerBlock(new FLight5(), NAMESPACE_NPU, "flight5", GROUP_NPU);
        MyRegister.registerBlock(new FLight6(), NAMESPACE_NPU, "flight6", GROUP_NPU);
        MyRegister.registerBlock(new FLight7(), NAMESPACE_NPU, "flight7", GROUP_NPU);
        MyRegister.registerBlock(new FLight8(), NAMESPACE_NPU, "flight8", GROUP_NPU);
        MyRegister.registerBlock(new FLight9(), NAMESPACE_NPU, "flight9", GROUP_NPU);
        MyRegister.registerBlock(new FMP(), NAMESPACE_NPU, "fmp", GROUP_NPU);
        MyRegister.registerBlock(new FNorthHall1(), NAMESPACE_NPU, "fnorthhall1", GROUP_NPU);
        MyRegister.registerBlock(new FNorthHall2(), NAMESPACE_NPU, "fnorthhall2", GROUP_NPU);
        MyRegister.registerBlock(new FNorthHall3(), NAMESPACE_NPU, "fnorthhall3", GROUP_NPU);
        MyRegister.registerBlock(new FNorthHall4(), NAMESPACE_NPU, "fnorthhall4", GROUP_NPU);
        MyRegister.registerBlock(new FNorthHall5(), NAMESPACE_NPU, "fnorthhall5", GROUP_NPU);
        MyRegister.registerBlock(new FPipe(), NAMESPACE_NPU, "fpipe", GROUP_NPU);
        MyRegister.registerBlock(new FPipe1(), NAMESPACE_NPU, "fpipe1", GROUP_NPU);
        MyRegister.registerBlock(new FPipe10(), NAMESPACE_NPU, "fpipe10", GROUP_NPU);
        MyRegister.registerBlock(new FPipe2(), NAMESPACE_NPU, "fpipe2", GROUP_NPU);
        MyRegister.registerBlock(new FPipe3(), NAMESPACE_NPU, "fpipe3", GROUP_NPU);
        MyRegister.registerBlock(new FPipe4(), NAMESPACE_NPU, "fpipe4", GROUP_NPU);
        MyRegister.registerBlock(new FPipe5(), NAMESPACE_NPU, "fpipe5", GROUP_NPU);
        MyRegister.registerBlock(new FPipe6(), NAMESPACE_NPU, "fpipe6", GROUP_NPU);
        MyRegister.registerBlock(new FPipe7(), NAMESPACE_NPU, "fpipe7", GROUP_NPU);
        MyRegister.registerBlock(new FPipe8(), NAMESPACE_NPU, "fpipe8", GROUP_NPU);
        MyRegister.registerBlock(new FPipe9(), NAMESPACE_NPU, "fpipe9", GROUP_NPU);
        MyRegister.registerBlock(new FRadiator(), NAMESPACE_NPU, "fradiator", GROUP_NPU);
        MyRegister.registerBlock(new FStation(), NAMESPACE_NPU, "fstation", GROUP_NPU);
        MyRegister.registerBlock(new FStation1(), NAMESPACE_NPU, "fstation1", GROUP_NPU);
        MyRegister.registerBlock(new FStation2(), NAMESPACE_NPU, "fstation2", GROUP_NPU);
        MyRegister.registerBlock(new FTrash(), NAMESPACE_NPU, "ftrash", GROUP_NPU);
        MyRegister.registerBlock(new FTSigh(), NAMESPACE_NPU, "ftsigh", GROUP_NPU);
        MyRegister.registerBlock(new FVent(), NAMESPACE_NPU, "fvent", GROUP_NPU);
        MyRegister.registerBlock(new FWashl(), NAMESPACE_NPU, "fwashl", GROUP_NPU);
        MyRegister.registerBlock(new FWashr(), NAMESPACE_NPU, "fwashr", GROUP_NPU);
        MyRegister.registerBlock(new FWinL(), NAMESPACE_NPU, "fwinl", GROUP_NPU);
        MyRegister.registerBlock(new FWinR(), NAMESPACE_NPU, "fwinr", GROUP_NPU);
        MyRegister.registerBlock(new FYFDoor(), NAMESPACE_NPU, "fyfdoor", GROUP_NPU);
        MyRegister.registerBlock(new FYFDoor1(), NAMESPACE_NPU, "fyfdoor1", GROUP_NPU);
        MyRegister.registerBlock(new FYFdoor2(), NAMESPACE_NPU, "fyfdoor2", GROUP_NPU);
        MyRegister.registerBlock(new FYFdoor3(), NAMESPACE_NPU, "fyfdoor3", GROUP_NPU);
        MyRegister.registerBlock(new FYFdoor4(), NAMESPACE_NPU, "fyfdoor4", GROUP_NPU);
        MyRegister.registerBlock(new FYFdoor5(), NAMESPACE_NPU, "fyfdoor5", GROUP_NPU);
        MyRegister.registerBlock(new FYFTL(), NAMESPACE_NPU, "fyftl", GROUP_NPU);
        MyRegister.registerBlock(new FYFTL1(), NAMESPACE_NPU, "fyftl1", GROUP_NPU);
        MyRegister.registerBlock(new FYFTR(), NAMESPACE_NPU, "fyftr", GROUP_NPU);
        MyRegister.registerBlock(new FYFTR1(), NAMESPACE_NPU, "fyftr1", GROUP_NPU);

        // G
        MyRegister.registerBlock(new FG53(), NAMESPACE_NPU, "fg53", GROUP_NPU);
        MyRegister.registerBlock(new FG54(), NAMESPACE_NPU, "fg54", GROUP_NPU);
        MyRegister.registerBlock(new FG55(), NAMESPACE_NPU, "fg55", GROUP_NPU);
        MyRegister.registerBlock(new FG56(), NAMESPACE_NPU, "fg56", GROUP_NPU);
        MyRegister.registerBlock(new FG57(), NAMESPACE_NPU, "fg57", GROUP_NPU);
        MyRegister.registerBlock(new FG58(), NAMESPACE_NPU, "fg58", GROUP_NPU);
        MyRegister.registerBlock(new FG59(), NAMESPACE_NPU, "fg59", GROUP_NPU);
        MyRegister.registerBlock(new FG60(), NAMESPACE_NPU, "fg60", GROUP_NPU);
        MyRegister.registerBlock(new FG61(), NAMESPACE_NPU, "fg61", GROUP_NPU);
        MyRegister.registerBlock(new FG62(), NAMESPACE_NPU, "fg62", GROUP_NPU);
        MyRegister.registerBlock(new FG63(), NAMESPACE_NPU, "fg63", GROUP_NPU);
        MyRegister.registerBlock(new FG64(), NAMESPACE_NPU, "fg64", GROUP_NPU);
        MyRegister.registerBlock(new FG65(), NAMESPACE_NPU, "fg65", GROUP_NPU);
        MyRegister.registerBlock(new FG66(), NAMESPACE_NPU, "fg66", GROUP_NPU);
        MyRegister.registerBlock(new FG67(), NAMESPACE_NPU, "fg67", GROUP_NPU);
        MyRegister.registerBlock(new FG68(), NAMESPACE_NPU, "fg68", GROUP_NPU);
        MyRegister.registerBlock(new FG69(), NAMESPACE_NPU, "fg69", GROUP_NPU);
        MyRegister.registerBlock(new FG70(), NAMESPACE_NPU, "fg70", GROUP_NPU);
        MyRegister.registerBlock(new FG71(), NAMESPACE_NPU, "fg71", GROUP_NPU);
        MyRegister.registerBlock(new FG72(), NAMESPACE_NPU, "fg72", GROUP_NPU);
        MyRegister.registerBlock(new FG73(), NAMESPACE_NPU, "fg73", GROUP_NPU);
        MyRegister.registerBlock(new FG74(), NAMESPACE_NPU, "fg74", GROUP_NPU);
        MyRegister.registerBlock(new FG75(), NAMESPACE_NPU, "fg75", GROUP_NPU);
        MyRegister.registerBlock(new G1(), NAMESPACE_NPU, "g1", GROUP_NPU);
        MyRegister.registerBlock(new G10(), NAMESPACE_NPU, "g10", GROUP_NPU);
        MyRegister.registerBlock(new G11(), NAMESPACE_NPU, "g11", GROUP_NPU);
        MyRegister.registerBlock(new G12(), NAMESPACE_NPU, "g12", GROUP_NPU);
        MyRegister.registerBlock(new G13(), NAMESPACE_NPU, "g13", GROUP_NPU);
        MyRegister.registerBlock(new G14(), NAMESPACE_NPU, "g14", GROUP_NPU);
        MyRegister.registerBlock(new G15(), NAMESPACE_NPU, "g15", GROUP_NPU);
        MyRegister.registerBlock(new G16(), NAMESPACE_NPU, "g16", GROUP_NPU);
        MyRegister.registerBlock(new G17(), NAMESPACE_NPU, "g17", GROUP_NPU);
        MyRegister.registerBlock(new G18(), NAMESPACE_NPU, "g18", GROUP_NPU);
        MyRegister.registerBlock(new G19(), NAMESPACE_NPU, "g19", GROUP_NPU);
        MyRegister.registerBlock(new G2(), NAMESPACE_NPU, "g2", GROUP_NPU);
        MyRegister.registerBlock(new G20(), NAMESPACE_NPU, "g20", GROUP_NPU);
        MyRegister.registerBlock(new G21a(), NAMESPACE_NPU, "g21a", GROUP_NPU);
        MyRegister.registerBlock(new G21b(), NAMESPACE_NPU, "g21b", GROUP_NPU);
        MyRegister.registerBlock(new G21c(), NAMESPACE_NPU, "g21c", GROUP_NPU);
        MyRegister.registerBlock(new G22(), NAMESPACE_NPU, "g22", GROUP_NPU);
        MyRegister.registerBlock(new G23(), NAMESPACE_NPU, "g23", GROUP_NPU);
        MyRegister.registerBlock(new G24(), NAMESPACE_NPU, "g24", GROUP_NPU);
        MyRegister.registerBlock(new G25(), NAMESPACE_NPU, "g25", GROUP_NPU);
        MyRegister.registerBlock(new G26(), NAMESPACE_NPU, "g26", GROUP_NPU);
        MyRegister.registerBlock(new G27(), NAMESPACE_NPU, "g27", GROUP_NPU);
        MyRegister.registerBlock(new G28(), NAMESPACE_NPU, "g28", GROUP_NPU);
        MyRegister.registerBlock(new G29(), NAMESPACE_NPU, "g29", GROUP_NPU);
        MyRegister.registerBlock(new G3(), NAMESPACE_NPU, "g3", GROUP_NPU);
        MyRegister.registerBlock(new G30(), NAMESPACE_NPU, "g30", GROUP_NPU);
        MyRegister.registerBlock(new G31(), NAMESPACE_NPU, "g31", GROUP_NPU);
        MyRegister.registerBlock(new G32(), NAMESPACE_NPU, "g32", GROUP_NPU);
        MyRegister.registerBlock(new G33(), NAMESPACE_NPU, "g33", GROUP_NPU);
        MyRegister.registerBlock(new G34(), NAMESPACE_NPU, "g34", GROUP_NPU);
        MyRegister.registerBlock(new G35(), NAMESPACE_NPU, "g35", GROUP_NPU);
        MyRegister.registerBlock(new G36(), NAMESPACE_NPU, "g36", GROUP_NPU);
        MyRegister.registerBlock(new G37(), NAMESPACE_NPU, "g37", GROUP_NPU);
        MyRegister.registerBlock(new G38(), NAMESPACE_NPU, "g38", GROUP_NPU);
        MyRegister.registerBlock(new G39(), NAMESPACE_NPU, "g39", GROUP_NPU);
        MyRegister.registerBlock(new G4(), NAMESPACE_NPU, "g4", GROUP_NPU);
        MyRegister.registerBlock(new G40(), NAMESPACE_NPU, "g40", GROUP_NPU);
        MyRegister.registerBlock(new G41(), NAMESPACE_NPU, "g41", GROUP_NPU);
        MyRegister.registerBlock(new G42(), NAMESPACE_NPU, "g42", GROUP_NPU);
        MyRegister.registerBlock(new G43(), NAMESPACE_NPU, "g43", GROUP_NPU);
        MyRegister.registerBlock(new G44(), NAMESPACE_NPU, "g44", GROUP_NPU);
        MyRegister.registerBlock(new G45(), NAMESPACE_NPU, "g45", GROUP_NPU);
        MyRegister.registerBlock(new G46(), NAMESPACE_NPU, "g46", GROUP_NPU);
        MyRegister.registerBlock(new G47(), NAMESPACE_NPU, "g47", GROUP_NPU);
        MyRegister.registerBlock(new G48(), NAMESPACE_NPU, "g48", GROUP_NPU);
        MyRegister.registerBlock(new G49(), NAMESPACE_NPU, "g49", GROUP_NPU);
        MyRegister.registerBlock(new G5(), NAMESPACE_NPU, "g5", GROUP_NPU);
        MyRegister.registerBlock(new G50(), NAMESPACE_NPU, "g50", GROUP_NPU);
        MyRegister.registerBlock(new G51(), NAMESPACE_NPU, "g51", GROUP_NPU);
        MyRegister.registerBlock(new G52(), NAMESPACE_NPU, "g52", GROUP_NPU);
        MyRegister.registerBlock(new G53(), NAMESPACE_NPU, "g53", GROUP_NPU);
        MyRegister.registerBlock(new G54(), NAMESPACE_NPU, "g54", GROUP_NPU);
        MyRegister.registerBlock(new G55(), NAMESPACE_NPU, "g55", GROUP_NPU);
        MyRegister.registerBlock(new G6(), NAMESPACE_NPU, "g6", GROUP_NPU);
        MyRegister.registerBlock(new G7(), NAMESPACE_NPU, "g7", GROUP_NPU);
        MyRegister.registerBlock(new G8(), NAMESPACE_NPU, "g8", GROUP_NPU);
        MyRegister.registerBlock(new G9(), NAMESPACE_NPU, "g9", GROUP_NPU);

        // Girl
        MyRegister.registerBlock(new GirlBedL(), NAMESPACE_NPU, "girlbedl", GROUP_NPU);
        MyRegister.registerBlock(new GirlBedR(), NAMESPACE_NPU, "girlbedr", GROUP_NPU);
        MyRegister.registerBlock(new GirlShelf(), NAMESPACE_NPU, "girlshelf", GROUP_NPU);
        MyRegister.registerBlock(new GirlTL(), NAMESPACE_NPU, "girltl", GROUP_NPU);
        MyRegister.registerBlock(new GirlTR(), NAMESPACE_NPU, "girltr", GROUP_NPU);
        MyRegister.registerBlock(new GirlWash(), NAMESPACE_NPU, "girlwash", GROUP_NPU);

        // Guns
        MyRegister.registerBlock(new Gun(), NAMESPACE_NPU, "gun", GROUP_NPU);
        MyRegister.registerBlock(new Gun1(), NAMESPACE_NPU, "gun1", GROUP_NPU);

        // HandRail
        MyRegister.registerBlock(new HR1(), NAMESPACE_NPU, "hr1", GROUP_NPU);
        MyRegister.registerBlock(new HR2(), NAMESPACE_NPU, "hr2", GROUP_NPU);
        MyRegister.registerBlock(new HR3(), NAMESPACE_NPU, "hr3", GROUP_NPU);
        MyRegister.registerBlock(new HR4(), NAMESPACE_NPU, "hr4", GROUP_NPU);
        MyRegister.registerBlock(new HR5(), NAMESPACE_NPU, "hr5", GROUP_NPU);

        // Lights
        MyRegister.registerBlock(new Light(), NAMESPACE_NPU, "light", GROUP_NPU);
        MyRegister.registerBlock(new Light1(), NAMESPACE_NPU, "light1", GROUP_NPU);
        MyRegister.registerBlock(new Light2(), NAMESPACE_NPU, "light2", GROUP_NPU);
        MyRegister.registerBlock(new Light3(), NAMESPACE_NPU, "light3", GROUP_NPU);
        MyRegister.registerBlock(new Light4(), NAMESPACE_NPU, "light4", GROUP_NPU);
        MyRegister.registerBlock(new Light5(), NAMESPACE_NPU, "light5", GROUP_NPU);
        MyRegister.registerBlock(new Light6(), NAMESPACE_NPU, "light6", GROUP_NPU);
        MyRegister.registerBlock(new Light7(), NAMESPACE_NPU, "light7", GROUP_NPU);
        MyRegister.registerBlock(new Light8(), NAMESPACE_NPU, "light8", GROUP_NPU);
        MyRegister.registerBlock(new Light9(), NAMESPACE_NPU, "light9", GROUP_NPU);

        // Market
        MyRegister.registerBlock(new MarketCabinetFreezer(), NAMESPACE_NPU, "market_cabinet_freezer", GROUP_NPU);
        MyRegister.registerBlock(new MarketCashierDeskLeft(), NAMESPACE_NPU, "market_cashier_desk_left", GROUP_NPU);
        MyRegister.registerBlock(new MarketCashierDeskRight(), NAMESPACE_NPU, "market_cashier_desk_right", GROUP_NPU);
        MyRegister.registerBlock(new MarketMilkBox(), NAMESPACE_NPU, "market_milk_box", GROUP_NPU);
        MyRegister.registerBlock(new MarketOfficeCabinetDown(), NAMESPACE_NPU, "market_office_cabinet_down", GROUP_NPU);
        MyRegister.registerBlock(new MarketOfficeCabinetUp(), NAMESPACE_NPU, "market_office_cabinet_up", GROUP_NPU);

        // Others
        MyRegister.registerBlock(new AC(), NAMESPACE_NPU, "ac", GROUP_NPU);
        MyRegister.registerBlock(new ACAdd1(), NAMESPACE_NPU, "acadd1", GROUP_NPU);
        MyRegister.registerBlock(new ACAdd2(), NAMESPACE_NPU, "acadd2", GROUP_NPU);
        MyRegister.registerBlock(new AirConIn(), NAMESPACE_NPU, "airconin", GROUP_NPU);
        MyRegister.registerBlock(new AirConOut(), NAMESPACE_NPU, "airconout", GROUP_NPU);
        MyRegister.registerBlock(new AirConOut1(), NAMESPACE_NPU, "airconout1", GROUP_NPU);
        MyRegister.registerBlock(new AirConOut2(), NAMESPACE_NPU, "airconout2", GROUP_NPU);
        MyRegister.registerBlock(new ATable(), NAMESPACE_NPU, "atable", GROUP_NPU);
        MyRegister.registerBlock(new Atlas(), NAMESPACE_NPU, "atlas", GROUP_NPU);
        MyRegister.registerBlock(new Box(), NAMESPACE_NPU, "box", GROUP_NPU);
        MyRegister.registerBlock(new Box1(), NAMESPACE_NPU, "box1", GROUP_NPU);
        MyRegister.registerBlock(new Chair(), NAMESPACE_NPU, "chair", GROUP_NPU);
        MyRegister.registerBlock(new Chair1(), NAMESPACE_NPU, "chair1", GROUP_NPU);
        MyRegister.registerBlock(new Chair2(), NAMESPACE_NPU, "chair2", GROUP_NPU);
        MyRegister.registerBlock(new CP(), NAMESPACE_NPU, "cp", GROUP_NPU);
        MyRegister.registerBlock(new DT(), NAMESPACE_NPU, "dt", GROUP_NPU);
        MyRegister.registerBlock(new ELamp(), NAMESPACE_NPU, "elamp", GROUP_NPU);
        MyRegister.registerBlock(new Electric(), NAMESPACE_NPU, "electric", GROUP_NPU);
        MyRegister.registerBlock(new FExt(), NAMESPACE_NPU, "fext", GROUP_NPU);
        MyRegister.registerBlock(new FExt1(), NAMESPACE_NPU, "fext1", GROUP_NPU);
        MyRegister.registerBlock(new Fox(), NAMESPACE_NPU, "fox", GROUP_NPU);
        MyRegister.registerBlock(new Furnace(), NAMESPACE_NPU, "furnace", GROUP_NPU);
        MyRegister.registerBlock(new GBed(), NAMESPACE_NPU, "gbed", GROUP_NPU);
        MyRegister.registerBlock(new Ground(), NAMESPACE_NPU, "ground", GROUP_NPU);
        MyRegister.registerBlock(new GTable(), NAMESPACE_NPU, "gtable", GROUP_NPU);
        MyRegister.registerBlock(new HWater(), NAMESPACE_NPU, "hwater", GROUP_NPU);
        MyRegister.registerBlock(new Knight(), NAMESPACE_NPU, "knight", GROUP_NPU);
        MyRegister.registerBlock(new LChair(), NAMESPACE_NPU, "lchair", GROUP_NPU);
        MyRegister.registerBlock(new MP(), NAMESPACE_NPU, "mp", GROUP_NPU);
        MyRegister.registerBlock(new ObsidianBlock(), NAMESPACE_NPU, "obsidianblock", GROUP_NPU);
        MyRegister.registerBlock(new ObsidianFrame(), NAMESPACE_NPU, "obsidianframe", GROUP_NPU);
        MyRegister.registerBlock(new Printer(), NAMESPACE_NPU, "printer", GROUP_NPU);
        MyRegister.registerBlock(new Radiator(), NAMESPACE_NPU, "radiator", GROUP_NPU);
        MyRegister.registerBlock(new Shop(), NAMESPACE_NPU, "shop", GROUP_NPU);
        MyRegister.registerBlock(new Shop1(), NAMESPACE_NPU, "shop1", GROUP_NPU);
        MyRegister.registerBlock(new Shop2(), NAMESPACE_NPU, "shop2", GROUP_NPU);
        MyRegister.registerBlock(new Sign(), NAMESPACE_NPU, "sign", GROUP_NPU);
        MyRegister.registerBlock(new StoneR(), NAMESPACE_NPU, "stoner", GROUP_NPU);
        MyRegister.registerBlock(new StoneR1(), NAMESPACE_NPU, "stoner1", GROUP_NPU);
        MyRegister.registerBlock(new StraightAheadSign(), NAMESPACE_NPU, "straightaheadsign", GROUP_NPU);
        MyRegister.registerBlock(new TestG(), NAMESPACE_NPU, "testg", GROUP_NPU);
        MyRegister.registerBlock(new Toilet(), NAMESPACE_NPU, "toilet", GROUP_NPU);
        MyRegister.registerBlock(new TTable(), NAMESPACE_NPU, "ttable", GROUP_NPU);
        MyRegister.registerBlock(new Urinal(), NAMESPACE_NPU, "urinal", GROUP_NPU);

        // Paintings
        MyRegister.registerBlock(new Painting(), NAMESPACE_NPU, "painting", GROUP_NPU);
        MyRegister.registerBlock(new Painting1(), NAMESPACE_NPU, "painting1", GROUP_NPU);
        MyRegister.registerBlock(new Painting2(), NAMESPACE_NPU, "painting2", GROUP_NPU);
        MyRegister.registerBlock(new Painting3(), NAMESPACE_NPU, "painting3", GROUP_NPU);

        // Pipe
        MyRegister.registerBlock(new Pipe1(), NAMESPACE_NPU, "pipe1", GROUP_NPU);
        MyRegister.registerBlock(new Pipe2(), NAMESPACE_NPU, "pipe2", GROUP_NPU);
        MyRegister.registerBlock(new Pipe3(), NAMESPACE_NPU, "pipe3", GROUP_NPU);
        MyRegister.registerBlock(new Pipe4(), NAMESPACE_NPU, "pipe4", GROUP_NPU);
        MyRegister.registerBlock(new Pipe5(), NAMESPACE_NPU, "pipe5", GROUP_NPU);
        MyRegister.registerBlock(new Pipe6(), NAMESPACE_NPU, "pipe6", GROUP_NPU);
        MyRegister.registerBlock(new Pipe7(), NAMESPACE_NPU, "pipe7", GROUP_NPU);
        MyRegister.registerBlock(new Pipe8(), NAMESPACE_NPU, "pipe8", GROUP_NPU);
        MyRegister.registerBlock(new Pipe9(), NAMESPACE_NPU, "pipe9", GROUP_NPU);

        // Plants
        MyRegister.registerBlock(new Plant(), NAMESPACE_NPU, "plant", GROUP_NPU);
        MyRegister.registerBlock(new Plant1(), NAMESPACE_NPU, "plant1", GROUP_NPU);
        MyRegister.registerBlock(new Plant2(), NAMESPACE_NPU, "plant2", GROUP_NPU);

        // Platform
        MyRegister.registerBlock(new CenterAirconditionerBias(), NAMESPACE_NPU, "center_airconditioner_bias", GROUP_NPU);
        MyRegister.registerBlock(new ClassroomMicrophone(), NAMESPACE_NPU, "classroom_microphone", GROUP_NPU);
        MyRegister.registerBlock(new MetalTrashcan(), NAMESPACE_NPU, "metal_trashcan", GROUP_NPU);
        MyRegister.registerBlock(new Platform(), NAMESPACE_NPU, "platform", GROUP_NPU);
        MyRegister.registerBlock(new PlatformChair(), NAMESPACE_NPU, "platform_chair", GROUP_NPU);
        MyRegister.registerBlock(new PlatformCorner(), NAMESPACE_NPU, "platform_corner", GROUP_NPU);
        MyRegister.registerBlock(new PlatformDesk(), NAMESPACE_NPU, "platform_desk", GROUP_NPU);
        MyRegister.registerBlock(new TopAirconditioner(), NAMESPACE_NPU, "top_airconditioner", GROUP_NPU);

        // Railings
        MyRegister.registerBlock(new Railing(), NAMESPACE_NPU, "railing", GROUP_NPU);
        MyRegister.registerBlock(new Railing1(), NAMESPACE_NPU, "railing1", GROUP_NPU);
        MyRegister.registerBlock(new Railing2(), NAMESPACE_NPU, "railing2", GROUP_NPU);
        MyRegister.registerBlock(new Railing3(), NAMESPACE_NPU, "railing3", GROUP_NPU);
        MyRegister.registerBlock(new Railing4(), NAMESPACE_NPU, "railing4", GROUP_NPU);
        MyRegister.registerBlock(new Railing5(), NAMESPACE_NPU, "railing5", GROUP_NPU);

        // Road
        MyRegister.registerBlock(new CemH(), NAMESPACE_NPU, "cemh", GROUP_NPU);
        MyRegister.registerBlock(new CemT(), NAMESPACE_NPU, "cemt", GROUP_NPU);

        // Signs
        MyRegister.registerBlock(new InSign(), NAMESPACE_NPU, "insign", GROUP_NPU);
        MyRegister.registerBlock(new InSign1(), NAMESPACE_NPU, "insign1", GROUP_NPU);
        MyRegister.registerBlock(new InSign2(), NAMESPACE_NPU, "insign2", GROUP_NPU);
        MyRegister.registerBlock(new InSign3(), NAMESPACE_NPU, "insign3", GROUP_NPU);
        MyRegister.registerBlock(new InSign4(), NAMESPACE_NPU, "insign4", GROUP_NPU);
        MyRegister.registerBlock(new InSign5(), NAMESPACE_NPU, "insign5", GROUP_NPU);
        MyRegister.registerBlock(new InSign6(), NAMESPACE_NPU, "insign6", GROUP_NPU);
        MyRegister.registerBlock(new OutSign(), NAMESPACE_NPU, "outsign", GROUP_NPU);

        // Stair
        MyRegister.registerBlock(new Stair(), NAMESPACE_NPU, "stair", GROUP_NPU);
        MyRegister.registerBlock(new Stair1(), NAMESPACE_NPU, "stair1", GROUP_NPU);
        MyRegister.registerBlock(new Stair2(), NAMESPACE_NPU, "stair2", GROUP_NPU);
        MyRegister.registerBlock(new Stair3(), NAMESPACE_NPU, "stair3", GROUP_NPU);
        MyRegister.registerBlock(new Stair4(), NAMESPACE_NPU, "stair4", GROUP_NPU);
        MyRegister.registerBlock(new Stair5(), NAMESPACE_NPU, "stair5", GROUP_NPU);
        MyRegister.registerBlock(new Stair6(), NAMESPACE_NPU, "stair6", GROUP_NPU);

        // StarSignPack
        MyRegister.registerBlock(new A(), NAMESPACE_NPU, "a", GROUP_NPU);
        MyRegister.registerBlock(new B(), NAMESPACE_NPU, "b", GROUP_NPU);
        MyRegister.registerBlock(new C(), NAMESPACE_NPU, "c", GROUP_NPU);
        MyRegister.registerBlock(new D(), NAMESPACE_NPU, "d", GROUP_NPU);
        MyRegister.registerBlock(new E(), NAMESPACE_NPU, "e", GROUP_NPU);
        MyRegister.registerBlock(new F(), NAMESPACE_NPU, "f", GROUP_NPU);
        MyRegister.registerBlock(new G(), NAMESPACE_NPU, "g", GROUP_NPU);
        MyRegister.registerBlock(new Sit(), NAMESPACE_NPU, "sit", GROUP_NPU);
        MyRegister.registerBlock(new Sky(), NAMESPACE_NPU, "sky", GROUP_NPU);
        MyRegister.registerBlock(new Star(), NAMESPACE_NPU, "star", GROUP_NPU);

        // StreetLamp
        MyRegister.registerBlock(new SL1(), NAMESPACE_NPU, "sl1", GROUP_NPU);
        MyRegister.registerBlock(new SL2(), NAMESPACE_NPU, "sl2", GROUP_NPU);
        MyRegister.registerBlock(new SL3(), NAMESPACE_NPU, "sl3", GROUP_NPU);

        // Trashs
        MyRegister.registerBlock(new Tool(), NAMESPACE_NPU, "tool", GROUP_NPU);
        MyRegister.registerBlock(new Trash(), NAMESPACE_NPU, "trash", GROUP_NPU);
        MyRegister.registerBlock(new Trash1(), NAMESPACE_NPU, "trash1", GROUP_NPU);
        MyRegister.registerBlock(new Trash2(), NAMESPACE_NPU, "trash2", GROUP_NPU);
        MyRegister.registerBlock(new Trash3(), NAMESPACE_NPU, "trash3", GROUP_NPU);
        MyRegister.registerBlock(new Trash4(), NAMESPACE_NPU, "trash4", GROUP_NPU);

        // Trees
        MyRegister.registerBlock(new Tree(), NAMESPACE_NPU, "tree", GROUP_NPU);
        MyRegister.registerBlock(new Tree1(), NAMESPACE_NPU, "tree1", GROUP_NPU);
        MyRegister.registerBlock(new Tree2(), NAMESPACE_NPU, "tree2", GROUP_NPU);
        MyRegister.registerBlock(new Tree3(), NAMESPACE_NPU, "tree3", GROUP_NPU);
        MyRegister.registerBlock(new TreeHole(), NAMESPACE_NPU, "treehole", GROUP_NPU);

        // Walls
        MyRegister.registerBlock(new Wall1(), NAMESPACE_NPU, "wall1", GROUP_NPU);
        MyRegister.registerBlock(new Wall10(), NAMESPACE_NPU, "wall10", GROUP_NPU);
        MyRegister.registerBlock(new Wall11(), NAMESPACE_NPU, "wall11", GROUP_NPU);
        MyRegister.registerBlock(new Wall12(), NAMESPACE_NPU, "wall12", GROUP_NPU);
        MyRegister.registerBlock(new Wall13(), NAMESPACE_NPU, "wall13", GROUP_NPU);
        MyRegister.registerBlock(new Wall14(), NAMESPACE_NPU, "wall14", GROUP_NPU);
        MyRegister.registerBlock(new Wall15(), NAMESPACE_NPU, "wall15", GROUP_NPU);
        MyRegister.registerBlock(new Wall2(), NAMESPACE_NPU, "wall2", GROUP_NPU);
        MyRegister.registerBlock(new Wall3(), NAMESPACE_NPU, "wall3", GROUP_NPU);
        MyRegister.registerBlock(new Wall4(), NAMESPACE_NPU, "wall4", GROUP_NPU);
        MyRegister.registerBlock(new Wall5(), NAMESPACE_NPU, "wall5", GROUP_NPU);
        MyRegister.registerBlock(new Wall6(), NAMESPACE_NPU, "wall6", GROUP_NPU);
        MyRegister.registerBlock(new Wall7(), NAMESPACE_NPU, "wall7", GROUP_NPU);
        MyRegister.registerBlock(new Wall8(), NAMESPACE_NPU, "wall8", GROUP_NPU);
        MyRegister.registerBlock(new Wall9(), NAMESPACE_NPU, "wall9", GROUP_NPU);

        // Washes
        MyRegister.registerBlock(new Wash1(), NAMESPACE_NPU, "wash1", GROUP_NPU);
        MyRegister.registerBlock(new Wash2(), NAMESPACE_NPU, "wash2", GROUP_NPU);
        MyRegister.registerBlock(new Wash3(), NAMESPACE_NPU, "wash3", GROUP_NPU);
        MyRegister.registerBlock(new Washer(), NAMESPACE_NPU, "washer", GROUP_NPU);

        // WGWall
        MyRegister.registerBlock(new WGWall(), NAMESPACE_NPU, "wgwall", GROUP_NPU);
        MyRegister.registerBlock(new WGWall1(), NAMESPACE_NPU, "wgwall1", GROUP_NPU);
        MyRegister.registerBlock(new WGWall2(), NAMESPACE_NPU, "wgwall2", GROUP_NPU);
        MyRegister.registerBlock(new WGWall3(), NAMESPACE_NPU, "wgwall3", GROUP_NPU);
        MyRegister.registerBlock(new WGWall4(), NAMESPACE_NPU, "wgwall4", GROUP_NPU);

        // Windows

        // Windows.Black
        MyRegister.registerBlock(new Winn1(), NAMESPACE_NPU, "winn1", GROUP_NPU);
        MyRegister.registerBlock(new Winn10(), NAMESPACE_NPU, "winn10", GROUP_NPU);
        MyRegister.registerBlock(new Winn11(), NAMESPACE_NPU, "winn11", GROUP_NPU);
        MyRegister.registerBlock(new Winn12(), NAMESPACE_NPU, "winn12", GROUP_NPU);
        MyRegister.registerBlock(new Winn13(), NAMESPACE_NPU, "winn13", GROUP_NPU);
        MyRegister.registerBlock(new Winn14(), NAMESPACE_NPU, "winn14", GROUP_NPU);
        MyRegister.registerBlock(new Winn15(), NAMESPACE_NPU, "winn15", GROUP_NPU);
        MyRegister.registerBlock(new Winn16(), NAMESPACE_NPU, "winn16", GROUP_NPU);
        MyRegister.registerBlock(new Winn17(), NAMESPACE_NPU, "winn17", GROUP_NPU);
        MyRegister.registerBlock(new Winn18(), NAMESPACE_NPU, "winn18", GROUP_NPU);
        MyRegister.registerBlock(new Winn19(), NAMESPACE_NPU, "winn19", GROUP_NPU);
        MyRegister.registerBlock(new Winn2(), NAMESPACE_NPU, "winn2", GROUP_NPU);
        MyRegister.registerBlock(new Winn20(), NAMESPACE_NPU, "winn20", GROUP_NPU);
        MyRegister.registerBlock(new Winn3(), NAMESPACE_NPU, "winn3", GROUP_NPU);
        MyRegister.registerBlock(new Winn4(), NAMESPACE_NPU, "winn4", GROUP_NPU);
        MyRegister.registerBlock(new Winn5(), NAMESPACE_NPU, "winn5", GROUP_NPU);
        MyRegister.registerBlock(new Winn6(), NAMESPACE_NPU, "winn6", GROUP_NPU);
        MyRegister.registerBlock(new Winn7(), NAMESPACE_NPU, "winn7", GROUP_NPU);
        MyRegister.registerBlock(new Winn8(), NAMESPACE_NPU, "winn8", GROUP_NPU);
        MyRegister.registerBlock(new Winn9(), NAMESPACE_NPU, "winn9", GROUP_NPU);

        // Windows.Blue
        MyRegister.registerBlock(new Winnn1(), NAMESPACE_NPU, "winnn1", GROUP_NPU);
        MyRegister.registerBlock(new Winnn10(), NAMESPACE_NPU, "winnn10", GROUP_NPU);
        MyRegister.registerBlock(new Winnn11(), NAMESPACE_NPU, "winnn11", GROUP_NPU);
        MyRegister.registerBlock(new Winnn12(), NAMESPACE_NPU, "winnn12", GROUP_NPU);
        MyRegister.registerBlock(new Winnn13(), NAMESPACE_NPU, "winnn13", GROUP_NPU);
        MyRegister.registerBlock(new Winnn14(), NAMESPACE_NPU, "winnn14", GROUP_NPU);
        MyRegister.registerBlock(new Winnn15(), NAMESPACE_NPU, "winnn15", GROUP_NPU);
        MyRegister.registerBlock(new Winnn16(), NAMESPACE_NPU, "winnn16", GROUP_NPU);
        MyRegister.registerBlock(new Winnn17(), NAMESPACE_NPU, "winnn17", GROUP_NPU);
        MyRegister.registerBlock(new Winnn18(), NAMESPACE_NPU, "winnn18", GROUP_NPU);
        MyRegister.registerBlock(new Winnn19(), NAMESPACE_NPU, "winnn19", GROUP_NPU);
        MyRegister.registerBlock(new Winnn2(), NAMESPACE_NPU, "winnn2", GROUP_NPU);
        MyRegister.registerBlock(new Winnn20(), NAMESPACE_NPU, "winnn20", GROUP_NPU);
        MyRegister.registerBlock(new Winnn21(), NAMESPACE_NPU, "winnn21", GROUP_NPU);
        MyRegister.registerBlock(new Winnn22(), NAMESPACE_NPU, "winnn22", GROUP_NPU);
        MyRegister.registerBlock(new Winnn23(), NAMESPACE_NPU, "winnn23", GROUP_NPU);
        MyRegister.registerBlock(new Winnn3(), NAMESPACE_NPU, "winnn3", GROUP_NPU);
        MyRegister.registerBlock(new Winnn4(), NAMESPACE_NPU, "winnn4", GROUP_NPU);
        MyRegister.registerBlock(new Winnn5(), NAMESPACE_NPU, "winnn5", GROUP_NPU);
        MyRegister.registerBlock(new Winnn6(), NAMESPACE_NPU, "winnn6", GROUP_NPU);
        MyRegister.registerBlock(new Winnn7(), NAMESPACE_NPU, "winnn7", GROUP_NPU);
        MyRegister.registerBlock(new Winnn8(), NAMESPACE_NPU, "winnn8", GROUP_NPU);
        MyRegister.registerBlock(new Winnn9(), NAMESPACE_NPU, "winnn9", GROUP_NPU);

        // Windows.Normal
        MyRegister.registerBlock(new Win1(), NAMESPACE_NPU, "win1", GROUP_NPU);
        MyRegister.registerBlock(new Win10(), NAMESPACE_NPU, "win10", GROUP_NPU);
        MyRegister.registerBlock(new Win11(), NAMESPACE_NPU, "win11", GROUP_NPU);
        MyRegister.registerBlock(new Win2(), NAMESPACE_NPU, "win2", GROUP_NPU);
        MyRegister.registerBlock(new Win3(), NAMESPACE_NPU, "win3", GROUP_NPU);
        MyRegister.registerBlock(new Win4(), NAMESPACE_NPU, "win4", GROUP_NPU);
        MyRegister.registerBlock(new Win5(), NAMESPACE_NPU, "win5", GROUP_NPU);
        MyRegister.registerBlock(new Win6(), NAMESPACE_NPU, "win6", GROUP_NPU);
        MyRegister.registerBlock(new Win7(), NAMESPACE_NPU, "win7", GROUP_NPU);
        MyRegister.registerBlock(new Win8(), NAMESPACE_NPU, "win8", GROUP_NPU);
        MyRegister.registerBlock(new Win9(), NAMESPACE_NPU, "win9", GROUP_NPU);
        MyRegister.registerBlock(new Window10(), NAMESPACE_NPU, "window10", GROUP_NPU);
        MyRegister.registerBlock(new Window11(), NAMESPACE_NPU, "window11", GROUP_NPU);
        MyRegister.registerBlock(new WindowOut(), NAMESPACE_NPU, "windowout", GROUP_NPU);

        // Windows.White
        MyRegister.registerBlock(new Winw1(), NAMESPACE_NPU, "winw1", GROUP_NPU);
        MyRegister.registerBlock(new Winw2(), NAMESPACE_NPU, "winw2", GROUP_NPU);
        MyRegister.registerBlock(new Winw3(), NAMESPACE_NPU, "winw3", GROUP_NPU);

        // YF
        MyRegister.registerBlock(new YF(), NAMESPACE_NPU, "yf", GROUP_NPU);
        MyRegister.registerBlock(new YF1(), NAMESPACE_NPU, "yf1", GROUP_NPU);
        MyRegister.registerBlock(new YF10(), NAMESPACE_NPU, "yf10", GROUP_NPU);
        MyRegister.registerBlock(new YF11(), NAMESPACE_NPU, "yf11", GROUP_NPU);
        MyRegister.registerBlock(new YF12(), NAMESPACE_NPU, "yf12", GROUP_NPU);
        MyRegister.registerBlock(new YF2(), NAMESPACE_NPU, "yf2", GROUP_NPU);
        MyRegister.registerBlock(new YF3(), NAMESPACE_NPU, "yf3", GROUP_NPU);
        MyRegister.registerBlock(new YF4(), NAMESPACE_NPU, "yf4", GROUP_NPU);
        MyRegister.registerBlock(new YF5(), NAMESPACE_NPU, "yf5", GROUP_NPU);
        MyRegister.registerBlock(new YF6(), NAMESPACE_NPU, "yf6", GROUP_NPU);
        MyRegister.registerBlock(new YF7(), NAMESPACE_NPU, "yf7", GROUP_NPU);
        MyRegister.registerBlock(new YF8(), NAMESPACE_NPU, "yf8", GROUP_NPU);
        MyRegister.registerBlock(new YF9(), NAMESPACE_NPU, "yf9", GROUP_NPU);


    }



}

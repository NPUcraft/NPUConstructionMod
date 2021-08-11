package com.npucraft.npuconstruction.Init.Register;

import com.npucraft.npuconstruction.Block.ClockHand;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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

import com.npucraft.npuconstruction.Block.Pavilion.*;

public class MyBlockRegister {
    // BBed
    public static final BBed2L BBED2L = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bbed2l"), new BBed2L());
    public static final BBed2R BBED2R = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bbed2r"), new BBed2R());
    public static final BBed2R1 BBED2R1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bbed2r1"), new BBed2R1());
    public static final BBedL BBEDL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bbedl"), new BBedL());
    public static final BBedR BBEDR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bbedr"), new BBedR());

    // Bikes
    public static final Bike1 BIKE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bike1"), new Bike1());
    public static final Bike2 BIKE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bike2"), new Bike2());
    public static final Bike3 BIKE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bike3"), new Bike3());
    public static final Bike4 BIKE4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bike4"), new Bike4());

    // Camera
    public static final Cam1 CAM1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cam1"), new Cam1());
    public static final Cam2 CAM2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cam2"), new Cam2());

    // Ceiling
    public static final C1 C1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "c1"), new C1());
    public static final C2 C2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "c2"), new C2());
    public static final C3 C3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "c3"), new C3());
    public static final C4 C4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "c4"), new C4());
    public static final C5 C5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "c5"), new C5());

    // Constructions
    public static final BPDown BPDOWN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bpdown"), new BPDown());
    public static final BPUp BPUP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bpup"), new BPUp());
    public static final BRailing BRAILING = Registry.register(Registry.BLOCK,
            new Identifier("npu", "brailing"), new BRailing());
    public static final CCH CCH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cch"), new CCH());
    public static final Mesh MESH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "mesh"), new Mesh());
    public static final NN NN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "nn"), new NN());
    public static final QH QH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "qh"), new QH());
    public static final RoadBlock ROADBLOCK = Registry.register(Registry.BLOCK,
            new Identifier("npu", "roadblock"), new RoadBlock());
    public static final TestBlock TESTBLOCK = Registry.register(Registry.BLOCK,
            new Identifier("npu", "testblock"), new TestBlock());
    public static final WindowFrame WINDOWFRAME = Registry.register(Registry.BLOCK,
            new Identifier("npu", "windowframe"), new WindowFrame());

    // Decorations
    public static final Alu ALU = Registry.register(Registry.BLOCK,
            new Identifier("npu", "alu"), new Alu());
    public static final Board BOARD = Registry.register(Registry.BLOCK,
            new Identifier("npu", "board"), new Board());
    public static final Cal CAL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cal"), new Cal());
    public static final CBB CBB = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cbb"), new CBB());
    public static final Exit EXIT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "exit"), new Exit());
    public static final Fan FAN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fan"), new Fan());
    public static final FC FC = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fc"), new FC());
    public static final Mirror MIRROR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "mirror"), new Mirror());
    public static final N1 N1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "n1"), new N1());
    public static final N2 N2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "n2"), new N2());
    public static final Projector PROJECTOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "projector"), new Projector());
    public static final SC SC = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sc"), new SC());
    public static final Sign1 SIGN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sign1"), new Sign1());
    public static final Sign2 SIGN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sign2"), new Sign2());
    public static final Sign3 SIGN3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sign3"), new Sign3());
    public static final Tele TELE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "tele"), new Tele());
    public static final Voltage VOLTAGE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "voltage"), new Voltage());
    public static final WBoard WBOARD = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wboard"), new WBoard());
    public static final WTable WTABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wtable"), new WTable());

    // Decs
    public static final Dec1 DEC1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dec1"), new Dec1());
    public static final Dec2 DEC2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dec2"), new Dec2());
    public static final Dec3 DEC3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dec3"), new Dec3());
    public static final Dec4 DEC4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dec4"), new Dec4());

    // Desks

    // Desks.Blue
    public static final BlueClassroomDesk1 BLUECLASSROOMDESK1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "blueclassroomdesk1"), new BlueClassroomDesk1());
    public static final BlueClassroomDesk2 BLUECLASSROOMDESK2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "blueclassroomdesk2"), new BlueClassroomDesk2());
    public static final BlueClassroomDesk3 BLUECLASSROOMDESK3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "blueclassroomdesk3"), new BlueClassroomDesk3());
    public static final BlueClassroomDesk4 BLUECLASSROOMDESK4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "blueclassroomdesk4"), new BlueClassroomDesk4());
    public static final BlueClassroomDesk5 BLUECLASSROOMDESK5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "blueclassroomdesk5"), new BlueClassroomDesk5());

    // Desks.Wood
    public static final WoodClassroomDesk1 WOODCLASSROOMDESK1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "woodclassroomdesk1"), new WoodClassroomDesk1());
    public static final WoodClassroomDesk2 WOODCLASSROOMDESK2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "woodclassroomdesk2"), new WoodClassroomDesk2());
    public static final WoodClassroomDesk3 WOODCLASSROOMDESK3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "woodclassroomdesk3"), new WoodClassroomDesk3());
    public static final WoodClassroomDesk4 WOODCLASSROOMDESK4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "woodclassroomdesk4"), new WoodClassroomDesk4());
    public static final WoodClassroomDesk5 WOODCLASSROOMDESK5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "woodclassroomdesk5"), new WoodClassroomDesk5());

    // DHalls
    public static final DHall DHALL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall"), new DHall());
    public static final DHall1 DHALL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall1"), new DHall1());
    public static final DHall10 DHALL10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall10"), new DHall10());
    public static final DHall11 DHALL11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall11"), new DHall11());
    public static final DHall12 DHALL12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall12"), new DHall12());
    public static final DHall13 DHALL13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall13"), new DHall13());
    public static final DHall2 DHALL2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall2"), new DHall2());
    public static final DHall3 DHALL3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall3"), new DHall3());
    public static final DHall4 DHALL4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall4"), new DHall4());
    public static final DHall5 DHALL5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall5"), new DHall5());
    public static final DHall6 DHALL6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall6"), new DHall6());
    public static final DHall7 DHALL7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall7"), new DHall7());
    public static final DHall8 DHALL8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall8"), new DHall8());
    public static final DHall9 DHALL9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dhall9"), new DHall9());

    // Doors
    public static final Bath BATH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bath"), new Bath());
    public static final BFrame BFRAME = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bframe"), new BFrame());
    public static final BFrame1 BFRAME1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bframe1"), new BFrame1());
    public static final BFrame2 BFRAME2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "bframe2"), new BFrame2());
    public static final D1 D1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d1"), new D1());
    public static final D2 D2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d2"), new D2());
    public static final D3 D3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d3"), new D3());
    public static final D4 D4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d4"), new D4());
    public static final D5 D5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d5"), new D5());
    public static final D6 D6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d6"), new D6());
    public static final D7 D7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d7"), new D7());
    public static final Door DOOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door"), new Door());
    public static final Door1 DOOR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door1"), new Door1());
    public static final Door10 DOOR10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door10"), new Door10());
    public static final Door2 DOOR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door2"), new Door2());
    public static final Door3 DOOR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door3"), new Door3());
    public static final Door4 DOOR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door4"), new Door4());
    public static final Door5 DOOR5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door5"), new Door5());
    public static final Door6 DOOR6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door6"), new Door6());
    public static final Door7 DOOR7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door7"), new Door7());
    public static final Door8 DOOR8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door8"), new Door8());
    public static final Door9 DOOR9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "door9"), new Door9());
    public static final EleV ELEV = Registry.register(Registry.BLOCK,
            new Identifier("npu", "elev"), new EleV());
    public static final SDFrame SDFRAME = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sdframe"), new SDFrame());

    // Doors.Black
    public static final DB1 DB1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db1"), new DB1());
    public static final DB2 DB2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db2"), new DB2());
    public static final DB3 DB3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db3"), new DB3());
    public static final DB4 DB4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db4"), new DB4());
    public static final DB5 DB5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db5"), new DB5());
    public static final DB6 DB6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db6"), new DB6());
    public static final DB7 DB7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db7"), new DB7());
    public static final DB8 DB8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "db8"), new DB8());

    // Doors.White
    public static final DW1 DW1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw1"), new DW1());
    public static final DW10 DW10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw10"), new DW10());
    public static final DW2 DW2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw2"), new DW2());
    public static final DW3 DW3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw3"), new DW3());
    public static final DW4 DW4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw4"), new DW4());
    public static final DW5 DW5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw5"), new DW5());
    public static final DW6 DW6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw6"), new DW6());
    public static final DW7 DW7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw7"), new DW7());
    public static final DW8 DW8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw8"), new DW8());
    public static final DW9 DW9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dw9"), new DW9());

    // Drinks
    public static final Drink DRINK = Registry.register(Registry.BLOCK,
            new Identifier("npu", "drink"), new Drink());
    public static final Drink1 DRINK1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "drink1"), new Drink1());
    public static final Drink3 DRINK3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "drink3"), new Drink3());
    public static final Drink4 DRINK4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "drink4"), new Drink4());
    public static final Drink5 DRINK5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "drink5"), new Drink5());
    public static final Drink6 DRINK6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "drink6"), new Drink6());

    // Fence
    public static final Fence1 FENCE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence1"), new Fence1());
    public static final Fence10 FENCE10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence10"), new Fence10());
    public static final Fence11 FENCE11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence11"), new Fence11());
    public static final Fence2 FENCE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence2"), new Fence2());
    public static final Fence3 FENCE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence3"), new Fence3());
    public static final Fence4 FENCE4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence4"), new Fence4());
    public static final Fence5 FENCE5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence5"), new Fence5());
    public static final Fence6 FENCE6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence6"), new Fence6());
    public static final Fence7 FENCE7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence7"), new Fence7());
    public static final Fence8 FENCE8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence8"), new Fence8());
    public static final Fence9 FENCE9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fence9"), new Fence9());
    public static final FenceO FENCEO = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fenceo"), new FenceO());

    // Floors
    public static final Floor2 FLOOR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "floor2"), new Floor2());
    public static final Floor3 FLOOR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "floor3"), new Floor3());
    public static final Floor4 FLOOR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "floor4"), new Floor4());
    public static final Floor5 FLOOR5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "floor5"), new Floor5());
    public static final Floor6 FLOOR6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "floor6"), new Floor6());

    // FlowerDid

    // FlowerDid.Day221
    public static final FBrailingl FBRAILINGL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fbrailingl"), new FBrailingl());
    public static final FBrailingr FBRAILINGR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fbrailingr"), new FBrailingr());
    public static final FCart1 FCART1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcart1"), new FCart1());
    public static final FG77 FG77 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg77"), new FG77());
    public static final FG78 FG78 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg78"), new FG78());
    public static final FG79 FG79 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg79"), new FG79());
    public static final FG80 FG80 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg80"), new FG80());
    public static final FHump FHUMP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fhump"), new FHump());
    public static final FHump1 FHUMP1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fhump1"), new FHump1());
    public static final FLChair FLCHAIR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flchair"), new FLChair());
    public static final FLight11 FLIGHT11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight11"), new FLight11());
    public static final FStool FSTOOL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstool"), new FStool());
    public static final FStool1 FSTOOL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstool1"), new FStool1());
    public static final FWell FWELL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwell"), new FWell());
    public static final FWell1 FWELL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwell1"), new FWell1());
    public static final FWell2 FWELL2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwell2"), new FWell2());
    public static final FWell3 FWELL3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwell3"), new FWell3());

    // FlowerDid.Day222
    public static final FCTable FCTABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable"), new FCTable());
    public static final FCTable1 FCTABLE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable1"), new FCTable1());
    public static final FCTV FCTV = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctv"), new FCTV());
    public static final FCTV1 FCTV1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctv1"), new FCTV1());
    public static final FFan FFAN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "ffan"), new FFan());
    public static final FLine FLINE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline"), new FLine());
    public static final FLine1 FLINE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline1"), new FLine1());
    public static final FLine10 FLINE10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline10"), new FLine10());
    public static final FLine11 FLINE11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline11"), new FLine11());
    public static final FLine12 FLINE12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline12"), new FLine12());
    public static final FLine13 FLINE13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline13"), new FLine13());
    public static final FLine14 FLINE14 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline14"), new FLine14());
    public static final FLine15 FLINE15 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline15"), new FLine15());
    public static final FLine16 FLINE16 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline16"), new FLine16());
    public static final FLine17 FLINE17 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline17"), new FLine17());
    public static final FLine18 FLINE18 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline18"), new FLine18());
    public static final FLine19 FLINE19 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline19"), new FLine19());
    public static final FLine2 FLINE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline2"), new FLine2());
    public static final FLine20 FLINE20 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline20"), new FLine20());
    public static final FLine21 FLINE21 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline21"), new FLine21());
    public static final FLine22 FLINE22 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline22"), new FLine22());
    public static final FLine23 FLINE23 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline23"), new FLine23());
    public static final FLine24 FLINE24 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline24"), new FLine24());
    public static final FLine3 FLINE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline3"), new FLine3());
    public static final FLine4 FLINE4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline4"), new FLine4());
    public static final FLine5 FLINE5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline5"), new FLine5());
    public static final FLine6 FLINE6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline6"), new FLine6());
    public static final FLine7 FLINE7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline7"), new FLine7());
    public static final FLine8 FLINE8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline8"), new FLine8());
    public static final FLine9 FLINE9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fline9"), new FLine9());
    public static final FVent1 FVENT1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fvent1"), new FVent1());
    public static final FVent2 FVENT2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fvent2"), new FVent2());

    // FlowerDid.Day228
    public static final FCFloor FCFLOOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcfloor"), new FCFloor());
    public static final FCFloor1 FCFLOOR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcfloor1"), new FCFloor1());
    public static final FCFloor2 FCFLOOR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcfloor2"), new FCFloor2());
    public static final FCFloor3 FCFLOOR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcfloor3"), new FCFloor3());
    public static final FCFloor4 FCFLOOR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcfloor4"), new FCFloor4());
    public static final FG82 FG82 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg82"), new FG82());
    public static final FG83 FG83 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg83"), new FG83());
    public static final FG84 FG84 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg84"), new FG84());
    public static final FG85 FG85 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg85"), new FG85());
    public static final FG86 FG86 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg86"), new FG86());
    public static final FG87 FG87 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg87"), new FG87());
    public static final FSWash FSWASH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fswash"), new FSWash());
    public static final FYFDoor6 FYFDOOR6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor6"), new FYFDoor6());
    public static final FYFDoor7 FYFDOOR7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor7"), new FYFDoor7());
    public static final FYFDoor8 FYFDOOR8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor8"), new FYFDoor8());
    public static final FYFDoor9 FYFDOOR9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor9"), new FYFDoor9());

    // FlowerDid.Day310
    public static final FContainer FCONTAINER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcontainer"), new FContainer());
    public static final FContainer1 FCONTAINER1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcontainer1"), new FContainer1());
    public static final FContainer2 FCONTAINER2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcontainer2"), new FContainer2());
    public static final FG93 FG93 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg93"), new FG93());
    public static final FG94 FG94 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg94"), new FG94());
    public static final FG95 FG95 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg95"), new FG95());
    public static final FG96 FG96 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg96"), new FG96());
    public static final FLight12 FLIGHT12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight12"), new FLight12());
    public static final FLight13 FLIGHT13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight13"), new FLight13());
    public static final FSign FSIGN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign"), new FSign());
    public static final FSign1 FSIGN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign1"), new FSign1());
    public static final FSign2 FSIGN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign2"), new FSign2());
    public static final FSign3 FSIGN3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign3"), new FSign3());
    public static final FWindow FWINDOW = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwindow"), new FWindow());
    public static final FWindow1 FWINDOW1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwindow1"), new FWindow1());
    public static final FWindow2 FWINDOW2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwindow2"), new FWindow2());
    public static final FWindow3 FWINDOW3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwindow3"), new FWindow3());
    public static final FWindow4 FWINDOW4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwindow4"), new FWindow4());
    public static final FWindow5 FWINDOW5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwindow5"), new FWindow5());

    // FlowerDid.Day312
    public static final FBox FBOX = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fbox"), new FBox());
    public static final FBox1 FBOX1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fbox1"), new FBox1());
    public static final FCTable2 FCTABLE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable2"), new FCTable2());
    public static final FCTable3 FCTABLE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable3"), new FCTable3());
    public static final FCTable4 FCTABLE4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable4"), new FCTable4());
    public static final FCTable5 FCTABLE5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable5"), new FCTable5());
    public static final FCTable6 FCTABLE6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fctable6"), new FCTable6());
    public static final FRoadblocks FROADBLOCKS = Registry.register(Registry.BLOCK,
            new Identifier("npu", "froadblocks"), new FRoadblocks());
    public static final FRod FROD = Registry.register(Registry.BLOCK,
            new Identifier("npu", "frod"), new FRod());
    public static final FRod1 FROD1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "frod1"), new FRod1());
    public static final FShelf FSHELF = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fshelf"), new FShelf());
    public static final FShelf1 FSHELF1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fshelf1"), new FShelf1());
    public static final FSign4 FSIGN4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign4"), new FSign4());
    public static final FSign5 FSIGN5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign5"), new FSign5());
    public static final FSign6 FSIGN6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign6"), new FSign6());
    public static final FSign7 FSIGN7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign7"), new FSign7());
    public static final FSign8 FSIGN8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsign8"), new FSign8());
    public static final FSmoke FSMOKE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fsmoke"), new FSmoke());
    public static final FStove FSTOVE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstove"), new FStove());
    public static final FStove1 FSTOVE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstove1"), new FStove1());
    public static final FStove2 FSTOVE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstove2"), new FStove2());
    public static final FSwitch FSWITCH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fswitch"), new FSwitch());

    // FlowerDid.Others
    public static final FBTable FBTABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fbtable"), new FBTable());
    public static final FCamera FCAMERA = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcamera"), new FCamera());
    public static final FCamera1 FCAMERA1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcamera1"), new FCamera1());
    public static final FCamera2 FCAMERA2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcamera2"), new FCamera2());
    public static final FCamera3 FCAMERA3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcamera3"), new FCamera3());
    public static final FCamera4 FCAMERA4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcamera4"), new FCamera4());
    public static final FCamera5 FCAMERA5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcamera5"), new FCamera5());
    public static final FCart FCART = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fcart"), new FCart());
    public static final FChopsticks FCHOPSTICKS = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fchopsticks"), new FChopsticks());
    public static final FDoorNum FDOORNUM = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fdoornum"), new FDoorNum());
    public static final FDoorScreen FDOORSCREEN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fdoorscreen"), new FDoorScreen());
    public static final FDoorSwitch FDOORSWITCH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fdoorswitch"), new FDoorSwitch());
    public static final FG76 FG76 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg76"), new FG76());
    public static final FG81 FG81 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg81"), new FG81());
    public static final FG88 FG88 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg88"), new FG88());
    public static final FG89 FG89 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg89"), new FG89());
    public static final FG90 FG90 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg90"), new FG90());
    public static final FG91 FG91 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg91"), new FG91());
    public static final FG92 FG92 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg92"), new FG92());
    public static final FGallery1 FGALLERY1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgallery1"), new FGallery1());
    public static final FGallery2 FGALLERY2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgallery2"), new FGallery2());
    public static final FGallery3 FGALLERY3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgallery3"), new FGallery3());
    public static final FGallery4 FGALLERY4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgallery4"), new FGallery4());
    public static final FGallery5 FGALLERY5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgallery5"), new FGallery5());
    public static final FGirlDoor FGIRLDOOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirldoor"), new FGirlDoor());
    public static final FGirlDoor1 FGIRLDOOR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirldoor1"), new FGirlDoor1());
    public static final FGirlDoor2 FGIRLDOOR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirldoor2"), new FGirlDoor2());
    public static final FGirlDoor3 FGIRLDOOR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirldoor3"), new FGirlDoor3());
    public static final FGirlDoor4 FGIRLDOOR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirldoor4"), new FGirlDoor4());
    public static final FGirlDoor5 FGIRLDOOR5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirldoor5"), new FGirlDoor5());
    public static final FGirlTL1 FGIRLTL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirltl1"), new FGirlTL1());
    public static final FGirlTR1 FGIRLTR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fgirltr1"), new FGirlTR1());
    public static final FHallScreen1 FHALLSCREEN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fhallscreen1"), new FHallScreen1());
    public static final FHallScreen2 FHALLSCREEN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fhallscreen2"), new FHallScreen2());
    public static final FHTable FHTABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fhtable"), new FHTable());
    public static final FLight1 FLIGHT1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight1"), new FLight1());
    public static final FLight10 FLIGHT10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight10"), new FLight10());
    public static final FLight2 FLIGHT2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight2"), new FLight2());
    public static final FLight3 FLIGHT3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight3"), new FLight3());
    public static final FLight4 FLIGHT4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight4"), new FLight4());
    public static final FLight5 FLIGHT5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight5"), new FLight5());
    public static final FLight6 FLIGHT6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight6"), new FLight6());
    public static final FLight7 FLIGHT7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight7"), new FLight7());
    public static final FLight8 FLIGHT8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight8"), new FLight8());
    public static final FLight9 FLIGHT9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "flight9"), new FLight9());
    public static final FMP FMP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fmp"), new FMP());
    public static final FNorthHall1 FNORTHHALL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fnorthhall1"), new FNorthHall1());
    public static final FNorthHall2 FNORTHHALL2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fnorthhall2"), new FNorthHall2());
    public static final FNorthHall3 FNORTHHALL3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fnorthhall3"), new FNorthHall3());
    public static final FNorthHall4 FNORTHHALL4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fnorthhall4"), new FNorthHall4());
    public static final FNorthHall5 FNORTHHALL5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fnorthhall5"), new FNorthHall5());
    public static final FPipe FPIPE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe"), new FPipe());
    public static final FPipe1 FPIPE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe1"), new FPipe1());
    public static final FPipe10 FPIPE10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe10"), new FPipe10());
    public static final FPipe2 FPIPE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe2"), new FPipe2());
    public static final FPipe3 FPIPE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe3"), new FPipe3());
    public static final FPipe4 FPIPE4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe4"), new FPipe4());
    public static final FPipe5 FPIPE5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe5"), new FPipe5());
    public static final FPipe6 FPIPE6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe6"), new FPipe6());
    public static final FPipe7 FPIPE7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe7"), new FPipe7());
    public static final FPipe8 FPIPE8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe8"), new FPipe8());
    public static final FPipe9 FPIPE9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fpipe9"), new FPipe9());
    public static final FRadiator FRADIATOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fradiator"), new FRadiator());
    public static final FStation FSTATION = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstation"), new FStation());
    public static final FStation1 FSTATION1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstation1"), new FStation1());
    public static final FStation2 FSTATION2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fstation2"), new FStation2());
    public static final FTrash FTRASH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "ftrash"), new FTrash());
    public static final FTSigh FTSIGH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "ftsigh"), new FTSigh());
    public static final FVent FVENT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fvent"), new FVent());
    public static final FWashl FWASHL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwashl"), new FWashl());
    public static final FWashr FWASHR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwashr"), new FWashr());
    public static final FWinL FWINL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwinl"), new FWinL());
    public static final FWinR FWINR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fwinr"), new FWinR());
    public static final FYFDoor FYFDOOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor"), new FYFDoor());
    public static final FYFDoor1 FYFDOOR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor1"), new FYFDoor1());
    public static final FYFdoor2 FYFDOOR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor2"), new FYFdoor2());
    public static final FYFdoor3 FYFDOOR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor3"), new FYFdoor3());
    public static final FYFdoor4 FYFDOOR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor4"), new FYFdoor4());
    public static final FYFdoor5 FYFDOOR5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyfdoor5"), new FYFdoor5());
    public static final FYFTL FYFTL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyftl"), new FYFTL());
    public static final FYFTL1 FYFTL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyftl1"), new FYFTL1());
    public static final FYFTR FYFTR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyftr"), new FYFTR());
    public static final FYFTR1 FYFTR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fyftr1"), new FYFTR1());

    // G
    public static final FG53 FG53 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg53"), new FG53());
    public static final FG54 FG54 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg54"), new FG54());
    public static final FG55 FG55 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg55"), new FG55());
    public static final FG56 FG56 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg56"), new FG56());
    public static final FG57 FG57 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg57"), new FG57());
    public static final FG58 FG58 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg58"), new FG58());
    public static final FG59 FG59 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg59"), new FG59());
    public static final FG60 FG60 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg60"), new FG60());
    public static final FG61 FG61 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg61"), new FG61());
    public static final FG62 FG62 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg62"), new FG62());
    public static final FG63 FG63 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg63"), new FG63());
    public static final FG64 FG64 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg64"), new FG64());
    public static final FG65 FG65 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg65"), new FG65());
    public static final FG66 FG66 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg66"), new FG66());
    public static final FG67 FG67 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg67"), new FG67());
    public static final FG68 FG68 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg68"), new FG68());
    public static final FG69 FG69 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg69"), new FG69());
    public static final FG70 FG70 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg70"), new FG70());
    public static final FG71 FG71 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg71"), new FG71());
    public static final FG72 FG72 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg72"), new FG72());
    public static final FG73 FG73 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg73"), new FG73());
    public static final FG74 FG74 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg74"), new FG74());
    public static final FG75 FG75 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fg75"), new FG75());
    public static final G1 G1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g1"), new G1());
    public static final G10 G10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g10"), new G10());
    public static final G11 G11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g11"), new G11());
    public static final G12 G12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g12"), new G12());
    public static final G13 G13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g13"), new G13());
    public static final G14 G14 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g14"), new G14());
    public static final G15 G15 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g15"), new G15());
    public static final G16 G16 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g16"), new G16());
    public static final G17 G17 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g17"), new G17());
    public static final G18 G18 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g18"), new G18());
    public static final G19 G19 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g19"), new G19());
    public static final G2 G2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g2"), new G2());
    public static final G20 G20 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g20"), new G20());
    public static final G21a G21A = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g21a"), new G21a());
    public static final G21b G21B = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g21b"), new G21b());
    public static final G21c G21C = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g21c"), new G21c());
    public static final G22 G22 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g22"), new G22());
    public static final G23 G23 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g23"), new G23());
    public static final G24 G24 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g24"), new G24());
    public static final G25 G25 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g25"), new G25());
    public static final G26 G26 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g26"), new G26());
    public static final G27 G27 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g27"), new G27());
    public static final G28 G28 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g28"), new G28());
    public static final G29 G29 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g29"), new G29());
    public static final G3 G3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g3"), new G3());
    public static final G30 G30 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g30"), new G30());
    public static final G31 G31 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g31"), new G31());
    public static final G32 G32 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g32"), new G32());
    public static final G33 G33 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g33"), new G33());
    public static final G34 G34 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g34"), new G34());
    public static final G35 G35 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g35"), new G35());
    public static final G36 G36 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g36"), new G36());
    public static final G37 G37 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g37"), new G37());
    public static final G38 G38 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g38"), new G38());
    public static final G39 G39 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g39"), new G39());
    public static final G4 G4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g4"), new G4());
    public static final G40 G40 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g40"), new G40());
    public static final G41 G41 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g41"), new G41());
    public static final G42 G42 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g42"), new G42());
    public static final G43 G43 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g43"), new G43());
    public static final G44 G44 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g44"), new G44());
    public static final G45 G45 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g45"), new G45());
    public static final G46 G46 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g46"), new G46());
    public static final G47 G47 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g47"), new G47());
    public static final G48 G48 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g48"), new G48());
    public static final G49 G49 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g49"), new G49());
    public static final G5 G5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g5"), new G5());
    public static final G50 G50 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g50"), new G50());
    public static final G51 G51 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g51"), new G51());
    public static final G52 G52 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g52"), new G52());
    public static final G53 G53 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g53"), new G53());
    public static final G54 G54 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g54"), new G54());
    public static final G55 G55 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g55"), new G55());
    public static final G6 G6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g6"), new G6());
    public static final G7 G7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g7"), new G7());
    public static final G8 G8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g8"), new G8());
    public static final G9 G9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g9"), new G9());

    // Girl
    public static final GirlBedL GIRLBEDL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "girlbedl"), new GirlBedL());
    public static final GirlBedR GIRLBEDR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "girlbedr"), new GirlBedR());
    public static final GirlShelf GIRLSHELF = Registry.register(Registry.BLOCK,
            new Identifier("npu", "girlshelf"), new GirlShelf());
    public static final GirlTL GIRLTL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "girltl"), new GirlTL());
    public static final GirlTR GIRLTR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "girltr"), new GirlTR());
    public static final GirlWash GIRLWASH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "girlwash"), new GirlWash());

    // Guns
    public static final Gun GUN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "gun"), new Gun());
    public static final Gun1 GUN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "gun1"), new Gun1());

    // HandRail
    public static final HR1 HR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "hr1"), new HR1());
    public static final HR2 HR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "hr2"), new HR2());
    public static final HR3 HR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "hr3"), new HR3());
    public static final HR4 HR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "hr4"), new HR4());
    public static final HR5 HR5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "hr5"), new HR5());

    // Lights
    public static final Light LIGHT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light"), new Light());
    public static final Light1 LIGHT1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light1"), new Light1());
    public static final Light2 LIGHT2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light2"), new Light2());
    public static final Light3 LIGHT3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light3"), new Light3());
    public static final Light4 LIGHT4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light4"), new Light4());
    public static final Light5 LIGHT5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light5"), new Light5());
    public static final Light6 LIGHT6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light6"), new Light6());
    public static final Light7 LIGHT7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light7"), new Light7());
    public static final Light8 LIGHT8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light8"), new Light8());
    public static final Light9 LIGHT9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "light9"), new Light9());

    // Market
    public static final MarketCabinetFreezer MARKETCABINETFREEZER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "market_cabinet_freezer"), new MarketCabinetFreezer());
    public static final MarketCashierDeskLeft MARKETCASHIERDESKLEFT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "market_cashier_desk_left"), new MarketCashierDeskLeft());
    public static final MarketCashierDeskRight MARKETCASHIERDESKRIGHT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "market_cashier_desk_right"), new MarketCashierDeskRight());
    public static final MarketMilkBox MARKETMILKBOX = Registry.register(Registry.BLOCK,
            new Identifier("npu", "market_milk_box"), new MarketMilkBox());
    public static final MarketOfficeCabinetDown MARKETOFFICECABINETDOWN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "market_office_cabinet_down"), new MarketOfficeCabinetDown());
    public static final MarketOfficeCabinetUp MARKETOFFICECABINETUP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "market_office_cabinet_up"), new MarketOfficeCabinetUp());

    // Others
    public static final AC AC = Registry.register(Registry.BLOCK,
            new Identifier("npu", "ac"), new AC());
    public static final ACAdd1 ACADD1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "acadd1"), new ACAdd1());
    public static final ACAdd2 ACADD2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "acadd2"), new ACAdd2());
    public static final AirConIn AIRCONIN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "airconin"), new AirConIn());
    public static final AirConOut AIRCONOUT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "airconout"), new AirConOut());
    public static final AirConOut1 AIRCONOUT1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "airconout1"), new AirConOut1());
    public static final AirConOut2 AIRCONOUT2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "airconout2"), new AirConOut2());
    public static final ATable ATABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "atable"), new ATable());
    public static final Atlas ATLAS = Registry.register(Registry.BLOCK,
            new Identifier("npu", "atlas"), new Atlas());
    public static final Box BOX = Registry.register(Registry.BLOCK,
            new Identifier("npu", "box"), new Box());
    public static final Box1 BOX1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "box1"), new Box1());
    public static final Chair CHAIR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "chair"), new Chair());
    public static final Chair1 CHAIR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "chair1"), new Chair1());
    public static final Chair2 CHAIR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "chair2"), new Chair2());
    public static final CP CP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cp"), new CP());
    public static final DT DT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "dt"), new DT());
    public static final ELamp ELAMP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "elamp"), new ELamp());
    public static final Electric ELECTRIC = Registry.register(Registry.BLOCK,
            new Identifier("npu", "electric"), new Electric());
    public static final FExt FEXT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fext"), new FExt());
    public static final FExt1 FEXT1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fext1"), new FExt1());
    public static final Fox FOX = Registry.register(Registry.BLOCK,
            new Identifier("npu", "fox"), new Fox());
    public static final Furnace FURNACE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "furnace"), new Furnace());
    public static final GBed GBED = Registry.register(Registry.BLOCK,
            new Identifier("npu", "gbed"), new GBed());
    public static final Ground GROUND = Registry.register(Registry.BLOCK,
            new Identifier("npu", "ground"), new Ground());
    public static final GTable GTABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "gtable"), new GTable());
    public static final HWater HWATER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "hwater"), new HWater());
    public static final Knight KNIGHT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "knight"), new Knight());
    public static final LChair LCHAIR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "lchair"), new LChair());
    public static final MP MP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "mp"), new MP());
    public static final ObsidianBlock OBSIDIANBLOCK = Registry.register(Registry.BLOCK,
            new Identifier("npu", "obsidianblock"), new ObsidianBlock());
    public static final ObsidianFrame OBSIDIANFRAME = Registry.register(Registry.BLOCK,
            new Identifier("npu", "obsidianframe"), new ObsidianFrame());
    public static final Printer PRINTER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "printer"), new Printer());
    public static final Radiator RADIATOR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "radiator"), new Radiator());
    public static final Shop SHOP = Registry.register(Registry.BLOCK,
            new Identifier("npu", "shop"), new Shop());
    public static final Shop1 SHOP1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "shop1"), new Shop1());
    public static final Shop2 SHOP2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "shop2"), new Shop2());
    public static final Sign SIGN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sign"), new Sign());
    public static final StoneR STONER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stoner"), new StoneR());
    public static final StoneR1 STONER1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stoner1"), new StoneR1());
    public static final StraightAheadSign STRAIGHTAHEADSIGN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "straightaheadsign"), new StraightAheadSign());
    public static final TestG TESTG = Registry.register(Registry.BLOCK,
            new Identifier("npu", "testg"), new TestG());
    public static final Toilet TOILET = Registry.register(Registry.BLOCK,
            new Identifier("npu", "toilet"), new Toilet());
    public static final TTable TTABLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "ttable"), new TTable());
    public static final Urinal URINAL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "urinal"), new Urinal());

    // Paintings
    public static final Painting PAINTING = Registry.register(Registry.BLOCK,
            new Identifier("npu", "painting"), new Painting());
    public static final Painting1 PAINTING1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "painting1"), new Painting1());
    public static final Painting2 PAINTING2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "painting2"), new Painting2());
    public static final Painting3 PAINTING3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "painting3"), new Painting3());

    // Pipe
    public static final Pipe1 PIPE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe1"), new Pipe1());
    public static final Pipe2 PIPE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe2"), new Pipe2());
    public static final Pipe3 PIPE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe3"), new Pipe3());
    public static final Pipe4 PIPE4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe4"), new Pipe4());
    public static final Pipe5 PIPE5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe5"), new Pipe5());
    public static final Pipe6 PIPE6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe6"), new Pipe6());
    public static final Pipe7 PIPE7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe7"), new Pipe7());
    public static final Pipe8 PIPE8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe8"), new Pipe8());
    public static final Pipe9 PIPE9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pipe9"), new Pipe9());

    // Plants
    public static final Plant PLANT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "plant"), new Plant());
    public static final Plant1 PLANT1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "plant1"), new Plant1());
    public static final Plant2 PLANT2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "plant2"), new Plant2());

    // Platform
    public static final CenterAirconditionerBias CENTERAIRCONDITIONERBIAS = Registry.register(Registry.BLOCK,
            new Identifier("npu", "center_airconditioner_bias"), new CenterAirconditionerBias());
    public static final ClassroomMicrophone CLASSROOMMICROPHONE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "classroom_microphone"), new ClassroomMicrophone());
    public static final MetalTrashcan METALTRASHCAN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "metal_trashcan"), new MetalTrashcan());
    public static final Platform PLATFORM = Registry.register(Registry.BLOCK,
            new Identifier("npu", "platform"), new Platform());
    public static final PlatformChair PLATFORMCHAIR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "platform_chair"), new PlatformChair());
    public static final PlatformCorner PLATFORMCORNER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "platform_corner"), new PlatformCorner());
    public static final PlatformDesk PLATFORMDESK = Registry.register(Registry.BLOCK,
            new Identifier("npu", "platform_desk"), new PlatformDesk());
    public static final TopAirconditioner TOPAIRCONDITIONER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "top_airconditioner"), new TopAirconditioner());

    // Railings
    public static final Railing RAILING = Registry.register(Registry.BLOCK,
            new Identifier("npu", "railing"), new Railing());
    public static final Railing1 RAILING1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "railing1"), new Railing1());
    public static final Railing2 RAILING2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "railing2"), new Railing2());
    public static final Railing3 RAILING3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "railing3"), new Railing3());
    public static final Railing4 RAILING4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "railing4"), new Railing4());
    public static final Railing5 RAILING5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "railing5"), new Railing5());

    // Road
    public static final CemH CEMH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cemh"), new CemH());
    public static final CemT CEMT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "cemt"), new CemT());

    // Signs
    public static final InSign INSIGN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign"), new InSign());
    public static final InSign1 INSIGN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign1"), new InSign1());
    public static final InSign2 INSIGN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign2"), new InSign2());
    public static final InSign3 INSIGN3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign3"), new InSign3());
    public static final InSign4 INSIGN4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign4"), new InSign4());
    public static final InSign5 INSIGN5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign5"), new InSign5());
    public static final InSign6 INSIGN6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "insign6"), new InSign6());
    public static final OutSign OUTSIGN = Registry.register(Registry.BLOCK,
            new Identifier("npu", "outsign"), new OutSign());

    // Stair
    public static final Stair STAIR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair"), new Stair());
    public static final Stair1 STAIR1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair1"), new Stair1());
    public static final Stair2 STAIR2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair2"), new Stair2());
    public static final Stair3 STAIR3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair3"), new Stair3());
    public static final Stair4 STAIR4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair4"), new Stair4());
    public static final Stair5 STAIR5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair5"), new Stair5());
    public static final Stair6 STAIR6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "stair6"), new Stair6());

    // StarSignPack
    public static final A A = Registry.register(Registry.BLOCK,
            new Identifier("npu", "a"), new A());
    public static final B B = Registry.register(Registry.BLOCK,
            new Identifier("npu", "b"), new B());
    public static final C C = Registry.register(Registry.BLOCK,
            new Identifier("npu", "c"), new C());
    public static final D D = Registry.register(Registry.BLOCK,
            new Identifier("npu", "d"), new D());
    public static final E E = Registry.register(Registry.BLOCK,
            new Identifier("npu", "e"), new E());
    public static final F F = Registry.register(Registry.BLOCK,
            new Identifier("npu", "f"), new F());
    public static final G G = Registry.register(Registry.BLOCK,
            new Identifier("npu", "g"), new G());
    public static final Sit SIT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sit"), new Sit());
    public static final Sky SKY = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sky"), new Sky());
    public static final Star STAR = Registry.register(Registry.BLOCK,
            new Identifier("npu", "star"), new Star());

    // StreetLamp
    public static final SL1 SL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sl1"), new SL1());
    public static final SL2 SL2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sl2"), new SL2());
    public static final SL3 SL3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "sl3"), new SL3());

    // Trashs
    public static final Tool TOOL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "tool"), new Tool());
    public static final Trash TRASH = Registry.register(Registry.BLOCK,
            new Identifier("npu", "trash"), new Trash());
    public static final Trash1 TRASH1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "trash1"), new Trash1());
    public static final Trash2 TRASH2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "trash2"), new Trash2());
    public static final Trash3 TRASH3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "trash3"), new Trash3());
    public static final Trash4 TRASH4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "trash4"), new Trash4());

    // Trees
    public static final Tree TREE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "tree"), new Tree());
    public static final Tree1 TREE1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "tree1"), new Tree1());
    public static final Tree2 TREE2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "tree2"), new Tree2());
    public static final Tree3 TREE3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "tree3"), new Tree3());
    public static final TreeHole TREEHOLE = Registry.register(Registry.BLOCK,
            new Identifier("npu", "treehole"), new TreeHole());

    // Walls
    public static final Wall1 WALL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall1"), new Wall1());
    public static final Wall10 WALL10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall10"), new Wall10());
    public static final Wall11 WALL11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall11"), new Wall11());
    public static final Wall12 WALL12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall12"), new Wall12());
    public static final Wall13 WALL13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall13"), new Wall13());
    public static final Wall14 WALL14 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall14"), new Wall14());
    public static final Wall15 WALL15 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall15"), new Wall15());
    public static final Wall2 WALL2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall2"), new Wall2());
    public static final Wall3 WALL3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall3"), new Wall3());
    public static final Wall4 WALL4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall4"), new Wall4());
    public static final Wall5 WALL5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall5"), new Wall5());
    public static final Wall6 WALL6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall6"), new Wall6());
    public static final Wall7 WALL7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall7"), new Wall7());
    public static final Wall8 WALL8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall8"), new Wall8());
    public static final Wall9 WALL9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wall9"), new Wall9());

    // Washes
    public static final Wash1 WASH1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wash1"), new Wash1());
    public static final Wash2 WASH2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wash2"), new Wash2());
    public static final Wash3 WASH3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wash3"), new Wash3());
    public static final Washer WASHER = Registry.register(Registry.BLOCK,
            new Identifier("npu", "washer"), new Washer());

    // WGWall
    public static final WGWall WGWALL = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wgwall"), new WGWall());
    public static final WGWall1 WGWALL1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wgwall1"), new WGWall1());
    public static final WGWall2 WGWALL2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wgwall2"), new WGWall2());
    public static final WGWall3 WGWALL3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wgwall3"), new WGWall3());
    public static final WGWall4 WGWALL4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "wgwall4"), new WGWall4());

    // Windows

    // Windows.Black
    public static final Winn1 WINN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn1"), new Winn1());
    public static final Winn10 WINN10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn10"), new Winn10());
    public static final Winn11 WINN11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn11"), new Winn11());
    public static final Winn12 WINN12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn12"), new Winn12());
    public static final Winn13 WINN13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn13"), new Winn13());
    public static final Winn14 WINN14 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn14"), new Winn14());
    public static final Winn15 WINN15 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn15"), new Winn15());
    public static final Winn16 WINN16 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn16"), new Winn16());
    public static final Winn17 WINN17 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn17"), new Winn17());
    public static final Winn18 WINN18 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn18"), new Winn18());
    public static final Winn19 WINN19 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn19"), new Winn19());
    public static final Winn2 WINN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn2"), new Winn2());
    public static final Winn20 WINN20 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn20"), new Winn20());
    public static final Winn3 WINN3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn3"), new Winn3());
    public static final Winn4 WINN4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn4"), new Winn4());
    public static final Winn5 WINN5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn5"), new Winn5());
    public static final Winn6 WINN6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn6"), new Winn6());
    public static final Winn7 WINN7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn7"), new Winn7());
    public static final Winn8 WINN8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn8"), new Winn8());
    public static final Winn9 WINN9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winn9"), new Winn9());

    // Windows.Blue
    public static final Winnn1 WINNN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn1"), new Winnn1());
    public static final Winnn10 WINNN10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn10"), new Winnn10());
    public static final Winnn11 WINNN11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn11"), new Winnn11());
    public static final Winnn12 WINNN12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn12"), new Winnn12());
    public static final Winnn13 WINNN13 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn13"), new Winnn13());
    public static final Winnn14 WINNN14 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn14"), new Winnn14());
    public static final Winnn15 WINNN15 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn15"), new Winnn15());
    public static final Winnn16 WINNN16 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn16"), new Winnn16());
    public static final Winnn17 WINNN17 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn17"), new Winnn17());
    public static final Winnn18 WINNN18 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn18"), new Winnn18());
    public static final Winnn19 WINNN19 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn19"), new Winnn19());
    public static final Winnn2 WINNN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn2"), new Winnn2());
    public static final Winnn20 WINNN20 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn20"), new Winnn20());
    public static final Winnn21 WINNN21 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn21"), new Winnn21());
    public static final Winnn22 WINNN22 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn22"), new Winnn22());
    public static final Winnn23 WINNN23 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn23"), new Winnn23());
    public static final Winnn3 WINNN3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn3"), new Winnn3());
    public static final Winnn4 WINNN4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn4"), new Winnn4());
    public static final Winnn5 WINNN5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn5"), new Winnn5());
    public static final Winnn6 WINNN6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn6"), new Winnn6());
    public static final Winnn7 WINNN7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn7"), new Winnn7());
    public static final Winnn8 WINNN8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn8"), new Winnn8());
    public static final Winnn9 WINNN9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winnn9"), new Winnn9());

    // Windows.Normal
    public static final Win1 WIN1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win1"), new Win1());
    public static final Win10 WIN10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win10"), new Win10());
    public static final Win11 WIN11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win11"), new Win11());
    public static final Win2 WIN2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win2"), new Win2());
    public static final Win3 WIN3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win3"), new Win3());
    public static final Win4 WIN4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win4"), new Win4());
    public static final Win5 WIN5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win5"), new Win5());
    public static final Win6 WIN6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win6"), new Win6());
    public static final Win7 WIN7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win7"), new Win7());
    public static final Win8 WIN8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win8"), new Win8());
    public static final Win9 WIN9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "win9"), new Win9());
    public static final Window10 WINDOW10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "window10"), new Window10());
    public static final Window11 WINDOW11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "window11"), new Window11());
    public static final WindowOut WINDOWOUT = Registry.register(Registry.BLOCK,
            new Identifier("npu", "windowout"), new WindowOut());

    // Windows.White
    public static final Winw1 WINW1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winw1"), new Winw1());
    public static final Winw2 WINW2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winw2"), new Winw2());
    public static final Winw3 WINW3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "winw3"), new Winw3());

    // YF
    public static final YF YF = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf"), new YF());
    public static final YF1 YF1 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf1"), new YF1());
    public static final YF10 YF10 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf10"), new YF10());
    public static final YF11 YF11 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf11"), new YF11());
    public static final YF12 YF12 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf12"), new YF12());
    public static final YF2 YF2 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf2"), new YF2());
    public static final YF3 YF3 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf3"), new YF3());
    public static final YF4 YF4 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf4"), new YF4());
    public static final YF5 YF5 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf5"), new YF5());
    public static final YF6 YF6 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf6"), new YF6());
    public static final YF7 YF7 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf7"), new YF7());
    public static final YF8 YF8 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf8"), new YF8());
    public static final YF9 YF9 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "yf9"), new YF9());




    public static final ClockHand CLOCK_HAND = Registry.register(Registry.BLOCK,
            new Identifier("npu", "clockhand"), new ClockHand());


    public static final Pavilion006 PAVILION006 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion006"), new Pavilion006());
    public static final Pavilion007 PAVILION007 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion007"), new Pavilion007());
    public static final Pavilion136 PAVILION136 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion136"), new Pavilion136());
    public static final Pavilion146 PAVILION146 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion146"), new Pavilion146());
    public static final Pavilion156 PAVILION156 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion156"), new Pavilion156());
    public static final Pavilion157 PAVILION157 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion157"), new Pavilion157());
    public static final Pavilion166 PAVILION166 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion166"), new Pavilion166());
    public static final Pavilion176 PAVILION176 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion176"), new Pavilion176());
    public static final Pavilion216 PAVILION216 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion216"), new Pavilion216());
    public static final Pavilion217 PAVILION217 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion217"), new Pavilion217());
    public static final Pavilion226 PAVILION226 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion226"), new Pavilion226());
    public static final Pavilion227 PAVILION227 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion227"), new Pavilion227());
    public static final Pavilion231 PAVILION231 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion231"), new Pavilion231());
    public static final Pavilion232 PAVILION232 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion232"), new Pavilion232());
    public static final Pavilion235 PAVILION235 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion235"), new Pavilion235());
    public static final Pavilion236 PAVILION236 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion236"), new Pavilion236());
    public static final Pavilion241 PAVILION241 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion241"), new Pavilion241());
    public static final Pavilion242 PAVILION242 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion242"), new Pavilion242());
    public static final Pavilion244 PAVILION244 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion244"), new Pavilion244());
    public static final Pavilion245 PAVILION245 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion245"), new Pavilion245());
    public static final Pavilion246 PAVILION246 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion246"), new Pavilion246());
    public static final Pavilion251 PAVILION251 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion251"), new Pavilion251());
    public static final Pavilion252 PAVILION252 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion252"), new Pavilion252());
    public static final Pavilion253 PAVILION253 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion253"), new Pavilion253());
    public static final Pavilion254 PAVILION254 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion254"), new Pavilion254());
    public static final Pavilion255 PAVILION255 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion255"), new Pavilion255());
    public static final Pavilion256 PAVILION256 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion256"), new Pavilion256());
    public static final Pavilion257 PAVILION257 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion257"), new Pavilion257());
    public static final Pavilion261 PAVILION261 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion261"), new Pavilion261());
    public static final Pavilion262 PAVILION262 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion262"), new Pavilion262());
    public static final Pavilion264 PAVILION264 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion264"), new Pavilion264());
    public static final Pavilion265 PAVILION265 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion265"), new Pavilion265());
    public static final Pavilion266 PAVILION266 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion266"), new Pavilion266());
    public static final Pavilion271 PAVILION271 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion271"), new Pavilion271());
    public static final Pavilion272 PAVILION272 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion272"), new Pavilion272());
    public static final Pavilion275 PAVILION275 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion275"), new Pavilion275());
    public static final Pavilion276 PAVILION276 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion276"), new Pavilion276());
    public static final Pavilion286 PAVILION286 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion286"), new Pavilion286());
    public static final Pavilion287 PAVILION287 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion287"), new Pavilion287());
    public static final Pavilion296 PAVILION296 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion296"), new Pavilion296());
    public static final Pavilion297 PAVILION297 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion297"), new Pavilion297());
    public static final Pavilion325 PAVILION325 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion325"), new Pavilion325());
    public static final Pavilion326 PAVILION326 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion326"), new Pavilion326());
    public static final Pavilion327 PAVILION327 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion327"), new Pavilion327());
    public static final Pavilion331 PAVILION331 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion331"), new Pavilion331());
    public static final Pavilion332 PAVILION332 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion332"), new Pavilion332());
    public static final Pavilion333 PAVILION333 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion333"), new Pavilion333());
    public static final Pavilion334 PAVILION334 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion334"), new Pavilion334());
    public static final Pavilion335 PAVILION335 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion335"), new Pavilion335());
    public static final Pavilion336 PAVILION336 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion336"), new Pavilion336());
    public static final Pavilion337 PAVILION337 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion337"), new Pavilion337());
    public static final Pavilion341 PAVILION341 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion341"), new Pavilion341());
    public static final Pavilion344 PAVILION344 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion344"), new Pavilion344());
    public static final Pavilion345 PAVILION345 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion345"), new Pavilion345());
    public static final Pavilion346 PAVILION346 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion346"), new Pavilion346());
    public static final Pavilion347 PAVILION347 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion347"), new Pavilion347());
    public static final Pavilion355 PAVILION355 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion355"), new Pavilion355());
    public static final Pavilion356 PAVILION356 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion356"), new Pavilion356());
    public static final Pavilion357 PAVILION357 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion357"), new Pavilion357());
    public static final Pavilion358 PAVILION358 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion358"), new Pavilion358());
    public static final Pavilion361 PAVILION361 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion361"), new Pavilion361());
    public static final Pavilion364 PAVILION364 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion364"), new Pavilion364());
    public static final Pavilion365 PAVILION365 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion365"), new Pavilion365());
    public static final Pavilion366 PAVILION366 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion366"), new Pavilion366());
    public static final Pavilion367 PAVILION367 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion367"), new Pavilion367());
    public static final Pavilion371 PAVILION371 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion371"), new Pavilion371());
    public static final Pavilion372 PAVILION372 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion372"), new Pavilion372());
    public static final Pavilion373 PAVILION373 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion373"), new Pavilion373());
    public static final Pavilion374 PAVILION374 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion374"), new Pavilion374());
    public static final Pavilion375 PAVILION375 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion375"), new Pavilion375());
    public static final Pavilion376 PAVILION376 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion376"), new Pavilion376());
    public static final Pavilion377 PAVILION377 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion377"), new Pavilion377());
    public static final Pavilion385 PAVILION385 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion385"), new Pavilion385());
    public static final Pavilion386 PAVILION386 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion386"), new Pavilion386());
    public static final Pavilion387 PAVILION387 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion387"), new Pavilion387());
    public static final Pavilion426 PAVILION426 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion426"), new Pavilion426());
    public static final Pavilion434 PAVILION434 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion434"), new Pavilion434());
    public static final Pavilion435 PAVILION435 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion435"), new Pavilion435());
    public static final Pavilion436 PAVILION436 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion436"), new Pavilion436());
    public static final Pavilion437 PAVILION437 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion437"), new Pavilion437());
    public static final Pavilion445 PAVILION445 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion445"), new Pavilion445());
    public static final Pavilion446 PAVILION446 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion446"), new Pavilion446());
    public static final Pavilion447 PAVILION447 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion447"), new Pavilion447());
    public static final Pavilion448 PAVILION448 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion448"), new Pavilion448());
    public static final Pavilion455 PAVILION455 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion455"), new Pavilion455());
    public static final Pavilion456 PAVILION456 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion456"), new Pavilion456());
    public static final Pavilion457 PAVILION457 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion457"), new Pavilion457());
    public static final Pavilion458 PAVILION458 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion458"), new Pavilion458());
    public static final Pavilion459 PAVILION459 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion459"), new Pavilion459());
    public static final Pavilion459_ PAVILION459_ = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion459_"), new Pavilion459_());
    public static final Pavilion465 PAVILION465 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion465"), new Pavilion465());
    public static final Pavilion466 PAVILION466 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion466"), new Pavilion466());
    public static final Pavilion467 PAVILION467 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion467"), new Pavilion467());
    public static final Pavilion468 PAVILION468 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion468"), new Pavilion468());
    public static final Pavilion471 PAVILION471 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion471"), new Pavilion471());
    public static final Pavilion472 PAVILION472 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion472"), new Pavilion472());
    public static final Pavilion475 PAVILION475 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion475"), new Pavilion475());
    public static final Pavilion476 PAVILION476 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion476"), new Pavilion476());
    public static final Pavilion477 PAVILION477 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion477"), new Pavilion477());
    public static final Pavilion478 PAVILION478 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion478"), new Pavilion478());
    public static final Pavilion496 PAVILION496 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion496"), new Pavilion496());
    public static final Pavilion535 PAVILION535 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion535"), new Pavilion535());
    public static final Pavilion545 PAVILION545 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion545"), new Pavilion545());
    public static final Pavilion555 PAVILION555 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion555"), new Pavilion555());
    public static final Pavilion565 PAVILION565 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion565"), new Pavilion565());
    public static final Pavilion575 PAVILION575 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion575"), new Pavilion575());
    public static final Pavilion631 PAVILION631 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion631"), new Pavilion631());
    public static final Pavilion632 PAVILION632 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion632"), new Pavilion632());
    public static final Pavilion671 PAVILION671 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion671"), new Pavilion671());
    public static final Pavilion672 PAVILION672 = Registry.register(Registry.BLOCK,
            new Identifier("npu", "pavilion672"), new Pavilion672());

}

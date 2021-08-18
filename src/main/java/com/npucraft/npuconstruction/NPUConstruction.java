package com.npucraft.npuconstruction;

import com.npucraft.npuconstruction.Register.MyBlockEntityRegister;
import com.npucraft.npuconstruction.Register.MyBlockRegister;
import com.npucraft.npuconstruction.Register.MyItemRegister;
import net.fabricmc.api.ModInitializer;


public class NPUConstruction implements ModInitializer {

    @Override
    public void onInitialize() {
        new MyBlockRegister();
        new MyItemRegister();
        new MyBlockEntityRegister();

    }
}

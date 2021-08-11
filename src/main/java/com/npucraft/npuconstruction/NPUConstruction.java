package com.npucraft.npuconstruction;

import com.npucraft.npuconstruction.Init.Init;
import com.npucraft.npuconstruction.Init.Register.MyBlockEntityRegister;
import com.npucraft.npuconstruction.Init.Register.MyBlockRegister;
import com.npucraft.npuconstruction.Init.Register.MyItemRegister;
import net.fabricmc.api.ModInitializer;


public class NPUConstruction implements ModInitializer {


	@Override
	public void onInitialize() {
//		Init.initAll();
		new MyBlockRegister();
		new MyItemRegister();
		new MyBlockEntityRegister();


	}
}

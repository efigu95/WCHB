package com.wchb.jemain.proxy;

import com.wchb.jemain.init.wchbBlocks;
import com.wchb.jemain.init.wchbItems;

public class ClientProxy  extends CommonProxy{
	@Override
	public void registerRenders()
	{
		wchbBlocks.registerRenders();
		wchbItems.registerRenders();
	}
	
}

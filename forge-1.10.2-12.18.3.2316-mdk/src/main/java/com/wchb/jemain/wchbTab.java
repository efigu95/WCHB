package com.wchb.jemain;

import com.wchb.jemain.init.wchbItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class wchbTab extends CreativeTabs {

	public wchbTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return wchbItems.test_item;
	}

}

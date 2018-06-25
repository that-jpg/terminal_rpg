package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionInventory extends Option{
	public OptionInventory() {
		this.name = "inventory";
		this.label = "Inventory";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("inventory");
	}
}

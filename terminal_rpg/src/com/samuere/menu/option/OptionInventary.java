package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionInventary extends Option{
	public OptionInventary() {
		this.name = "inventary";
		this.label = "Inventary";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("inventary");
	}
}

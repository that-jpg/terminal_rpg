package com.samuere.menu.option;

import java.util.ArrayList;

import com.samuere.Attributes;
import com.samuere.Enemy;
import com.samuere.Engine;
import com.samuere.Item;
import com.samuere.Region;
import com.samuere.Skill;
import com.samuere.menu.MenuFactory;

public class OptionRegionCity extends Option{
	public OptionRegionCity() {
		this.name = "city";
		this.label = "City";
	}

	public void execute() {
		Engine.currentRegion = new Region("Cidade", 0, null);
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("standard");
	}
}

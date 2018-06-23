package com.samuere.menu.option;

import com.samuere.Engine;

import java.util.ArrayList;

import com.samuere.*;
import com.samuere.menu.*;

public class OptionSearchEnemy extends Option {
	public OptionSearchEnemy() {
		this.name = "search";
		this.label = "Search enemies";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		// instanciar inimigo do search enemy
		ArrayList<Item> loot = new ArrayList<Item>();
		loot.add(new Item("Money",0,"",200));
		Engine.currentEnemy = new Enemy("Dragão", "Criatura mitológica", new Attributes(1, 5, 5, 5, 5), new Skill(), 10, loot);
		Engine.currentMenu = menuFactory.getMenu("battle");
	}
}

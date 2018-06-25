package com.samuere.menu.option;

import com.samuere.Engine;

import java.util.ArrayList;
import java.util.Random;

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
		ArrayList<Enemy> possibleEnemies = new ArrayList<Enemy>();
		possibleEnemies.add(new Enemy("Dragão", "Criatura mitológica", new Attributes(20, 50, 1, 10, 15), new Skill(), 10, loot));
		possibleEnemies.add(new Enemy("Lobo", "Animal Silvestre", new Attributes(3, 5, 1, 1, 2), new Skill(), 10, loot));
		possibleEnemies.add(new Enemy("Bandido", "Criatura humana( e com más intenções)", new Attributes(1, 5, 5, 5, 5), new Skill(), 10, loot));
		possibleEnemies.add(new Enemy("Esqueleto", "Morto-Vivo", new Attributes(5, 20, 10, 5, 2), new Skill(), 10, loot));
		possibleEnemies.add(new Enemy("Goblin", "Criatura Orc", new Attributes(10, 30, 5, 1, 30), new Skill(), 10, loot));
		Random rand = new Random();
		int  n = rand.nextInt(possibleEnemies.size());
		Engine.currentEnemy = possibleEnemies.get(n);
		Engine.currentMenu = menuFactory.getMenu("battle");
	}
}

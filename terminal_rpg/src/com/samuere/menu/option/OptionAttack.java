package com.samuere.menu.option;

import com.samuere.Battle;
import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionAttack extends Option {
	public OptionAttack() {
		this.name = "attack";
		this.label = "Attack";
	}

	public void execute() {
		System.out.println("Atacou");
		Battle.attack(Engine.hero, Engine.currentEnemy);
		Battle.attack(Engine.currentEnemy, Engine.hero);
		if (!(Engine.currentEnemy.getAttributes().getActualHealth() > 0)) {
			MenuFactory menuFactory = new MenuFactory();
			Engine.currentMenu = menuFactory.getMenu("win");
		}
		if(Engine.hero.getAttributes().getActualHealth() <= 0) {
			MenuFactory menuFactory = new MenuFactory();
			Engine.currentMenu = menuFactory.getMenu("loose");
		}
	}
}

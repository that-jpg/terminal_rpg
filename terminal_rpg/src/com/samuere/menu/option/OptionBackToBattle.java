package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.Item;
import com.samuere.Potion;
import com.samuere.menu.MenuFactory;

public class OptionBackToBattle extends Option {
	public OptionBackToBattle() {
		this.name = "backToBattle";
		this.label = "Voltar para a batalha";
	}

	public void execute() {
		MenuFactory menuFactory = new MenuFactory();
		Engine.currentMenu = menuFactory.getMenu("battle");
	}
}

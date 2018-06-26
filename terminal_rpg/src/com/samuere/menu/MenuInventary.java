package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.Item;
import com.samuere.menu.option.OptionFactory;

public class MenuInventary extends MenuAbstract {
	public MenuInventary() {
		super();
		this.name = "inventory";
	}

	@Override
	public void display() {
		System.out.println("Seu inventário:");
		System.out.println("Money: " + Engine.hero.getMoney());
		if (Engine.hero.getItems().size() == 0)
			System.out.println("-");
		else
			for (Item a : Engine.hero.getItems())
				System.out.println("-" + a.getName());
	}

	public void initOptions() {
		OptionFactory optFactory = new OptionFactory();
		this.options.add(optFactory.getOption("backToStandardMenu"));
	}
}

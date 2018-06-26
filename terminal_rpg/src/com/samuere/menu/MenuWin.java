package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.Item;
import com.samuere.menu.option.OptionFactory;

public class MenuWin extends MenuAbstract {
	public MenuWin() {
		super();
		this.name = "win";
	}

	public void display() {
		System.out.print("Derrotar " + Engine.currentEnemy.getName() + " te concedeu "
				+ Engine.currentEnemy.getExperience() + " pontos de experiencia");
		if (Engine.currentEnemy.getLoot().size() == 0)
			System.out.println();
		else
			System.out.println(" e:");
		for (Item a : Engine.currentEnemy.getLoot()) {
			System.out.println(a.getName() + " [" + a.getPrice() + " dinheiros]");
			System.out.println("Porem o governo esta fazendo um negocio chamado imposto de renda");
			System.out.println("Entao ele vai taxar uma parte do seu dinheiro,");
			System.out.println("Obrigado nobre.");
			if (a.getName() == "Money")
				Engine.hero.setMoney(Engine.hero.getMoney() + (int)(a.getPrice() * 0.8));
			else
				Engine.hero.addItem(a);
		}
		Engine.hero.upExperience(Engine.currentEnemy.getExperience());
	}

	public void initOptions() {
		OptionFactory optFactory = new OptionFactory();
		this.options.add(optFactory.getOption("continue"));
	}
}

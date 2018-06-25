package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuBattle extends MenuAbstract{
    public MenuBattle() {
        super();
        this.name = "battle";
    }
    
    @Override
    public void display() {
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("[Um " + Engine.currentEnemy.getName() + " surge e te ataca furiosamente]");
		System.out.println(Engine.currentEnemy.getSkin());
		System.out.println("O que voce fara?");

		System.out.println("Sua vida: " + Engine.hero.getAttributes().getActualHealth() + "/"
				+ Engine.hero.getAttributes().getMaxHealth());

		System.out.println("Vida do inimigo: " + Engine.currentEnemy.getAttributes().getActualHealth() + "/"
				+ Engine.currentEnemy.getAttributes().getMaxHealth());
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("attack"));
        this.options.add(optFactory.getOption("potions"));
        this.options.add(optFactory.getOption("run"));
    }
}

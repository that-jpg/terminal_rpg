package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.menu.option.OptionFactory;

public class MenuPotions extends MenuAbstract{

	public MenuPotions() {
        super();
        this.name = "potions";
    }

	public void display() {
    	System.out.printf(".---.  .-.   .-.    _\n" +
    			"|~~~| .'~`. .' `. .'~`.\n" +
    			"| 1 | | 2 | | 3 | : 4 :\n" +
    			"|___| |___| `._.' :___:\n" +
    			"  ");
          for(int x : Engine.hero.allPotions())
            System.out.printf("%d     ", x);
          System.out.println("\nSua vida: " + Engine.hero.getAttributes().getActualHealth() + "/" + Engine.hero.getAttributes().getMaxHealth());
          System.out.println("Sua força: " + Engine.hero.getAttributes().getActualStrenght());
    	System.out.println("\nEscolha a sua poção\n");
	}
	
    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("usePotion1"));
        this.options.add(optFactory.getOption("usePotion2"));
        this.options.add(optFactory.getOption("usePotion3"));
        this.options.add(optFactory.getOption("usePotion4"));
        this.options.add(optFactory.getOption("backToBattle"));
    }
}

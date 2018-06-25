package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuMarket extends MenuAbstract{

    public MenuMarket() {
        super();
        this.name = "market";
    }

    public void display() {
    	System.out.println("Você possui " + Engine.hero.getMoney() + " dinheiros");
    	System.out.printf(".---.  .-.   .-.    _\n" +
    			"|~~~| .'~`. .' `. .'~`.\n" +
    			"| 1 | | 2 | | 3 | : 4 :\n" +
    			"|___| |___| `._.' :___:\n" +
    			"  ");
          for(int x : Engine.hero.allPotions())
            System.out.printf("%d     ", x);
          System.out.println();
    }
    
    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("buyPotion"));
        this.options.add(optFactory.getOption("backToStandardMenu"));
    }
}

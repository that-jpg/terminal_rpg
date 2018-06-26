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
    	System.out.println("Quer comprar uns bagulho bao ai?");
    	System.out.println("Da uma olhada no cardapio ai parceria");
    	System.out.println("[1] Corote Azul");
    	System.out.println("[2] Disco voador");
    	System.out.println("[3] Brigadeiro do IFCH");
    	System.out.println("[4] Suco do bandeco");
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

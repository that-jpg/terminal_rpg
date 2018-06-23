package com.samuere.menu;

import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuTravel extends MenuAbstract{

    public MenuTravel() {
        super();
        this.name = "travel";
    }
    
    public void display() {
        System.out.println("Nosso governo é corrupto e por conta disso, as estradas ainda não foram construidas");
        System.out.println("Voce vai ter que votar melhor em breve para resolver esse problema");
        System.out.println("Obrigado por sua paciencia!");
        System.out.println("## Goverdo Feudal - Voltamos, 20 anos em 2! ##");
        System.out.println("");
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("listRegions"));
        this.options.add(optFactory.getOption("backToStandardMenu"));
    }

}

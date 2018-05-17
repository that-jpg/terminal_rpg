package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionTravel extends Option {
    public OptionTravel() {
        this.name = "travel";
        this.label = "Travel";
    }
    public void execute() {

        System.out.println("Nosso governo e corrupto e por conta disso, as estradas ainda nao foram construidas");
        System.out.println("Voce vai ter que votar melhor em breve para resolver esse problema");
        System.out.println("Obrigado por sua paciencia!");
        System.out.println("## Goverdo Feudal - Voltamos, 20 anos em 2! ##");
        System.out.println("");
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("travel");
    }
}

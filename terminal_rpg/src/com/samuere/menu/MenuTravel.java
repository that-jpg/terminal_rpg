package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.menu.option.Option;
import com.samuere.menu.option.OptionFactory;

public class MenuTravel extends MenuAbstract{

    public MenuTravel() {
        super();
        this.name = "travel";
    }
    
    public void display() {
    	System.out.println("Você está em: " + Engine.currentRegion.getName() + "\n");
    }

    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("city"));
        this.options.add(optFactory.getOption("cemitery"));
        this.options.add(optFactory.getOption("dungeon"));
        this.options.add(optFactory.getOption("forest"));
        this.options.add(optFactory.getOption("mountain"));
        this.options.add(optFactory.getOption("backToStandardMenu"));
    }

}

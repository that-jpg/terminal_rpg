package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.menu.option.OptionFactory;

public class MenuStandard extends MenuAbstract{

    public MenuStandard() {
        super();
        this.name = "standard";
    }

    public void display() {
    	System.out.println("	\r\n" + 
    			"    /\\  /\\\r\n" + 
    			"   //\\\\//\\\\\r\n" + 
    			"   \\ ^  ^ /\r\n" + 
    			"   ( 0  0 )\r\n" + 
    			"   |  \\/  |\r\n" + 
    			"   ( [--] )\r\n" + 
    			"    \\____/\r\n" + 
    			"   __|  |__\r\n" + 
    			"  /__    __\\\r\n" + 
    			"{-/ /    \\ \\-}\r\n" + 
    			"    |----|\r\n" + 
    			"    ||\\/||\r\n" + 
    			"   _||  ||_\r\n" + 
    			"  /__\\  /__\\\n");
    	System.out.println(Engine.hero.getName() + " você está no nivel " + Engine.hero.getLevel());
    	System.out.println("Experiencia: " + Engine.hero.getExperience() + "/" + Engine.hero.getExperienceToUp() + "\n");
    }
    
    public void initOptions() {
        OptionFactory optFactory = new OptionFactory();
        this.options.add(optFactory.getOption("travel"));
        this.options.add(optFactory.getOption("search"));
        this.options.add(optFactory.getOption("goToMarket"));
        this.options.add(optFactory.getOption("inventary"));
        this.options.add(optFactory.getOption("exit"));
    }

}

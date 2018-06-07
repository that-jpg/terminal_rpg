package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionPotions extends Option{
    public OptionPotions() {
        this.name = "potions";
        this.label = "Potions";
    }
    public void execute() {
    	MenuFactory menuFactory = new MenuFactory();
    	Engine.currentMenu = menuFactory.getMenu("potions");
    }
}

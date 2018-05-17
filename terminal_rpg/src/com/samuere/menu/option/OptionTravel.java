package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionTravel extends Option {
    public OptionTravel() {
        this.name = "travel";
        this.label = "Travel";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("travel");
    }
}

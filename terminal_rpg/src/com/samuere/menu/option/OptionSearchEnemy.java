package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionSearchEnemy extends Option {
    public OptionSearchEnemy() {
        this.name = "search";
        this.label = "Search enemies";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("battle");
    }
}

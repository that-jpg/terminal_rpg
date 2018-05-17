package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionRun extends Option {
    public OptionRun() {
        this.name = "run";
        this.label = "Run";
    }
    public void execute() {
        System.out.println("Fugiu");
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("standard");
    }
}

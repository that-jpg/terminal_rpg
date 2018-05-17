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
        System.out.println("Como sua avo sempre dizia:");
        System.out.println("\"É Melhor Escapar Fedendo do que Morrer Cheiroso ...\"");
        System.out.println("So tome um banho antes de enfrentar o proximo!");

        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("standard");
    }
}

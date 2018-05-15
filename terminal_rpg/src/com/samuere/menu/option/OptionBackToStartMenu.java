package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionBackToStartMenu extends Option {
    public OptionBackToStartMenu() {
        this.name = "backToStartMenu";
        this.label = "Voltar para o menu anterior";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("start");
    }
}

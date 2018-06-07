package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionGoToMarket extends Option{
    public OptionGoToMarket() {
        this.name = "goToMarket";
        this.label = "Go to market";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("market");
    }
}

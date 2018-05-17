package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionListRegions extends Option {

    public OptionListRegions() {
        this.name = "listRegions";
        this.label = "ListRegions";
    }
    public void execute() {
        //MenuFactory menuFactory = new MenuFactory();
        //Engine.currentMenu = menuFactory.getMenu("listRegions");

        System.out.println("Essas sao as regioes possiveis:\n-");
    }
}

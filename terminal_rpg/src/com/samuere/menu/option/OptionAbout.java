package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionAbout extends Option {

    public OptionAbout() {
        this.name = "about";
        this.label = "About ";
    }
    public void execute() {
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("about");

        System.out.println("Esse jogo foi desenvolvido com muito amor");
    }
}

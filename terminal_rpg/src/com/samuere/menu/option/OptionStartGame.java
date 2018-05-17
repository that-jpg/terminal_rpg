package com.samuere.menu.option;

import com.samuere.Engine;
import com.samuere.menu.MenuFactory;

public class OptionStartGame extends Option {
    public OptionStartGame() {
        this.name = "start";
        this.label = "Start";
    }
    public void execute() {
    	System.out.println("Descrição do personagem:\nNome:");
    	
        MenuFactory menuFactory = new MenuFactory();
        Engine.currentMenu = menuFactory.getMenu("characterCreation");
    }
}

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
        System.out.println(".");
   		System.out.println("..");
     	System.out.println("...");
       	System.out.println("[Um pequeno dragão surge e te ataca furiosamente]");

    	System.out.println("");
    	System.out.println("    `.oo'    |    '");
        System.out.println(",.   (`-'    |    O Bixo");
        System.out.println("'^\\`-' )     |    parace furioso");
        System.out.println("  c-L'-      |");
        System.out.println("");

        System.out.println("O que voce fara?");

        Engine.currentMenu = menuFactory.getMenu("battle");
    }
}

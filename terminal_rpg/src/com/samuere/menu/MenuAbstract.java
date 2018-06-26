package com.samuere.menu;

import com.samuere.Engine;
import com.samuere.Hero;
import com.samuere.menu.option.Option;

import java.util.ArrayList;

public abstract class MenuAbstract {
    public String name;
    public ArrayList<Option> options = new ArrayList<Option>();

    public MenuAbstract() {
        this.initOptions();
    }
    
    public abstract void display();

    public void choose(int nthOption) {
        if (nthOption <= this.options.size()) {
            this.options.get(nthOption - 1).execute();
        } else if (nthOption == 666){
        	Engine.hero.enableGod();
        } else {
        	Engine.error = "Opção Inválida";
        }
    }

    public abstract void initOptions() ;
}
